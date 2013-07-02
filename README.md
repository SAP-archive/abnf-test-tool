# ABNF Test Tool #

The ABNF Test Tool uses Java APG 1.0 from [http://www.coasttocoastresearch.com/apg/docs/docjava](http://www.coasttocoastresearch.com/apg/docs/docjava).

Alternatively it can use the extended version provided by Ken Baclawski at [http://www.ccs.neu.edu/home/kenb/eapg.jar](http://www.ccs.neu.edu/home/kenb/eapg.jar). This version allows case-sensitive literals surrounded by single quotes.

The project contains three linked files:

- `abnf.txt`
- `abnf-testcases.xml`
- `apg.jar`

Point the linked files to your ABNF, your test cases, and a downloaded copy of Java APG, then you are ready to go.

The project uses a custom build step to generate the java class
`src/grammar/GrammarUnderTest.java` from the linked file `abnf.txt` using Java APG. 

The included run configuration `Check` executes all test cases in the linked file `abnf-testcases.xml`.

If you want to split your testcases into two files, point the linked file

- `abnf-extension-testcases.xml`

to your second testcase file and use the run configuration `Check2`. The rule coverage will be calculated using both testcase files. 

If you want to split your testcases further, it should be easy to extrapolate from here.

The schema for the test case XML files is `TestCases.xsd`. Add it to

- Window -> Preferences -> XML -> XML Catalog -> User Specified Entries
     
as

- Location: `CheckABNF/TestCases.xsd`
- Key type: `Namespace name`
- Key:      `http://docs.oasis-open.org/odata/ns/testcases`
 
While you're at it, also make sure that in

- Window -> Preferences -> Run/Debug -> Launching

in the bottom-most group "Launch Operation" the first radio button 
"Always launch the previously launched application" is selected. 
This allows you to use `F11` in the XML editor to re-run all test cases.
 
Each test case has a name, a start rule for the parser, and an input string to 
parse. It may specify the position at which the parser is expected to fail:

    <TestSuite xmlns="http://docs.oasis-open.org/odata/ns/testcases">
      <TestCase Name="URI with path and trailing slash" 
                Rule="ABSOLUTE_URI">
        <Input>http://My.Org:8080/MyService/</Input>
      </TestCase>
      <TestCase Name="URI without schema separator" 
                Rule="ABSOLUTE_URI" 
                FailAt="4">
        <Input>http//My.Org/</Input>
      </TestCase>
      ...
    </TestSuite>
    
Test cases without a `FailAt` attribute succeed if the complete input is successfully parsed. Test cases with a `FailAt` attribute succeed if the parser fails at the specified position. Test cases fail otherwise. In that case a parser trace is included in the console output.

In addition to test cases the XML file may contain any number of constraints:

    <TestSuite xmlns="http://docs.oasis-open.org/odata/ns/testcases">
      ...
      <Constraint Rule="entityNavigationProperty">
        <Match>Category</Match>
        <Match>Product</Match>
        <Match>Supplier</Match>
      </Constraint>
      <Constraint Rule="entityColNavigationProperty">
        <Match>Items</Match>
        <Match>Products</Match>
      </Constraint>
      ...
    </TestSuite>
   
This helps the parser to disambiguate between rules that accept the same character sequences, in this example between navigation properties with multiplicity 1 and *.

If the parser successfully matches an `entityNavigationProperty`, it will trigger a callback that will check whether the matched character sequence is identical to one of the given `<Match>`es. If not, the parser will continue with the next alternative.