package checker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import checker.TestSuite.TestCase;

import com.coasttocoastresearch.apg.Grammar;
import com.coasttocoastresearch.apg.Parser;
import com.coasttocoastresearch.apg.Parser.Result;
import com.coasttocoastresearch.apg.Parser.RuleCallback;
import com.coasttocoastresearch.apg.Statistics;
import com.coasttocoastresearch.apg.Trace;

public class Check {
	
	public Check() throws Exception {
		gp = new GrammarProxy("grammar.GrammarUnderTest");
		p = new Parser(gp.Grammar());
		s = p.enableStatistics(true);
		s.enableCumulate(true);
	}

	private PrintStream trace;
	private GrammarProxy gp;
	private Parser p;
	private Statistics s;

	private class InvalidRuleName extends IllegalArgumentException {

		private static final long serialVersionUID = 1L;

		public InvalidRuleName(String ruleName) {
			super(ruleName);
		}
	}

	private class ModelElementCheck extends RuleCallback {

		private String ruleName;
		private Set<String> allowed;

		private ModelElementCheck(Parser p, String ruleName, Set<String> names)
				throws InvalidRuleName {
			super(p);
			this.ruleName = ruleName;
			this.allowed = names;
			p.setRuleCallback(gp.ruleID(ruleName), this);
		}

		public int postBranch(int offset, int length)
				throws java.lang.Exception {
			if (length <= 0)
				return -1;

			String match = new String(callbackData.inputString, offset, length);
			if (allowed.contains(match))
				return -1;
			else {
				if (trace != null)
					trace.println("=> " + match + " is no " + ruleName);
				return -2;
			}
		}
	}

	private class GrammarProxy {

		private Grammar g;
		private int ruleCount;
		private Map<String, Integer> ruleIDs = new HashMap<String, Integer>();
		private Set<String> ruleNames = new HashSet<String>();

		private GrammarProxy(String className) throws Exception {
			Class<?> gut = Class.forName(className);
			g = (Grammar) gut.getMethod("getInstance").invoke(null);
			ruleCount = gut.getField("ruleCount").getInt(null);

			Class<?> rn = Class.forName(className + "$RuleNames");
			Method ruleName = rn.getMethod("ruleName");
			Method ruleID = rn.getMethod("ruleID");
			Object[] rns = rn.getEnumConstants();
			for (Object rn1 : rns) {
				String rnm = (String) ruleName.invoke(rn1);
				Integer rid = (Integer) ruleID.invoke(rn1);
				ruleIDs.put(rnm.toLowerCase(), rid);
				ruleNames.add(rnm);
			}
		}

		private Grammar Grammar() {
			return g;
		}

		private int ruleCount() {
			return ruleCount;
		}

		private int ruleID(String ruleName) {
			try {
				return ruleIDs.get(ruleName.toLowerCase());
			} catch (NullPointerException e) {
				throw new Check.InvalidRuleName("unknown rule " + ruleName);
			}
		}

	}

	/**
	 * Executes all test cases in the given XML files
	 * 
	 * @param args
	 *            list of XML file names containing test cases
	 * @throws Exception
	 */
	public static void main(String[] args) {
		// Run all test cases in the provided files

		Check c;
		try {
			c = new Check();
		} catch (Exception e) {
			e.printStackTrace(System.err);
			return;
		}

		int maxUncoveredRules = 0;
		for (String filename : args) {
			System.out.println("Running test cases from " + filename);
			TestSuite ts = TestSuite.read(filename);
			c.run(ts, System.out, System.err);
			maxUncoveredRules = ts.MaxUncoveredRules();
		}

		c.printStatistics(maxUncoveredRules, System.out, System.err);
	}

