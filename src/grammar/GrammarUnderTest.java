package grammar;

import com.coasttocoastresearch.apg.Grammar;
import java.io.PrintStream;
/** This class has been generated automatically from an SABNF grammer by
 * Java APG, the {@link com.coasttocoastresearch.apg.Generator} class.<br>
 * It is an extension of the {@link com.coasttocoastresearch.apg.Grammar}
 * class containing additional members and enums not found
 * in the base class.<br>
 * The function {@link #getInstance()} will return a reference to a static,
 * singleton instance of the class.
 * <p>For more information visit <a href="http://www.coasttocoastresearch.com" target="_blank">http://www.coasttocoastresearch.com</a>. */

public class GrammarUnderTest extends Grammar{

    // public API
    /** Called to get a singleton instance of this class.
     * @return a singleton instance of this class, cast as the base class, Grammar. */
    public static Grammar getInstance(){
        if(factoryInstance == null){
            factoryInstance = new GrammarUnderTest(getRules(), getUdts(), getOpcodes());
        }
        return factoryInstance;
    }

    // rule name enum
    /** The number of rules in the grammar */
    public static int ruleCount = 411;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>380</code>, name = <code>"A-to-F"</code> */
        A_TO_F("A-to-F", 380, 2639, 7),
        /** id = <code>204</code>, name = <code>"abstractSpatialTypeName"</code> */
        ABSTRACTSPATIALTYPENAME("abstractSpatialTypeName", 204, 1551, 3),
        /** id = <code>216</code>, name = <code>"action"</code> */
        ACTION("action", 216, 1576, 1),
        /** id = <code>217</code>, name = <code>"actionImport"</code> */
        ACTIONIMPORT("actionImport", 217, 1577, 1),
        /** id = <code>21</code>, name = <code>"actionImportCall"</code> */
        ACTIONIMPORTCALL("actionImportCall", 21, 203, 1),
        /** id = <code>150</code>, name = <code>"addExpr"</code> */
        ADDEXPR("addExpr", 150, 1207, 5),
        /** id = <code>391</code>, name = <code>"aggregateAs"</code> */
        AGGREGATEAS("aggregateAs", 391, 2707, 5),
        /** id = <code>390</code>, name = <code>"aggregateExpr"</code> */
        AGGREGATEEXPR("aggregateExpr", 390, 2696, 11),
        /** id = <code>393</code>, name = <code>"aggregateFrom"</code> */
        AGGREGATEFROM("aggregateFrom", 393, 2717, 7),
        /** id = <code>394</code>, name = <code>"aggregateMethod"</code> */
        AGGREGATEMETHOD("aggregateMethod", 394, 2724, 10),
        /** id = <code>389</code>, name = <code>"aggregateParam"</code> */
        AGGREGATEPARAM("aggregateParam", 389, 2688, 8),
        /** id = <code>388</code>, name = <code>"aggregateTrafo"</code> */
        AGGREGATETRAFO("aggregateTrafo", 388, 2673, 15),
        /** id = <code>392</code>, name = <code>"aggregateWith"</code> */
        AGGREGATEWITH("aggregateWith", 392, 2712, 5),
        /** id = <code>76</code>, name = <code>"aliasAndValue"</code> */
        ALIASANDVALUE("aliasAndValue", 76, 578, 4),
        /** id = <code>105</code>, name = <code>"allExpr"</code> */
        ALLEXPR("allExpr", 105, 867, 11),
        /** id = <code>71</code>, name = <code>"allOperationsInSchema"</code> */
        ALLOPERATIONSINSCHEMA("allOperationsInSchema", 71, 550, 4),
        /** id = <code>314</code>, name = <code>"allowEntityReferencesPreference"</code> */
        ALLOWENTITYREFERENCESPREFERENCE("allowEntityReferencesPreference", 314, 2138, 1),
        /** id = <code>377</code>, name = <code>"ALPHA"</code> */
        ALPHA("ALPHA", 377, 2632, 3),
        /** id = <code>141</code>, name = <code>"andExpr"</code> */
        ANDEXPR("andExpr", 141, 1162, 5),
        /** id = <code>319</code>, name = <code>"annotationIdentifier"</code> */
        ANNOTATIONIDENTIFIER("annotationIdentifier", 319, 2166, 11),
        /** id = <code>165</code>, name = <code>"annotationInUri"</code> */
        ANNOTATIONINURI("annotationInUri", 165, 1330, 12),
        /** id = <code>318</code>, name = <code>"annotationsList"</code> */
        ANNOTATIONSLIST("annotationsList", 318, 2160, 6),
        /** id = <code>104</code>, name = <code>"anyExpr"</code> */
        ANYEXPR("anyExpr", 104, 854, 13),
        /** id = <code>385</code>, name = <code>"apply"</code> */
        APPLY("apply", 385, 2650, 4),
        /** id = <code>386</code>, name = <code>"applyExpr"</code> */
        APPLYEXPR("applyExpr", 386, 2654, 6),
        /** id = <code>387</code>, name = <code>"applyTrafo"</code> */
        APPLYTRAFO("applyTrafo", 387, 2660, 13),
        /** id = <code>159</code>, name = <code>"arrayOrObject"</code> */
        ARRAYOROBJECT("arrayOrObject", 159, 1266, 5),
        /** id = <code>330</code>, name = <code>"AT"</code> */
        AT("AT", 330, 2217, 3),
        /** id = <code>343</code>, name = <code>"authority"</code> */
        AUTHORITY("authority", 343, 2274, 10),
        /** id = <code>173</code>, name = <code>"begin-array"</code> */
        BEGIN_ARRAY("begin-array", 173, 1385, 6),
        /** id = <code>171</code>, name = <code>"begin-object"</code> */
        BEGIN_OBJECT("begin-object", 171, 1373, 6),
        /** id = <code>234</code>, name = <code>"binary"</code> */
        BINARY("binary", 234, 1638, 7),
        /** id = <code>235</code>, name = <code>"binaryValue"</code> */
        BINARYVALUE("binaryValue", 235, 1645, 3),
        /** id = <code>87</code>, name = <code>"boolCommonExpr"</code> */
        BOOLCOMMONEXPR("boolCommonExpr", 87, 689, 21),
        /** id = <code>236</code>, name = <code>"booleanValue"</code> */
        BOOLEANVALUE("booleanValue", 236, 1648, 3),
        /** id = <code>108</code>, name = <code>"boolMethodCallExpr"</code> */
        BOOLMETHODCALLEXPR("boolMethodCallExpr", 108, 906, 5),
        /** id = <code>139</code>, name = <code>"boolParenExpr"</code> */
        BOOLPARENEXPR("boolParenExpr", 139, 1150, 6),
        /** id = <code>397</code>, name = <code>"bottomcountTrafo"</code> */
        BOTTOMCOUNTTRAFO("bottomcountTrafo", 397, 2769, 11),
        /** id = <code>398</code>, name = <code>"bottompercentTrafo"</code> */
        BOTTOMPERCENTTRAFO("bottompercentTrafo", 398, 2780, 11),
        /** id = <code>399</code>, name = <code>"bottomsumTrafo"</code> */
        BOTTOMSUMTRAFO("bottomsumTrafo", 399, 2791, 11),
        /** id = <code>22</code>, name = <code>"boundActionCall"</code> */
        BOUNDACTIONCALL("boundActionCall", 22, 204, 4),
        /** id = <code>26</code>, name = <code>"boundComplexColFuncCall"</code> */
        BOUNDCOMPLEXCOLFUNCCALL("boundComplexColFuncCall", 26, 223, 5),
        /** id = <code>25</code>, name = <code>"boundComplexFuncCall"</code> */
        BOUNDCOMPLEXFUNCCALL("boundComplexFuncCall", 25, 218, 5),
        /** id = <code>24</code>, name = <code>"boundEntityColFuncCall"</code> */
        BOUNDENTITYCOLFUNCCALL("boundEntityColFuncCall", 24, 213, 5),
        /** id = <code>23</code>, name = <code>"boundEntityFuncCall"</code> */
        BOUNDENTITYFUNCCALL("boundEntityFuncCall", 23, 208, 5),
        /** id = <code>100</code>, name = <code>"boundFunctionExpr"</code> */
        BOUNDFUNCTIONEXPR("boundFunctionExpr", 100, 803, 1),
        /** id = <code>20</code>, name = <code>"boundOperation"</code> */
        BOUNDOPERATION("boundOperation", 20, 175, 28),
        /** id = <code>28</code>, name = <code>"boundPrimitiveColFuncCall"</code> */
        BOUNDPRIMITIVECOLFUNCCALL("boundPrimitiveColFuncCall", 28, 233, 5),
        /** id = <code>27</code>, name = <code>"boundPrimitiveFuncCall"</code> */
        BOUNDPRIMITIVEFUNCCALL("boundPrimitiveFuncCall", 27, 228, 5),
        /** id = <code>329</code>, name = <code>"BWS"</code> */
        BWS("BWS", 329, 2216, 1),
        /** id = <code>243</code>, name = <code>"byteValue"</code> */
        BYTEVALUE("byteValue", 243, 1697, 2),
        /** id = <code>315</code>, name = <code>"callbackPreference"</code> */
        CALLBACKPREFERENCE("callbackPreference", 315, 2139, 12),
        /** id = <code>158</code>, name = <code>"castExpr"</code> */
        CASTEXPR("castExpr", 158, 1253, 13),
        /** id = <code>135</code>, name = <code>"ceilingMethodCallExpr"</code> */
        CEILINGMETHODCALLEXPR("ceilingMethodCallExpr", 135, 1114, 7),
        /** id = <code>180</code>, name = <code>"charInJSON"</code> */
        CHARINJSON("charInJSON", 180, 1419, 20),
        /** id = <code>339</code>, name = <code>"CLOSE"</code> */
        CLOSE("CLOSE", 339, 2243, 3),
        /** id = <code>272</code>, name = <code>"collectionLiteral"</code> */
        COLLECTIONLITERAL("collectionLiteral", 272, 1915, 8),
        /** id = <code>5</code>, name = <code>"collectionNavigation"</code> */
        COLLECTIONNAVIGATION("collectionNavigation", 5, 78, 13),
        /** id = <code>95</code>, name = <code>"collectionNavigationExpr"</code> */
        COLLECTIONNAVIGATIONEXPR("collectionNavigationExpr", 95, 766, 11),
        /** id = <code>169</code>, name = <code>"collectionNavPropInJSON"</code> */
        COLLECTIONNAVPROPINJSON("collectionNavPropInJSON", 169, 1357, 6),
        /** id = <code>14</code>, name = <code>"collectionPath"</code> */
        COLLECTIONPATH("collectionPath", 14, 156, 3),
        /** id = <code>97</code>, name = <code>"collectionPathExpr"</code> */
        COLLECTIONPATHEXPR("collectionPathExpr", 97, 780, 11),
        /** id = <code>162</code>, name = <code>"collectionPropertyInUri"</code> */
        COLLECTIONPROPERTYINURI("collectionPropertyInUri", 162, 1301, 13),
        /** id = <code>331</code>, name = <code>"COLON"</code> */
        COLON("COLON", 331, 2220, 3),
        /** id = <code>332</code>, name = <code>"COMMA"</code> */
        COMMA("COMMA", 332, 2223, 3),
        /** id = <code>86</code>, name = <code>"commonExpr"</code> */
        COMMONEXPR("commonExpr", 86, 670, 19),
        /** id = <code>222</code>, name = <code>"complexColFunction"</code> */
        COMPLEXCOLFUNCTION("complexColFunction", 222, 1588, 1),
        /** id = <code>228</code>, name = <code>"complexColFunctionImport"</code> */
        COMPLEXCOLFUNCTIONIMPORT("complexColFunctionImport", 228, 1594, 1),
        /** id = <code>32</code>, name = <code>"complexColFunctionImportCall"</code> */
        COMPLEXCOLFUNCTIONIMPORTCALL("complexColFunctionImportCall", 32, 247, 3),
        /** id = <code>160</code>, name = <code>"complexColInUri"</code> */
        COMPLEXCOLINURI("complexColInUri", 160, 1271, 10),
        /** id = <code>211</code>, name = <code>"complexColProperty"</code> */
        COMPLEXCOLPROPERTY("complexColProperty", 211, 1569, 1),
        /** id = <code>221</code>, name = <code>"complexFunction"</code> */
        COMPLEXFUNCTION("complexFunction", 221, 1587, 1),
        /** id = <code>227</code>, name = <code>"complexFunctionImport"</code> */
        COMPLEXFUNCTIONIMPORT("complexFunctionImport", 227, 1593, 1),
        /** id = <code>31</code>, name = <code>"complexFunctionImportCall"</code> */
        COMPLEXFUNCTIONIMPORTCALL("complexFunctionImportCall", 31, 244, 3),
        /** id = <code>161</code>, name = <code>"complexInUri"</code> */
        COMPLEXINURI("complexInUri", 161, 1281, 20),
        /** id = <code>16</code>, name = <code>"complexPath"</code> */
        COMPLEXPATH("complexPath", 16, 162, 10),
        /** id = <code>98</code>, name = <code>"complexPathExpr"</code> */
        COMPLEXPATHEXPR("complexPathExpr", 98, 791, 9),
        /** id = <code>210</code>, name = <code>"complexProperty"</code> */
        COMPLEXPROPERTY("complexProperty", 210, 1568, 1),
        /** id = <code>164</code>, name = <code>"complexPropertyInUri"</code> */
        COMPLEXPROPERTYINURI("complexPropertyInUri", 164, 1324, 6),
        /** id = <code>196</code>, name = <code>"complexTypeName"</code> */
        COMPLEXTYPENAME("complexTypeName", 196, 1511, 1),
        /** id = <code>8</code>, name = <code>"compoundKey"</code> */
        COMPOUNDKEY("compoundKey", 8, 98, 8),
        /** id = <code>118</code>, name = <code>"concatMethodCallExpr"</code> */
        CONCATMETHODCALLEXPR("concatMethodCallExpr", 118, 1000, 11),
        /** id = <code>400</code>, name = <code>"concatTrafo"</code> */
        CONCATTRAFO("concatTrafo", 400, 2802, 13),
        /** id = <code>205</code>, name = <code>"concreteSpatialTypeName"</code> */
        CONCRETESPATIALTYPENAME("concreteSpatialTypeName", 205, 1554, 8),
        /** id = <code>109</code>, name = <code>"containsMethodCallExpr"</code> */
        CONTAINSMETHODCALLEXPR("containsMethodCallExpr", 109, 911, 11),
        /** id = <code>81</code>, name = <code>"contextFragment"</code> */
        CONTEXTFRAGMENT("contextFragment", 81, 597, 46),
        /** id = <code>316</code>, name = <code>"continueOnErrorPreference"</code> */
        CONTINUEONERRORPREFERENCE("continueOnErrorPreference", 316, 2151, 1),
        /** id = <code>17</code>, name = <code>"count"</code> */
        COUNT("count", 17, 172, 1),
        /** id = <code>39</code>, name = <code>"crossjoin"</code> */
        CROSSJOIN("crossjoin", 39, 276, 9),
        /** id = <code>79</code>, name = <code>"customName"</code> */
        CUSTOMNAME("customName", 79, 591, 4),
        /** id = <code>78</code>, name = <code>"customQueryOption"</code> */
        CUSTOMQUERYOPTION("customQueryOption", 78, 585, 6),
        /** id = <code>80</code>, name = <code>"customValue"</code> */
        CUSTOMVALUE("customValue", 80, 595, 2),
        /** id = <code>250</code>, name = <code>"date"</code> */
        DATE("date", 250, 1729, 5),
        /** id = <code>127</code>, name = <code>"dateMethodCallExpr"</code> */
        DATEMETHODCALLEXPR("dateMethodCallExpr", 127, 1067, 7),
        /** id = <code>252</code>, name = <code>"dateTimeOffset"</code> */
        DATETIMEOFFSET("dateTimeOffset", 252, 1740, 5),
        /** id = <code>253</code>, name = <code>"dateTimeOffsetValue"</code> */
        DATETIMEOFFSETVALUE("dateTimeOffsetValue", 253, 1745, 25),
        /** id = <code>251</code>, name = <code>"dateValue"</code> */
        DATEVALUE("dateValue", 251, 1734, 6),
        /** id = <code>262</code>, name = <code>"day"</code> */
        DAY("day", 262, 1865, 12),
        /** id = <code>121</code>, name = <code>"dayMethodCallExpr"</code> */
        DAYMETHODCALLEXPR("dayMethodCallExpr", 121, 1025, 7),
        /** id = <code>353</code>, name = <code>"dec-octet"</code> */
        DEC_OCTET("dec-octet", 353, 2420, 16),
        /** id = <code>237</code>, name = <code>"decimalValue"</code> */
        DECIMALVALUE("decimalValue", 237, 1651, 10),
        /** id = <code>378</code>, name = <code>"DIGIT"</code> */
        DIGIT("DIGIT", 378, 2635, 1),
        /** id = <code>136</code>, name = <code>"distanceMethodCallExpr"</code> */
        DISTANCEMETHODCALLEXPR("distanceMethodCallExpr", 136, 1121, 11),
        /** id = <code>153</code>, name = <code>"divExpr"</code> */
        DIVEXPR("divExpr", 153, 1222, 5),
        /** id = <code>238</code>, name = <code>"doubleValue"</code> */
        DOUBLEVALUE("doubleValue", 238, 1661, 11),
        /** id = <code>381</code>, name = <code>"DQUOTE"</code> */
        DQUOTE("DQUOTE", 381, 2646, 1),
        /** id = <code>0</code>, name = <code>"dummyStartRule"</code> */
        DUMMYSTARTRULE("dummyStartRule", 0, 0, 3),
        /** id = <code>254</code>, name = <code>"duration"</code> */
        DURATION("duration", 254, 1770, 5),
        /** id = <code>255</code>, name = <code>"durationValue"</code> */
        DURATIONVALUE("durationValue", 255, 1775, 32),
        /** id = <code>174</code>, name = <code>"end-array"</code> */
        END_ARRAY("end-array", 174, 1391, 6),
        /** id = <code>172</code>, name = <code>"end-object"</code> */
        END_OBJECT("end-object", 172, 1379, 6),
        /** id = <code>111</code>, name = <code>"endsWithMethodCallExpr"</code> */
        ENDSWITHMETHODCALLEXPR("endsWithMethodCallExpr", 111, 933, 11),
        /** id = <code>85</code>, name = <code>"entity"</code> */
        ENTITY("entity", 85, 669, 1),
        /** id = <code>220</code>, name = <code>"entityColFunction"</code> */
        ENTITYCOLFUNCTION("entityColFunction", 220, 1586, 1),
        /** id = <code>226</code>, name = <code>"entityColFunctionImport"</code> */
        ENTITYCOLFUNCTIONIMPORT("entityColFunctionImport", 226, 1592, 1),
        /** id = <code>30</code>, name = <code>"entityColFunctionImportCall"</code> */
        ENTITYCOLFUNCTIONIMPORTCALL("entityColFunctionImportCall", 30, 241, 3),
        /** id = <code>215</code>, name = <code>"entityColNavigationProperty"</code> */
        ENTITYCOLNAVIGATIONPROPERTY("entityColNavigationProperty", 215, 1575, 1),
        /** id = <code>219</code>, name = <code>"entityFunction"</code> */
        ENTITYFUNCTION("entityFunction", 219, 1585, 1),
        /** id = <code>225</code>, name = <code>"entityFunctionImport"</code> */
        ENTITYFUNCTIONIMPORT("entityFunctionImport", 225, 1591, 1),
        /** id = <code>29</code>, name = <code>"entityFunctionImportCall"</code> */
        ENTITYFUNCTIONIMPORTCALL("entityFunctionImportCall", 29, 238, 3),
        /** id = <code>214</code>, name = <code>"entityNavigationProperty"</code> */
        ENTITYNAVIGATIONPROPERTY("entityNavigationProperty", 214, 1574, 1),
        /** id = <code>43</code>, name = <code>"entityOption"</code> */
        ENTITYOPTION("entityOption", 43, 305, 5),
        /** id = <code>42</code>, name = <code>"entityOptions"</code> */
        ENTITYOPTIONS("entityOptions", 42, 295, 10),
        /** id = <code>193</code>, name = <code>"entitySetName"</code> */
        ENTITYSETNAME("entitySetName", 193, 1508, 1),
        /** id = <code>195</code>, name = <code>"entityTypeName"</code> */
        ENTITYTYPENAME("entityTypeName", 195, 1510, 1),
        /** id = <code>267</code>, name = <code>"enum"</code> */
        ENUM("enum", 267, 1893, 5),
        /** id = <code>198</code>, name = <code>"enumerationMember"</code> */
        ENUMERATIONMEMBER("enumerationMember", 198, 1513, 1),
        /** id = <code>197</code>, name = <code>"enumerationTypeName"</code> */
        ENUMERATIONTYPENAME("enumerationTypeName", 197, 1512, 1),
        /** id = <code>268</code>, name = <code>"enumValue"</code> */
        ENUMVALUE("enumValue", 268, 1898, 6),
        /** id = <code>333</code>, name = <code>"EQ"</code> */
        EQ("EQ", 333, 2226, 1),
        /** id = <code>143</code>, name = <code>"eqExpr"</code> */
        EQEXPR("eqExpr", 143, 1172, 5),
        /** id = <code>182</code>, name = <code>"escape"</code> */
        ESCAPE("escape", 182, 1446, 3),
        /** id = <code>320</code>, name = <code>"excludeOperator"</code> */
        EXCLUDEOPERATOR("excludeOperator", 320, 2177, 1),
        /** id = <code>186</code>, name = <code>"exp"</code> */
        EXP("exp", 186, 1467, 8),
        /** id = <code>46</code>, name = <code>"expand"</code> */
        EXPAND("expand", 46, 327, 8),
        /** id = <code>49</code>, name = <code>"expandCountOption"</code> */
        EXPANDCOUNTOPTION("expandCountOption", 49, 399, 3),
        /** id = <code>47</code>, name = <code>"expandItem"</code> */
        EXPANDITEM("expandItem", 47, 335, 44),
        /** id = <code>51</code>, name = <code>"expandOption"</code> */
        EXPANDOPTION("expandOption", 51, 408, 5),
        /** id = <code>48</code>, name = <code>"expandPath"</code> */
        EXPANDPATH("expandPath", 48, 379, 20),
        /** id = <code>50</code>, name = <code>"expandRefOption"</code> */
        EXPANDREFOPTION("expandRefOption", 50, 402, 6),
        /** id = <code>401</code>, name = <code>"expandTrafo"</code> */
        EXPANDTRAFO("expandTrafo", 401, 2815, 11),
        /** id = <code>53</code>, name = <code>"filter"</code> */
        FILTER("filter", 53, 420, 4),
        /** id = <code>402</code>, name = <code>"filterTrafo"</code> */
        FILTERTRAFO("filterTrafo", 402, 2826, 7),
        /** id = <code>89</code>, name = <code>"firstMemberExpr"</code> */
        FIRSTMEMBEREXPR("firstMemberExpr", 89, 719, 8),
        /** id = <code>134</code>, name = <code>"floorMethodCallExpr"</code> */
        FLOORMETHODCALLEXPR("floorMethodCallExpr", 134, 1107, 7),
        /** id = <code>58</code>, name = <code>"format"</code> */
        FORMAT("format", 58, 450, 13),
        /** id = <code>185</code>, name = <code>"frac"</code> */
        FRAC("frac", 185, 1463, 4),
        /** id = <code>266</code>, name = <code>"fractionalSeconds"</code> */
        FRACTIONALSECONDS("fractionalSeconds", 266, 1891, 2),
        /** id = <code>125</code>, name = <code>"fractionalsecondsMethodCallExpr"</code> */
        FRACTIONALSECONDSMETHODCALLEXPR("fractionalsecondsMethodCallExpr", 125, 1053, 7),
        /** id = <code>362</code>, name = <code>"fragment"</code> */
        FRAGMENT("fragment", 362, 2475, 5),
        /** id = <code>271</code>, name = <code>"fullCollectionLiteral"</code> */
        FULLCOLLECTIONLITERAL("fullCollectionLiteral", 271, 1912, 3),
        /** id = <code>275</code>, name = <code>"fullLineStringLiteral"</code> */
        FULLLINESTRINGLITERAL("fullLineStringLiteral", 275, 1936, 3),
        /** id = <code>279</code>, name = <code>"fullMultiLineStringLiteral"</code> */
        FULLMULTILINESTRINGLITERAL("fullMultiLineStringLiteral", 279, 1955, 3),
        /** id = <code>282</code>, name = <code>"fullMultiPointLiteral"</code> */
        FULLMULTIPOINTLITERAL("fullMultiPointLiteral", 282, 1973, 3),
        /** id = <code>285</code>, name = <code>"fullMultiPolygonLiteral"</code> */
        FULLMULTIPOLYGONLITERAL("fullMultiPolygonLiteral", 285, 1991, 3),
        /** id = <code>288</code>, name = <code>"fullPointLiteral"</code> */
        FULLPOINTLITERAL("fullPointLiteral", 288, 2009, 3),
        /** id = <code>294</code>, name = <code>"fullPolygonLiteral"</code> */
        FULLPOLYGONLITERAL("fullPolygonLiteral", 294, 2034, 3),
        /** id = <code>218</code>, name = <code>"function"</code> */
        FUNCTION("function", 218, 1578, 7),
        /** id = <code>101</code>, name = <code>"functionExpr"</code> */
        FUNCTIONEXPR("functionExpr", 101, 804, 34),
        /** id = <code>103</code>, name = <code>"functionExprParameter"</code> */
        FUNCTIONEXPRPARAMETER("functionExprParameter", 103, 848, 6),
        /** id = <code>102</code>, name = <code>"functionExprParameters"</code> */
        FUNCTIONEXPRPARAMETERS("functionExprParameters", 102, 838, 10),
        /** id = <code>36</code>, name = <code>"functionParameter"</code> */
        FUNCTIONPARAMETER("functionParameter", 36, 266, 6),
        /** id = <code>35</code>, name = <code>"functionParameters"</code> */
        FUNCTIONPARAMETERS("functionParameters", 35, 256, 10),
        /** id = <code>148</code>, name = <code>"geExpr"</code> */
        GEEXPR("geExpr", 148, 1197, 5),
        /** id = <code>270</code>, name = <code>"geographyCollection"</code> */
        GEOGRAPHYCOLLECTION("geographyCollection", 270, 1907, 5),
        /** id = <code>274</code>, name = <code>"geographyLineString"</code> */
        GEOGRAPHYLINESTRING("geographyLineString", 274, 1931, 5),
        /** id = <code>278</code>, name = <code>"geographyMultiLineString"</code> */
        GEOGRAPHYMULTILINESTRING("geographyMultiLineString", 278, 1950, 5),
        /** id = <code>281</code>, name = <code>"geographyMultiPoint"</code> */
        GEOGRAPHYMULTIPOINT("geographyMultiPoint", 281, 1968, 5),
        /** id = <code>284</code>, name = <code>"geographyMultiPolygon"</code> */
        GEOGRAPHYMULTIPOLYGON("geographyMultiPolygon", 284, 1986, 5),
        /** id = <code>287</code>, name = <code>"geographyPoint"</code> */
        GEOGRAPHYPOINT("geographyPoint", 287, 2004, 5),
        /** id = <code>293</code>, name = <code>"geographyPolygon"</code> */
        GEOGRAPHYPOLYGON("geographyPolygon", 293, 2029, 5),
        /** id = <code>305</code>, name = <code>"geographyPrefix"</code> */
        GEOGRAPHYPREFIX("geographyPrefix", 305, 2091, 1),
        /** id = <code>137</code>, name = <code>"geoLengthMethodCallExpr"</code> */
        GEOLENGTHMETHODCALLEXPR("geoLengthMethodCallExpr", 137, 1132, 7),
        /** id = <code>273</code>, name = <code>"geoLiteral"</code> */
        GEOLITERAL("geoLiteral", 273, 1923, 8),
        /** id = <code>298</code>, name = <code>"geometryCollection"</code> */
        GEOMETRYCOLLECTION("geometryCollection", 298, 2056, 5),
        /** id = <code>299</code>, name = <code>"geometryLineString"</code> */
        GEOMETRYLINESTRING("geometryLineString", 299, 2061, 5),
        /** id = <code>300</code>, name = <code>"geometryMultiLineString"</code> */
        GEOMETRYMULTILINESTRING("geometryMultiLineString", 300, 2066, 5),
        /** id = <code>301</code>, name = <code>"geometryMultiPoint"</code> */
        GEOMETRYMULTIPOINT("geometryMultiPoint", 301, 2071, 5),
        /** id = <code>302</code>, name = <code>"geometryMultiPolygon"</code> */
        GEOMETRYMULTIPOLYGON("geometryMultiPolygon", 302, 2076, 5),
        /** id = <code>303</code>, name = <code>"geometryPoint"</code> */
        GEOMETRYPOINT("geometryPoint", 303, 2081, 5),
        /** id = <code>304</code>, name = <code>"geometryPolygon"</code> */
        GEOMETRYPOLYGON("geometryPolygon", 304, 2086, 5),
        /** id = <code>306</code>, name = <code>"geometryPrefix"</code> */
        GEOMETRYPREFIX("geometryPrefix", 306, 2092, 1),
        /** id = <code>405</code>, name = <code>"groupbyElement"</code> */
        GROUPBYELEMENT("groupbyElement", 405, 2856, 3),
        /** id = <code>404</code>, name = <code>"groupbyList"</code> */
        GROUPBYLIST("groupbyList", 404, 2844, 12),
        /** id = <code>403</code>, name = <code>"groupbyTrafo"</code> */
        GROUPBYTRAFO("groupbyTrafo", 403, 2833, 11),
        /** id = <code>147</code>, name = <code>"gtExpr"</code> */
        GTEXPR("gtExpr", 147, 1192, 5),
        /** id = <code>241</code>, name = <code>"guid"</code> */
        GUID("guid", 241, 1677, 5),
        /** id = <code>242</code>, name = <code>"guidValue"</code> */
        GUIDVALUE("guidValue", 242, 1682, 15),
        /** id = <code>350</code>, name = <code>"h16"</code> */
        H16("h16", 350, 2404, 2),
        /** id = <code>149</code>, name = <code>"hasExpr"</code> */
        HASEXPR("hasExpr", 149, 1202, 5),
        /** id = <code>307</code>, name = <code>"header"</code> */
        HEADER("header", 307, 2093, 6),
        /** id = <code>379</code>, name = <code>"HEXDIG"</code> */
        HEXDIG("HEXDIG", 379, 2636, 3),
        /** id = <code>341</code>, name = <code>"hier-part"</code> */
        HIER_PART("hier-part", 341, 2258, 7),
        /** id = <code>345</code>, name = <code>"host"</code> */
        HOST("host", 345, 2290, 4),
        /** id = <code>263</code>, name = <code>"hour"</code> */
        HOUR("hour", 263, 1877, 12),
        /** id = <code>122</code>, name = <code>"hourMethodCallExpr"</code> */
        HOURMETHODCALLEXPR("hourMethodCallExpr", 122, 1032, 7),
        /** id = <code>383</code>, name = <code>"HTAB"</code> */
        HTAB("HTAB", 383, 2648, 1),
        /** id = <code>44</code>, name = <code>"id"</code> */
        ID("id", 44, 310, 4),
        /** id = <code>202</code>, name = <code>"identifierCharacter"</code> */
        IDENTIFIERCHARACTER("identifierCharacter", 202, 1522, 4),
        /** id = <code>201</code>, name = <code>"identifierLeadingCharacter"</code> */
        IDENTIFIERLEADINGCHARACTER("identifierLeadingCharacter", 201, 1519, 3),
        /** id = <code>407</code>, name = <code>"identityTrafo"</code> */
        IDENTITYTRAFO("identityTrafo", 407, 2874, 1),
        /** id = <code>93</code>, name = <code>"implicitVariableExpr"</code> */
        IMPLICITVARIABLEEXPR("implicitVariableExpr", 93, 764, 1),
        /** id = <code>317</code>, name = <code>"includeAnnotationsPreference"</code> */
        INCLUDEANNOTATIONSPREFERENCE("includeAnnotationsPreference", 317, 2152, 8),
        /** id = <code>113</code>, name = <code>"indexOfMethodCallExpr"</code> */
        INDEXOFMETHODCALLEXPR("indexOfMethodCallExpr", 113, 951, 11),
        /** id = <code>59</code>, name = <code>"inlinecount"</code> */
        INLINECOUNT("inlinecount", 59, 463, 4),
        /** id = <code>92</code>, name = <code>"inscopeVariableExpr"</code> */
        INSCOPEVARIABLEEXPR("inscopeVariableExpr", 92, 761, 3),
        /** id = <code>184</code>, name = <code>"int"</code> */
        INT("int", 184, 1457, 6),
        /** id = <code>245</code>, name = <code>"int16Value"</code> */
        INT16VALUE("int16Value", 245, 1704, 5),
        /** id = <code>246</code>, name = <code>"int32Value"</code> */
        INT32VALUE("int32Value", 246, 1709, 5),
        /** id = <code>247</code>, name = <code>"int64Value"</code> */
        INT64VALUE("int64Value", 247, 1714, 5),
        /** id = <code>138</code>, name = <code>"intersectsMethodCallExpr"</code> */
        INTERSECTSMETHODCALLEXPR("intersectsMethodCallExpr", 138, 1139, 11),
        /** id = <code>347</code>, name = <code>"IP-literal"</code> */
        IP_LITERAL("IP-literal", 347, 2296, 6),
        /** id = <code>352</code>, name = <code>"IPv4address"</code> */
        IPV4ADDRESS("IPv4address", 352, 2412, 8),
        /** id = <code>349</code>, name = <code>"IPv6address"</code> */
        IPV6ADDRESS("IPv6address", 349, 2312, 92),
        /** id = <code>348</code>, name = <code>"IPvFuture"</code> */
        IPVFUTURE("IPvFuture", 348, 2302, 10),
        /** id = <code>375</code>, name = <code>"IRI-in-header"</code> */
        IRI_IN_HEADER("IRI-in-header", 375, 2626, 4),
        /** id = <code>376</code>, name = <code>"IRI-in-query"</code> */
        IRI_IN_QUERY("IRI-in-query", 376, 2630, 2),
        /** id = <code>157</code>, name = <code>"isofExpr"</code> */
        ISOFEXPR("isofExpr", 157, 1240, 13),
        /** id = <code>6</code>, name = <code>"keyPredicate"</code> */
        KEYPREDICATE("keyPredicate", 6, 91, 3),
        /** id = <code>11</code>, name = <code>"keyPropertyAlias"</code> */
        KEYPROPERTYALIAS("keyPropertyAlias", 11, 113, 1),
        /** id = <code>10</code>, name = <code>"keyPropertyValue"</code> */
        KEYPROPERTYVALUE("keyPropertyValue", 10, 112, 1),
        /** id = <code>9</code>, name = <code>"keyValuePair"</code> */
        KEYVALUEPAIR("keyValuePair", 9, 106, 6),
        /** id = <code>106</code>, name = <code>"lambdaPredicateExpr"</code> */
        LAMBDAPREDICATEEXPR("lambdaPredicateExpr", 106, 878, 1),
        /** id = <code>94</code>, name = <code>"lambdaVariableExpr"</code> */
        LAMBDAVARIABLEEXPR("lambdaVariableExpr", 94, 765, 1),
        /** id = <code>146</code>, name = <code>"leExpr"</code> */
        LEEXPR("leExpr", 146, 1187, 5),
        /** id = <code>112</code>, name = <code>"lengthMethodCallExpr"</code> */
        LENGTHMETHODCALLEXPR("lengthMethodCallExpr", 112, 944, 7),
        /** id = <code>52</code>, name = <code>"levels"</code> */
        LEVELS("levels", 52, 413, 7),
        /** id = <code>277</code>, name = <code>"lineStringData"</code> */
        LINESTRINGDATA("lineStringData", 277, 1942, 8),
        /** id = <code>276</code>, name = <code>"lineStringLiteral"</code> */
        LINESTRINGLITERAL("lineStringLiteral", 276, 1939, 3),
        /** id = <code>351</code>, name = <code>"ls32"</code> */
        LS32("ls32", 351, 2406, 6),
        /** id = <code>145</code>, name = <code>"ltExpr"</code> */
        LTEXPR("ltExpr", 145, 1182, 5),
        /** id = <code>131</code>, name = <code>"maxDateTimeMethodCallExpr"</code> */
        MAXDATETIMEMETHODCALLEXPR("maxDateTimeMethodCallExpr", 131, 1092, 4),
        /** id = <code>321</code>, name = <code>"maxpagesizePreference"</code> */
        MAXPAGESIZEPREFERENCE("maxpagesizePreference", 321, 2178, 8),
        /** id = <code>90</code>, name = <code>"memberExpr"</code> */
        MEMBEREXPR("memberExpr", 90, 727, 8),
        /** id = <code>107</code>, name = <code>"methodCallExpr"</code> */
        METHODCALLEXPR("methodCallExpr", 107, 879, 27),
        /** id = <code>130</code>, name = <code>"minDateTimeMethodCallExpr"</code> */
        MINDATETIMEMETHODCALLEXPR("minDateTimeMethodCallExpr", 130, 1088, 4),
        /** id = <code>264</code>, name = <code>"minute"</code> */
        MINUTE("minute", 264, 1889, 1),
        /** id = <code>123</code>, name = <code>"minuteMethodCallExpr"</code> */
        MINUTEMETHODCALLEXPR("minuteMethodCallExpr", 123, 1039, 7),
        /** id = <code>154</code>, name = <code>"modExpr"</code> */
        MODEXPR("modExpr", 154, 1227, 5),
        /** id = <code>261</code>, name = <code>"month"</code> */
        MONTH("month", 261, 1855, 10),
        /** id = <code>120</code>, name = <code>"monthMethodCallExpr"</code> */
        MONTHMETHODCALLEXPR("monthMethodCallExpr", 120, 1018, 7),
        /** id = <code>152</code>, name = <code>"mulExpr"</code> */
        MULEXPR("mulExpr", 152, 1217, 5),
        /** id = <code>280</code>, name = <code>"multiLineStringLiteral"</code> */
        MULTILINESTRINGLITERAL("multiLineStringLiteral", 280, 1958, 10),
        /** id = <code>283</code>, name = <code>"multiPointLiteral"</code> */
        MULTIPOINTLITERAL("multiPointLiteral", 283, 1976, 10),
        /** id = <code>286</code>, name = <code>"multiPolygonLiteral"</code> */
        MULTIPOLYGONLITERAL("multiPolygonLiteral", 286, 1994, 10),
        /** id = <code>176</code>, name = <code>"name-separator"</code> */
        NAME_SEPARATOR("name-separator", 176, 1400, 4),
        /** id = <code>191</code>, name = <code>"namespace"</code> */
        NAMESPACE("namespace", 191, 1501, 6),
        /** id = <code>192</code>, name = <code>"namespacePart"</code> */
        NAMESPACEPART("namespacePart", 192, 1507, 1),
        /** id = <code>240</code>, name = <code>"nanInfinity"</code> */
        NANINFINITY("nanInfinity", 240, 1673, 4),
        /** id = <code>213</code>, name = <code>"navigationProperty"</code> */
        NAVIGATIONPROPERTY("navigationProperty", 213, 1571, 3),
        /** id = <code>167</code>, name = <code>"navigationPropertyInUri"</code> */
        NAVIGATIONPROPERTYINURI("navigationPropertyInUri", 167, 1348, 3),
        /** id = <code>144</code>, name = <code>"neExpr"</code> */
        NEEXPR("neExpr", 144, 1177, 5),
        /** id = <code>155</code>, name = <code>"negateExpr"</code> */
        NEGATEEXPR("negateExpr", 155, 1232, 4),
        /** id = <code>156</code>, name = <code>"notExpr"</code> */
        NOTEXPR("notExpr", 156, 1236, 4),
        /** id = <code>132</code>, name = <code>"nowMethodCallExpr"</code> */
        NOWMETHODCALLEXPR("nowMethodCallExpr", 132, 1096, 4),
        /** id = <code>232</code>, name = <code>"null"</code> */
        NULL("null", 232, 1630, 7),
        /** id = <code>233</code>, name = <code>"nullValue"</code> */
        NULLVALUE("nullValue", 233, 1637, 1),
        /** id = <code>183</code>, name = <code>"numberInJSON"</code> */
        NUMBERINJSON("numberInJSON", 183, 1449, 8),
        /** id = <code>326</code>, name = <code>"obs-text"</code> */
        OBS_TEXT("obs-text", 326, 2203, 1),
        /** id = <code>308</code>, name = <code>"odata-entityid"</code> */
        ODATA_ENTITYID("odata-entityid", 308, 2099, 5),
        /** id = <code>309</code>, name = <code>"odata-isolation"</code> */
        ODATA_ISOLATION("odata-isolation", 309, 2104, 5),
        /** id = <code>310</code>, name = <code>"odata-maxversion"</code> */
        ODATA_MAXVERSION("odata-maxversion", 310, 2109, 5),
        /** id = <code>311</code>, name = <code>"odata-version"</code> */
        ODATA_VERSION("odata-version", 311, 2114, 5),
        /** id = <code>200</code>, name = <code>"odataIdentifier"</code> */
        ODATAIDENTIFIER("odataIdentifier", 200, 1515, 4),
        /** id = <code>3</code>, name = <code>"odataRelativeUri"</code> */
        ODATARELATIVEURI("odataRelativeUri", 3, 22, 20),
        /** id = <code>1</code>, name = <code>"odataUri"</code> */
        ODATAURI("odataUri", 1, 3, 4),
        /** id = <code>258</code>, name = <code>"oneToNine"</code> */
        ONETONINE("oneToNine", 258, 1824, 10),
        /** id = <code>338</code>, name = <code>"OPEN"</code> */
        OPEN("OPEN", 338, 2240, 3),
        /** id = <code>54</code>, name = <code>"orderby"</code> */
        ORDERBY("orderby", 54, 424, 8),
        /** id = <code>55</code>, name = <code>"orderbyItem"</code> */
        ORDERBYITEM("orderbyItem", 55, 432, 8),
        /** id = <code>142</code>, name = <code>"orExpr"</code> */
        OREXPR("orExpr", 142, 1167, 5),
        /** id = <code>366</code>, name = <code>"other-delims"</code> */
        OTHER_DELIMS("other-delims", 366, 2497, 8),
        /** id = <code>327</code>, name = <code>"OWS"</code> */
        OWS("OWS", 327, 2204, 6),
        /** id = <code>38</code>, name = <code>"parameterAlias"</code> */
        PARAMETERALIAS("parameterAlias", 38, 273, 3),
        /** id = <code>37</code>, name = <code>"parameterName"</code> */
        PARAMETERNAME("parameterName", 37, 272, 1),
        /** id = <code>74</code>, name = <code>"parameterNames"</code> */
        PARAMETERNAMES("parameterNames", 74, 567, 6),
        /** id = <code>77</code>, name = <code>"parameterValue"</code> */
        PARAMETERVALUE("parameterValue", 77, 582, 3),
        /** id = <code>140</code>, name = <code>"parenExpr"</code> */
        PARENEXPR("parenExpr", 140, 1156, 6),
        /** id = <code>355</code>, name = <code>"path-abempty"</code> */
        PATH_ABEMPTY("path-abempty", 355, 2441, 4),
        /** id = <code>356</code>, name = <code>"path-absolute"</code> */
        PATH_ABSOLUTE("path-absolute", 356, 2445, 9),
        /** id = <code>357</code>, name = <code>"path-rootless"</code> */
        PATH_ROOTLESS("path-rootless", 357, 2454, 6),
        /** id = <code>360</code>, name = <code>"pchar"</code> */
        PCHAR("pchar", 360, 2464, 6),
        /** id = <code>367</code>, name = <code>"pchar-no-SQUOTE"</code> */
        PCHAR_NO_SQUOTE("pchar-no-SQUOTE", 367, 2505, 9),
        /** id = <code>363</code>, name = <code>"pct-encoded"</code> */
        PCT_ENCODED("pct-encoded", 363, 2480, 4),
        /** id = <code>368</code>, name = <code>"pct-encoded-no-SQUOTE"</code> */
        PCT_ENCODED_NO_SQUOTE("pct-encoded-no-SQUOTE", 368, 2514, 28),
        /** id = <code>373</code>, name = <code>"pct-encoded-unescaped"</code> */
        PCT_ENCODED_UNESCAPED("pct-encoded-unescaped", 373, 2582, 37),
        /** id = <code>291</code>, name = <code>"pointData"</code> */
        POINTDATA("pointData", 291, 2021, 4),
        /** id = <code>290</code>, name = <code>"pointLiteral"</code> */
        POINTLITERAL("pointLiteral", 290, 2018, 3),
        /** id = <code>296</code>, name = <code>"polygonData"</code> */
        POLYGONDATA("polygonData", 296, 2040, 8),
        /** id = <code>295</code>, name = <code>"polygonLiteral"</code> */
        POLYGONLITERAL("polygonLiteral", 295, 2037, 3),
        /** id = <code>346</code>, name = <code>"port"</code> */
        PORT("port", 346, 2294, 2),
        /** id = <code>292</code>, name = <code>"positionLiteral"</code> */
        POSITIONLITERAL("positionLiteral", 292, 2025, 4),
        /** id = <code>312</code>, name = <code>"prefer"</code> */
        PREFER("prefer", 312, 2119, 9),
        /** id = <code>313</code>, name = <code>"preference"</code> */
        PREFERENCE("preference", 313, 2128, 10),
        /** id = <code>224</code>, name = <code>"primitiveColFunction"</code> */
        PRIMITIVECOLFUNCTION("primitiveColFunction", 224, 1590, 1),
        /** id = <code>230</code>, name = <code>"primitiveColFunctionImport"</code> */
        PRIMITIVECOLFUNCTIONIMPORT("primitiveColFunctionImport", 230, 1596, 1),
        /** id = <code>34</code>, name = <code>"primitiveColFunctionImportCall"</code> */
        PRIMITIVECOLFUNCTIONIMPORTCALL("primitiveColFunctionImportCall", 34, 253, 3),
        /** id = <code>163</code>, name = <code>"primitiveColInUri"</code> */
        PRIMITIVECOLINURI("primitiveColInUri", 163, 1314, 10),
        /** id = <code>209</code>, name = <code>"primitiveColProperty"</code> */
        PRIMITIVECOLPROPERTY("primitiveColProperty", 209, 1567, 1),
        /** id = <code>223</code>, name = <code>"primitiveFunction"</code> */
        PRIMITIVEFUNCTION("primitiveFunction", 223, 1589, 1),
        /** id = <code>229</code>, name = <code>"primitiveFunctionImport"</code> */
        PRIMITIVEFUNCTIONIMPORT("primitiveFunctionImport", 229, 1595, 1),
        /** id = <code>33</code>, name = <code>"primitiveFunctionImportCall"</code> */
        PRIMITIVEFUNCTIONIMPORTCALL("primitiveFunctionImportCall", 33, 250, 3),
        /** id = <code>207</code>, name = <code>"primitiveKeyProperty"</code> */
        PRIMITIVEKEYPROPERTY("primitiveKeyProperty", 207, 1565, 1),
        /** id = <code>231</code>, name = <code>"primitiveLiteral"</code> */
        PRIMITIVELITERAL("primitiveLiteral", 231, 1597, 33),
        /** id = <code>178</code>, name = <code>"primitiveLiteralInJSON"</code> */
        PRIMITIVELITERALINJSON("primitiveLiteralInJSON", 178, 1408, 6),
        /** id = <code>208</code>, name = <code>"primitiveNonKeyProperty"</code> */
        PRIMITIVENONKEYPROPERTY("primitiveNonKeyProperty", 208, 1566, 1),
        /** id = <code>206</code>, name = <code>"primitiveProperty"</code> */
        PRIMITIVEPROPERTY("primitiveProperty", 206, 1562, 3),
        /** id = <code>166</code>, name = <code>"primitivePropertyInUri"</code> */
        PRIMITIVEPROPERTYINURI("primitivePropertyInUri", 166, 1342, 6),
        /** id = <code>203</code>, name = <code>"primitiveTypeName"</code> */
        PRIMITIVETYPENAME("primitiveTypeName", 203, 1526, 25),
        /** id = <code>82</code>, name = <code>"propertyList"</code> */
        PROPERTYLIST("propertyList", 82, 643, 8),
        /** id = <code>83</code>, name = <code>"propertyListItem"</code> */
        PROPERTYLISTITEM("propertyListItem", 83, 651, 3),
        /** id = <code>84</code>, name = <code>"propertyListProperty"</code> */
        PROPERTYLISTPROPERTY("propertyListProperty", 84, 654, 15),
        /** id = <code>13</code>, name = <code>"propertyPath"</code> */
        PROPERTYPATH("propertyPath", 13, 127, 29),
        /** id = <code>91</code>, name = <code>"propertyPathExpr"</code> */
        PROPERTYPATHEXPR("propertyPathExpr", 91, 735, 26),
        /** id = <code>395</code>, name = <code>"propertyWithPath"</code> */
        PROPERTYWITHPATH("propertyWithPath", 395, 2734, 29),
        /** id = <code>181</code>, name = <code>"qchar-JSON-special"</code> */
        QCHAR_JSON_SPECIAL("qchar-JSON-special", 181, 1439, 7),
        /** id = <code>369</code>, name = <code>"qchar-no-AMP"</code> */
        QCHAR_NO_AMP("qchar-no-AMP", 369, 2542, 11),
        /** id = <code>374</code>, name = <code>"qchar-no-AMP-DQUOTE"</code> */
        QCHAR_NO_AMP_DQUOTE("qchar-no-AMP-DQUOTE", 374, 2619, 7),
        /** id = <code>370</code>, name = <code>"qchar-no-AMP-EQ"</code> */
        QCHAR_NO_AMP_EQ("qchar-no-AMP-EQ", 370, 2553, 10),
        /** id = <code>371</code>, name = <code>"qchar-no-AMP-EQ-AT-DOLLAR"</code> */
        QCHAR_NO_AMP_EQ_AT_DOLLAR("qchar-no-AMP-EQ-AT-DOLLAR", 371, 2563, 8),
        /** id = <code>372</code>, name = <code>"qchar-unescaped"</code> */
        QCHAR_UNESCAPED("qchar-unescaped", 372, 2571, 11),
        /** id = <code>72</code>, name = <code>"qualifiedActionName"</code> */
        QUALIFIEDACTIONNAME("qualifiedActionName", 72, 554, 4),
        /** id = <code>189</code>, name = <code>"qualifiedComplexTypeName"</code> */
        QUALIFIEDCOMPLEXTYPENAME("qualifiedComplexTypeName", 189, 1493, 4),
        /** id = <code>188</code>, name = <code>"qualifiedEntityTypeName"</code> */
        QUALIFIEDENTITYTYPENAME("qualifiedEntityTypeName", 188, 1489, 4),
        /** id = <code>190</code>, name = <code>"qualifiedEnumTypeName"</code> */
        QUALIFIEDENUMTYPENAME("qualifiedEnumTypeName", 190, 1497, 4),
        /** id = <code>73</code>, name = <code>"qualifiedFunctionName"</code> */
        QUALIFIEDFUNCTIONNAME("qualifiedFunctionName", 73, 558, 9),
        /** id = <code>187</code>, name = <code>"qualifiedTypeName"</code> */
        QUALIFIEDTYPENAME("qualifiedTypeName", 187, 1475, 14),
        /** id = <code>361</code>, name = <code>"query"</code> */
        QUERY("query", 361, 2470, 5),
        /** id = <code>41</code>, name = <code>"queryOption"</code> */
        QUERYOPTION("queryOption", 41, 291, 4),
        /** id = <code>40</code>, name = <code>"queryOptions"</code> */
        QUERYOPTIONS("queryOptions", 40, 285, 6),
        /** id = <code>175</code>, name = <code>"quotation-mark"</code> */
        QUOTATION_MARK("quotation-mark", 175, 1397, 3),
        /** id = <code>18</code>, name = <code>"ref"</code> */
        REF("ref", 18, 173, 1),
        /** id = <code>354</code>, name = <code>"reg-name"</code> */
        REG_NAME("reg-name", 354, 2436, 5),
        /** id = <code>4</code>, name = <code>"resourcePath"</code> */
        RESOURCEPATH("resourcePath", 4, 42, 36),
        /** id = <code>322</code>, name = <code>"respondAsyncPreference"</code> */
        RESPONDASYNCPREFERENCE("respondAsyncPreference", 322, 2186, 1),
        /** id = <code>323</code>, name = <code>"returnPreference"</code> */
        RETURNPREFERENCE("returnPreference", 323, 2187, 8),
        /** id = <code>297</code>, name = <code>"ringLiteral"</code> */
        RINGLITERAL("ringLiteral", 297, 2048, 8),
        /** id = <code>406</code>, name = <code>"rollupSpec"</code> */
        ROLLUPSPEC("rollupSpec", 406, 2859, 15),
        /** id = <code>88</code>, name = <code>"rootExpr"</code> */
        ROOTEXPR("rootExpr", 88, 710, 9),
        /** id = <code>170</code>, name = <code>"rootExprCol"</code> */
        ROOTEXPRCOL("rootExprCol", 170, 1363, 10),
        /** id = <code>133</code>, name = <code>"roundMethodCallExpr"</code> */
        ROUNDMETHODCALLEXPR("roundMethodCallExpr", 133, 1100, 7),
        /** id = <code>328</code>, name = <code>"RWS"</code> */
        RWS("RWS", 328, 2210, 6),
        /** id = <code>244</code>, name = <code>"sbyteValue"</code> */
        SBYTEVALUE("sbyteValue", 244, 1699, 5),
        /** id = <code>342</code>, name = <code>"scheme"</code> */
        SCHEME("scheme", 342, 2265, 9),
        /** id = <code>60</code>, name = <code>"search"</code> */
        SEARCH("search", 60, 467, 5),
        /** id = <code>63</code>, name = <code>"searchAndExpr"</code> */
        SEARCHANDEXPR("searchAndExpr", 63, 490, 7),
        /** id = <code>61</code>, name = <code>"searchExpr"</code> */
        SEARCHEXPR("searchExpr", 61, 472, 13),
        /** id = <code>62</code>, name = <code>"searchOrExpr"</code> */
        SEARCHOREXPR("searchOrExpr", 62, 485, 5),
        /** id = <code>65</code>, name = <code>"searchPhrase"</code> */
        SEARCHPHRASE("searchPhrase", 65, 505, 5),
        /** id = <code>64</code>, name = <code>"searchTerm"</code> */
        SEARCHTERM("searchTerm", 64, 497, 8),
        /** id = <code>66</code>, name = <code>"searchWord"</code> */
        SEARCHWORD("searchWord", 66, 510, 2),
        /** id = <code>265</code>, name = <code>"second"</code> */
        SECOND("second", 265, 1890, 1),
        /** id = <code>124</code>, name = <code>"secondMethodCallExpr"</code> */
        SECONDMETHODCALLEXPR("secondMethodCallExpr", 124, 1046, 7),
        /** id = <code>358</code>, name = <code>"segment"</code> */
        SEGMENT("segment", 358, 2460, 2),
        /** id = <code>359</code>, name = <code>"segment-nz"</code> */
        SEGMENT_NZ("segment-nz", 359, 2462, 2),
        /** id = <code>67</code>, name = <code>"select"</code> */
        SELECT("select", 67, 512, 8),
        /** id = <code>68</code>, name = <code>"selectItem"</code> */
        SELECTITEM("selectItem", 68, 520, 12),
        /** id = <code>70</code>, name = <code>"selectPath"</code> */
        SELECTPATH("selectPath", 70, 542, 8),
        /** id = <code>69</code>, name = <code>"selectProperty"</code> */
        SELECTPROPERTY("selectProperty", 69, 532, 10),
        /** id = <code>335</code>, name = <code>"SEMI"</code> */
        SEMI("SEMI", 335, 2231, 3),
        /** id = <code>2</code>, name = <code>"serviceRoot"</code> */
        SERVICEROOT("serviceRoot", 2, 7, 15),
        /** id = <code>334</code>, name = <code>"SIGN"</code> */
        SIGN("SIGN", 334, 2227, 4),
        /** id = <code>7</code>, name = <code>"simpleKey"</code> */
        SIMPLEKEY("simpleKey", 7, 94, 4),
        /** id = <code>269</code>, name = <code>"singleEnumValue"</code> */
        SINGLEENUMVALUE("singleEnumValue", 269, 1904, 3),
        /** id = <code>12</code>, name = <code>"singleNavigation"</code> */
        SINGLENAVIGATION("singleNavigation", 12, 114, 13),
        /** id = <code>96</code>, name = <code>"singleNavigationExpr"</code> */
        SINGLENAVIGATIONEXPR("singleNavigationExpr", 96, 777, 3),
        /** id = <code>168</code>, name = <code>"singleNavPropInJSON"</code> */
        SINGLENAVPROPINJSON("singleNavPropInJSON", 168, 1351, 6),
        /** id = <code>15</code>, name = <code>"singlePath"</code> */
        SINGLEPATH("singlePath", 15, 159, 3),
        /** id = <code>99</code>, name = <code>"singlePathExpr"</code> */
        SINGLEPATHEXPR("singlePathExpr", 99, 800, 3),
        /** id = <code>194</code>, name = <code>"singletonEntity"</code> */
        SINGLETONENTITY("singletonEntity", 194, 1509, 1),
        /** id = <code>239</code>, name = <code>"singleValue"</code> */
        SINGLEVALUE("singleValue", 239, 1672, 1),
        /** id = <code>56</code>, name = <code>"skip"</code> */
        SKIP("skip", 56, 440, 5),
        /** id = <code>75</code>, name = <code>"skiptoken"</code> */
        SKIPTOKEN("skiptoken", 75, 573, 5),
        /** id = <code>382</code>, name = <code>"SP"</code> */
        SP("SP", 382, 2647, 1),
        /** id = <code>337</code>, name = <code>"SQUOTE"</code> */
        SQUOTE("SQUOTE", 337, 2237, 3),
        /** id = <code>249</code>, name = <code>"SQUOTE-in-string"</code> */
        SQUOTE_IN_STRING("SQUOTE-in-string", 249, 1726, 3),
        /** id = <code>289</code>, name = <code>"sridLiteral"</code> */
        SRIDLITERAL("sridLiteral", 289, 2012, 6),
        /** id = <code>336</code>, name = <code>"STAR"</code> */
        STAR("STAR", 336, 2234, 3),
        /** id = <code>110</code>, name = <code>"startsWithMethodCallExpr"</code> */
        STARTSWITHMETHODCALLEXPR("startsWithMethodCallExpr", 110, 922, 11),
        /** id = <code>212</code>, name = <code>"streamProperty"</code> */
        STREAMPROPERTY("streamProperty", 212, 1570, 1),
        /** id = <code>248</code>, name = <code>"string"</code> */
        STRING("string", 248, 1719, 7),
        /** id = <code>179</code>, name = <code>"stringInJSON"</code> */
        STRINGINJSON("stringInJSON", 179, 1414, 5),
        /** id = <code>396</code>, name = <code>"structuralProperty"</code> */
        STRUCTURALPROPERTY("structuralProperty", 396, 2763, 6),
        /** id = <code>365</code>, name = <code>"sub-delims"</code> */
        SUB_DELIMS("sub-delims", 365, 2491, 6),
        /** id = <code>151</code>, name = <code>"subExpr"</code> */
        SUBEXPR("subExpr", 151, 1212, 5),
        /** id = <code>114</code>, name = <code>"substringMethodCallExpr"</code> */
        SUBSTRINGMETHODCALLEXPR("substringMethodCallExpr", 114, 962, 17),
        /** id = <code>45</code>, name = <code>"systemQueryOption"</code> */
        SYSTEMQUERYOPTION("systemQueryOption", 45, 314, 13),
        /** id = <code>199</code>, name = <code>"termName"</code> */
        TERMNAME("termName", 199, 1514, 1),
        /** id = <code>128</code>, name = <code>"timeMethodCallExpr"</code> */
        TIMEMETHODCALLEXPR("timeMethodCallExpr", 128, 1074, 7),
        /** id = <code>256</code>, name = <code>"timeOfDay"</code> */
        TIMEOFDAY("timeOfDay", 256, 1807, 5),
        /** id = <code>257</code>, name = <code>"timeOfDayValue"</code> */
        TIMEOFDAYVALUE("timeOfDayValue", 257, 1812, 12),
        /** id = <code>115</code>, name = <code>"toLowerMethodCallExpr"</code> */
        TOLOWERMETHODCALLEXPR("toLowerMethodCallExpr", 115, 979, 7),
        /** id = <code>57</code>, name = <code>"top"</code> */
        TOP("top", 57, 445, 5),
        /** id = <code>408</code>, name = <code>"topcountTrafo"</code> */
        TOPCOUNTTRAFO("topcountTrafo", 408, 2875, 11),
        /** id = <code>409</code>, name = <code>"toppercentTrafo"</code> */
        TOPPERCENTTRAFO("toppercentTrafo", 409, 2886, 11),
        /** id = <code>410</code>, name = <code>"topsumTrafo"</code> */
        TOPSUMTRAFO("topsumTrafo", 410, 2897, 11),
        /** id = <code>129</code>, name = <code>"totalOffsetMinutesMethodCallExpr"</code> */
        TOTALOFFSETMINUTESMETHODCALLEXPR("totalOffsetMinutesMethodCallExpr", 129, 1081, 7),
        /** id = <code>126</code>, name = <code>"totalsecondsMethodCallExpr"</code> */
        TOTALSECONDSMETHODCALLEXPR("totalsecondsMethodCallExpr", 126, 1060, 7),
        /** id = <code>116</code>, name = <code>"toUpperMethodCallExpr"</code> */
        TOUPPERMETHODCALLEXPR("toUpperMethodCallExpr", 116, 986, 7),
        /** id = <code>324</code>, name = <code>"trackChangesPreference"</code> */
        TRACKCHANGESPREFERENCE("trackChangesPreference", 324, 2195, 1),
        /** id = <code>117</code>, name = <code>"trimMethodCallExpr"</code> */
        TRIMMETHODCALLEXPR("trimMethodCallExpr", 117, 993, 7),
        /** id = <code>364</code>, name = <code>"unreserved"</code> */
        UNRESERVED("unreserved", 364, 2484, 7),
        /** id = <code>340</code>, name = <code>"URI"</code> */
        URI("URI", 340, 2246, 12),
        /** id = <code>344</code>, name = <code>"userinfo"</code> */
        USERINFO("userinfo", 344, 2284, 6),
        /** id = <code>19</code>, name = <code>"value"</code> */
        VALUE("value", 19, 174, 1),
        /** id = <code>177</code>, name = <code>"value-separator"</code> */
        VALUE_SEPARATOR("value-separator", 177, 1404, 4),
        /** id = <code>384</code>, name = <code>"VCHAR"</code> */
        VCHAR("VCHAR", 384, 2649, 1),
        /** id = <code>325</code>, name = <code>"waitPreference"</code> */
        WAITPREFERENCE("waitPreference", 325, 2196, 7),
        /** id = <code>260</code>, name = <code>"year"</code> */
        YEAR("year", 260, 1843, 12),
        /** id = <code>119</code>, name = <code>"yearMethodCallExpr"</code> */
        YEARMETHODCALLEXPR("yearMethodCallExpr", 119, 1011, 7),
        /** id = <code>259</code>, name = <code>"zeroToFiftyNine"</code> */
        ZEROTOFIFTYNINE("zeroToFiftyNine", 259, 1834, 9);
        private String name;
        private int id;
        private int offset;
        private int count;
        RuleNames(String string, int id, int offset, int count){
            this.name = string;
            this.id = id;
            this.offset = offset;
            this.count = count;
        }
        /** Associates the enum with the original grammar name of the rule it represents.
        * @return the original grammar rule name. */
        public  String ruleName(){return name;}
        /** Associates the enum with an identifier for the grammar rule it represents.
        * @return the rule name identifier. */
        public  int    ruleID(){return id;}
        private int    opcodeOffset(){return offset;}
        private int    opcodeCount(){return count;}
    }

    // UDT name enum
    /** The number of UDTs in the grammar */
    public static int udtCount = 0;
    /** This enum provides easy to remember enum constants for locating the UDT identifiers and names.
     * The enum constants have the same spelling as the UDT names rendered in all caps with underscores replacing hyphens. */
    public enum UdtNames{
    }

    // private
    private static GrammarUnderTest factoryInstance = null;
    private GrammarUnderTest(Rule[] rules, Udt[] udts, Opcode[] opcodes){
        super(rules, udts, opcodes);
    }

    private static Rule[] getRules(){
     Rule[] rules = new Rule[411];
        for(RuleNames r : RuleNames.values()){
            rules[r.ruleID()] = getRule(r.ruleID(), r.ruleName(), r.opcodeOffset(), r.opcodeCount());
        }
        return rules;
    }

    private static Udt[] getUdts(){
     Udt[] udts = new Udt[0];
        return udts;
    }

        // opcodes
    private static Opcode[] getOpcodes(){
     Opcode[] op = new Opcode[2908];
        {int[] a = {1,2}; op[0] = getOpcodeAlt(a);}
        op[1] = getOpcodeRnm(1, 3); // odataUri
        op[2] = getOpcodeRnm(307, 2093); // header
        {int[] a = {4,5}; op[3] = getOpcodeCat(a);}
        op[4] = getOpcodeRnm(2, 7); // serviceRoot
        op[5] = getOpcodeRep((char)0, (char)1, 6);
        op[6] = getOpcodeRnm(3, 22); // odataRelativeUri
        {int[] a = {8,11,12,13,17,18}; op[7] = getOpcodeCat(a);}
        {int[] a = {9,10}; op[8] = getOpcodeAlt(a);}
        {char[] a = {104,116,116,112,115}; op[9] = getOpcodeTls(a);}
        {char[] a = {104,116,116,112}; op[10] = getOpcodeTls(a);}
        {char[] a = {58,47,47}; op[11] = getOpcodeTls(a);}
        op[12] = getOpcodeRnm(345, 2290); // host
        op[13] = getOpcodeRep((char)0, (char)1, 14);
        {int[] a = {15,16}; op[14] = getOpcodeCat(a);}
        {char[] a = {58}; op[15] = getOpcodeTls(a);}
        op[16] = getOpcodeRnm(346, 2294); // port
        {char[] a = {47}; op[17] = getOpcodeTls(a);}
        op[18] = getOpcodeRep((char)0, Character.MAX_VALUE, 19);
        {int[] a = {20,21}; op[19] = getOpcodeCat(a);}
        op[20] = getOpcodeRnm(359, 2462); // segment-nz
        {char[] a = {47}; op[21] = getOpcodeTls(a);}
        {int[] a = {23,24,28,36}; op[22] = getOpcodeAlt(a);}
        {char[] a = {36,98,97,116,99,104}; op[23] = getOpcodeTbs(a);}
        {int[] a = {25,26,27}; op[24] = getOpcodeCat(a);}
        {char[] a = {36,101,110,116,105,116,121}; op[25] = getOpcodeTbs(a);}
        {char[] a = {63}; op[26] = getOpcodeTls(a);}
        op[27] = getOpcodeRnm(42, 295); // entityOptions
        {int[] a = {29,30,34}; op[28] = getOpcodeCat(a);}
        {char[] a = {36,109,101,116,97,100,97,116,97}; op[29] = getOpcodeTbs(a);}
        op[30] = getOpcodeRep((char)0, (char)1, 31);
        {int[] a = {32,33}; op[31] = getOpcodeCat(a);}
        {char[] a = {63}; op[32] = getOpcodeTls(a);}
        op[33] = getOpcodeRnm(58, 450); // format
        op[34] = getOpcodeRep((char)0, (char)1, 35);
        op[35] = getOpcodeRnm(81, 597); // contextFragment
        {int[] a = {37,38}; op[36] = getOpcodeCat(a);}
        op[37] = getOpcodeRnm(4, 42); // resourcePath
        op[38] = getOpcodeRep((char)0, (char)1, 39);
        {int[] a = {40,41}; op[39] = getOpcodeCat(a);}
        {char[] a = {63}; op[40] = getOpcodeTls(a);}
        op[41] = getOpcodeRnm(40, 285); // queryOptions
        {int[] a = {43,47,51,52,56,60,64,68,72,76,77}; op[42] = getOpcodeAlt(a);}
        {int[] a = {44,45}; op[43] = getOpcodeCat(a);}
        op[44] = getOpcodeRnm(193, 1508); // entitySetName
        op[45] = getOpcodeRep((char)0, (char)1, 46);
        op[46] = getOpcodeRnm(5, 78); // collectionNavigation
        {int[] a = {48,49}; op[47] = getOpcodeCat(a);}
        op[48] = getOpcodeRnm(194, 1509); // singletonEntity
        op[49] = getOpcodeRep((char)0, (char)1, 50);
        op[50] = getOpcodeRnm(12, 114); // singleNavigation
        op[51] = getOpcodeRnm(21, 203); // actionImportCall
        {int[] a = {53,54}; op[52] = getOpcodeCat(a);}
        op[53] = getOpcodeRnm(30, 241); // entityColFunctionImportCall
        op[54] = getOpcodeRep((char)0, (char)1, 55);
        op[55] = getOpcodeRnm(5, 78); // collectionNavigation
        {int[] a = {57,58}; op[56] = getOpcodeCat(a);}
        op[57] = getOpcodeRnm(29, 238); // entityFunctionImportCall
        op[58] = getOpcodeRep((char)0, (char)1, 59);
        op[59] = getOpcodeRnm(12, 114); // singleNavigation
        {int[] a = {61,62}; op[60] = getOpcodeCat(a);}
        op[61] = getOpcodeRnm(32, 247); // complexColFunctionImportCall
        op[62] = getOpcodeRep((char)0, (char)1, 63);
        op[63] = getOpcodeRnm(14, 156); // collectionPath
        {int[] a = {65,66}; op[64] = getOpcodeCat(a);}
        op[65] = getOpcodeRnm(31, 244); // complexFunctionImportCall
        op[66] = getOpcodeRep((char)0, (char)1, 67);
        op[67] = getOpcodeRnm(16, 162); // complexPath
        {int[] a = {69,70}; op[68] = getOpcodeCat(a);}
        op[69] = getOpcodeRnm(34, 253); // primitiveColFunctionImportCall
        op[70] = getOpcodeRep((char)0, (char)1, 71);
        op[71] = getOpcodeRnm(14, 156); // collectionPath
        {int[] a = {73,74}; op[72] = getOpcodeCat(a);}
        op[73] = getOpcodeRnm(33, 250); // primitiveFunctionImportCall
        op[74] = getOpcodeRep((char)0, (char)1, 75);
        op[75] = getOpcodeRnm(15, 159); // singlePath
        op[76] = getOpcodeRnm(39, 276); // crossjoin
        {char[] a = {36,97,108,108}; op[77] = getOpcodeTbs(a);}
        {int[] a = {79,83}; op[78] = getOpcodeCat(a);}
        op[79] = getOpcodeRep((char)0, (char)1, 80);
        {int[] a = {81,82}; op[80] = getOpcodeCat(a);}
        {char[] a = {47}; op[81] = getOpcodeTls(a);}
        op[82] = getOpcodeRnm(188, 1489); // qualifiedEntityTypeName
        op[83] = getOpcodeRep((char)0, (char)1, 84);
        {int[] a = {85,89,90}; op[84] = getOpcodeAlt(a);}
        {int[] a = {86,87}; op[85] = getOpcodeCat(a);}
        op[86] = getOpcodeRnm(6, 91); // keyPredicate
        op[87] = getOpcodeRep((char)0, (char)1, 88);
        op[88] = getOpcodeRnm(12, 114); // singleNavigation
        op[89] = getOpcodeRnm(14, 156); // collectionPath
        op[90] = getOpcodeRnm(18, 173); // ref
        {int[] a = {92,93}; op[91] = getOpcodeAlt(a);}
        op[92] = getOpcodeRnm(7, 94); // simpleKey
        op[93] = getOpcodeRnm(8, 98); // compoundKey
        {int[] a = {95,96,97}; op[94] = getOpcodeCat(a);}
        op[95] = getOpcodeRnm(338, 2240); // OPEN
        op[96] = getOpcodeRnm(10, 112); // keyPropertyValue
        op[97] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {99,100,101,105}; op[98] = getOpcodeCat(a);}
        op[99] = getOpcodeRnm(338, 2240); // OPEN
        op[100] = getOpcodeRnm(9, 106); // keyValuePair
        op[101] = getOpcodeRep((char)0, Character.MAX_VALUE, 102);
        {int[] a = {103,104}; op[102] = getOpcodeCat(a);}
        op[103] = getOpcodeRnm(332, 2223); // COMMA
        op[104] = getOpcodeRnm(9, 106); // keyValuePair
        op[105] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {107,110,111}; op[106] = getOpcodeCat(a);}
        {int[] a = {108,109}; op[107] = getOpcodeAlt(a);}
        op[108] = getOpcodeRnm(207, 1565); // primitiveKeyProperty
        op[109] = getOpcodeRnm(11, 113); // keyPropertyAlias
        op[110] = getOpcodeRnm(333, 2226); // EQ
        op[111] = getOpcodeRnm(10, 112); // keyPropertyValue
        op[112] = getOpcodeRnm(231, 1597); // primitiveLiteral
        op[113] = getOpcodeRnm(200, 1515); // odataIdentifier
        {int[] a = {115,119}; op[114] = getOpcodeCat(a);}
        op[115] = getOpcodeRep((char)0, (char)1, 116);
        {int[] a = {117,118}; op[116] = getOpcodeCat(a);}
        {char[] a = {47}; op[117] = getOpcodeTls(a);}
        op[118] = getOpcodeRnm(188, 1489); // qualifiedEntityTypeName
        op[119] = getOpcodeRep((char)0, (char)1, 120);
        {int[] a = {121,124,125,126}; op[120] = getOpcodeAlt(a);}
        {int[] a = {122,123}; op[121] = getOpcodeCat(a);}
        {char[] a = {47}; op[122] = getOpcodeTls(a);}
        op[123] = getOpcodeRnm(13, 127); // propertyPath
        op[124] = getOpcodeRnm(20, 175); // boundOperation
        op[125] = getOpcodeRnm(18, 173); // ref
        op[126] = getOpcodeRnm(19, 174); // value
        {int[] a = {128,132,136,140,144,148,152}; op[127] = getOpcodeAlt(a);}
        {int[] a = {129,130}; op[128] = getOpcodeCat(a);}
        op[129] = getOpcodeRnm(215, 1575); // entityColNavigationProperty
        op[130] = getOpcodeRep((char)0, (char)1, 131);
        op[131] = getOpcodeRnm(5, 78); // collectionNavigation
        {int[] a = {133,134}; op[132] = getOpcodeCat(a);}
        op[133] = getOpcodeRnm(214, 1574); // entityNavigationProperty
        op[134] = getOpcodeRep((char)0, (char)1, 135);
        op[135] = getOpcodeRnm(12, 114); // singleNavigation
        {int[] a = {137,138}; op[136] = getOpcodeCat(a);}
        op[137] = getOpcodeRnm(211, 1569); // complexColProperty
        op[138] = getOpcodeRep((char)0, (char)1, 139);
        op[139] = getOpcodeRnm(14, 156); // collectionPath
        {int[] a = {141,142}; op[140] = getOpcodeCat(a);}
        op[141] = getOpcodeRnm(210, 1568); // complexProperty
        op[142] = getOpcodeRep((char)0, (char)1, 143);
        op[143] = getOpcodeRnm(16, 162); // complexPath
        {int[] a = {145,146}; op[144] = getOpcodeCat(a);}
        op[145] = getOpcodeRnm(209, 1567); // primitiveColProperty
        op[146] = getOpcodeRep((char)0, (char)1, 147);
        op[147] = getOpcodeRnm(14, 156); // collectionPath
        {int[] a = {149,150}; op[148] = getOpcodeCat(a);}
        op[149] = getOpcodeRnm(206, 1562); // primitiveProperty
        op[150] = getOpcodeRep((char)0, (char)1, 151);
        op[151] = getOpcodeRnm(15, 159); // singlePath
        {int[] a = {153,154}; op[152] = getOpcodeCat(a);}
        op[153] = getOpcodeRnm(212, 1570); // streamProperty
        op[154] = getOpcodeRep((char)0, (char)1, 155);
        op[155] = getOpcodeRnm(20, 175); // boundOperation
        {int[] a = {157,158}; op[156] = getOpcodeAlt(a);}
        op[157] = getOpcodeRnm(17, 172); // count
        op[158] = getOpcodeRnm(20, 175); // boundOperation
        {int[] a = {160,161}; op[159] = getOpcodeAlt(a);}
        op[160] = getOpcodeRnm(19, 174); // value
        op[161] = getOpcodeRnm(20, 175); // boundOperation
        {int[] a = {163,167}; op[162] = getOpcodeCat(a);}
        op[163] = getOpcodeRep((char)0, (char)1, 164);
        {int[] a = {165,166}; op[164] = getOpcodeCat(a);}
        {char[] a = {47}; op[165] = getOpcodeTls(a);}
        op[166] = getOpcodeRnm(189, 1493); // qualifiedComplexTypeName
        {int[] a = {168,171}; op[167] = getOpcodeAlt(a);}
        {int[] a = {169,170}; op[168] = getOpcodeCat(a);}
        {char[] a = {47}; op[169] = getOpcodeTls(a);}
        op[170] = getOpcodeRnm(13, 127); // propertyPath
        op[171] = getOpcodeRnm(20, 175); // boundOperation
        {char[] a = {47,36,99,111,117,110,116}; op[172] = getOpcodeTbs(a);}
        {char[] a = {47,36,114,101,102}; op[173] = getOpcodeTbs(a);}
        {char[] a = {47,36,118,97,108,117,101}; op[174] = getOpcodeTbs(a);}
        {int[] a = {176,177}; op[175] = getOpcodeCat(a);}
        {char[] a = {47}; op[176] = getOpcodeTls(a);}
        {int[] a = {178,179,183,187,191,195,199}; op[177] = getOpcodeAlt(a);}
        op[178] = getOpcodeRnm(22, 204); // boundActionCall
        {int[] a = {180,181}; op[179] = getOpcodeCat(a);}
        op[180] = getOpcodeRnm(24, 213); // boundEntityColFuncCall
        op[181] = getOpcodeRep((char)0, (char)1, 182);
        op[182] = getOpcodeRnm(5, 78); // collectionNavigation
        {int[] a = {184,185}; op[183] = getOpcodeCat(a);}
        op[184] = getOpcodeRnm(23, 208); // boundEntityFuncCall
        op[185] = getOpcodeRep((char)0, (char)1, 186);
        op[186] = getOpcodeRnm(12, 114); // singleNavigation
        {int[] a = {188,189}; op[187] = getOpcodeCat(a);}
        op[188] = getOpcodeRnm(26, 223); // boundComplexColFuncCall
        op[189] = getOpcodeRep((char)0, (char)1, 190);
        op[190] = getOpcodeRnm(14, 156); // collectionPath
        {int[] a = {192,193}; op[191] = getOpcodeCat(a);}
        op[192] = getOpcodeRnm(25, 218); // boundComplexFuncCall
        op[193] = getOpcodeRep((char)0, (char)1, 194);
        op[194] = getOpcodeRnm(16, 162); // complexPath
        {int[] a = {196,197}; op[195] = getOpcodeCat(a);}
        op[196] = getOpcodeRnm(28, 233); // boundPrimitiveColFuncCall
        op[197] = getOpcodeRep((char)0, (char)1, 198);
        op[198] = getOpcodeRnm(14, 156); // collectionPath
        {int[] a = {200,201}; op[199] = getOpcodeCat(a);}
        op[200] = getOpcodeRnm(27, 228); // boundPrimitiveFuncCall
        op[201] = getOpcodeRep((char)0, (char)1, 202);
        op[202] = getOpcodeRnm(15, 159); // singlePath
        op[203] = getOpcodeRnm(217, 1577); // actionImport
        {int[] a = {205,206,207}; op[204] = getOpcodeCat(a);}
        op[205] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[206] = getOpcodeTls(a);}
        op[207] = getOpcodeRnm(216, 1576); // action
        {int[] a = {209,210,211,212}; op[208] = getOpcodeCat(a);}
        op[209] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[210] = getOpcodeTls(a);}
        op[211] = getOpcodeRnm(219, 1585); // entityFunction
        op[212] = getOpcodeRnm(35, 256); // functionParameters
        {int[] a = {214,215,216,217}; op[213] = getOpcodeCat(a);}
        op[214] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[215] = getOpcodeTls(a);}
        op[216] = getOpcodeRnm(220, 1586); // entityColFunction
        op[217] = getOpcodeRnm(35, 256); // functionParameters
        {int[] a = {219,220,221,222}; op[218] = getOpcodeCat(a);}
        op[219] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[220] = getOpcodeTls(a);}
        op[221] = getOpcodeRnm(221, 1587); // complexFunction
        op[222] = getOpcodeRnm(35, 256); // functionParameters
        {int[] a = {224,225,226,227}; op[223] = getOpcodeCat(a);}
        op[224] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[225] = getOpcodeTls(a);}
        op[226] = getOpcodeRnm(222, 1588); // complexColFunction
        op[227] = getOpcodeRnm(35, 256); // functionParameters
        {int[] a = {229,230,231,232}; op[228] = getOpcodeCat(a);}
        op[229] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[230] = getOpcodeTls(a);}
        op[231] = getOpcodeRnm(223, 1589); // primitiveFunction
        op[232] = getOpcodeRnm(35, 256); // functionParameters
        {int[] a = {234,235,236,237}; op[233] = getOpcodeCat(a);}
        op[234] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[235] = getOpcodeTls(a);}
        op[236] = getOpcodeRnm(224, 1590); // primitiveColFunction
        op[237] = getOpcodeRnm(35, 256); // functionParameters
        {int[] a = {239,240}; op[238] = getOpcodeCat(a);}
        op[239] = getOpcodeRnm(225, 1591); // entityFunctionImport
        op[240] = getOpcodeRnm(35, 256); // functionParameters
        {int[] a = {242,243}; op[241] = getOpcodeCat(a);}
        op[242] = getOpcodeRnm(226, 1592); // entityColFunctionImport
        op[243] = getOpcodeRnm(35, 256); // functionParameters
        {int[] a = {245,246}; op[244] = getOpcodeCat(a);}
        op[245] = getOpcodeRnm(227, 1593); // complexFunctionImport
        op[246] = getOpcodeRnm(35, 256); // functionParameters
        {int[] a = {248,249}; op[247] = getOpcodeCat(a);}
        op[248] = getOpcodeRnm(228, 1594); // complexColFunctionImport
        op[249] = getOpcodeRnm(35, 256); // functionParameters
        {int[] a = {251,252}; op[250] = getOpcodeCat(a);}
        op[251] = getOpcodeRnm(229, 1595); // primitiveFunctionImport
        op[252] = getOpcodeRnm(35, 256); // functionParameters
        {int[] a = {254,255}; op[253] = getOpcodeCat(a);}
        op[254] = getOpcodeRnm(230, 1596); // primitiveColFunctionImport
        op[255] = getOpcodeRnm(35, 256); // functionParameters
        {int[] a = {257,258,265}; op[256] = getOpcodeCat(a);}
        op[257] = getOpcodeRnm(338, 2240); // OPEN
        op[258] = getOpcodeRep((char)0, (char)1, 259);
        {int[] a = {260,261}; op[259] = getOpcodeCat(a);}
        op[260] = getOpcodeRnm(36, 266); // functionParameter
        op[261] = getOpcodeRep((char)0, Character.MAX_VALUE, 262);
        {int[] a = {263,264}; op[262] = getOpcodeCat(a);}
        op[263] = getOpcodeRnm(332, 2223); // COMMA
        op[264] = getOpcodeRnm(36, 266); // functionParameter
        op[265] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {267,268,269}; op[266] = getOpcodeCat(a);}
        op[267] = getOpcodeRnm(37, 272); // parameterName
        op[268] = getOpcodeRnm(333, 2226); // EQ
        {int[] a = {270,271}; op[269] = getOpcodeAlt(a);}
        op[270] = getOpcodeRnm(38, 273); // parameterAlias
        op[271] = getOpcodeRnm(231, 1597); // primitiveLiteral
        op[272] = getOpcodeRnm(200, 1515); // odataIdentifier
        {int[] a = {274,275}; op[273] = getOpcodeCat(a);}
        op[274] = getOpcodeRnm(330, 2217); // AT
        op[275] = getOpcodeRnm(200, 1515); // odataIdentifier
        {int[] a = {277,278,279,280,284}; op[276] = getOpcodeCat(a);}
        {char[] a = {36,99,114,111,115,115,106,111,105,110}; op[277] = getOpcodeTbs(a);}
        op[278] = getOpcodeRnm(338, 2240); // OPEN
        op[279] = getOpcodeRnm(193, 1508); // entitySetName
        op[280] = getOpcodeRep((char)0, Character.MAX_VALUE, 281);
        {int[] a = {282,283}; op[281] = getOpcodeCat(a);}
        op[282] = getOpcodeRnm(332, 2223); // COMMA
        op[283] = getOpcodeRnm(193, 1508); // entitySetName
        op[284] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {286,287}; op[285] = getOpcodeCat(a);}
        op[286] = getOpcodeRnm(41, 291); // queryOption
        op[287] = getOpcodeRep((char)0, Character.MAX_VALUE, 288);
        {int[] a = {289,290}; op[288] = getOpcodeCat(a);}
        {char[] a = {38}; op[289] = getOpcodeTls(a);}
        op[290] = getOpcodeRnm(41, 291); // queryOption
        {int[] a = {292,293,294}; op[291] = getOpcodeAlt(a);}
        op[292] = getOpcodeRnm(45, 314); // systemQueryOption
        op[293] = getOpcodeRnm(76, 578); // aliasAndValue
        op[294] = getOpcodeRnm(78, 585); // customQueryOption
        {int[] a = {296,300,301}; op[295] = getOpcodeCat(a);}
        op[296] = getOpcodeRep((char)0, Character.MAX_VALUE, 297);
        {int[] a = {298,299}; op[297] = getOpcodeCat(a);}
        op[298] = getOpcodeRnm(43, 305); // entityOption
        {char[] a = {38}; op[299] = getOpcodeTls(a);}
        op[300] = getOpcodeRnm(44, 310); // id
        op[301] = getOpcodeRep((char)0, Character.MAX_VALUE, 302);
        {int[] a = {303,304}; op[302] = getOpcodeCat(a);}
        {char[] a = {38}; op[303] = getOpcodeTls(a);}
        op[304] = getOpcodeRnm(43, 305); // entityOption
        {int[] a = {306,307,308,309}; op[305] = getOpcodeAlt(a);}
        op[306] = getOpcodeRnm(46, 327); // expand
        op[307] = getOpcodeRnm(58, 450); // format
        op[308] = getOpcodeRnm(67, 512); // select
        op[309] = getOpcodeRnm(78, 585); // customQueryOption
        {int[] a = {311,312,313}; op[310] = getOpcodeCat(a);}
        {char[] a = {36,105,100}; op[311] = getOpcodeTbs(a);}
        op[312] = getOpcodeRnm(333, 2226); // EQ
        op[313] = getOpcodeRnm(376, 2630); // IRI-in-query
        {int[] a = {315,316,317,318,319,320,321,322,323,324,325,326}; op[314] = getOpcodeAlt(a);}
        op[315] = getOpcodeRnm(46, 327); // expand
        op[316] = getOpcodeRnm(385, 2650); // apply
        op[317] = getOpcodeRnm(53, 420); // filter
        op[318] = getOpcodeRnm(58, 450); // format
        op[319] = getOpcodeRnm(44, 310); // id
        op[320] = getOpcodeRnm(59, 463); // inlinecount
        op[321] = getOpcodeRnm(54, 424); // orderby
        op[322] = getOpcodeRnm(60, 467); // search
        op[323] = getOpcodeRnm(67, 512); // select
        op[324] = getOpcodeRnm(56, 440); // skip
        op[325] = getOpcodeRnm(75, 573); // skiptoken
        op[326] = getOpcodeRnm(57, 445); // top
        {int[] a = {328,329,330,331}; op[327] = getOpcodeCat(a);}
        {char[] a = {36,101,120,112,97,110,100}; op[328] = getOpcodeTbs(a);}
        op[329] = getOpcodeRnm(333, 2226); // EQ
        op[330] = getOpcodeRnm(47, 335); // expandItem
        op[331] = getOpcodeRep((char)0, Character.MAX_VALUE, 332);
        {int[] a = {333,334}; op[332] = getOpcodeCat(a);}
        op[333] = getOpcodeRnm(332, 2223); // COMMA
        op[334] = getOpcodeRnm(47, 335); // expandItem
        {int[] a = {336,345}; op[335] = getOpcodeAlt(a);}
        {int[] a = {337,338}; op[336] = getOpcodeCat(a);}
        op[337] = getOpcodeRnm(336, 2234); // STAR
        op[338] = getOpcodeRep((char)0, (char)1, 339);
        {int[] a = {340,341}; op[339] = getOpcodeAlt(a);}
        op[340] = getOpcodeRnm(18, 173); // ref
        {int[] a = {342,343,344}; op[341] = getOpcodeCat(a);}
        op[342] = getOpcodeRnm(338, 2240); // OPEN
        op[343] = getOpcodeRnm(52, 413); // levels
        op[344] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {346,347}; op[345] = getOpcodeCat(a);}
        op[346] = getOpcodeRnm(48, 379); // expandPath
        op[347] = getOpcodeRep((char)0, (char)1, 348);
        {int[] a = {349,360,371}; op[348] = getOpcodeAlt(a);}
        {int[] a = {350,351}; op[349] = getOpcodeCat(a);}
        op[350] = getOpcodeRnm(18, 173); // ref
        op[351] = getOpcodeRep((char)0, (char)1, 352);
        {int[] a = {353,354,355,359}; op[352] = getOpcodeCat(a);}
        op[353] = getOpcodeRnm(338, 2240); // OPEN
        op[354] = getOpcodeRnm(50, 402); // expandRefOption
        op[355] = getOpcodeRep((char)0, Character.MAX_VALUE, 356);
        {int[] a = {357,358}; op[356] = getOpcodeCat(a);}
        op[357] = getOpcodeRnm(335, 2231); // SEMI
        op[358] = getOpcodeRnm(50, 402); // expandRefOption
        op[359] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {361,362}; op[360] = getOpcodeCat(a);}
        op[361] = getOpcodeRnm(17, 172); // count
        op[362] = getOpcodeRep((char)0, (char)1, 363);
        {int[] a = {364,365,366,370}; op[363] = getOpcodeCat(a);}
        op[364] = getOpcodeRnm(338, 2240); // OPEN
        op[365] = getOpcodeRnm(49, 399); // expandCountOption
        op[366] = getOpcodeRep((char)0, Character.MAX_VALUE, 367);
        {int[] a = {368,369}; op[367] = getOpcodeCat(a);}
        op[368] = getOpcodeRnm(335, 2231); // SEMI
        op[369] = getOpcodeRnm(49, 399); // expandCountOption
        op[370] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {372,373,374,378}; op[371] = getOpcodeCat(a);}
        op[372] = getOpcodeRnm(338, 2240); // OPEN
        op[373] = getOpcodeRnm(51, 408); // expandOption
        op[374] = getOpcodeRep((char)0, Character.MAX_VALUE, 375);
        {int[] a = {376,377}; op[375] = getOpcodeCat(a);}
        op[376] = getOpcodeRnm(335, 2231); // SEMI
        op[377] = getOpcodeRnm(51, 408); // expandOption
        op[378] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {380,384,394,395}; op[379] = getOpcodeCat(a);}
        op[380] = getOpcodeRep((char)0, (char)1, 381);
        {int[] a = {382,383}; op[381] = getOpcodeCat(a);}
        op[382] = getOpcodeRnm(188, 1489); // qualifiedEntityTypeName
        {char[] a = {47}; op[383] = getOpcodeTls(a);}
        op[384] = getOpcodeRep((char)0, Character.MAX_VALUE, 385);
        {int[] a = {386,389,390}; op[385] = getOpcodeCat(a);}
        {int[] a = {387,388}; op[386] = getOpcodeAlt(a);}
        op[387] = getOpcodeRnm(210, 1568); // complexProperty
        op[388] = getOpcodeRnm(211, 1569); // complexColProperty
        {char[] a = {47}; op[389] = getOpcodeTls(a);}
        op[390] = getOpcodeRep((char)0, (char)1, 391);
        {int[] a = {392,393}; op[391] = getOpcodeCat(a);}
        op[392] = getOpcodeRnm(189, 1493); // qualifiedComplexTypeName
        {char[] a = {47}; op[393] = getOpcodeTls(a);}
        op[394] = getOpcodeRnm(213, 1571); // navigationProperty
        op[395] = getOpcodeRep((char)0, (char)1, 396);
        {int[] a = {397,398}; op[396] = getOpcodeCat(a);}
        {char[] a = {47}; op[397] = getOpcodeTls(a);}
        op[398] = getOpcodeRnm(188, 1489); // qualifiedEntityTypeName
        {int[] a = {400,401}; op[399] = getOpcodeAlt(a);}
        op[400] = getOpcodeRnm(53, 420); // filter
        op[401] = getOpcodeRnm(60, 467); // search
        {int[] a = {403,404,405,406,407}; op[402] = getOpcodeAlt(a);}
        op[403] = getOpcodeRnm(49, 399); // expandCountOption
        op[404] = getOpcodeRnm(54, 424); // orderby
        op[405] = getOpcodeRnm(56, 440); // skip
        op[406] = getOpcodeRnm(57, 445); // top
        op[407] = getOpcodeRnm(59, 463); // inlinecount
        {int[] a = {409,410,411,412}; op[408] = getOpcodeAlt(a);}
        op[409] = getOpcodeRnm(50, 402); // expandRefOption
        op[410] = getOpcodeRnm(67, 512); // select
        op[411] = getOpcodeRnm(46, 327); // expand
        op[412] = getOpcodeRnm(52, 413); // levels
        {int[] a = {414,415,416}; op[413] = getOpcodeCat(a);}
        {char[] a = {36,108,101,118,101,108,115}; op[414] = getOpcodeTbs(a);}
        op[415] = getOpcodeRnm(333, 2226); // EQ
        {int[] a = {417,419}; op[416] = getOpcodeAlt(a);}
        op[417] = getOpcodeRep((char)1, Character.MAX_VALUE, 418);
        op[418] = getOpcodeRnm(378, 2635); // DIGIT
        {char[] a = {109,97,120}; op[419] = getOpcodeTbs(a);}
        {int[] a = {421,422,423}; op[420] = getOpcodeCat(a);}
        {char[] a = {36,102,105,108,116,101,114}; op[421] = getOpcodeTbs(a);}
        op[422] = getOpcodeRnm(333, 2226); // EQ
        op[423] = getOpcodeRnm(87, 689); // boolCommonExpr
        {int[] a = {425,426,427,428}; op[424] = getOpcodeCat(a);}
        {char[] a = {36,111,114,100,101,114,98,121}; op[425] = getOpcodeTbs(a);}
        op[426] = getOpcodeRnm(333, 2226); // EQ
        op[427] = getOpcodeRnm(55, 432); // orderbyItem
        op[428] = getOpcodeRep((char)0, Character.MAX_VALUE, 429);
        {int[] a = {430,431}; op[429] = getOpcodeCat(a);}
        op[430] = getOpcodeRnm(332, 2223); // COMMA
        op[431] = getOpcodeRnm(55, 432); // orderbyItem
        {int[] a = {433,434}; op[432] = getOpcodeCat(a);}
        op[433] = getOpcodeRnm(86, 670); // commonExpr
        op[434] = getOpcodeRep((char)0, (char)1, 435);
        {int[] a = {436,437}; op[435] = getOpcodeCat(a);}
        op[436] = getOpcodeRnm(328, 2210); // RWS
        {int[] a = {438,439}; op[437] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[438] = getOpcodeTbs(a);}
        {char[] a = {100,101,115,99}; op[439] = getOpcodeTbs(a);}
        {int[] a = {441,442,443}; op[440] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112}; op[441] = getOpcodeTbs(a);}
        op[442] = getOpcodeRnm(333, 2226); // EQ
        op[443] = getOpcodeRep((char)1, Character.MAX_VALUE, 444);
        op[444] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {446,447,448}; op[445] = getOpcodeCat(a);}
        {char[] a = {36,116,111,112}; op[446] = getOpcodeTbs(a);}
        op[447] = getOpcodeRnm(333, 2226); // EQ
        op[448] = getOpcodeRep((char)1, Character.MAX_VALUE, 449);
        op[449] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {451,452,453}; op[450] = getOpcodeCat(a);}
        {char[] a = {36,102,111,114,109,97,116}; op[451] = getOpcodeTbs(a);}
        op[452] = getOpcodeRnm(333, 2226); // EQ
        {int[] a = {454,455,456,457}; op[453] = getOpcodeAlt(a);}
        {char[] a = {97,116,111,109}; op[454] = getOpcodeTls(a);}
        {char[] a = {106,115,111,110}; op[455] = getOpcodeTls(a);}
        {char[] a = {120,109,108}; op[456] = getOpcodeTls(a);}
        {int[] a = {458,460,461}; op[457] = getOpcodeCat(a);}
        op[458] = getOpcodeRep((char)1, Character.MAX_VALUE, 459);
        op[459] = getOpcodeRnm(360, 2464); // pchar
        {char[] a = {47}; op[460] = getOpcodeTls(a);}
        op[461] = getOpcodeRep((char)1, Character.MAX_VALUE, 462);
        op[462] = getOpcodeRnm(360, 2464); // pchar
        {int[] a = {464,465,466}; op[463] = getOpcodeCat(a);}
        {char[] a = {36,99,111,117,110,116}; op[464] = getOpcodeTbs(a);}
        op[465] = getOpcodeRnm(333, 2226); // EQ
        op[466] = getOpcodeRnm(236, 1648); // booleanValue
        {int[] a = {468,469,470,471}; op[467] = getOpcodeCat(a);}
        {char[] a = {36,115,101,97,114,99,104}; op[468] = getOpcodeTbs(a);}
        op[469] = getOpcodeRnm(333, 2226); // EQ
        op[470] = getOpcodeRnm(329, 2216); // BWS
        op[471] = getOpcodeRnm(61, 472); // searchExpr
        {int[] a = {473,481}; op[472] = getOpcodeCat(a);}
        {int[] a = {474,480}; op[473] = getOpcodeAlt(a);}
        {int[] a = {475,476,477,478,479}; op[474] = getOpcodeCat(a);}
        op[475] = getOpcodeRnm(338, 2240); // OPEN
        op[476] = getOpcodeRnm(329, 2216); // BWS
        op[477] = getOpcodeRnm(61, 472); // searchExpr
        op[478] = getOpcodeRnm(329, 2216); // BWS
        op[479] = getOpcodeRnm(339, 2243); // CLOSE
        op[480] = getOpcodeRnm(64, 497); // searchTerm
        op[481] = getOpcodeRep((char)0, (char)1, 482);
        {int[] a = {483,484}; op[482] = getOpcodeAlt(a);}
        op[483] = getOpcodeRnm(62, 485); // searchOrExpr
        op[484] = getOpcodeRnm(63, 490); // searchAndExpr
        {int[] a = {486,487,488,489}; op[485] = getOpcodeCat(a);}
        op[486] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {79,82}; op[487] = getOpcodeTbs(a);}
        op[488] = getOpcodeRnm(328, 2210); // RWS
        op[489] = getOpcodeRnm(61, 472); // searchExpr
        {int[] a = {491,492,496}; op[490] = getOpcodeCat(a);}
        op[491] = getOpcodeRnm(328, 2210); // RWS
        op[492] = getOpcodeRep((char)0, (char)1, 493);
        {int[] a = {494,495}; op[493] = getOpcodeCat(a);}
        {char[] a = {65,78,68}; op[494] = getOpcodeTbs(a);}
        op[495] = getOpcodeRnm(328, 2210); // RWS
        op[496] = getOpcodeRnm(61, 472); // searchExpr
        {int[] a = {498,502}; op[497] = getOpcodeCat(a);}
        op[498] = getOpcodeRep((char)0, (char)1, 499);
        {int[] a = {500,501}; op[499] = getOpcodeCat(a);}
        {char[] a = {78,79,84}; op[500] = getOpcodeTbs(a);}
        op[501] = getOpcodeRnm(328, 2210); // RWS
        {int[] a = {503,504}; op[502] = getOpcodeAlt(a);}
        op[503] = getOpcodeRnm(65, 505); // searchPhrase
        op[504] = getOpcodeRnm(66, 510); // searchWord
        {int[] a = {506,507,509}; op[505] = getOpcodeCat(a);}
        op[506] = getOpcodeRnm(175, 1397); // quotation-mark
        op[507] = getOpcodeRep((char)1, Character.MAX_VALUE, 508);
        op[508] = getOpcodeRnm(374, 2619); // qchar-no-AMP-DQUOTE
        op[509] = getOpcodeRnm(175, 1397); // quotation-mark
        op[510] = getOpcodeRep((char)1, Character.MAX_VALUE, 511);
        op[511] = getOpcodeRnm(377, 2632); // ALPHA
        {int[] a = {513,514,515,516}; op[512] = getOpcodeCat(a);}
        {char[] a = {36,115,101,108,101,99,116}; op[513] = getOpcodeTbs(a);}
        op[514] = getOpcodeRnm(333, 2226); // EQ
        op[515] = getOpcodeRnm(68, 520); // selectItem
        op[516] = getOpcodeRep((char)0, Character.MAX_VALUE, 517);
        {int[] a = {518,519}; op[517] = getOpcodeCat(a);}
        op[518] = getOpcodeRnm(332, 2223); // COMMA
        op[519] = getOpcodeRnm(68, 520); // selectItem
        {int[] a = {521,522,523}; op[520] = getOpcodeAlt(a);}
        op[521] = getOpcodeRnm(336, 2234); // STAR
        op[522] = getOpcodeRnm(71, 550); // allOperationsInSchema
        {int[] a = {524,528}; op[523] = getOpcodeCat(a);}
        op[524] = getOpcodeRep((char)0, (char)1, 525);
        {int[] a = {526,527}; op[525] = getOpcodeCat(a);}
        op[526] = getOpcodeRnm(188, 1489); // qualifiedEntityTypeName
        {char[] a = {47}; op[527] = getOpcodeTls(a);}
        {int[] a = {529,530,531}; op[528] = getOpcodeAlt(a);}
        op[529] = getOpcodeRnm(69, 532); // selectProperty
        op[530] = getOpcodeRnm(72, 554); // qualifiedActionName
        op[531] = getOpcodeRnm(73, 558); // qualifiedFunctionName
        {int[] a = {533,534,535,536}; op[532] = getOpcodeAlt(a);}
        op[533] = getOpcodeRnm(206, 1562); // primitiveProperty
        op[534] = getOpcodeRnm(209, 1567); // primitiveColProperty
        op[535] = getOpcodeRnm(213, 1571); // navigationProperty
        {int[] a = {537,538}; op[536] = getOpcodeCat(a);}
        op[537] = getOpcodeRnm(70, 542); // selectPath
        op[538] = getOpcodeRep((char)0, (char)1, 539);
        {int[] a = {540,541}; op[539] = getOpcodeCat(a);}
        {char[] a = {47}; op[540] = getOpcodeTls(a);}
        op[541] = getOpcodeRnm(69, 532); // selectProperty
        {int[] a = {543,546}; op[542] = getOpcodeCat(a);}
        {int[] a = {544,545}; op[543] = getOpcodeAlt(a);}
        op[544] = getOpcodeRnm(210, 1568); // complexProperty
        op[545] = getOpcodeRnm(211, 1569); // complexColProperty
        op[546] = getOpcodeRep((char)0, (char)1, 547);
        {int[] a = {548,549}; op[547] = getOpcodeCat(a);}
        {char[] a = {47}; op[548] = getOpcodeTls(a);}
        op[549] = getOpcodeRnm(189, 1493); // qualifiedComplexTypeName
        {int[] a = {551,552,553}; op[550] = getOpcodeCat(a);}
        op[551] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[552] = getOpcodeTls(a);}
        op[553] = getOpcodeRnm(336, 2234); // STAR
        {int[] a = {555,556,557}; op[554] = getOpcodeCat(a);}
        op[555] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[556] = getOpcodeTls(a);}
        op[557] = getOpcodeRnm(216, 1576); // action
        {int[] a = {559,560,561,562}; op[558] = getOpcodeCat(a);}
        op[559] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[560] = getOpcodeTls(a);}
        op[561] = getOpcodeRnm(218, 1578); // function
        op[562] = getOpcodeRep((char)0, (char)1, 563);
        {int[] a = {564,565,566}; op[563] = getOpcodeCat(a);}
        op[564] = getOpcodeRnm(338, 2240); // OPEN
        op[565] = getOpcodeRnm(74, 567); // parameterNames
        op[566] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {568,569}; op[567] = getOpcodeCat(a);}
        op[568] = getOpcodeRnm(37, 272); // parameterName
        op[569] = getOpcodeRep((char)0, Character.MAX_VALUE, 570);
        {int[] a = {571,572}; op[570] = getOpcodeCat(a);}
        op[571] = getOpcodeRnm(332, 2223); // COMMA
        op[572] = getOpcodeRnm(37, 272); // parameterName
        {int[] a = {574,575,576}; op[573] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,116,111,107,101,110}; op[574] = getOpcodeTbs(a);}
        op[575] = getOpcodeRnm(333, 2226); // EQ
        op[576] = getOpcodeRep((char)1, Character.MAX_VALUE, 577);
        op[577] = getOpcodeRnm(369, 2542); // qchar-no-AMP
        {int[] a = {579,580,581}; op[578] = getOpcodeCat(a);}
        op[579] = getOpcodeRnm(38, 273); // parameterAlias
        op[580] = getOpcodeRnm(333, 2226); // EQ
        op[581] = getOpcodeRnm(77, 582); // parameterValue
        {int[] a = {583,584}; op[582] = getOpcodeAlt(a);}
        op[583] = getOpcodeRnm(159, 1266); // arrayOrObject
        op[584] = getOpcodeRnm(86, 670); // commonExpr
        {int[] a = {586,587}; op[585] = getOpcodeCat(a);}
        op[586] = getOpcodeRnm(79, 591); // customName
        op[587] = getOpcodeRep((char)0, (char)1, 588);
        {int[] a = {589,590}; op[588] = getOpcodeCat(a);}
        op[589] = getOpcodeRnm(333, 2226); // EQ
        op[590] = getOpcodeRnm(80, 595); // customValue
        {int[] a = {592,593}; op[591] = getOpcodeCat(a);}
        op[592] = getOpcodeRnm(371, 2563); // qchar-no-AMP-EQ-AT-DOLLAR
        op[593] = getOpcodeRep((char)0, Character.MAX_VALUE, 594);
        op[594] = getOpcodeRnm(370, 2553); // qchar-no-AMP-EQ
        op[595] = getOpcodeRep((char)0, Character.MAX_VALUE, 596);
        op[596] = getOpcodeRnm(369, 2542); // qchar-no-AMP
        {int[] a = {598,599}; op[597] = getOpcodeCat(a);}
        {char[] a = {35}; op[598] = getOpcodeTls(a);}
        {int[] a = {600,601,602,603,604,605,606,609,612,615}; op[599] = getOpcodeAlt(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110,40,36,114,101,102,41}; op[600] = getOpcodeTbs(a);}
        {char[] a = {36,114,101,102}; op[601] = getOpcodeTbs(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110,40,69,100,109,46,69,110,116,105,116,121,84,121,112,101,41}; op[602] = getOpcodeTbs(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110,40,69,100,109,46,67,111,109,112,108,101,120,84,121,112,101,41}; op[603] = getOpcodeTbs(a);}
        op[604] = getOpcodeRnm(194, 1509); // singletonEntity
        op[605] = getOpcodeRnm(187, 1475); // qualifiedTypeName
        {int[] a = {607,608}; op[606] = getOpcodeCat(a);}
        op[607] = getOpcodeRnm(193, 1508); // entitySetName
        {char[] a = {47,36,100,101,108,101,116,101,100,69,110,116,105,116,121}; op[608] = getOpcodeTbs(a);}
        {int[] a = {610,611}; op[609] = getOpcodeCat(a);}
        op[610] = getOpcodeRnm(193, 1508); // entitySetName
        {char[] a = {47,36,108,105,110,107}; op[611] = getOpcodeTbs(a);}
        {int[] a = {613,614}; op[612] = getOpcodeCat(a);}
        op[613] = getOpcodeRnm(193, 1508); // entitySetName
        {char[] a = {47,36,100,101,108,101,116,101,100,76,105,110,107}; op[614] = getOpcodeTbs(a);}
        {int[] a = {616,617,619,623,637,639,641}; op[615] = getOpcodeCat(a);}
        op[616] = getOpcodeRnm(193, 1508); // entitySetName
        op[617] = getOpcodeRep((char)0, (char)1, 618);
        op[618] = getOpcodeRnm(6, 91); // keyPredicate
        op[619] = getOpcodeRep((char)0, (char)1, 620);
        {int[] a = {621,622}; op[620] = getOpcodeCat(a);}
        {char[] a = {47}; op[621] = getOpcodeTls(a);}
        op[622] = getOpcodeRnm(188, 1489); // qualifiedEntityTypeName
        op[623] = getOpcodeRep((char)0, Character.MAX_VALUE, 624);
        {int[] a = {625,635,636}; op[624] = getOpcodeCat(a);}
        op[625] = getOpcodeRep((char)0, Character.MAX_VALUE, 626);
        {int[] a = {627,628,631}; op[626] = getOpcodeCat(a);}
        {char[] a = {47}; op[627] = getOpcodeTls(a);}
        {int[] a = {629,630}; op[628] = getOpcodeAlt(a);}
        op[629] = getOpcodeRnm(210, 1568); // complexProperty
        op[630] = getOpcodeRnm(211, 1569); // complexColProperty
        op[631] = getOpcodeRep((char)0, (char)1, 632);
        {int[] a = {633,634}; op[632] = getOpcodeCat(a);}
        {char[] a = {47}; op[633] = getOpcodeTls(a);}
        op[634] = getOpcodeRnm(189, 1493); // qualifiedComplexTypeName
        {char[] a = {47}; op[635] = getOpcodeTls(a);}
        op[636] = getOpcodeRnm(213, 1571); // navigationProperty
        op[637] = getOpcodeRep((char)0, (char)1, 638);
        op[638] = getOpcodeRnm(82, 643); // propertyList
        op[639] = getOpcodeRep((char)0, (char)1, 640);
        {char[] a = {47,36,100,101,108,116,97}; op[640] = getOpcodeTbs(a);}
        op[641] = getOpcodeRep((char)0, (char)1, 642);
        op[642] = getOpcodeRnm(85, 669); // entity
        {int[] a = {644,645,646,650}; op[643] = getOpcodeCat(a);}
        op[644] = getOpcodeRnm(338, 2240); // OPEN
        op[645] = getOpcodeRnm(83, 651); // propertyListItem
        op[646] = getOpcodeRep((char)0, Character.MAX_VALUE, 647);
        {int[] a = {648,649}; op[647] = getOpcodeCat(a);}
        op[648] = getOpcodeRnm(332, 2223); // COMMA
        op[649] = getOpcodeRnm(83, 651); // propertyListItem
        op[650] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {652,653}; op[651] = getOpcodeAlt(a);}
        op[652] = getOpcodeRnm(336, 2234); // STAR
        op[653] = getOpcodeRnm(84, 654); // propertyListProperty
        {int[] a = {655,656,657,663}; op[654] = getOpcodeAlt(a);}
        op[655] = getOpcodeRnm(206, 1562); // primitiveProperty
        op[656] = getOpcodeRnm(209, 1567); // primitiveColProperty
        {int[] a = {658,659,661}; op[657] = getOpcodeCat(a);}
        op[658] = getOpcodeRnm(213, 1571); // navigationProperty
        op[659] = getOpcodeRep((char)0, (char)1, 660);
        {char[] a = {43}; op[660] = getOpcodeTbs(a);}
        op[661] = getOpcodeRep((char)0, (char)1, 662);
        op[662] = getOpcodeRnm(82, 643); // propertyList
        {int[] a = {664,665}; op[663] = getOpcodeCat(a);}
        op[664] = getOpcodeRnm(70, 542); // selectPath
        op[665] = getOpcodeRep((char)0, (char)1, 666);
        {int[] a = {667,668}; op[666] = getOpcodeCat(a);}
        {char[] a = {47}; op[667] = getOpcodeTls(a);}
        op[668] = getOpcodeRnm(84, 654); // propertyListProperty
        {char[] a = {47,36,101,110,116,105,116,121}; op[669] = getOpcodeTbs(a);}
        {int[] a = {671,682}; op[670] = getOpcodeCat(a);}
        {int[] a = {672,673,674,675,676,677,678,679,680,681}; op[671] = getOpcodeAlt(a);}
        op[672] = getOpcodeRnm(231, 1597); // primitiveLiteral
        op[673] = getOpcodeRnm(38, 273); // parameterAlias
        op[674] = getOpcodeRnm(159, 1266); // arrayOrObject
        op[675] = getOpcodeRnm(88, 710); // rootExpr
        op[676] = getOpcodeRnm(89, 719); // firstMemberExpr
        op[677] = getOpcodeRnm(101, 804); // functionExpr
        op[678] = getOpcodeRnm(155, 1232); // negateExpr
        op[679] = getOpcodeRnm(107, 879); // methodCallExpr
        op[680] = getOpcodeRnm(140, 1156); // parenExpr
        op[681] = getOpcodeRnm(158, 1253); // castExpr
        op[682] = getOpcodeRep((char)0, (char)1, 683);
        {int[] a = {684,685,686,687,688}; op[683] = getOpcodeAlt(a);}
        op[684] = getOpcodeRnm(150, 1207); // addExpr
        op[685] = getOpcodeRnm(151, 1212); // subExpr
        op[686] = getOpcodeRnm(152, 1217); // mulExpr
        op[687] = getOpcodeRnm(153, 1222); // divExpr
        op[688] = getOpcodeRnm(154, 1227); // modExpr
        {int[] a = {690,706}; op[689] = getOpcodeCat(a);}
        {int[] a = {691,692,693,694,705}; op[690] = getOpcodeAlt(a);}
        op[691] = getOpcodeRnm(157, 1240); // isofExpr
        op[692] = getOpcodeRnm(108, 906); // boolMethodCallExpr
        op[693] = getOpcodeRnm(156, 1236); // notExpr
        {int[] a = {695,696}; op[694] = getOpcodeCat(a);}
        op[695] = getOpcodeRnm(86, 670); // commonExpr
        op[696] = getOpcodeRep((char)0, (char)1, 697);
        {int[] a = {698,699,700,701,702,703,704}; op[697] = getOpcodeAlt(a);}
        op[698] = getOpcodeRnm(143, 1172); // eqExpr
        op[699] = getOpcodeRnm(144, 1177); // neExpr
        op[700] = getOpcodeRnm(145, 1182); // ltExpr
        op[701] = getOpcodeRnm(146, 1187); // leExpr
        op[702] = getOpcodeRnm(147, 1192); // gtExpr
        op[703] = getOpcodeRnm(148, 1197); // geExpr
        op[704] = getOpcodeRnm(149, 1202); // hasExpr
        op[705] = getOpcodeRnm(139, 1150); // boolParenExpr
        op[706] = getOpcodeRep((char)0, (char)1, 707);
        {int[] a = {708,709}; op[707] = getOpcodeAlt(a);}
        op[708] = getOpcodeRnm(141, 1162); // andExpr
        op[709] = getOpcodeRnm(142, 1167); // orExpr
        {int[] a = {711,712,717}; op[710] = getOpcodeCat(a);}
        {char[] a = {36,114,111,111,116,47}; op[711] = getOpcodeTbs(a);}
        {int[] a = {713,716}; op[712] = getOpcodeAlt(a);}
        {int[] a = {714,715}; op[713] = getOpcodeCat(a);}
        op[714] = getOpcodeRnm(193, 1508); // entitySetName
        op[715] = getOpcodeRnm(6, 91); // keyPredicate
        op[716] = getOpcodeRnm(194, 1509); // singletonEntity
        op[717] = getOpcodeRep((char)0, (char)1, 718);
        op[718] = getOpcodeRnm(96, 777); // singleNavigationExpr
        {int[] a = {720,721}; op[719] = getOpcodeAlt(a);}
        op[720] = getOpcodeRnm(90, 727); // memberExpr
        {int[] a = {722,723}; op[721] = getOpcodeCat(a);}
        op[722] = getOpcodeRnm(92, 761); // inscopeVariableExpr
        op[723] = getOpcodeRep((char)0, (char)1, 724);
        {int[] a = {725,726}; op[724] = getOpcodeCat(a);}
        {char[] a = {47}; op[725] = getOpcodeTls(a);}
        op[726] = getOpcodeRnm(90, 727); // memberExpr
        {int[] a = {728,732}; op[727] = getOpcodeCat(a);}
        op[728] = getOpcodeRep((char)0, (char)1, 729);
        {int[] a = {730,731}; op[729] = getOpcodeCat(a);}
        op[730] = getOpcodeRnm(188, 1489); // qualifiedEntityTypeName
        {char[] a = {47}; op[731] = getOpcodeTls(a);}
        {int[] a = {733,734}; op[732] = getOpcodeAlt(a);}
        op[733] = getOpcodeRnm(91, 735); // propertyPathExpr
        op[734] = getOpcodeRnm(100, 803); // boundFunctionExpr
        {int[] a = {736,740,744,748,752,756,760}; op[735] = getOpcodeAlt(a);}
        {int[] a = {737,738}; op[736] = getOpcodeCat(a);}
        op[737] = getOpcodeRnm(215, 1575); // entityColNavigationProperty
        op[738] = getOpcodeRep((char)0, (char)1, 739);
        op[739] = getOpcodeRnm(95, 766); // collectionNavigationExpr
        {int[] a = {741,742}; op[740] = getOpcodeCat(a);}
        op[741] = getOpcodeRnm(214, 1574); // entityNavigationProperty
        op[742] = getOpcodeRep((char)0, (char)1, 743);
        op[743] = getOpcodeRnm(96, 777); // singleNavigationExpr
        {int[] a = {745,746}; op[744] = getOpcodeCat(a);}
        op[745] = getOpcodeRnm(211, 1569); // complexColProperty
        op[746] = getOpcodeRep((char)0, (char)1, 747);
        op[747] = getOpcodeRnm(97, 780); // collectionPathExpr
        {int[] a = {749,750}; op[748] = getOpcodeCat(a);}
        op[749] = getOpcodeRnm(210, 1568); // complexProperty
        op[750] = getOpcodeRep((char)0, (char)1, 751);
        op[751] = getOpcodeRnm(98, 791); // complexPathExpr
        {int[] a = {753,754}; op[752] = getOpcodeCat(a);}
        op[753] = getOpcodeRnm(209, 1567); // primitiveColProperty
        op[754] = getOpcodeRep((char)0, (char)1, 755);
        op[755] = getOpcodeRnm(97, 780); // collectionPathExpr
        {int[] a = {757,758}; op[756] = getOpcodeCat(a);}
        op[757] = getOpcodeRnm(206, 1562); // primitiveProperty
        op[758] = getOpcodeRep((char)0, (char)1, 759);
        op[759] = getOpcodeRnm(99, 800); // singlePathExpr
        op[760] = getOpcodeRnm(212, 1570); // streamProperty
        {int[] a = {762,763}; op[761] = getOpcodeAlt(a);}
        op[762] = getOpcodeRnm(93, 764); // implicitVariableExpr
        op[763] = getOpcodeRnm(94, 765); // lambdaVariableExpr
        {char[] a = {36,105,116}; op[764] = getOpcodeTbs(a);}
        op[765] = getOpcodeRnm(200, 1515); // odataIdentifier
        {int[] a = {767,771}; op[766] = getOpcodeCat(a);}
        op[767] = getOpcodeRep((char)0, (char)1, 768);
        {int[] a = {769,770}; op[768] = getOpcodeCat(a);}
        {char[] a = {47}; op[769] = getOpcodeTls(a);}
        op[770] = getOpcodeRnm(188, 1489); // qualifiedEntityTypeName
        {int[] a = {772,776}; op[771] = getOpcodeAlt(a);}
        {int[] a = {773,774}; op[772] = getOpcodeCat(a);}
        op[773] = getOpcodeRnm(6, 91); // keyPredicate
        op[774] = getOpcodeRep((char)0, (char)1, 775);
        op[775] = getOpcodeRnm(96, 777); // singleNavigationExpr
        op[776] = getOpcodeRnm(97, 780); // collectionPathExpr
        {int[] a = {778,779}; op[777] = getOpcodeCat(a);}
        {char[] a = {47}; op[778] = getOpcodeTls(a);}
        op[779] = getOpcodeRnm(90, 727); // memberExpr
        {int[] a = {781,782,785,788}; op[780] = getOpcodeAlt(a);}
        op[781] = getOpcodeRnm(17, 172); // count
        {int[] a = {783,784}; op[782] = getOpcodeCat(a);}
        {char[] a = {47}; op[783] = getOpcodeTls(a);}
        op[784] = getOpcodeRnm(100, 803); // boundFunctionExpr
        {int[] a = {786,787}; op[785] = getOpcodeCat(a);}
        {char[] a = {47}; op[786] = getOpcodeTls(a);}
        op[787] = getOpcodeRnm(104, 854); // anyExpr
        {int[] a = {789,790}; op[788] = getOpcodeCat(a);}
        {char[] a = {47}; op[789] = getOpcodeTls(a);}
        op[790] = getOpcodeRnm(105, 867); // allExpr
        {int[] a = {792,793,797}; op[791] = getOpcodeCat(a);}
        {char[] a = {47}; op[792] = getOpcodeTls(a);}
        op[793] = getOpcodeRep((char)0, (char)1, 794);
        {int[] a = {795,796}; op[794] = getOpcodeCat(a);}
        op[795] = getOpcodeRnm(189, 1493); // qualifiedComplexTypeName
        {char[] a = {47}; op[796] = getOpcodeTls(a);}
        {int[] a = {798,799}; op[797] = getOpcodeAlt(a);}
        op[798] = getOpcodeRnm(91, 735); // propertyPathExpr
        op[799] = getOpcodeRnm(100, 803); // boundFunctionExpr
        {int[] a = {801,802}; op[800] = getOpcodeCat(a);}
        {char[] a = {47}; op[801] = getOpcodeTls(a);}
        op[802] = getOpcodeRnm(100, 803); // boundFunctionExpr
        op[803] = getOpcodeRnm(101, 804); // functionExpr
        {int[] a = {805,806,807}; op[804] = getOpcodeCat(a);}
        op[805] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[806] = getOpcodeTls(a);}
        {int[] a = {808,813,818,823,828,833}; op[807] = getOpcodeAlt(a);}
        {int[] a = {809,810,811}; op[808] = getOpcodeCat(a);}
        op[809] = getOpcodeRnm(220, 1586); // entityColFunction
        op[810] = getOpcodeRnm(102, 838); // functionExprParameters
        op[811] = getOpcodeRep((char)0, (char)1, 812);
        op[812] = getOpcodeRnm(95, 766); // collectionNavigationExpr
        {int[] a = {814,815,816}; op[813] = getOpcodeCat(a);}
        op[814] = getOpcodeRnm(219, 1585); // entityFunction
        op[815] = getOpcodeRnm(102, 838); // functionExprParameters
        op[816] = getOpcodeRep((char)0, (char)1, 817);
        op[817] = getOpcodeRnm(96, 777); // singleNavigationExpr
        {int[] a = {819,820,821}; op[818] = getOpcodeCat(a);}
        op[819] = getOpcodeRnm(222, 1588); // complexColFunction
        op[820] = getOpcodeRnm(102, 838); // functionExprParameters
        op[821] = getOpcodeRep((char)0, (char)1, 822);
        op[822] = getOpcodeRnm(97, 780); // collectionPathExpr
        {int[] a = {824,825,826}; op[823] = getOpcodeCat(a);}
        op[824] = getOpcodeRnm(221, 1587); // complexFunction
        op[825] = getOpcodeRnm(102, 838); // functionExprParameters
        op[826] = getOpcodeRep((char)0, (char)1, 827);
        op[827] = getOpcodeRnm(98, 791); // complexPathExpr
        {int[] a = {829,830,831}; op[828] = getOpcodeCat(a);}
        op[829] = getOpcodeRnm(224, 1590); // primitiveColFunction
        op[830] = getOpcodeRnm(102, 838); // functionExprParameters
        op[831] = getOpcodeRep((char)0, (char)1, 832);
        op[832] = getOpcodeRnm(97, 780); // collectionPathExpr
        {int[] a = {834,835,836}; op[833] = getOpcodeCat(a);}
        op[834] = getOpcodeRnm(223, 1589); // primitiveFunction
        op[835] = getOpcodeRnm(102, 838); // functionExprParameters
        op[836] = getOpcodeRep((char)0, (char)1, 837);
        op[837] = getOpcodeRnm(99, 800); // singlePathExpr
        {int[] a = {839,840,847}; op[838] = getOpcodeCat(a);}
        op[839] = getOpcodeRnm(338, 2240); // OPEN
        op[840] = getOpcodeRep((char)0, (char)1, 841);
        {int[] a = {842,843}; op[841] = getOpcodeCat(a);}
        op[842] = getOpcodeRnm(103, 848); // functionExprParameter
        op[843] = getOpcodeRep((char)0, Character.MAX_VALUE, 844);
        {int[] a = {845,846}; op[844] = getOpcodeCat(a);}
        op[845] = getOpcodeRnm(332, 2223); // COMMA
        op[846] = getOpcodeRnm(103, 848); // functionExprParameter
        op[847] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {849,850,851}; op[848] = getOpcodeCat(a);}
        op[849] = getOpcodeRnm(37, 272); // parameterName
        op[850] = getOpcodeRnm(333, 2226); // EQ
        {int[] a = {852,853}; op[851] = getOpcodeAlt(a);}
        op[852] = getOpcodeRnm(38, 273); // parameterAlias
        op[853] = getOpcodeRnm(77, 582); // parameterValue
        {int[] a = {855,856,857,858,865,866}; op[854] = getOpcodeCat(a);}
        {char[] a = {97,110,121}; op[855] = getOpcodeTbs(a);}
        op[856] = getOpcodeRnm(338, 2240); // OPEN
        op[857] = getOpcodeRnm(329, 2216); // BWS
        op[858] = getOpcodeRep((char)0, (char)1, 859);
        {int[] a = {860,861,862,863,864}; op[859] = getOpcodeCat(a);}
        op[860] = getOpcodeRnm(94, 765); // lambdaVariableExpr
        op[861] = getOpcodeRnm(329, 2216); // BWS
        op[862] = getOpcodeRnm(331, 2220); // COLON
        op[863] = getOpcodeRnm(329, 2216); // BWS
        op[864] = getOpcodeRnm(106, 878); // lambdaPredicateExpr
        op[865] = getOpcodeRnm(329, 2216); // BWS
        op[866] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {868,869,870,871,872,873,874,875,876,877}; op[867] = getOpcodeCat(a);}
        {char[] a = {97,108,108}; op[868] = getOpcodeTbs(a);}
        op[869] = getOpcodeRnm(338, 2240); // OPEN
        op[870] = getOpcodeRnm(329, 2216); // BWS
        op[871] = getOpcodeRnm(94, 765); // lambdaVariableExpr
        op[872] = getOpcodeRnm(329, 2216); // BWS
        op[873] = getOpcodeRnm(331, 2220); // COLON
        op[874] = getOpcodeRnm(329, 2216); // BWS
        op[875] = getOpcodeRnm(106, 878); // lambdaPredicateExpr
        op[876] = getOpcodeRnm(329, 2216); // BWS
        op[877] = getOpcodeRnm(339, 2243); // CLOSE
        op[878] = getOpcodeRnm(87, 689); // boolCommonExpr
        {int[] a = {880,881,882,883,884,885,886,887,888,889,890,891,892,893,894,895,896,897,898,899,900,901,902,903,904,905}; op[879] = getOpcodeAlt(a);}
        op[880] = getOpcodeRnm(113, 951); // indexOfMethodCallExpr
        op[881] = getOpcodeRnm(115, 979); // toLowerMethodCallExpr
        op[882] = getOpcodeRnm(116, 986); // toUpperMethodCallExpr
        op[883] = getOpcodeRnm(117, 993); // trimMethodCallExpr
        op[884] = getOpcodeRnm(114, 962); // substringMethodCallExpr
        op[885] = getOpcodeRnm(118, 1000); // concatMethodCallExpr
        op[886] = getOpcodeRnm(112, 944); // lengthMethodCallExpr
        op[887] = getOpcodeRnm(119, 1011); // yearMethodCallExpr
        op[888] = getOpcodeRnm(120, 1018); // monthMethodCallExpr
        op[889] = getOpcodeRnm(121, 1025); // dayMethodCallExpr
        op[890] = getOpcodeRnm(122, 1032); // hourMethodCallExpr
        op[891] = getOpcodeRnm(123, 1039); // minuteMethodCallExpr
        op[892] = getOpcodeRnm(124, 1046); // secondMethodCallExpr
        op[893] = getOpcodeRnm(125, 1053); // fractionalsecondsMethodCallExpr
        op[894] = getOpcodeRnm(126, 1060); // totalsecondsMethodCallExpr
        op[895] = getOpcodeRnm(127, 1067); // dateMethodCallExpr
        op[896] = getOpcodeRnm(128, 1074); // timeMethodCallExpr
        op[897] = getOpcodeRnm(133, 1100); // roundMethodCallExpr
        op[898] = getOpcodeRnm(134, 1107); // floorMethodCallExpr
        op[899] = getOpcodeRnm(135, 1114); // ceilingMethodCallExpr
        op[900] = getOpcodeRnm(136, 1121); // distanceMethodCallExpr
        op[901] = getOpcodeRnm(137, 1132); // geoLengthMethodCallExpr
        op[902] = getOpcodeRnm(129, 1081); // totalOffsetMinutesMethodCallExpr
        op[903] = getOpcodeRnm(130, 1088); // minDateTimeMethodCallExpr
        op[904] = getOpcodeRnm(131, 1092); // maxDateTimeMethodCallExpr
        op[905] = getOpcodeRnm(132, 1096); // nowMethodCallExpr
        {int[] a = {907,908,909,910}; op[906] = getOpcodeAlt(a);}
        op[907] = getOpcodeRnm(111, 933); // endsWithMethodCallExpr
        op[908] = getOpcodeRnm(110, 922); // startsWithMethodCallExpr
        op[909] = getOpcodeRnm(109, 911); // containsMethodCallExpr
        op[910] = getOpcodeRnm(138, 1139); // intersectsMethodCallExpr
        {int[] a = {912,913,914,915,916,917,918,919,920,921}; op[911] = getOpcodeCat(a);}
        {char[] a = {99,111,110,116,97,105,110,115}; op[912] = getOpcodeTbs(a);}
        op[913] = getOpcodeRnm(338, 2240); // OPEN
        op[914] = getOpcodeRnm(329, 2216); // BWS
        op[915] = getOpcodeRnm(86, 670); // commonExpr
        op[916] = getOpcodeRnm(329, 2216); // BWS
        op[917] = getOpcodeRnm(332, 2223); // COMMA
        op[918] = getOpcodeRnm(329, 2216); // BWS
        op[919] = getOpcodeRnm(86, 670); // commonExpr
        op[920] = getOpcodeRnm(329, 2216); // BWS
        op[921] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {923,924,925,926,927,928,929,930,931,932}; op[922] = getOpcodeCat(a);}
        {char[] a = {115,116,97,114,116,115,119,105,116,104}; op[923] = getOpcodeTbs(a);}
        op[924] = getOpcodeRnm(338, 2240); // OPEN
        op[925] = getOpcodeRnm(329, 2216); // BWS
        op[926] = getOpcodeRnm(86, 670); // commonExpr
        op[927] = getOpcodeRnm(329, 2216); // BWS
        op[928] = getOpcodeRnm(332, 2223); // COMMA
        op[929] = getOpcodeRnm(329, 2216); // BWS
        op[930] = getOpcodeRnm(86, 670); // commonExpr
        op[931] = getOpcodeRnm(329, 2216); // BWS
        op[932] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {934,935,936,937,938,939,940,941,942,943}; op[933] = getOpcodeCat(a);}
        {char[] a = {101,110,100,115,119,105,116,104}; op[934] = getOpcodeTbs(a);}
        op[935] = getOpcodeRnm(338, 2240); // OPEN
        op[936] = getOpcodeRnm(329, 2216); // BWS
        op[937] = getOpcodeRnm(86, 670); // commonExpr
        op[938] = getOpcodeRnm(329, 2216); // BWS
        op[939] = getOpcodeRnm(332, 2223); // COMMA
        op[940] = getOpcodeRnm(329, 2216); // BWS
        op[941] = getOpcodeRnm(86, 670); // commonExpr
        op[942] = getOpcodeRnm(329, 2216); // BWS
        op[943] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {945,946,947,948,949,950}; op[944] = getOpcodeCat(a);}
        {char[] a = {108,101,110,103,116,104}; op[945] = getOpcodeTbs(a);}
        op[946] = getOpcodeRnm(338, 2240); // OPEN
        op[947] = getOpcodeRnm(329, 2216); // BWS
        op[948] = getOpcodeRnm(86, 670); // commonExpr
        op[949] = getOpcodeRnm(329, 2216); // BWS
        op[950] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {952,953,954,955,956,957,958,959,960,961}; op[951] = getOpcodeCat(a);}
        {char[] a = {105,110,100,101,120,111,102}; op[952] = getOpcodeTbs(a);}
        op[953] = getOpcodeRnm(338, 2240); // OPEN
        op[954] = getOpcodeRnm(329, 2216); // BWS
        op[955] = getOpcodeRnm(86, 670); // commonExpr
        op[956] = getOpcodeRnm(329, 2216); // BWS
        op[957] = getOpcodeRnm(332, 2223); // COMMA
        op[958] = getOpcodeRnm(329, 2216); // BWS
        op[959] = getOpcodeRnm(86, 670); // commonExpr
        op[960] = getOpcodeRnm(329, 2216); // BWS
        op[961] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {963,964,965,966,967,968,969,970,971,972,978}; op[962] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103}; op[963] = getOpcodeTbs(a);}
        op[964] = getOpcodeRnm(338, 2240); // OPEN
        op[965] = getOpcodeRnm(329, 2216); // BWS
        op[966] = getOpcodeRnm(86, 670); // commonExpr
        op[967] = getOpcodeRnm(329, 2216); // BWS
        op[968] = getOpcodeRnm(332, 2223); // COMMA
        op[969] = getOpcodeRnm(329, 2216); // BWS
        op[970] = getOpcodeRnm(86, 670); // commonExpr
        op[971] = getOpcodeRnm(329, 2216); // BWS
        op[972] = getOpcodeRep((char)0, (char)1, 973);
        {int[] a = {974,975,976,977}; op[973] = getOpcodeCat(a);}
        op[974] = getOpcodeRnm(332, 2223); // COMMA
        op[975] = getOpcodeRnm(329, 2216); // BWS
        op[976] = getOpcodeRnm(86, 670); // commonExpr
        op[977] = getOpcodeRnm(329, 2216); // BWS
        op[978] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {980,981,982,983,984,985}; op[979] = getOpcodeCat(a);}
        {char[] a = {116,111,108,111,119,101,114}; op[980] = getOpcodeTbs(a);}
        op[981] = getOpcodeRnm(338, 2240); // OPEN
        op[982] = getOpcodeRnm(329, 2216); // BWS
        op[983] = getOpcodeRnm(86, 670); // commonExpr
        op[984] = getOpcodeRnm(329, 2216); // BWS
        op[985] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {987,988,989,990,991,992}; op[986] = getOpcodeCat(a);}
        {char[] a = {116,111,117,112,112,101,114}; op[987] = getOpcodeTbs(a);}
        op[988] = getOpcodeRnm(338, 2240); // OPEN
        op[989] = getOpcodeRnm(329, 2216); // BWS
        op[990] = getOpcodeRnm(86, 670); // commonExpr
        op[991] = getOpcodeRnm(329, 2216); // BWS
        op[992] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {994,995,996,997,998,999}; op[993] = getOpcodeCat(a);}
        {char[] a = {116,114,105,109}; op[994] = getOpcodeTbs(a);}
        op[995] = getOpcodeRnm(338, 2240); // OPEN
        op[996] = getOpcodeRnm(329, 2216); // BWS
        op[997] = getOpcodeRnm(86, 670); // commonExpr
        op[998] = getOpcodeRnm(329, 2216); // BWS
        op[999] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1001,1002,1003,1004,1005,1006,1007,1008,1009,1010}; op[1000] = getOpcodeCat(a);}
        {char[] a = {99,111,110,99,97,116}; op[1001] = getOpcodeTbs(a);}
        op[1002] = getOpcodeRnm(338, 2240); // OPEN
        op[1003] = getOpcodeRnm(329, 2216); // BWS
        op[1004] = getOpcodeRnm(86, 670); // commonExpr
        op[1005] = getOpcodeRnm(329, 2216); // BWS
        op[1006] = getOpcodeRnm(332, 2223); // COMMA
        op[1007] = getOpcodeRnm(329, 2216); // BWS
        op[1008] = getOpcodeRnm(86, 670); // commonExpr
        op[1009] = getOpcodeRnm(329, 2216); // BWS
        op[1010] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1012,1013,1014,1015,1016,1017}; op[1011] = getOpcodeCat(a);}
        {char[] a = {121,101,97,114}; op[1012] = getOpcodeTbs(a);}
        op[1013] = getOpcodeRnm(338, 2240); // OPEN
        op[1014] = getOpcodeRnm(329, 2216); // BWS
        op[1015] = getOpcodeRnm(86, 670); // commonExpr
        op[1016] = getOpcodeRnm(329, 2216); // BWS
        op[1017] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1019,1020,1021,1022,1023,1024}; op[1018] = getOpcodeCat(a);}
        {char[] a = {109,111,110,116,104}; op[1019] = getOpcodeTbs(a);}
        op[1020] = getOpcodeRnm(338, 2240); // OPEN
        op[1021] = getOpcodeRnm(329, 2216); // BWS
        op[1022] = getOpcodeRnm(86, 670); // commonExpr
        op[1023] = getOpcodeRnm(329, 2216); // BWS
        op[1024] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1026,1027,1028,1029,1030,1031}; op[1025] = getOpcodeCat(a);}
        {char[] a = {100,97,121}; op[1026] = getOpcodeTbs(a);}
        op[1027] = getOpcodeRnm(338, 2240); // OPEN
        op[1028] = getOpcodeRnm(329, 2216); // BWS
        op[1029] = getOpcodeRnm(86, 670); // commonExpr
        op[1030] = getOpcodeRnm(329, 2216); // BWS
        op[1031] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1033,1034,1035,1036,1037,1038}; op[1032] = getOpcodeCat(a);}
        {char[] a = {104,111,117,114}; op[1033] = getOpcodeTbs(a);}
        op[1034] = getOpcodeRnm(338, 2240); // OPEN
        op[1035] = getOpcodeRnm(329, 2216); // BWS
        op[1036] = getOpcodeRnm(86, 670); // commonExpr
        op[1037] = getOpcodeRnm(329, 2216); // BWS
        op[1038] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1040,1041,1042,1043,1044,1045}; op[1039] = getOpcodeCat(a);}
        {char[] a = {109,105,110,117,116,101}; op[1040] = getOpcodeTbs(a);}
        op[1041] = getOpcodeRnm(338, 2240); // OPEN
        op[1042] = getOpcodeRnm(329, 2216); // BWS
        op[1043] = getOpcodeRnm(86, 670); // commonExpr
        op[1044] = getOpcodeRnm(329, 2216); // BWS
        op[1045] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1047,1048,1049,1050,1051,1052}; op[1046] = getOpcodeCat(a);}
        {char[] a = {115,101,99,111,110,100}; op[1047] = getOpcodeTbs(a);}
        op[1048] = getOpcodeRnm(338, 2240); // OPEN
        op[1049] = getOpcodeRnm(329, 2216); // BWS
        op[1050] = getOpcodeRnm(86, 670); // commonExpr
        op[1051] = getOpcodeRnm(329, 2216); // BWS
        op[1052] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1054,1055,1056,1057,1058,1059}; op[1053] = getOpcodeCat(a);}
        {char[] a = {102,114,97,99,116,105,111,110,97,108,115,101,99,111,110,100,115}; op[1054] = getOpcodeTbs(a);}
        op[1055] = getOpcodeRnm(338, 2240); // OPEN
        op[1056] = getOpcodeRnm(329, 2216); // BWS
        op[1057] = getOpcodeRnm(86, 670); // commonExpr
        op[1058] = getOpcodeRnm(329, 2216); // BWS
        op[1059] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1061,1062,1063,1064,1065,1066}; op[1060] = getOpcodeCat(a);}
        {char[] a = {116,111,116,97,108,115,101,99,111,110,100,115}; op[1061] = getOpcodeTbs(a);}
        op[1062] = getOpcodeRnm(338, 2240); // OPEN
        op[1063] = getOpcodeRnm(329, 2216); // BWS
        op[1064] = getOpcodeRnm(86, 670); // commonExpr
        op[1065] = getOpcodeRnm(329, 2216); // BWS
        op[1066] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1068,1069,1070,1071,1072,1073}; op[1067] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101}; op[1068] = getOpcodeTbs(a);}
        op[1069] = getOpcodeRnm(338, 2240); // OPEN
        op[1070] = getOpcodeRnm(329, 2216); // BWS
        op[1071] = getOpcodeRnm(86, 670); // commonExpr
        op[1072] = getOpcodeRnm(329, 2216); // BWS
        op[1073] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1075,1076,1077,1078,1079,1080}; op[1074] = getOpcodeCat(a);}
        {char[] a = {116,105,109,101}; op[1075] = getOpcodeTbs(a);}
        op[1076] = getOpcodeRnm(338, 2240); // OPEN
        op[1077] = getOpcodeRnm(329, 2216); // BWS
        op[1078] = getOpcodeRnm(86, 670); // commonExpr
        op[1079] = getOpcodeRnm(329, 2216); // BWS
        op[1080] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1082,1083,1084,1085,1086,1087}; op[1081] = getOpcodeCat(a);}
        {char[] a = {116,111,116,97,108,111,102,102,115,101,116,109,105,110,117,116,101,115}; op[1082] = getOpcodeTbs(a);}
        op[1083] = getOpcodeRnm(338, 2240); // OPEN
        op[1084] = getOpcodeRnm(329, 2216); // BWS
        op[1085] = getOpcodeRnm(86, 670); // commonExpr
        op[1086] = getOpcodeRnm(329, 2216); // BWS
        op[1087] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1089,1090,1091}; op[1088] = getOpcodeCat(a);}
        {char[] a = {109,105,110,100,97,116,101,116,105,109,101,40}; op[1089] = getOpcodeTbs(a);}
        op[1090] = getOpcodeRnm(329, 2216); // BWS
        {char[] a = {41}; op[1091] = getOpcodeTbs(a);}
        {int[] a = {1093,1094,1095}; op[1092] = getOpcodeCat(a);}
        {char[] a = {109,97,120,100,97,116,101,116,105,109,101,40}; op[1093] = getOpcodeTbs(a);}
        op[1094] = getOpcodeRnm(329, 2216); // BWS
        {char[] a = {41}; op[1095] = getOpcodeTbs(a);}
        {int[] a = {1097,1098,1099}; op[1096] = getOpcodeCat(a);}
        {char[] a = {110,111,119,40}; op[1097] = getOpcodeTbs(a);}
        op[1098] = getOpcodeRnm(329, 2216); // BWS
        {char[] a = {41}; op[1099] = getOpcodeTbs(a);}
        {int[] a = {1101,1102,1103,1104,1105,1106}; op[1100] = getOpcodeCat(a);}
        {char[] a = {114,111,117,110,100}; op[1101] = getOpcodeTbs(a);}
        op[1102] = getOpcodeRnm(338, 2240); // OPEN
        op[1103] = getOpcodeRnm(329, 2216); // BWS
        op[1104] = getOpcodeRnm(86, 670); // commonExpr
        op[1105] = getOpcodeRnm(329, 2216); // BWS
        op[1106] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1108,1109,1110,1111,1112,1113}; op[1107] = getOpcodeCat(a);}
        {char[] a = {102,108,111,111,114}; op[1108] = getOpcodeTbs(a);}
        op[1109] = getOpcodeRnm(338, 2240); // OPEN
        op[1110] = getOpcodeRnm(329, 2216); // BWS
        op[1111] = getOpcodeRnm(86, 670); // commonExpr
        op[1112] = getOpcodeRnm(329, 2216); // BWS
        op[1113] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1115,1116,1117,1118,1119,1120}; op[1114] = getOpcodeCat(a);}
        {char[] a = {99,101,105,108,105,110,103}; op[1115] = getOpcodeTbs(a);}
        op[1116] = getOpcodeRnm(338, 2240); // OPEN
        op[1117] = getOpcodeRnm(329, 2216); // BWS
        op[1118] = getOpcodeRnm(86, 670); // commonExpr
        op[1119] = getOpcodeRnm(329, 2216); // BWS
        op[1120] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1122,1123,1124,1125,1126,1127,1128,1129,1130,1131}; op[1121] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,100,105,115,116,97,110,99,101}; op[1122] = getOpcodeTbs(a);}
        op[1123] = getOpcodeRnm(338, 2240); // OPEN
        op[1124] = getOpcodeRnm(329, 2216); // BWS
        op[1125] = getOpcodeRnm(86, 670); // commonExpr
        op[1126] = getOpcodeRnm(329, 2216); // BWS
        op[1127] = getOpcodeRnm(332, 2223); // COMMA
        op[1128] = getOpcodeRnm(329, 2216); // BWS
        op[1129] = getOpcodeRnm(86, 670); // commonExpr
        op[1130] = getOpcodeRnm(329, 2216); // BWS
        op[1131] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1133,1134,1135,1136,1137,1138}; op[1132] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,108,101,110,103,116,104}; op[1133] = getOpcodeTbs(a);}
        op[1134] = getOpcodeRnm(338, 2240); // OPEN
        op[1135] = getOpcodeRnm(329, 2216); // BWS
        op[1136] = getOpcodeRnm(86, 670); // commonExpr
        op[1137] = getOpcodeRnm(329, 2216); // BWS
        op[1138] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1140,1141,1142,1143,1144,1145,1146,1147,1148,1149}; op[1139] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,105,110,116,101,114,115,101,99,116,115}; op[1140] = getOpcodeTbs(a);}
        op[1141] = getOpcodeRnm(338, 2240); // OPEN
        op[1142] = getOpcodeRnm(329, 2216); // BWS
        op[1143] = getOpcodeRnm(86, 670); // commonExpr
        op[1144] = getOpcodeRnm(329, 2216); // BWS
        op[1145] = getOpcodeRnm(332, 2223); // COMMA
        op[1146] = getOpcodeRnm(329, 2216); // BWS
        op[1147] = getOpcodeRnm(86, 670); // commonExpr
        op[1148] = getOpcodeRnm(329, 2216); // BWS
        op[1149] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1151,1152,1153,1154,1155}; op[1150] = getOpcodeCat(a);}
        op[1151] = getOpcodeRnm(338, 2240); // OPEN
        op[1152] = getOpcodeRnm(329, 2216); // BWS
        op[1153] = getOpcodeRnm(87, 689); // boolCommonExpr
        op[1154] = getOpcodeRnm(329, 2216); // BWS
        op[1155] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1157,1158,1159,1160,1161}; op[1156] = getOpcodeCat(a);}
        op[1157] = getOpcodeRnm(338, 2240); // OPEN
        op[1158] = getOpcodeRnm(329, 2216); // BWS
        op[1159] = getOpcodeRnm(86, 670); // commonExpr
        op[1160] = getOpcodeRnm(329, 2216); // BWS
        op[1161] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1163,1164,1165,1166}; op[1162] = getOpcodeCat(a);}
        op[1163] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {97,110,100}; op[1164] = getOpcodeTbs(a);}
        op[1165] = getOpcodeRnm(328, 2210); // RWS
        op[1166] = getOpcodeRnm(87, 689); // boolCommonExpr
        {int[] a = {1168,1169,1170,1171}; op[1167] = getOpcodeCat(a);}
        op[1168] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {111,114}; op[1169] = getOpcodeTbs(a);}
        op[1170] = getOpcodeRnm(328, 2210); // RWS
        op[1171] = getOpcodeRnm(87, 689); // boolCommonExpr
        {int[] a = {1173,1174,1175,1176}; op[1172] = getOpcodeCat(a);}
        op[1173] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {101,113}; op[1174] = getOpcodeTbs(a);}
        op[1175] = getOpcodeRnm(328, 2210); // RWS
        op[1176] = getOpcodeRnm(86, 670); // commonExpr
        {int[] a = {1178,1179,1180,1181}; op[1177] = getOpcodeCat(a);}
        op[1178] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {110,101}; op[1179] = getOpcodeTbs(a);}
        op[1180] = getOpcodeRnm(328, 2210); // RWS
        op[1181] = getOpcodeRnm(86, 670); // commonExpr
        {int[] a = {1183,1184,1185,1186}; op[1182] = getOpcodeCat(a);}
        op[1183] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {108,116}; op[1184] = getOpcodeTbs(a);}
        op[1185] = getOpcodeRnm(328, 2210); // RWS
        op[1186] = getOpcodeRnm(86, 670); // commonExpr
        {int[] a = {1188,1189,1190,1191}; op[1187] = getOpcodeCat(a);}
        op[1188] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {108,101}; op[1189] = getOpcodeTbs(a);}
        op[1190] = getOpcodeRnm(328, 2210); // RWS
        op[1191] = getOpcodeRnm(86, 670); // commonExpr
        {int[] a = {1193,1194,1195,1196}; op[1192] = getOpcodeCat(a);}
        op[1193] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {103,116}; op[1194] = getOpcodeTbs(a);}
        op[1195] = getOpcodeRnm(328, 2210); // RWS
        op[1196] = getOpcodeRnm(86, 670); // commonExpr
        {int[] a = {1198,1199,1200,1201}; op[1197] = getOpcodeCat(a);}
        op[1198] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {103,101}; op[1199] = getOpcodeTbs(a);}
        op[1200] = getOpcodeRnm(328, 2210); // RWS
        op[1201] = getOpcodeRnm(86, 670); // commonExpr
        {int[] a = {1203,1204,1205,1206}; op[1202] = getOpcodeCat(a);}
        op[1203] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {104,97,115}; op[1204] = getOpcodeTbs(a);}
        op[1205] = getOpcodeRnm(328, 2210); // RWS
        op[1206] = getOpcodeRnm(86, 670); // commonExpr
        {int[] a = {1208,1209,1210,1211}; op[1207] = getOpcodeCat(a);}
        op[1208] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {97,100,100}; op[1209] = getOpcodeTbs(a);}
        op[1210] = getOpcodeRnm(328, 2210); // RWS
        op[1211] = getOpcodeRnm(86, 670); // commonExpr
        {int[] a = {1213,1214,1215,1216}; op[1212] = getOpcodeCat(a);}
        op[1213] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {115,117,98}; op[1214] = getOpcodeTbs(a);}
        op[1215] = getOpcodeRnm(328, 2210); // RWS
        op[1216] = getOpcodeRnm(86, 670); // commonExpr
        {int[] a = {1218,1219,1220,1221}; op[1217] = getOpcodeCat(a);}
        op[1218] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {109,117,108}; op[1219] = getOpcodeTbs(a);}
        op[1220] = getOpcodeRnm(328, 2210); // RWS
        op[1221] = getOpcodeRnm(86, 670); // commonExpr
        {int[] a = {1223,1224,1225,1226}; op[1222] = getOpcodeCat(a);}
        op[1223] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {100,105,118}; op[1224] = getOpcodeTbs(a);}
        op[1225] = getOpcodeRnm(328, 2210); // RWS
        op[1226] = getOpcodeRnm(86, 670); // commonExpr
        {int[] a = {1228,1229,1230,1231}; op[1227] = getOpcodeCat(a);}
        op[1228] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {109,111,100}; op[1229] = getOpcodeTbs(a);}
        op[1230] = getOpcodeRnm(328, 2210); // RWS
        op[1231] = getOpcodeRnm(86, 670); // commonExpr
        {int[] a = {1233,1234,1235}; op[1232] = getOpcodeCat(a);}
        {char[] a = {45}; op[1233] = getOpcodeTls(a);}
        op[1234] = getOpcodeRnm(329, 2216); // BWS
        op[1235] = getOpcodeRnm(86, 670); // commonExpr
        {int[] a = {1237,1238,1239}; op[1236] = getOpcodeCat(a);}
        {char[] a = {110,111,116}; op[1237] = getOpcodeTbs(a);}
        op[1238] = getOpcodeRnm(328, 2210); // RWS
        op[1239] = getOpcodeRnm(87, 689); // boolCommonExpr
        {int[] a = {1241,1242,1243,1244,1250,1251,1252}; op[1240] = getOpcodeCat(a);}
        {char[] a = {105,115,111,102}; op[1241] = getOpcodeTbs(a);}
        op[1242] = getOpcodeRnm(338, 2240); // OPEN
        op[1243] = getOpcodeRnm(329, 2216); // BWS
        op[1244] = getOpcodeRep((char)0, (char)1, 1245);
        {int[] a = {1246,1247,1248,1249}; op[1245] = getOpcodeCat(a);}
        op[1246] = getOpcodeRnm(86, 670); // commonExpr
        op[1247] = getOpcodeRnm(329, 2216); // BWS
        op[1248] = getOpcodeRnm(332, 2223); // COMMA
        op[1249] = getOpcodeRnm(329, 2216); // BWS
        op[1250] = getOpcodeRnm(187, 1475); // qualifiedTypeName
        op[1251] = getOpcodeRnm(329, 2216); // BWS
        op[1252] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1254,1255,1256,1257,1263,1264,1265}; op[1253] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[1254] = getOpcodeTbs(a);}
        op[1255] = getOpcodeRnm(338, 2240); // OPEN
        op[1256] = getOpcodeRnm(329, 2216); // BWS
        op[1257] = getOpcodeRep((char)0, (char)1, 1258);
        {int[] a = {1259,1260,1261,1262}; op[1258] = getOpcodeCat(a);}
        op[1259] = getOpcodeRnm(86, 670); // commonExpr
        op[1260] = getOpcodeRnm(329, 2216); // BWS
        op[1261] = getOpcodeRnm(332, 2223); // COMMA
        op[1262] = getOpcodeRnm(329, 2216); // BWS
        op[1263] = getOpcodeRnm(187, 1475); // qualifiedTypeName
        op[1264] = getOpcodeRnm(329, 2216); // BWS
        op[1265] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1267,1268,1269,1270}; op[1266] = getOpcodeAlt(a);}
        op[1267] = getOpcodeRnm(160, 1271); // complexColInUri
        op[1268] = getOpcodeRnm(161, 1281); // complexInUri
        op[1269] = getOpcodeRnm(170, 1363); // rootExprCol
        op[1270] = getOpcodeRnm(163, 1314); // primitiveColInUri
        {int[] a = {1272,1273,1280}; op[1271] = getOpcodeCat(a);}
        op[1272] = getOpcodeRnm(173, 1385); // begin-array
        op[1273] = getOpcodeRep((char)0, (char)1, 1274);
        {int[] a = {1275,1276}; op[1274] = getOpcodeCat(a);}
        op[1275] = getOpcodeRnm(161, 1281); // complexInUri
        op[1276] = getOpcodeRep((char)0, Character.MAX_VALUE, 1277);
        {int[] a = {1278,1279}; op[1277] = getOpcodeCat(a);}
        op[1278] = getOpcodeRnm(177, 1404); // value-separator
        op[1279] = getOpcodeRnm(161, 1281); // complexInUri
        op[1280] = getOpcodeRnm(174, 1391); // end-array
        {int[] a = {1282,1283,1300}; op[1281] = getOpcodeCat(a);}
        op[1282] = getOpcodeRnm(171, 1373); // begin-object
        op[1283] = getOpcodeRep((char)0, (char)1, 1284);
        {int[] a = {1285,1291}; op[1284] = getOpcodeCat(a);}
        {int[] a = {1286,1287,1288,1289,1290}; op[1285] = getOpcodeAlt(a);}
        op[1286] = getOpcodeRnm(165, 1330); // annotationInUri
        op[1287] = getOpcodeRnm(166, 1342); // primitivePropertyInUri
        op[1288] = getOpcodeRnm(164, 1324); // complexPropertyInUri
        op[1289] = getOpcodeRnm(162, 1301); // collectionPropertyInUri
        op[1290] = getOpcodeRnm(167, 1348); // navigationPropertyInUri
        op[1291] = getOpcodeRep((char)0, Character.MAX_VALUE, 1292);
        {int[] a = {1293,1294}; op[1292] = getOpcodeCat(a);}
        op[1293] = getOpcodeRnm(177, 1404); // value-separator
        {int[] a = {1295,1296,1297,1298,1299}; op[1294] = getOpcodeAlt(a);}
        op[1295] = getOpcodeRnm(165, 1330); // annotationInUri
        op[1296] = getOpcodeRnm(166, 1342); // primitivePropertyInUri
        op[1297] = getOpcodeRnm(164, 1324); // complexPropertyInUri
        op[1298] = getOpcodeRnm(162, 1301); // collectionPropertyInUri
        op[1299] = getOpcodeRnm(167, 1348); // navigationPropertyInUri
        op[1300] = getOpcodeRnm(172, 1379); // end-object
        {int[] a = {1302,1308}; op[1301] = getOpcodeAlt(a);}
        {int[] a = {1303,1304,1305,1306,1307}; op[1302] = getOpcodeCat(a);}
        op[1303] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1304] = getOpcodeRnm(209, 1567); // primitiveColProperty
        op[1305] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1306] = getOpcodeRnm(176, 1400); // name-separator
        op[1307] = getOpcodeRnm(163, 1314); // primitiveColInUri
        {int[] a = {1309,1310,1311,1312,1313}; op[1308] = getOpcodeCat(a);}
        op[1309] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1310] = getOpcodeRnm(211, 1569); // complexColProperty
        op[1311] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1312] = getOpcodeRnm(176, 1400); // name-separator
        op[1313] = getOpcodeRnm(160, 1271); // complexColInUri
        {int[] a = {1315,1316,1323}; op[1314] = getOpcodeCat(a);}
        op[1315] = getOpcodeRnm(173, 1385); // begin-array
        op[1316] = getOpcodeRep((char)0, (char)1, 1317);
        {int[] a = {1318,1319}; op[1317] = getOpcodeCat(a);}
        op[1318] = getOpcodeRnm(178, 1408); // primitiveLiteralInJSON
        op[1319] = getOpcodeRep((char)0, Character.MAX_VALUE, 1320);
        {int[] a = {1321,1322}; op[1320] = getOpcodeCat(a);}
        op[1321] = getOpcodeRnm(177, 1404); // value-separator
        op[1322] = getOpcodeRnm(178, 1408); // primitiveLiteralInJSON
        op[1323] = getOpcodeRnm(174, 1391); // end-array
        {int[] a = {1325,1326,1327,1328,1329}; op[1324] = getOpcodeCat(a);}
        op[1325] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1326] = getOpcodeRnm(210, 1568); // complexProperty
        op[1327] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1328] = getOpcodeRnm(176, 1400); // name-separator
        op[1329] = getOpcodeRnm(161, 1281); // complexInUri
        {int[] a = {1331,1332,1333,1334,1335,1336,1337}; op[1330] = getOpcodeCat(a);}
        op[1331] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1332] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[1333] = getOpcodeTls(a);}
        op[1334] = getOpcodeRnm(199, 1514); // termName
        op[1335] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1336] = getOpcodeRnm(176, 1400); // name-separator
        {int[] a = {1338,1339,1340,1341}; op[1337] = getOpcodeAlt(a);}
        op[1338] = getOpcodeRnm(161, 1281); // complexInUri
        op[1339] = getOpcodeRnm(160, 1271); // complexColInUri
        op[1340] = getOpcodeRnm(178, 1408); // primitiveLiteralInJSON
        op[1341] = getOpcodeRnm(163, 1314); // primitiveColInUri
        {int[] a = {1343,1344,1345,1346,1347}; op[1342] = getOpcodeCat(a);}
        op[1343] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1344] = getOpcodeRnm(206, 1562); // primitiveProperty
        op[1345] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1346] = getOpcodeRnm(176, 1400); // name-separator
        op[1347] = getOpcodeRnm(178, 1408); // primitiveLiteralInJSON
        {int[] a = {1349,1350}; op[1348] = getOpcodeAlt(a);}
        op[1349] = getOpcodeRnm(168, 1351); // singleNavPropInJSON
        op[1350] = getOpcodeRnm(169, 1357); // collectionNavPropInJSON
        {int[] a = {1352,1353,1354,1355,1356}; op[1351] = getOpcodeCat(a);}
        op[1352] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1353] = getOpcodeRnm(214, 1574); // entityNavigationProperty
        op[1354] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1355] = getOpcodeRnm(176, 1400); // name-separator
        op[1356] = getOpcodeRnm(88, 710); // rootExpr
        {int[] a = {1358,1359,1360,1361,1362}; op[1357] = getOpcodeCat(a);}
        op[1358] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1359] = getOpcodeRnm(215, 1575); // entityColNavigationProperty
        op[1360] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1361] = getOpcodeRnm(176, 1400); // name-separator
        op[1362] = getOpcodeRnm(170, 1363); // rootExprCol
        {int[] a = {1364,1365,1372}; op[1363] = getOpcodeCat(a);}
        op[1364] = getOpcodeRnm(173, 1385); // begin-array
        op[1365] = getOpcodeRep((char)0, (char)1, 1366);
        {int[] a = {1367,1368}; op[1366] = getOpcodeCat(a);}
        op[1367] = getOpcodeRnm(88, 710); // rootExpr
        op[1368] = getOpcodeRep((char)0, Character.MAX_VALUE, 1369);
        {int[] a = {1370,1371}; op[1369] = getOpcodeCat(a);}
        op[1370] = getOpcodeRnm(177, 1404); // value-separator
        op[1371] = getOpcodeRnm(88, 710); // rootExpr
        op[1372] = getOpcodeRnm(174, 1391); // end-array
        {int[] a = {1374,1375,1378}; op[1373] = getOpcodeCat(a);}
        op[1374] = getOpcodeRnm(329, 2216); // BWS
        {int[] a = {1376,1377}; op[1375] = getOpcodeAlt(a);}
        {char[] a = {123}; op[1376] = getOpcodeTls(a);}
        {char[] a = {37,55,66}; op[1377] = getOpcodeTls(a);}
        op[1378] = getOpcodeRnm(329, 2216); // BWS
        {int[] a = {1380,1381,1384}; op[1379] = getOpcodeCat(a);}
        op[1380] = getOpcodeRnm(329, 2216); // BWS
        {int[] a = {1382,1383}; op[1381] = getOpcodeAlt(a);}
        {char[] a = {125}; op[1382] = getOpcodeTls(a);}
        {char[] a = {37,55,68}; op[1383] = getOpcodeTls(a);}
        op[1384] = getOpcodeRnm(329, 2216); // BWS
        {int[] a = {1386,1387,1390}; op[1385] = getOpcodeCat(a);}
        op[1386] = getOpcodeRnm(329, 2216); // BWS
        {int[] a = {1388,1389}; op[1387] = getOpcodeAlt(a);}
        {char[] a = {91}; op[1388] = getOpcodeTls(a);}
        {char[] a = {37,53,66}; op[1389] = getOpcodeTls(a);}
        op[1390] = getOpcodeRnm(329, 2216); // BWS
        {int[] a = {1392,1393,1396}; op[1391] = getOpcodeCat(a);}
        op[1392] = getOpcodeRnm(329, 2216); // BWS
        {int[] a = {1394,1395}; op[1393] = getOpcodeAlt(a);}
        {char[] a = {93}; op[1394] = getOpcodeTls(a);}
        {char[] a = {37,53,68}; op[1395] = getOpcodeTls(a);}
        op[1396] = getOpcodeRnm(329, 2216); // BWS
        {int[] a = {1398,1399}; op[1397] = getOpcodeAlt(a);}
        op[1398] = getOpcodeRnm(381, 2646); // DQUOTE
        {char[] a = {37,50,50}; op[1399] = getOpcodeTls(a);}
        {int[] a = {1401,1402,1403}; op[1400] = getOpcodeCat(a);}
        op[1401] = getOpcodeRnm(329, 2216); // BWS
        op[1402] = getOpcodeRnm(331, 2220); // COLON
        op[1403] = getOpcodeRnm(329, 2216); // BWS
        {int[] a = {1405,1406,1407}; op[1404] = getOpcodeCat(a);}
        op[1405] = getOpcodeRnm(329, 2216); // BWS
        op[1406] = getOpcodeRnm(332, 2223); // COMMA
        op[1407] = getOpcodeRnm(329, 2216); // BWS
        {int[] a = {1409,1410,1411,1412,1413}; op[1408] = getOpcodeAlt(a);}
        op[1409] = getOpcodeRnm(179, 1414); // stringInJSON
        op[1410] = getOpcodeRnm(183, 1449); // numberInJSON
        {char[] a = {116,114,117,101}; op[1411] = getOpcodeTbs(a);}
        {char[] a = {102,97,108,115,101}; op[1412] = getOpcodeTbs(a);}
        {char[] a = {110,117,108,108}; op[1413] = getOpcodeTbs(a);}
        {int[] a = {1415,1416,1418}; op[1414] = getOpcodeCat(a);}
        op[1415] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1416] = getOpcodeRep((char)0, Character.MAX_VALUE, 1417);
        op[1417] = getOpcodeRnm(180, 1419); // charInJSON
        op[1418] = getOpcodeRnm(175, 1397); // quotation-mark
        {int[] a = {1420,1421,1422}; op[1419] = getOpcodeAlt(a);}
        op[1420] = getOpcodeRnm(372, 2571); // qchar-unescaped
        op[1421] = getOpcodeRnm(181, 1439); // qchar-JSON-special
        {int[] a = {1423,1424}; op[1422] = getOpcodeCat(a);}
        op[1423] = getOpcodeRnm(182, 1446); // escape
        {int[] a = {1425,1426,1427,1430,1431,1432,1433,1434,1435}; op[1424] = getOpcodeAlt(a);}
        op[1425] = getOpcodeRnm(175, 1397); // quotation-mark
        op[1426] = getOpcodeRnm(182, 1446); // escape
        {int[] a = {1428,1429}; op[1427] = getOpcodeAlt(a);}
        {char[] a = {47}; op[1428] = getOpcodeTls(a);}
        {char[] a = {37,50,70}; op[1429] = getOpcodeTls(a);}
        {char[] a = {98}; op[1430] = getOpcodeTbs(a);}
        {char[] a = {102}; op[1431] = getOpcodeTbs(a);}
        {char[] a = {110}; op[1432] = getOpcodeTbs(a);}
        {char[] a = {114}; op[1433] = getOpcodeTbs(a);}
        {char[] a = {116}; op[1434] = getOpcodeTbs(a);}
        {int[] a = {1436,1437}; op[1435] = getOpcodeCat(a);}
        {char[] a = {117}; op[1436] = getOpcodeTbs(a);}
        op[1437] = getOpcodeRep((char)4, (char)4, 1438);
        op[1438] = getOpcodeRnm(379, 2636); // HEXDIG
        {int[] a = {1440,1441,1442,1443,1444,1445}; op[1439] = getOpcodeAlt(a);}
        op[1440] = getOpcodeRnm(382, 2647); // SP
        {char[] a = {58}; op[1441] = getOpcodeTls(a);}
        {char[] a = {123}; op[1442] = getOpcodeTls(a);}
        {char[] a = {125}; op[1443] = getOpcodeTls(a);}
        {char[] a = {91}; op[1444] = getOpcodeTls(a);}
        {char[] a = {93}; op[1445] = getOpcodeTls(a);}
        {int[] a = {1447,1448}; op[1446] = getOpcodeAlt(a);}
        {char[] a = {92}; op[1447] = getOpcodeTls(a);}
        {char[] a = {37,53,67}; op[1448] = getOpcodeTls(a);}
        {int[] a = {1450,1452,1453,1455}; op[1449] = getOpcodeCat(a);}
        op[1450] = getOpcodeRep((char)0, (char)1, 1451);
        {char[] a = {45}; op[1451] = getOpcodeTls(a);}
        op[1452] = getOpcodeRnm(184, 1457); // int
        op[1453] = getOpcodeRep((char)0, (char)1, 1454);
        op[1454] = getOpcodeRnm(185, 1463); // frac
        op[1455] = getOpcodeRep((char)0, (char)1, 1456);
        op[1456] = getOpcodeRnm(186, 1467); // exp
        {int[] a = {1458,1459}; op[1457] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1458] = getOpcodeTls(a);}
        {int[] a = {1460,1461}; op[1459] = getOpcodeCat(a);}
        op[1460] = getOpcodeRnm(258, 1824); // oneToNine
        op[1461] = getOpcodeRep((char)0, Character.MAX_VALUE, 1462);
        op[1462] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1464,1465}; op[1463] = getOpcodeCat(a);}
        {char[] a = {46}; op[1464] = getOpcodeTls(a);}
        op[1465] = getOpcodeRep((char)1, Character.MAX_VALUE, 1466);
        op[1466] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1468,1469,1473}; op[1467] = getOpcodeCat(a);}
        {char[] a = {101}; op[1468] = getOpcodeTls(a);}
        op[1469] = getOpcodeRep((char)0, (char)1, 1470);
        {int[] a = {1471,1472}; op[1470] = getOpcodeAlt(a);}
        {char[] a = {45}; op[1471] = getOpcodeTls(a);}
        {char[] a = {43}; op[1472] = getOpcodeTls(a);}
        op[1473] = getOpcodeRep((char)1, Character.MAX_VALUE, 1474);
        op[1474] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1476,1477,1478,1479,1480}; op[1475] = getOpcodeAlt(a);}
        op[1476] = getOpcodeRnm(188, 1489); // qualifiedEntityTypeName
        op[1477] = getOpcodeRnm(189, 1493); // qualifiedComplexTypeName
        op[1478] = getOpcodeRnm(190, 1497); // qualifiedEnumTypeName
        op[1479] = getOpcodeRnm(203, 1526); // primitiveTypeName
        {int[] a = {1481,1482,1483,1488}; op[1480] = getOpcodeCat(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110}; op[1481] = getOpcodeTbs(a);}
        op[1482] = getOpcodeRnm(338, 2240); // OPEN
        {int[] a = {1484,1485,1486,1487}; op[1483] = getOpcodeAlt(a);}
        op[1484] = getOpcodeRnm(188, 1489); // qualifiedEntityTypeName
        op[1485] = getOpcodeRnm(189, 1493); // qualifiedComplexTypeName
        op[1486] = getOpcodeRnm(190, 1497); // qualifiedEnumTypeName
        op[1487] = getOpcodeRnm(203, 1526); // primitiveTypeName
        op[1488] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1490,1491,1492}; op[1489] = getOpcodeCat(a);}
        op[1490] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[1491] = getOpcodeTls(a);}
        op[1492] = getOpcodeRnm(195, 1510); // entityTypeName
        {int[] a = {1494,1495,1496}; op[1493] = getOpcodeCat(a);}
        op[1494] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[1495] = getOpcodeTls(a);}
        op[1496] = getOpcodeRnm(196, 1511); // complexTypeName
        {int[] a = {1498,1499,1500}; op[1497] = getOpcodeCat(a);}
        op[1498] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[1499] = getOpcodeTls(a);}
        op[1500] = getOpcodeRnm(197, 1512); // enumerationTypeName
        {int[] a = {1502,1503}; op[1501] = getOpcodeCat(a);}
        op[1502] = getOpcodeRnm(192, 1507); // namespacePart
        op[1503] = getOpcodeRep((char)0, Character.MAX_VALUE, 1504);
        {int[] a = {1505,1506}; op[1504] = getOpcodeCat(a);}
        {char[] a = {46}; op[1505] = getOpcodeTls(a);}
        op[1506] = getOpcodeRnm(192, 1507); // namespacePart
        op[1507] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1508] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1509] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1510] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1511] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1512] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1513] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1514] = getOpcodeRnm(200, 1515); // odataIdentifier
        {int[] a = {1516,1517}; op[1515] = getOpcodeCat(a);}
        op[1516] = getOpcodeRnm(201, 1519); // identifierLeadingCharacter
        op[1517] = getOpcodeRep((char)0, (char)127, 1518);
        op[1518] = getOpcodeRnm(202, 1522); // identifierCharacter
        {int[] a = {1520,1521}; op[1519] = getOpcodeAlt(a);}
        op[1520] = getOpcodeRnm(377, 2632); // ALPHA
        {char[] a = {95}; op[1521] = getOpcodeTls(a);}
        {int[] a = {1523,1524,1525}; op[1522] = getOpcodeAlt(a);}
        op[1523] = getOpcodeRnm(377, 2632); // ALPHA
        {char[] a = {95}; op[1524] = getOpcodeTls(a);}
        op[1525] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1527,1529}; op[1526] = getOpcodeCat(a);}
        op[1527] = getOpcodeRep((char)0, (char)1, 1528);
        {char[] a = {69,100,109,46}; op[1528] = getOpcodeTbs(a);}
        {int[] a = {1530,1531,1532,1533,1534,1535,1536,1537,1538,1539,1540,1541,1542,1543,1544,1545,1546,1547}; op[1529] = getOpcodeAlt(a);}
        {char[] a = {66,105,110,97,114,121}; op[1530] = getOpcodeTbs(a);}
        {char[] a = {66,111,111,108,101,97,110}; op[1531] = getOpcodeTbs(a);}
        {char[] a = {66,121,116,101}; op[1532] = getOpcodeTbs(a);}
        {char[] a = {68,97,116,101}; op[1533] = getOpcodeTbs(a);}
        {char[] a = {68,97,116,101,84,105,109,101,79,102,102,115,101,116}; op[1534] = getOpcodeTbs(a);}
        {char[] a = {68,101,99,105,109,97,108}; op[1535] = getOpcodeTbs(a);}
        {char[] a = {68,111,117,98,108,101}; op[1536] = getOpcodeTbs(a);}
        {char[] a = {68,117,114,97,116,105,111,110}; op[1537] = getOpcodeTbs(a);}
        {char[] a = {71,117,105,100}; op[1538] = getOpcodeTbs(a);}
        {char[] a = {73,110,116,49,54}; op[1539] = getOpcodeTbs(a);}
        {char[] a = {73,110,116,51,50}; op[1540] = getOpcodeTbs(a);}
        {char[] a = {73,110,116,54,52}; op[1541] = getOpcodeTbs(a);}
        {char[] a = {83,66,121,116,101}; op[1542] = getOpcodeTbs(a);}
        {char[] a = {83,105,110,103,108,101}; op[1543] = getOpcodeTbs(a);}
        {char[] a = {83,116,114,101,97,109}; op[1544] = getOpcodeTbs(a);}
        {char[] a = {83,116,114,105,110,103}; op[1545] = getOpcodeTbs(a);}
        {char[] a = {84,105,109,101,79,102,68,97,121}; op[1546] = getOpcodeTbs(a);}
        {int[] a = {1548,1549}; op[1547] = getOpcodeCat(a);}
        op[1548] = getOpcodeRnm(204, 1551); // abstractSpatialTypeName
        op[1549] = getOpcodeRep((char)0, (char)1, 1550);
        op[1550] = getOpcodeRnm(205, 1554); // concreteSpatialTypeName
        {int[] a = {1552,1553}; op[1551] = getOpcodeAlt(a);}
        {char[] a = {71,101,111,103,114,97,112,104,121}; op[1552] = getOpcodeTbs(a);}
        {char[] a = {71,101,111,109,101,116,114,121}; op[1553] = getOpcodeTbs(a);}
        {int[] a = {1555,1556,1557,1558,1559,1560,1561}; op[1554] = getOpcodeAlt(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110}; op[1555] = getOpcodeTbs(a);}
        {char[] a = {76,105,110,101,83,116,114,105,110,103}; op[1556] = getOpcodeTbs(a);}
        {char[] a = {77,117,108,116,105,76,105,110,101,83,116,114,105,110,103}; op[1557] = getOpcodeTbs(a);}
        {char[] a = {77,117,108,116,105,80,111,105,110,116}; op[1558] = getOpcodeTbs(a);}
        {char[] a = {77,117,108,116,105,80,111,108,121,103,111,110}; op[1559] = getOpcodeTbs(a);}
        {char[] a = {80,111,105,110,116}; op[1560] = getOpcodeTbs(a);}
        {char[] a = {80,111,108,121,103,111,110}; op[1561] = getOpcodeTbs(a);}
        {int[] a = {1563,1564}; op[1562] = getOpcodeAlt(a);}
        op[1563] = getOpcodeRnm(207, 1565); // primitiveKeyProperty
        op[1564] = getOpcodeRnm(208, 1566); // primitiveNonKeyProperty
        op[1565] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1566] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1567] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1568] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1569] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1570] = getOpcodeRnm(200, 1515); // odataIdentifier
        {int[] a = {1572,1573}; op[1571] = getOpcodeAlt(a);}
        op[1572] = getOpcodeRnm(214, 1574); // entityNavigationProperty
        op[1573] = getOpcodeRnm(215, 1575); // entityColNavigationProperty
        op[1574] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1575] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1576] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1577] = getOpcodeRnm(200, 1515); // odataIdentifier
        {int[] a = {1579,1580,1581,1582,1583,1584}; op[1578] = getOpcodeAlt(a);}
        op[1579] = getOpcodeRnm(219, 1585); // entityFunction
        op[1580] = getOpcodeRnm(220, 1586); // entityColFunction
        op[1581] = getOpcodeRnm(221, 1587); // complexFunction
        op[1582] = getOpcodeRnm(222, 1588); // complexColFunction
        op[1583] = getOpcodeRnm(223, 1589); // primitiveFunction
        op[1584] = getOpcodeRnm(224, 1590); // primitiveColFunction
        op[1585] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1586] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1587] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1588] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1589] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1590] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1591] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1592] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1593] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1594] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1595] = getOpcodeRnm(200, 1515); // odataIdentifier
        op[1596] = getOpcodeRnm(200, 1515); // odataIdentifier
        {int[] a = {1598,1599,1600,1601,1602,1603,1604,1605,1606,1607,1608,1609,1610,1611,1612,1613,1614,1615,1616,1617,1618,1619,1620,1621,1622,1623,1624,1625,1626,1627,1628,1629}; op[1597] = getOpcodeAlt(a);}
        op[1598] = getOpcodeRnm(232, 1630); // null
        op[1599] = getOpcodeRnm(236, 1648); // booleanValue
        op[1600] = getOpcodeRnm(237, 1651); // decimalValue
        op[1601] = getOpcodeRnm(238, 1661); // doubleValue
        op[1602] = getOpcodeRnm(239, 1672); // singleValue
        op[1603] = getOpcodeRnm(244, 1699); // sbyteValue
        op[1604] = getOpcodeRnm(243, 1697); // byteValue
        op[1605] = getOpcodeRnm(245, 1704); // int16Value
        op[1606] = getOpcodeRnm(246, 1709); // int32Value
        op[1607] = getOpcodeRnm(247, 1714); // int64Value
        op[1608] = getOpcodeRnm(234, 1638); // binary
        op[1609] = getOpcodeRnm(250, 1729); // date
        op[1610] = getOpcodeRnm(252, 1740); // dateTimeOffset
        op[1611] = getOpcodeRnm(254, 1770); // duration
        op[1612] = getOpcodeRnm(241, 1677); // guid
        op[1613] = getOpcodeRnm(248, 1719); // string
        op[1614] = getOpcodeRnm(256, 1807); // timeOfDay
        op[1615] = getOpcodeRnm(267, 1893); // enum
        op[1616] = getOpcodeRnm(270, 1907); // geographyCollection
        op[1617] = getOpcodeRnm(274, 1931); // geographyLineString
        op[1618] = getOpcodeRnm(278, 1950); // geographyMultiLineString
        op[1619] = getOpcodeRnm(281, 1968); // geographyMultiPoint
        op[1620] = getOpcodeRnm(284, 1986); // geographyMultiPolygon
        op[1621] = getOpcodeRnm(287, 2004); // geographyPoint
        op[1622] = getOpcodeRnm(293, 2029); // geographyPolygon
        op[1623] = getOpcodeRnm(298, 2056); // geometryCollection
        op[1624] = getOpcodeRnm(299, 2061); // geometryLineString
        op[1625] = getOpcodeRnm(300, 2066); // geometryMultiLineString
        op[1626] = getOpcodeRnm(301, 2071); // geometryMultiPoint
        op[1627] = getOpcodeRnm(302, 2076); // geometryMultiPolygon
        op[1628] = getOpcodeRnm(303, 2081); // geometryPoint
        op[1629] = getOpcodeRnm(304, 2086); // geometryPolygon
        {int[] a = {1631,1632}; op[1630] = getOpcodeCat(a);}
        op[1631] = getOpcodeRnm(233, 1637); // nullValue
        op[1632] = getOpcodeRep((char)0, (char)1, 1633);
        {int[] a = {1634,1635,1636}; op[1633] = getOpcodeCat(a);}
        op[1634] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1635] = getOpcodeRnm(187, 1475); // qualifiedTypeName
        op[1636] = getOpcodeRnm(337, 2237); // SQUOTE
        {char[] a = {110,117,108,108}; op[1637] = getOpcodeTbs(a);}
        {int[] a = {1639,1642,1643,1644}; op[1638] = getOpcodeCat(a);}
        {int[] a = {1640,1641}; op[1639] = getOpcodeAlt(a);}
        {char[] a = {88}; op[1640] = getOpcodeTbs(a);}
        {char[] a = {98,105,110,97,114,121}; op[1641] = getOpcodeTls(a);}
        op[1642] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1643] = getOpcodeRnm(235, 1645); // binaryValue
        op[1644] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1645] = getOpcodeRep((char)0, Character.MAX_VALUE, 1646);
        op[1646] = getOpcodeRep((char)2, (char)2, 1647);
        op[1647] = getOpcodeRnm(379, 2636); // HEXDIG
        {int[] a = {1649,1650}; op[1648] = getOpcodeAlt(a);}
        {char[] a = {116,114,117,101}; op[1649] = getOpcodeTls(a);}
        {char[] a = {102,97,108,115,101}; op[1650] = getOpcodeTls(a);}
        {int[] a = {1652,1654,1656}; op[1651] = getOpcodeCat(a);}
        op[1652] = getOpcodeRep((char)0, (char)1, 1653);
        op[1653] = getOpcodeRnm(334, 2227); // SIGN
        op[1654] = getOpcodeRep((char)1, Character.MAX_VALUE, 1655);
        op[1655] = getOpcodeRnm(378, 2635); // DIGIT
        op[1656] = getOpcodeRep((char)0, (char)1, 1657);
        {int[] a = {1658,1659}; op[1657] = getOpcodeCat(a);}
        {char[] a = {46}; op[1658] = getOpcodeTls(a);}
        op[1659] = getOpcodeRep((char)1, Character.MAX_VALUE, 1660);
        op[1660] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1662,1671}; op[1661] = getOpcodeAlt(a);}
        {int[] a = {1663,1664}; op[1662] = getOpcodeCat(a);}
        op[1663] = getOpcodeRnm(237, 1651); // decimalValue
        op[1664] = getOpcodeRep((char)0, (char)1, 1665);
        {int[] a = {1666,1667,1669}; op[1665] = getOpcodeCat(a);}
        {char[] a = {101}; op[1666] = getOpcodeTls(a);}
        op[1667] = getOpcodeRep((char)0, (char)1, 1668);
        op[1668] = getOpcodeRnm(334, 2227); // SIGN
        op[1669] = getOpcodeRep((char)1, Character.MAX_VALUE, 1670);
        op[1670] = getOpcodeRnm(378, 2635); // DIGIT
        op[1671] = getOpcodeRnm(240, 1673); // nanInfinity
        op[1672] = getOpcodeRnm(238, 1661); // doubleValue
        {int[] a = {1674,1675,1676}; op[1673] = getOpcodeAlt(a);}
        {char[] a = {78,97,78}; op[1674] = getOpcodeTbs(a);}
        {char[] a = {45,73,78,70}; op[1675] = getOpcodeTbs(a);}
        {char[] a = {73,78,70}; op[1676] = getOpcodeTbs(a);}
        {int[] a = {1678,1679,1680,1681}; op[1677] = getOpcodeCat(a);}
        {char[] a = {103,117,105,100}; op[1678] = getOpcodeTls(a);}
        op[1679] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1680] = getOpcodeRnm(242, 1682); // guidValue
        op[1681] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {1683,1685,1686,1688,1689,1691,1692,1694,1695}; op[1682] = getOpcodeCat(a);}
        op[1683] = getOpcodeRep((char)8, (char)8, 1684);
        op[1684] = getOpcodeRnm(379, 2636); // HEXDIG
        {char[] a = {45}; op[1685] = getOpcodeTls(a);}
        op[1686] = getOpcodeRep((char)4, (char)4, 1687);
        op[1687] = getOpcodeRnm(379, 2636); // HEXDIG
        {char[] a = {45}; op[1688] = getOpcodeTls(a);}
        op[1689] = getOpcodeRep((char)4, (char)4, 1690);
        op[1690] = getOpcodeRnm(379, 2636); // HEXDIG
        {char[] a = {45}; op[1691] = getOpcodeTls(a);}
        op[1692] = getOpcodeRep((char)4, (char)4, 1693);
        op[1693] = getOpcodeRnm(379, 2636); // HEXDIG
        {char[] a = {45}; op[1694] = getOpcodeTls(a);}
        op[1695] = getOpcodeRep((char)12, (char)12, 1696);
        op[1696] = getOpcodeRnm(379, 2636); // HEXDIG
        op[1697] = getOpcodeRep((char)1, (char)3, 1698);
        op[1698] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1700,1702}; op[1699] = getOpcodeCat(a);}
        op[1700] = getOpcodeRep((char)0, (char)1, 1701);
        op[1701] = getOpcodeRnm(334, 2227); // SIGN
        op[1702] = getOpcodeRep((char)1, (char)3, 1703);
        op[1703] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1705,1707}; op[1704] = getOpcodeCat(a);}
        op[1705] = getOpcodeRep((char)0, (char)1, 1706);
        op[1706] = getOpcodeRnm(334, 2227); // SIGN
        op[1707] = getOpcodeRep((char)1, (char)5, 1708);
        op[1708] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1710,1712}; op[1709] = getOpcodeCat(a);}
        op[1710] = getOpcodeRep((char)0, (char)1, 1711);
        op[1711] = getOpcodeRnm(334, 2227); // SIGN
        op[1712] = getOpcodeRep((char)1, (char)10, 1713);
        op[1713] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1715,1717}; op[1714] = getOpcodeCat(a);}
        op[1715] = getOpcodeRep((char)0, (char)1, 1716);
        op[1716] = getOpcodeRnm(334, 2227); // SIGN
        op[1717] = getOpcodeRep((char)1, (char)19, 1718);
        op[1718] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1720,1721,1725}; op[1719] = getOpcodeCat(a);}
        op[1720] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1721] = getOpcodeRep((char)0, Character.MAX_VALUE, 1722);
        {int[] a = {1723,1724}; op[1722] = getOpcodeAlt(a);}
        op[1723] = getOpcodeRnm(249, 1726); // SQUOTE-in-string
        op[1724] = getOpcodeRnm(367, 2505); // pchar-no-SQUOTE
        op[1725] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {1727,1728}; op[1726] = getOpcodeCat(a);}
        op[1727] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1728] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {1730,1731,1732,1733}; op[1729] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101}; op[1730] = getOpcodeTls(a);}
        op[1731] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1732] = getOpcodeRnm(251, 1734); // dateValue
        op[1733] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {1735,1736,1737,1738,1739}; op[1734] = getOpcodeCat(a);}
        op[1735] = getOpcodeRnm(260, 1843); // year
        {char[] a = {45}; op[1736] = getOpcodeTls(a);}
        op[1737] = getOpcodeRnm(261, 1855); // month
        {char[] a = {45}; op[1738] = getOpcodeTls(a);}
        op[1739] = getOpcodeRnm(262, 1865); // day
        {int[] a = {1741,1742,1743,1744}; op[1740] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[1741] = getOpcodeTls(a);}
        op[1742] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1743] = getOpcodeRnm(253, 1745); // dateTimeOffsetValue
        op[1744] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {1746,1747,1748,1749,1750,1751,1752,1753,1754,1755,1763}; op[1745] = getOpcodeCat(a);}
        op[1746] = getOpcodeRnm(260, 1843); // year
        {char[] a = {45}; op[1747] = getOpcodeTls(a);}
        op[1748] = getOpcodeRnm(261, 1855); // month
        {char[] a = {45}; op[1749] = getOpcodeTls(a);}
        op[1750] = getOpcodeRnm(262, 1865); // day
        {char[] a = {84}; op[1751] = getOpcodeTls(a);}
        op[1752] = getOpcodeRnm(263, 1877); // hour
        {char[] a = {58}; op[1753] = getOpcodeTls(a);}
        op[1754] = getOpcodeRnm(264, 1889); // minute
        op[1755] = getOpcodeRep((char)0, (char)1, 1756);
        {int[] a = {1757,1758,1759}; op[1756] = getOpcodeCat(a);}
        {char[] a = {58}; op[1757] = getOpcodeTls(a);}
        op[1758] = getOpcodeRnm(265, 1890); // second
        op[1759] = getOpcodeRep((char)0, (char)1, 1760);
        {int[] a = {1761,1762}; op[1760] = getOpcodeCat(a);}
        {char[] a = {46}; op[1761] = getOpcodeTls(a);}
        op[1762] = getOpcodeRnm(266, 1891); // fractionalSeconds
        {int[] a = {1764,1765}; op[1763] = getOpcodeAlt(a);}
        {char[] a = {90}; op[1764] = getOpcodeTls(a);}
        {int[] a = {1766,1767,1768,1769}; op[1765] = getOpcodeCat(a);}
        op[1766] = getOpcodeRnm(334, 2227); // SIGN
        op[1767] = getOpcodeRnm(263, 1877); // hour
        {char[] a = {58}; op[1768] = getOpcodeTls(a);}
        op[1769] = getOpcodeRnm(264, 1889); // minute
        {int[] a = {1771,1772,1773,1774}; op[1770] = getOpcodeCat(a);}
        {char[] a = {100,117,114,97,116,105,111,110}; op[1771] = getOpcodeTls(a);}
        op[1772] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1773] = getOpcodeRnm(255, 1775); // durationValue
        op[1774] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {1776,1778,1779,1784}; op[1775] = getOpcodeCat(a);}
        op[1776] = getOpcodeRep((char)0, (char)1, 1777);
        op[1777] = getOpcodeRnm(334, 2227); // SIGN
        {char[] a = {80}; op[1778] = getOpcodeTls(a);}
        op[1779] = getOpcodeRep((char)0, (char)1, 1780);
        {int[] a = {1781,1783}; op[1780] = getOpcodeCat(a);}
        op[1781] = getOpcodeRep((char)1, Character.MAX_VALUE, 1782);
        op[1782] = getOpcodeRnm(378, 2635); // DIGIT
        {char[] a = {68}; op[1783] = getOpcodeTls(a);}
        op[1784] = getOpcodeRep((char)0, (char)1, 1785);
        {int[] a = {1786,1787,1792,1797}; op[1785] = getOpcodeCat(a);}
        {char[] a = {84}; op[1786] = getOpcodeTls(a);}
        op[1787] = getOpcodeRep((char)0, (char)1, 1788);
        {int[] a = {1789,1791}; op[1788] = getOpcodeCat(a);}
        op[1789] = getOpcodeRep((char)1, Character.MAX_VALUE, 1790);
        op[1790] = getOpcodeRnm(378, 2635); // DIGIT
        {char[] a = {72}; op[1791] = getOpcodeTls(a);}
        op[1792] = getOpcodeRep((char)0, (char)1, 1793);
        {int[] a = {1794,1796}; op[1793] = getOpcodeCat(a);}
        op[1794] = getOpcodeRep((char)1, Character.MAX_VALUE, 1795);
        op[1795] = getOpcodeRnm(378, 2635); // DIGIT
        {char[] a = {77}; op[1796] = getOpcodeTls(a);}
        op[1797] = getOpcodeRep((char)0, (char)1, 1798);
        {int[] a = {1799,1801,1806}; op[1798] = getOpcodeCat(a);}
        op[1799] = getOpcodeRep((char)1, Character.MAX_VALUE, 1800);
        op[1800] = getOpcodeRnm(378, 2635); // DIGIT
        op[1801] = getOpcodeRep((char)0, (char)1, 1802);
        {int[] a = {1803,1804}; op[1802] = getOpcodeCat(a);}
        {char[] a = {46}; op[1803] = getOpcodeTls(a);}
        op[1804] = getOpcodeRep((char)1, Character.MAX_VALUE, 1805);
        op[1805] = getOpcodeRnm(378, 2635); // DIGIT
        {char[] a = {83}; op[1806] = getOpcodeTls(a);}
        {int[] a = {1808,1809,1810,1811}; op[1807] = getOpcodeCat(a);}
        {char[] a = {116,105,109,101,111,102,100,97,121}; op[1808] = getOpcodeTls(a);}
        op[1809] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1810] = getOpcodeRnm(257, 1812); // timeOfDayValue
        op[1811] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {1813,1814,1815,1816}; op[1812] = getOpcodeCat(a);}
        op[1813] = getOpcodeRnm(263, 1877); // hour
        {char[] a = {58}; op[1814] = getOpcodeTls(a);}
        op[1815] = getOpcodeRnm(264, 1889); // minute
        op[1816] = getOpcodeRep((char)0, (char)1, 1817);
        {int[] a = {1818,1819,1820}; op[1817] = getOpcodeCat(a);}
        {char[] a = {58}; op[1818] = getOpcodeTls(a);}
        op[1819] = getOpcodeRnm(265, 1890); // second
        op[1820] = getOpcodeRep((char)0, (char)1, 1821);
        {int[] a = {1822,1823}; op[1821] = getOpcodeCat(a);}
        {char[] a = {46}; op[1822] = getOpcodeTls(a);}
        op[1823] = getOpcodeRnm(266, 1891); // fractionalSeconds
        {int[] a = {1825,1826,1827,1828,1829,1830,1831,1832,1833}; op[1824] = getOpcodeAlt(a);}
        {char[] a = {49}; op[1825] = getOpcodeTls(a);}
        {char[] a = {50}; op[1826] = getOpcodeTls(a);}
        {char[] a = {51}; op[1827] = getOpcodeTls(a);}
        {char[] a = {52}; op[1828] = getOpcodeTls(a);}
        {char[] a = {53}; op[1829] = getOpcodeTls(a);}
        {char[] a = {54}; op[1830] = getOpcodeTls(a);}
        {char[] a = {55}; op[1831] = getOpcodeTls(a);}
        {char[] a = {56}; op[1832] = getOpcodeTls(a);}
        {char[] a = {57}; op[1833] = getOpcodeTls(a);}
        {int[] a = {1835,1842}; op[1834] = getOpcodeCat(a);}
        {int[] a = {1836,1837,1838,1839,1840,1841}; op[1835] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1836] = getOpcodeTls(a);}
        {char[] a = {49}; op[1837] = getOpcodeTls(a);}
        {char[] a = {50}; op[1838] = getOpcodeTls(a);}
        {char[] a = {51}; op[1839] = getOpcodeTls(a);}
        {char[] a = {52}; op[1840] = getOpcodeTls(a);}
        {char[] a = {53}; op[1841] = getOpcodeTls(a);}
        op[1842] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1844,1846}; op[1843] = getOpcodeCat(a);}
        op[1844] = getOpcodeRep((char)0, (char)1, 1845);
        {char[] a = {45}; op[1845] = getOpcodeTls(a);}
        {int[] a = {1847,1851}; op[1846] = getOpcodeAlt(a);}
        {int[] a = {1848,1849}; op[1847] = getOpcodeCat(a);}
        {char[] a = {48}; op[1848] = getOpcodeTls(a);}
        op[1849] = getOpcodeRep((char)3, (char)3, 1850);
        op[1850] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1852,1853}; op[1851] = getOpcodeCat(a);}
        op[1852] = getOpcodeRnm(258, 1824); // oneToNine
        op[1853] = getOpcodeRep((char)3, Character.MAX_VALUE, 1854);
        op[1854] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1856,1859}; op[1855] = getOpcodeAlt(a);}
        {int[] a = {1857,1858}; op[1856] = getOpcodeCat(a);}
        {char[] a = {48}; op[1857] = getOpcodeTls(a);}
        op[1858] = getOpcodeRnm(258, 1824); // oneToNine
        {int[] a = {1860,1861}; op[1859] = getOpcodeCat(a);}
        {char[] a = {49}; op[1860] = getOpcodeTls(a);}
        {int[] a = {1862,1863,1864}; op[1861] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1862] = getOpcodeTls(a);}
        {char[] a = {49}; op[1863] = getOpcodeTls(a);}
        {char[] a = {50}; op[1864] = getOpcodeTls(a);}
        {int[] a = {1866,1872}; op[1865] = getOpcodeAlt(a);}
        {int[] a = {1867,1871}; op[1866] = getOpcodeCat(a);}
        {int[] a = {1868,1869,1870}; op[1867] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1868] = getOpcodeTls(a);}
        {char[] a = {49}; op[1869] = getOpcodeTls(a);}
        {char[] a = {50}; op[1870] = getOpcodeTls(a);}
        op[1871] = getOpcodeRnm(258, 1824); // oneToNine
        {int[] a = {1873,1874}; op[1872] = getOpcodeCat(a);}
        {char[] a = {51}; op[1873] = getOpcodeTls(a);}
        {int[] a = {1875,1876}; op[1874] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1875] = getOpcodeTls(a);}
        {char[] a = {49}; op[1876] = getOpcodeTls(a);}
        {int[] a = {1878,1883}; op[1877] = getOpcodeAlt(a);}
        {int[] a = {1879,1882}; op[1878] = getOpcodeCat(a);}
        {int[] a = {1880,1881}; op[1879] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1880] = getOpcodeTls(a);}
        {char[] a = {49}; op[1881] = getOpcodeTls(a);}
        op[1882] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1884,1885}; op[1883] = getOpcodeCat(a);}
        {char[] a = {50}; op[1884] = getOpcodeTls(a);}
        {int[] a = {1886,1887,1888}; op[1885] = getOpcodeAlt(a);}
        {char[] a = {49}; op[1886] = getOpcodeTls(a);}
        {char[] a = {50}; op[1887] = getOpcodeTls(a);}
        {char[] a = {51}; op[1888] = getOpcodeTls(a);}
        op[1889] = getOpcodeRnm(259, 1834); // zeroToFiftyNine
        op[1890] = getOpcodeRnm(259, 1834); // zeroToFiftyNine
        op[1891] = getOpcodeRep((char)1, (char)12, 1892);
        op[1892] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {1894,1895,1896,1897}; op[1893] = getOpcodeCat(a);}
        op[1894] = getOpcodeRnm(190, 1497); // qualifiedEnumTypeName
        op[1895] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1896] = getOpcodeRnm(268, 1898); // enumValue
        op[1897] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {1899,1900}; op[1898] = getOpcodeCat(a);}
        op[1899] = getOpcodeRnm(269, 1904); // singleEnumValue
        op[1900] = getOpcodeRep((char)0, Character.MAX_VALUE, 1901);
        {int[] a = {1902,1903}; op[1901] = getOpcodeCat(a);}
        op[1902] = getOpcodeRnm(332, 2223); // COMMA
        op[1903] = getOpcodeRnm(269, 1904); // singleEnumValue
        {int[] a = {1905,1906}; op[1904] = getOpcodeAlt(a);}
        op[1905] = getOpcodeRnm(198, 1513); // enumerationMember
        op[1906] = getOpcodeRnm(247, 1714); // int64Value
        {int[] a = {1908,1909,1910,1911}; op[1907] = getOpcodeCat(a);}
        op[1908] = getOpcodeRnm(305, 2091); // geographyPrefix
        op[1909] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1910] = getOpcodeRnm(271, 1912); // fullCollectionLiteral
        op[1911] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {1913,1914}; op[1912] = getOpcodeCat(a);}
        op[1913] = getOpcodeRnm(289, 2012); // sridLiteral
        op[1914] = getOpcodeRnm(272, 1915); // collectionLiteral
        {int[] a = {1916,1917,1918,1922}; op[1915] = getOpcodeCat(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110,40}; op[1916] = getOpcodeTls(a);}
        op[1917] = getOpcodeRnm(273, 1923); // geoLiteral
        op[1918] = getOpcodeRep((char)0, Character.MAX_VALUE, 1919);
        {int[] a = {1920,1921}; op[1919] = getOpcodeCat(a);}
        op[1920] = getOpcodeRnm(332, 2223); // COMMA
        op[1921] = getOpcodeRnm(273, 1923); // geoLiteral
        op[1922] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1924,1925,1926,1927,1928,1929,1930}; op[1923] = getOpcodeAlt(a);}
        op[1924] = getOpcodeRnm(272, 1915); // collectionLiteral
        op[1925] = getOpcodeRnm(276, 1939); // lineStringLiteral
        op[1926] = getOpcodeRnm(283, 1976); // multiPointLiteral
        op[1927] = getOpcodeRnm(280, 1958); // multiLineStringLiteral
        op[1928] = getOpcodeRnm(286, 1994); // multiPolygonLiteral
        op[1929] = getOpcodeRnm(290, 2018); // pointLiteral
        op[1930] = getOpcodeRnm(295, 2037); // polygonLiteral
        {int[] a = {1932,1933,1934,1935}; op[1931] = getOpcodeCat(a);}
        op[1932] = getOpcodeRnm(305, 2091); // geographyPrefix
        op[1933] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1934] = getOpcodeRnm(275, 1936); // fullLineStringLiteral
        op[1935] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {1937,1938}; op[1936] = getOpcodeCat(a);}
        op[1937] = getOpcodeRnm(289, 2012); // sridLiteral
        op[1938] = getOpcodeRnm(276, 1939); // lineStringLiteral
        {int[] a = {1940,1941}; op[1939] = getOpcodeCat(a);}
        {char[] a = {76,105,110,101,83,116,114,105,110,103}; op[1940] = getOpcodeTls(a);}
        op[1941] = getOpcodeRnm(277, 1942); // lineStringData
        {int[] a = {1943,1944,1945,1949}; op[1942] = getOpcodeCat(a);}
        op[1943] = getOpcodeRnm(338, 2240); // OPEN
        op[1944] = getOpcodeRnm(292, 2025); // positionLiteral
        op[1945] = getOpcodeRep((char)1, Character.MAX_VALUE, 1946);
        {int[] a = {1947,1948}; op[1946] = getOpcodeCat(a);}
        op[1947] = getOpcodeRnm(332, 2223); // COMMA
        op[1948] = getOpcodeRnm(292, 2025); // positionLiteral
        op[1949] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1951,1952,1953,1954}; op[1950] = getOpcodeCat(a);}
        op[1951] = getOpcodeRnm(305, 2091); // geographyPrefix
        op[1952] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1953] = getOpcodeRnm(279, 1955); // fullMultiLineStringLiteral
        op[1954] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {1956,1957}; op[1955] = getOpcodeCat(a);}
        op[1956] = getOpcodeRnm(289, 2012); // sridLiteral
        op[1957] = getOpcodeRnm(280, 1958); // multiLineStringLiteral
        {int[] a = {1959,1960,1967}; op[1958] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,76,105,110,101,83,116,114,105,110,103,40}; op[1959] = getOpcodeTls(a);}
        op[1960] = getOpcodeRep((char)0, (char)1, 1961);
        {int[] a = {1962,1963}; op[1961] = getOpcodeCat(a);}
        op[1962] = getOpcodeRnm(277, 1942); // lineStringData
        op[1963] = getOpcodeRep((char)0, Character.MAX_VALUE, 1964);
        {int[] a = {1965,1966}; op[1964] = getOpcodeCat(a);}
        op[1965] = getOpcodeRnm(332, 2223); // COMMA
        op[1966] = getOpcodeRnm(277, 1942); // lineStringData
        op[1967] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1969,1970,1971,1972}; op[1968] = getOpcodeCat(a);}
        op[1969] = getOpcodeRnm(305, 2091); // geographyPrefix
        op[1970] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1971] = getOpcodeRnm(282, 1973); // fullMultiPointLiteral
        op[1972] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {1974,1975}; op[1973] = getOpcodeCat(a);}
        op[1974] = getOpcodeRnm(289, 2012); // sridLiteral
        op[1975] = getOpcodeRnm(283, 1976); // multiPointLiteral
        {int[] a = {1977,1978,1985}; op[1976] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,80,111,105,110,116,40}; op[1977] = getOpcodeTls(a);}
        op[1978] = getOpcodeRep((char)0, (char)1, 1979);
        {int[] a = {1980,1981}; op[1979] = getOpcodeCat(a);}
        op[1980] = getOpcodeRnm(291, 2021); // pointData
        op[1981] = getOpcodeRep((char)0, Character.MAX_VALUE, 1982);
        {int[] a = {1983,1984}; op[1982] = getOpcodeCat(a);}
        op[1983] = getOpcodeRnm(332, 2223); // COMMA
        op[1984] = getOpcodeRnm(291, 2021); // pointData
        op[1985] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {1987,1988,1989,1990}; op[1986] = getOpcodeCat(a);}
        op[1987] = getOpcodeRnm(305, 2091); // geographyPrefix
        op[1988] = getOpcodeRnm(337, 2237); // SQUOTE
        op[1989] = getOpcodeRnm(285, 1991); // fullMultiPolygonLiteral
        op[1990] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {1992,1993}; op[1991] = getOpcodeCat(a);}
        op[1992] = getOpcodeRnm(289, 2012); // sridLiteral
        op[1993] = getOpcodeRnm(286, 1994); // multiPolygonLiteral
        {int[] a = {1995,1996,2003}; op[1994] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,80,111,108,121,103,111,110,40}; op[1995] = getOpcodeTls(a);}
        op[1996] = getOpcodeRep((char)0, (char)1, 1997);
        {int[] a = {1998,1999}; op[1997] = getOpcodeCat(a);}
        op[1998] = getOpcodeRnm(296, 2040); // polygonData
        op[1999] = getOpcodeRep((char)0, Character.MAX_VALUE, 2000);
        {int[] a = {2001,2002}; op[2000] = getOpcodeCat(a);}
        op[2001] = getOpcodeRnm(332, 2223); // COMMA
        op[2002] = getOpcodeRnm(296, 2040); // polygonData
        op[2003] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2005,2006,2007,2008}; op[2004] = getOpcodeCat(a);}
        op[2005] = getOpcodeRnm(305, 2091); // geographyPrefix
        op[2006] = getOpcodeRnm(337, 2237); // SQUOTE
        op[2007] = getOpcodeRnm(288, 2009); // fullPointLiteral
        op[2008] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {2010,2011}; op[2009] = getOpcodeCat(a);}
        op[2010] = getOpcodeRnm(289, 2012); // sridLiteral
        op[2011] = getOpcodeRnm(290, 2018); // pointLiteral
        {int[] a = {2013,2014,2015,2017}; op[2012] = getOpcodeCat(a);}
        {char[] a = {83,82,73,68}; op[2013] = getOpcodeTls(a);}
        op[2014] = getOpcodeRnm(333, 2226); // EQ
        op[2015] = getOpcodeRep((char)1, (char)5, 2016);
        op[2016] = getOpcodeRnm(378, 2635); // DIGIT
        op[2017] = getOpcodeRnm(335, 2231); // SEMI
        {int[] a = {2019,2020}; op[2018] = getOpcodeCat(a);}
        {char[] a = {80,111,105,110,116}; op[2019] = getOpcodeTls(a);}
        op[2020] = getOpcodeRnm(291, 2021); // pointData
        {int[] a = {2022,2023,2024}; op[2021] = getOpcodeCat(a);}
        op[2022] = getOpcodeRnm(338, 2240); // OPEN
        op[2023] = getOpcodeRnm(292, 2025); // positionLiteral
        op[2024] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2026,2027,2028}; op[2025] = getOpcodeCat(a);}
        op[2026] = getOpcodeRnm(238, 1661); // doubleValue
        op[2027] = getOpcodeRnm(382, 2647); // SP
        op[2028] = getOpcodeRnm(238, 1661); // doubleValue
        {int[] a = {2030,2031,2032,2033}; op[2029] = getOpcodeCat(a);}
        op[2030] = getOpcodeRnm(305, 2091); // geographyPrefix
        op[2031] = getOpcodeRnm(337, 2237); // SQUOTE
        op[2032] = getOpcodeRnm(294, 2034); // fullPolygonLiteral
        op[2033] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {2035,2036}; op[2034] = getOpcodeCat(a);}
        op[2035] = getOpcodeRnm(289, 2012); // sridLiteral
        op[2036] = getOpcodeRnm(295, 2037); // polygonLiteral
        {int[] a = {2038,2039}; op[2037] = getOpcodeCat(a);}
        {char[] a = {80,111,108,121,103,111,110}; op[2038] = getOpcodeTls(a);}
        op[2039] = getOpcodeRnm(296, 2040); // polygonData
        {int[] a = {2041,2042,2043,2047}; op[2040] = getOpcodeCat(a);}
        op[2041] = getOpcodeRnm(338, 2240); // OPEN
        op[2042] = getOpcodeRnm(297, 2048); // ringLiteral
        op[2043] = getOpcodeRep((char)0, Character.MAX_VALUE, 2044);
        {int[] a = {2045,2046}; op[2044] = getOpcodeCat(a);}
        op[2045] = getOpcodeRnm(332, 2223); // COMMA
        op[2046] = getOpcodeRnm(297, 2048); // ringLiteral
        op[2047] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2049,2050,2051,2055}; op[2048] = getOpcodeCat(a);}
        op[2049] = getOpcodeRnm(338, 2240); // OPEN
        op[2050] = getOpcodeRnm(292, 2025); // positionLiteral
        op[2051] = getOpcodeRep((char)0, Character.MAX_VALUE, 2052);
        {int[] a = {2053,2054}; op[2052] = getOpcodeCat(a);}
        op[2053] = getOpcodeRnm(332, 2223); // COMMA
        op[2054] = getOpcodeRnm(292, 2025); // positionLiteral
        op[2055] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2057,2058,2059,2060}; op[2056] = getOpcodeCat(a);}
        op[2057] = getOpcodeRnm(306, 2092); // geometryPrefix
        op[2058] = getOpcodeRnm(337, 2237); // SQUOTE
        op[2059] = getOpcodeRnm(271, 1912); // fullCollectionLiteral
        op[2060] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {2062,2063,2064,2065}; op[2061] = getOpcodeCat(a);}
        op[2062] = getOpcodeRnm(306, 2092); // geometryPrefix
        op[2063] = getOpcodeRnm(337, 2237); // SQUOTE
        op[2064] = getOpcodeRnm(275, 1936); // fullLineStringLiteral
        op[2065] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {2067,2068,2069,2070}; op[2066] = getOpcodeCat(a);}
        op[2067] = getOpcodeRnm(306, 2092); // geometryPrefix
        op[2068] = getOpcodeRnm(337, 2237); // SQUOTE
        op[2069] = getOpcodeRnm(279, 1955); // fullMultiLineStringLiteral
        op[2070] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {2072,2073,2074,2075}; op[2071] = getOpcodeCat(a);}
        op[2072] = getOpcodeRnm(306, 2092); // geometryPrefix
        op[2073] = getOpcodeRnm(337, 2237); // SQUOTE
        op[2074] = getOpcodeRnm(282, 1973); // fullMultiPointLiteral
        op[2075] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {2077,2078,2079,2080}; op[2076] = getOpcodeCat(a);}
        op[2077] = getOpcodeRnm(306, 2092); // geometryPrefix
        op[2078] = getOpcodeRnm(337, 2237); // SQUOTE
        op[2079] = getOpcodeRnm(285, 1991); // fullMultiPolygonLiteral
        op[2080] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {2082,2083,2084,2085}; op[2081] = getOpcodeCat(a);}
        op[2082] = getOpcodeRnm(306, 2092); // geometryPrefix
        op[2083] = getOpcodeRnm(337, 2237); // SQUOTE
        op[2084] = getOpcodeRnm(288, 2009); // fullPointLiteral
        op[2085] = getOpcodeRnm(337, 2237); // SQUOTE
        {int[] a = {2087,2088,2089,2090}; op[2086] = getOpcodeCat(a);}
        op[2087] = getOpcodeRnm(306, 2092); // geometryPrefix
        op[2088] = getOpcodeRnm(337, 2237); // SQUOTE
        op[2089] = getOpcodeRnm(294, 2034); // fullPolygonLiteral
        op[2090] = getOpcodeRnm(337, 2237); // SQUOTE
        {char[] a = {103,101,111,103,114,97,112,104,121}; op[2091] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,121}; op[2092] = getOpcodeTls(a);}
        {int[] a = {2094,2095,2096,2097,2098}; op[2093] = getOpcodeAlt(a);}
        op[2094] = getOpcodeRnm(308, 2099); // odata-entityid
        op[2095] = getOpcodeRnm(309, 2104); // odata-isolation
        op[2096] = getOpcodeRnm(310, 2109); // odata-maxversion
        op[2097] = getOpcodeRnm(311, 2114); // odata-version
        op[2098] = getOpcodeRnm(312, 2119); // prefer
        {int[] a = {2100,2101,2102,2103}; op[2099] = getOpcodeCat(a);}
        {char[] a = {79,68,97,116,97,45,69,110,116,105,116,121,73,68}; op[2100] = getOpcodeTls(a);}
        op[2101] = getOpcodeRnm(331, 2220); // COLON
        op[2102] = getOpcodeRnm(327, 2204); // OWS
        op[2103] = getOpcodeRnm(375, 2626); // IRI-in-header
        {int[] a = {2105,2106,2107,2108}; op[2104] = getOpcodeCat(a);}
        {char[] a = {79,68,97,116,97,45,73,115,111,108,97,116,105,111,110}; op[2105] = getOpcodeTls(a);}
        op[2106] = getOpcodeRnm(331, 2220); // COLON
        op[2107] = getOpcodeRnm(327, 2204); // OWS
        {char[] a = {115,110,97,112,115,104,111,116}; op[2108] = getOpcodeTls(a);}
        {int[] a = {2110,2111,2112,2113}; op[2109] = getOpcodeCat(a);}
        {char[] a = {79,68,97,116,97,45,77,97,120,86,101,114,115,105,111,110}; op[2110] = getOpcodeTls(a);}
        op[2111] = getOpcodeRnm(331, 2220); // COLON
        op[2112] = getOpcodeRnm(327, 2204); // OWS
        {char[] a = {52,46,48}; op[2113] = getOpcodeTls(a);}
        {int[] a = {2115,2116,2117,2118}; op[2114] = getOpcodeCat(a);}
        {char[] a = {79,68,97,116,97,45,86,101,114,115,105,111,110}; op[2115] = getOpcodeTls(a);}
        op[2116] = getOpcodeRnm(331, 2220); // COLON
        op[2117] = getOpcodeRnm(327, 2204); // OWS
        {char[] a = {52,46,48}; op[2118] = getOpcodeTls(a);}
        {int[] a = {2120,2121,2122,2123,2124}; op[2119] = getOpcodeCat(a);}
        {char[] a = {80,114,101,102,101,114}; op[2120] = getOpcodeTls(a);}
        op[2121] = getOpcodeRnm(331, 2220); // COLON
        op[2122] = getOpcodeRnm(327, 2204); // OWS
        op[2123] = getOpcodeRnm(313, 2128); // preference
        op[2124] = getOpcodeRep((char)0, Character.MAX_VALUE, 2125);
        {int[] a = {2126,2127}; op[2125] = getOpcodeCat(a);}
        op[2126] = getOpcodeRnm(332, 2223); // COMMA
        op[2127] = getOpcodeRnm(313, 2128); // preference
        {int[] a = {2129,2130,2131,2132,2133,2134,2135,2136,2137}; op[2128] = getOpcodeAlt(a);}
        op[2129] = getOpcodeRnm(314, 2138); // allowEntityReferencesPreference
        op[2130] = getOpcodeRnm(315, 2139); // callbackPreference
        op[2131] = getOpcodeRnm(316, 2151); // continueOnErrorPreference
        op[2132] = getOpcodeRnm(317, 2152); // includeAnnotationsPreference
        op[2133] = getOpcodeRnm(321, 2178); // maxpagesizePreference
        op[2134] = getOpcodeRnm(322, 2186); // respondAsyncPreference
        op[2135] = getOpcodeRnm(323, 2187); // returnPreference
        op[2136] = getOpcodeRnm(324, 2195); // trackChangesPreference
        op[2137] = getOpcodeRnm(325, 2196); // waitPreference
        {char[] a = {111,100,97,116,97,46,97,108,108,111,119,45,101,110,116,105,116,121,114,101,102,101,114,101,110,99,101,115}; op[2138] = getOpcodeTls(a);}
        {int[] a = {2140,2141,2142,2143,2144,2145,2146,2147,2148,2149,2150}; op[2139] = getOpcodeCat(a);}
        {char[] a = {111,100,97,116,97,46,99,97,108,108,98,97,99,107}; op[2140] = getOpcodeTls(a);}
        op[2141] = getOpcodeRnm(327, 2204); // OWS
        {char[] a = {59}; op[2142] = getOpcodeTls(a);}
        op[2143] = getOpcodeRnm(327, 2204); // OWS
        {char[] a = {117,114,108}; op[2144] = getOpcodeTls(a);}
        op[2145] = getOpcodeRnm(329, 2216); // BWS
        op[2146] = getOpcodeRnm(333, 2226); // EQ
        op[2147] = getOpcodeRnm(329, 2216); // BWS
        op[2148] = getOpcodeRnm(381, 2646); // DQUOTE
        op[2149] = getOpcodeRnm(340, 2246); // URI
        op[2150] = getOpcodeRnm(381, 2646); // DQUOTE
        {char[] a = {111,100,97,116,97,46,99,111,110,116,105,110,117,101,45,111,110,45,101,114,114,111,114}; op[2151] = getOpcodeTls(a);}
        {int[] a = {2153,2154,2155,2156,2157,2158,2159}; op[2152] = getOpcodeCat(a);}
        {char[] a = {111,100,97,116,97,46,105,110,99,108,117,100,101,45,97,110,110,111,116,97,116,105,111,110,115}; op[2153] = getOpcodeTls(a);}
        op[2154] = getOpcodeRnm(329, 2216); // BWS
        op[2155] = getOpcodeRnm(333, 2226); // EQ
        op[2156] = getOpcodeRnm(329, 2216); // BWS
        op[2157] = getOpcodeRnm(381, 2646); // DQUOTE
        op[2158] = getOpcodeRnm(318, 2160); // annotationsList
        op[2159] = getOpcodeRnm(381, 2646); // DQUOTE
        {int[] a = {2161,2162}; op[2160] = getOpcodeCat(a);}
        op[2161] = getOpcodeRnm(319, 2166); // annotationIdentifier
        op[2162] = getOpcodeRep((char)0, Character.MAX_VALUE, 2163);
        {int[] a = {2164,2165}; op[2163] = getOpcodeCat(a);}
        op[2164] = getOpcodeRnm(332, 2223); // COMMA
        op[2165] = getOpcodeRnm(319, 2166); // annotationIdentifier
        {int[] a = {2167,2169}; op[2166] = getOpcodeCat(a);}
        op[2167] = getOpcodeRep((char)0, (char)1, 2168);
        op[2168] = getOpcodeRnm(320, 2177); // excludeOperator
        {int[] a = {2170,2171}; op[2169] = getOpcodeAlt(a);}
        op[2170] = getOpcodeRnm(336, 2234); // STAR
        {int[] a = {2172,2173,2174}; op[2171] = getOpcodeCat(a);}
        op[2172] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[2173] = getOpcodeTls(a);}
        {int[] a = {2175,2176}; op[2174] = getOpcodeAlt(a);}
        op[2175] = getOpcodeRnm(199, 1514); // termName
        op[2176] = getOpcodeRnm(336, 2234); // STAR
        {char[] a = {45}; op[2177] = getOpcodeTls(a);}
        {int[] a = {2179,2180,2181,2182,2183,2184}; op[2178] = getOpcodeCat(a);}
        {char[] a = {111,100,97,116,97,46,109,97,120,112,97,103,101,115,105,122,101}; op[2179] = getOpcodeTls(a);}
        op[2180] = getOpcodeRnm(329, 2216); // BWS
        op[2181] = getOpcodeRnm(333, 2226); // EQ
        op[2182] = getOpcodeRnm(329, 2216); // BWS
        op[2183] = getOpcodeRnm(258, 1824); // oneToNine
        op[2184] = getOpcodeRep((char)0, Character.MAX_VALUE, 2185);
        op[2185] = getOpcodeRnm(378, 2635); // DIGIT
        {char[] a = {114,101,115,112,111,110,100,45,97,115,121,110,99}; op[2186] = getOpcodeTls(a);}
        {int[] a = {2188,2189,2190,2191,2192}; op[2187] = getOpcodeCat(a);}
        {char[] a = {114,101,116,117,114,110}; op[2188] = getOpcodeTls(a);}
        op[2189] = getOpcodeRnm(329, 2216); // BWS
        op[2190] = getOpcodeRnm(333, 2226); // EQ
        op[2191] = getOpcodeRnm(329, 2216); // BWS
        {int[] a = {2193,2194}; op[2192] = getOpcodeAlt(a);}
        {char[] a = {114,101,112,114,101,115,101,110,116,97,116,105,111,110}; op[2193] = getOpcodeTbs(a);}
        {char[] a = {109,105,110,105,109,97,108}; op[2194] = getOpcodeTbs(a);}
        {char[] a = {111,100,97,116,97,46,116,114,97,99,107,45,99,104,97,110,103,101,115}; op[2195] = getOpcodeTls(a);}
        {int[] a = {2197,2198,2199,2200,2201}; op[2196] = getOpcodeCat(a);}
        {char[] a = {119,97,105,116}; op[2197] = getOpcodeTls(a);}
        op[2198] = getOpcodeRnm(329, 2216); // BWS
        op[2199] = getOpcodeRnm(333, 2226); // EQ
        op[2200] = getOpcodeRnm(329, 2216); // BWS
        op[2201] = getOpcodeRep((char)1, Character.MAX_VALUE, 2202);
        op[2202] = getOpcodeRnm(378, 2635); // DIGIT
        op[2203] = getOpcodeTrg((char)128, (char)255);
        op[2204] = getOpcodeRep((char)0, Character.MAX_VALUE, 2205);
        {int[] a = {2206,2207,2208,2209}; op[2205] = getOpcodeAlt(a);}
        op[2206] = getOpcodeRnm(382, 2647); // SP
        op[2207] = getOpcodeRnm(383, 2648); // HTAB
        {char[] a = {37,50,48}; op[2208] = getOpcodeTls(a);}
        {char[] a = {37,48,57}; op[2209] = getOpcodeTls(a);}
        op[2210] = getOpcodeRep((char)1, Character.MAX_VALUE, 2211);
        {int[] a = {2212,2213,2214,2215}; op[2211] = getOpcodeAlt(a);}
        op[2212] = getOpcodeRnm(382, 2647); // SP
        op[2213] = getOpcodeRnm(383, 2648); // HTAB
        {char[] a = {37,50,48}; op[2214] = getOpcodeTls(a);}
        {char[] a = {37,48,57}; op[2215] = getOpcodeTls(a);}
        op[2216] = getOpcodeRnm(327, 2204); // OWS
        {int[] a = {2218,2219}; op[2217] = getOpcodeAlt(a);}
        {char[] a = {64}; op[2218] = getOpcodeTls(a);}
        {char[] a = {37,52,48}; op[2219] = getOpcodeTls(a);}
        {int[] a = {2221,2222}; op[2220] = getOpcodeAlt(a);}
        {char[] a = {58}; op[2221] = getOpcodeTls(a);}
        {char[] a = {37,51,65}; op[2222] = getOpcodeTls(a);}
        {int[] a = {2224,2225}; op[2223] = getOpcodeAlt(a);}
        {char[] a = {44}; op[2224] = getOpcodeTls(a);}
        {char[] a = {37,50,67}; op[2225] = getOpcodeTls(a);}
        {char[] a = {61}; op[2226] = getOpcodeTls(a);}
        {int[] a = {2228,2229,2230}; op[2227] = getOpcodeAlt(a);}
        {char[] a = {43}; op[2228] = getOpcodeTls(a);}
        {char[] a = {37,50,66}; op[2229] = getOpcodeTls(a);}
        {char[] a = {45}; op[2230] = getOpcodeTls(a);}
        {int[] a = {2232,2233}; op[2231] = getOpcodeAlt(a);}
        {char[] a = {59}; op[2232] = getOpcodeTls(a);}
        {char[] a = {37,51,66}; op[2233] = getOpcodeTls(a);}
        {int[] a = {2235,2236}; op[2234] = getOpcodeAlt(a);}
        {char[] a = {42}; op[2235] = getOpcodeTls(a);}
        {char[] a = {37,50,65}; op[2236] = getOpcodeTls(a);}
        {int[] a = {2238,2239}; op[2237] = getOpcodeAlt(a);}
        {char[] a = {39}; op[2238] = getOpcodeTls(a);}
        {char[] a = {37,50,55}; op[2239] = getOpcodeTls(a);}
        {int[] a = {2241,2242}; op[2240] = getOpcodeAlt(a);}
        {char[] a = {40}; op[2241] = getOpcodeTls(a);}
        {char[] a = {37,50,56}; op[2242] = getOpcodeTls(a);}
        {int[] a = {2244,2245}; op[2243] = getOpcodeAlt(a);}
        {char[] a = {41}; op[2244] = getOpcodeTls(a);}
        {char[] a = {37,50,57}; op[2245] = getOpcodeTls(a);}
        {int[] a = {2247,2248,2249,2250,2254}; op[2246] = getOpcodeCat(a);}
        op[2247] = getOpcodeRnm(342, 2265); // scheme
        {char[] a = {58}; op[2248] = getOpcodeTls(a);}
        op[2249] = getOpcodeRnm(341, 2258); // hier-part
        op[2250] = getOpcodeRep((char)0, (char)1, 2251);
        {int[] a = {2252,2253}; op[2251] = getOpcodeCat(a);}
        {char[] a = {63}; op[2252] = getOpcodeTls(a);}
        op[2253] = getOpcodeRnm(361, 2470); // query
        op[2254] = getOpcodeRep((char)0, (char)1, 2255);
        {int[] a = {2256,2257}; op[2255] = getOpcodeCat(a);}
        {char[] a = {35}; op[2256] = getOpcodeTls(a);}
        op[2257] = getOpcodeRnm(362, 2475); // fragment
        {int[] a = {2259,2263,2264}; op[2258] = getOpcodeAlt(a);}
        {int[] a = {2260,2261,2262}; op[2259] = getOpcodeCat(a);}
        {char[] a = {47,47}; op[2260] = getOpcodeTls(a);}
        op[2261] = getOpcodeRnm(343, 2274); // authority
        op[2262] = getOpcodeRnm(355, 2441); // path-abempty
        op[2263] = getOpcodeRnm(356, 2445); // path-absolute
        op[2264] = getOpcodeRnm(357, 2454); // path-rootless
        {int[] a = {2266,2267}; op[2265] = getOpcodeCat(a);}
        op[2266] = getOpcodeRnm(377, 2632); // ALPHA
        op[2267] = getOpcodeRep((char)0, Character.MAX_VALUE, 2268);
        {int[] a = {2269,2270,2271,2272,2273}; op[2268] = getOpcodeAlt(a);}
        op[2269] = getOpcodeRnm(377, 2632); // ALPHA
        op[2270] = getOpcodeRnm(378, 2635); // DIGIT
        {char[] a = {43}; op[2271] = getOpcodeTls(a);}
        {char[] a = {45}; op[2272] = getOpcodeTls(a);}
        {char[] a = {46}; op[2273] = getOpcodeTls(a);}
        {int[] a = {2275,2279,2280}; op[2274] = getOpcodeCat(a);}
        op[2275] = getOpcodeRep((char)0, (char)1, 2276);
        {int[] a = {2277,2278}; op[2276] = getOpcodeCat(a);}
        op[2277] = getOpcodeRnm(344, 2284); // userinfo
        {char[] a = {64}; op[2278] = getOpcodeTls(a);}
        op[2279] = getOpcodeRnm(345, 2290); // host
        op[2280] = getOpcodeRep((char)0, (char)1, 2281);
        {int[] a = {2282,2283}; op[2281] = getOpcodeCat(a);}
        {char[] a = {58}; op[2282] = getOpcodeTls(a);}
        op[2283] = getOpcodeRnm(346, 2294); // port
        op[2284] = getOpcodeRep((char)0, Character.MAX_VALUE, 2285);
        {int[] a = {2286,2287,2288,2289}; op[2285] = getOpcodeAlt(a);}
        op[2286] = getOpcodeRnm(364, 2484); // unreserved
        op[2287] = getOpcodeRnm(363, 2480); // pct-encoded
        op[2288] = getOpcodeRnm(365, 2491); // sub-delims
        {char[] a = {58}; op[2289] = getOpcodeTls(a);}
        {int[] a = {2291,2292,2293}; op[2290] = getOpcodeAlt(a);}
        op[2291] = getOpcodeRnm(347, 2296); // IP-literal
        op[2292] = getOpcodeRnm(352, 2412); // IPv4address
        op[2293] = getOpcodeRnm(354, 2436); // reg-name
        op[2294] = getOpcodeRep((char)0, Character.MAX_VALUE, 2295);
        op[2295] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {2297,2298,2301}; op[2296] = getOpcodeCat(a);}
        {char[] a = {91}; op[2297] = getOpcodeTls(a);}
        {int[] a = {2299,2300}; op[2298] = getOpcodeAlt(a);}
        op[2299] = getOpcodeRnm(349, 2312); // IPv6address
        op[2300] = getOpcodeRnm(348, 2302); // IPvFuture
        {char[] a = {93}; op[2301] = getOpcodeTls(a);}
        {int[] a = {2303,2304,2306,2307}; op[2302] = getOpcodeCat(a);}
        {char[] a = {118}; op[2303] = getOpcodeTls(a);}
        op[2304] = getOpcodeRep((char)1, Character.MAX_VALUE, 2305);
        op[2305] = getOpcodeRnm(379, 2636); // HEXDIG
        {char[] a = {46}; op[2306] = getOpcodeTls(a);}
        op[2307] = getOpcodeRep((char)1, Character.MAX_VALUE, 2308);
        {int[] a = {2309,2310,2311}; op[2308] = getOpcodeAlt(a);}
        op[2309] = getOpcodeRnm(364, 2484); // unreserved
        op[2310] = getOpcodeRnm(365, 2491); // sub-delims
        {char[] a = {58}; op[2311] = getOpcodeTls(a);}
        {int[] a = {2313,2319,2326,2335,2349,2363,2375,2385,2395}; op[2312] = getOpcodeAlt(a);}
        {int[] a = {2314,2318}; op[2313] = getOpcodeCat(a);}
        op[2314] = getOpcodeRep((char)6, (char)6, 2315);
        {int[] a = {2316,2317}; op[2315] = getOpcodeCat(a);}
        op[2316] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58}; op[2317] = getOpcodeTls(a);}
        op[2318] = getOpcodeRnm(351, 2406); // ls32
        {int[] a = {2320,2321,2325}; op[2319] = getOpcodeCat(a);}
        {char[] a = {58,58}; op[2320] = getOpcodeTls(a);}
        op[2321] = getOpcodeRep((char)5, (char)5, 2322);
        {int[] a = {2323,2324}; op[2322] = getOpcodeCat(a);}
        op[2323] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58}; op[2324] = getOpcodeTls(a);}
        op[2325] = getOpcodeRnm(351, 2406); // ls32
        {int[] a = {2327,2329,2330,2334}; op[2326] = getOpcodeCat(a);}
        op[2327] = getOpcodeRep((char)0, (char)1, 2328);
        op[2328] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58,58}; op[2329] = getOpcodeTls(a);}
        op[2330] = getOpcodeRep((char)4, (char)4, 2331);
        {int[] a = {2332,2333}; op[2331] = getOpcodeCat(a);}
        op[2332] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58}; op[2333] = getOpcodeTls(a);}
        op[2334] = getOpcodeRnm(351, 2406); // ls32
        {int[] a = {2336,2343,2344,2348}; op[2335] = getOpcodeCat(a);}
        op[2336] = getOpcodeRep((char)0, (char)1, 2337);
        {int[] a = {2338,2342}; op[2337] = getOpcodeCat(a);}
        op[2338] = getOpcodeRep((char)0, (char)1, 2339);
        {int[] a = {2340,2341}; op[2339] = getOpcodeCat(a);}
        op[2340] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58}; op[2341] = getOpcodeTls(a);}
        op[2342] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58,58}; op[2343] = getOpcodeTls(a);}
        op[2344] = getOpcodeRep((char)3, (char)3, 2345);
        {int[] a = {2346,2347}; op[2345] = getOpcodeCat(a);}
        op[2346] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58}; op[2347] = getOpcodeTls(a);}
        op[2348] = getOpcodeRnm(351, 2406); // ls32
        {int[] a = {2350,2357,2358,2362}; op[2349] = getOpcodeCat(a);}
        op[2350] = getOpcodeRep((char)0, (char)1, 2351);
        {int[] a = {2352,2356}; op[2351] = getOpcodeCat(a);}
        op[2352] = getOpcodeRep((char)0, (char)2, 2353);
        {int[] a = {2354,2355}; op[2353] = getOpcodeCat(a);}
        op[2354] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58}; op[2355] = getOpcodeTls(a);}
        op[2356] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58,58}; op[2357] = getOpcodeTls(a);}
        op[2358] = getOpcodeRep((char)2, (char)2, 2359);
        {int[] a = {2360,2361}; op[2359] = getOpcodeCat(a);}
        op[2360] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58}; op[2361] = getOpcodeTls(a);}
        op[2362] = getOpcodeRnm(351, 2406); // ls32
        {int[] a = {2364,2371,2372,2373,2374}; op[2363] = getOpcodeCat(a);}
        op[2364] = getOpcodeRep((char)0, (char)1, 2365);
        {int[] a = {2366,2370}; op[2365] = getOpcodeCat(a);}
        op[2366] = getOpcodeRep((char)0, (char)3, 2367);
        {int[] a = {2368,2369}; op[2367] = getOpcodeCat(a);}
        op[2368] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58}; op[2369] = getOpcodeTls(a);}
        op[2370] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58,58}; op[2371] = getOpcodeTls(a);}
        op[2372] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58}; op[2373] = getOpcodeTls(a);}
        op[2374] = getOpcodeRnm(351, 2406); // ls32
        {int[] a = {2376,2383,2384}; op[2375] = getOpcodeCat(a);}
        op[2376] = getOpcodeRep((char)0, (char)1, 2377);
        {int[] a = {2378,2382}; op[2377] = getOpcodeCat(a);}
        op[2378] = getOpcodeRep((char)0, (char)4, 2379);
        {int[] a = {2380,2381}; op[2379] = getOpcodeCat(a);}
        op[2380] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58}; op[2381] = getOpcodeTls(a);}
        op[2382] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58,58}; op[2383] = getOpcodeTls(a);}
        op[2384] = getOpcodeRnm(351, 2406); // ls32
        {int[] a = {2386,2393,2394}; op[2385] = getOpcodeCat(a);}
        op[2386] = getOpcodeRep((char)0, (char)1, 2387);
        {int[] a = {2388,2392}; op[2387] = getOpcodeCat(a);}
        op[2388] = getOpcodeRep((char)0, (char)5, 2389);
        {int[] a = {2390,2391}; op[2389] = getOpcodeCat(a);}
        op[2390] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58}; op[2391] = getOpcodeTls(a);}
        op[2392] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58,58}; op[2393] = getOpcodeTls(a);}
        op[2394] = getOpcodeRnm(350, 2404); // h16
        {int[] a = {2396,2403}; op[2395] = getOpcodeCat(a);}
        op[2396] = getOpcodeRep((char)0, (char)1, 2397);
        {int[] a = {2398,2402}; op[2397] = getOpcodeCat(a);}
        op[2398] = getOpcodeRep((char)0, (char)6, 2399);
        {int[] a = {2400,2401}; op[2399] = getOpcodeCat(a);}
        op[2400] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58}; op[2401] = getOpcodeTls(a);}
        op[2402] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58,58}; op[2403] = getOpcodeTls(a);}
        op[2404] = getOpcodeRep((char)1, (char)4, 2405);
        op[2405] = getOpcodeRnm(379, 2636); // HEXDIG
        {int[] a = {2407,2411}; op[2406] = getOpcodeAlt(a);}
        {int[] a = {2408,2409,2410}; op[2407] = getOpcodeCat(a);}
        op[2408] = getOpcodeRnm(350, 2404); // h16
        {char[] a = {58}; op[2409] = getOpcodeTls(a);}
        op[2410] = getOpcodeRnm(350, 2404); // h16
        op[2411] = getOpcodeRnm(352, 2412); // IPv4address
        {int[] a = {2413,2414,2415,2416,2417,2418,2419}; op[2412] = getOpcodeCat(a);}
        op[2413] = getOpcodeRnm(353, 2420); // dec-octet
        {char[] a = {46}; op[2414] = getOpcodeTls(a);}
        op[2415] = getOpcodeRnm(353, 2420); // dec-octet
        {char[] a = {46}; op[2416] = getOpcodeTls(a);}
        op[2417] = getOpcodeRnm(353, 2420); // dec-octet
        {char[] a = {46}; op[2418] = getOpcodeTls(a);}
        op[2419] = getOpcodeRnm(353, 2420); // dec-octet
        {int[] a = {2421,2425,2429,2432,2435}; op[2420] = getOpcodeAlt(a);}
        {int[] a = {2422,2423}; op[2421] = getOpcodeCat(a);}
        {char[] a = {49}; op[2422] = getOpcodeTls(a);}
        op[2423] = getOpcodeRep((char)2, (char)2, 2424);
        op[2424] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {2426,2427,2428}; op[2425] = getOpcodeCat(a);}
        {char[] a = {50}; op[2426] = getOpcodeTls(a);}
        op[2427] = getOpcodeTrg((char)48, (char)52);
        op[2428] = getOpcodeRnm(378, 2635); // DIGIT
        {int[] a = {2430,2431}; op[2429] = getOpcodeCat(a);}
        {char[] a = {50,53}; op[2430] = getOpcodeTls(a);}
        op[2431] = getOpcodeTrg((char)48, (char)53);
        {int[] a = {2433,2434}; op[2432] = getOpcodeCat(a);}
        op[2433] = getOpcodeTrg((char)49, (char)57);
        op[2434] = getOpcodeRnm(378, 2635); // DIGIT
        op[2435] = getOpcodeRnm(378, 2635); // DIGIT
        op[2436] = getOpcodeRep((char)0, Character.MAX_VALUE, 2437);
        {int[] a = {2438,2439,2440}; op[2437] = getOpcodeAlt(a);}
        op[2438] = getOpcodeRnm(364, 2484); // unreserved
        op[2439] = getOpcodeRnm(363, 2480); // pct-encoded
        op[2440] = getOpcodeRnm(365, 2491); // sub-delims
        op[2441] = getOpcodeRep((char)0, Character.MAX_VALUE, 2442);
        {int[] a = {2443,2444}; op[2442] = getOpcodeCat(a);}
        {char[] a = {47}; op[2443] = getOpcodeTls(a);}
        op[2444] = getOpcodeRnm(358, 2460); // segment
        {int[] a = {2446,2447}; op[2445] = getOpcodeCat(a);}
        {char[] a = {47}; op[2446] = getOpcodeTls(a);}
        op[2447] = getOpcodeRep((char)0, (char)1, 2448);
        {int[] a = {2449,2450}; op[2448] = getOpcodeCat(a);}
        op[2449] = getOpcodeRnm(359, 2462); // segment-nz
        op[2450] = getOpcodeRep((char)0, Character.MAX_VALUE, 2451);
        {int[] a = {2452,2453}; op[2451] = getOpcodeCat(a);}
        {char[] a = {47}; op[2452] = getOpcodeTls(a);}
        op[2453] = getOpcodeRnm(358, 2460); // segment
        {int[] a = {2455,2456}; op[2454] = getOpcodeCat(a);}
        op[2455] = getOpcodeRnm(359, 2462); // segment-nz
        op[2456] = getOpcodeRep((char)0, Character.MAX_VALUE, 2457);
        {int[] a = {2458,2459}; op[2457] = getOpcodeCat(a);}
        {char[] a = {47}; op[2458] = getOpcodeTls(a);}
        op[2459] = getOpcodeRnm(358, 2460); // segment
        op[2460] = getOpcodeRep((char)0, Character.MAX_VALUE, 2461);
        op[2461] = getOpcodeRnm(360, 2464); // pchar
        op[2462] = getOpcodeRep((char)1, Character.MAX_VALUE, 2463);
        op[2463] = getOpcodeRnm(360, 2464); // pchar
        {int[] a = {2465,2466,2467,2468,2469}; op[2464] = getOpcodeAlt(a);}
        op[2465] = getOpcodeRnm(364, 2484); // unreserved
        op[2466] = getOpcodeRnm(363, 2480); // pct-encoded
        op[2467] = getOpcodeRnm(365, 2491); // sub-delims
        {char[] a = {58}; op[2468] = getOpcodeTls(a);}
        {char[] a = {64}; op[2469] = getOpcodeTls(a);}
        op[2470] = getOpcodeRep((char)0, Character.MAX_VALUE, 2471);
        {int[] a = {2472,2473,2474}; op[2471] = getOpcodeAlt(a);}
        op[2472] = getOpcodeRnm(360, 2464); // pchar
        {char[] a = {47}; op[2473] = getOpcodeTls(a);}
        {char[] a = {63}; op[2474] = getOpcodeTls(a);}
        op[2475] = getOpcodeRep((char)0, Character.MAX_VALUE, 2476);
        {int[] a = {2477,2478,2479}; op[2476] = getOpcodeAlt(a);}
        op[2477] = getOpcodeRnm(360, 2464); // pchar
        {char[] a = {47}; op[2478] = getOpcodeTls(a);}
        {char[] a = {63}; op[2479] = getOpcodeTls(a);}
        {int[] a = {2481,2482,2483}; op[2480] = getOpcodeCat(a);}
        {char[] a = {37}; op[2481] = getOpcodeTls(a);}
        op[2482] = getOpcodeRnm(379, 2636); // HEXDIG
        op[2483] = getOpcodeRnm(379, 2636); // HEXDIG
        {int[] a = {2485,2486,2487,2488,2489,2490}; op[2484] = getOpcodeAlt(a);}
        op[2485] = getOpcodeRnm(377, 2632); // ALPHA
        op[2486] = getOpcodeRnm(378, 2635); // DIGIT
        {char[] a = {45}; op[2487] = getOpcodeTls(a);}
        {char[] a = {46}; op[2488] = getOpcodeTls(a);}
        {char[] a = {95}; op[2489] = getOpcodeTls(a);}
        {char[] a = {126}; op[2490] = getOpcodeTls(a);}
        {int[] a = {2492,2493,2494,2495,2496}; op[2491] = getOpcodeAlt(a);}
        {char[] a = {36}; op[2492] = getOpcodeTls(a);}
        {char[] a = {38}; op[2493] = getOpcodeTls(a);}
        {char[] a = {39}; op[2494] = getOpcodeTls(a);}
        {char[] a = {61}; op[2495] = getOpcodeTls(a);}
        op[2496] = getOpcodeRnm(366, 2497); // other-delims
        {int[] a = {2498,2499,2500,2501,2502,2503,2504}; op[2497] = getOpcodeAlt(a);}
        {char[] a = {33}; op[2498] = getOpcodeTls(a);}
        {char[] a = {40}; op[2499] = getOpcodeTls(a);}
        {char[] a = {41}; op[2500] = getOpcodeTls(a);}
        {char[] a = {42}; op[2501] = getOpcodeTls(a);}
        {char[] a = {43}; op[2502] = getOpcodeTls(a);}
        {char[] a = {44}; op[2503] = getOpcodeTls(a);}
        {char[] a = {59}; op[2504] = getOpcodeTls(a);}
        {int[] a = {2506,2507,2508,2509,2510,2511,2512,2513}; op[2505] = getOpcodeAlt(a);}
        op[2506] = getOpcodeRnm(364, 2484); // unreserved
        op[2507] = getOpcodeRnm(368, 2514); // pct-encoded-no-SQUOTE
        op[2508] = getOpcodeRnm(366, 2497); // other-delims
        {char[] a = {36}; op[2509] = getOpcodeTls(a);}
        {char[] a = {38}; op[2510] = getOpcodeTls(a);}
        {char[] a = {61}; op[2511] = getOpcodeTls(a);}
        {char[] a = {58}; op[2512] = getOpcodeTls(a);}
        {char[] a = {64}; op[2513] = getOpcodeTls(a);}
        {int[] a = {2515,2528}; op[2514] = getOpcodeAlt(a);}
        {int[] a = {2516,2517,2527}; op[2515] = getOpcodeCat(a);}
        {char[] a = {37}; op[2516] = getOpcodeTls(a);}
        {int[] a = {2518,2519,2520,2521,2522,2523,2524,2525,2526}; op[2517] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2518] = getOpcodeTls(a);}
        {char[] a = {49}; op[2519] = getOpcodeTls(a);}
        {char[] a = {51}; op[2520] = getOpcodeTls(a);}
        {char[] a = {52}; op[2521] = getOpcodeTls(a);}
        {char[] a = {53}; op[2522] = getOpcodeTls(a);}
        {char[] a = {54}; op[2523] = getOpcodeTls(a);}
        {char[] a = {56}; op[2524] = getOpcodeTls(a);}
        {char[] a = {57}; op[2525] = getOpcodeTls(a);}
        op[2526] = getOpcodeRnm(380, 2639); // A-to-F
        op[2527] = getOpcodeRnm(379, 2636); // HEXDIG
        {int[] a = {2529,2530,2531}; op[2528] = getOpcodeCat(a);}
        {char[] a = {37}; op[2529] = getOpcodeTls(a);}
        {char[] a = {50}; op[2530] = getOpcodeTls(a);}
        {int[] a = {2532,2533,2534,2535,2536,2537,2538,2539,2540,2541}; op[2531] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2532] = getOpcodeTls(a);}
        {char[] a = {49}; op[2533] = getOpcodeTls(a);}
        {char[] a = {50}; op[2534] = getOpcodeTls(a);}
        {char[] a = {51}; op[2535] = getOpcodeTls(a);}
        {char[] a = {52}; op[2536] = getOpcodeTls(a);}
        {char[] a = {53}; op[2537] = getOpcodeTls(a);}
        {char[] a = {54}; op[2538] = getOpcodeTls(a);}
        {char[] a = {56}; op[2539] = getOpcodeTls(a);}
        {char[] a = {57}; op[2540] = getOpcodeTls(a);}
        op[2541] = getOpcodeRnm(380, 2639); // A-to-F
        {int[] a = {2543,2544,2545,2546,2547,2548,2549,2550,2551,2552}; op[2542] = getOpcodeAlt(a);}
        op[2543] = getOpcodeRnm(364, 2484); // unreserved
        op[2544] = getOpcodeRnm(363, 2480); // pct-encoded
        op[2545] = getOpcodeRnm(366, 2497); // other-delims
        {char[] a = {58}; op[2546] = getOpcodeTls(a);}
        {char[] a = {64}; op[2547] = getOpcodeTls(a);}
        {char[] a = {47}; op[2548] = getOpcodeTls(a);}
        {char[] a = {63}; op[2549] = getOpcodeTls(a);}
        {char[] a = {36}; op[2550] = getOpcodeTls(a);}
        {char[] a = {39}; op[2551] = getOpcodeTls(a);}
        {char[] a = {61}; op[2552] = getOpcodeTls(a);}
        {int[] a = {2554,2555,2556,2557,2558,2559,2560,2561,2562}; op[2553] = getOpcodeAlt(a);}
        op[2554] = getOpcodeRnm(364, 2484); // unreserved
        op[2555] = getOpcodeRnm(363, 2480); // pct-encoded
        op[2556] = getOpcodeRnm(366, 2497); // other-delims
        {char[] a = {58}; op[2557] = getOpcodeTls(a);}
        {char[] a = {64}; op[2558] = getOpcodeTls(a);}
        {char[] a = {47}; op[2559] = getOpcodeTls(a);}
        {char[] a = {63}; op[2560] = getOpcodeTls(a);}
        {char[] a = {36}; op[2561] = getOpcodeTls(a);}
        {char[] a = {39}; op[2562] = getOpcodeTls(a);}
        {int[] a = {2564,2565,2566,2567,2568,2569,2570}; op[2563] = getOpcodeAlt(a);}
        op[2564] = getOpcodeRnm(364, 2484); // unreserved
        op[2565] = getOpcodeRnm(363, 2480); // pct-encoded
        op[2566] = getOpcodeRnm(366, 2497); // other-delims
        {char[] a = {58}; op[2567] = getOpcodeTls(a);}
        {char[] a = {47}; op[2568] = getOpcodeTls(a);}
        {char[] a = {63}; op[2569] = getOpcodeTls(a);}
        {char[] a = {39}; op[2570] = getOpcodeTls(a);}
        {int[] a = {2572,2573,2574,2575,2576,2577,2578,2579,2580,2581}; op[2571] = getOpcodeAlt(a);}
        op[2572] = getOpcodeRnm(364, 2484); // unreserved
        op[2573] = getOpcodeRnm(373, 2582); // pct-encoded-unescaped
        op[2574] = getOpcodeRnm(366, 2497); // other-delims
        {char[] a = {58}; op[2575] = getOpcodeTls(a);}
        {char[] a = {64}; op[2576] = getOpcodeTls(a);}
        {char[] a = {47}; op[2577] = getOpcodeTls(a);}
        {char[] a = {63}; op[2578] = getOpcodeTls(a);}
        {char[] a = {36}; op[2579] = getOpcodeTls(a);}
        {char[] a = {39}; op[2580] = getOpcodeTls(a);}
        {char[] a = {61}; op[2581] = getOpcodeTls(a);}
        {int[] a = {2583,2595,2609}; op[2582] = getOpcodeAlt(a);}
        {int[] a = {2584,2585,2594}; op[2583] = getOpcodeCat(a);}
        {char[] a = {37}; op[2584] = getOpcodeTls(a);}
        {int[] a = {2586,2587,2588,2589,2590,2591,2592,2593}; op[2585] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2586] = getOpcodeTls(a);}
        {char[] a = {49}; op[2587] = getOpcodeTls(a);}
        {char[] a = {51}; op[2588] = getOpcodeTls(a);}
        {char[] a = {52}; op[2589] = getOpcodeTls(a);}
        {char[] a = {54}; op[2590] = getOpcodeTls(a);}
        {char[] a = {56}; op[2591] = getOpcodeTls(a);}
        {char[] a = {57}; op[2592] = getOpcodeTls(a);}
        op[2593] = getOpcodeRnm(380, 2639); // A-to-F
        op[2594] = getOpcodeRnm(379, 2636); // HEXDIG
        {int[] a = {2596,2597,2598}; op[2595] = getOpcodeCat(a);}
        {char[] a = {37}; op[2596] = getOpcodeTls(a);}
        {char[] a = {50}; op[2597] = getOpcodeTls(a);}
        {int[] a = {2599,2600,2601,2602,2603,2604,2605,2606,2607,2608}; op[2598] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2599] = getOpcodeTls(a);}
        {char[] a = {49}; op[2600] = getOpcodeTls(a);}
        {char[] a = {51}; op[2601] = getOpcodeTls(a);}
        {char[] a = {52}; op[2602] = getOpcodeTls(a);}
        {char[] a = {53}; op[2603] = getOpcodeTls(a);}
        {char[] a = {54}; op[2604] = getOpcodeTls(a);}
        {char[] a = {55}; op[2605] = getOpcodeTls(a);}
        {char[] a = {56}; op[2606] = getOpcodeTls(a);}
        {char[] a = {57}; op[2607] = getOpcodeTls(a);}
        op[2608] = getOpcodeRnm(380, 2639); // A-to-F
        {int[] a = {2610,2611,2612}; op[2609] = getOpcodeCat(a);}
        {char[] a = {37}; op[2610] = getOpcodeTls(a);}
        {char[] a = {53}; op[2611] = getOpcodeTls(a);}
        {int[] a = {2613,2614,2615,2616,2617,2618}; op[2612] = getOpcodeAlt(a);}
        op[2613] = getOpcodeRnm(378, 2635); // DIGIT
        {char[] a = {65}; op[2614] = getOpcodeTls(a);}
        {char[] a = {66}; op[2615] = getOpcodeTls(a);}
        {char[] a = {68}; op[2616] = getOpcodeTls(a);}
        {char[] a = {69}; op[2617] = getOpcodeTls(a);}
        {char[] a = {70}; op[2618] = getOpcodeTls(a);}
        {int[] a = {2620,2621}; op[2619] = getOpcodeAlt(a);}
        op[2620] = getOpcodeRnm(372, 2571); // qchar-unescaped
        {int[] a = {2622,2623}; op[2621] = getOpcodeCat(a);}
        op[2622] = getOpcodeRnm(182, 1446); // escape
        {int[] a = {2624,2625}; op[2623] = getOpcodeAlt(a);}
        op[2624] = getOpcodeRnm(182, 1446); // escape
        op[2625] = getOpcodeRnm(175, 1397); // quotation-mark
        op[2626] = getOpcodeRep((char)1, Character.MAX_VALUE, 2627);
        {int[] a = {2628,2629}; op[2627] = getOpcodeAlt(a);}
        op[2628] = getOpcodeRnm(384, 2649); // VCHAR
        op[2629] = getOpcodeRnm(326, 2203); // obs-text
        op[2630] = getOpcodeRep((char)1, Character.MAX_VALUE, 2631);
        op[2631] = getOpcodeRnm(369, 2542); // qchar-no-AMP
        {int[] a = {2633,2634}; op[2632] = getOpcodeAlt(a);}
        op[2633] = getOpcodeTrg((char)65, (char)90);
        op[2634] = getOpcodeTrg((char)97, (char)122);
        op[2635] = getOpcodeTrg((char)48, (char)57);
        {int[] a = {2637,2638}; op[2636] = getOpcodeAlt(a);}
        op[2637] = getOpcodeRnm(378, 2635); // DIGIT
        op[2638] = getOpcodeRnm(380, 2639); // A-to-F
        {int[] a = {2640,2641,2642,2643,2644,2645}; op[2639] = getOpcodeAlt(a);}
        {char[] a = {65}; op[2640] = getOpcodeTls(a);}
        {char[] a = {66}; op[2641] = getOpcodeTls(a);}
        {char[] a = {67}; op[2642] = getOpcodeTls(a);}
        {char[] a = {68}; op[2643] = getOpcodeTls(a);}
        {char[] a = {69}; op[2644] = getOpcodeTls(a);}
        {char[] a = {70}; op[2645] = getOpcodeTls(a);}
        {char[] a = {34}; op[2646] = getOpcodeTbs(a);}
        {char[] a = {32}; op[2647] = getOpcodeTbs(a);}
        {char[] a = {9}; op[2648] = getOpcodeTbs(a);}
        op[2649] = getOpcodeTrg((char)33, (char)126);
        {int[] a = {2651,2652,2653}; op[2650] = getOpcodeCat(a);}
        {char[] a = {36,97,112,112,108,121}; op[2651] = getOpcodeTbs(a);}
        op[2652] = getOpcodeRnm(333, 2226); // EQ
        op[2653] = getOpcodeRnm(386, 2654); // applyExpr
        {int[] a = {2655,2656}; op[2654] = getOpcodeCat(a);}
        op[2655] = getOpcodeRnm(387, 2660); // applyTrafo
        op[2656] = getOpcodeRep((char)0, Character.MAX_VALUE, 2657);
        {int[] a = {2658,2659}; op[2657] = getOpcodeCat(a);}
        {char[] a = {47}; op[2658] = getOpcodeTls(a);}
        op[2659] = getOpcodeRnm(387, 2660); // applyTrafo
        {int[] a = {2661,2662,2663,2664,2665,2666,2667,2668,2669,2670,2671,2672}; op[2660] = getOpcodeAlt(a);}
        op[2661] = getOpcodeRnm(388, 2673); // aggregateTrafo
        op[2662] = getOpcodeRnm(397, 2769); // bottomcountTrafo
        op[2663] = getOpcodeRnm(398, 2780); // bottompercentTrafo
        op[2664] = getOpcodeRnm(399, 2791); // bottomsumTrafo
        op[2665] = getOpcodeRnm(400, 2802); // concatTrafo
        op[2666] = getOpcodeRnm(401, 2815); // expandTrafo
        op[2667] = getOpcodeRnm(402, 2826); // filterTrafo
        op[2668] = getOpcodeRnm(403, 2833); // groupbyTrafo
        op[2669] = getOpcodeRnm(407, 2874); // identityTrafo
        op[2670] = getOpcodeRnm(408, 2875); // topcountTrafo
        op[2671] = getOpcodeRnm(409, 2886); // toppercentTrafo
        op[2672] = getOpcodeRnm(410, 2897); // topsumTrafo
        {int[] a = {2674,2675,2676,2686,2687}; op[2673] = getOpcodeCat(a);}
        {char[] a = {97,103,103,114,101,103,97,116,101}; op[2674] = getOpcodeTbs(a);}
        op[2675] = getOpcodeRnm(338, 2240); // OPEN
        op[2676] = getOpcodeRep((char)0, (char)1, 2677);
        {int[] a = {2678,2679,2680}; op[2677] = getOpcodeCat(a);}
        op[2678] = getOpcodeRnm(329, 2216); // BWS
        op[2679] = getOpcodeRnm(389, 2688); // aggregateParam
        op[2680] = getOpcodeRep((char)0, Character.MAX_VALUE, 2681);
        {int[] a = {2682,2683,2684,2685}; op[2681] = getOpcodeCat(a);}
        op[2682] = getOpcodeRnm(329, 2216); // BWS
        op[2683] = getOpcodeRnm(332, 2223); // COMMA
        op[2684] = getOpcodeRnm(329, 2216); // BWS
        op[2685] = getOpcodeRnm(389, 2688); // aggregateParam
        op[2686] = getOpcodeRnm(329, 2216); // BWS
        op[2687] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2689,2694,2695}; op[2688] = getOpcodeAlt(a);}
        {int[] a = {2690,2691,2692,2693}; op[2689] = getOpcodeCat(a);}
        op[2690] = getOpcodeRnm(48, 379); // expandPath
        op[2691] = getOpcodeRnm(338, 2240); // OPEN
        op[2692] = getOpcodeRnm(390, 2696); // aggregateExpr
        op[2693] = getOpcodeRnm(339, 2243); // CLOSE
        op[2694] = getOpcodeRnm(390, 2696); // aggregateExpr
        op[2695] = getOpcodeRnm(395, 2734); // propertyWithPath
        {int[] a = {2697,2700}; op[2696] = getOpcodeAlt(a);}
        {int[] a = {2698,2699}; op[2697] = getOpcodeCat(a);}
        {char[] a = {36,99,111,117,110,116}; op[2698] = getOpcodeTbs(a);}
        op[2699] = getOpcodeRnm(391, 2707); // aggregateAs
        {int[] a = {2701,2702,2704,2705}; op[2700] = getOpcodeCat(a);}
        op[2701] = getOpcodeRnm(86, 670); // commonExpr
        op[2702] = getOpcodeRep((char)0, (char)1, 2703);
        op[2703] = getOpcodeRnm(392, 2712); // aggregateWith
        op[2704] = getOpcodeRnm(391, 2707); // aggregateAs
        op[2705] = getOpcodeRep((char)0, Character.MAX_VALUE, 2706);
        op[2706] = getOpcodeRnm(393, 2717); // aggregateFrom
        {int[] a = {2708,2709,2710,2711}; op[2707] = getOpcodeCat(a);}
        op[2708] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {97,115}; op[2709] = getOpcodeTbs(a);}
        op[2710] = getOpcodeRnm(328, 2210); // RWS
        op[2711] = getOpcodeRnm(200, 1515); // odataIdentifier
        {int[] a = {2713,2714,2715,2716}; op[2712] = getOpcodeCat(a);}
        op[2713] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {119,105,116,104}; op[2714] = getOpcodeTbs(a);}
        op[2715] = getOpcodeRnm(328, 2210); // RWS
        op[2716] = getOpcodeRnm(394, 2724); // aggregateMethod
        {int[] a = {2718,2719,2720,2721,2722}; op[2717] = getOpcodeCat(a);}
        op[2718] = getOpcodeRnm(328, 2210); // RWS
        {char[] a = {102,114,111,109}; op[2719] = getOpcodeTbs(a);}
        op[2720] = getOpcodeRnm(328, 2210); // RWS
        op[2721] = getOpcodeRnm(395, 2734); // propertyWithPath
        op[2722] = getOpcodeRep((char)0, (char)1, 2723);
        op[2723] = getOpcodeRnm(392, 2712); // aggregateWith
        {int[] a = {2725,2726,2727,2728,2729,2730}; op[2724] = getOpcodeAlt(a);}
        {char[] a = {115,117,109}; op[2725] = getOpcodeTbs(a);}
        {char[] a = {109,105,110}; op[2726] = getOpcodeTbs(a);}
        {char[] a = {109,97,120}; op[2727] = getOpcodeTbs(a);}
        {char[] a = {97,118,101,114,97,103,101}; op[2728] = getOpcodeTbs(a);}
        {char[] a = {99,111,117,110,116,100,105,115,116,105,110,99,116}; op[2729] = getOpcodeTbs(a);}
        {int[] a = {2731,2732,2733}; op[2730] = getOpcodeCat(a);}
        op[2731] = getOpcodeRnm(191, 1501); // namespace
        {char[] a = {46}; op[2732] = getOpcodeTls(a);}
        op[2733] = getOpcodeRnm(200, 1515); // odataIdentifier
        {int[] a = {2735,2739,2755}; op[2734] = getOpcodeCat(a);}
        op[2735] = getOpcodeRep((char)0, (char)1, 2736);
        {int[] a = {2737,2738}; op[2736] = getOpcodeCat(a);}
        op[2737] = getOpcodeRnm(188, 1489); // qualifiedEntityTypeName
        {char[] a = {47}; op[2738] = getOpcodeTls(a);}
        op[2739] = getOpcodeRep((char)0, Character.MAX_VALUE, 2740);
        {int[] a = {2741,2748}; op[2740] = getOpcodeAlt(a);}
        {int[] a = {2742,2743,2747}; op[2741] = getOpcodeCat(a);}
        op[2742] = getOpcodeRnm(210, 1568); // complexProperty
        op[2743] = getOpcodeRep((char)0, (char)1, 2744);
        {int[] a = {2745,2746}; op[2744] = getOpcodeCat(a);}
        {char[] a = {47}; op[2745] = getOpcodeTls(a);}
        op[2746] = getOpcodeRnm(189, 1493); // qualifiedComplexTypeName
        {char[] a = {47}; op[2747] = getOpcodeTls(a);}
        {int[] a = {2749,2750,2754}; op[2748] = getOpcodeCat(a);}
        op[2749] = getOpcodeRnm(213, 1571); // navigationProperty
        op[2750] = getOpcodeRep((char)0, (char)1, 2751);
        {int[] a = {2752,2753}; op[2751] = getOpcodeCat(a);}
        {char[] a = {47}; op[2752] = getOpcodeTls(a);}
        op[2753] = getOpcodeRnm(188, 1489); // qualifiedEntityTypeName
        {char[] a = {47}; op[2754] = getOpcodeTls(a);}
        {int[] a = {2756,2762}; op[2755] = getOpcodeAlt(a);}
        {int[] a = {2757,2758}; op[2756] = getOpcodeCat(a);}
        op[2757] = getOpcodeRnm(213, 1571); // navigationProperty
        op[2758] = getOpcodeRep((char)0, (char)1, 2759);
        {int[] a = {2760,2761}; op[2759] = getOpcodeCat(a);}
        {char[] a = {47}; op[2760] = getOpcodeTls(a);}
        op[2761] = getOpcodeRnm(188, 1489); // qualifiedEntityTypeName
        op[2762] = getOpcodeRnm(396, 2763); // structuralProperty
        {int[] a = {2764,2765,2766,2767,2768}; op[2763] = getOpcodeAlt(a);}
        op[2764] = getOpcodeRnm(206, 1562); // primitiveProperty
        op[2765] = getOpcodeRnm(209, 1567); // primitiveColProperty
        op[2766] = getOpcodeRnm(210, 1568); // complexProperty
        op[2767] = getOpcodeRnm(211, 1569); // complexColProperty
        op[2768] = getOpcodeRnm(212, 1570); // streamProperty
        {int[] a = {2770,2771,2772,2773,2774,2775,2776,2777,2778,2779}; op[2769] = getOpcodeCat(a);}
        {char[] a = {98,111,116,116,111,109,99,111,117,110,116}; op[2770] = getOpcodeTbs(a);}
        op[2771] = getOpcodeRnm(338, 2240); // OPEN
        op[2772] = getOpcodeRnm(329, 2216); // BWS
        op[2773] = getOpcodeRnm(86, 670); // commonExpr
        op[2774] = getOpcodeRnm(329, 2216); // BWS
        op[2775] = getOpcodeRnm(332, 2223); // COMMA
        op[2776] = getOpcodeRnm(329, 2216); // BWS
        op[2777] = getOpcodeRnm(86, 670); // commonExpr
        op[2778] = getOpcodeRnm(329, 2216); // BWS
        op[2779] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2781,2782,2783,2784,2785,2786,2787,2788,2789,2790}; op[2780] = getOpcodeCat(a);}
        {char[] a = {98,111,116,116,111,109,112,101,114,99,101,110,116}; op[2781] = getOpcodeTbs(a);}
        op[2782] = getOpcodeRnm(338, 2240); // OPEN
        op[2783] = getOpcodeRnm(329, 2216); // BWS
        op[2784] = getOpcodeRnm(86, 670); // commonExpr
        op[2785] = getOpcodeRnm(329, 2216); // BWS
        op[2786] = getOpcodeRnm(332, 2223); // COMMA
        op[2787] = getOpcodeRnm(329, 2216); // BWS
        op[2788] = getOpcodeRnm(86, 670); // commonExpr
        op[2789] = getOpcodeRnm(329, 2216); // BWS
        op[2790] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2792,2793,2794,2795,2796,2797,2798,2799,2800,2801}; op[2791] = getOpcodeCat(a);}
        {char[] a = {98,111,116,116,111,109,115,117,109}; op[2792] = getOpcodeTbs(a);}
        op[2793] = getOpcodeRnm(338, 2240); // OPEN
        op[2794] = getOpcodeRnm(329, 2216); // BWS
        op[2795] = getOpcodeRnm(86, 670); // commonExpr
        op[2796] = getOpcodeRnm(329, 2216); // BWS
        op[2797] = getOpcodeRnm(332, 2223); // COMMA
        op[2798] = getOpcodeRnm(329, 2216); // BWS
        op[2799] = getOpcodeRnm(86, 670); // commonExpr
        op[2800] = getOpcodeRnm(329, 2216); // BWS
        op[2801] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2803,2804,2805,2806,2807,2813,2814}; op[2802] = getOpcodeCat(a);}
        {char[] a = {99,111,110,99,97,116}; op[2803] = getOpcodeTbs(a);}
        op[2804] = getOpcodeRnm(338, 2240); // OPEN
        op[2805] = getOpcodeRnm(329, 2216); // BWS
        op[2806] = getOpcodeRnm(386, 2654); // applyExpr
        op[2807] = getOpcodeRep((char)1, Character.MAX_VALUE, 2808);
        {int[] a = {2809,2810,2811,2812}; op[2808] = getOpcodeCat(a);}
        op[2809] = getOpcodeRnm(329, 2216); // BWS
        op[2810] = getOpcodeRnm(332, 2223); // COMMA
        op[2811] = getOpcodeRnm(329, 2216); // BWS
        op[2812] = getOpcodeRnm(386, 2654); // applyExpr
        op[2813] = getOpcodeRnm(329, 2216); // BWS
        op[2814] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2816,2817,2818,2819,2820,2821,2822,2823,2824,2825}; op[2815] = getOpcodeCat(a);}
        {char[] a = {101,120,112,97,110,100}; op[2816] = getOpcodeTbs(a);}
        op[2817] = getOpcodeRnm(338, 2240); // OPEN
        op[2818] = getOpcodeRnm(329, 2216); // BWS
        op[2819] = getOpcodeRnm(48, 379); // expandPath
        op[2820] = getOpcodeRnm(329, 2216); // BWS
        op[2821] = getOpcodeRnm(332, 2223); // COMMA
        op[2822] = getOpcodeRnm(329, 2216); // BWS
        op[2823] = getOpcodeRnm(87, 689); // boolCommonExpr
        op[2824] = getOpcodeRnm(329, 2216); // BWS
        op[2825] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2827,2828,2829,2830,2831,2832}; op[2826] = getOpcodeCat(a);}
        {char[] a = {102,105,108,116,101,114}; op[2827] = getOpcodeTbs(a);}
        op[2828] = getOpcodeRnm(338, 2240); // OPEN
        op[2829] = getOpcodeRnm(329, 2216); // BWS
        op[2830] = getOpcodeRnm(87, 689); // boolCommonExpr
        op[2831] = getOpcodeRnm(329, 2216); // BWS
        op[2832] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2834,2835,2836,2837,2838,2839,2840,2841,2842,2843}; op[2833] = getOpcodeCat(a);}
        {char[] a = {103,114,111,117,112,98,121}; op[2834] = getOpcodeTbs(a);}
        op[2835] = getOpcodeRnm(338, 2240); // OPEN
        op[2836] = getOpcodeRnm(329, 2216); // BWS
        op[2837] = getOpcodeRnm(404, 2844); // groupbyList
        op[2838] = getOpcodeRnm(329, 2216); // BWS
        op[2839] = getOpcodeRnm(332, 2223); // COMMA
        op[2840] = getOpcodeRnm(329, 2216); // BWS
        op[2841] = getOpcodeRnm(386, 2654); // applyExpr
        op[2842] = getOpcodeRnm(329, 2216); // BWS
        op[2843] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2845,2846,2847,2848,2854,2855}; op[2844] = getOpcodeCat(a);}
        op[2845] = getOpcodeRnm(338, 2240); // OPEN
        op[2846] = getOpcodeRnm(329, 2216); // BWS
        op[2847] = getOpcodeRnm(405, 2856); // groupbyElement
        op[2848] = getOpcodeRep((char)0, Character.MAX_VALUE, 2849);
        {int[] a = {2850,2851,2852,2853}; op[2849] = getOpcodeCat(a);}
        op[2850] = getOpcodeRnm(329, 2216); // BWS
        op[2851] = getOpcodeRnm(332, 2223); // COMMA
        op[2852] = getOpcodeRnm(329, 2216); // BWS
        op[2853] = getOpcodeRnm(405, 2856); // groupbyElement
        op[2854] = getOpcodeRnm(329, 2216); // BWS
        op[2855] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2857,2858}; op[2856] = getOpcodeAlt(a);}
        op[2857] = getOpcodeRnm(395, 2734); // propertyWithPath
        op[2858] = getOpcodeRnm(406, 2859); // rollupSpec
        {int[] a = {2860,2861,2862,2863,2866,2872,2873}; op[2859] = getOpcodeCat(a);}
        {char[] a = {114,111,108,108,117,112}; op[2860] = getOpcodeTbs(a);}
        op[2861] = getOpcodeRnm(338, 2240); // OPEN
        op[2862] = getOpcodeRnm(329, 2216); // BWS
        {int[] a = {2864,2865}; op[2863] = getOpcodeAlt(a);}
        {char[] a = {36,97,108,108}; op[2864] = getOpcodeTbs(a);}
        op[2865] = getOpcodeRnm(395, 2734); // propertyWithPath
        op[2866] = getOpcodeRep((char)1, Character.MAX_VALUE, 2867);
        {int[] a = {2868,2869,2870,2871}; op[2867] = getOpcodeCat(a);}
        op[2868] = getOpcodeRnm(329, 2216); // BWS
        op[2869] = getOpcodeRnm(332, 2223); // COMMA
        op[2870] = getOpcodeRnm(329, 2216); // BWS
        op[2871] = getOpcodeRnm(395, 2734); // propertyWithPath
        op[2872] = getOpcodeRnm(329, 2216); // BWS
        op[2873] = getOpcodeRnm(339, 2243); // CLOSE
        {char[] a = {105,100,101,110,116,105,116,121}; op[2874] = getOpcodeTbs(a);}
        {int[] a = {2876,2877,2878,2879,2880,2881,2882,2883,2884,2885}; op[2875] = getOpcodeCat(a);}
        {char[] a = {116,111,112,99,111,117,110,116}; op[2876] = getOpcodeTbs(a);}
        op[2877] = getOpcodeRnm(338, 2240); // OPEN
        op[2878] = getOpcodeRnm(329, 2216); // BWS
        op[2879] = getOpcodeRnm(86, 670); // commonExpr
        op[2880] = getOpcodeRnm(329, 2216); // BWS
        op[2881] = getOpcodeRnm(332, 2223); // COMMA
        op[2882] = getOpcodeRnm(329, 2216); // BWS
        op[2883] = getOpcodeRnm(86, 670); // commonExpr
        op[2884] = getOpcodeRnm(329, 2216); // BWS
        op[2885] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2887,2888,2889,2890,2891,2892,2893,2894,2895,2896}; op[2886] = getOpcodeCat(a);}
        {char[] a = {116,111,112,112,101,114,99,101,110,116}; op[2887] = getOpcodeTbs(a);}
        op[2888] = getOpcodeRnm(338, 2240); // OPEN
        op[2889] = getOpcodeRnm(329, 2216); // BWS
        op[2890] = getOpcodeRnm(86, 670); // commonExpr
        op[2891] = getOpcodeRnm(329, 2216); // BWS
        op[2892] = getOpcodeRnm(332, 2223); // COMMA
        op[2893] = getOpcodeRnm(329, 2216); // BWS
        op[2894] = getOpcodeRnm(86, 670); // commonExpr
        op[2895] = getOpcodeRnm(329, 2216); // BWS
        op[2896] = getOpcodeRnm(339, 2243); // CLOSE
        {int[] a = {2898,2899,2900,2901,2902,2903,2904,2905,2906,2907}; op[2897] = getOpcodeCat(a);}
        {char[] a = {116,111,112,115,117,109}; op[2898] = getOpcodeTbs(a);}
        op[2899] = getOpcodeRnm(338, 2240); // OPEN
        op[2900] = getOpcodeRnm(329, 2216); // BWS
        op[2901] = getOpcodeRnm(86, 670); // commonExpr
        op[2902] = getOpcodeRnm(329, 2216); // BWS
        op[2903] = getOpcodeRnm(332, 2223); // COMMA
        op[2904] = getOpcodeRnm(329, 2216); // BWS
        op[2905] = getOpcodeRnm(86, 670); // commonExpr
        op[2906] = getOpcodeRnm(329, 2216); // BWS
        op[2907] = getOpcodeRnm(339, 2243); // CLOSE
        return op;
    }

    /** Displays the original SABNF grammar on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; grammar.GrammarUnderTest");
        out.println(";");
        out.println(";------------------------------------------------------------------------------");
        out.println("; odata-abnf-construction-rules ");
        out.println(";------------------------------------------------------------------------------");
        out.println(";");
        out.println("; Technical Committee:");
        out.println(";   OASIS Open Data Protocol (OData) TC");
        out.println(";");
        out.println("; Chairs:");
        out.println(";   - Barbara Hartel (barbara.hartel@sap.com), SAP AG");
        out.println(";   - Ram Jeyaraman (Ram.Jeyaraman@microsoft.com), Microsoft");
        out.println(";");
        out.println("; Editors:");
        out.println(";   - Ralf Handl (ralf.handl@sap.com), SAP AG");
        out.println(";   - Michael Pizzo (mikep@microsoft.com), Microsoft");
        out.println(";");
        out.println("; Additional artifacts: ");
        out.println(";   This prose specification is one component of a Work Product which consists");
        out.println(";   of:");
        out.println(";   - OData Version 4.0 Part 1: Protocol");
        out.println(";   - OData Version 4.0 Part 2: URL Conventions");
        out.println(";   - OData Version 4.0 Part 3: Common Schema Definition Language (CSDL)");
        out.println(";   - OData ABNF Construction Rules Version 4.0 (this document)");
        out.println(";   - OData ABNF Test Cases");
        out.println(";   - OData Core Vocabulary");
        out.println(";   - OData Measures Vocabulary");
        out.println(";   - OData Metadata Service Entity Model");
        out.println(";   - OData EDMX XML Schema");
        out.println(";   - OData EDM XML Schema");
        out.println(";");
        out.println("; Related work:");
        out.println(";   This work product is related to the following two Work Products, each of ");
        out.println(";   which define alternate formats for OData payloads");
        out.println(";   - OData JSON Format Version 4.0");
        out.println(";   - OData Atom Format Version 4.0");
        out.println(";   This specification replaces or supersedes:");
        out.println(";   - None");
        out.println(";");
        out.println("; Declared XML namespaces:");
        out.println(";   - None");
        out.println(";");
        out.println("; Abstract:");
        out.println(";   The Open Data Protocol (OData) enables the creation of REST-based data");
        out.println(";   services, which allow resources, identified using Uniform Resource");
        out.println(";   Identifiers (URLs) and defined in a data model, to be published and ");
        out.println(";   edited by Web clients using simple HTTP messages. This document defines");
        out.println(";   the URL syntax for requests and the serialization format for primitive ");
        out.println(";   literals in request and response payloads.");
        out.println(";");
        out.println("; Status:");
        out.println(";   This Working Draft (WD) has been produced by one or more TC Members; it has");
        out.println(";   not yet been voted on by the TC or approved as a Committee Draft (Committee");
        out.println(";   Specification Draft or a Committee Note Draft). The OASIS document Approval");
        out.println(";   Process begins officially with a TC vote to approve a WD as a Committee");
        out.println(";   Draft. A TC may approve a Working Draft, revise it, and re-approve it any");
        out.println(";   number of times as a Committee Draft.");
        out.println(";");
        out.println(";");
        out.println("; Overview:");
        out.println(";   This grammar uses the ABNF defined in RFC5234 with one extension: literals ");
        out.println(";   enclosed in single quotes (e.g. '$metadata') are treated case-sensitive. ");
        out.println(";");
        out.println(";   The following rules assume that URIs have been percent-encoding normalized");
        out.println(";   as described in section 6.2.2.2 of RFC3986 ");
        out.println(";   (http://tools.ietf.org/html/rfc3986#section-6.2.2.2)");
        out.println(";   before applying the grammar to them, i.e. all characters in the unreserved ");
        out.println(";   set (see rule \"unreserved\" below) are plain literals and NOT");
        out.println(";   percent-encoded. ");
        out.println(";");
        out.println(";   For characters outside the unreserved set the rules explicitly state ");
        out.println(";   whether the percent-encoded representation is treated identical to the");
        out.println(";   plain literal representation.");
        out.println("; ");
        out.println(";   One prominent example is the single quote that delimits OData primitive  ");
        out.println(";   type literals: %27 and ' are treated identically, so a single quote within ");
        out.println(";   a string literal is \"encoded\" as two consecutive single quotes in either");
        out.println(";   literal or percent-encoded representation.");
        out.println(";");
        out.println("; Contents:");
        out.println(";   1. Resource Path");
        out.println(";   2. Query Options");
        out.println(";   3. Context URL Fragments");
        out.println(";   4. Expressions");
        out.println(";   5. JSON format for function parameters");
        out.println(";   6. Names and identifiers");
        out.println(";   7. Literal Data Values");
        out.println(";   8. Header values");
        out.println(";   9. Punctuation");
        out.println(";");
        out.println(";   A. URI syntax [RFC3986]");
        out.println(";   B. IRI syntax [RFC3986]");
        out.println(";   C. ABNF core definitions [RFC5234]");
        out.println(";");
        out.println(";------------------------------------------------------------------------------");
        out.println("dummyStartRule = odataUri / header            ; just to please the test parser");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("");
        out.println("odataUri = serviceRoot [ odataRelativeUri ]  ");
        out.println("");
        out.println("serviceRoot = ( \"https\" / \"http\" )                    ; Note: case-insensitive ");
        out.println("              \"://\" host [ \":\" port ]");
        out.println("              \"/\" *( segment-nz \"/\" )");
        out.println("");
        out.println("odataRelativeUri = '$batch'                           ; Note: case-sensitive!");
        out.println("                 / '$entity' \"?\" entityOptions  ");
        out.println("                 / '$metadata' [ \"?\" format ] [ contextFragment ]");
        out.println("                 / resourcePath [ \"?\" queryOptions ]");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 1. Resource Path");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("resourcePath = entitySetName                  [ collectionNavigation ] ");
        out.println("             / singletonEntity                [ singleNavigation ]");
        out.println("             / actionImportCall ");
        out.println("             / entityColFunctionImportCall    [ collectionNavigation ] ");
        out.println("             / entityFunctionImportCall       [ singleNavigation ] ");
        out.println("             / complexColFunctionImportCall   [ collectionPath ] ");
        out.println("             / complexFunctionImportCall      [ complexPath ] ");
        out.println("             / primitiveColFunctionImportCall [ collectionPath ] ");
        out.println("             / primitiveFunctionImportCall    [ singlePath ] ");
        out.println("             / crossjoin");
        out.println("             / '$all'");
        out.println("");
        out.println("collectionNavigation = [ \"/\" qualifiedEntityTypeName ]");
        out.println("                       [ keyPredicate [ singleNavigation ]");
        out.println("                       / collectionPath");
        out.println("                       / ref");
        out.println("                       ]");
        out.println("");
        out.println("keyPredicate     = simpleKey / compoundKey");
        out.println("simpleKey        = OPEN keyPropertyValue CLOSE");
        out.println("compoundKey      = OPEN keyValuePair *( COMMA keyValuePair ) CLOSE");
        out.println("keyValuePair     = ( primitiveKeyProperty / keyPropertyAlias ) EQ keyPropertyValue");
        out.println("keyPropertyValue = primitiveLiteral");
        out.println("keyPropertyAlias = odataIdentifier");
        out.println("");
        out.println("singleNavigation = [ \"/\" qualifiedEntityTypeName ] ");
        out.println("                   [ \"/\" propertyPath");
        out.println("                   / boundOperation");
        out.println("                   / ref ");
        out.println("                   / value  ; request the media resource of a media entity ");
        out.println("                   ]");
        out.println("");
        out.println("propertyPath = entityColNavigationProperty [ collectionNavigation ]");
        out.println("             / entityNavigationProperty    [ singleNavigation ]");
        out.println("             / complexColProperty          [ collectionPath ]");
        out.println("             / complexProperty             [ complexPath ]");
        out.println("             / primitiveColProperty        [ collectionPath ]");
        out.println("             / primitiveProperty           [ singlePath ]");
        out.println("             / streamProperty              [ boundOperation ]");
        out.println("");
        out.println("collectionPath = count / boundOperation");
        out.println("");
        out.println("singlePath     = value / boundOperation");
        out.println("");
        out.println("complexPath    = [ \"/\" qualifiedComplexTypeName ] ");
        out.println("                 ( \"/\" propertyPath ");
        out.println("                 / boundOperation");
        out.println("                 )");
        out.println("");
        out.println("count = '/$count'");
        out.println("ref   = '/$ref'");
        out.println("value = '/$value'");
        out.println("");
        out.println("; boundOperation segments can only be composed if the type of the previous segment ");
        out.println("; matches the type of the first parameter of the action or function being called.");
        out.println("; Note that the rule name reflects the return type of the function.");
        out.println("boundOperation = \"/\" ( boundActionCall");
        out.println("                     / boundEntityColFuncCall    [ collectionNavigation ] ");
        out.println("                     / boundEntityFuncCall       [ singleNavigation ] ");
        out.println("                     / boundComplexColFuncCall   [ collectionPath ] ");
        out.println("                     / boundComplexFuncCall      [ complexPath ]");
        out.println("                     / boundPrimitiveColFuncCall [ collectionPath ] ");
        out.println("                     / boundPrimitiveFuncCall    [ singlePath ] ");
        out.println("                     )");
        out.println("");
        out.println("actionImportCall = actionImport");
        out.println("boundActionCall  = namespace \".\" action");
        out.println("                   ; with the added restriction that the binding parameter MUST be either an entity or collection of entities");
        out.println("                   ; and is specified by reference using the URI immediately preceding (to the left) of the boundActionCall");
        out.println("");
        out.println("; The following boundXxxFuncCall rules have the added restrictions that");
        out.println(";  - the function MUST support binding, and ");
        out.println(";  - the binding parameter type MUST match the type of resource identified by the ");
        out.println(";    URI immediately preceding (to the left) of the boundXxxFuncCall, and");
        out.println(";  - the functionParameters MUST NOT include the bindingParameter.");
        out.println("boundEntityFuncCall       = namespace \".\" entityFunction       functionParameters");
        out.println("boundEntityColFuncCall    = namespace \".\" entityColFunction    functionParameters");
        out.println("boundComplexFuncCall      = namespace \".\" complexFunction      functionParameters");
        out.println("boundComplexColFuncCall   = namespace \".\" complexColFunction   functionParameters");
        out.println("boundPrimitiveFuncCall    = namespace \".\" primitiveFunction    functionParameters");
        out.println("boundPrimitiveColFuncCall = namespace \".\" primitiveColFunction functionParameters");
        out.println("");
        out.println("entityFunctionImportCall       = entityFunctionImport       functionParameters");
        out.println("entityColFunctionImportCall    = entityColFunctionImport    functionParameters");
        out.println("complexFunctionImportCall      = complexFunctionImport      functionParameters");
        out.println("complexColFunctionImportCall   = complexColFunctionImport   functionParameters");
        out.println("primitiveFunctionImportCall    = primitiveFunctionImport    functionParameters");
        out.println("primitiveColFunctionImportCall = primitiveColFunctionImport functionParameters");
        out.println("");
        out.println("functionParameters = OPEN [ functionParameter *( COMMA functionParameter ) ] CLOSE");
        out.println("functionParameter  = parameterName EQ ( parameterAlias / primitiveLiteral )");
        out.println("parameterName      = odataIdentifier");
        out.println("parameterAlias     = AT odataIdentifier");
        out.println("");
        out.println("crossjoin = '$crossjoin' OPEN");
        out.println("            entitySetName *( COMMA entitySetName )");
        out.println("            CLOSE");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 2. Query Options");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("queryOptions = queryOption *( \"&\" queryOption )        ");
        out.println("queryOption  = systemQueryOption  ");
        out.println("             / aliasAndValue ");
        out.println("             / customQueryOption  ");
        out.println("             ");
        out.println("entityOptions = *( entityOption \"&\" ) id *( \"&\" entityOption )");
        out.println("entityOption  = expand ");
        out.println("              / format");
        out.println("              / select");
        out.println("              / customQueryOption");
        out.println("");
        out.println("id = '$id' EQ IRI-in-query       ");
        out.println("");
        out.println("systemQueryOption = expand ");
        out.println("                  / apply");
        out.println("                  / filter ");
        out.println("                  / format ");
        out.println("                  / id");
        out.println("                  / inlinecount ");
        out.println("                  / orderby ");
        out.println("                  / search");
        out.println("                  / select ");
        out.println("                  / skip ");
        out.println("                  / skiptoken");
        out.println("                  / top ");
        out.println("");
        out.println("expand            = '$expand' EQ expandItem *( COMMA expandItem )");
        out.println("expandItem        = STAR [ ref / OPEN levels CLOSE ]");
        out.println("                  / expandPath");
        out.println("                    [ ref   [ OPEN expandRefOption   *( SEMI expandRefOption   ) CLOSE ]");
        out.println("                    / count [ OPEN expandCountOption *( SEMI expandCountOption ) CLOSE ]");
        out.println("                    /         OPEN expandOption      *( SEMI expandOption      ) CLOSE ");
        out.println("                    ]");
        out.println("expandPath        = [ qualifiedEntityTypeName \"/\" ] ");
        out.println("                    *( ( complexProperty / complexColProperty ) \"/\" [ qualifiedComplexTypeName \"/\" ] )");
        out.println("                    navigationProperty ");
        out.println("                    [ \"/\" qualifiedEntityTypeName ]");
        out.println("expandCountOption = filter");
        out.println("                  / search");
        out.println("expandRefOption   = expandCountOption");
        out.println("                  / orderby");
        out.println("                  / skip ");
        out.println("                  / top ");
        out.println("                  / inlinecount");
        out.println("expandOption      = expandRefOption");
        out.println("                  / select ");
        out.println("                  / expand");
        out.println("                  / levels");
        out.println("                ");
        out.println("levels = '$levels' EQ ( 1*DIGIT / 'max' )");
        out.println("");
        out.println("filter = '$filter' EQ boolCommonExpr");
        out.println("");
        out.println("orderby     = '$orderby' EQ orderbyItem *( COMMA orderbyItem )");
        out.println("orderbyItem = commonExpr [ RWS ( 'asc' / 'desc' ) ]");
        out.println("");
        out.println("skip = '$skip' EQ 1*DIGIT");
        out.println("top  = '$top'  EQ 1*DIGIT");
        out.println("");
        out.println("format = '$format' EQ");
        out.println("         ( \"atom\"");
        out.println("         / \"json\" ");
        out.println("         / \"xml\"");
        out.println("         / 1*pchar \"/\" 1*pchar ; <a data service specific value indicating a");
        out.println("         )                     ; format specific to the specific data service> or");
        out.println("                               ; <An IANA-defined [IANA-MMT] content type>");
        out.println("                          ");
        out.println("inlinecount = '$count' EQ booleanValue");
        out.println("");
        out.println("search     = '$search' EQ BWS searchExpr");
        out.println("searchExpr = ( OPEN BWS searchExpr BWS CLOSE");
        out.println("             / searchTerm ");
        out.println("             ) [ searchOrExpr");
        out.println("               / searchAndExpr");
        out.println("               ]");
        out.println("");
        out.println("searchOrExpr  = RWS 'OR'  RWS searchExpr");
        out.println("searchAndExpr = RWS [ 'AND' RWS ] searchExpr");
        out.println("");
        out.println("searchTerm   = [ 'NOT' RWS ] ( searchPhrase / searchWord )");
        out.println("searchPhrase = quotation-mark 1*qchar-no-AMP-DQUOTE quotation-mark");
        out.println("searchWord   = 1*ALPHA ; Actually: any character from the Unicode categories L or Nl, ");
        out.println("                       ; but not the words AND, OR, and NOT");
        out.println("");
        out.println("select         = '$select' EQ selectItem *( COMMA selectItem )");
        out.println("selectItem     = STAR");
        out.println("               / allOperationsInSchema ");
        out.println("               / [ qualifiedEntityTypeName \"/\" ] ");
        out.println("                 ( selectProperty");
        out.println("                 / qualifiedActionName  ");
        out.println("                 / qualifiedFunctionName  ");
        out.println("                 )");
        out.println("selectProperty = primitiveProperty  ");
        out.println("               / primitiveColProperty ");
        out.println("               / navigationProperty");
        out.println("               / selectPath [ \"/\" selectProperty ]");
        out.println("selectPath     = ( complexProperty / complexColProperty ) ");
        out.println("                 [ \"/\" qualifiedComplexTypeName ]               ");
        out.println("");
        out.println("");
        out.println("allOperationsInSchema = namespace \".\" STAR                 ");
        out.println("");
        out.println("; The parameterNames uniquely identify the bound function overload");
        out.println("; only if it has overloads.");
        out.println("qualifiedActionName   = namespace \".\" action");
        out.println("qualifiedFunctionName = namespace \".\" function [ OPEN parameterNames CLOSE ]");
        out.println("");
        out.println("; The names of all non-binding parameters, separated by commas ");
        out.println("parameterNames = parameterName *( COMMA parameterName )");
        out.println("");
        out.println("skiptoken = '$skiptoken' EQ 1*( qchar-no-AMP )");
        out.println("");
        out.println("aliasAndValue = parameterAlias EQ parameterValue");
        out.println("");
        out.println("parameterValue = arrayOrObject");
        out.println("               / commonExpr");
        out.println("");
        out.println("customQueryOption = customName [ EQ customValue ]");
        out.println("customName        = qchar-no-AMP-EQ-AT-DOLLAR *( qchar-no-AMP-EQ ) ");
        out.println("customValue       = *( qchar-no-AMP )");
        out.println("");
        out.println("     ");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 3. Context URL Fragments");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("contextFragment = \"#\" ");
        out.println("                  ( 'Collection($ref)'");
        out.println("                  / '$ref'");
        out.println("                  / 'Collection(Edm.EntityType)'");
        out.println("                  / 'Collection(Edm.ComplexType)'");
        out.println("                  / singletonEntity");
        out.println("                  / qualifiedTypeName");
        out.println("                  / entitySetName '/$deletedEntity'");
        out.println("                  / entitySetName '/$link'");
        out.println("                  / entitySetName '/$deletedLink'");
        out.println("                  / entitySetName [ keyPredicate ] [ \"/\" qualifiedEntityTypeName ] ");
        out.println("                    *( *( \"/\" ( complexProperty / complexColProperty ) [ \"/\" qualifiedComplexTypeName ] )");
        out.println("                       \"/\" navigationProperty");
        out.println("                     ) ");
        out.println("                    [ propertyList ] [ '/$delta'  ] [ entity ]");
        out.println("                  )");
        out.println("");
        out.println("propertyList         = OPEN propertyListItem *( COMMA propertyListItem ) CLOSE");
        out.println("propertyListItem     = STAR ; all structural properties");
        out.println("                     / propertyListProperty");
        out.println("propertyListProperty = primitiveProperty  ");
        out.println("                     / primitiveColProperty ");
        out.println("                     / navigationProperty [ '+' ] [ propertyList ]");
        out.println("                     / selectPath [ \"/\" propertyListProperty ]");
        out.println("                 ");
        out.println("entity = '/$entity'                   ");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 4. Expressions");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("; Note: a boolCommonExpr is also a commonExpr, e.g. sort by Boolean ");
        out.println("commonExpr = ( primitiveLiteral");
        out.println("             / parameterAlias");
        out.println("             / arrayOrObject");
        out.println("             / rootExpr");
        out.println("             / firstMemberExpr");
        out.println("             / functionExpr");
        out.println("             / negateExpr ");
        out.println("             / methodCallExpr ");
        out.println("             / parenExpr ");
        out.println("             / castExpr ");
        out.println("             ) ");
        out.println("             [ addExpr ");
        out.println("             / subExpr ");
        out.println("             / mulExpr ");
        out.println("             / divExpr ");
        out.println("             / modExpr");
        out.println("             ]  ");
        out.println("");
        out.println("boolCommonExpr = ( isofExpr ");
        out.println("                 / boolMethodCallExpr ");
        out.println("                 / notExpr  ");
        out.println("                 / commonExpr");
        out.println("                   [ eqExpr ");
        out.println("                   / neExpr ");
        out.println("                   / ltExpr  ");
        out.println("                   / leExpr  ");
        out.println("                   / gtExpr ");
        out.println("                   / geExpr ");
        out.println("                   / hasExpr ");
        out.println("                   ]");
        out.println("                 / boolParenExpr");
        out.println("                 ) [ andExpr / orExpr ] ");
        out.println("");
        out.println("rootExpr = '$root/' ( entitySetName keyPredicate / singletonEntity ) [ singleNavigationExpr ]");
        out.println("");
        out.println("firstMemberExpr = memberExpr");
        out.println("                / inscopeVariableExpr [ \"/\" memberExpr ]");
        out.println("");
        out.println("memberExpr = [ qualifiedEntityTypeName \"/\" ]");
        out.println("             ( propertyPathExpr");
        out.println("             / boundFunctionExpr ");
        out.println("             )");
        out.println("             ");
        out.println("propertyPathExpr = ( entityColNavigationProperty [ collectionNavigationExpr ] ");
        out.println("                   / entityNavigationProperty    [ singleNavigationExpr ] ");
        out.println("                   / complexColProperty          [ collectionPathExpr ]");
        out.println("                   / complexProperty             [ complexPathExpr ] ");
        out.println("                   / primitiveColProperty        [ collectionPathExpr ]");
        out.println("                   / primitiveProperty           [ singlePathExpr ]");
        out.println("                   / streamProperty");
        out.println("                   )");
        out.println("                   ");
        out.println("inscopeVariableExpr       = implicitVariableExpr ");
        out.println("                          / lambdaVariableExpr ; only allowed inside a lambdaPredicateExpr");
        out.println("implicitVariableExpr      = '$it'              ; references the unnamed outer variable of the query");
        out.println("lambdaVariableExpr        = odataIdentifier");
        out.println("");
        out.println("collectionNavigationExpr = [ \"/\" qualifiedEntityTypeName ]");
        out.println("                           ( keyPredicate [ singleNavigationExpr ] ");
        out.println("                           / collectionPathExpr ");
        out.println("                           )");
        out.println("");
        out.println("singleNavigationExpr = \"/\" memberExpr");
        out.println("");
        out.println("collectionPathExpr = count ");
        out.println("                   / \"/\" boundFunctionExpr");
        out.println("                   / \"/\" anyExpr");
        out.println("                   / \"/\" allExpr");
        out.println(" ");
        out.println("complexPathExpr = \"/\" [ qualifiedComplexTypeName \"/\" ]");
        out.println("                  ( propertyPathExpr ");
        out.println("                  / boundFunctionExpr ");
        out.println("                  )");
        out.println("");
        out.println("singlePathExpr = \"/\" boundFunctionExpr");
        out.println("");
        out.println("boundFunctionExpr = functionExpr ; boundFunction segments can only be composed if the type of the    ");
        out.println("                                 ; previous segment matches the type of the first function parameter");
        out.println("                                     ");
        out.println("functionExpr = namespace \".\"");
        out.println("               ( entityColFunction    functionExprParameters [ collectionNavigationExpr ] ");
        out.println("               / entityFunction       functionExprParameters [ singleNavigationExpr ] ");
        out.println("               / complexColFunction   functionExprParameters [ collectionPathExpr ]");
        out.println("               / complexFunction      functionExprParameters [ complexPathExpr ] ");
        out.println("               / primitiveColFunction functionExprParameters [ collectionPathExpr ] ");
        out.println("               / primitiveFunction    functionExprParameters [ singlePathExpr ] ");
        out.println("               )");
        out.println("");
        out.println("functionExprParameters = OPEN [ functionExprParameter *( COMMA functionExprParameter ) ] CLOSE");
        out.println("functionExprParameter  = parameterName EQ ( parameterAlias / parameterValue )");
        out.println("");
        out.println("anyExpr = 'any' OPEN BWS [ lambdaVariableExpr BWS COLON BWS lambdaPredicateExpr ] BWS CLOSE");
        out.println("allExpr = 'all' OPEN BWS   lambdaVariableExpr BWS COLON BWS lambdaPredicateExpr   BWS CLOSE");
        out.println("lambdaPredicateExpr = boolCommonExpr ; containing at least one lambdaPredicatePrefixExpr");
        out.println("");
        out.println("methodCallExpr = indexOfMethodCallExpr ");
        out.println("               / toLowerMethodCallExpr ");
        out.println("               / toUpperMethodCallExpr  ");
        out.println("               / trimMethodCallExpr ");
        out.println("               / substringMethodCallExpr ");
        out.println("               / concatMethodCallExpr ");
        out.println("               / lengthMethodCallExpr ");
        out.println("               / yearMethodCallExpr ");
        out.println("               / monthMethodCallExpr ");
        out.println("               / dayMethodCallExpr ");
        out.println("               / hourMethodCallExpr ");
        out.println("               / minuteMethodCallExpr ");
        out.println("               / secondMethodCallExpr ");
        out.println("               / fractionalsecondsMethodCallExpr");
        out.println("               / totalsecondsMethodCallExpr");
        out.println("               / dateMethodCallExpr ");
        out.println("               / timeMethodCallExpr ");
        out.println("               / roundMethodCallExpr ");
        out.println("               / floorMethodCallExpr ");
        out.println("               / ceilingMethodCallExpr ");
        out.println("               / distanceMethodCallExpr ");
        out.println("               / geoLengthMethodCallExpr ");
        out.println("               / totalOffsetMinutesMethodCallExpr");
        out.println("               / minDateTimeMethodCallExpr");
        out.println("               / maxDateTimeMethodCallExpr");
        out.println("               / nowMethodCallExpr");
        out.println("");
        out.println("boolMethodCallExpr = endsWithMethodCallExpr ");
        out.println("                   / startsWithMethodCallExpr ");
        out.println("                   / containsMethodCallExpr                                          ");
        out.println("                   / intersectsMethodCallExpr ");
        out.println("");
        out.println("containsMethodCallExpr   = 'contains'   OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("startsWithMethodCallExpr = 'startswith' OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("endsWithMethodCallExpr   = 'endswith'   OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("lengthMethodCallExpr     = 'length'     OPEN BWS commonExpr BWS CLOSE");
        out.println("indexOfMethodCallExpr    = 'indexof'    OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("substringMethodCallExpr  = 'substring'  OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS [ COMMA BWS commonExpr BWS ] CLOSE");
        out.println("toLowerMethodCallExpr    = 'tolower'    OPEN BWS commonExpr BWS CLOSE");
        out.println("toUpperMethodCallExpr    = 'toupper'    OPEN BWS commonExpr BWS CLOSE");
        out.println("trimMethodCallExpr       = 'trim'       OPEN BWS commonExpr BWS CLOSE");
        out.println("concatMethodCallExpr     = 'concat'     OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("");
        out.println("yearMethodCallExpr               = 'year'               OPEN BWS commonExpr BWS CLOSE");
        out.println("monthMethodCallExpr              = 'month'              OPEN BWS commonExpr BWS CLOSE");
        out.println("dayMethodCallExpr                = 'day'                OPEN BWS commonExpr BWS CLOSE");
        out.println("hourMethodCallExpr               = 'hour'               OPEN BWS commonExpr BWS CLOSE");
        out.println("minuteMethodCallExpr             = 'minute'             OPEN BWS commonExpr BWS CLOSE");
        out.println("secondMethodCallExpr             = 'second'             OPEN BWS commonExpr BWS CLOSE");
        out.println("fractionalsecondsMethodCallExpr  = 'fractionalseconds'  OPEN BWS commonExpr BWS CLOSE");
        out.println("totalsecondsMethodCallExpr       = 'totalseconds'       OPEN BWS commonExpr BWS CLOSE");
        out.println("dateMethodCallExpr               = 'date'               OPEN BWS commonExpr BWS CLOSE");
        out.println("timeMethodCallExpr               = 'time'               OPEN BWS commonExpr BWS CLOSE");
        out.println("totalOffsetMinutesMethodCallExpr = 'totaloffsetminutes' OPEN BWS commonExpr BWS CLOSE ");
        out.println("");
        out.println("minDateTimeMethodCallExpr = 'mindatetime(' BWS ')'");
        out.println("maxDateTimeMethodCallExpr = 'maxdatetime(' BWS ')'");
        out.println("nowMethodCallExpr         = 'now(' BWS ')'");
        out.println("");
        out.println("roundMethodCallExpr   = 'round'   OPEN BWS commonExpr BWS CLOSE");
        out.println("floorMethodCallExpr   = 'floor'   OPEN BWS commonExpr BWS CLOSE");
        out.println("ceilingMethodCallExpr = 'ceiling' OPEN BWS commonExpr BWS CLOSE");
        out.println("");
        out.println("distanceMethodCallExpr   = 'geo.distance'   OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("geoLengthMethodCallExpr  = 'geo.length'     OPEN BWS commonExpr BWS CLOSE");
        out.println("intersectsMethodCallExpr = 'geo.intersects' OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("");
        out.println("boolParenExpr = OPEN BWS boolCommonExpr BWS CLOSE");
        out.println("parenExpr     = OPEN BWS commonExpr     BWS CLOSE");
        out.println("");
        out.println("andExpr = RWS 'and' RWS boolCommonExpr");
        out.println("orExpr  = RWS 'or'  RWS boolCommonExpr");
        out.println("");
        out.println("eqExpr = RWS 'eq' RWS commonExpr     ");
        out.println("neExpr = RWS 'ne' RWS commonExpr");
        out.println("ltExpr = RWS 'lt' RWS commonExpr");
        out.println("leExpr = RWS 'le' RWS commonExpr");
        out.println("gtExpr = RWS 'gt' RWS commonExpr");
        out.println("geExpr = RWS 'ge' RWS commonExpr");
        out.println("");
        out.println("hasExpr = RWS 'has' RWS commonExpr");
        out.println("");
        out.println("addExpr = RWS 'add' RWS commonExpr");
        out.println("subExpr = RWS 'sub' RWS commonExpr");
        out.println("mulExpr = RWS 'mul' RWS commonExpr");
        out.println("divExpr = RWS 'div' RWS commonExpr");
        out.println("modExpr = RWS 'mod' RWS commonExpr");
        out.println("");
        out.println("negateExpr = \"-\" BWS commonExpr");
        out.println("");
        out.println("notExpr = 'not' RWS boolCommonExpr");
        out.println("");
        out.println("isofExpr = 'isof' OPEN BWS [ commonExpr BWS COMMA BWS ] qualifiedTypeName BWS CLOSE");
        out.println("castExpr = 'cast' OPEN BWS [ commonExpr BWS COMMA BWS ] qualifiedTypeName BWS CLOSE");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 5. JSON format for function parameters");
        out.println(";------------------------------------------------------------------------------");
        out.println("; Note: the query part of a URI needs to be partially percent-decoded before");
        out.println("; applying these rules, see comment at the top of this file");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("arrayOrObject = complexColInUri  ");
        out.println("              / complexInUri");
        out.println("              / rootExprCol");
        out.println("              / primitiveColInUri");
        out.println("               ");
        out.println("complexColInUri = begin-array ");
        out.println("                  [ complexInUri *( value-separator complexInUri ) ] ");
        out.println("                  end-array");
        out.println("                  ");
        out.println("complexInUri = begin-object");
        out.println("               [ ( annotationInUri ");
        out.println("                 / primitivePropertyInUri ");
        out.println("                 / complexPropertyInUri ");
        out.println("                 / collectionPropertyInUri  ");
        out.println("                 / navigationPropertyInUri");
        out.println("                 )");
        out.println("                 *( value-separator ");
        out.println("                    ( annotationInUri ");
        out.println("                    / primitivePropertyInUri ");
        out.println("                    / complexPropertyInUri ");
        out.println("                    / collectionPropertyInUri  ");
        out.println("                    / navigationPropertyInUri");
        out.println("                    ) ");
        out.println("                  )");
        out.println("               ]  ");
        out.println("               end-object");
        out.println("");
        out.println("collectionPropertyInUri = ( quotation-mark primitiveColProperty quotation-mark ");
        out.println("                            name-separator ");
        out.println("                            primitiveColInUri ");
        out.println("                          ) ");
        out.println("                        / ( quotation-mark complexColProperty quotation-mark ");
        out.println("                            name-separator ");
        out.println("                            complexColInUri");
        out.println("                          )");
        out.println("");
        out.println("primitiveColInUri = begin-array ");
        out.println("                    [ primitiveLiteralInJSON *( value-separator primitiveLiteralInJSON ) ] ");
        out.println("                    end-array");
        out.println("                    ");
        out.println("complexPropertyInUri = quotation-mark complexProperty quotation-mark ");
        out.println("                       name-separator ");
        out.println("                       complexInUri");
        out.println("                            ");
        out.println("annotationInUri = quotation-mark namespace \".\" termName quotation-mark");
        out.println("                  name-separator");
        out.println("                  ( complexInUri / complexColInUri / primitiveLiteralInJSON / primitiveColInUri )");
        out.println("");
        out.println("primitivePropertyInUri = quotation-mark primitiveProperty quotation-mark ");
        out.println("                         name-separator ");
        out.println("                         primitiveLiteralInJSON");
        out.println("");
        out.println("navigationPropertyInUri = singleNavPropInJSON");
        out.println("                        / collectionNavPropInJSON");
        out.println("singleNavPropInJSON     = quotation-mark entityNavigationProperty quotation-mark");
        out.println("													name-separator");
        out.println("													rootExpr");
        out.println("collectionNavPropInJSON = quotation-mark entityColNavigationProperty quotation-mark");
        out.println("													name-separator");
        out.println("													rootExprCol");
        out.println("");
        out.println("rootExprCol = begin-array ");
        out.println("              [ rootExpr *( value-separator rootExpr ) ]");
        out.println("              end-array");
        out.println("                                        ");
        out.println("; JSON syntax: adapted to URI restrictions from [RFC4627]                 ");
        out.println("begin-object = BWS ( \"{\" / \"%7B\" ) BWS");
        out.println("end-object   = BWS ( \"}\" / \"%7D\" ) BWS");
        out.println("");
        out.println("begin-array = BWS ( \"[\" / \"%5B\" ) BWS ");
        out.println("end-array   = BWS ( \"]\" / \"%5D\" ) BWS");
        out.println("");
        out.println("quotation-mark  = DQUOTE / \"%22\"");
        out.println("name-separator  = BWS COLON BWS");
        out.println("value-separator = BWS COMMA BWS");
        out.println("");
        out.println("primitiveLiteralInJSON = stringInJSON");
        out.println("                       / numberInJSON");
        out.println("                       / 'true' ");
        out.println("                       / 'false'");
        out.println("                       / 'null'");
        out.println("");
        out.println("stringInJSON = quotation-mark *charInJSON quotation-mark");
        out.println("charInJSON   = qchar-unescaped  ");
        out.println("             / qchar-JSON-special    ");
        out.println("             / escape ( quotation-mark ");
        out.println("                      / escape");
        out.println("                      / ( \"/\" / \"%2F\" ) ; solidus         U+002F");
        out.println("                      / 'b'             ; backspace       U+0008                ");
        out.println("                      / 'f'             ; form feed       U+000C");
        out.println("                      / 'n'             ; line feed       U+000A");
        out.println("                      / 'r'             ; carriage return U+000D");
        out.println("                      / 't'             ; tab             U+0009");
        out.println("                      / 'u' 4HEXDIG     ;                 U+XXXX");
        out.println("                      )");
        out.println("");
        out.println("qchar-JSON-special = SP / \":\" / \"{\" / \"}\" / \"[\" / \"]\" ; some agents put these unencoded into the query part of a URL");
        out.println("");
        out.println("escape = \"\\\" / \"%5C\"     ; reverse solidus U+005C");
        out.println("");
        out.println("numberInJSON = [ \"-\" ] int [ frac ] [ exp ]");
        out.println("int          = \"0\" / ( oneToNine *DIGIT )");
        out.println("frac         = \".\" 1*DIGIT");
        out.println("exp          = \"e\" [ \"-\" / \"+\" ] 1*DIGIT");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 6. Names and identifiers");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("qualifiedTypeName = qualifiedEntityTypeName ");
        out.println("                  / qualifiedComplexTypeName");
        out.println("                  / qualifiedEnumTypeName");
        out.println("                  / primitiveTypeName ");
        out.println("                  / 'Collection' OPEN ");
        out.println("                    ( qualifiedEntityTypeName ");
        out.println("                    / qualifiedComplexTypeName");
        out.println("                    / qualifiedEnumTypeName ");
        out.println("                    / primitiveTypeName ");
        out.println("                    ) CLOSE");
        out.println("");
        out.println("qualifiedEntityTypeName      = namespace \".\" entityTypeName");
        out.println("qualifiedComplexTypeName     = namespace \".\" complexTypeName");
        out.println("qualifiedEnumTypeName = namespace \".\" enumerationTypeName");
        out.println("");
        out.println("; an alias is just a single-part namespace");
        out.println("namespace     = namespacePart *( \".\" namespacePart )");
        out.println("namespacePart = odataIdentifier");
        out.println("");
        out.println("entitySetName       = odataIdentifier");
        out.println("singletonEntity     = odataIdentifier          ");
        out.println("entityTypeName      = odataIdentifier");
        out.println("complexTypeName     = odataIdentifier ");
        out.println("enumerationTypeName = odataIdentifier");
        out.println("enumerationMember   = odataIdentifier");
        out.println("termName            = odataIdentifier");
        out.println("");
        out.println("; Note: this pattern is overly restrictive, the normative definition is type TSimpleIdentifier in OData EDM XML Schema");
        out.println("odataIdentifier             = identifierLeadingCharacter *127identifierCharacter");
        out.println("identifierLeadingCharacter  = ALPHA / \"_\"         ; plus Unicode characters from the categories L or Nl");
        out.println("identifierCharacter         = ALPHA / \"_\" / DIGIT ; plus Unicode characters from the categories L, Nl, Nd, Mn, Mc, Pc, or Cf");
        out.println("");
        out.println("primitiveTypeName = ['Edm.'] ( 'Binary'");
        out.println("                             / 'Boolean'");
        out.println("                             / 'Byte'");
        out.println("                             / 'Date' ");
        out.println("                             / 'DateTimeOffset'");
        out.println("                             / 'Decimal'");
        out.println("                             / 'Double'");
        out.println("                             / 'Duration' ");
        out.println("                             / 'Guid' ");
        out.println("                             / 'Int16'");
        out.println("                             / 'Int32'");
        out.println("                             / 'Int64'");
        out.println("                             / 'SByte'");
        out.println("                             / 'Single'");
        out.println("                             / 'Stream'");
        out.println("                             / 'String'");
        out.println("                             / 'TimeOfDay'");
        out.println("                             / abstractSpatialTypeName [ concreteSpatialTypeName ] ");
        out.println("                             )");
        out.println("abstractSpatialTypeName = 'Geography'");
        out.println("                        / 'Geometry'");
        out.println("concreteSpatialTypeName = 'Collection'");
        out.println("                        / 'LineString'");
        out.println("                        / 'MultiLineString'");
        out.println("                        / 'MultiPoint'");
        out.println("                        / 'MultiPolygon'");
        out.println("                        / 'Point'");
        out.println("                        / 'Polygon'");
        out.println("");
        out.println("primitiveProperty       = primitiveKeyProperty / primitiveNonKeyProperty");
        out.println("primitiveKeyProperty    = odataIdentifier");
        out.println("primitiveNonKeyProperty = odataIdentifier");
        out.println("primitiveColProperty    = odataIdentifier");
        out.println("complexProperty         = odataIdentifier");
        out.println("complexColProperty      = odataIdentifier");
        out.println("streamProperty          = odataIdentifier");
        out.println("");
        out.println("navigationProperty          = entityNavigationProperty / entityColNavigationProperty  ");
        out.println("entityNavigationProperty    = odataIdentifier");
        out.println("entityColNavigationProperty = odataIdentifier");
        out.println("");
        out.println("action       = odataIdentifier");
        out.println("actionImport = odataIdentifier");
        out.println("");
        out.println("function = entityFunction ");
        out.println("         / entityColFunction ");
        out.println("         / complexFunction ");
        out.println("         / complexColFunction ");
        out.println("         / primitiveFunction ");
        out.println("         / primitiveColFunction");
        out.println("         ");
        out.println("entityFunction       = odataIdentifier");
        out.println("entityColFunction    = odataIdentifier");
        out.println("complexFunction      = odataIdentifier");
        out.println("complexColFunction   = odataIdentifier");
        out.println("primitiveFunction    = odataIdentifier");
        out.println("primitiveColFunction = odataIdentifier");
        out.println("");
        out.println("entityFunctionImport       = odataIdentifier");
        out.println("entityColFunctionImport    = odataIdentifier");
        out.println("complexFunctionImport      = odataIdentifier");
        out.println("complexColFunctionImport   = odataIdentifier");
        out.println("primitiveFunctionImport    = odataIdentifier");
        out.println("primitiveColFunctionImport = odataIdentifier");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 7. Literal Data Values");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("primitiveLiteral = null ");
        out.println("                 / booleanValue ");
        out.println("                 / decimalValue ");
        out.println("                 / doubleValue ");
        out.println("                 / singleValue ");
        out.println("                 / sbyteValue ");
        out.println("                 / byteValue ");
        out.println("                 / int16Value ");
        out.println("                 / int32Value ");
        out.println("                 / int64Value ");
        out.println("                 / binary ");
        out.println("                 / date");
        out.println("                 / dateTimeOffset ");
        out.println("                 / duration");
        out.println("                 / guid ");
        out.println("                 / string ");
        out.println("                 / timeOfDay ");
        out.println("                 / enum");
        out.println("                 / geographyCollection ");
        out.println("                 / geographyLineString ");
        out.println("                 / geographyMultiLineString ");
        out.println("                 / geographyMultiPoint ");
        out.println("                 / geographyMultiPolygon ");
        out.println("                 / geographyPoint ");
        out.println("                 / geographyPolygon ");
        out.println("                 / geometryCollection ");
        out.println("                 / geometryLineString ");
        out.println("                 / geometryMultiLineString ");
        out.println("                 / geometryMultiPoint ");
        out.println("                 / geometryMultiPolygon ");
        out.println("                 / geometryPoint ");
        out.println("                 / geometryPolygon ");
        out.println("");
        out.println("null      = nullValue [ SQUOTE qualifiedTypeName SQUOTE ] ");
        out.println("nullValue = 'null' ");
        out.println("       ; The optional qualifiedTypeName is used to specify what type this null value should be considered. ");
        out.println("       ; Knowing the type is useful for function overload resolution purposes ");
        out.println("                                                ");
        out.println("binary      = ( 'X' / \"binary\" ) SQUOTE binaryValue SQUOTE ; Note: 'X' is case sensitive, \"binary\" is not");
        out.println("binaryValue = *(2HEXDIG)");
        out.println("");
        out.println("booleanValue = \"true\" / \"false\"");
        out.println("");
        out.println("decimalValue = [SIGN] 1*DIGIT [\".\" 1*DIGIT]");
        out.println("");
        out.println("doubleValue = decimalValue [ \"e\" [SIGN] 1*DIGIT ] / nanInfinity ; with restricted number range");
        out.println("singleValue = doubleValue                                       ; with restricted number range");
        out.println("nanInfinity = 'NaN' / '-INF' / 'INF'");
        out.println("");
        out.println("guid     = \"guid\" SQUOTE guidValue SQUOTE");
        out.println("guidValue = 8HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 12HEXDIG ");
        out.println("");
        out.println("byteValue  = 1*3DIGIT           ; numbers in the range from 0 to 255");
        out.println("sbyteValue = [ sign ] 1*3DIGIT  ; numbers in the range from -128 to 127");
        out.println("int16Value = [ sign ] 1*5DIGIT  ; numbers in the range from -32768 to 32767        ");
        out.println("int32Value = [ sign ] 1*10DIGIT ; numbers in the range from -2147483648 to 2147483647");
        out.println("int64Value = [ sign ] 1*19DIGIT ; numbers in the range from -9223372036854775808 to 9223372036854775807");
        out.println("");
        out.println("string           = SQUOTE *( SQUOTE-in-string / pchar-no-SQUOTE ) SQUOTE");
        out.println("SQUOTE-in-string = SQUOTE SQUOTE ; two consecutive single quotes represent one within a string literal");
        out.println("");
        out.println("date      = \"date\" SQUOTE dateValue SQUOTE");
        out.println("dateValue = year \"-\" month \"-\" day");
        out.println("");
        out.println("dateTimeOffset      = \"datetimeoffset\" SQUOTE dateTimeOffsetValue SQUOTE");
        out.println("dateTimeOffsetValue = year \"-\" month \"-\" day \"T\" hour \":\" minute [ \":\" second [ \".\" fractionalSeconds ] ] ( \"Z\" / sign hour \":\" minute )");
        out.println("");
        out.println("duration      = \"duration\" SQUOTE durationValue SQUOTE");
        out.println("durationValue = [ sign ] \"P\" [ 1*DIGIT \"D\" ] [ \"T\" [ 1*DIGIT \"H\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT [ \".\" 1*DIGIT ] \"S\" ] ]");
        out.println("     ; the above is an approximation of the rules for an xml dayTimeDuration.");
        out.println("     ; see the lexical representation for dayTimeDuration in http://www.w3.org/TR/xmlschema11-2#dayTimeDuration for more information");
        out.println("");
        out.println("timeOfDay     = \"timeofday\" SQUOTE timeOfDayValue SQUOTE ");
        out.println("timeOfDayValue = hour \":\" minute [ \":\" second [ \".\" fractionalSeconds ] ]");
        out.println(" ");
        out.println("oneToNine       = \"1\" / \"2\" / \"3\" / \"4\" / \"5\" / \"6\" / \"7\" / \"8\" / \"9\" ");
        out.println("zeroToFiftyNine = ( \"0\" / \"1\" / \"2\" / \"3\" / \"4\" / \"5\" ) DIGIT");
        out.println("year  = [ \"-\" ] ( \"0\" 3DIGIT / oneToNine 3*DIGIT )");
        out.println("month = \"0\" oneToNine");
        out.println("      / \"1\" ( \"0\" / \"1\" / \"2\" )");
        out.println("day   = ( \"0\" / \"1\" / \"2\" ) oneToNine");
        out.println("      / \"3\" ( \"0\" / \"1\" )");
        out.println("hour   = ( \"0\" / \"1\" ) DIGIT");
        out.println("       / \"2\" ( \"1\" / \"2\" / \"3\" ) ");
        out.println("minute = zeroToFiftyNine");
        out.println("second = zeroToFiftyNine       ");
        out.println("fractionalSeconds = 1*12DIGIT");
        out.println("");
        out.println("enum            = qualifiedEnumTypeName SQUOTE enumValue SQUOTE");
        out.println("enumValue       = singleEnumValue *( COMMA singleEnumValue )");
        out.println("singleEnumValue = enumerationMember / int64Value");
        out.println("");
        out.println("geographyCollection   = geographyPrefix SQUOTE fullCollectionLiteral SQUOTE");
        out.println("fullCollectionLiteral = sridLiteral collectionLiteral");
        out.println("collectionLiteral     = \"Collection(\" geoLiteral *( COMMA geoLiteral ) CLOSE");
        out.println("geoLiteral            = collectionLiteral");
        out.println("                      / lineStringLiteral");
        out.println("                      / multiPointLiteral");
        out.println("                      / multiLineStringLiteral");
        out.println("                      / multiPolygonLiteral");
        out.println("                      / pointLiteral");
        out.println("                      / polygonLiteral");
        out.println("");
        out.println("geographyLineString   = geographyPrefix SQUOTE fullLineStringLiteral SQUOTE");
        out.println("fullLineStringLiteral = sridLiteral lineStringLiteral");
        out.println("lineStringLiteral     = \"LineString\" lineStringData");
        out.println("lineStringData        = OPEN positionLiteral 1*( COMMA positionLiteral ) CLOSE");
        out.println("");
        out.println("geographyMultiLineString   = geographyPrefix SQUOTE fullMultiLineStringLiteral SQUOTE");
        out.println("fullMultiLineStringLiteral = sridLiteral multiLineStringLiteral");
        out.println("multiLineStringLiteral     = \"MultiLineString(\" [ lineStringData *( COMMA lineStringData ) ] CLOSE");
        out.println("");
        out.println("geographyMultiPoint   = geographyPrefix SQUOTE fullMultiPointLiteral SQUOTE");
        out.println("fullMultiPointLiteral = sridLiteral multiPointLiteral");
        out.println("multiPointLiteral     = \"MultiPoint(\" [ pointData *( COMMA pointData ) ] CLOSE");
        out.println("");
        out.println("geographyMultiPolygon   = geographyPrefix SQUOTE fullMultiPolygonLiteral SQUOTE");
        out.println("fullMultiPolygonLiteral = sridLiteral multiPolygonLiteral");
        out.println("multiPolygonLiteral     = \"MultiPolygon(\" [ polygonData *( COMMA polygonData ) ] CLOSE");
        out.println("");
        out.println("geographyPoint   = geographyPrefix SQUOTE fullPointLiteral SQUOTE");
        out.println("fullPointLiteral = sridLiteral pointLiteral");
        out.println("sridLiteral      = \"SRID\" EQ 1*5DIGIT SEMI");
        out.println("pointLiteral     =\"Point\" pointData");
        out.println("pointData        = OPEN positionLiteral CLOSE");
        out.println("positionLiteral  = doubleValue SP doubleValue  ; longitude, then latitude");
        out.println("");
        out.println("geographyPolygon   = geographyPrefix SQUOTE fullPolygonLiteral SQUOTE");
        out.println("fullPolygonLiteral = sridLiteral polygonLiteral");
        out.println("polygonLiteral     = \"Polygon\" polygonData");
        out.println("polygonData        = OPEN ringLiteral *( COMMA ringLiteral ) CLOSE");
        out.println("ringLiteral        = OPEN positionLiteral *( COMMA positionLiteral ) CLOSE");
        out.println("                   ; Within each ringLiteral, the first and last positionLiteral elements MUST be an exact syntactic match to each other.");
        out.println("                   ; Within the polygonData, the ringLiterals MUST specify their points in appropriate winding order. ");
        out.println("                   ; In order of traversal, points to the left side of the ring are interpreted as being in the polygon.");
        out.println("");
        out.println("geometryCollection      = geometryPrefix SQUOTE fullCollectionLiteral      SQUOTE");
        out.println("geometryLineString      = geometryPrefix SQUOTE fullLineStringLiteral      SQUOTE");
        out.println("geometryMultiLineString = geometryPrefix SQUOTE fullMultiLineStringLiteral SQUOTE");
        out.println("geometryMultiPoint      = geometryPrefix SQUOTE fullMultiPointLiteral      SQUOTE");
        out.println("geometryMultiPolygon    = geometryPrefix SQUOTE fullMultiPolygonLiteral    SQUOTE");
        out.println("geometryPoint           = geometryPrefix SQUOTE fullPointLiteral           SQUOTE");
        out.println("geometryPolygon         = geometryPrefix SQUOTE fullPolygonLiteral         SQUOTE");
        out.println("");
        out.println("geographyPrefix = \"geography\"");
        out.println("geometryPrefix  = \"geometry\" ");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 8. Header values");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("header = odata-entityid");
        out.println("       / odata-isolation");
        out.println("       / odata-maxversion");
        out.println("       / odata-version");
        out.println("       / prefer");
        out.println("       ");
        out.println("odata-entityid   = \"OData-EntityID\"   COLON OWS IRI-in-header");
        out.println("odata-isolation  = \"OData-Isolation\"  COLON OWS \"snapshot\"");
        out.println("odata-maxversion = \"OData-MaxVersion\" COLON OWS \"4.0\"     ");
        out.println("odata-version    = \"OData-Version\"    COLON OWS \"4.0\"     ");
        out.println("      ");
        out.println("prefer     = \"Prefer\" COLON OWS preference *( COMMA preference )       ");
        out.println("preference = allowEntityReferencesPreference");
        out.println("           / callbackPreference");
        out.println("           / continueOnErrorPreference");
        out.println("           / includeAnnotationsPreference");
        out.println("           / maxpagesizePreference");
        out.println("           / respondAsyncPreference");
        out.println("           / returnPreference");
        out.println("           / trackChangesPreference");
        out.println("           / waitPreference");
        out.println("           ; and everything allowed by http://tools.ietf.org/html/draft-snell-http-prefer-18");
        out.println("           ; / token [ BWS \"=\" BWS word ] *( OWS \";\" [ OWS parameter ] )");
        out.println("           ");
        out.println("allowEntityReferencesPreference = \"odata.allow-entityreferences\"");
        out.println("");
        out.println("callbackPreference = \"odata.callback\" OWS \";\" OWS \"url\" BWS EQ BWS DQUOTE URI DQUOTE");
        out.println("");
        out.println("continueOnErrorPreference = \"odata.continue-on-error\"           ");
        out.println("           ");
        out.println("includeAnnotationsPreference = \"odata.include-annotations\" BWS EQ BWS DQUOTE annotationsList DQUOTE");
        out.println("annotationsList      = annotationIdentifier *(COMMA annotationIdentifier)");
        out.println("annotationIdentifier = [ excludeOperator ]");
        out.println("                       ( STAR ");
        out.println("                       / namespace \".\" ( termName / STAR ) ");
        out.println("                       ) ");
        out.println("excludeOperator      = \"-\"");
        out.println("           ");
        out.println("maxpagesizePreference = \"odata.maxpagesize\" BWS EQ BWS oneToNine *DIGIT         ");
        out.println("");
        out.println("respondAsyncPreference = \"respond-async\"");
        out.println("");
        out.println("returnPreference = \"return\" BWS EQ BWS ( 'representation' / 'minimal' )");
        out.println("");
        out.println("trackChangesPreference = \"odata.track-changes\"");
        out.println("");
        out.println("waitPreference = \"wait\" BWS EQ BWS 1*DIGIT");
        out.println("");
        out.println(";parameter      = token [ BWS \"=\" BWS word ]");
        out.println(";word           = token / quoted-string");
        out.println(";token          = 1*tchar");
        out.println(";tchar          = \"!\" / \"#\" / \"$\" / \"%\" / \"&\" / \"'\" / \"*\"");
        out.println(";               / \"+\" / \"-\" / \".\" / \"^\" / \"_\" / \"`\" / \"|\" / \"~\"");
        out.println(";               / DIGIT / ALPHA");
        out.println(";quoted-string  = DQUOTE *( qdtext / quoted-pair ) DQUOTE");
        out.println(";qdtext         = %x21 / %x23-5B / %x5D-7E / obs-text / OWS");
        out.println("obs-text       = %x80-FF");
        out.println(";quoted-pair    = \"\\\" ( HTAB / SP / VCHAR / obs-text )");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 9. Punctuation");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("OWS =  *( SP / HTAB / \"%20\" / \"%09\" )  ; \"optional\" whitespace ");
        out.println("RWS = 1*( SP / HTAB / \"%20\" / \"%09\" )  ; \"required\" whitespace ");
        out.println("BWS = OWS                              ; \"bad\" whitespace ");
        out.println("");
        out.println("AT     = \"@\" / \"%40\"");
        out.println("COLON  = \":\" / \"%3A\"");
        out.println("COMMA  = \",\" / \"%2C\"");
        out.println("EQ     = \"=\"");
        out.println("SIGN   = \"+\" / \"%2B\" / \"-\"");
        out.println("SEMI   = \";\" / \"%3B\"");
        out.println("STAR   = \"*\" / \"%2A\"");
        out.println("SQUOTE = \"'\" / \"%27\"");
        out.println("");
        out.println("OPEN  = \"(\" / \"%28\"");
        out.println("CLOSE = \")\" / \"%29\"");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; A. URI syntax [RFC3986]");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("URI           = scheme \":\" hier-part [ \"?\" query ] [ \"#\" fragment ]");
        out.println("hier-part     = \"//\" authority path-abempty");
        out.println("              / path-absolute");
        out.println("              / path-rootless");
        out.println(";              / path-empty");
        out.println(";URI-reference = URI / relative-ref");
        out.println(";absolute-URI  = scheme \":\" hier-part [ \"?\" query ]");
        out.println(";relative-ref  = relative-part [ \"?\" query ] [ \"#\" fragment ]");
        out.println(";relative-part = \"//\" authority path-abempty");
        out.println(";              / path-absolute");
        out.println(";              / path-noscheme");
        out.println(";              / path-empty");
        out.println("scheme        = ALPHA *( ALPHA / DIGIT / \"+\" / \"-\" / \".\" )");
        out.println("authority     = [ userinfo \"@\" ] host [ \":\" port ]");
        out.println("userinfo      = *( unreserved / pct-encoded / sub-delims / \":\" )");
        out.println("host          = IP-literal / IPv4address / reg-name");
        out.println("port          = *DIGIT");
        out.println("IP-literal    = \"[\" ( IPv6address / IPvFuture  ) \"]\"");
        out.println("IPvFuture     = \"v\" 1*HEXDIG \".\" 1*( unreserved / sub-delims / \":\" )");
        out.println("IPv6address   =                            6( h16 \":\" ) ls32");
        out.println("                 /                       \"::\" 5( h16 \":\" ) ls32");
        out.println("                 / [               h16 ] \"::\" 4( h16 \":\" ) ls32");
        out.println("                 / [ *1( h16 \":\" ) h16 ] \"::\" 3( h16 \":\" ) ls32");
        out.println("                 / [ *2( h16 \":\" ) h16 ] \"::\" 2( h16 \":\" ) ls32");
        out.println("                 / [ *3( h16 \":\" ) h16 ] \"::\"    h16 \":\"   ls32");
        out.println("                 / [ *4( h16 \":\" ) h16 ] \"::\"              ls32");
        out.println("                 / [ *5( h16 \":\" ) h16 ] \"::\"              h16");
        out.println("                 / [ *6( h16 \":\" ) h16 ] \"::\"");
        out.println("h16           = 1*4HEXDIG");
        out.println("ls32          = ( h16 \":\" h16 ) / IPv4address");
        out.println("IPv4address   = dec-octet \".\" dec-octet \".\" dec-octet \".\" dec-octet");
        out.println("dec-octet     = \"1\" 2DIGIT            ; 100-199");
        out.println("              / \"2\" %x30-34 DIGIT     ; 200-249");
        out.println("              / \"25\" %x30-35          ; 250-255");
        out.println("              / %x31-39 DIGIT         ; 10-99");
        out.println("              / DIGIT                 ; 0-9");
        out.println("reg-name      = *( unreserved / pct-encoded / sub-delims )");
        out.println(";path          = path-abempty    ; begins with \"/\" or is empty");
        out.println(";              / path-absolute   ; begins with \"/\" but not \"//\"");
        out.println(";              / path-noscheme   ; begins with a non-colon segment");
        out.println(";              / path-rootless   ; begins with a segment");
        out.println(";              / path-empty      ; zero characters");
        out.println("path-abempty  = *( \"/\" segment )");
        out.println("path-absolute = \"/\" [ segment-nz *( \"/\" segment ) ]");
        out.println(";path-noscheme = segment-nz-nc *( \"/\" segment )");
        out.println("path-rootless = segment-nz *( \"/\" segment )");
        out.println(";path-empty    = \"\"");
        out.println("segment       = *pchar");
        out.println("segment-nz    = 1*pchar");
        out.println(";segment-nz-nc = 1*( unreserved / pct-encoded / sub-delims / \"@\" ) ; non-zero-length segment without any colon \":\"");
        out.println("pchar         = unreserved / pct-encoded / sub-delims / \":\" / \"@\"");
        out.println("query         = *( pchar / \"/\" / \"?\" )");
        out.println("fragment      = *( pchar / \"/\" / \"?\" )");
        out.println("pct-encoded   = \"%\" HEXDIG HEXDIG");
        out.println("unreserved    = ALPHA / DIGIT / \"-\" / \".\" / \"_\" / \"~\"");
        out.println(";reserved      = gen-delims / sub-delims");
        out.println(";gen-delims    = \":\" / \"/\" / \"?\" / \"#\" / \"[\" / \"]\" / \"@\"");
        out.println(";sub-delims    = \"!\" / \"$\" / \"&\" / \"'\" / \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\" / \"=\"");
        out.println("sub-delims     =       \"$\" / \"&\" / \"'\" /                                     \"=\" / other-delims");
        out.println("other-delims   = \"!\" /                   \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\"");
        out.println("");
        out.println("pchar-no-SQUOTE       = unreserved / pct-encoded-no-SQUOTE / other-delims / \"$\" / \"&\" / \"=\" / \":\" / \"@\"");
        out.println("pct-encoded-no-SQUOTE = \"%\" ( \"0\" / \"1\" /   \"3\" / \"4\" / \"5\" / \"6\" / \"8\" / \"9\" / A-to-F ) HEXDIG ");
        out.println("                      / \"%\" \"2\" ( \"0\" / \"1\" / \"2\" / \"3\" / \"4\" / \"5\" / \"6\" /   \"8\" / \"9\" / A-to-F )");
        out.println("");
        out.println("qchar-no-AMP              = unreserved / pct-encoded / other-delims / \":\" / \"@\" / \"/\" / \"?\" / \"$\" / \"'\" / \"=\"");
        out.println("qchar-no-AMP-EQ           = unreserved / pct-encoded / other-delims / \":\" / \"@\" / \"/\" / \"?\" / \"$\" / \"'\"");
        out.println("qchar-no-AMP-EQ-AT-DOLLAR = unreserved / pct-encoded / other-delims / \":\" /       \"/\" / \"?\" /       \"'\"");
        out.println("");
        out.println("qchar-unescaped       = unreserved / pct-encoded-unescaped / other-delims / \":\" / \"@\" / \"/\" / \"?\" / \"$\" / \"'\" / \"=\"");
        out.println("pct-encoded-unescaped = \"%\" ( \"0\" / \"1\" /   \"3\" / \"4\" /   \"6\" / \"8\" / \"9\" / A-to-F ) HEXDIG ");
        out.println("                      / \"%\" \"2\" ( \"0\" / \"1\" /   \"3\" / \"4\" / \"5\" / \"6\" / \"7\" / \"8\" / \"9\" / A-to-F ) ");
        out.println("                      / \"%\" \"5\" ( DIGIT / \"A\" / \"B\" /   \"D\" / \"E\" / \"F\" )");
        out.println("");
        out.println("qchar-no-AMP-DQUOTE   = qchar-unescaped ");
        out.println("                      / escape ( escape / quotation-mark )");
        out.println("                 ");
        out.println("                 ");
        out.println(";------------------------------------------------------------------------------");
        out.println("; B. IRI syntax [RFC3987]");
        out.println(";------------------------------------------------------------------------------");
        out.println("; Note: these are over-generous stubs, for the actual patterns refer to RFC3987");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("IRI-in-header = 1*( VCHAR / obs-text )");
        out.println("IRI-in-query  = 1*qchar-no-AMP");
        out.println("");
        out.println("                      ");
        out.println(";------------------------------------------------------------------------------");
        out.println("; C. ABNF core definitions [RFC5234]");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("ALPHA  = %x41-5A / %x61-7A ");
        out.println("DIGIT  = %x30-39 ");
        out.println("HEXDIG = DIGIT / A-to-F");
        out.println("A-to-F = \"A\" / \"B\" / \"C\" / \"D\" / \"E\" / \"F\" ");
        out.println("DQUOTE = %x22");
        out.println("SP     = %x20 ");
        out.println("HTAB   = %x09 ");
        out.println(";WSP    = SP / HTAB ");
        out.println(";LWSP = *(WSP / CRLF WSP) ");
        out.println("VCHAR = %x21-7E ");
        out.println(";CHAR = %x01-7F");
        out.println(";LOCTET = %x00-FF ");
        out.println(";CR     = %x0D ");
        out.println(";LF     = %x0A ");
        out.println(";CRLF   = CR LF");
        out.println(";BIT = \"0\" / \"1\" ");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; End of odata-abnf-construction-rules");
        out.println(";------------------------------------------------------------------------------");
        out.println(";------------------------------------------------------------------------------");
        out.println("; odata-aggregation-abnf");
        out.println(";------------------------------------------------------------------------------");
        out.println(";");
        out.println("; Technical Committee:");
        out.println(";   OASIS Open Data Protocol (OData) TC");
        out.println(";");
        out.println("; Chairs:");
        out.println(";   - Barbara Hartel (barbara.hartel@sap.com), SAP AG");
        out.println(";   - Ram Jeyaraman (Ram.Jeyaraman@microsoft.com), Microsoft");
        out.println(";");
        out.println("; Editors:");
        out.println(";   - Ralf Handl (ralf.handl@sap.com), SAP AG");
        out.println(";   - Hubert Heijkers (hubert.heijkers@nl.ibm.com), IBM");
        out.println(";   - Gerald Krause (gerald.krause@sap.com), SAP AG");
        out.println(";   - Michael Pizzo (mikep@microsoft.com), Microsoft");
        out.println(";   - Martin Zurmuehl (martin.zurmuehl@sap.com), SAP AG");
        out.println(";");
        out.println("; Additional artifacts: ");
        out.println(";   This prose specification is one component of a Work Product that consists");
        out.println(";   of:");
        out.println(";   - OData Extension for Data Aggregation Version 4.0 (this document)");
        out.println(";   - OData Aggregation Vocabulary");
        out.println(";");
        out.println("; Related work:");
        out.println(";   This specification is related to:");
        out.println(";   - OData Version 4.0 Part 1: Protocol");
        out.println(";   - OData Version 4.0 Part 2: URL Conventions");
        out.println(";   - OData Version 4.0 Part 3: CSDL");
        out.println(";   - OData ABNF Construction Rules Version 4.0");
        out.println(";   - OData Core Vocabulary");
        out.println(";   - OData Measures Vocabulary");
        out.println(";   - OData JSON Format Version 4.0");
        out.println(";   This specification replaces or supersedes:");
        out.println(";   - None");
        out.println(";");
        out.println("; Declared XML namespaces:");
        out.println(";   - None");
        out.println(";");
        out.println("; Abstract:");
        out.println(";   This specification adds basic grouping and aggregation functionality (e.g.");
        out.println(";   sum, min, and max) to the Open Data Protocol (OData) without changing any");
        out.println(";   of the base principles of OData.");
        out.println(";");
        out.println("; Status:");
        out.println(";   This Working Draft (WD) has been produced by one or more TC Members; it has");
        out.println(";   not yet been voted on by the TC or approved as a Committee Draft (Committee");
        out.println(";   Specification Draft or a Committee Note Draft). The OASIS document Approval");
        out.println(";   Process begins officially with a TC vote to approve a WD as a Committee");
        out.println(";   Draft. A TC may approve a Working Draft, revise it, and re-approve it any");
        out.println(";   number of times as a Committee Draft.");
        out.println(";");
        out.println(";");
        out.println("; Overview:");
        out.println(";   This grammar uses the ABNF defined in RFC5234 with one extension: literals ");
        out.println(";   enclosed in single quotes (e.g. '$metadata') are treated case-sensitive. ");
        out.println(";");
        out.println(";   The following rules assume that URIs have been percent-encoding normalized");
        out.println(";   as described in section 6.2.2.2 of RFC3986 ");
        out.println(";   (http://tools.ietf.org/html/rfc3986#section-6.2.2.2)");
        out.println(";   before applying the grammar to them, i.e. all characters in the unreserved ");
        out.println(";   set (see rule \"unreserved\" below) are plain literals and NOT");
        out.println(";   percent-encoded. ");
        out.println(";");
        out.println(";   For characters outside the unreserved set the rules explicitly state ");
        out.println(";   whether the percent-encoded representation is treated identical to the");
        out.println(";   plain literal representation.");
        out.println("; ");
        out.println(";   One prominent example is the single quote that delimits OData primitive  ");
        out.println(";   type literals: %27 and ' are treated identically, so a single quote within ");
        out.println(";   a string literal is \"encoded\" as two consecutive single quotes in either");
        out.println(";   literal or percent-encoded representation.");
        out.println(";");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("");
        out.println("; TODO: make this possible in Java APG");
        out.println("; systemQueryOption =/ apply");
        out.println("");
        out.println("");
        out.println("apply      = '$apply' EQ applyExpr");
        out.println("applyExpr  = applyTrafo *( \"/\" applyTrafo )");
        out.println("applyTrafo = aggregateTrafo");
        out.println("           / bottomcountTrafo");
        out.println("           / bottompercentTrafo");
        out.println("           / bottomsumTrafo");
        out.println("           / concatTrafo");
        out.println("           / expandTrafo");
        out.println("           / filterTrafo");
        out.println("           / groupbyTrafo");
        out.println("           / identityTrafo");
        out.println("           / topcountTrafo");
        out.println("           / toppercentTrafo");
        out.println("           / topsumTrafo");
        out.println("");
        out.println("aggregateTrafo  = 'aggregate' OPEN [ BWS aggregateParam *( BWS COMMA BWS aggregateParam ) ] BWS CLOSE");
        out.println("aggregateParam  = expandPath OPEN aggregateExpr CLOSE   ");
        out.println("                / aggregateExpr");
        out.println("                / propertyWithPath");
        out.println("aggregateExpr   = ( '$count'                     aggregateAs ");
        out.println("                  / commonExpr [ aggregateWith ] aggregateAs *( aggregateFrom ) ");
        out.println("                  ) ");
        out.println("aggregateAs     = RWS 'as'   RWS odataIdentifier");
        out.println("aggregateWith   = RWS 'with' RWS aggregateMethod        ");
        out.println("aggregateFrom   = RWS 'from' RWS propertyWithPath [ aggregateWith ]");
        out.println("aggregateMethod = 'sum' ");
        out.println("                / 'min' ");
        out.println("                / 'max' ");
        out.println("                / 'average' ");
        out.println("                / 'countdistinct' ");
        out.println("                / namespace \".\" odataIdentifier");
        out.println("");
        out.println("; TODO: do we allow aggregation of primitive values in collections of complex or primitive type?                 ");
        out.println("propertyWithPath = [ qualifiedEntityTypeName \"/\" ] ");
        out.println("                   *( complexProperty    [ \"/\" qualifiedComplexTypeName ] \"/\"");
        out.println("                    / navigationProperty [ \"/\" qualifiedEntityTypeName  ] \"/\" ");
        out.println("                    ) ");
        out.println("                   ( navigationProperty [ \"/\" qualifiedEntityTypeName ] ");
        out.println("                   / structuralProperty ");
        out.println("                   )");
        out.println("");
        out.println("structuralProperty = primitiveProperty  ");
        out.println("                   / primitiveColProperty ");
        out.println("                   / complexProperty ");
        out.println("                   / complexColProperty ");
        out.println("                   / streamProperty");
        out.println("");
        out.println("bottomcountTrafo   = 'bottomcount'   OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("bottompercentTrafo = 'bottompercent' OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("bottomsumTrafo     = 'bottomsum'     OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("");
        out.println("concatTrafo = 'concat' OPEN BWS applyExpr 1*( BWS COMMA BWS applyExpr ) BWS CLOSE");
        out.println("expandTrafo = 'expand' OPEN BWS expandPath BWS COMMA BWS boolCommonExpr BWS CLOSE");
        out.println("filterTrafo = 'filter' OPEN BWS boolCommonExpr BWS CLOSE");
        out.println("");
        out.println("groupbyTrafo   = 'groupby' OPEN BWS groupbyList BWS COMMA BWS applyExpr BWS CLOSE");
        out.println("groupbyList    = OPEN BWS groupbyElement *( BWS COMMA BWS groupbyElement ) BWS CLOSE");
        out.println("groupbyElement = propertyWithPath / rollupSpec");
        out.println("rollupSpec     = 'rollup' OPEN BWS ");
        out.println("                  ( '$all' / propertyWithPath )");
        out.println("                  1*( BWS COMMA BWS propertyWithPath ) ");
        out.println("                  BWS CLOSE");
        out.println("");
        out.println("identityTrafo = 'identity'");
        out.println("");
        out.println("topcountTrafo   = 'topcount'   OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("toppercentTrafo = 'toppercent' OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("topsumTrafo     = 'topsum'     OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; End of odata-aggregation-abnf");
        out.println(";------------------------------------------------------------------------------");
    }
}
