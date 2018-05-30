package checker;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckTest {
	private static final String TEST_CASES_XML = "examples/UnitTestCases.xml";
	private static TestSuite ts;
	private Check c;
	private PrintStream out;
	private PrintStream err;
	private ByteArrayOutputStream outArray;
	private ByteArrayOutputStream errArray;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ts = TestSuite.read(TEST_CASES_XML);
	}

	@Before
	public void setUp() throws Exception {
		c = new Check();
		outArray = new ByteArrayOutputStream();
		out = new PrintStream(outArray);
		errArray = new ByteArrayOutputStream();
		err = new PrintStream(errArray);
	}

	@After
	public void tearDown() throws Exception {
		out.close();
		err.close();
	}

	@Test
	public void testReadTestCases() {
		assertFalse("TestCases read from file", ts.TestCases().isEmpty());
		assertEquals("TestCase name", "Succeed", ts.clone("Succeed")
				.TestCases().get(0).Name());
		assertEquals("TestCase list", 1, ts.clone("Succeed").TestCases().size());
	}

	@Test
	public void testRunOkMatch() throws Exception {
		c.run(ts.clone("Succeed"), out, err);
		assertEquals(
				"out",
				"All 1 test cases passed",
				outLine(-1).substring(0, 23));
		assertEquals("err", "", errArray.toString());
	}

	@Test
	public void testRunOkFailAt() throws Exception {
		c.run(ts.clone("Succeed with FailAt"), out, err);
		assertEquals(
				"out",
				"All 1 test cases passed",
				outLine(-1).substring(0, 23));
		assertEquals("err", "", errArray.toString());
	}

	@Test
	public void testRunErrorNoFailAt() throws Exception {
		c.run(ts.clone("Fail without FailAt"), out, err);
		assertEquals("out", "", outArray.toString());
		assertEquals(
				"err",
				"ERROR: Fail without FailAt fails at 23: 01234567-89ab-cdef-4567[89abcdef] is no guidValue\n",
				errLine(-2));
	}

	@Test
	public void testRunErrorFailToFail() throws Exception {
		c.run(ts.clone("Fail to Fail"), out, err);
		assertEquals("out", "", outArray.toString());
		assertEquals(
				"err",
				"ERROR: Fail to Fail succeeds instead of failing at 4: Categories is relativeUrl\n",
				errLine(-2));
	}

	@Test
	public void testRunErrorWrongFailAt() throws Exception {
		c.run(ts.clone("Fail with wrong FailAt"), out, err);
		assertEquals("out", "", outArray.toString());
		assertEquals(
				"err",
				"ERROR: Fail with wrong FailAt fails at 14 instead of 11: 01234567-89ab-[xdef-0123-456789abcdef] is no guidValue\n",
				errLine(-2));
	}

	@Test
	public void testRunErrorFailAtOutOfRange() throws Exception {
		c.run(ts.clone("FailAt out of range"), out, err);
		assertEquals("out", "", outArray.toString());
		assertEquals(
				"err",
				"ERROR: FailAt out of range fails at 14 instead of 107: 01234567-89ab-[xdef-0123-456789abcdef] is no guidValue\n",
				errLine(-2));
	}

	@Test
	public void testRuleCallback() throws Exception {
		c.run(ts.clone("Rule callback with match"), out, err);
		assertEquals("err", "", errArray.toString());
		assertEquals(
				"out",
				"All 1 test cases passed",
				outLine(-1).substring(0, 23));
	}

	@Test
	public void testRuleCallbackWithoutMatch() throws Exception {
		c.run(ts.clone("Rule callback without match"), out, err);
		assertEquals("out", "", outArray.toString());
		assertEquals(
				"err",
				"ERROR: Rule callback without match fails at 8: Products[(1)] is no relativeUrl\n",
				errLine(-2));
	}

	private String outLine(int line) throws Exception {
		String[] lines = outArray.toString("UTF8").split(
				System.getProperty("line.separator"));
		if (line < 0)
			return lines[lines.length + line];
		else
			return lines[line];
	}

	private String errLine(int line) throws Exception {
		String[] lines = errArray.toString("UTF8").split(
				System.getProperty("line.separator"));
		if (line < 0)
			return lines[lines.length + line];
		else
			return lines[line];
	}
}
