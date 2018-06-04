# ABNF Test Tool #

This project is an Eclipse project that you can import into your workspace via 
- File > Import > Existing Projects into Workspace

The project contains three linked files:
- `abnf.txt`
- `abnf-testcases.xml`
- `apg.jar`

These linked files need to be connected to physical files on your machine via
* File > Properties > Edit...

After pointing 
- `abnf.txt` to your ABNF, 
- `abnf-testcases.xml` to your testcases, and 
- `apg.jar` to your copy of Java APG 1.0 [https://github.com/ldthomas/apg-java](https://github.com/ldthomas/apg-java), 

you are ready to go. 

(Actually you only need to connect `apg.jar` to experiment with the example ABNF and testcases provided with this project.)

The project uses a custom build step `Generate ABNF Parser` to generate the java class
`src/grammar/GrammarUnderTest.java` from the linked file `abnf.txt` using Java APG. 

The run configuration `Check` executes all testcases in the linked file `abnf-testcases.xml`.

That's all you need for the straight-forward case.


## Testcase File Structure

Testcase files are XML files satisfying the schema `TestCases.xsd`. To enable syntax check and auto-completion you can add the schema to
- Window > Preferences > XML > XML Catalog > User Specified Entries
     
as
- Location: `CheckABNF/TestCases.xsd`
- Key type: `Namespace name`
- Key:      `http://docs.oasis-open.org/odata/ns/testcases`
 
While you're at it, also make sure that in
- Window -> Preferences -> Run/Debug -> Launching

in the bottom-most group "Launch Operation" the first radio button 
"Always launch the previously launched application" is selected. 
This allows you to use `F11` in the XML editor to re-run all testcases.
 
Each `TestCase` has a `Name`, a start `Rule` for the parser, and an `Input` string to 
parse. Negative testcases also have to specify the position at which the parser is expected to `FailAt`:

```xml
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
```

Testcases without `FailAt` succeed if the complete input is successfully parsed. 

Testcases with `FailAt` succeed if the parser fails at the specified position. 

Testcases fail otherwise. In that case a parser trace is included in the console output. "Trivial" rules can be omitted from the parser trace:

```xml
<TestSuite xmlns="http://docs.oasis-open.org/odata/ns/testcases">
    <DisableTrace Rule="identifier" />
    <DisableTrace Rule="identifierLeadingCharacter" />
    <DisableTrace Rule="identifierCharacter" />
    <DisableTrace Rule="ALPHA" />
    <DisableTrace Rule="DIGIT" />
```


In addition to testcases the XML file may contain any number of constraints:

```xml
<TestSuite xmlns="http://docs.oasis-open.org/odata/ns/testcases">
    <Constraint Rule="singularName">
        <Match>Category</Match>
        <Match>Product</Match>
        <Match>Supplier</Match>
    </Constraint>
    <Constraint Rule="pluralName">
        <Match>Items</Match>
        <Match>Products</Match>
    </Constraint>
```
   
This helps the parser to disambiguate between rules that accept the same set of character sequences. If the parser successfully matches an `entityNavigationProperty`, it will trigger a callback that will check whether the matched character sequence is identical to one of the given `<Match>`es. If not, the parser will continue with the next alternative.


## Multiple Testcase Files

If you want to split your testcases into two files, point the linked file

- `abnf-testcases-2.xml`

to your second testcase file and use the run configuration `Check2`. The rule coverage will be calculated using both testcase files. 

If you want to split your testcases further, it should be easy to extrapolate from here.



## Multiple ABNF Files

If you want to split your grammar into multiple files, you have to first add the files to your project, then adapt the build step `Generate ABNF Parser` via
- Project > Properties > Builders

Select `Generate ABNF Parser`, press "Edit...", then
 - on the "Main" tab in the "Arguments" text field: add `/in=...` parameters for the additional grammar files
 - on the "Build Options" tab select press the "Specify Resources..." button, then check the additional ABNF files to trigger the build step if one of the files is saved with changes. 