	public void run(TestSuite ts, PrintStream out, PrintStream err) {
		int failures = 0;

		// TODO: clear rule callbacks in p
		try {
			for (Map.Entry<String, HashSet<String>> c : ts.Constraints()
					.entrySet())
				new ModelElementCheck(p, c.getKey(), c.getValue());
		} catch (InvalidRuleName e) {
			e.printStackTrace(err);
			return;
		}

		for (TestCase tc : ts.TestCases()) {
			try {
				p.setStartRule(gp.ruleID(tc.Rule()));
				p.setInputString(tc.Input());

				Result r = parse(p, ts, tc.Trace(), out);

				if (r.success() && tc.FailAt() == TestSuite.NOWHERE) {
					// out.println("OK: " + tc.Name() + ": " + tc.Input() +
					// " is "
					// + tc.Rule());
				} else if (!r.success()
						&& tc.FailAt() == r.getMaxMatchedPhraseLength()) {
					// out.println("OK: " + tc.Name() + " fails at " +
					// tc.FailAt()
					// + ": " + highlight(tc.Input(), tc.FailAt())
					// + " is no " + tc.Rule());
				} else {
					failures++;
					out.flush();

					// parse again with trace enabled
					parse(p, ts, true, err);

					err.print("ERROR: " + tc.Name());

					if (r.success())
						err.print(" succeeds instead of failing at "
								+ tc.FailAt() + ": " + tc.Input() + " is ");
					else {
						err.print(" fails at " + r.getMaxMatchedPhraseLength());
						if (tc.FailAt() != TestSuite.NOWHERE)
							err.print(" instead of " + tc.FailAt());
						err.print(": "
								+ highlight(tc.Input(),
										r.getMaxMatchedPhraseLength())
								+ " is no ");
					}

					err.println(tc.Rule() + "\n");

				}
			} catch (InvalidRuleName e) {
				failures++;
				err.println("\nERROR: " + tc.Name() + ": " + e.getMessage());
			} catch (Exception e) {
				failures++;
				err.println("\nERROR: " + tc.Name() + ": " + tc.Input() + ": "
						+ e.getMessage());
				e.printStackTrace(err);
			}
		}
		if (failures == 0) {
			out.println("All " + ts.TestCases().size() + " test cases passed\n");
		} else {
			err.println(failures + " of " + ts.TestCases().size()
					+ " test cases failed\n");
		}
	}

	private Result parse(Parser p, TestSuite ts, boolean doTrace, PrintStream ps)
			throws Exception {
		Trace t = p.enableTrace(doTrace);
		if (doTrace) {
			trace = ps;
			t.setOut(trace);
			trace.println();
			// TODO: add recursive disabling to Java APG?
			for (String rule : ts.DisableTrace()) {
				t.enableRule(false, gp.ruleID(rule));
			}
		}

		Result r = p.parse();

		if (doTrace) {
			trace.println();
			trace.flush();
			trace = null;
		}
		return r;
	}

	private String highlight(String input, int pos) {
		return input.substring(0, pos) + "[" + input.substring(pos) + "]";
	}

	public void printStatistics(int maxUncoveredRules, PrintStream out,
			PrintStream err) {
		int coveredRules = coveredRules(s, maxUncoveredRules, out, err);
		int coverage = (100 * coveredRules) / gp.ruleCount();
		out.println(coveredRules + " of " + gp.ruleCount() + " rules covered ("
				+ coverage + "%)");
	}

	private int coveredRules(Statistics s, int maxUncoveredRules,
			PrintStream out, PrintStream err) {
		int unMatchedRules = 0;
		HashSet<String> matchedRuleNames = new HashSet<String>();

		ByteArrayOutputStream os = new ByteArrayOutputStream();
		PrintStream statOut = new PrintStream(os);

		try {
			s.displayStats(statOut, "rules");
			String statString = os.toString("UTF8");
			String stats[] = statString.split(System
					.getProperty("line.separator"));
			for (int i = 1; i < stats.length; i++) {
				String[] words = stats[i].split("\\s+");
				if (!words[1].equals("0"))
					matchedRuleNames.add(words[5]);
			}

			if (matchedRuleNames.size() < gp.ruleCount()) {
				out.println("\nUncovered rules:");
				unMatchedRules = 0;
				for (String r : gp.ruleNames) {
					if (!matchedRuleNames.contains(r)) {
						if (unMatchedRules < maxUncoveredRules)
							out.println("  " + r);
						else if (unMatchedRules == maxUncoveredRules)
							out.println("  ...");
						unMatchedRules++;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace(err);
		}
		statOut.close();
		return matchedRuleNames.size();
	}
}
