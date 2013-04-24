package checker;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckTest {
	private static final String TEST_CASES_XML = "TestCases.xml";
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
				"OK: Succeed: guid'01234567-89ab-cdef-0123-456789abcdef' is GUID",
				outLine(0));
		assertEquals("err", "", errArray.toString());
	}

	@Test
	public void testRunOkFailAt() throws Exception {
		c.run(ts.clone("Succeed with FailAt"), out, err);
		assertEquals(
				"out",
				"OK: Succeed with FailAt fails at 10: guid'01234[g67-89ab-cdef-0123-456789abcdef'] is no GUID",
				outLine(0));
		assertEquals("err", "", errArray.toString());
	}

	@Test
	public void testRunErrorNoFailAt() throws Exception {
		c.run(ts.clone("Fail without FailAt"), out, err);
		assertEquals("out", "", outArray.toString());
		assertEquals(
				"err",
				"\nERROR: Fail without FailAt fails at 28: guid'01234567-89ab-cdef-4567[89abcdef'] is no GUID\n",
				errLine(0));
	}

	@Test
	public void testRunErrorFailToFail() throws Exception {
		c.run(ts.clone("Fail to Fail"), out, err);
		assertEquals("out", "", outArray.toString());
		assertEquals(
				"err",
				"\nERROR: Fail to Fail succeeds instead of failing at 4: http://www.odata.org/ is odataUri\n",
				errLine(0));
	}

	@Test
	public void testRunErrorWrongFailAt() throws Exception {
		c.run(ts.clone("Fail with wrong FailAt"), out, err);
		assertEquals("out", "", outArray.toString());
		assertEquals(
				"err",
				"\nERROR: Fail with wrong FailAt fails at 0 instead of 11: [zuid'01234567-89ab-cdef-0123-456789abcdef'] is no GUID\n",
				errLine(0));
	}

	@Test
	public void testRunErrorFailAtOutOfRange() throws Exception {
		c.run(ts.clone("FailAt out of range"), out, err);
		assertEquals("out", "", outArray.toString());
		assertEquals(
				"err",
				"\nERROR: FailAt out of range fails at 19 instead of 107: guid'01234567-89ab-[xdef-0123-456789abcdef'] is no GUID\n",
				errLine(0));
	}

	@Test
	public void testRuleCallback() throws Exception {
		c.run(ts.clone("Rule callback"), out, err);
		assertEquals("err", "", errArray.toString());
		assertEquals(
				"out",
				"OK: Rule callback: Categories(1)/Products(1) is odataRelativeUri",
				outLine(0));
	}

	private String outLine(int line) throws Exception {
		String[] lines = outArray.toString("UTF8").split(
				System.getProperty("line.separator"));
		return lines[line];
	}

	private String errLine(int line) throws Exception {
		String[] lines = errArray.toString("UTF8").split(
				System.getProperty("line.separator"));
		return lines[line];
	}
}
