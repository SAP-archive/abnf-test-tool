package grammar;

import apg.Grammar;
import java.io.PrintStream;
/** This class has been generated automatically from an SABNF grammer by
 * Java APG, the {@link apg.Generator} class.<br>
 * It is an extension of the {@link apg.Grammar}
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
    public static int ruleCount = 437;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>432</code>, name = <code>"A-to-F"</code> */
        A_TO_F("A-to-F", 432, 3211, 7),
        /** id = <code>250</code>, name = <code>"abstractSpatialTypeName"</code> */
        ABSTRACTSPATIALTYPENAME("abstractSpatialTypeName", 250, 2020, 3),
        /** id = <code>262</code>, name = <code>"action"</code> */
        ACTION("action", 262, 2045, 1),
        /** id = <code>263</code>, name = <code>"actionImport"</code> */
        ACTIONIMPORT("actionImport", 263, 2046, 1),
        /** id = <code>28</code>, name = <code>"actionImportCall"</code> */
        ACTIONIMPORTCALL("actionImportCall", 28, 265, 1),
        /** id = <code>188</code>, name = <code>"addExpr"</code> */
        ADDEXPR("addExpr", 188, 1637, 5),
        /** id = <code>99</code>, name = <code>"aliasAndValue"</code> */
        ALIASANDVALUE("aliasAndValue", 99, 840, 4),
        /** id = <code>140</code>, name = <code>"allExpr"</code> */
        ALLEXPR("allExpr", 140, 1258, 11),
        /** id = <code>93</code>, name = <code>"allOperationsInSchema"</code> */
        ALLOPERATIONSINSCHEMA("allOperationsInSchema", 93, 803, 4),
        /** id = <code>364</code>, name = <code>"allowEntityReferencesPreference"</code> */
        ALLOWENTITYREFERENCESPREFERENCE("allowEntityReferencesPreference", 364, 2685, 4),
        /** id = <code>429</code>, name = <code>"ALPHA"</code> */
        ALPHA("ALPHA", 429, 3204, 3),
        /** id = <code>178</code>, name = <code>"andExpr"</code> */
        ANDEXPR("andExpr", 178, 1587, 5),
        /** id = <code>124</code>, name = <code>"annotation"</code> */
        ANNOTATION("annotation", 124, 1110, 11),
        /** id = <code>123</code>, name = <code>"annotationExpr"</code> */
        ANNOTATIONEXPR("annotationExpr", 123, 1102, 8),
        /** id = <code>369</code>, name = <code>"annotationIdentifier"</code> */
        ANNOTATIONIDENTIFIER("annotationIdentifier", 369, 2723, 15),
        /** id = <code>204</code>, name = <code>"annotationInUri"</code> */
        ANNOTATIONINURI("annotationInUri", 204, 1765, 15),
        /** id = <code>125</code>, name = <code>"annotationQualifier"</code> */
        ANNOTATIONQUALIFIER("annotationQualifier", 125, 1121, 1),
        /** id = <code>368</code>, name = <code>"annotationsList"</code> */
        ANNOTATIONSLIST("annotationsList", 368, 2717, 6),
        /** id = <code>139</code>, name = <code>"anyExpr"</code> */
        ANYEXPR("anyExpr", 139, 1245, 13),
        /** id = <code>198</code>, name = <code>"arrayOrObject"</code> */
        ARRAYOROBJECT("arrayOrObject", 198, 1701, 5),
        /** id = <code>382</code>, name = <code>"AT"</code> */
        AT("AT", 382, 2788, 3),
        /** id = <code>395</code>, name = <code>"authority"</code> */
        AUTHORITY("authority", 395, 2845, 10),
        /** id = <code>282</code>, name = <code>"base64b16"</code> */
        BASE64B16("base64b16", 282, 2137, 22),
        /** id = <code>283</code>, name = <code>"base64b8"</code> */
        BASE64B8("base64b8", 283, 2159, 9),
        /** id = <code>284</code>, name = <code>"base64char"</code> */
        BASE64CHAR("base64char", 284, 2168, 5),
        /** id = <code>52</code>, name = <code>"batchOption"</code> */
        BATCHOPTION("batchOption", 52, 422, 3),
        /** id = <code>51</code>, name = <code>"batchOptions"</code> */
        BATCHOPTIONS("batchOptions", 51, 416, 6),
        /** id = <code>212</code>, name = <code>"begin-array"</code> */
        BEGIN_ARRAY("begin-array", 212, 1822, 6),
        /** id = <code>210</code>, name = <code>"begin-object"</code> */
        BEGIN_OBJECT("begin-object", 210, 1811, 6),
        /** id = <code>280</code>, name = <code>"binary"</code> */
        BINARY("binary", 280, 2124, 5),
        /** id = <code>281</code>, name = <code>"binaryValue"</code> */
        BINARYVALUE("binaryValue", 281, 2129, 8),
        /** id = <code>117</code>, name = <code>"boolCommonExpr"</code> */
        BOOLCOMMONEXPR("boolCommonExpr", 117, 1043, 1),
        /** id = <code>285</code>, name = <code>"booleanValue"</code> */
        BOOLEANVALUE("booleanValue", 285, 2173, 3),
        /** id = <code>143</code>, name = <code>"boolMethodCallExpr"</code> */
        BOOLMETHODCALLEXPR("boolMethodCallExpr", 143, 1298, 7),
        /** id = <code>29</code>, name = <code>"boundActionCall"</code> */
        BOUNDACTIONCALL("boundActionCall", 29, 266, 6),
        /** id = <code>33</code>, name = <code>"boundComplexColFunctionCall"</code> */
        BOUNDCOMPLEXCOLFUNCTIONCALL("boundComplexColFunctionCall", 33, 293, 7),
        /** id = <code>32</code>, name = <code>"boundComplexFunctionCall"</code> */
        BOUNDCOMPLEXFUNCTIONCALL("boundComplexFunctionCall", 32, 286, 7),
        /** id = <code>31</code>, name = <code>"boundEntityColFunctionCall"</code> */
        BOUNDENTITYCOLFUNCTIONCALL("boundEntityColFunctionCall", 31, 279, 7),
        /** id = <code>30</code>, name = <code>"boundEntityFunctionCall"</code> */
        BOUNDENTITYFUNCTIONCALL("boundEntityFunctionCall", 30, 272, 7),
        /** id = <code>36</code>, name = <code>"boundFunctionCallNoParens"</code> */
        BOUNDFUNCTIONCALLNOPARENS("boundFunctionCallNoParens", 36, 314, 37),
        /** id = <code>135</code>, name = <code>"boundFunctionExpr"</code> */
        BOUNDFUNCTIONEXPR("boundFunctionExpr", 135, 1192, 1),
        /** id = <code>27</code>, name = <code>"boundOperation"</code> */
        BOUNDOPERATION("boundOperation", 27, 236, 29),
        /** id = <code>35</code>, name = <code>"boundPrimitiveColFunctionCall"</code> */
        BOUNDPRIMITIVECOLFUNCTIONCALL("boundPrimitiveColFunctionCall", 35, 307, 7),
        /** id = <code>34</code>, name = <code>"boundPrimitiveFunctionCall"</code> */
        BOUNDPRIMITIVEFUNCTIONCALL("boundPrimitiveFunctionCall", 34, 300, 7),
        /** id = <code>381</code>, name = <code>"BWS"</code> */
        BWS("BWS", 381, 2782, 6),
        /** id = <code>378</code>, name = <code>"BWS-h"</code> */
        BWS_H("BWS-h", 378, 2768, 4),
        /** id = <code>291</code>, name = <code>"byteValue"</code> */
        BYTEVALUE("byteValue", 291, 2216, 2),
        /** id = <code>365</code>, name = <code>"callbackPreference"</code> */
        CALLBACKPREFERENCE("callbackPreference", 365, 2689, 12),
        /** id = <code>197</code>, name = <code>"castExpr"</code> */
        CASTEXPR("castExpr", 197, 1688, 13),
        /** id = <code>170</code>, name = <code>"ceilingMethodCallExpr"</code> */
        CEILINGMETHODCALLEXPR("ceilingMethodCallExpr", 170, 1511, 7),
        /** id = <code>219</code>, name = <code>"charInJSON"</code> */
        CHARINJSON("charInJSON", 219, 1855, 20),
        /** id = <code>391</code>, name = <code>"CLOSE"</code> */
        CLOSE("CLOSE", 391, 2814, 3),
        /** id = <code>320</code>, name = <code>"collectionLiteral"</code> */
        COLLECTIONLITERAL("collectionLiteral", 320, 2442, 8),
        /** id = <code>5</code>, name = <code>"collectionNavigation"</code> */
        COLLECTIONNAVIGATION("collectionNavigation", 5, 96, 7),
        /** id = <code>129</code>, name = <code>"collectionNavigationExpr"</code> */
        COLLECTIONNAVIGATIONEXPR("collectionNavigationExpr", 129, 1130, 11),
        /** id = <code>6</code>, name = <code>"collectionNavPath"</code> */
        COLLECTIONNAVPATH("collectionNavPath", 6, 103, 16),
        /** id = <code>208</code>, name = <code>"collectionNavPropInJSON"</code> */
        COLLECTIONNAVPROPINJSON("collectionNavPropInJSON", 208, 1795, 6),
        /** id = <code>132</code>, name = <code>"collectionPathExpr"</code> */
        COLLECTIONPATHEXPR("collectionPathExpr", 132, 1151, 24),
        /** id = <code>201</code>, name = <code>"collectionPropertyInUri"</code> */
        COLLECTIONPROPERTYINURI("collectionPropertyInUri", 201, 1736, 13),
        /** id = <code>383</code>, name = <code>"COLON"</code> */
        COLON("COLON", 383, 2791, 3),
        /** id = <code>384</code>, name = <code>"COMMA"</code> */
        COMMA("COMMA", 384, 2794, 3),
        /** id = <code>116</code>, name = <code>"commonExpr"</code> */
        COMMONEXPR("commonExpr", 116, 1007, 36),
        /** id = <code>268</code>, name = <code>"complexColFunction"</code> */
        COMPLEXCOLFUNCTION("complexColFunction", 268, 2057, 1),
        /** id = <code>274</code>, name = <code>"complexColFunctionImport"</code> */
        COMPLEXCOLFUNCTIONIMPORT("complexColFunctionImport", 274, 2063, 1),
        /** id = <code>40</code>, name = <code>"complexColFunctionImportCall"</code> */
        COMPLEXCOLFUNCTIONIMPORTCALL("complexColFunctionImportCall", 40, 360, 3),
        /** id = <code>199</code>, name = <code>"complexColInUri"</code> */
        COMPLEXCOLINURI("complexColInUri", 199, 1706, 10),
        /** id = <code>19</code>, name = <code>"complexColPath"</code> */
        COMPLEXCOLPATH("complexColPath", 19, 202, 11),
        /** id = <code>131</code>, name = <code>"complexColPathExpr"</code> */
        COMPLEXCOLPATHEXPR("complexColPathExpr", 131, 1144, 7),
        /** id = <code>257</code>, name = <code>"complexColProperty"</code> */
        COMPLEXCOLPROPERTY("complexColProperty", 257, 2038, 1),
        /** id = <code>267</code>, name = <code>"complexFunction"</code> */
        COMPLEXFUNCTION("complexFunction", 267, 2056, 1),
        /** id = <code>273</code>, name = <code>"complexFunctionImport"</code> */
        COMPLEXFUNCTIONIMPORT("complexFunctionImport", 273, 2062, 1),
        /** id = <code>39</code>, name = <code>"complexFunctionImportCall"</code> */
        COMPLEXFUNCTIONIMPORTCALL("complexFunctionImportCall", 39, 357, 3),
        /** id = <code>200</code>, name = <code>"complexInUri"</code> */
        COMPLEXINURI("complexInUri", 200, 1716, 20),
        /** id = <code>20</code>, name = <code>"complexPath"</code> */
        COMPLEXPATH("complexPath", 20, 213, 11),
        /** id = <code>133</code>, name = <code>"complexPathExpr"</code> */
        COMPLEXPATHEXPR("complexPathExpr", 133, 1175, 11),
        /** id = <code>256</code>, name = <code>"complexProperty"</code> */
        COMPLEXPROPERTY("complexProperty", 256, 2037, 1),
        /** id = <code>203</code>, name = <code>"complexPropertyInUri"</code> */
        COMPLEXPROPERTYINURI("complexPropertyInUri", 203, 1759, 6),
        /** id = <code>241</code>, name = <code>"complexTypeName"</code> */
        COMPLEXTYPENAME("complexTypeName", 241, 1980, 1),
        /** id = <code>9</code>, name = <code>"compoundKey"</code> */
        COMPOUNDKEY("compoundKey", 9, 129, 8),
        /** id = <code>61</code>, name = <code>"compute"</code> */
        COMPUTE("compute", 61, 483, 10),
        /** id = <code>63</code>, name = <code>"computedProperty"</code> */
        COMPUTEDPROPERTY("computedProperty", 63, 499, 1),
        /** id = <code>62</code>, name = <code>"computeItem"</code> */
        COMPUTEITEM("computeItem", 62, 493, 6),
        /** id = <code>144</code>, name = <code>"concatMethodCallExpr"</code> */
        CONCATMETHODCALLEXPR("concatMethodCallExpr", 144, 1305, 11),
        /** id = <code>251</code>, name = <code>"concreteSpatialTypeName"</code> */
        CONCRETESPATIALTYPENAME("concreteSpatialTypeName", 251, 2023, 8),
        /** id = <code>108</code>, name = <code>"containmentNavigation"</code> */
        CONTAINMENTNAVIGATION("containmentNavigation", 108, 917, 7),
        /** id = <code>145</code>, name = <code>"containsMethodCallExpr"</code> */
        CONTAINSMETHODCALLEXPR("containsMethodCallExpr", 145, 1316, 11),
        /** id = <code>356</code>, name = <code>"content-id"</code> */
        CONTENT_ID("content-id", 356, 2627, 5),
        /** id = <code>105</code>, name = <code>"context"</code> */
        CONTEXT("context", 105, 863, 3),
        /** id = <code>106</code>, name = <code>"contextFragment"</code> */
        CONTEXTFRAGMENT("contextFragment", 106, 866, 43),
        /** id = <code>113</code>, name = <code>"contextPropertyPath"</code> */
        CONTEXTPROPERTYPATH("contextPropertyPath", 113, 980, 14),
        /** id = <code>366</code>, name = <code>"continueOnErrorPreference"</code> */
        CONTINUEONERRORPREFERENCE("continueOnErrorPreference", 366, 2701, 8),
        /** id = <code>23</code>, name = <code>"count"</code> */
        COUNT("count", 23, 229, 1),
        /** id = <code>48</code>, name = <code>"crossjoin"</code> */
        CROSSJOIN("crossjoin", 48, 396, 9),
        /** id = <code>103</code>, name = <code>"customName"</code> */
        CUSTOMNAME("customName", 103, 857, 4),
        /** id = <code>102</code>, name = <code>"customQueryOption"</code> */
        CUSTOMQUERYOPTION("customQueryOption", 102, 851, 6),
        /** id = <code>104</code>, name = <code>"customValue"</code> */
        CUSTOMVALUE("customValue", 104, 861, 2),
        /** id = <code>162</code>, name = <code>"dateMethodCallExpr"</code> */
        DATEMETHODCALLEXPR("dateMethodCallExpr", 162, 1461, 7),
        /** id = <code>299</code>, name = <code>"dateTimeOffsetValue"</code> */
        DATETIMEOFFSETVALUE("dateTimeOffsetValue", 299, 2254, 15),
        /** id = <code>300</code>, name = <code>"dateTimeOffsetValueInUrl"</code> */
        DATETIMEOFFSETVALUEINURL("dateTimeOffsetValueInUrl", 300, 2269, 15),
        /** id = <code>298</code>, name = <code>"dateValue"</code> */
        DATEVALUE("dateValue", 298, 2248, 6),
        /** id = <code>309</code>, name = <code>"day"</code> */
        DAY("day", 309, 2387, 14),
        /** id = <code>156</code>, name = <code>"dayMethodCallExpr"</code> */
        DAYMETHODCALLEXPR("dayMethodCallExpr", 156, 1419, 7),
        /** id = <code>405</code>, name = <code>"dec-octet"</code> */
        DEC_OCTET("dec-octet", 405, 2991, 16),
        /** id = <code>286</code>, name = <code>"decimalValue"</code> */
        DECIMALVALUE("decimalValue", 286, 2176, 19),
        /** id = <code>97</code>, name = <code>"deltatoken"</code> */
        DELTATOKEN("deltatoken", 97, 830, 5),
        /** id = <code>430</code>, name = <code>"DIGIT"</code> */
        DIGIT("DIGIT", 430, 3207, 1),
        /** id = <code>121</code>, name = <code>"directMemberExpr"</code> */
        DIRECTMEMBEREXPR("directMemberExpr", 121, 1069, 4),
        /** id = <code>171</code>, name = <code>"distanceMethodCallExpr"</code> */
        DISTANCEMETHODCALLEXPR("distanceMethodCallExpr", 171, 1518, 11),
        /** id = <code>192</code>, name = <code>"divbyExpr"</code> */
        DIVBYEXPR("divbyExpr", 192, 1657, 5),
        /** id = <code>191</code>, name = <code>"divExpr"</code> */
        DIVEXPR("divExpr", 191, 1652, 5),
        /** id = <code>287</code>, name = <code>"doubleValue"</code> */
        DOUBLEVALUE("doubleValue", 287, 2195, 1),
        /** id = <code>433</code>, name = <code>"DQUOTE"</code> */
        DQUOTE("DQUOTE", 433, 3218, 1),
        /** id = <code>0</code>, name = <code>"dummyStartRule"</code> */
        DUMMYSTARTRULE("dummyStartRule", 0, 0, 4),
        /** id = <code>301</code>, name = <code>"duration"</code> */
        DURATION("duration", 301, 2284, 6),
        /** id = <code>302</code>, name = <code>"durationValue"</code> */
        DURATIONVALUE("durationValue", 302, 2290, 32),
        /** id = <code>22</code>, name = <code>"each"</code> */
        EACH("each", 22, 228, 1),
        /** id = <code>213</code>, name = <code>"end-array"</code> */
        END_ARRAY("end-array", 213, 1828, 5),
        /** id = <code>211</code>, name = <code>"end-object"</code> */
        END_OBJECT("end-object", 211, 1817, 5),
        /** id = <code>146</code>, name = <code>"endsWithMethodCallExpr"</code> */
        ENDSWITHMETHODCALLEXPR("endsWithMethodCallExpr", 146, 1327, 11),
        /** id = <code>58</code>, name = <code>"entityCastOption"</code> */
        ENTITYCASTOPTION("entityCastOption", 58, 457, 4),
        /** id = <code>57</code>, name = <code>"entityCastOptions"</code> */
        ENTITYCASTOPTIONS("entityCastOptions", 57, 447, 10),
        /** id = <code>266</code>, name = <code>"entityColFunction"</code> */
        ENTITYCOLFUNCTION("entityColFunction", 266, 2055, 1),
        /** id = <code>272</code>, name = <code>"entityColFunctionImport"</code> */
        ENTITYCOLFUNCTIONIMPORT("entityColFunctionImport", 272, 2061, 1),
        /** id = <code>38</code>, name = <code>"entityColFunctionImportCall"</code> */
        ENTITYCOLFUNCTIONIMPORTCALL("entityColFunctionImportCall", 38, 354, 3),
        /** id = <code>261</code>, name = <code>"entityColNavigationProperty"</code> */
        ENTITYCOLNAVIGATIONPROPERTY("entityColNavigationProperty", 261, 2044, 1),
        /** id = <code>265</code>, name = <code>"entityFunction"</code> */
        ENTITYFUNCTION("entityFunction", 265, 2054, 1),
        /** id = <code>271</code>, name = <code>"entityFunctionImport"</code> */
        ENTITYFUNCTIONIMPORT("entityFunctionImport", 271, 2060, 1),
        /** id = <code>37</code>, name = <code>"entityFunctionImportCall"</code> */
        ENTITYFUNCTIONIMPORTCALL("entityFunctionImportCall", 37, 351, 3),
        /** id = <code>358</code>, name = <code>"entityid"</code> */
        ENTITYID("entityid", 358, 2634, 7),
        /** id = <code>56</code>, name = <code>"entityIdOption"</code> */
        ENTITYIDOPTION("entityIdOption", 56, 444, 3),
        /** id = <code>260</code>, name = <code>"entityNavigationProperty"</code> */
        ENTITYNAVIGATIONPROPERTY("entityNavigationProperty", 260, 2043, 1),
        /** id = <code>55</code>, name = <code>"entityOptions"</code> */
        ENTITYOPTIONS("entityOptions", 55, 434, 10),
        /** id = <code>107</code>, name = <code>"entitySet"</code> */
        ENTITYSET("entitySet", 107, 909, 8),
        /** id = <code>238</code>, name = <code>"entitySetName"</code> */
        ENTITYSETNAME("entitySetName", 238, 1977, 1),
        /** id = <code>240</code>, name = <code>"entityTypeName"</code> */
        ENTITYTYPENAME("entityTypeName", 240, 1979, 1),
        /** id = <code>314</code>, name = <code>"enum"</code> */
        ENUM("enum", 314, 2418, 6),
        /** id = <code>244</code>, name = <code>"enumerationMember"</code> */
        ENUMERATIONMEMBER("enumerationMember", 244, 1983, 1),
        /** id = <code>243</code>, name = <code>"enumerationTypeName"</code> */
        ENUMERATIONTYPENAME("enumerationTypeName", 243, 1982, 1),
        /** id = <code>317</code>, name = <code>"enumMemberValue"</code> */
        ENUMMEMBERVALUE("enumMemberValue", 317, 2433, 1),
        /** id = <code>315</code>, name = <code>"enumValue"</code> */
        ENUMVALUE("enumValue", 315, 2424, 6),
        /** id = <code>385</code>, name = <code>"EQ"</code> */
        EQ("EQ", 385, 2797, 1),
        /** id = <code>379</code>, name = <code>"EQ-h"</code> */
        EQ_H("EQ-h", 379, 2772, 4),
        /** id = <code>180</code>, name = <code>"eqExpr"</code> */
        EQEXPR("eqExpr", 180, 1597, 5),
        /** id = <code>221</code>, name = <code>"escape"</code> */
        ESCAPE("escape", 221, 1882, 3),
        /** id = <code>370</code>, name = <code>"excludeOperator"</code> */
        EXCLUDEOPERATOR("excludeOperator", 370, 2738, 1),
        /** id = <code>225</code>, name = <code>"exp"</code> */
        EXP("exp", 225, 1903, 8),
        /** id = <code>64</code>, name = <code>"expand"</code> */
        EXPAND("expand", 64, 500, 10),
        /** id = <code>67</code>, name = <code>"expandCountOption"</code> */
        EXPANDCOUNTOPTION("expandCountOption", 67, 574, 3),
        /** id = <code>65</code>, name = <code>"expandItem"</code> */
        EXPANDITEM("expandItem", 65, 510, 7),
        /** id = <code>69</code>, name = <code>"expandOption"</code> */
        EXPANDOPTION("expandOption", 69, 583, 7),
        /** id = <code>66</code>, name = <code>"expandPath"</code> */
        EXPANDPATH("expandPath", 66, 517, 57),
        /** id = <code>68</code>, name = <code>"expandRefOption"</code> */
        EXPANDREFOPTION("expandRefOption", 68, 577, 6),
        /** id = <code>71</code>, name = <code>"filter"</code> */
        FILTER("filter", 71, 601, 6),
        /** id = <code>21</code>, name = <code>"filterInPath"</code> */
        FILTERINPATH("filterInPath", 21, 224, 4),
        /** id = <code>119</code>, name = <code>"firstMemberExpr"</code> */
        FIRSTMEMBEREXPR("firstMemberExpr", 119, 1053, 8),
        /** id = <code>169</code>, name = <code>"floorMethodCallExpr"</code> */
        FLOORMETHODCALLEXPR("floorMethodCallExpr", 169, 1504, 7),
        /** id = <code>77</code>, name = <code>"format"</code> */
        FORMAT("format", 77, 646, 15),
        /** id = <code>224</code>, name = <code>"frac"</code> */
        FRAC("frac", 224, 1899, 4),
        /** id = <code>313</code>, name = <code>"fractionalSeconds"</code> */
        FRACTIONALSECONDS("fractionalSeconds", 313, 2416, 2),
        /** id = <code>160</code>, name = <code>"fractionalsecondsMethodCallExpr"</code> */
        FRACTIONALSECONDSMETHODCALLEXPR("fractionalsecondsMethodCallExpr", 160, 1447, 7),
        /** id = <code>414</code>, name = <code>"fragment"</code> */
        FRAGMENT("fragment", 414, 3046, 5),
        /** id = <code>319</code>, name = <code>"fullCollectionLiteral"</code> */
        FULLCOLLECTIONLITERAL("fullCollectionLiteral", 319, 2439, 3),
        /** id = <code>323</code>, name = <code>"fullLineStringLiteral"</code> */
        FULLLINESTRINGLITERAL("fullLineStringLiteral", 323, 2463, 3),
        /** id = <code>327</code>, name = <code>"fullMultiLineStringLiteral"</code> */
        FULLMULTILINESTRINGLITERAL("fullMultiLineStringLiteral", 327, 2482, 3),
        /** id = <code>330</code>, name = <code>"fullMultiPointLiteral"</code> */
        FULLMULTIPOINTLITERAL("fullMultiPointLiteral", 330, 2500, 3),
        /** id = <code>333</code>, name = <code>"fullMultiPolygonLiteral"</code> */
        FULLMULTIPOLYGONLITERAL("fullMultiPolygonLiteral", 333, 2518, 3),
        /** id = <code>336</code>, name = <code>"fullPointLiteral"</code> */
        FULLPOINTLITERAL("fullPointLiteral", 336, 2536, 3),
        /** id = <code>342</code>, name = <code>"fullPolygonLiteral"</code> */
        FULLPOLYGONLITERAL("fullPolygonLiteral", 342, 2561, 3),
        /** id = <code>264</code>, name = <code>"function"</code> */
        FUNCTION("function", 264, 2047, 7),
        /** id = <code>136</code>, name = <code>"functionExpr"</code> */
        FUNCTIONEXPR("functionExpr", 136, 1193, 36),
        /** id = <code>138</code>, name = <code>"functionExprParameter"</code> */
        FUNCTIONEXPRPARAMETER("functionExprParameter", 138, 1239, 6),
        /** id = <code>137</code>, name = <code>"functionExprParameters"</code> */
        FUNCTIONEXPRPARAMETERS("functionExprParameters", 137, 1229, 10),
        /** id = <code>43</code>, name = <code>"functionImportCallNoParens"</code> */
        FUNCTIONIMPORTCALLNOPARENS("functionImportCallNoParens", 43, 369, 7),
        /** id = <code>45</code>, name = <code>"functionParameter"</code> */
        FUNCTIONPARAMETER("functionParameter", 45, 386, 6),
        /** id = <code>44</code>, name = <code>"functionParameters"</code> */
        FUNCTIONPARAMETERS("functionParameters", 44, 376, 10),
        /** id = <code>185</code>, name = <code>"geExpr"</code> */
        GEEXPR("geExpr", 185, 1622, 5),
        /** id = <code>318</code>, name = <code>"geographyCollection"</code> */
        GEOGRAPHYCOLLECTION("geographyCollection", 318, 2434, 5),
        /** id = <code>322</code>, name = <code>"geographyLineString"</code> */
        GEOGRAPHYLINESTRING("geographyLineString", 322, 2458, 5),
        /** id = <code>326</code>, name = <code>"geographyMultiLineString"</code> */
        GEOGRAPHYMULTILINESTRING("geographyMultiLineString", 326, 2477, 5),
        /** id = <code>329</code>, name = <code>"geographyMultiPoint"</code> */
        GEOGRAPHYMULTIPOINT("geographyMultiPoint", 329, 2495, 5),
        /** id = <code>332</code>, name = <code>"geographyMultiPolygon"</code> */
        GEOGRAPHYMULTIPOLYGON("geographyMultiPolygon", 332, 2513, 5),
        /** id = <code>335</code>, name = <code>"geographyPoint"</code> */
        GEOGRAPHYPOINT("geographyPoint", 335, 2531, 5),
        /** id = <code>341</code>, name = <code>"geographyPolygon"</code> */
        GEOGRAPHYPOLYGON("geographyPolygon", 341, 2556, 5),
        /** id = <code>353</code>, name = <code>"geographyPrefix"</code> */
        GEOGRAPHYPREFIX("geographyPrefix", 353, 2618, 1),
        /** id = <code>172</code>, name = <code>"geoLengthMethodCallExpr"</code> */
        GEOLENGTHMETHODCALLEXPR("geoLengthMethodCallExpr", 172, 1529, 7),
        /** id = <code>321</code>, name = <code>"geoLiteral"</code> */
        GEOLITERAL("geoLiteral", 321, 2450, 8),
        /** id = <code>346</code>, name = <code>"geometryCollection"</code> */
        GEOMETRYCOLLECTION("geometryCollection", 346, 2583, 5),
        /** id = <code>347</code>, name = <code>"geometryLineString"</code> */
        GEOMETRYLINESTRING("geometryLineString", 347, 2588, 5),
        /** id = <code>348</code>, name = <code>"geometryMultiLineString"</code> */
        GEOMETRYMULTILINESTRING("geometryMultiLineString", 348, 2593, 5),
        /** id = <code>349</code>, name = <code>"geometryMultiPoint"</code> */
        GEOMETRYMULTIPOINT("geometryMultiPoint", 349, 2598, 5),
        /** id = <code>350</code>, name = <code>"geometryMultiPolygon"</code> */
        GEOMETRYMULTIPOLYGON("geometryMultiPolygon", 350, 2603, 5),
        /** id = <code>351</code>, name = <code>"geometryPoint"</code> */
        GEOMETRYPOINT("geometryPoint", 351, 2608, 5),
        /** id = <code>352</code>, name = <code>"geometryPolygon"</code> */
        GEOMETRYPOLYGON("geometryPolygon", 352, 2613, 5),
        /** id = <code>354</code>, name = <code>"geometryPrefix"</code> */
        GEOMETRYPREFIX("geometryPrefix", 354, 2619, 1),
        /** id = <code>184</code>, name = <code>"gtExpr"</code> */
        GTEXPR("gtExpr", 184, 1617, 5),
        /** id = <code>290</code>, name = <code>"guidValue"</code> */
        GUIDVALUE("guidValue", 290, 2201, 15),
        /** id = <code>402</code>, name = <code>"h16"</code> */
        H16("h16", 402, 2975, 2),
        /** id = <code>187</code>, name = <code>"hasExpr"</code> */
        HASEXPR("hasExpr", 187, 1632, 5),
        /** id = <code>175</code>, name = <code>"hasSubsequenceMethodCallExpr"</code> */
        HASSUBSEQUENCEMETHODCALLEXPR("hasSubsequenceMethodCallExpr", 175, 1558, 11),
        /** id = <code>174</code>, name = <code>"hasSubsetMethodCallExpr"</code> */
        HASSUBSETMETHODCALLEXPR("hasSubsetMethodCallExpr", 174, 1547, 11),
        /** id = <code>355</code>, name = <code>"header"</code> */
        HEADER("header", 355, 2620, 7),
        /** id = <code>431</code>, name = <code>"HEXDIG"</code> */
        HEXDIG("HEXDIG", 431, 3208, 3),
        /** id = <code>393</code>, name = <code>"hier-part"</code> */
        HIER_PART("hier-part", 393, 2829, 7),
        /** id = <code>397</code>, name = <code>"host"</code> */
        HOST("host", 397, 2861, 4),
        /** id = <code>310</code>, name = <code>"hour"</code> */
        HOUR("hour", 310, 2401, 13),
        /** id = <code>157</code>, name = <code>"hourMethodCallExpr"</code> */
        HOURMETHODCALLEXPR("hourMethodCallExpr", 157, 1426, 7),
        /** id = <code>435</code>, name = <code>"HTAB"</code> */
        HTAB("HTAB", 435, 3220, 1),
        /** id = <code>59</code>, name = <code>"id"</code> */
        ID("id", 59, 461, 6),
        /** id = <code>248</code>, name = <code>"identifierCharacter"</code> */
        IDENTIFIERCHARACTER("identifierCharacter", 248, 1992, 4),
        /** id = <code>247</code>, name = <code>"identifierLeadingCharacter"</code> */
        IDENTIFIERLEADINGCHARACTER("identifierLeadingCharacter", 247, 1989, 3),
        /** id = <code>127</code>, name = <code>"implicitVariableExpr"</code> */
        IMPLICITVARIABLEEXPR("implicitVariableExpr", 127, 1126, 3),
        /** id = <code>367</code>, name = <code>"includeAnnotationsPreference"</code> */
        INCLUDEANNOTATIONSPREFERENCE("includeAnnotationsPreference", 367, 2709, 8),
        /** id = <code>76</code>, name = <code>"index"</code> */
        INDEX("index", 76, 639, 7),
        /** id = <code>147</code>, name = <code>"indexOfMethodCallExpr"</code> */
        INDEXOFMETHODCALLEXPR("indexOfMethodCallExpr", 147, 1338, 11),
        /** id = <code>186</code>, name = <code>"inExpr"</code> */
        INEXPR("inExpr", 186, 1627, 5),
        /** id = <code>78</code>, name = <code>"inlinecount"</code> */
        INLINECOUNT("inlinecount", 78, 661, 6),
        /** id = <code>126</code>, name = <code>"inscopeVariableExpr"</code> */
        INSCOPEVARIABLEEXPR("inscopeVariableExpr", 126, 1122, 4),
        /** id = <code>223</code>, name = <code>"int"</code> */
        INT("int", 223, 1893, 6),
        /** id = <code>293</code>, name = <code>"int16Value"</code> */
        INT16VALUE("int16Value", 293, 2223, 5),
        /** id = <code>294</code>, name = <code>"int32Value"</code> */
        INT32VALUE("int32Value", 294, 2228, 5),
        /** id = <code>295</code>, name = <code>"int64Value"</code> */
        INT64VALUE("int64Value", 295, 2233, 5),
        /** id = <code>173</code>, name = <code>"intersectsMethodCallExpr"</code> */
        INTERSECTSMETHODCALLEXPR("intersectsMethodCallExpr", 173, 1536, 11),
        /** id = <code>399</code>, name = <code>"IP-literal"</code> */
        IP_LITERAL("IP-literal", 399, 2867, 6),
        /** id = <code>404</code>, name = <code>"IPv4address"</code> */
        IPV4ADDRESS("IPv4address", 404, 2983, 8),
        /** id = <code>401</code>, name = <code>"IPv6address"</code> */
        IPV6ADDRESS("IPv6address", 401, 2883, 92),
        /** id = <code>400</code>, name = <code>"IPvFuture"</code> */
        IPVFUTURE("IPvFuture", 400, 2873, 10),
        /** id = <code>427</code>, name = <code>"IRI-in-header"</code> */
        IRI_IN_HEADER("IRI-in-header", 427, 3198, 4),
        /** id = <code>428</code>, name = <code>"IRI-in-query"</code> */
        IRI_IN_QUERY("IRI-in-query", 428, 3202, 2),
        /** id = <code>196</code>, name = <code>"isofExpr"</code> */
        ISOFEXPR("isofExpr", 196, 1675, 13),
        /** id = <code>359</code>, name = <code>"isolation"</code> */
        ISOLATION("isolation", 359, 2641, 7),
        /** id = <code>14</code>, name = <code>"keyPathLiteral"</code> */
        KEYPATHLITERAL("keyPathLiteral", 14, 151, 2),
        /** id = <code>13</code>, name = <code>"keyPathSegments"</code> */
        KEYPATHSEGMENTS("keyPathSegments", 13, 147, 4),
        /** id = <code>7</code>, name = <code>"keyPredicate"</code> */
        KEYPREDICATE("keyPredicate", 7, 119, 4),
        /** id = <code>12</code>, name = <code>"keyPropertyAlias"</code> */
        KEYPROPERTYALIAS("keyPropertyAlias", 12, 146, 1),
        /** id = <code>11</code>, name = <code>"keyPropertyValue"</code> */
        KEYPROPERTYVALUE("keyPropertyValue", 11, 145, 1),
        /** id = <code>10</code>, name = <code>"keyValuePair"</code> */
        KEYVALUEPAIR("keyValuePair", 10, 137, 8),
        /** id = <code>141</code>, name = <code>"lambdaPredicateExpr"</code> */
        LAMBDAPREDICATEEXPR("lambdaPredicateExpr", 141, 1269, 1),
        /** id = <code>128</code>, name = <code>"lambdaVariableExpr"</code> */
        LAMBDAVARIABLEEXPR("lambdaVariableExpr", 128, 1129, 1),
        /** id = <code>183</code>, name = <code>"leExpr"</code> */
        LEEXPR("leExpr", 183, 1612, 5),
        /** id = <code>148</code>, name = <code>"lengthMethodCallExpr"</code> */
        LENGTHMETHODCALLEXPR("lengthMethodCallExpr", 148, 1349, 7),
        /** id = <code>70</code>, name = <code>"levels"</code> */
        LEVELS("levels", 70, 590, 11),
        /** id = <code>325</code>, name = <code>"lineStringData"</code> */
        LINESTRINGDATA("lineStringData", 325, 2469, 8),
        /** id = <code>324</code>, name = <code>"lineStringLiteral"</code> */
        LINESTRINGLITERAL("lineStringLiteral", 324, 2466, 3),
        /** id = <code>177</code>, name = <code>"listExpr"</code> */
        LISTEXPR("listExpr", 177, 1575, 12),
        /** id = <code>403</code>, name = <code>"ls32"</code> */
        LS32("ls32", 403, 2977, 6),
        /** id = <code>182</code>, name = <code>"ltExpr"</code> */
        LTEXPR("ltExpr", 182, 1607, 5),
        /** id = <code>166</code>, name = <code>"maxDateTimeMethodCallExpr"</code> */
        MAXDATETIMEMETHODCALLEXPR("maxDateTimeMethodCallExpr", 166, 1487, 5),
        /** id = <code>371</code>, name = <code>"maxpagesizePreference"</code> */
        MAXPAGESIZEPREFERENCE("maxpagesizePreference", 371, 2739, 8),
        /** id = <code>120</code>, name = <code>"memberExpr"</code> */
        MEMBEREXPR("memberExpr", 120, 1061, 8),
        /** id = <code>54</code>, name = <code>"metadataOption"</code> */
        METADATAOPTION("metadataOption", 54, 431, 3),
        /** id = <code>53</code>, name = <code>"metadataOptions"</code> */
        METADATAOPTIONS("metadataOptions", 53, 425, 6),
        /** id = <code>142</code>, name = <code>"methodCallExpr"</code> */
        METHODCALLEXPR("methodCallExpr", 142, 1270, 28),
        /** id = <code>165</code>, name = <code>"minDateTimeMethodCallExpr"</code> */
        MINDATETIMEMETHODCALLEXPR("minDateTimeMethodCallExpr", 165, 1482, 5),
        /** id = <code>311</code>, name = <code>"minute"</code> */
        MINUTE("minute", 311, 2414, 1),
        /** id = <code>158</code>, name = <code>"minuteMethodCallExpr"</code> */
        MINUTEMETHODCALLEXPR("minuteMethodCallExpr", 158, 1433, 7),
        /** id = <code>193</code>, name = <code>"modExpr"</code> */
        MODEXPR("modExpr", 193, 1662, 5),
        /** id = <code>308</code>, name = <code>"month"</code> */
        MONTH("month", 308, 2377, 10),
        /** id = <code>155</code>, name = <code>"monthMethodCallExpr"</code> */
        MONTHMETHODCALLEXPR("monthMethodCallExpr", 155, 1412, 7),
        /** id = <code>190</code>, name = <code>"mulExpr"</code> */
        MULEXPR("mulExpr", 190, 1647, 5),
        /** id = <code>328</code>, name = <code>"multiLineStringLiteral"</code> */
        MULTILINESTRINGLITERAL("multiLineStringLiteral", 328, 2485, 10),
        /** id = <code>331</code>, name = <code>"multiPointLiteral"</code> */
        MULTIPOINTLITERAL("multiPointLiteral", 331, 2503, 10),
        /** id = <code>334</code>, name = <code>"multiPolygonLiteral"</code> */
        MULTIPOLYGONLITERAL("multiPolygonLiteral", 334, 2521, 10),
        /** id = <code>215</code>, name = <code>"name-separator"</code> */
        NAME_SEPARATOR("name-separator", 215, 1836, 4),
        /** id = <code>100</code>, name = <code>"nameAndValue"</code> */
        NAMEANDVALUE("nameAndValue", 100, 844, 4),
        /** id = <code>236</code>, name = <code>"namespace"</code> */
        NAMESPACE("namespace", 236, 1970, 6),
        /** id = <code>237</code>, name = <code>"namespacePart"</code> */
        NAMESPACEPART("namespacePart", 237, 1976, 1),
        /** id = <code>289</code>, name = <code>"nanInfinity"</code> */
        NANINFINITY("nanInfinity", 289, 2197, 4),
        /** id = <code>109</code>, name = <code>"navigation"</code> */
        NAVIGATION("navigation", 109, 924, 11),
        /** id = <code>259</code>, name = <code>"navigationProperty"</code> */
        NAVIGATIONPROPERTY("navigationProperty", 259, 2040, 3),
        /** id = <code>206</code>, name = <code>"navigationPropertyInUri"</code> */
        NAVIGATIONPROPERTYINURI("navigationPropertyInUri", 206, 1786, 3),
        /** id = <code>181</code>, name = <code>"neExpr"</code> */
        NEEXPR("neExpr", 181, 1602, 5),
        /** id = <code>194</code>, name = <code>"negateExpr"</code> */
        NEGATEEXPR("negateExpr", 194, 1667, 4),
        /** id = <code>195</code>, name = <code>"notExpr"</code> */
        NOTEXPR("notExpr", 195, 1671, 4),
        /** id = <code>167</code>, name = <code>"nowMethodCallExpr"</code> */
        NOWMETHODCALLEXPR("nowMethodCallExpr", 167, 1492, 5),
        /** id = <code>279</code>, name = <code>"nullValue"</code> */
        NULLVALUE("nullValue", 279, 2123, 1),
        /** id = <code>222</code>, name = <code>"numberInJSON"</code> */
        NUMBERINJSON("numberInJSON", 222, 1885, 8),
        /** id = <code>376</code>, name = <code>"obs-text"</code> */
        OBS_TEXT("obs-text", 376, 2763, 1),
        /** id = <code>360</code>, name = <code>"odata-maxversion"</code> */
        ODATA_MAXVERSION("odata-maxversion", 360, 2648, 9),
        /** id = <code>361</code>, name = <code>"odata-version"</code> */
        ODATA_VERSION("odata-version", 361, 2657, 7),
        /** id = <code>246</code>, name = <code>"odataIdentifier"</code> */
        ODATAIDENTIFIER("odataIdentifier", 246, 1985, 4),
        /** id = <code>3</code>, name = <code>"odataRelativeUri"</code> */
        ODATARELATIVEURI("odataRelativeUri", 3, 23, 31),
        /** id = <code>1</code>, name = <code>"odataUri"</code> */
        ODATAURI("odataUri", 1, 4, 4),
        /** id = <code>305</code>, name = <code>"oneToNine"</code> */
        ONETONINE("oneToNine", 305, 2346, 10),
        /** id = <code>390</code>, name = <code>"OPEN"</code> */
        OPEN("OPEN", 390, 2811, 3),
        /** id = <code>94</code>, name = <code>"optionallyQualifiedActionName"</code> */
        OPTIONALLYQUALIFIEDACTIONNAME("optionallyQualifiedActionName", 94, 807, 6),
        /** id = <code>235</code>, name = <code>"optionallyQualifiedComplexTypeName"</code> */
        OPTIONALLYQUALIFIEDCOMPLEXTYPENAME("optionallyQualifiedComplexTypeName", 235, 1964, 6),
        /** id = <code>234</code>, name = <code>"optionallyQualifiedEntityTypeName"</code> */
        OPTIONALLYQUALIFIEDENTITYTYPENAME("optionallyQualifiedEntityTypeName", 234, 1958, 6),
        /** id = <code>95</code>, name = <code>"optionallyQualifiedFunctionName"</code> */
        OPTIONALLYQUALIFIEDFUNCTIONNAME("optionallyQualifiedFunctionName", 95, 813, 11),
        /** id = <code>227</code>, name = <code>"optionallyQualifiedTypeName"</code> */
        OPTIONALLYQUALIFIEDTYPENAME("optionallyQualifiedTypeName", 227, 1918, 13),
        /** id = <code>72</code>, name = <code>"orderby"</code> */
        ORDERBY("orderby", 72, 607, 10),
        /** id = <code>73</code>, name = <code>"orderbyItem"</code> */
        ORDERBYITEM("orderbyItem", 73, 617, 8),
        /** id = <code>26</code>, name = <code>"ordinalIndex"</code> */
        ORDINALINDEX("ordinalIndex", 26, 232, 4),
        /** id = <code>179</code>, name = <code>"orExpr"</code> */
        OREXPR("orExpr", 179, 1592, 5),
        /** id = <code>418</code>, name = <code>"other-delims"</code> */
        OTHER_DELIMS("other-delims", 418, 3068, 8),
        /** id = <code>377</code>, name = <code>"OWS"</code> */
        OWS("OWS", 377, 2764, 4),
        /** id = <code>47</code>, name = <code>"parameterAlias"</code> */
        PARAMETERALIAS("parameterAlias", 47, 393, 3),
        /** id = <code>46</code>, name = <code>"parameterName"</code> */
        PARAMETERNAME("parameterName", 46, 392, 1),
        /** id = <code>96</code>, name = <code>"parameterNames"</code> */
        PARAMETERNAMES("parameterNames", 96, 824, 6),
        /** id = <code>101</code>, name = <code>"parameterValue"</code> */
        PARAMETERVALUE("parameterValue", 101, 848, 3),
        /** id = <code>176</code>, name = <code>"parenExpr"</code> */
        PARENEXPR("parenExpr", 176, 1569, 6),
        /** id = <code>407</code>, name = <code>"path-abempty"</code> */
        PATH_ABEMPTY("path-abempty", 407, 3012, 4),
        /** id = <code>408</code>, name = <code>"path-absolute"</code> */
        PATH_ABSOLUTE("path-absolute", 408, 3016, 9),
        /** id = <code>409</code>, name = <code>"path-rootless"</code> */
        PATH_ROOTLESS("path-rootless", 409, 3025, 6),
        /** id = <code>412</code>, name = <code>"pchar"</code> */
        PCHAR("pchar", 412, 3035, 6),
        /** id = <code>419</code>, name = <code>"pchar-no-SQUOTE"</code> */
        PCHAR_NO_SQUOTE("pchar-no-SQUOTE", 419, 3076, 9),
        /** id = <code>415</code>, name = <code>"pct-encoded"</code> */
        PCT_ENCODED("pct-encoded", 415, 3051, 4),
        /** id = <code>420</code>, name = <code>"pct-encoded-no-SQUOTE"</code> */
        PCT_ENCODED_NO_SQUOTE("pct-encoded-no-SQUOTE", 420, 3085, 28),
        /** id = <code>425</code>, name = <code>"pct-encoded-unescaped"</code> */
        PCT_ENCODED_UNESCAPED("pct-encoded-unescaped", 425, 3153, 38),
        /** id = <code>339</code>, name = <code>"pointData"</code> */
        POINTDATA("pointData", 339, 2548, 4),
        /** id = <code>338</code>, name = <code>"pointLiteral"</code> */
        POINTLITERAL("pointLiteral", 338, 2545, 3),
        /** id = <code>344</code>, name = <code>"polygonData"</code> */
        POLYGONDATA("polygonData", 344, 2567, 8),
        /** id = <code>343</code>, name = <code>"polygonLiteral"</code> */
        POLYGONLITERAL("polygonLiteral", 343, 2564, 3),
        /** id = <code>398</code>, name = <code>"port"</code> */
        PORT("port", 398, 2865, 2),
        /** id = <code>340</code>, name = <code>"positionLiteral"</code> */
        POSITIONLITERAL("positionLiteral", 340, 2552, 4),
        /** id = <code>362</code>, name = <code>"prefer"</code> */
        PREFER("prefer", 362, 2664, 11),
        /** id = <code>363</code>, name = <code>"preference"</code> */
        PREFERENCE("preference", 363, 2675, 10),
        /** id = <code>270</code>, name = <code>"primitiveColFunction"</code> */
        PRIMITIVECOLFUNCTION("primitiveColFunction", 270, 2059, 1),
        /** id = <code>276</code>, name = <code>"primitiveColFunctionImport"</code> */
        PRIMITIVECOLFUNCTIONIMPORT("primitiveColFunctionImport", 276, 2065, 1),
        /** id = <code>42</code>, name = <code>"primitiveColFunctionImportCall"</code> */
        PRIMITIVECOLFUNCTIONIMPORTCALL("primitiveColFunctionImportCall", 42, 366, 3),
        /** id = <code>202</code>, name = <code>"primitiveColInUri"</code> */
        PRIMITIVECOLINURI("primitiveColInUri", 202, 1749, 10),
        /** id = <code>17</code>, name = <code>"primitiveColPath"</code> */
        PRIMITIVECOLPATH("primitiveColPath", 17, 195, 4),
        /** id = <code>255</code>, name = <code>"primitiveColProperty"</code> */
        PRIMITIVECOLPROPERTY("primitiveColProperty", 255, 2036, 1),
        /** id = <code>269</code>, name = <code>"primitiveFunction"</code> */
        PRIMITIVEFUNCTION("primitiveFunction", 269, 2058, 1),
        /** id = <code>275</code>, name = <code>"primitiveFunctionImport"</code> */
        PRIMITIVEFUNCTIONIMPORT("primitiveFunctionImport", 275, 2064, 1),
        /** id = <code>41</code>, name = <code>"primitiveFunctionImportCall"</code> */
        PRIMITIVEFUNCTIONIMPORTCALL("primitiveFunctionImportCall", 41, 363, 3),
        /** id = <code>253</code>, name = <code>"primitiveKeyProperty"</code> */
        PRIMITIVEKEYPROPERTY("primitiveKeyProperty", 253, 2034, 1),
        /** id = <code>277</code>, name = <code>"primitiveLiteral"</code> */
        PRIMITIVELITERAL("primitiveLiteral", 277, 2066, 33),
        /** id = <code>217</code>, name = <code>"primitiveLiteralInJSON"</code> */
        PRIMITIVELITERALINJSON("primitiveLiteralInJSON", 217, 1844, 6),
        /** id = <code>254</code>, name = <code>"primitiveNonKeyProperty"</code> */
        PRIMITIVENONKEYPROPERTY("primitiveNonKeyProperty", 254, 2035, 1),
        /** id = <code>18</code>, name = <code>"primitivePath"</code> */
        PRIMITIVEPATH("primitivePath", 18, 199, 3),
        /** id = <code>134</code>, name = <code>"primitivePathExpr"</code> */
        PRIMITIVEPATHEXPR("primitivePathExpr", 134, 1186, 6),
        /** id = <code>252</code>, name = <code>"primitiveProperty"</code> */
        PRIMITIVEPROPERTY("primitiveProperty", 252, 2031, 3),
        /** id = <code>205</code>, name = <code>"primitivePropertyInUri"</code> */
        PRIMITIVEPROPERTYINURI("primitivePropertyInUri", 205, 1780, 6),
        /** id = <code>249</code>, name = <code>"primitiveTypeName"</code> */
        PRIMITIVETYPENAME("primitiveTypeName", 249, 1996, 24),
        /** id = <code>278</code>, name = <code>"primitiveValue"</code> */
        PRIMITIVEVALUE("primitiveValue", 278, 2099, 24),
        /** id = <code>16</code>, name = <code>"propertyPath"</code> */
        PROPERTYPATH("propertyPath", 16, 166, 29),
        /** id = <code>122</code>, name = <code>"propertyPathExpr"</code> */
        PROPERTYPATHEXPR("propertyPathExpr", 122, 1073, 29),
        /** id = <code>220</code>, name = <code>"qchar-JSON-special"</code> */
        QCHAR_JSON_SPECIAL("qchar-JSON-special", 220, 1875, 7),
        /** id = <code>421</code>, name = <code>"qchar-no-AMP"</code> */
        QCHAR_NO_AMP("qchar-no-AMP", 421, 3113, 11),
        /** id = <code>426</code>, name = <code>"qchar-no-AMP-DQUOTE"</code> */
        QCHAR_NO_AMP_DQUOTE("qchar-no-AMP-DQUOTE", 426, 3191, 7),
        /** id = <code>422</code>, name = <code>"qchar-no-AMP-EQ"</code> */
        QCHAR_NO_AMP_EQ("qchar-no-AMP-EQ", 422, 3124, 10),
        /** id = <code>423</code>, name = <code>"qchar-no-AMP-EQ-AT-DOLLAR"</code> */
        QCHAR_NO_AMP_EQ_AT_DOLLAR("qchar-no-AMP-EQ-AT-DOLLAR", 423, 3134, 8),
        /** id = <code>424</code>, name = <code>"qchar-unescaped"</code> */
        QCHAR_UNESCAPED("qchar-unescaped", 424, 3142, 11),
        /** id = <code>114</code>, name = <code>"qualifiedActionName"</code> */
        QUALIFIEDACTIONNAME("qualifiedActionName", 114, 994, 4),
        /** id = <code>231</code>, name = <code>"qualifiedComplexTypeName"</code> */
        QUALIFIEDCOMPLEXTYPENAME("qualifiedComplexTypeName", 231, 1946, 4),
        /** id = <code>230</code>, name = <code>"qualifiedEntityTypeName"</code> */
        QUALIFIEDENTITYTYPENAME("qualifiedEntityTypeName", 230, 1942, 4),
        /** id = <code>233</code>, name = <code>"qualifiedEnumTypeName"</code> */
        QUALIFIEDENUMTYPENAME("qualifiedEnumTypeName", 233, 1954, 4),
        /** id = <code>115</code>, name = <code>"qualifiedFunctionName"</code> */
        QUALIFIEDFUNCTIONNAME("qualifiedFunctionName", 115, 998, 9),
        /** id = <code>232</code>, name = <code>"qualifiedTypeDefinitionName"</code> */
        QUALIFIEDTYPEDEFINITIONNAME("qualifiedTypeDefinitionName", 232, 1950, 4),
        /** id = <code>226</code>, name = <code>"qualifiedTypeName"</code> */
        QUALIFIEDTYPENAME("qualifiedTypeName", 226, 1911, 7),
        /** id = <code>413</code>, name = <code>"query"</code> */
        QUERY("query", 413, 3041, 5),
        /** id = <code>50</code>, name = <code>"queryOption"</code> */
        QUERYOPTION("queryOption", 50, 411, 5),
        /** id = <code>49</code>, name = <code>"queryOptions"</code> */
        QUERYOPTIONS("queryOptions", 49, 405, 6),
        /** id = <code>214</code>, name = <code>"quotation-mark"</code> */
        QUOTATION_MARK("quotation-mark", 214, 1833, 3),
        /** id = <code>24</code>, name = <code>"ref"</code> */
        REF("ref", 24, 230, 1),
        /** id = <code>406</code>, name = <code>"reg-name"</code> */
        REG_NAME("reg-name", 406, 3007, 5),
        /** id = <code>357</code>, name = <code>"request-id"</code> */
        REQUEST_ID("request-id", 357, 2632, 2),
        /** id = <code>4</code>, name = <code>"resourcePath"</code> */
        RESOURCEPATH("resourcePath", 4, 54, 42),
        /** id = <code>372</code>, name = <code>"respondAsyncPreference"</code> */
        RESPONDASYNCPREFERENCE("respondAsyncPreference", 372, 2747, 1),
        /** id = <code>373</code>, name = <code>"returnPreference"</code> */
        RETURNPREFERENCE("returnPreference", 373, 2748, 6),
        /** id = <code>345</code>, name = <code>"ringLiteral"</code> */
        RINGLITERAL("ringLiteral", 345, 2575, 8),
        /** id = <code>118</code>, name = <code>"rootExpr"</code> */
        ROOTEXPR("rootExpr", 118, 1044, 9),
        /** id = <code>209</code>, name = <code>"rootExprCol"</code> */
        ROOTEXPRCOL("rootExprCol", 209, 1801, 10),
        /** id = <code>168</code>, name = <code>"roundMethodCallExpr"</code> */
        ROUNDMETHODCALLEXPR("roundMethodCallExpr", 168, 1497, 7),
        /** id = <code>380</code>, name = <code>"RWS"</code> */
        RWS("RWS", 380, 2776, 6),
        /** id = <code>292</code>, name = <code>"sbyteValue"</code> */
        SBYTEVALUE("sbyteValue", 292, 2218, 5),
        /** id = <code>79</code>, name = <code>"schemaversion"</code> */
        SCHEMAVERSION("schemaversion", 79, 667, 9),
        /** id = <code>394</code>, name = <code>"scheme"</code> */
        SCHEME("scheme", 394, 2836, 9),
        /** id = <code>80</code>, name = <code>"search"</code> */
        SEARCH("search", 80, 676, 7),
        /** id = <code>83</code>, name = <code>"searchAndExpr"</code> */
        SEARCHANDEXPR("searchAndExpr", 83, 701, 7),
        /** id = <code>81</code>, name = <code>"searchExpr"</code> */
        SEARCHEXPR("searchExpr", 81, 683, 13),
        /** id = <code>82</code>, name = <code>"searchOrExpr"</code> */
        SEARCHOREXPR("searchOrExpr", 82, 696, 5),
        /** id = <code>85</code>, name = <code>"searchPhrase"</code> */
        SEARCHPHRASE("searchPhrase", 85, 716, 5),
        /** id = <code>84</code>, name = <code>"searchTerm"</code> */
        SEARCHTERM("searchTerm", 84, 708, 8),
        /** id = <code>86</code>, name = <code>"searchWord"</code> */
        SEARCHWORD("searchWord", 86, 721, 7),
        /** id = <code>312</code>, name = <code>"second"</code> */
        SECOND("second", 312, 2415, 1),
        /** id = <code>159</code>, name = <code>"secondMethodCallExpr"</code> */
        SECONDMETHODCALLEXPR("secondMethodCallExpr", 159, 1440, 7),
        /** id = <code>410</code>, name = <code>"segment"</code> */
        SEGMENT("segment", 410, 3031, 2),
        /** id = <code>411</code>, name = <code>"segment-nz"</code> */
        SEGMENT_NZ("segment-nz", 411, 3033, 2),
        /** id = <code>87</code>, name = <code>"select"</code> */
        SELECT("select", 87, 728, 10),
        /** id = <code>88</code>, name = <code>"selectItem"</code> */
        SELECTITEM("selectItem", 88, 738, 15),
        /** id = <code>110</code>, name = <code>"selectList"</code> */
        SELECTLIST("selectList", 110, 935, 10),
        /** id = <code>111</code>, name = <code>"selectListItem"</code> */
        SELECTLISTITEM("selectListItem", 111, 945, 14),
        /** id = <code>112</code>, name = <code>"selectListProperty"</code> */
        SELECTLISTPROPERTY("selectListProperty", 112, 959, 21),
        /** id = <code>92</code>, name = <code>"selectOption"</code> */
        SELECTOPTION("selectOption", 92, 797, 6),
        /** id = <code>91</code>, name = <code>"selectOptionPC"</code> */
        SELECTOPTIONPC("selectOptionPC", 91, 790, 7),
        /** id = <code>90</code>, name = <code>"selectPath"</code> */
        SELECTPATH("selectPath", 90, 782, 8),
        /** id = <code>89</code>, name = <code>"selectProperty"</code> */
        SELECTPROPERTY("selectProperty", 89, 753, 29),
        /** id = <code>387</code>, name = <code>"SEMI"</code> */
        SEMI("SEMI", 387, 2802, 3),
        /** id = <code>2</code>, name = <code>"serviceRoot"</code> */
        SERVICEROOT("serviceRoot", 2, 8, 15),
        /** id = <code>386</code>, name = <code>"SIGN"</code> */
        SIGN("SIGN", 386, 2798, 4),
        /** id = <code>8</code>, name = <code>"simpleKey"</code> */
        SIMPLEKEY("simpleKey", 8, 123, 6),
        /** id = <code>316</code>, name = <code>"singleEnumValue"</code> */
        SINGLEENUMVALUE("singleEnumValue", 316, 2430, 3),
        /** id = <code>15</code>, name = <code>"singleNavigation"</code> */
        SINGLENAVIGATION("singleNavigation", 15, 153, 13),
        /** id = <code>130</code>, name = <code>"singleNavigationExpr"</code> */
        SINGLENAVIGATIONEXPR("singleNavigationExpr", 130, 1141, 3),
        /** id = <code>207</code>, name = <code>"singleNavPropInJSON"</code> */
        SINGLENAVPROPINJSON("singleNavPropInJSON", 207, 1789, 6),
        /** id = <code>228</code>, name = <code>"singleQualifiedTypeName"</code> */
        SINGLEQUALIFIEDTYPENAME("singleQualifiedTypeName", 228, 1931, 6),
        /** id = <code>239</code>, name = <code>"singletonEntity"</code> */
        SINGLETONENTITY("singletonEntity", 239, 1978, 1),
        /** id = <code>229</code>, name = <code>"singleTypeName"</code> */
        SINGLETYPENAME("singleTypeName", 229, 1937, 5),
        /** id = <code>288</code>, name = <code>"singleValue"</code> */
        SINGLEVALUE("singleValue", 288, 2196, 1),
        /** id = <code>74</code>, name = <code>"skip"</code> */
        SKIP("skip", 74, 625, 7),
        /** id = <code>98</code>, name = <code>"skiptoken"</code> */
        SKIPTOKEN("skiptoken", 98, 835, 5),
        /** id = <code>434</code>, name = <code>"SP"</code> */
        SP("SP", 434, 3219, 1),
        /** id = <code>389</code>, name = <code>"SQUOTE"</code> */
        SQUOTE("SQUOTE", 389, 2808, 3),
        /** id = <code>297</code>, name = <code>"SQUOTE-in-string"</code> */
        SQUOTE_IN_STRING("SQUOTE-in-string", 297, 2245, 3),
        /** id = <code>337</code>, name = <code>"sridLiteral"</code> */
        SRIDLITERAL("sridLiteral", 337, 2539, 6),
        /** id = <code>388</code>, name = <code>"STAR"</code> */
        STAR("STAR", 388, 2805, 3),
        /** id = <code>149</code>, name = <code>"startsWithMethodCallExpr"</code> */
        STARTSWITHMETHODCALLEXPR("startsWithMethodCallExpr", 149, 1356, 11),
        /** id = <code>258</code>, name = <code>"streamProperty"</code> */
        STREAMPROPERTY("streamProperty", 258, 2039, 1),
        /** id = <code>296</code>, name = <code>"string"</code> */
        STRING("string", 296, 2238, 7),
        /** id = <code>218</code>, name = <code>"stringInJSON"</code> */
        STRINGINJSON("stringInJSON", 218, 1850, 5),
        /** id = <code>417</code>, name = <code>"sub-delims"</code> */
        SUB_DELIMS("sub-delims", 417, 3062, 6),
        /** id = <code>189</code>, name = <code>"subExpr"</code> */
        SUBEXPR("subExpr", 189, 1642, 5),
        /** id = <code>150</code>, name = <code>"substringMethodCallExpr"</code> */
        SUBSTRINGMETHODCALLEXPR("substringMethodCallExpr", 150, 1367, 17),
        /** id = <code>60</code>, name = <code>"systemQueryOption"</code> */
        SYSTEMQUERYOPTION("systemQueryOption", 60, 467, 16),
        /** id = <code>245</code>, name = <code>"termName"</code> */
        TERMNAME("termName", 245, 1984, 1),
        /** id = <code>163</code>, name = <code>"timeMethodCallExpr"</code> */
        TIMEMETHODCALLEXPR("timeMethodCallExpr", 163, 1468, 7),
        /** id = <code>303</code>, name = <code>"timeOfDayValue"</code> */
        TIMEOFDAYVALUE("timeOfDayValue", 303, 2322, 12),
        /** id = <code>304</code>, name = <code>"timeOfDayValueInUrl"</code> */
        TIMEOFDAYVALUEINURL("timeOfDayValueInUrl", 304, 2334, 12),
        /** id = <code>151</code>, name = <code>"toLowerMethodCallExpr"</code> */
        TOLOWERMETHODCALLEXPR("toLowerMethodCallExpr", 151, 1384, 7),
        /** id = <code>75</code>, name = <code>"top"</code> */
        TOP("top", 75, 632, 7),
        /** id = <code>164</code>, name = <code>"totalOffsetMinutesMethodCallExpr"</code> */
        TOTALOFFSETMINUTESMETHODCALLEXPR("totalOffsetMinutesMethodCallExpr", 164, 1475, 7),
        /** id = <code>161</code>, name = <code>"totalsecondsMethodCallExpr"</code> */
        TOTALSECONDSMETHODCALLEXPR("totalsecondsMethodCallExpr", 161, 1454, 7),
        /** id = <code>152</code>, name = <code>"toUpperMethodCallExpr"</code> */
        TOUPPERMETHODCALLEXPR("toUpperMethodCallExpr", 152, 1391, 7),
        /** id = <code>374</code>, name = <code>"trackChangesPreference"</code> */
        TRACKCHANGESPREFERENCE("trackChangesPreference", 374, 2754, 4),
        /** id = <code>153</code>, name = <code>"trimMethodCallExpr"</code> */
        TRIMMETHODCALLEXPR("trimMethodCallExpr", 153, 1398, 7),
        /** id = <code>242</code>, name = <code>"typeDefinitionName"</code> */
        TYPEDEFINITIONNAME("typeDefinitionName", 242, 1981, 1),
        /** id = <code>416</code>, name = <code>"unreserved"</code> */
        UNRESERVED("unreserved", 416, 3055, 7),
        /** id = <code>392</code>, name = <code>"URI"</code> */
        URI("URI", 392, 2817, 12),
        /** id = <code>396</code>, name = <code>"userinfo"</code> */
        USERINFO("userinfo", 396, 2855, 6),
        /** id = <code>25</code>, name = <code>"value"</code> */
        VALUE("value", 25, 231, 1),
        /** id = <code>216</code>, name = <code>"value-separator"</code> */
        VALUE_SEPARATOR("value-separator", 216, 1840, 4),
        /** id = <code>436</code>, name = <code>"VCHAR"</code> */
        VCHAR("VCHAR", 436, 3221, 1),
        /** id = <code>375</code>, name = <code>"waitPreference"</code> */
        WAITPREFERENCE("waitPreference", 375, 2758, 5),
        /** id = <code>307</code>, name = <code>"year"</code> */
        YEAR("year", 307, 2365, 12),
        /** id = <code>154</code>, name = <code>"yearMethodCallExpr"</code> */
        YEARMETHODCALLEXPR("yearMethodCallExpr", 154, 1405, 7),
        /** id = <code>306</code>, name = <code>"zeroToFiftyNine"</code> */
        ZEROTOFIFTYNINE("zeroToFiftyNine", 306, 2356, 9);
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
    	Rule[] rules = new Rule[437];
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
    	Opcode[] op = new Opcode[3222];
    	addOpcodes00(op);
    	addOpcodes01(op);
        return op;
    }

    private static void addOpcodes00(Opcode[] op){
        {int[] a = {1,2,3}; op[0] = getOpcodeAlt(a);}
        op[1] = getOpcodeRnm(1, 4); // odataUri
        op[2] = getOpcodeRnm(355, 2620); // header
        op[3] = getOpcodeRnm(278, 2099); // primitiveValue
        {int[] a = {5,6}; op[4] = getOpcodeCat(a);}
        op[5] = getOpcodeRnm(2, 8); // serviceRoot
        op[6] = getOpcodeRep((char)0, (char)1, 7);
        op[7] = getOpcodeRnm(3, 23); // odataRelativeUri
        {int[] a = {9,12,13,14,18,19}; op[8] = getOpcodeCat(a);}
        {int[] a = {10,11}; op[9] = getOpcodeAlt(a);}
        {char[] a = {104,116,116,112,115}; op[10] = getOpcodeTls(a);}
        {char[] a = {104,116,116,112}; op[11] = getOpcodeTls(a);}
        {char[] a = {58,47,47}; op[12] = getOpcodeTls(a);}
        op[13] = getOpcodeRnm(397, 2861); // host
        op[14] = getOpcodeRep((char)0, (char)1, 15);
        {int[] a = {16,17}; op[15] = getOpcodeCat(a);}
        {char[] a = {58}; op[16] = getOpcodeTls(a);}
        op[17] = getOpcodeRnm(398, 2865); // port
        {char[] a = {47}; op[18] = getOpcodeTls(a);}
        op[19] = getOpcodeRep((char)0, Character.MAX_VALUE, 20);
        {int[] a = {21,22}; op[20] = getOpcodeCat(a);}
        op[21] = getOpcodeRnm(411, 3033); // segment-nz
        {char[] a = {47}; op[22] = getOpcodeTls(a);}
        {int[] a = {24,30,34,40,48}; op[23] = getOpcodeAlt(a);}
        {int[] a = {25,26}; op[24] = getOpcodeCat(a);}
        {char[] a = {36,98,97,116,99,104}; op[25] = getOpcodeTbs(a);}
        op[26] = getOpcodeRep((char)0, (char)1, 27);
        {int[] a = {28,29}; op[27] = getOpcodeCat(a);}
        {char[] a = {63}; op[28] = getOpcodeTls(a);}
        op[29] = getOpcodeRnm(51, 416); // batchOptions
        {int[] a = {31,32,33}; op[30] = getOpcodeCat(a);}
        {char[] a = {36,101,110,116,105,116,121}; op[31] = getOpcodeTbs(a);}
        {char[] a = {63}; op[32] = getOpcodeTls(a);}
        op[33] = getOpcodeRnm(55, 434); // entityOptions
        {int[] a = {35,36,37,38,39}; op[34] = getOpcodeCat(a);}
        {char[] a = {36,101,110,116,105,116,121}; op[35] = getOpcodeTbs(a);}
        {char[] a = {47}; op[36] = getOpcodeTls(a);}
        op[37] = getOpcodeRnm(234, 1958); // optionallyQualifiedEntityTypeName
        {char[] a = {63}; op[38] = getOpcodeTls(a);}
        op[39] = getOpcodeRnm(57, 447); // entityCastOptions
        {int[] a = {41,42,46}; op[40] = getOpcodeCat(a);}
        {char[] a = {36,109,101,116,97,100,97,116,97}; op[41] = getOpcodeTbs(a);}
        op[42] = getOpcodeRep((char)0, (char)1, 43);
        {int[] a = {44,45}; op[43] = getOpcodeCat(a);}
        {char[] a = {63}; op[44] = getOpcodeTls(a);}
        op[45] = getOpcodeRnm(53, 425); // metadataOptions
        op[46] = getOpcodeRep((char)0, (char)1, 47);
        op[47] = getOpcodeRnm(105, 863); // context
        {int[] a = {49,50}; op[48] = getOpcodeCat(a);}
        op[49] = getOpcodeRnm(4, 54); // resourcePath
        op[50] = getOpcodeRep((char)0, (char)1, 51);
        {int[] a = {52,53}; op[51] = getOpcodeCat(a);}
        {char[] a = {63}; op[52] = getOpcodeTls(a);}
        op[53] = getOpcodeRnm(49, 405); // queryOptions
        {int[] a = {55,59,63,64,68,72,76,80,84,88,89,90}; op[54] = getOpcodeAlt(a);}
        {int[] a = {56,57}; op[55] = getOpcodeCat(a);}
        op[56] = getOpcodeRnm(238, 1977); // entitySetName
        op[57] = getOpcodeRep((char)0, (char)1, 58);
        op[58] = getOpcodeRnm(5, 96); // collectionNavigation
        {int[] a = {60,61}; op[59] = getOpcodeCat(a);}
        op[60] = getOpcodeRnm(239, 1978); // singletonEntity
        op[61] = getOpcodeRep((char)0, (char)1, 62);
        op[62] = getOpcodeRnm(15, 153); // singleNavigation
        op[63] = getOpcodeRnm(28, 265); // actionImportCall
        {int[] a = {65,66}; op[64] = getOpcodeCat(a);}
        op[65] = getOpcodeRnm(38, 354); // entityColFunctionImportCall
        op[66] = getOpcodeRep((char)0, (char)1, 67);
        op[67] = getOpcodeRnm(5, 96); // collectionNavigation
        {int[] a = {69,70}; op[68] = getOpcodeCat(a);}
        op[69] = getOpcodeRnm(37, 351); // entityFunctionImportCall
        op[70] = getOpcodeRep((char)0, (char)1, 71);
        op[71] = getOpcodeRnm(15, 153); // singleNavigation
        {int[] a = {73,74}; op[72] = getOpcodeCat(a);}
        op[73] = getOpcodeRnm(40, 360); // complexColFunctionImportCall
        op[74] = getOpcodeRep((char)0, (char)1, 75);
        op[75] = getOpcodeRnm(19, 202); // complexColPath
        {int[] a = {77,78}; op[76] = getOpcodeCat(a);}
        op[77] = getOpcodeRnm(39, 357); // complexFunctionImportCall
        op[78] = getOpcodeRep((char)0, (char)1, 79);
        op[79] = getOpcodeRnm(20, 213); // complexPath
        {int[] a = {81,82}; op[80] = getOpcodeCat(a);}
        op[81] = getOpcodeRnm(42, 366); // primitiveColFunctionImportCall
        op[82] = getOpcodeRep((char)0, (char)1, 83);
        op[83] = getOpcodeRnm(17, 195); // primitiveColPath
        {int[] a = {85,86}; op[84] = getOpcodeCat(a);}
        op[85] = getOpcodeRnm(41, 363); // primitiveFunctionImportCall
        op[86] = getOpcodeRep((char)0, (char)1, 87);
        op[87] = getOpcodeRnm(18, 199); // primitivePath
        op[88] = getOpcodeRnm(43, 369); // functionImportCallNoParens
        op[89] = getOpcodeRnm(48, 396); // crossjoin
        {int[] a = {91,92}; op[90] = getOpcodeCat(a);}
        {char[] a = {36,97,108,108}; op[91] = getOpcodeTbs(a);}
        op[92] = getOpcodeRep((char)0, (char)1, 93);
        {int[] a = {94,95}; op[93] = getOpcodeCat(a);}
        {char[] a = {47}; op[94] = getOpcodeTls(a);}
        op[95] = getOpcodeRnm(234, 1958); // optionallyQualifiedEntityTypeName
        {int[] a = {97,101}; op[96] = getOpcodeCat(a);}
        op[97] = getOpcodeRep((char)0, (char)1, 98);
        {int[] a = {99,100}; op[98] = getOpcodeCat(a);}
        {char[] a = {47}; op[99] = getOpcodeTls(a);}
        op[100] = getOpcodeRnm(234, 1958); // optionallyQualifiedEntityTypeName
        op[101] = getOpcodeRep((char)0, (char)1, 102);
        op[102] = getOpcodeRnm(6, 103); // collectionNavPath
        {int[] a = {104,108,112,116,117,118}; op[103] = getOpcodeAlt(a);}
        {int[] a = {105,106}; op[104] = getOpcodeCat(a);}
        op[105] = getOpcodeRnm(7, 119); // keyPredicate
        op[106] = getOpcodeRep((char)0, (char)1, 107);
        op[107] = getOpcodeRnm(15, 153); // singleNavigation
        {int[] a = {109,110}; op[108] = getOpcodeCat(a);}
        op[109] = getOpcodeRnm(21, 224); // filterInPath
        op[110] = getOpcodeRep((char)0, (char)1, 111);
        op[111] = getOpcodeRnm(5, 96); // collectionNavigation
        {int[] a = {113,114}; op[112] = getOpcodeCat(a);}
        op[113] = getOpcodeRnm(22, 228); // each
        op[114] = getOpcodeRep((char)0, (char)1, 115);
        op[115] = getOpcodeRnm(27, 236); // boundOperation
        op[116] = getOpcodeRnm(27, 236); // boundOperation
        op[117] = getOpcodeRnm(23, 229); // count
        op[118] = getOpcodeRnm(24, 230); // ref
        {int[] a = {120,121,122}; op[119] = getOpcodeAlt(a);}
        op[120] = getOpcodeRnm(8, 123); // simpleKey
        op[121] = getOpcodeRnm(9, 129); // compoundKey
        op[122] = getOpcodeRnm(13, 147); // keyPathSegments
        {int[] a = {124,125,128}; op[123] = getOpcodeCat(a);}
        op[124] = getOpcodeRnm(390, 2811); // OPEN
        {int[] a = {126,127}; op[125] = getOpcodeAlt(a);}
        op[126] = getOpcodeRnm(47, 393); // parameterAlias
        op[127] = getOpcodeRnm(11, 145); // keyPropertyValue
        op[128] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {130,131,132,136}; op[129] = getOpcodeCat(a);}
        op[130] = getOpcodeRnm(390, 2811); // OPEN
        op[131] = getOpcodeRnm(10, 137); // keyValuePair
        op[132] = getOpcodeRep((char)0, Character.MAX_VALUE, 133);
        {int[] a = {134,135}; op[133] = getOpcodeCat(a);}
        op[134] = getOpcodeRnm(384, 2794); // COMMA
        op[135] = getOpcodeRnm(10, 137); // keyValuePair
        op[136] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {138,141,142}; op[137] = getOpcodeCat(a);}
        {int[] a = {139,140}; op[138] = getOpcodeAlt(a);}
        op[139] = getOpcodeRnm(253, 2034); // primitiveKeyProperty
        op[140] = getOpcodeRnm(12, 146); // keyPropertyAlias
        op[141] = getOpcodeRnm(385, 2797); // EQ
        {int[] a = {143,144}; op[142] = getOpcodeAlt(a);}
        op[143] = getOpcodeRnm(47, 393); // parameterAlias
        op[144] = getOpcodeRnm(11, 145); // keyPropertyValue
        op[145] = getOpcodeRnm(277, 2066); // primitiveLiteral
        op[146] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[147] = getOpcodeRep((char)1, Character.MAX_VALUE, 148);
        {int[] a = {149,150}; op[148] = getOpcodeCat(a);}
        {char[] a = {47}; op[149] = getOpcodeTls(a);}
        op[150] = getOpcodeRnm(14, 151); // keyPathLiteral
        op[151] = getOpcodeRep((char)0, Character.MAX_VALUE, 152);
        op[152] = getOpcodeRnm(412, 3035); // pchar
        {int[] a = {154,158}; op[153] = getOpcodeCat(a);}
        op[154] = getOpcodeRep((char)0, (char)1, 155);
        {int[] a = {156,157}; op[155] = getOpcodeCat(a);}
        {char[] a = {47}; op[156] = getOpcodeTls(a);}
        op[157] = getOpcodeRnm(234, 1958); // optionallyQualifiedEntityTypeName
        op[158] = getOpcodeRep((char)0, (char)1, 159);
        {int[] a = {160,163,164,165}; op[159] = getOpcodeAlt(a);}
        {int[] a = {161,162}; op[160] = getOpcodeCat(a);}
        {char[] a = {47}; op[161] = getOpcodeTls(a);}
        op[162] = getOpcodeRnm(16, 166); // propertyPath
        op[163] = getOpcodeRnm(27, 236); // boundOperation
        op[164] = getOpcodeRnm(24, 230); // ref
        op[165] = getOpcodeRnm(25, 231); // value
        {int[] a = {167,171,175,179,183,187,191}; op[166] = getOpcodeAlt(a);}
        {int[] a = {168,169}; op[167] = getOpcodeCat(a);}
        op[168] = getOpcodeRnm(261, 2044); // entityColNavigationProperty
        op[169] = getOpcodeRep((char)0, (char)1, 170);
        op[170] = getOpcodeRnm(5, 96); // collectionNavigation
        {int[] a = {172,173}; op[171] = getOpcodeCat(a);}
        op[172] = getOpcodeRnm(260, 2043); // entityNavigationProperty
        op[173] = getOpcodeRep((char)0, (char)1, 174);
        op[174] = getOpcodeRnm(15, 153); // singleNavigation
        {int[] a = {176,177}; op[175] = getOpcodeCat(a);}
        op[176] = getOpcodeRnm(257, 2038); // complexColProperty
        op[177] = getOpcodeRep((char)0, (char)1, 178);
        op[178] = getOpcodeRnm(19, 202); // complexColPath
        {int[] a = {180,181}; op[179] = getOpcodeCat(a);}
        op[180] = getOpcodeRnm(256, 2037); // complexProperty
        op[181] = getOpcodeRep((char)0, (char)1, 182);
        op[182] = getOpcodeRnm(20, 213); // complexPath
        {int[] a = {184,185}; op[183] = getOpcodeCat(a);}
        op[184] = getOpcodeRnm(255, 2036); // primitiveColProperty
        op[185] = getOpcodeRep((char)0, (char)1, 186);
        op[186] = getOpcodeRnm(17, 195); // primitiveColPath
        {int[] a = {188,189}; op[187] = getOpcodeCat(a);}
        op[188] = getOpcodeRnm(252, 2031); // primitiveProperty
        op[189] = getOpcodeRep((char)0, (char)1, 190);
        op[190] = getOpcodeRnm(18, 199); // primitivePath
        {int[] a = {192,193}; op[191] = getOpcodeCat(a);}
        op[192] = getOpcodeRnm(258, 2039); // streamProperty
        op[193] = getOpcodeRep((char)0, (char)1, 194);
        op[194] = getOpcodeRnm(27, 236); // boundOperation
        {int[] a = {196,197,198}; op[195] = getOpcodeAlt(a);}
        op[196] = getOpcodeRnm(23, 229); // count
        op[197] = getOpcodeRnm(27, 236); // boundOperation
        op[198] = getOpcodeRnm(26, 232); // ordinalIndex
        {int[] a = {200,201}; op[199] = getOpcodeAlt(a);}
        op[200] = getOpcodeRnm(25, 231); // value
        op[201] = getOpcodeRnm(27, 236); // boundOperation
        {int[] a = {203,204}; op[202] = getOpcodeAlt(a);}
        op[203] = getOpcodeRnm(26, 232); // ordinalIndex
        {int[] a = {205,209}; op[204] = getOpcodeCat(a);}
        op[205] = getOpcodeRep((char)0, (char)1, 206);
        {int[] a = {207,208}; op[206] = getOpcodeCat(a);}
        {char[] a = {47}; op[207] = getOpcodeTls(a);}
        op[208] = getOpcodeRnm(235, 1964); // optionallyQualifiedComplexTypeName
        op[209] = getOpcodeRep((char)0, (char)1, 210);
        {int[] a = {211,212}; op[210] = getOpcodeAlt(a);}
        op[211] = getOpcodeRnm(23, 229); // count
        op[212] = getOpcodeRnm(27, 236); // boundOperation
        {int[] a = {214,218}; op[213] = getOpcodeCat(a);}
        op[214] = getOpcodeRep((char)0, (char)1, 215);
        {int[] a = {216,217}; op[215] = getOpcodeCat(a);}
        {char[] a = {47}; op[216] = getOpcodeTls(a);}
        op[217] = getOpcodeRnm(235, 1964); // optionallyQualifiedComplexTypeName
        op[218] = getOpcodeRep((char)0, (char)1, 219);
        {int[] a = {220,223}; op[219] = getOpcodeAlt(a);}
        {int[] a = {221,222}; op[220] = getOpcodeCat(a);}
        {char[] a = {47}; op[221] = getOpcodeTls(a);}
        op[222] = getOpcodeRnm(16, 166); // propertyPath
        op[223] = getOpcodeRnm(27, 236); // boundOperation
        {int[] a = {225,226,227}; op[224] = getOpcodeCat(a);}
        {char[] a = {47,36,102,105,108,116,101,114}; op[225] = getOpcodeTbs(a);}
        op[226] = getOpcodeRnm(385, 2797); // EQ
        op[227] = getOpcodeRnm(47, 393); // parameterAlias
        {char[] a = {47,36,101,97,99,104}; op[228] = getOpcodeTbs(a);}
        {char[] a = {47,36,99,111,117,110,116}; op[229] = getOpcodeTbs(a);}
        {char[] a = {47,36,114,101,102}; op[230] = getOpcodeTbs(a);}
        {char[] a = {47,36,118,97,108,117,101}; op[231] = getOpcodeTbs(a);}
        {int[] a = {233,234}; op[232] = getOpcodeCat(a);}
        {char[] a = {47}; op[233] = getOpcodeTls(a);}
        op[234] = getOpcodeRep((char)1, Character.MAX_VALUE, 235);
        op[235] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {237,238}; op[236] = getOpcodeCat(a);}
        {char[] a = {47}; op[237] = getOpcodeTls(a);}
        {int[] a = {239,240,244,248,252,256,260,264}; op[238] = getOpcodeAlt(a);}
        op[239] = getOpcodeRnm(29, 266); // boundActionCall
        {int[] a = {241,242}; op[240] = getOpcodeCat(a);}
        op[241] = getOpcodeRnm(31, 279); // boundEntityColFunctionCall
        op[242] = getOpcodeRep((char)0, (char)1, 243);
        op[243] = getOpcodeRnm(5, 96); // collectionNavigation
        {int[] a = {245,246}; op[244] = getOpcodeCat(a);}
        op[245] = getOpcodeRnm(30, 272); // boundEntityFunctionCall
        op[246] = getOpcodeRep((char)0, (char)1, 247);
        op[247] = getOpcodeRnm(15, 153); // singleNavigation
        {int[] a = {249,250}; op[248] = getOpcodeCat(a);}
        op[249] = getOpcodeRnm(33, 293); // boundComplexColFunctionCall
        op[250] = getOpcodeRep((char)0, (char)1, 251);
        op[251] = getOpcodeRnm(19, 202); // complexColPath
        {int[] a = {253,254}; op[252] = getOpcodeCat(a);}
        op[253] = getOpcodeRnm(32, 286); // boundComplexFunctionCall
        op[254] = getOpcodeRep((char)0, (char)1, 255);
        op[255] = getOpcodeRnm(20, 213); // complexPath
        {int[] a = {257,258}; op[256] = getOpcodeCat(a);}
        op[257] = getOpcodeRnm(35, 307); // boundPrimitiveColFunctionCall
        op[258] = getOpcodeRep((char)0, (char)1, 259);
        op[259] = getOpcodeRnm(17, 195); // primitiveColPath
        {int[] a = {261,262}; op[260] = getOpcodeCat(a);}
        op[261] = getOpcodeRnm(34, 300); // boundPrimitiveFunctionCall
        op[262] = getOpcodeRep((char)0, (char)1, 263);
        op[263] = getOpcodeRnm(18, 199); // primitivePath
        op[264] = getOpcodeRnm(36, 314); // boundFunctionCallNoParens
        op[265] = getOpcodeRnm(263, 2046); // actionImport
        {int[] a = {267,271}; op[266] = getOpcodeCat(a);}
        op[267] = getOpcodeRep((char)0, (char)1, 268);
        {int[] a = {269,270}; op[268] = getOpcodeCat(a);}
        op[269] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[270] = getOpcodeTls(a);}
        op[271] = getOpcodeRnm(262, 2045); // action
        {int[] a = {273,277,278}; op[272] = getOpcodeCat(a);}
        op[273] = getOpcodeRep((char)0, (char)1, 274);
        {int[] a = {275,276}; op[274] = getOpcodeCat(a);}
        op[275] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[276] = getOpcodeTls(a);}
        op[277] = getOpcodeRnm(265, 2054); // entityFunction
        op[278] = getOpcodeRnm(44, 376); // functionParameters
        {int[] a = {280,284,285}; op[279] = getOpcodeCat(a);}
        op[280] = getOpcodeRep((char)0, (char)1, 281);
        {int[] a = {282,283}; op[281] = getOpcodeCat(a);}
        op[282] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[283] = getOpcodeTls(a);}
        op[284] = getOpcodeRnm(266, 2055); // entityColFunction
        op[285] = getOpcodeRnm(44, 376); // functionParameters
        {int[] a = {287,291,292}; op[286] = getOpcodeCat(a);}
        op[287] = getOpcodeRep((char)0, (char)1, 288);
        {int[] a = {289,290}; op[288] = getOpcodeCat(a);}
        op[289] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[290] = getOpcodeTls(a);}
        op[291] = getOpcodeRnm(267, 2056); // complexFunction
        op[292] = getOpcodeRnm(44, 376); // functionParameters
        {int[] a = {294,298,299}; op[293] = getOpcodeCat(a);}
        op[294] = getOpcodeRep((char)0, (char)1, 295);
        {int[] a = {296,297}; op[295] = getOpcodeCat(a);}
        op[296] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[297] = getOpcodeTls(a);}
        op[298] = getOpcodeRnm(268, 2057); // complexColFunction
        op[299] = getOpcodeRnm(44, 376); // functionParameters
        {int[] a = {301,305,306}; op[300] = getOpcodeCat(a);}
        op[301] = getOpcodeRep((char)0, (char)1, 302);
        {int[] a = {303,304}; op[302] = getOpcodeCat(a);}
        op[303] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[304] = getOpcodeTls(a);}
        op[305] = getOpcodeRnm(269, 2058); // primitiveFunction
        op[306] = getOpcodeRnm(44, 376); // functionParameters
        {int[] a = {308,312,313}; op[307] = getOpcodeCat(a);}
        op[308] = getOpcodeRep((char)0, (char)1, 309);
        {int[] a = {310,311}; op[309] = getOpcodeCat(a);}
        op[310] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[311] = getOpcodeTls(a);}
        op[312] = getOpcodeRnm(270, 2059); // primitiveColFunction
        op[313] = getOpcodeRnm(44, 376); // functionParameters
        {int[] a = {315,321,327,333,339,345}; op[314] = getOpcodeAlt(a);}
        {int[] a = {316,320}; op[315] = getOpcodeCat(a);}
        op[316] = getOpcodeRep((char)0, (char)1, 317);
        {int[] a = {318,319}; op[317] = getOpcodeCat(a);}
        op[318] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[319] = getOpcodeTls(a);}
        op[320] = getOpcodeRnm(265, 2054); // entityFunction
        {int[] a = {322,326}; op[321] = getOpcodeCat(a);}
        op[322] = getOpcodeRep((char)0, (char)1, 323);
        {int[] a = {324,325}; op[323] = getOpcodeCat(a);}
        op[324] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[325] = getOpcodeTls(a);}
        op[326] = getOpcodeRnm(266, 2055); // entityColFunction
        {int[] a = {328,332}; op[327] = getOpcodeCat(a);}
        op[328] = getOpcodeRep((char)0, (char)1, 329);
        {int[] a = {330,331}; op[329] = getOpcodeCat(a);}
        op[330] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[331] = getOpcodeTls(a);}
        op[332] = getOpcodeRnm(267, 2056); // complexFunction
        {int[] a = {334,338}; op[333] = getOpcodeCat(a);}
        op[334] = getOpcodeRep((char)0, (char)1, 335);
        {int[] a = {336,337}; op[335] = getOpcodeCat(a);}
        op[336] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[337] = getOpcodeTls(a);}
        op[338] = getOpcodeRnm(268, 2057); // complexColFunction
        {int[] a = {340,344}; op[339] = getOpcodeCat(a);}
        op[340] = getOpcodeRep((char)0, (char)1, 341);
        {int[] a = {342,343}; op[341] = getOpcodeCat(a);}
        op[342] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[343] = getOpcodeTls(a);}
        op[344] = getOpcodeRnm(269, 2058); // primitiveFunction
        {int[] a = {346,350}; op[345] = getOpcodeCat(a);}
        op[346] = getOpcodeRep((char)0, (char)1, 347);
        {int[] a = {348,349}; op[347] = getOpcodeCat(a);}
        op[348] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[349] = getOpcodeTls(a);}
        op[350] = getOpcodeRnm(270, 2059); // primitiveColFunction
        {int[] a = {352,353}; op[351] = getOpcodeCat(a);}
        op[352] = getOpcodeRnm(271, 2060); // entityFunctionImport
        op[353] = getOpcodeRnm(44, 376); // functionParameters
        {int[] a = {355,356}; op[354] = getOpcodeCat(a);}
        op[355] = getOpcodeRnm(272, 2061); // entityColFunctionImport
        op[356] = getOpcodeRnm(44, 376); // functionParameters
        {int[] a = {358,359}; op[357] = getOpcodeCat(a);}
        op[358] = getOpcodeRnm(273, 2062); // complexFunctionImport
        op[359] = getOpcodeRnm(44, 376); // functionParameters
        {int[] a = {361,362}; op[360] = getOpcodeCat(a);}
        op[361] = getOpcodeRnm(274, 2063); // complexColFunctionImport
        op[362] = getOpcodeRnm(44, 376); // functionParameters
        {int[] a = {364,365}; op[363] = getOpcodeCat(a);}
        op[364] = getOpcodeRnm(275, 2064); // primitiveFunctionImport
        op[365] = getOpcodeRnm(44, 376); // functionParameters
        {int[] a = {367,368}; op[366] = getOpcodeCat(a);}
        op[367] = getOpcodeRnm(276, 2065); // primitiveColFunctionImport
        op[368] = getOpcodeRnm(44, 376); // functionParameters
        {int[] a = {370,371,372,373,374,375}; op[369] = getOpcodeAlt(a);}
        op[370] = getOpcodeRnm(271, 2060); // entityFunctionImport
        op[371] = getOpcodeRnm(272, 2061); // entityColFunctionImport
        op[372] = getOpcodeRnm(273, 2062); // complexFunctionImport
        op[373] = getOpcodeRnm(274, 2063); // complexColFunctionImport
        op[374] = getOpcodeRnm(275, 2064); // primitiveFunctionImport
        op[375] = getOpcodeRnm(276, 2065); // primitiveColFunctionImport
        {int[] a = {377,378,385}; op[376] = getOpcodeCat(a);}
        op[377] = getOpcodeRnm(390, 2811); // OPEN
        op[378] = getOpcodeRep((char)0, (char)1, 379);
        {int[] a = {380,381}; op[379] = getOpcodeCat(a);}
        op[380] = getOpcodeRnm(45, 386); // functionParameter
        op[381] = getOpcodeRep((char)0, Character.MAX_VALUE, 382);
        {int[] a = {383,384}; op[382] = getOpcodeCat(a);}
        op[383] = getOpcodeRnm(384, 2794); // COMMA
        op[384] = getOpcodeRnm(45, 386); // functionParameter
        op[385] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {387,388,389}; op[386] = getOpcodeCat(a);}
        op[387] = getOpcodeRnm(46, 392); // parameterName
        op[388] = getOpcodeRnm(385, 2797); // EQ
        {int[] a = {390,391}; op[389] = getOpcodeAlt(a);}
        op[390] = getOpcodeRnm(47, 393); // parameterAlias
        op[391] = getOpcodeRnm(277, 2066); // primitiveLiteral
        op[392] = getOpcodeRnm(246, 1985); // odataIdentifier
        {int[] a = {394,395}; op[393] = getOpcodeCat(a);}
        op[394] = getOpcodeRnm(382, 2788); // AT
        op[395] = getOpcodeRnm(246, 1985); // odataIdentifier
        {int[] a = {397,398,399,400,404}; op[396] = getOpcodeCat(a);}
        {char[] a = {36,99,114,111,115,115,106,111,105,110}; op[397] = getOpcodeTbs(a);}
        op[398] = getOpcodeRnm(390, 2811); // OPEN
        op[399] = getOpcodeRnm(238, 1977); // entitySetName
        op[400] = getOpcodeRep((char)0, Character.MAX_VALUE, 401);
        {int[] a = {402,403}; op[401] = getOpcodeCat(a);}
        op[402] = getOpcodeRnm(384, 2794); // COMMA
        op[403] = getOpcodeRnm(238, 1977); // entitySetName
        op[404] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {406,407}; op[405] = getOpcodeCat(a);}
        op[406] = getOpcodeRnm(50, 411); // queryOption
        op[407] = getOpcodeRep((char)0, Character.MAX_VALUE, 408);
        {int[] a = {409,410}; op[408] = getOpcodeCat(a);}
        {char[] a = {38}; op[409] = getOpcodeTls(a);}
        op[410] = getOpcodeRnm(50, 411); // queryOption
        {int[] a = {412,413,414,415}; op[411] = getOpcodeAlt(a);}
        op[412] = getOpcodeRnm(60, 467); // systemQueryOption
        op[413] = getOpcodeRnm(99, 840); // aliasAndValue
        op[414] = getOpcodeRnm(100, 844); // nameAndValue
        op[415] = getOpcodeRnm(102, 851); // customQueryOption
        {int[] a = {417,418}; op[416] = getOpcodeCat(a);}
        op[417] = getOpcodeRnm(52, 422); // batchOption
        op[418] = getOpcodeRep((char)0, Character.MAX_VALUE, 419);
        {int[] a = {420,421}; op[419] = getOpcodeCat(a);}
        {char[] a = {38}; op[420] = getOpcodeTls(a);}
        op[421] = getOpcodeRnm(52, 422); // batchOption
        {int[] a = {423,424}; op[422] = getOpcodeAlt(a);}
        op[423] = getOpcodeRnm(77, 646); // format
        op[424] = getOpcodeRnm(102, 851); // customQueryOption
        {int[] a = {426,427}; op[425] = getOpcodeCat(a);}
        op[426] = getOpcodeRnm(54, 431); // metadataOption
        op[427] = getOpcodeRep((char)0, Character.MAX_VALUE, 428);
        {int[] a = {429,430}; op[428] = getOpcodeCat(a);}
        {char[] a = {38}; op[429] = getOpcodeTls(a);}
        op[430] = getOpcodeRnm(54, 431); // metadataOption
        {int[] a = {432,433}; op[431] = getOpcodeAlt(a);}
        op[432] = getOpcodeRnm(77, 646); // format
        op[433] = getOpcodeRnm(102, 851); // customQueryOption
        {int[] a = {435,439,440}; op[434] = getOpcodeCat(a);}
        op[435] = getOpcodeRep((char)0, Character.MAX_VALUE, 436);
        {int[] a = {437,438}; op[436] = getOpcodeCat(a);}
        op[437] = getOpcodeRnm(56, 444); // entityIdOption
        {char[] a = {38}; op[438] = getOpcodeTls(a);}
        op[439] = getOpcodeRnm(59, 461); // id
        op[440] = getOpcodeRep((char)0, Character.MAX_VALUE, 441);
        {int[] a = {442,443}; op[441] = getOpcodeCat(a);}
        {char[] a = {38}; op[442] = getOpcodeTls(a);}
        op[443] = getOpcodeRnm(56, 444); // entityIdOption
        {int[] a = {445,446}; op[444] = getOpcodeAlt(a);}
        op[445] = getOpcodeRnm(77, 646); // format
        op[446] = getOpcodeRnm(102, 851); // customQueryOption
        {int[] a = {448,452,453}; op[447] = getOpcodeCat(a);}
        op[448] = getOpcodeRep((char)0, Character.MAX_VALUE, 449);
        {int[] a = {450,451}; op[449] = getOpcodeCat(a);}
        op[450] = getOpcodeRnm(58, 457); // entityCastOption
        {char[] a = {38}; op[451] = getOpcodeTls(a);}
        op[452] = getOpcodeRnm(59, 461); // id
        op[453] = getOpcodeRep((char)0, Character.MAX_VALUE, 454);
        {int[] a = {455,456}; op[454] = getOpcodeCat(a);}
        {char[] a = {38}; op[455] = getOpcodeTls(a);}
        op[456] = getOpcodeRnm(58, 457); // entityCastOption
        {int[] a = {458,459,460}; op[457] = getOpcodeAlt(a);}
        op[458] = getOpcodeRnm(56, 444); // entityIdOption
        op[459] = getOpcodeRnm(64, 500); // expand
        op[460] = getOpcodeRnm(87, 728); // select
        {int[] a = {462,465,466}; op[461] = getOpcodeCat(a);}
        {int[] a = {463,464}; op[462] = getOpcodeAlt(a);}
        {char[] a = {36,105,100}; op[463] = getOpcodeTls(a);}
        {char[] a = {105,100}; op[464] = getOpcodeTls(a);}
        op[465] = getOpcodeRnm(385, 2797); // EQ
        op[466] = getOpcodeRnm(428, 3202); // IRI-in-query
        {int[] a = {468,469,470,471,472,473,474,475,476,477,478,479,480,481,482}; op[467] = getOpcodeAlt(a);}
        op[468] = getOpcodeRnm(61, 483); // compute
        op[469] = getOpcodeRnm(97, 830); // deltatoken
        op[470] = getOpcodeRnm(64, 500); // expand
        op[471] = getOpcodeRnm(71, 601); // filter
        op[472] = getOpcodeRnm(77, 646); // format
        op[473] = getOpcodeRnm(59, 461); // id
        op[474] = getOpcodeRnm(78, 661); // inlinecount
        op[475] = getOpcodeRnm(72, 607); // orderby
        op[476] = getOpcodeRnm(79, 667); // schemaversion
        op[477] = getOpcodeRnm(80, 676); // search
        op[478] = getOpcodeRnm(87, 728); // select
        op[479] = getOpcodeRnm(74, 625); // skip
        op[480] = getOpcodeRnm(98, 835); // skiptoken
        op[481] = getOpcodeRnm(75, 632); // top
        op[482] = getOpcodeRnm(76, 639); // index
        {int[] a = {484,487,488,489}; op[483] = getOpcodeCat(a);}
        {int[] a = {485,486}; op[484] = getOpcodeAlt(a);}
        {char[] a = {36,99,111,109,112,117,116,101}; op[485] = getOpcodeTls(a);}
        {char[] a = {99,111,109,112,117,116,101}; op[486] = getOpcodeTls(a);}
        op[487] = getOpcodeRnm(385, 2797); // EQ
        op[488] = getOpcodeRnm(62, 493); // computeItem
        op[489] = getOpcodeRep((char)0, Character.MAX_VALUE, 490);
        {int[] a = {491,492}; op[490] = getOpcodeCat(a);}
        op[491] = getOpcodeRnm(384, 2794); // COMMA
        op[492] = getOpcodeRnm(62, 493); // computeItem
        {int[] a = {494,495,496,497,498}; op[493] = getOpcodeCat(a);}
        op[494] = getOpcodeRnm(116, 1007); // commonExpr
        op[495] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {97,115}; op[496] = getOpcodeTls(a);}
        op[497] = getOpcodeRnm(380, 2776); // RWS
        op[498] = getOpcodeRnm(63, 499); // computedProperty
        op[499] = getOpcodeRnm(246, 1985); // odataIdentifier
        {int[] a = {501,504,505,506}; op[500] = getOpcodeCat(a);}
        {int[] a = {502,503}; op[501] = getOpcodeAlt(a);}
        {char[] a = {36,101,120,112,97,110,100}; op[502] = getOpcodeTls(a);}
        {char[] a = {101,120,112,97,110,100}; op[503] = getOpcodeTls(a);}
        op[504] = getOpcodeRnm(385, 2797); // EQ
        op[505] = getOpcodeRnm(65, 510); // expandItem
        op[506] = getOpcodeRep((char)0, Character.MAX_VALUE, 507);
        {int[] a = {508,509}; op[507] = getOpcodeCat(a);}
        op[508] = getOpcodeRnm(384, 2794); // COMMA
        op[509] = getOpcodeRnm(65, 510); // expandItem
        {int[] a = {511,512,513}; op[510] = getOpcodeAlt(a);}
        {char[] a = {36,118,97,108,117,101}; op[511] = getOpcodeTls(a);}
        op[512] = getOpcodeRnm(66, 517); // expandPath
        {int[] a = {514,515,516}; op[513] = getOpcodeCat(a);}
        op[514] = getOpcodeRnm(234, 1958); // optionallyQualifiedEntityTypeName
        {char[] a = {47}; op[515] = getOpcodeTls(a);}
        op[516] = getOpcodeRnm(66, 517); // expandPath
        {int[] a = {518,525}; op[517] = getOpcodeCat(a);}
        op[518] = getOpcodeRep((char)0, Character.MAX_VALUE, 519);
        {int[] a = {520,524}; op[519] = getOpcodeCat(a);}
        {int[] a = {521,522,523}; op[520] = getOpcodeAlt(a);}
        op[521] = getOpcodeRnm(256, 2037); // complexProperty
        op[522] = getOpcodeRnm(257, 2038); // complexColProperty
        op[523] = getOpcodeRnm(235, 1964); // optionallyQualifiedComplexTypeName
        {char[] a = {47}; op[524] = getOpcodeTls(a);}
        {int[] a = {526,535,536}; op[525] = getOpcodeAlt(a);}
        {int[] a = {527,528}; op[526] = getOpcodeCat(a);}
        op[527] = getOpcodeRnm(388, 2805); // STAR
        op[528] = getOpcodeRep((char)0, (char)1, 529);
        {int[] a = {530,531}; op[529] = getOpcodeAlt(a);}
        op[530] = getOpcodeRnm(24, 230); // ref
        {int[] a = {532,533,534}; op[531] = getOpcodeCat(a);}
        op[532] = getOpcodeRnm(390, 2811); // OPEN
        op[533] = getOpcodeRnm(70, 590); // levels
        op[534] = getOpcodeRnm(391, 2814); // CLOSE
        op[535] = getOpcodeRnm(258, 2039); // streamProperty
        {int[] a = {537,538,542}; op[536] = getOpcodeCat(a);}
        op[537] = getOpcodeRnm(259, 2040); // navigationProperty
        op[538] = getOpcodeRep((char)0, (char)1, 539);
        {int[] a = {540,541}; op[539] = getOpcodeCat(a);}
        {char[] a = {47}; op[540] = getOpcodeTls(a);}
        op[541] = getOpcodeRnm(234, 1958); // optionallyQualifiedEntityTypeName
        op[542] = getOpcodeRep((char)0, (char)1, 543);
        {int[] a = {544,555,566}; op[543] = getOpcodeAlt(a);}
        {int[] a = {545,546}; op[544] = getOpcodeCat(a);}
        op[545] = getOpcodeRnm(24, 230); // ref
        op[546] = getOpcodeRep((char)0, (char)1, 547);
        {int[] a = {548,549,550,554}; op[547] = getOpcodeCat(a);}
        op[548] = getOpcodeRnm(390, 2811); // OPEN
        op[549] = getOpcodeRnm(68, 577); // expandRefOption
        op[550] = getOpcodeRep((char)0, Character.MAX_VALUE, 551);
        {int[] a = {552,553}; op[551] = getOpcodeCat(a);}
        op[552] = getOpcodeRnm(387, 2802); // SEMI
        op[553] = getOpcodeRnm(68, 577); // expandRefOption
        op[554] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {556,557}; op[555] = getOpcodeCat(a);}
        op[556] = getOpcodeRnm(23, 229); // count
        op[557] = getOpcodeRep((char)0, (char)1, 558);
        {int[] a = {559,560,561,565}; op[558] = getOpcodeCat(a);}
        op[559] = getOpcodeRnm(390, 2811); // OPEN
        op[560] = getOpcodeRnm(67, 574); // expandCountOption
        op[561] = getOpcodeRep((char)0, Character.MAX_VALUE, 562);
        {int[] a = {563,564}; op[562] = getOpcodeCat(a);}
        op[563] = getOpcodeRnm(387, 2802); // SEMI
        op[564] = getOpcodeRnm(67, 574); // expandCountOption
        op[565] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {567,568,569,573}; op[566] = getOpcodeCat(a);}
        op[567] = getOpcodeRnm(390, 2811); // OPEN
        op[568] = getOpcodeRnm(69, 583); // expandOption
        op[569] = getOpcodeRep((char)0, Character.MAX_VALUE, 570);
        {int[] a = {571,572}; op[570] = getOpcodeCat(a);}
        op[571] = getOpcodeRnm(387, 2802); // SEMI
        op[572] = getOpcodeRnm(69, 583); // expandOption
        op[573] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {575,576}; op[574] = getOpcodeAlt(a);}
        op[575] = getOpcodeRnm(71, 601); // filter
        op[576] = getOpcodeRnm(80, 676); // search
        {int[] a = {578,579,580,581,582}; op[577] = getOpcodeAlt(a);}
        op[578] = getOpcodeRnm(67, 574); // expandCountOption
        op[579] = getOpcodeRnm(72, 607); // orderby
        op[580] = getOpcodeRnm(74, 625); // skip
        op[581] = getOpcodeRnm(75, 632); // top
        op[582] = getOpcodeRnm(78, 661); // inlinecount
        {int[] a = {584,585,586,587,588,589}; op[583] = getOpcodeAlt(a);}
        op[584] = getOpcodeRnm(68, 577); // expandRefOption
        op[585] = getOpcodeRnm(87, 728); // select
        op[586] = getOpcodeRnm(64, 500); // expand
        op[587] = getOpcodeRnm(61, 483); // compute
        op[588] = getOpcodeRnm(70, 590); // levels
        op[589] = getOpcodeRnm(99, 840); // aliasAndValue
        {int[] a = {591,594,595}; op[590] = getOpcodeCat(a);}
        {int[] a = {592,593}; op[591] = getOpcodeAlt(a);}
        {char[] a = {36,108,101,118,101,108,115}; op[592] = getOpcodeTls(a);}
        {char[] a = {108,101,118,101,108,115}; op[593] = getOpcodeTls(a);}
        op[594] = getOpcodeRnm(385, 2797); // EQ
        {int[] a = {596,600}; op[595] = getOpcodeAlt(a);}
        {int[] a = {597,598}; op[596] = getOpcodeCat(a);}
        op[597] = getOpcodeRnm(305, 2346); // oneToNine
        op[598] = getOpcodeRep((char)0, Character.MAX_VALUE, 599);
        op[599] = getOpcodeRnm(430, 3207); // DIGIT
        {char[] a = {109,97,120}; op[600] = getOpcodeTls(a);}
        {int[] a = {602,605,606}; op[601] = getOpcodeCat(a);}
        {int[] a = {603,604}; op[602] = getOpcodeAlt(a);}
        {char[] a = {36,102,105,108,116,101,114}; op[603] = getOpcodeTls(a);}
        {char[] a = {102,105,108,116,101,114}; op[604] = getOpcodeTls(a);}
        op[605] = getOpcodeRnm(385, 2797); // EQ
        op[606] = getOpcodeRnm(117, 1043); // boolCommonExpr
        {int[] a = {608,611,612,613}; op[607] = getOpcodeCat(a);}
        {int[] a = {609,610}; op[608] = getOpcodeAlt(a);}
        {char[] a = {36,111,114,100,101,114,98,121}; op[609] = getOpcodeTls(a);}
        {char[] a = {111,114,100,101,114,98,121}; op[610] = getOpcodeTls(a);}
        op[611] = getOpcodeRnm(385, 2797); // EQ
        op[612] = getOpcodeRnm(73, 617); // orderbyItem
        op[613] = getOpcodeRep((char)0, Character.MAX_VALUE, 614);
        {int[] a = {615,616}; op[614] = getOpcodeCat(a);}
        op[615] = getOpcodeRnm(384, 2794); // COMMA
        op[616] = getOpcodeRnm(73, 617); // orderbyItem
        {int[] a = {618,619}; op[617] = getOpcodeCat(a);}
        op[618] = getOpcodeRnm(116, 1007); // commonExpr
        op[619] = getOpcodeRep((char)0, (char)1, 620);
        {int[] a = {621,622}; op[620] = getOpcodeCat(a);}
        op[621] = getOpcodeRnm(380, 2776); // RWS
        {int[] a = {623,624}; op[622] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[623] = getOpcodeTls(a);}
        {char[] a = {100,101,115,99}; op[624] = getOpcodeTls(a);}
        {int[] a = {626,629,630}; op[625] = getOpcodeCat(a);}
        {int[] a = {627,628}; op[626] = getOpcodeAlt(a);}
        {char[] a = {36,115,107,105,112}; op[627] = getOpcodeTls(a);}
        {char[] a = {115,107,105,112}; op[628] = getOpcodeTls(a);}
        op[629] = getOpcodeRnm(385, 2797); // EQ
        op[630] = getOpcodeRep((char)1, Character.MAX_VALUE, 631);
        op[631] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {633,636,637}; op[632] = getOpcodeCat(a);}
        {int[] a = {634,635}; op[633] = getOpcodeAlt(a);}
        {char[] a = {36,116,111,112}; op[634] = getOpcodeTls(a);}
        {char[] a = {116,111,112}; op[635] = getOpcodeTls(a);}
        op[636] = getOpcodeRnm(385, 2797); // EQ
        op[637] = getOpcodeRep((char)1, Character.MAX_VALUE, 638);
        op[638] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {640,643,644}; op[639] = getOpcodeCat(a);}
        {int[] a = {641,642}; op[640] = getOpcodeAlt(a);}
        {char[] a = {36,105,110,100,101,120}; op[641] = getOpcodeTls(a);}
        {char[] a = {105,110,100,101,120}; op[642] = getOpcodeTls(a);}
        op[643] = getOpcodeRnm(385, 2797); // EQ
        op[644] = getOpcodeRep((char)1, Character.MAX_VALUE, 645);
        op[645] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {647,650,651}; op[646] = getOpcodeCat(a);}
        {int[] a = {648,649}; op[647] = getOpcodeAlt(a);}
        {char[] a = {36,102,111,114,109,97,116}; op[648] = getOpcodeTls(a);}
        {char[] a = {102,111,114,109,97,116}; op[649] = getOpcodeTls(a);}
        op[650] = getOpcodeRnm(385, 2797); // EQ
        {int[] a = {652,653,654,655}; op[651] = getOpcodeAlt(a);}
        {char[] a = {97,116,111,109}; op[652] = getOpcodeTls(a);}
        {char[] a = {106,115,111,110}; op[653] = getOpcodeTls(a);}
        {char[] a = {120,109,108}; op[654] = getOpcodeTls(a);}
        {int[] a = {656,658,659}; op[655] = getOpcodeCat(a);}
        op[656] = getOpcodeRep((char)1, Character.MAX_VALUE, 657);
        op[657] = getOpcodeRnm(412, 3035); // pchar
        {char[] a = {47}; op[658] = getOpcodeTls(a);}
        op[659] = getOpcodeRep((char)1, Character.MAX_VALUE, 660);
        op[660] = getOpcodeRnm(412, 3035); // pchar
        {int[] a = {662,665,666}; op[661] = getOpcodeCat(a);}
        {int[] a = {663,664}; op[662] = getOpcodeAlt(a);}
        {char[] a = {36,99,111,117,110,116}; op[663] = getOpcodeTls(a);}
        {char[] a = {99,111,117,110,116}; op[664] = getOpcodeTls(a);}
        op[665] = getOpcodeRnm(385, 2797); // EQ
        op[666] = getOpcodeRnm(285, 2173); // booleanValue
        {int[] a = {668,671,672}; op[667] = getOpcodeCat(a);}
        {int[] a = {669,670}; op[668] = getOpcodeAlt(a);}
        {char[] a = {36,115,99,104,101,109,97,118,101,114,115,105,111,110}; op[669] = getOpcodeTls(a);}
        {char[] a = {115,99,104,101,109,97,118,101,114,115,105,111,110}; op[670] = getOpcodeTls(a);}
        op[671] = getOpcodeRnm(385, 2797); // EQ
        {int[] a = {673,674}; op[672] = getOpcodeAlt(a);}
        op[673] = getOpcodeRnm(388, 2805); // STAR
        op[674] = getOpcodeRep((char)1, Character.MAX_VALUE, 675);
        op[675] = getOpcodeRnm(416, 3055); // unreserved
        {int[] a = {677,680,681,682}; op[676] = getOpcodeCat(a);}
        {int[] a = {678,679}; op[677] = getOpcodeAlt(a);}
        {char[] a = {36,115,101,97,114,99,104}; op[678] = getOpcodeTls(a);}
        {char[] a = {115,101,97,114,99,104}; op[679] = getOpcodeTls(a);}
        op[680] = getOpcodeRnm(385, 2797); // EQ
        op[681] = getOpcodeRnm(381, 2782); // BWS
        op[682] = getOpcodeRnm(81, 683); // searchExpr
        {int[] a = {684,692}; op[683] = getOpcodeCat(a);}
        {int[] a = {685,691}; op[684] = getOpcodeAlt(a);}
        {int[] a = {686,687,688,689,690}; op[685] = getOpcodeCat(a);}
        op[686] = getOpcodeRnm(390, 2811); // OPEN
        op[687] = getOpcodeRnm(381, 2782); // BWS
        op[688] = getOpcodeRnm(81, 683); // searchExpr
        op[689] = getOpcodeRnm(381, 2782); // BWS
        op[690] = getOpcodeRnm(391, 2814); // CLOSE
        op[691] = getOpcodeRnm(84, 708); // searchTerm
        op[692] = getOpcodeRep((char)0, (char)1, 693);
        {int[] a = {694,695}; op[693] = getOpcodeAlt(a);}
        op[694] = getOpcodeRnm(82, 696); // searchOrExpr
        op[695] = getOpcodeRnm(83, 701); // searchAndExpr
        {int[] a = {697,698,699,700}; op[696] = getOpcodeCat(a);}
        op[697] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {79,82}; op[698] = getOpcodeTbs(a);}
        op[699] = getOpcodeRnm(380, 2776); // RWS
        op[700] = getOpcodeRnm(81, 683); // searchExpr
        {int[] a = {702,703,707}; op[701] = getOpcodeCat(a);}
        op[702] = getOpcodeRnm(380, 2776); // RWS
        op[703] = getOpcodeRep((char)0, (char)1, 704);
        {int[] a = {705,706}; op[704] = getOpcodeCat(a);}
        {char[] a = {65,78,68}; op[705] = getOpcodeTbs(a);}
        op[706] = getOpcodeRnm(380, 2776); // RWS
        op[707] = getOpcodeRnm(81, 683); // searchExpr
        {int[] a = {709,713}; op[708] = getOpcodeCat(a);}
        op[709] = getOpcodeRep((char)0, (char)1, 710);
        {int[] a = {711,712}; op[710] = getOpcodeCat(a);}
        {char[] a = {78,79,84}; op[711] = getOpcodeTbs(a);}
        op[712] = getOpcodeRnm(380, 2776); // RWS
        {int[] a = {714,715}; op[713] = getOpcodeAlt(a);}
        op[714] = getOpcodeRnm(85, 716); // searchPhrase
        op[715] = getOpcodeRnm(86, 721); // searchWord
        {int[] a = {717,718,720}; op[716] = getOpcodeCat(a);}
        op[717] = getOpcodeRnm(214, 1833); // quotation-mark
        op[718] = getOpcodeRep((char)1, Character.MAX_VALUE, 719);
        op[719] = getOpcodeRnm(426, 3191); // qchar-no-AMP-DQUOTE
        op[720] = getOpcodeRnm(214, 1833); // quotation-mark
        op[721] = getOpcodeRep((char)1, Character.MAX_VALUE, 722);
        {int[] a = {723,724,725,726,727}; op[722] = getOpcodeAlt(a);}
        op[723] = getOpcodeRnm(429, 3204); // ALPHA
        op[724] = getOpcodeRnm(430, 3207); // DIGIT
        op[725] = getOpcodeRnm(384, 2794); // COMMA
        {char[] a = {46}; op[726] = getOpcodeTls(a);}
        op[727] = getOpcodeRnm(415, 3051); // pct-encoded
        {int[] a = {729,732,733,734}; op[728] = getOpcodeCat(a);}
        {int[] a = {730,731}; op[729] = getOpcodeAlt(a);}
        {char[] a = {36,115,101,108,101,99,116}; op[730] = getOpcodeTls(a);}
        {char[] a = {115,101,108,101,99,116}; op[731] = getOpcodeTls(a);}
        op[732] = getOpcodeRnm(385, 2797); // EQ
        op[733] = getOpcodeRnm(88, 738); // selectItem
        op[734] = getOpcodeRep((char)0, Character.MAX_VALUE, 735);
        {int[] a = {736,737}; op[735] = getOpcodeCat(a);}
        op[736] = getOpcodeRnm(384, 2794); // COMMA
        op[737] = getOpcodeRnm(88, 738); // selectItem
        {int[] a = {739,740,741,742,743,744}; op[738] = getOpcodeAlt(a);}
        op[739] = getOpcodeRnm(388, 2805); // STAR
        op[740] = getOpcodeRnm(93, 803); // allOperationsInSchema
        op[741] = getOpcodeRnm(89, 753); // selectProperty
        op[742] = getOpcodeRnm(94, 807); // optionallyQualifiedActionName
        op[743] = getOpcodeRnm(95, 813); // optionallyQualifiedFunctionName
        {int[] a = {745,748,749}; op[744] = getOpcodeCat(a);}
        {int[] a = {746,747}; op[745] = getOpcodeAlt(a);}
        op[746] = getOpcodeRnm(234, 1958); // optionallyQualifiedEntityTypeName
        op[747] = getOpcodeRnm(235, 1964); // optionallyQualifiedComplexTypeName
        {char[] a = {47}; op[748] = getOpcodeTls(a);}
        {int[] a = {750,751,752}; op[749] = getOpcodeAlt(a);}
        op[750] = getOpcodeRnm(89, 753); // selectProperty
        op[751] = getOpcodeRnm(94, 807); // optionallyQualifiedActionName
        op[752] = getOpcodeRnm(95, 813); // optionallyQualifiedFunctionName
        {int[] a = {754,755,766,767}; op[753] = getOpcodeAlt(a);}
        op[754] = getOpcodeRnm(252, 2031); // primitiveProperty
        {int[] a = {756,757}; op[755] = getOpcodeCat(a);}
        op[756] = getOpcodeRnm(255, 2036); // primitiveColProperty
        op[757] = getOpcodeRep((char)0, (char)1, 758);
        {int[] a = {759,760,761,765}; op[758] = getOpcodeCat(a);}
        op[759] = getOpcodeRnm(390, 2811); // OPEN
        op[760] = getOpcodeRnm(91, 790); // selectOptionPC
        op[761] = getOpcodeRep((char)0, Character.MAX_VALUE, 762);
        {int[] a = {763,764}; op[762] = getOpcodeCat(a);}
        op[763] = getOpcodeRnm(387, 2802); // SEMI
        op[764] = getOpcodeRnm(91, 790); // selectOptionPC
        op[765] = getOpcodeRnm(391, 2814); // CLOSE
        op[766] = getOpcodeRnm(259, 2040); // navigationProperty
        {int[] a = {768,769}; op[767] = getOpcodeCat(a);}
        op[768] = getOpcodeRnm(90, 782); // selectPath
        op[769] = getOpcodeRep((char)0, (char)1, 770);
        {int[] a = {771,779}; op[770] = getOpcodeAlt(a);}
        {int[] a = {772,773,774,778}; op[771] = getOpcodeCat(a);}
        op[772] = getOpcodeRnm(390, 2811); // OPEN
        op[773] = getOpcodeRnm(92, 797); // selectOption
        op[774] = getOpcodeRep((char)0, Character.MAX_VALUE, 775);
        {int[] a = {776,777}; op[775] = getOpcodeCat(a);}
        op[776] = getOpcodeRnm(387, 2802); // SEMI
        op[777] = getOpcodeRnm(92, 797); // selectOption
        op[778] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {780,781}; op[779] = getOpcodeCat(a);}
        {char[] a = {47}; op[780] = getOpcodeTls(a);}
        op[781] = getOpcodeRnm(89, 753); // selectProperty
        {int[] a = {783,786}; op[782] = getOpcodeCat(a);}
        {int[] a = {784,785}; op[783] = getOpcodeAlt(a);}
        op[784] = getOpcodeRnm(256, 2037); // complexProperty
        op[785] = getOpcodeRnm(257, 2038); // complexColProperty
        op[786] = getOpcodeRep((char)0, (char)1, 787);
        {int[] a = {788,789}; op[787] = getOpcodeCat(a);}
        {char[] a = {47}; op[788] = getOpcodeTls(a);}
        op[789] = getOpcodeRnm(235, 1964); // optionallyQualifiedComplexTypeName
        {int[] a = {791,792,793,794,795,796}; op[790] = getOpcodeAlt(a);}
        op[791] = getOpcodeRnm(71, 601); // filter
        op[792] = getOpcodeRnm(80, 676); // search
        op[793] = getOpcodeRnm(78, 661); // inlinecount
        op[794] = getOpcodeRnm(72, 607); // orderby
        op[795] = getOpcodeRnm(74, 625); // skip
        op[796] = getOpcodeRnm(75, 632); // top
        {int[] a = {798,799,800,801,802}; op[797] = getOpcodeAlt(a);}
        op[798] = getOpcodeRnm(91, 790); // selectOptionPC
        op[799] = getOpcodeRnm(61, 483); // compute
        op[800] = getOpcodeRnm(87, 728); // select
        op[801] = getOpcodeRnm(64, 500); // expand
        op[802] = getOpcodeRnm(99, 840); // aliasAndValue
        {int[] a = {804,805,806}; op[803] = getOpcodeCat(a);}
        op[804] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[805] = getOpcodeTls(a);}
        op[806] = getOpcodeRnm(388, 2805); // STAR
        {int[] a = {808,812}; op[807] = getOpcodeCat(a);}
        op[808] = getOpcodeRep((char)0, (char)1, 809);
        {int[] a = {810,811}; op[809] = getOpcodeCat(a);}
        op[810] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[811] = getOpcodeTls(a);}
        op[812] = getOpcodeRnm(262, 2045); // action
        {int[] a = {814,818,819}; op[813] = getOpcodeCat(a);}
        op[814] = getOpcodeRep((char)0, (char)1, 815);
        {int[] a = {816,817}; op[815] = getOpcodeCat(a);}
        op[816] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[817] = getOpcodeTls(a);}
        op[818] = getOpcodeRnm(264, 2047); // function
        op[819] = getOpcodeRep((char)0, (char)1, 820);
        {int[] a = {821,822,823}; op[820] = getOpcodeCat(a);}
        op[821] = getOpcodeRnm(390, 2811); // OPEN
        op[822] = getOpcodeRnm(96, 824); // parameterNames
        op[823] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {825,826}; op[824] = getOpcodeCat(a);}
        op[825] = getOpcodeRnm(46, 392); // parameterName
        op[826] = getOpcodeRep((char)0, Character.MAX_VALUE, 827);
        {int[] a = {828,829}; op[827] = getOpcodeCat(a);}
        op[828] = getOpcodeRnm(384, 2794); // COMMA
        op[829] = getOpcodeRnm(46, 392); // parameterName
        {int[] a = {831,832,833}; op[830] = getOpcodeCat(a);}
        {char[] a = {36,100,101,108,116,97,116,111,107,101,110}; op[831] = getOpcodeTls(a);}
        op[832] = getOpcodeRnm(385, 2797); // EQ
        op[833] = getOpcodeRep((char)1, Character.MAX_VALUE, 834);
        op[834] = getOpcodeRnm(421, 3113); // qchar-no-AMP
        {int[] a = {836,837,838}; op[835] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,116,111,107,101,110}; op[836] = getOpcodeTls(a);}
        op[837] = getOpcodeRnm(385, 2797); // EQ
        op[838] = getOpcodeRep((char)1, Character.MAX_VALUE, 839);
        op[839] = getOpcodeRnm(421, 3113); // qchar-no-AMP
        {int[] a = {841,842,843}; op[840] = getOpcodeCat(a);}
        op[841] = getOpcodeRnm(47, 393); // parameterAlias
        op[842] = getOpcodeRnm(385, 2797); // EQ
        op[843] = getOpcodeRnm(101, 848); // parameterValue
        {int[] a = {845,846,847}; op[844] = getOpcodeCat(a);}
        op[845] = getOpcodeRnm(46, 392); // parameterName
        op[846] = getOpcodeRnm(385, 2797); // EQ
        op[847] = getOpcodeRnm(101, 848); // parameterValue
        {int[] a = {849,850}; op[848] = getOpcodeAlt(a);}
        op[849] = getOpcodeRnm(198, 1701); // arrayOrObject
        op[850] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {852,853}; op[851] = getOpcodeCat(a);}
        op[852] = getOpcodeRnm(103, 857); // customName
        op[853] = getOpcodeRep((char)0, (char)1, 854);
        {int[] a = {855,856}; op[854] = getOpcodeCat(a);}
        op[855] = getOpcodeRnm(385, 2797); // EQ
        op[856] = getOpcodeRnm(104, 861); // customValue
        {int[] a = {858,859}; op[857] = getOpcodeCat(a);}
        op[858] = getOpcodeRnm(423, 3134); // qchar-no-AMP-EQ-AT-DOLLAR
        op[859] = getOpcodeRep((char)0, Character.MAX_VALUE, 860);
        op[860] = getOpcodeRnm(422, 3124); // qchar-no-AMP-EQ
        op[861] = getOpcodeRep((char)0, Character.MAX_VALUE, 862);
        op[862] = getOpcodeRnm(421, 3113); // qchar-no-AMP
        {int[] a = {864,865}; op[863] = getOpcodeCat(a);}
        {char[] a = {35}; op[864] = getOpcodeTls(a);}
        op[865] = getOpcodeRnm(106, 866); // contextFragment
        {int[] a = {867,868,869,870,871,884,888,894,901}; op[866] = getOpcodeAlt(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110,40,36,114,101,102,41}; op[867] = getOpcodeTbs(a);}
        {char[] a = {36,114,101,102}; op[868] = getOpcodeTbs(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110,40,69,100,109,46,69,110,116,105,116,121,84,121,112,101,41}; op[869] = getOpcodeTbs(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110,40,69,100,109,46,67,111,109,112,108,101,120,84,121,112,101,41}; op[870] = getOpcodeTbs(a);}
        {int[] a = {872,873,882}; op[871] = getOpcodeCat(a);}
        op[872] = getOpcodeRnm(239, 1978); // singletonEntity
        op[873] = getOpcodeRep((char)0, (char)1, 874);
        {int[] a = {875,876,878}; op[874] = getOpcodeCat(a);}
        op[875] = getOpcodeRnm(109, 924); // navigation
        op[876] = getOpcodeRep((char)0, Character.MAX_VALUE, 877);
        op[877] = getOpcodeRnm(108, 917); // containmentNavigation
        op[878] = getOpcodeRep((char)0, (char)1, 879);
        {int[] a = {880,881}; op[879] = getOpcodeCat(a);}
        {char[] a = {47}; op[880] = getOpcodeTls(a);}
        op[881] = getOpcodeRnm(230, 1942); // qualifiedEntityTypeName
        op[882] = getOpcodeRep((char)0, (char)1, 883);
        op[883] = getOpcodeRnm(110, 935); // selectList
        {int[] a = {885,886}; op[884] = getOpcodeCat(a);}
        op[885] = getOpcodeRnm(226, 1911); // qualifiedTypeName
        op[886] = getOpcodeRep((char)0, (char)1, 887);
        op[887] = getOpcodeRnm(110, 935); // selectList
        {int[] a = {889,890}; op[888] = getOpcodeCat(a);}
        op[889] = getOpcodeRnm(107, 909); // entitySet
        {int[] a = {891,892,893}; op[890] = getOpcodeAlt(a);}
        {char[] a = {47,36,100,101,108,101,116,101,100,69,110,116,105,116,121}; op[891] = getOpcodeTbs(a);}
        {char[] a = {47,36,108,105,110,107}; op[892] = getOpcodeTbs(a);}
        {char[] a = {47,36,100,101,108,101,116,101,100,76,105,110,107}; op[893] = getOpcodeTbs(a);}
        {int[] a = {895,896,897,898,899}; op[894] = getOpcodeCat(a);}
        op[895] = getOpcodeRnm(107, 909); // entitySet
        op[896] = getOpcodeRnm(7, 119); // keyPredicate
        {char[] a = {47}; op[897] = getOpcodeTls(a);}
        op[898] = getOpcodeRnm(113, 980); // contextPropertyPath
        op[899] = getOpcodeRep((char)0, (char)1, 900);
        op[900] = getOpcodeRnm(110, 935); // selectList
        {int[] a = {902,903,905}; op[901] = getOpcodeCat(a);}
        op[902] = getOpcodeRnm(107, 909); // entitySet
        op[903] = getOpcodeRep((char)0, (char)1, 904);
        op[904] = getOpcodeRnm(110, 935); // selectList
        op[905] = getOpcodeRep((char)0, (char)1, 906);
        {int[] a = {907,908}; op[906] = getOpcodeAlt(a);}
        {char[] a = {47,36,101,110,116,105,116,121}; op[907] = getOpcodeTbs(a);}
        {char[] a = {47,36,100,101,108,116,97}; op[908] = getOpcodeTbs(a);}
        {int[] a = {910,911,913}; op[909] = getOpcodeCat(a);}
        op[910] = getOpcodeRnm(238, 1977); // entitySetName
        op[911] = getOpcodeRep((char)0, Character.MAX_VALUE, 912);
        op[912] = getOpcodeRnm(108, 917); // containmentNavigation
        op[913] = getOpcodeRep((char)0, (char)1, 914);
        {int[] a = {915,916}; op[914] = getOpcodeCat(a);}
        {char[] a = {47}; op[915] = getOpcodeTls(a);}
        op[916] = getOpcodeRnm(230, 1942); // qualifiedEntityTypeName
        {int[] a = {918,919,923}; op[917] = getOpcodeCat(a);}
        op[918] = getOpcodeRnm(7, 119); // keyPredicate
        op[919] = getOpcodeRep((char)0, (char)1, 920);
        {int[] a = {921,922}; op[920] = getOpcodeCat(a);}
        {char[] a = {47}; op[921] = getOpcodeTls(a);}
        op[922] = getOpcodeRnm(230, 1942); // qualifiedEntityTypeName
        op[923] = getOpcodeRnm(109, 924); // navigation
        {int[] a = {925,933,934}; op[924] = getOpcodeCat(a);}
        op[925] = getOpcodeRep((char)0, Character.MAX_VALUE, 926);
        {int[] a = {927,928,929}; op[926] = getOpcodeCat(a);}
        {char[] a = {47}; op[927] = getOpcodeTls(a);}
        op[928] = getOpcodeRnm(256, 2037); // complexProperty
        op[929] = getOpcodeRep((char)0, (char)1, 930);
        {int[] a = {931,932}; op[930] = getOpcodeCat(a);}
        {char[] a = {47}; op[931] = getOpcodeTls(a);}
        op[932] = getOpcodeRnm(231, 1946); // qualifiedComplexTypeName
        {char[] a = {47}; op[933] = getOpcodeTls(a);}
        op[934] = getOpcodeRnm(259, 2040); // navigationProperty
        {int[] a = {936,937,944}; op[935] = getOpcodeCat(a);}
        op[936] = getOpcodeRnm(390, 2811); // OPEN
        op[937] = getOpcodeRep((char)0, (char)1, 938);
        {int[] a = {939,940}; op[938] = getOpcodeCat(a);}
        op[939] = getOpcodeRnm(111, 945); // selectListItem
        op[940] = getOpcodeRep((char)0, Character.MAX_VALUE, 941);
        {int[] a = {942,943}; op[941] = getOpcodeCat(a);}
        op[942] = getOpcodeRnm(384, 2794); // COMMA
        op[943] = getOpcodeRnm(111, 945); // selectListItem
        op[944] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {946,947,948}; op[945] = getOpcodeAlt(a);}
        op[946] = getOpcodeRnm(388, 2805); // STAR
        op[947] = getOpcodeRnm(93, 803); // allOperationsInSchema
        {int[] a = {949,955}; op[948] = getOpcodeCat(a);}
        op[949] = getOpcodeRep((char)0, (char)1, 950);
        {int[] a = {951,954}; op[950] = getOpcodeCat(a);}
        {int[] a = {952,953}; op[951] = getOpcodeAlt(a);}
        op[952] = getOpcodeRnm(230, 1942); // qualifiedEntityTypeName
        op[953] = getOpcodeRnm(231, 1946); // qualifiedComplexTypeName
        {char[] a = {47}; op[954] = getOpcodeTls(a);}
        {int[] a = {956,957,958}; op[955] = getOpcodeAlt(a);}
        op[956] = getOpcodeRnm(114, 994); // qualifiedActionName
        op[957] = getOpcodeRnm(115, 998); // qualifiedFunctionName
        op[958] = getOpcodeRnm(112, 959); // selectListProperty
        {int[] a = {960,961,962,968}; op[959] = getOpcodeAlt(a);}
        op[960] = getOpcodeRnm(252, 2031); // primitiveProperty
        op[961] = getOpcodeRnm(255, 2036); // primitiveColProperty
        {int[] a = {963,964,966}; op[962] = getOpcodeCat(a);}
        op[963] = getOpcodeRnm(259, 2040); // navigationProperty
        op[964] = getOpcodeRep((char)0, (char)1, 965);
        {char[] a = {43}; op[965] = getOpcodeTls(a);}
        op[966] = getOpcodeRep((char)0, (char)1, 967);
        op[967] = getOpcodeRnm(110, 935); // selectList
        {int[] a = {969,972,976}; op[968] = getOpcodeCat(a);}
        {int[] a = {970,971}; op[969] = getOpcodeAlt(a);}
        op[970] = getOpcodeRnm(256, 2037); // complexProperty
        op[971] = getOpcodeRnm(257, 2038); // complexColProperty
        op[972] = getOpcodeRep((char)0, (char)1, 973);
        {int[] a = {974,975}; op[973] = getOpcodeCat(a);}
        {char[] a = {47}; op[974] = getOpcodeTls(a);}
        op[975] = getOpcodeRnm(231, 1946); // qualifiedComplexTypeName
        op[976] = getOpcodeRep((char)0, (char)1, 977);
        {int[] a = {978,979}; op[977] = getOpcodeCat(a);}
        {char[] a = {47}; op[978] = getOpcodeTls(a);}
        op[979] = getOpcodeRnm(112, 959); // selectListProperty
        {int[] a = {981,982,983,984}; op[980] = getOpcodeAlt(a);}
        op[981] = getOpcodeRnm(252, 2031); // primitiveProperty
        op[982] = getOpcodeRnm(255, 2036); // primitiveColProperty
        op[983] = getOpcodeRnm(257, 2038); // complexColProperty
        {int[] a = {985,986}; op[984] = getOpcodeCat(a);}
        op[985] = getOpcodeRnm(256, 2037); // complexProperty
        op[986] = getOpcodeRep((char)0, (char)1, 987);
        {int[] a = {988,992,993}; op[987] = getOpcodeCat(a);}
        op[988] = getOpcodeRep((char)0, (char)1, 989);
        {int[] a = {990,991}; op[989] = getOpcodeCat(a);}
        {char[] a = {47}; op[990] = getOpcodeTls(a);}
        op[991] = getOpcodeRnm(231, 1946); // qualifiedComplexTypeName
        {char[] a = {47}; op[992] = getOpcodeTls(a);}
        op[993] = getOpcodeRnm(113, 980); // contextPropertyPath
        {int[] a = {995,996,997}; op[994] = getOpcodeCat(a);}
        op[995] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[996] = getOpcodeTls(a);}
        op[997] = getOpcodeRnm(262, 2045); // action
        {int[] a = {999,1000,1001,1002}; op[998] = getOpcodeCat(a);}
        op[999] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[1000] = getOpcodeTls(a);}
        op[1001] = getOpcodeRnm(264, 2047); // function
        op[1002] = getOpcodeRep((char)0, (char)1, 1003);
        {int[] a = {1004,1005,1006}; op[1003] = getOpcodeCat(a);}
        op[1004] = getOpcodeRnm(390, 2811); // OPEN
        op[1005] = getOpcodeRnm(96, 824); // parameterNames
        op[1006] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1008,1021,1029,1039}; op[1007] = getOpcodeCat(a);}
        {int[] a = {1009,1010,1011,1012,1013,1014,1015,1016,1017,1018,1019,1020}; op[1008] = getOpcodeAlt(a);}
        op[1009] = getOpcodeRnm(277, 2066); // primitiveLiteral
        op[1010] = getOpcodeRnm(198, 1701); // arrayOrObject
        op[1011] = getOpcodeRnm(118, 1044); // rootExpr
        op[1012] = getOpcodeRnm(119, 1053); // firstMemberExpr
        op[1013] = getOpcodeRnm(136, 1193); // functionExpr
        op[1014] = getOpcodeRnm(194, 1667); // negateExpr
        op[1015] = getOpcodeRnm(142, 1270); // methodCallExpr
        op[1016] = getOpcodeRnm(176, 1569); // parenExpr
        op[1017] = getOpcodeRnm(177, 1575); // listExpr
        op[1018] = getOpcodeRnm(197, 1688); // castExpr
        op[1019] = getOpcodeRnm(196, 1675); // isofExpr
        op[1020] = getOpcodeRnm(195, 1671); // notExpr
        op[1021] = getOpcodeRep((char)0, (char)1, 1022);
        {int[] a = {1023,1024,1025,1026,1027,1028}; op[1022] = getOpcodeAlt(a);}
        op[1023] = getOpcodeRnm(188, 1637); // addExpr
        op[1024] = getOpcodeRnm(189, 1642); // subExpr
        op[1025] = getOpcodeRnm(190, 1647); // mulExpr
        op[1026] = getOpcodeRnm(191, 1652); // divExpr
        op[1027] = getOpcodeRnm(192, 1657); // divbyExpr
        op[1028] = getOpcodeRnm(193, 1662); // modExpr
        op[1029] = getOpcodeRep((char)0, (char)1, 1030);
        {int[] a = {1031,1032,1033,1034,1035,1036,1037,1038}; op[1030] = getOpcodeAlt(a);}
        op[1031] = getOpcodeRnm(180, 1597); // eqExpr
        op[1032] = getOpcodeRnm(181, 1602); // neExpr
        op[1033] = getOpcodeRnm(182, 1607); // ltExpr
        op[1034] = getOpcodeRnm(183, 1612); // leExpr
        op[1035] = getOpcodeRnm(184, 1617); // gtExpr
        op[1036] = getOpcodeRnm(185, 1622); // geExpr
        op[1037] = getOpcodeRnm(187, 1632); // hasExpr
        op[1038] = getOpcodeRnm(186, 1627); // inExpr
        op[1039] = getOpcodeRep((char)0, (char)1, 1040);
        {int[] a = {1041,1042}; op[1040] = getOpcodeAlt(a);}
        op[1041] = getOpcodeRnm(178, 1587); // andExpr
        op[1042] = getOpcodeRnm(179, 1592); // orExpr
        op[1043] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1045,1046,1051}; op[1044] = getOpcodeCat(a);}
        {char[] a = {36,114,111,111,116,47}; op[1045] = getOpcodeTbs(a);}
        {int[] a = {1047,1050}; op[1046] = getOpcodeAlt(a);}
        {int[] a = {1048,1049}; op[1047] = getOpcodeCat(a);}
        op[1048] = getOpcodeRnm(238, 1977); // entitySetName
        op[1049] = getOpcodeRnm(7, 119); // keyPredicate
        op[1050] = getOpcodeRnm(239, 1978); // singletonEntity
        op[1051] = getOpcodeRep((char)0, (char)1, 1052);
        op[1052] = getOpcodeRnm(130, 1141); // singleNavigationExpr
        {int[] a = {1054,1055}; op[1053] = getOpcodeAlt(a);}
        op[1054] = getOpcodeRnm(120, 1061); // memberExpr
        {int[] a = {1056,1057}; op[1055] = getOpcodeCat(a);}
        op[1056] = getOpcodeRnm(126, 1122); // inscopeVariableExpr
        op[1057] = getOpcodeRep((char)0, (char)1, 1058);
        {int[] a = {1059,1060}; op[1058] = getOpcodeCat(a);}
        {char[] a = {47}; op[1059] = getOpcodeTls(a);}
        op[1060] = getOpcodeRnm(120, 1061); // memberExpr
        {int[] a = {1062,1063}; op[1061] = getOpcodeAlt(a);}
        op[1062] = getOpcodeRnm(121, 1069); // directMemberExpr
        {int[] a = {1064,1067,1068}; op[1063] = getOpcodeCat(a);}
        {int[] a = {1065,1066}; op[1064] = getOpcodeAlt(a);}
        op[1065] = getOpcodeRnm(234, 1958); // optionallyQualifiedEntityTypeName
        op[1066] = getOpcodeRnm(235, 1964); // optionallyQualifiedComplexTypeName
        {char[] a = {47}; op[1067] = getOpcodeTls(a);}
        op[1068] = getOpcodeRnm(121, 1069); // directMemberExpr
        {int[] a = {1070,1071,1072}; op[1069] = getOpcodeAlt(a);}
        op[1070] = getOpcodeRnm(122, 1073); // propertyPathExpr
        op[1071] = getOpcodeRnm(135, 1192); // boundFunctionExpr
        op[1072] = getOpcodeRnm(123, 1102); // annotationExpr
        {int[] a = {1074,1078,1082,1086,1090,1094,1098}; op[1073] = getOpcodeAlt(a);}
        {int[] a = {1075,1076}; op[1074] = getOpcodeCat(a);}
        op[1075] = getOpcodeRnm(261, 2044); // entityColNavigationProperty
        op[1076] = getOpcodeRep((char)0, (char)1, 1077);
        op[1077] = getOpcodeRnm(129, 1130); // collectionNavigationExpr
        {int[] a = {1079,1080}; op[1078] = getOpcodeCat(a);}
        op[1079] = getOpcodeRnm(260, 2043); // entityNavigationProperty
        op[1080] = getOpcodeRep((char)0, (char)1, 1081);
        op[1081] = getOpcodeRnm(130, 1141); // singleNavigationExpr
        {int[] a = {1083,1084}; op[1082] = getOpcodeCat(a);}
        op[1083] = getOpcodeRnm(257, 2038); // complexColProperty
        op[1084] = getOpcodeRep((char)0, (char)1, 1085);
        op[1085] = getOpcodeRnm(131, 1144); // complexColPathExpr
        {int[] a = {1087,1088}; op[1086] = getOpcodeCat(a);}
        op[1087] = getOpcodeRnm(256, 2037); // complexProperty
        op[1088] = getOpcodeRep((char)0, (char)1, 1089);
        op[1089] = getOpcodeRnm(133, 1175); // complexPathExpr
        {int[] a = {1091,1092}; op[1090] = getOpcodeCat(a);}
        op[1091] = getOpcodeRnm(255, 2036); // primitiveColProperty
        op[1092] = getOpcodeRep((char)0, (char)1, 1093);
        op[1093] = getOpcodeRnm(132, 1151); // collectionPathExpr
        {int[] a = {1095,1096}; op[1094] = getOpcodeCat(a);}
        op[1095] = getOpcodeRnm(252, 2031); // primitiveProperty
        op[1096] = getOpcodeRep((char)0, (char)1, 1097);
        op[1097] = getOpcodeRnm(134, 1186); // primitivePathExpr
        {int[] a = {1099,1100}; op[1098] = getOpcodeCat(a);}
        op[1099] = getOpcodeRnm(258, 2039); // streamProperty
        op[1100] = getOpcodeRep((char)0, (char)1, 1101);
        op[1101] = getOpcodeRnm(134, 1186); // primitivePathExpr
        {int[] a = {1103,1104}; op[1102] = getOpcodeCat(a);}
        op[1103] = getOpcodeRnm(124, 1110); // annotation
        op[1104] = getOpcodeRep((char)0, (char)1, 1105);
        {int[] a = {1106,1107,1108,1109}; op[1105] = getOpcodeAlt(a);}
        op[1106] = getOpcodeRnm(132, 1151); // collectionPathExpr
        op[1107] = getOpcodeRnm(130, 1141); // singleNavigationExpr
        op[1108] = getOpcodeRnm(133, 1175); // complexPathExpr
        op[1109] = getOpcodeRnm(134, 1186); // primitivePathExpr
        {int[] a = {1111,1112,1116,1117}; op[1110] = getOpcodeCat(a);}
        op[1111] = getOpcodeRnm(382, 2788); // AT
        op[1112] = getOpcodeRep((char)0, (char)1, 1113);
        {int[] a = {1114,1115}; op[1113] = getOpcodeCat(a);}
        op[1114] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[1115] = getOpcodeTls(a);}
        op[1116] = getOpcodeRnm(245, 1984); // termName
        op[1117] = getOpcodeRep((char)0, (char)1, 1118);
        {int[] a = {1119,1120}; op[1118] = getOpcodeCat(a);}
        {char[] a = {35}; op[1119] = getOpcodeTbs(a);}
        op[1120] = getOpcodeRnm(125, 1121); // annotationQualifier
        op[1121] = getOpcodeRnm(246, 1985); // odataIdentifier
        {int[] a = {1123,1124,1125}; op[1122] = getOpcodeAlt(a);}
        op[1123] = getOpcodeRnm(127, 1126); // implicitVariableExpr
        op[1124] = getOpcodeRnm(47, 393); // parameterAlias
        op[1125] = getOpcodeRnm(128, 1129); // lambdaVariableExpr
        {int[] a = {1127,1128}; op[1126] = getOpcodeAlt(a);}
        {char[] a = {36,105,116}; op[1127] = getOpcodeTbs(a);}
        {char[] a = {36,116,104,105,115}; op[1128] = getOpcodeTbs(a);}
        op[1129] = getOpcodeRnm(246, 1985); // odataIdentifier
        {int[] a = {1131,1135}; op[1130] = getOpcodeCat(a);}
        op[1131] = getOpcodeRep((char)0, (char)1, 1132);
        {int[] a = {1133,1134}; op[1132] = getOpcodeCat(a);}
        {char[] a = {47}; op[1133] = getOpcodeTls(a);}
        op[1134] = getOpcodeRnm(234, 1958); // optionallyQualifiedEntityTypeName
        {int[] a = {1136,1137}; op[1135] = getOpcodeAlt(a);}
        op[1136] = getOpcodeRnm(132, 1151); // collectionPathExpr
        {int[] a = {1138,1139}; op[1137] = getOpcodeCat(a);}
        op[1138] = getOpcodeRnm(7, 119); // keyPredicate
        op[1139] = getOpcodeRep((char)0, (char)1, 1140);
        op[1140] = getOpcodeRnm(130, 1141); // singleNavigationExpr
        {int[] a = {1142,1143}; op[1141] = getOpcodeCat(a);}
        {char[] a = {47}; op[1142] = getOpcodeTls(a);}
        op[1143] = getOpcodeRnm(120, 1061); // memberExpr
        {int[] a = {1145,1146}; op[1144] = getOpcodeAlt(a);}
        op[1145] = getOpcodeRnm(132, 1151); // collectionPathExpr
        {int[] a = {1147,1148,1149}; op[1146] = getOpcodeCat(a);}
        {char[] a = {47}; op[1147] = getOpcodeTls(a);}
        op[1148] = getOpcodeRnm(235, 1964); // optionallyQualifiedComplexTypeName
        op[1149] = getOpcodeRep((char)0, (char)1, 1150);
        op[1150] = getOpcodeRnm(132, 1151); // collectionPathExpr
        {int[] a = {1152,1163,1166,1169,1172}; op[1151] = getOpcodeAlt(a);}
        {int[] a = {1153,1154}; op[1152] = getOpcodeCat(a);}
        op[1153] = getOpcodeRnm(23, 229); // count
        op[1154] = getOpcodeRep((char)0, (char)1, 1155);
        {int[] a = {1156,1157,1158,1162}; op[1155] = getOpcodeCat(a);}
        op[1156] = getOpcodeRnm(390, 2811); // OPEN
        op[1157] = getOpcodeRnm(67, 574); // expandCountOption
        op[1158] = getOpcodeRep((char)0, Character.MAX_VALUE, 1159);
        {int[] a = {1160,1161}; op[1159] = getOpcodeCat(a);}
        op[1160] = getOpcodeRnm(387, 2802); // SEMI
        op[1161] = getOpcodeRnm(67, 574); // expandCountOption
        op[1162] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1164,1165}; op[1163] = getOpcodeCat(a);}
        {char[] a = {47}; op[1164] = getOpcodeTls(a);}
        op[1165] = getOpcodeRnm(139, 1245); // anyExpr
        {int[] a = {1167,1168}; op[1166] = getOpcodeCat(a);}
        {char[] a = {47}; op[1167] = getOpcodeTls(a);}
        op[1168] = getOpcodeRnm(140, 1258); // allExpr
        {int[] a = {1170,1171}; op[1169] = getOpcodeCat(a);}
        {char[] a = {47}; op[1170] = getOpcodeTls(a);}
        op[1171] = getOpcodeRnm(135, 1192); // boundFunctionExpr
        {int[] a = {1173,1174}; op[1172] = getOpcodeCat(a);}
        {char[] a = {47}; op[1173] = getOpcodeTls(a);}
        op[1174] = getOpcodeRnm(123, 1102); // annotationExpr
        {int[] a = {1176,1179}; op[1175] = getOpcodeAlt(a);}
        {int[] a = {1177,1178}; op[1176] = getOpcodeCat(a);}
        {char[] a = {47}; op[1177] = getOpcodeTls(a);}
        op[1178] = getOpcodeRnm(121, 1069); // directMemberExpr
        {int[] a = {1180,1181,1182}; op[1179] = getOpcodeCat(a);}
        {char[] a = {47}; op[1180] = getOpcodeTls(a);}
        op[1181] = getOpcodeRnm(235, 1964); // optionallyQualifiedComplexTypeName
        op[1182] = getOpcodeRep((char)0, (char)1, 1183);
        {int[] a = {1184,1185}; op[1183] = getOpcodeCat(a);}
        {char[] a = {47}; op[1184] = getOpcodeTls(a);}
        op[1185] = getOpcodeRnm(121, 1069); // directMemberExpr
        {int[] a = {1187,1188}; op[1186] = getOpcodeCat(a);}
        {char[] a = {47}; op[1187] = getOpcodeTls(a);}
        op[1188] = getOpcodeRep((char)0, (char)1, 1189);
        {int[] a = {1190,1191}; op[1189] = getOpcodeAlt(a);}
        op[1190] = getOpcodeRnm(123, 1102); // annotationExpr
        op[1191] = getOpcodeRnm(135, 1192); // boundFunctionExpr
        op[1192] = getOpcodeRnm(136, 1193); // functionExpr
        {int[] a = {1194,1198}; op[1193] = getOpcodeCat(a);}
        op[1194] = getOpcodeRep((char)0, (char)1, 1195);
        {int[] a = {1196,1197}; op[1195] = getOpcodeCat(a);}
        op[1196] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[1197] = getOpcodeTls(a);}
        {int[] a = {1199,1204,1209,1214,1219,1224}; op[1198] = getOpcodeAlt(a);}
        {int[] a = {1200,1201,1202}; op[1199] = getOpcodeCat(a);}
        op[1200] = getOpcodeRnm(266, 2055); // entityColFunction
        op[1201] = getOpcodeRnm(137, 1229); // functionExprParameters
        op[1202] = getOpcodeRep((char)0, (char)1, 1203);
        op[1203] = getOpcodeRnm(129, 1130); // collectionNavigationExpr
        {int[] a = {1205,1206,1207}; op[1204] = getOpcodeCat(a);}
        op[1205] = getOpcodeRnm(265, 2054); // entityFunction
        op[1206] = getOpcodeRnm(137, 1229); // functionExprParameters
        op[1207] = getOpcodeRep((char)0, (char)1, 1208);
        op[1208] = getOpcodeRnm(130, 1141); // singleNavigationExpr
        {int[] a = {1210,1211,1212}; op[1209] = getOpcodeCat(a);}
        op[1210] = getOpcodeRnm(268, 2057); // complexColFunction
        op[1211] = getOpcodeRnm(137, 1229); // functionExprParameters
        op[1212] = getOpcodeRep((char)0, (char)1, 1213);
        op[1213] = getOpcodeRnm(131, 1144); // complexColPathExpr
        {int[] a = {1215,1216,1217}; op[1214] = getOpcodeCat(a);}
        op[1215] = getOpcodeRnm(267, 2056); // complexFunction
        op[1216] = getOpcodeRnm(137, 1229); // functionExprParameters
        op[1217] = getOpcodeRep((char)0, (char)1, 1218);
        op[1218] = getOpcodeRnm(133, 1175); // complexPathExpr
        {int[] a = {1220,1221,1222}; op[1219] = getOpcodeCat(a);}
        op[1220] = getOpcodeRnm(270, 2059); // primitiveColFunction
        op[1221] = getOpcodeRnm(137, 1229); // functionExprParameters
        op[1222] = getOpcodeRep((char)0, (char)1, 1223);
        op[1223] = getOpcodeRnm(132, 1151); // collectionPathExpr
        {int[] a = {1225,1226,1227}; op[1224] = getOpcodeCat(a);}
        op[1225] = getOpcodeRnm(269, 2058); // primitiveFunction
        op[1226] = getOpcodeRnm(137, 1229); // functionExprParameters
        op[1227] = getOpcodeRep((char)0, (char)1, 1228);
        op[1228] = getOpcodeRnm(134, 1186); // primitivePathExpr
        {int[] a = {1230,1231,1238}; op[1229] = getOpcodeCat(a);}
        op[1230] = getOpcodeRnm(390, 2811); // OPEN
        op[1231] = getOpcodeRep((char)0, (char)1, 1232);
        {int[] a = {1233,1234}; op[1232] = getOpcodeCat(a);}
        op[1233] = getOpcodeRnm(138, 1239); // functionExprParameter
        op[1234] = getOpcodeRep((char)0, Character.MAX_VALUE, 1235);
        {int[] a = {1236,1237}; op[1235] = getOpcodeCat(a);}
        op[1236] = getOpcodeRnm(384, 2794); // COMMA
        op[1237] = getOpcodeRnm(138, 1239); // functionExprParameter
        op[1238] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1240,1241,1242}; op[1239] = getOpcodeCat(a);}
        op[1240] = getOpcodeRnm(46, 392); // parameterName
        op[1241] = getOpcodeRnm(385, 2797); // EQ
        {int[] a = {1243,1244}; op[1242] = getOpcodeAlt(a);}
        op[1243] = getOpcodeRnm(47, 393); // parameterAlias
        op[1244] = getOpcodeRnm(101, 848); // parameterValue
        {int[] a = {1246,1247,1248,1249,1256,1257}; op[1245] = getOpcodeCat(a);}
        {char[] a = {97,110,121}; op[1246] = getOpcodeTls(a);}
        op[1247] = getOpcodeRnm(390, 2811); // OPEN
        op[1248] = getOpcodeRnm(381, 2782); // BWS
        op[1249] = getOpcodeRep((char)0, (char)1, 1250);
        {int[] a = {1251,1252,1253,1254,1255}; op[1250] = getOpcodeCat(a);}
        op[1251] = getOpcodeRnm(128, 1129); // lambdaVariableExpr
        op[1252] = getOpcodeRnm(381, 2782); // BWS
        op[1253] = getOpcodeRnm(383, 2791); // COLON
        op[1254] = getOpcodeRnm(381, 2782); // BWS
        op[1255] = getOpcodeRnm(141, 1269); // lambdaPredicateExpr
        op[1256] = getOpcodeRnm(381, 2782); // BWS
        op[1257] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1259,1260,1261,1262,1263,1264,1265,1266,1267,1268}; op[1258] = getOpcodeCat(a);}
        {char[] a = {97,108,108}; op[1259] = getOpcodeTls(a);}
        op[1260] = getOpcodeRnm(390, 2811); // OPEN
        op[1261] = getOpcodeRnm(381, 2782); // BWS
        op[1262] = getOpcodeRnm(128, 1129); // lambdaVariableExpr
        op[1263] = getOpcodeRnm(381, 2782); // BWS
        op[1264] = getOpcodeRnm(383, 2791); // COLON
        op[1265] = getOpcodeRnm(381, 2782); // BWS
        op[1266] = getOpcodeRnm(141, 1269); // lambdaPredicateExpr
        op[1267] = getOpcodeRnm(381, 2782); // BWS
        op[1268] = getOpcodeRnm(391, 2814); // CLOSE
        op[1269] = getOpcodeRnm(117, 1043); // boolCommonExpr
        {int[] a = {1271,1272,1273,1274,1275,1276,1277,1278,1279,1280,1281,1282,1283,1284,1285,1286,1287,1288,1289,1290,1291,1292,1293,1294,1295,1296,1297}; op[1270] = getOpcodeAlt(a);}
        op[1271] = getOpcodeRnm(147, 1338); // indexOfMethodCallExpr
        op[1272] = getOpcodeRnm(151, 1384); // toLowerMethodCallExpr
        op[1273] = getOpcodeRnm(152, 1391); // toUpperMethodCallExpr
        op[1274] = getOpcodeRnm(153, 1398); // trimMethodCallExpr
        op[1275] = getOpcodeRnm(150, 1367); // substringMethodCallExpr
        op[1276] = getOpcodeRnm(144, 1305); // concatMethodCallExpr
        op[1277] = getOpcodeRnm(148, 1349); // lengthMethodCallExpr
        op[1278] = getOpcodeRnm(154, 1405); // yearMethodCallExpr
        op[1279] = getOpcodeRnm(155, 1412); // monthMethodCallExpr
        op[1280] = getOpcodeRnm(156, 1419); // dayMethodCallExpr
        op[1281] = getOpcodeRnm(157, 1426); // hourMethodCallExpr
        op[1282] = getOpcodeRnm(158, 1433); // minuteMethodCallExpr
        op[1283] = getOpcodeRnm(159, 1440); // secondMethodCallExpr
        op[1284] = getOpcodeRnm(160, 1447); // fractionalsecondsMethodCallExpr
        op[1285] = getOpcodeRnm(161, 1454); // totalsecondsMethodCallExpr
        op[1286] = getOpcodeRnm(162, 1461); // dateMethodCallExpr
        op[1287] = getOpcodeRnm(163, 1468); // timeMethodCallExpr
        op[1288] = getOpcodeRnm(168, 1497); // roundMethodCallExpr
        op[1289] = getOpcodeRnm(169, 1504); // floorMethodCallExpr
        op[1290] = getOpcodeRnm(170, 1511); // ceilingMethodCallExpr
        op[1291] = getOpcodeRnm(171, 1518); // distanceMethodCallExpr
        op[1292] = getOpcodeRnm(172, 1529); // geoLengthMethodCallExpr
        op[1293] = getOpcodeRnm(164, 1475); // totalOffsetMinutesMethodCallExpr
        op[1294] = getOpcodeRnm(165, 1482); // minDateTimeMethodCallExpr
        op[1295] = getOpcodeRnm(166, 1487); // maxDateTimeMethodCallExpr
        op[1296] = getOpcodeRnm(167, 1492); // nowMethodCallExpr
        op[1297] = getOpcodeRnm(143, 1298); // boolMethodCallExpr
        {int[] a = {1299,1300,1301,1302,1303,1304}; op[1298] = getOpcodeAlt(a);}
        op[1299] = getOpcodeRnm(146, 1327); // endsWithMethodCallExpr
        op[1300] = getOpcodeRnm(149, 1356); // startsWithMethodCallExpr
        op[1301] = getOpcodeRnm(145, 1316); // containsMethodCallExpr
        op[1302] = getOpcodeRnm(173, 1536); // intersectsMethodCallExpr
        op[1303] = getOpcodeRnm(174, 1547); // hasSubsetMethodCallExpr
        op[1304] = getOpcodeRnm(175, 1558); // hasSubsequenceMethodCallExpr
        {int[] a = {1306,1307,1308,1309,1310,1311,1312,1313,1314,1315}; op[1305] = getOpcodeCat(a);}
        {char[] a = {99,111,110,99,97,116}; op[1306] = getOpcodeTls(a);}
        op[1307] = getOpcodeRnm(390, 2811); // OPEN
        op[1308] = getOpcodeRnm(381, 2782); // BWS
        op[1309] = getOpcodeRnm(116, 1007); // commonExpr
        op[1310] = getOpcodeRnm(381, 2782); // BWS
        op[1311] = getOpcodeRnm(384, 2794); // COMMA
        op[1312] = getOpcodeRnm(381, 2782); // BWS
        op[1313] = getOpcodeRnm(116, 1007); // commonExpr
        op[1314] = getOpcodeRnm(381, 2782); // BWS
        op[1315] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1317,1318,1319,1320,1321,1322,1323,1324,1325,1326}; op[1316] = getOpcodeCat(a);}
        {char[] a = {99,111,110,116,97,105,110,115}; op[1317] = getOpcodeTls(a);}
        op[1318] = getOpcodeRnm(390, 2811); // OPEN
        op[1319] = getOpcodeRnm(381, 2782); // BWS
        op[1320] = getOpcodeRnm(116, 1007); // commonExpr
        op[1321] = getOpcodeRnm(381, 2782); // BWS
        op[1322] = getOpcodeRnm(384, 2794); // COMMA
        op[1323] = getOpcodeRnm(381, 2782); // BWS
        op[1324] = getOpcodeRnm(116, 1007); // commonExpr
        op[1325] = getOpcodeRnm(381, 2782); // BWS
        op[1326] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1328,1329,1330,1331,1332,1333,1334,1335,1336,1337}; op[1327] = getOpcodeCat(a);}
        {char[] a = {101,110,100,115,119,105,116,104}; op[1328] = getOpcodeTls(a);}
        op[1329] = getOpcodeRnm(390, 2811); // OPEN
        op[1330] = getOpcodeRnm(381, 2782); // BWS
        op[1331] = getOpcodeRnm(116, 1007); // commonExpr
        op[1332] = getOpcodeRnm(381, 2782); // BWS
        op[1333] = getOpcodeRnm(384, 2794); // COMMA
        op[1334] = getOpcodeRnm(381, 2782); // BWS
        op[1335] = getOpcodeRnm(116, 1007); // commonExpr
        op[1336] = getOpcodeRnm(381, 2782); // BWS
        op[1337] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1339,1340,1341,1342,1343,1344,1345,1346,1347,1348}; op[1338] = getOpcodeCat(a);}
        {char[] a = {105,110,100,101,120,111,102}; op[1339] = getOpcodeTls(a);}
        op[1340] = getOpcodeRnm(390, 2811); // OPEN
        op[1341] = getOpcodeRnm(381, 2782); // BWS
        op[1342] = getOpcodeRnm(116, 1007); // commonExpr
        op[1343] = getOpcodeRnm(381, 2782); // BWS
        op[1344] = getOpcodeRnm(384, 2794); // COMMA
        op[1345] = getOpcodeRnm(381, 2782); // BWS
        op[1346] = getOpcodeRnm(116, 1007); // commonExpr
        op[1347] = getOpcodeRnm(381, 2782); // BWS
        op[1348] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1350,1351,1352,1353,1354,1355}; op[1349] = getOpcodeCat(a);}
        {char[] a = {108,101,110,103,116,104}; op[1350] = getOpcodeTls(a);}
        op[1351] = getOpcodeRnm(390, 2811); // OPEN
        op[1352] = getOpcodeRnm(381, 2782); // BWS
        op[1353] = getOpcodeRnm(116, 1007); // commonExpr
        op[1354] = getOpcodeRnm(381, 2782); // BWS
        op[1355] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1357,1358,1359,1360,1361,1362,1363,1364,1365,1366}; op[1356] = getOpcodeCat(a);}
        {char[] a = {115,116,97,114,116,115,119,105,116,104}; op[1357] = getOpcodeTls(a);}
        op[1358] = getOpcodeRnm(390, 2811); // OPEN
        op[1359] = getOpcodeRnm(381, 2782); // BWS
        op[1360] = getOpcodeRnm(116, 1007); // commonExpr
        op[1361] = getOpcodeRnm(381, 2782); // BWS
        op[1362] = getOpcodeRnm(384, 2794); // COMMA
        op[1363] = getOpcodeRnm(381, 2782); // BWS
        op[1364] = getOpcodeRnm(116, 1007); // commonExpr
        op[1365] = getOpcodeRnm(381, 2782); // BWS
        op[1366] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1368,1369,1370,1371,1372,1373,1374,1375,1376,1377,1383}; op[1367] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103}; op[1368] = getOpcodeTls(a);}
        op[1369] = getOpcodeRnm(390, 2811); // OPEN
        op[1370] = getOpcodeRnm(381, 2782); // BWS
        op[1371] = getOpcodeRnm(116, 1007); // commonExpr
        op[1372] = getOpcodeRnm(381, 2782); // BWS
        op[1373] = getOpcodeRnm(384, 2794); // COMMA
        op[1374] = getOpcodeRnm(381, 2782); // BWS
        op[1375] = getOpcodeRnm(116, 1007); // commonExpr
        op[1376] = getOpcodeRnm(381, 2782); // BWS
        op[1377] = getOpcodeRep((char)0, (char)1, 1378);
        {int[] a = {1379,1380,1381,1382}; op[1378] = getOpcodeCat(a);}
        op[1379] = getOpcodeRnm(384, 2794); // COMMA
        op[1380] = getOpcodeRnm(381, 2782); // BWS
        op[1381] = getOpcodeRnm(116, 1007); // commonExpr
        op[1382] = getOpcodeRnm(381, 2782); // BWS
        op[1383] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1385,1386,1387,1388,1389,1390}; op[1384] = getOpcodeCat(a);}
        {char[] a = {116,111,108,111,119,101,114}; op[1385] = getOpcodeTls(a);}
        op[1386] = getOpcodeRnm(390, 2811); // OPEN
        op[1387] = getOpcodeRnm(381, 2782); // BWS
        op[1388] = getOpcodeRnm(116, 1007); // commonExpr
        op[1389] = getOpcodeRnm(381, 2782); // BWS
        op[1390] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1392,1393,1394,1395,1396,1397}; op[1391] = getOpcodeCat(a);}
        {char[] a = {116,111,117,112,112,101,114}; op[1392] = getOpcodeTls(a);}
        op[1393] = getOpcodeRnm(390, 2811); // OPEN
        op[1394] = getOpcodeRnm(381, 2782); // BWS
        op[1395] = getOpcodeRnm(116, 1007); // commonExpr
        op[1396] = getOpcodeRnm(381, 2782); // BWS
        op[1397] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1399,1400,1401,1402,1403,1404}; op[1398] = getOpcodeCat(a);}
        {char[] a = {116,114,105,109}; op[1399] = getOpcodeTls(a);}
        op[1400] = getOpcodeRnm(390, 2811); // OPEN
        op[1401] = getOpcodeRnm(381, 2782); // BWS
        op[1402] = getOpcodeRnm(116, 1007); // commonExpr
        op[1403] = getOpcodeRnm(381, 2782); // BWS
        op[1404] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1406,1407,1408,1409,1410,1411}; op[1405] = getOpcodeCat(a);}
        {char[] a = {121,101,97,114}; op[1406] = getOpcodeTls(a);}
        op[1407] = getOpcodeRnm(390, 2811); // OPEN
        op[1408] = getOpcodeRnm(381, 2782); // BWS
        op[1409] = getOpcodeRnm(116, 1007); // commonExpr
        op[1410] = getOpcodeRnm(381, 2782); // BWS
        op[1411] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1413,1414,1415,1416,1417,1418}; op[1412] = getOpcodeCat(a);}
        {char[] a = {109,111,110,116,104}; op[1413] = getOpcodeTls(a);}
        op[1414] = getOpcodeRnm(390, 2811); // OPEN
        op[1415] = getOpcodeRnm(381, 2782); // BWS
        op[1416] = getOpcodeRnm(116, 1007); // commonExpr
        op[1417] = getOpcodeRnm(381, 2782); // BWS
        op[1418] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1420,1421,1422,1423,1424,1425}; op[1419] = getOpcodeCat(a);}
        {char[] a = {100,97,121}; op[1420] = getOpcodeTls(a);}
        op[1421] = getOpcodeRnm(390, 2811); // OPEN
        op[1422] = getOpcodeRnm(381, 2782); // BWS
        op[1423] = getOpcodeRnm(116, 1007); // commonExpr
        op[1424] = getOpcodeRnm(381, 2782); // BWS
        op[1425] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1427,1428,1429,1430,1431,1432}; op[1426] = getOpcodeCat(a);}
        {char[] a = {104,111,117,114}; op[1427] = getOpcodeTls(a);}
        op[1428] = getOpcodeRnm(390, 2811); // OPEN
        op[1429] = getOpcodeRnm(381, 2782); // BWS
        op[1430] = getOpcodeRnm(116, 1007); // commonExpr
        op[1431] = getOpcodeRnm(381, 2782); // BWS
        op[1432] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1434,1435,1436,1437,1438,1439}; op[1433] = getOpcodeCat(a);}
        {char[] a = {109,105,110,117,116,101}; op[1434] = getOpcodeTls(a);}
        op[1435] = getOpcodeRnm(390, 2811); // OPEN
        op[1436] = getOpcodeRnm(381, 2782); // BWS
        op[1437] = getOpcodeRnm(116, 1007); // commonExpr
        op[1438] = getOpcodeRnm(381, 2782); // BWS
        op[1439] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1441,1442,1443,1444,1445,1446}; op[1440] = getOpcodeCat(a);}
        {char[] a = {115,101,99,111,110,100}; op[1441] = getOpcodeTls(a);}
        op[1442] = getOpcodeRnm(390, 2811); // OPEN
        op[1443] = getOpcodeRnm(381, 2782); // BWS
        op[1444] = getOpcodeRnm(116, 1007); // commonExpr
        op[1445] = getOpcodeRnm(381, 2782); // BWS
        op[1446] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1448,1449,1450,1451,1452,1453}; op[1447] = getOpcodeCat(a);}
        {char[] a = {102,114,97,99,116,105,111,110,97,108,115,101,99,111,110,100,115}; op[1448] = getOpcodeTls(a);}
        op[1449] = getOpcodeRnm(390, 2811); // OPEN
        op[1450] = getOpcodeRnm(381, 2782); // BWS
        op[1451] = getOpcodeRnm(116, 1007); // commonExpr
        op[1452] = getOpcodeRnm(381, 2782); // BWS
        op[1453] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1455,1456,1457,1458,1459,1460}; op[1454] = getOpcodeCat(a);}
        {char[] a = {116,111,116,97,108,115,101,99,111,110,100,115}; op[1455] = getOpcodeTls(a);}
        op[1456] = getOpcodeRnm(390, 2811); // OPEN
        op[1457] = getOpcodeRnm(381, 2782); // BWS
        op[1458] = getOpcodeRnm(116, 1007); // commonExpr
        op[1459] = getOpcodeRnm(381, 2782); // BWS
        op[1460] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1462,1463,1464,1465,1466,1467}; op[1461] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101}; op[1462] = getOpcodeTls(a);}
        op[1463] = getOpcodeRnm(390, 2811); // OPEN
        op[1464] = getOpcodeRnm(381, 2782); // BWS
        op[1465] = getOpcodeRnm(116, 1007); // commonExpr
        op[1466] = getOpcodeRnm(381, 2782); // BWS
        op[1467] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1469,1470,1471,1472,1473,1474}; op[1468] = getOpcodeCat(a);}
        {char[] a = {116,105,109,101}; op[1469] = getOpcodeTls(a);}
        op[1470] = getOpcodeRnm(390, 2811); // OPEN
        op[1471] = getOpcodeRnm(381, 2782); // BWS
        op[1472] = getOpcodeRnm(116, 1007); // commonExpr
        op[1473] = getOpcodeRnm(381, 2782); // BWS
        op[1474] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1476,1477,1478,1479,1480,1481}; op[1475] = getOpcodeCat(a);}
        {char[] a = {116,111,116,97,108,111,102,102,115,101,116,109,105,110,117,116,101,115}; op[1476] = getOpcodeTls(a);}
        op[1477] = getOpcodeRnm(390, 2811); // OPEN
        op[1478] = getOpcodeRnm(381, 2782); // BWS
        op[1479] = getOpcodeRnm(116, 1007); // commonExpr
        op[1480] = getOpcodeRnm(381, 2782); // BWS
        op[1481] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1483,1484,1485,1486}; op[1482] = getOpcodeCat(a);}
        {char[] a = {109,105,110,100,97,116,101,116,105,109,101}; op[1483] = getOpcodeTls(a);}
        op[1484] = getOpcodeRnm(390, 2811); // OPEN
        op[1485] = getOpcodeRnm(381, 2782); // BWS
        op[1486] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1488,1489,1490,1491}; op[1487] = getOpcodeCat(a);}
        {char[] a = {109,97,120,100,97,116,101,116,105,109,101}; op[1488] = getOpcodeTls(a);}
        op[1489] = getOpcodeRnm(390, 2811); // OPEN
        op[1490] = getOpcodeRnm(381, 2782); // BWS
        op[1491] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1493,1494,1495,1496}; op[1492] = getOpcodeCat(a);}
        {char[] a = {110,111,119}; op[1493] = getOpcodeTls(a);}
        op[1494] = getOpcodeRnm(390, 2811); // OPEN
        op[1495] = getOpcodeRnm(381, 2782); // BWS
        op[1496] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1498,1499,1500,1501,1502,1503}; op[1497] = getOpcodeCat(a);}
        {char[] a = {114,111,117,110,100}; op[1498] = getOpcodeTls(a);}
        op[1499] = getOpcodeRnm(390, 2811); // OPEN
        op[1500] = getOpcodeRnm(381, 2782); // BWS
        op[1501] = getOpcodeRnm(116, 1007); // commonExpr
        op[1502] = getOpcodeRnm(381, 2782); // BWS
        op[1503] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1505,1506,1507,1508,1509,1510}; op[1504] = getOpcodeCat(a);}
        {char[] a = {102,108,111,111,114}; op[1505] = getOpcodeTls(a);}
        op[1506] = getOpcodeRnm(390, 2811); // OPEN
        op[1507] = getOpcodeRnm(381, 2782); // BWS
        op[1508] = getOpcodeRnm(116, 1007); // commonExpr
        op[1509] = getOpcodeRnm(381, 2782); // BWS
        op[1510] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1512,1513,1514,1515,1516,1517}; op[1511] = getOpcodeCat(a);}
        {char[] a = {99,101,105,108,105,110,103}; op[1512] = getOpcodeTls(a);}
        op[1513] = getOpcodeRnm(390, 2811); // OPEN
        op[1514] = getOpcodeRnm(381, 2782); // BWS
        op[1515] = getOpcodeRnm(116, 1007); // commonExpr
        op[1516] = getOpcodeRnm(381, 2782); // BWS
        op[1517] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1519,1520,1521,1522,1523,1524,1525,1526,1527,1528}; op[1518] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,100,105,115,116,97,110,99,101}; op[1519] = getOpcodeTls(a);}
        op[1520] = getOpcodeRnm(390, 2811); // OPEN
        op[1521] = getOpcodeRnm(381, 2782); // BWS
        op[1522] = getOpcodeRnm(116, 1007); // commonExpr
        op[1523] = getOpcodeRnm(381, 2782); // BWS
        op[1524] = getOpcodeRnm(384, 2794); // COMMA
        op[1525] = getOpcodeRnm(381, 2782); // BWS
        op[1526] = getOpcodeRnm(116, 1007); // commonExpr
        op[1527] = getOpcodeRnm(381, 2782); // BWS
        op[1528] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1530,1531,1532,1533,1534,1535}; op[1529] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,108,101,110,103,116,104}; op[1530] = getOpcodeTls(a);}
        op[1531] = getOpcodeRnm(390, 2811); // OPEN
        op[1532] = getOpcodeRnm(381, 2782); // BWS
        op[1533] = getOpcodeRnm(116, 1007); // commonExpr
        op[1534] = getOpcodeRnm(381, 2782); // BWS
        op[1535] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1537,1538,1539,1540,1541,1542,1543,1544,1545,1546}; op[1536] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,105,110,116,101,114,115,101,99,116,115}; op[1537] = getOpcodeTls(a);}
        op[1538] = getOpcodeRnm(390, 2811); // OPEN
        op[1539] = getOpcodeRnm(381, 2782); // BWS
        op[1540] = getOpcodeRnm(116, 1007); // commonExpr
        op[1541] = getOpcodeRnm(381, 2782); // BWS
        op[1542] = getOpcodeRnm(384, 2794); // COMMA
        op[1543] = getOpcodeRnm(381, 2782); // BWS
        op[1544] = getOpcodeRnm(116, 1007); // commonExpr
        op[1545] = getOpcodeRnm(381, 2782); // BWS
        op[1546] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1548,1549,1550,1551,1552,1553,1554,1555,1556,1557}; op[1547] = getOpcodeCat(a);}
        {char[] a = {104,97,115,115,117,98,115,101,116}; op[1548] = getOpcodeTls(a);}
        op[1549] = getOpcodeRnm(390, 2811); // OPEN
        op[1550] = getOpcodeRnm(381, 2782); // BWS
        op[1551] = getOpcodeRnm(116, 1007); // commonExpr
        op[1552] = getOpcodeRnm(381, 2782); // BWS
        op[1553] = getOpcodeRnm(384, 2794); // COMMA
        op[1554] = getOpcodeRnm(381, 2782); // BWS
        op[1555] = getOpcodeRnm(116, 1007); // commonExpr
        op[1556] = getOpcodeRnm(381, 2782); // BWS
        op[1557] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1559,1560,1561,1562,1563,1564,1565,1566,1567,1568}; op[1558] = getOpcodeCat(a);}
        {char[] a = {104,97,115,115,117,98,115,101,113,117,101,110,99,101}; op[1559] = getOpcodeTls(a);}
        op[1560] = getOpcodeRnm(390, 2811); // OPEN
        op[1561] = getOpcodeRnm(381, 2782); // BWS
        op[1562] = getOpcodeRnm(116, 1007); // commonExpr
        op[1563] = getOpcodeRnm(381, 2782); // BWS
        op[1564] = getOpcodeRnm(384, 2794); // COMMA
        op[1565] = getOpcodeRnm(381, 2782); // BWS
        op[1566] = getOpcodeRnm(116, 1007); // commonExpr
        op[1567] = getOpcodeRnm(381, 2782); // BWS
        op[1568] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1570,1571,1572,1573,1574}; op[1569] = getOpcodeCat(a);}
        op[1570] = getOpcodeRnm(390, 2811); // OPEN
        op[1571] = getOpcodeRnm(381, 2782); // BWS
        op[1572] = getOpcodeRnm(116, 1007); // commonExpr
        op[1573] = getOpcodeRnm(381, 2782); // BWS
        op[1574] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1576,1577,1578,1579,1580,1586}; op[1575] = getOpcodeCat(a);}
        op[1576] = getOpcodeRnm(390, 2811); // OPEN
        op[1577] = getOpcodeRnm(381, 2782); // BWS
        op[1578] = getOpcodeRnm(116, 1007); // commonExpr
        op[1579] = getOpcodeRnm(381, 2782); // BWS
        op[1580] = getOpcodeRep((char)0, Character.MAX_VALUE, 1581);
        {int[] a = {1582,1583,1584,1585}; op[1581] = getOpcodeCat(a);}
        op[1582] = getOpcodeRnm(384, 2794); // COMMA
        op[1583] = getOpcodeRnm(381, 2782); // BWS
        op[1584] = getOpcodeRnm(116, 1007); // commonExpr
        op[1585] = getOpcodeRnm(381, 2782); // BWS
        op[1586] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1588,1589,1590,1591}; op[1587] = getOpcodeCat(a);}
        op[1588] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {97,110,100}; op[1589] = getOpcodeTls(a);}
        op[1590] = getOpcodeRnm(380, 2776); // RWS
        op[1591] = getOpcodeRnm(117, 1043); // boolCommonExpr
        {int[] a = {1593,1594,1595,1596}; op[1592] = getOpcodeCat(a);}
        op[1593] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {111,114}; op[1594] = getOpcodeTls(a);}
        op[1595] = getOpcodeRnm(380, 2776); // RWS
        op[1596] = getOpcodeRnm(117, 1043); // boolCommonExpr
        {int[] a = {1598,1599,1600,1601}; op[1597] = getOpcodeCat(a);}
        op[1598] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {101,113}; op[1599] = getOpcodeTls(a);}
        op[1600] = getOpcodeRnm(380, 2776); // RWS
        op[1601] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1603,1604,1605,1606}; op[1602] = getOpcodeCat(a);}
        op[1603] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {110,101}; op[1604] = getOpcodeTls(a);}
        op[1605] = getOpcodeRnm(380, 2776); // RWS
        op[1606] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1608,1609,1610,1611}; op[1607] = getOpcodeCat(a);}
        op[1608] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {108,116}; op[1609] = getOpcodeTls(a);}
        op[1610] = getOpcodeRnm(380, 2776); // RWS
        op[1611] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1613,1614,1615,1616}; op[1612] = getOpcodeCat(a);}
        op[1613] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {108,101}; op[1614] = getOpcodeTls(a);}
        op[1615] = getOpcodeRnm(380, 2776); // RWS
        op[1616] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1618,1619,1620,1621}; op[1617] = getOpcodeCat(a);}
        op[1618] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {103,116}; op[1619] = getOpcodeTls(a);}
        op[1620] = getOpcodeRnm(380, 2776); // RWS
        op[1621] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1623,1624,1625,1626}; op[1622] = getOpcodeCat(a);}
        op[1623] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {103,101}; op[1624] = getOpcodeTls(a);}
        op[1625] = getOpcodeRnm(380, 2776); // RWS
        op[1626] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1628,1629,1630,1631}; op[1627] = getOpcodeCat(a);}
        op[1628] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {105,110}; op[1629] = getOpcodeTls(a);}
        op[1630] = getOpcodeRnm(380, 2776); // RWS
        op[1631] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1633,1634,1635,1636}; op[1632] = getOpcodeCat(a);}
        op[1633] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {104,97,115}; op[1634] = getOpcodeTls(a);}
        op[1635] = getOpcodeRnm(380, 2776); // RWS
        op[1636] = getOpcodeRnm(314, 2418); // enum
        {int[] a = {1638,1639,1640,1641}; op[1637] = getOpcodeCat(a);}
        op[1638] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {97,100,100}; op[1639] = getOpcodeTls(a);}
        op[1640] = getOpcodeRnm(380, 2776); // RWS
        op[1641] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1643,1644,1645,1646}; op[1642] = getOpcodeCat(a);}
        op[1643] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {115,117,98}; op[1644] = getOpcodeTls(a);}
        op[1645] = getOpcodeRnm(380, 2776); // RWS
        op[1646] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1648,1649,1650,1651}; op[1647] = getOpcodeCat(a);}
        op[1648] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {109,117,108}; op[1649] = getOpcodeTls(a);}
        op[1650] = getOpcodeRnm(380, 2776); // RWS
        op[1651] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1653,1654,1655,1656}; op[1652] = getOpcodeCat(a);}
        op[1653] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {100,105,118}; op[1654] = getOpcodeTls(a);}
        op[1655] = getOpcodeRnm(380, 2776); // RWS
        op[1656] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1658,1659,1660,1661}; op[1657] = getOpcodeCat(a);}
        op[1658] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {100,105,118,98,121}; op[1659] = getOpcodeTls(a);}
        op[1660] = getOpcodeRnm(380, 2776); // RWS
        op[1661] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1663,1664,1665,1666}; op[1662] = getOpcodeCat(a);}
        op[1663] = getOpcodeRnm(380, 2776); // RWS
        {char[] a = {109,111,100}; op[1664] = getOpcodeTls(a);}
        op[1665] = getOpcodeRnm(380, 2776); // RWS
        op[1666] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1668,1669,1670}; op[1667] = getOpcodeCat(a);}
        {char[] a = {45}; op[1668] = getOpcodeTls(a);}
        op[1669] = getOpcodeRnm(381, 2782); // BWS
        op[1670] = getOpcodeRnm(116, 1007); // commonExpr
        {int[] a = {1672,1673,1674}; op[1671] = getOpcodeCat(a);}
        {char[] a = {110,111,116}; op[1672] = getOpcodeTls(a);}
        op[1673] = getOpcodeRnm(380, 2776); // RWS
        op[1674] = getOpcodeRnm(117, 1043); // boolCommonExpr
        {int[] a = {1676,1677,1678,1679,1685,1686,1687}; op[1675] = getOpcodeCat(a);}
        {char[] a = {105,115,111,102}; op[1676] = getOpcodeTls(a);}
        op[1677] = getOpcodeRnm(390, 2811); // OPEN
        op[1678] = getOpcodeRnm(381, 2782); // BWS
        op[1679] = getOpcodeRep((char)0, (char)1, 1680);
        {int[] a = {1681,1682,1683,1684}; op[1680] = getOpcodeCat(a);}
        op[1681] = getOpcodeRnm(116, 1007); // commonExpr
        op[1682] = getOpcodeRnm(381, 2782); // BWS
        op[1683] = getOpcodeRnm(384, 2794); // COMMA
        op[1684] = getOpcodeRnm(381, 2782); // BWS
        op[1685] = getOpcodeRnm(227, 1918); // optionallyQualifiedTypeName
        op[1686] = getOpcodeRnm(381, 2782); // BWS
        op[1687] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1689,1690,1691,1692,1698,1699,1700}; op[1688] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[1689] = getOpcodeTls(a);}
        op[1690] = getOpcodeRnm(390, 2811); // OPEN
        op[1691] = getOpcodeRnm(381, 2782); // BWS
        op[1692] = getOpcodeRep((char)0, (char)1, 1693);
        {int[] a = {1694,1695,1696,1697}; op[1693] = getOpcodeCat(a);}
        op[1694] = getOpcodeRnm(116, 1007); // commonExpr
        op[1695] = getOpcodeRnm(381, 2782); // BWS
        op[1696] = getOpcodeRnm(384, 2794); // COMMA
        op[1697] = getOpcodeRnm(381, 2782); // BWS
        op[1698] = getOpcodeRnm(227, 1918); // optionallyQualifiedTypeName
        op[1699] = getOpcodeRnm(381, 2782); // BWS
        op[1700] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1702,1703,1704,1705}; op[1701] = getOpcodeAlt(a);}
        op[1702] = getOpcodeRnm(199, 1706); // complexColInUri
        op[1703] = getOpcodeRnm(200, 1716); // complexInUri
        op[1704] = getOpcodeRnm(209, 1801); // rootExprCol
        op[1705] = getOpcodeRnm(202, 1749); // primitiveColInUri
        {int[] a = {1707,1708,1715}; op[1706] = getOpcodeCat(a);}
        op[1707] = getOpcodeRnm(212, 1822); // begin-array
        op[1708] = getOpcodeRep((char)0, (char)1, 1709);
        {int[] a = {1710,1711}; op[1709] = getOpcodeCat(a);}
        op[1710] = getOpcodeRnm(200, 1716); // complexInUri
        op[1711] = getOpcodeRep((char)0, Character.MAX_VALUE, 1712);
        {int[] a = {1713,1714}; op[1712] = getOpcodeCat(a);}
        op[1713] = getOpcodeRnm(216, 1840); // value-separator
        op[1714] = getOpcodeRnm(200, 1716); // complexInUri
        op[1715] = getOpcodeRnm(213, 1828); // end-array
        {int[] a = {1717,1718,1735}; op[1716] = getOpcodeCat(a);}
        op[1717] = getOpcodeRnm(210, 1811); // begin-object
        op[1718] = getOpcodeRep((char)0, (char)1, 1719);
        {int[] a = {1720,1726}; op[1719] = getOpcodeCat(a);}
        {int[] a = {1721,1722,1723,1724,1725}; op[1720] = getOpcodeAlt(a);}
        op[1721] = getOpcodeRnm(204, 1765); // annotationInUri
        op[1722] = getOpcodeRnm(205, 1780); // primitivePropertyInUri
        op[1723] = getOpcodeRnm(203, 1759); // complexPropertyInUri
        op[1724] = getOpcodeRnm(201, 1736); // collectionPropertyInUri
        op[1725] = getOpcodeRnm(206, 1786); // navigationPropertyInUri
        op[1726] = getOpcodeRep((char)0, Character.MAX_VALUE, 1727);
        {int[] a = {1728,1729}; op[1727] = getOpcodeCat(a);}
        op[1728] = getOpcodeRnm(216, 1840); // value-separator
        {int[] a = {1730,1731,1732,1733,1734}; op[1729] = getOpcodeAlt(a);}
        op[1730] = getOpcodeRnm(204, 1765); // annotationInUri
        op[1731] = getOpcodeRnm(205, 1780); // primitivePropertyInUri
        op[1732] = getOpcodeRnm(203, 1759); // complexPropertyInUri
        op[1733] = getOpcodeRnm(201, 1736); // collectionPropertyInUri
        op[1734] = getOpcodeRnm(206, 1786); // navigationPropertyInUri
        op[1735] = getOpcodeRnm(211, 1817); // end-object
        {int[] a = {1737,1743}; op[1736] = getOpcodeAlt(a);}
        {int[] a = {1738,1739,1740,1741,1742}; op[1737] = getOpcodeCat(a);}
        op[1738] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1739] = getOpcodeRnm(255, 2036); // primitiveColProperty
        op[1740] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1741] = getOpcodeRnm(215, 1836); // name-separator
        op[1742] = getOpcodeRnm(202, 1749); // primitiveColInUri
        {int[] a = {1744,1745,1746,1747,1748}; op[1743] = getOpcodeCat(a);}
        op[1744] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1745] = getOpcodeRnm(257, 2038); // complexColProperty
        op[1746] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1747] = getOpcodeRnm(215, 1836); // name-separator
        op[1748] = getOpcodeRnm(199, 1706); // complexColInUri
        {int[] a = {1750,1751,1758}; op[1749] = getOpcodeCat(a);}
        op[1750] = getOpcodeRnm(212, 1822); // begin-array
        op[1751] = getOpcodeRep((char)0, (char)1, 1752);
        {int[] a = {1753,1754}; op[1752] = getOpcodeCat(a);}
        op[1753] = getOpcodeRnm(217, 1844); // primitiveLiteralInJSON
        op[1754] = getOpcodeRep((char)0, Character.MAX_VALUE, 1755);
        {int[] a = {1756,1757}; op[1755] = getOpcodeCat(a);}
        op[1756] = getOpcodeRnm(216, 1840); // value-separator
        op[1757] = getOpcodeRnm(217, 1844); // primitiveLiteralInJSON
        op[1758] = getOpcodeRnm(213, 1828); // end-array
        {int[] a = {1760,1761,1762,1763,1764}; op[1759] = getOpcodeCat(a);}
        op[1760] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1761] = getOpcodeRnm(256, 2037); // complexProperty
        op[1762] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1763] = getOpcodeRnm(215, 1836); // name-separator
        op[1764] = getOpcodeRnm(200, 1716); // complexInUri
        {int[] a = {1766,1767,1768,1772,1773,1774,1775}; op[1765] = getOpcodeCat(a);}
        op[1766] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1767] = getOpcodeRnm(382, 2788); // AT
        op[1768] = getOpcodeRep((char)0, (char)1, 1769);
        {int[] a = {1770,1771}; op[1769] = getOpcodeCat(a);}
        op[1770] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[1771] = getOpcodeTls(a);}
        op[1772] = getOpcodeRnm(245, 1984); // termName
        op[1773] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1774] = getOpcodeRnm(215, 1836); // name-separator
        {int[] a = {1776,1777,1778,1779}; op[1775] = getOpcodeAlt(a);}
        op[1776] = getOpcodeRnm(200, 1716); // complexInUri
        op[1777] = getOpcodeRnm(199, 1706); // complexColInUri
        op[1778] = getOpcodeRnm(217, 1844); // primitiveLiteralInJSON
        op[1779] = getOpcodeRnm(202, 1749); // primitiveColInUri
        {int[] a = {1781,1782,1783,1784,1785}; op[1780] = getOpcodeCat(a);}
        op[1781] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1782] = getOpcodeRnm(252, 2031); // primitiveProperty
        op[1783] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1784] = getOpcodeRnm(215, 1836); // name-separator
        op[1785] = getOpcodeRnm(217, 1844); // primitiveLiteralInJSON
        {int[] a = {1787,1788}; op[1786] = getOpcodeAlt(a);}
        op[1787] = getOpcodeRnm(207, 1789); // singleNavPropInJSON
        op[1788] = getOpcodeRnm(208, 1795); // collectionNavPropInJSON
        {int[] a = {1790,1791,1792,1793,1794}; op[1789] = getOpcodeCat(a);}
        op[1790] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1791] = getOpcodeRnm(260, 2043); // entityNavigationProperty
        op[1792] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1793] = getOpcodeRnm(215, 1836); // name-separator
        op[1794] = getOpcodeRnm(118, 1044); // rootExpr
        {int[] a = {1796,1797,1798,1799,1800}; op[1795] = getOpcodeCat(a);}
        op[1796] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1797] = getOpcodeRnm(261, 2044); // entityColNavigationProperty
        op[1798] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1799] = getOpcodeRnm(215, 1836); // name-separator
        op[1800] = getOpcodeRnm(209, 1801); // rootExprCol
        {int[] a = {1802,1803,1810}; op[1801] = getOpcodeCat(a);}
        op[1802] = getOpcodeRnm(212, 1822); // begin-array
        op[1803] = getOpcodeRep((char)0, (char)1, 1804);
        {int[] a = {1805,1806}; op[1804] = getOpcodeCat(a);}
        op[1805] = getOpcodeRnm(118, 1044); // rootExpr
        op[1806] = getOpcodeRep((char)0, Character.MAX_VALUE, 1807);
        {int[] a = {1808,1809}; op[1807] = getOpcodeCat(a);}
        op[1808] = getOpcodeRnm(216, 1840); // value-separator
        op[1809] = getOpcodeRnm(118, 1044); // rootExpr
        op[1810] = getOpcodeRnm(213, 1828); // end-array
        {int[] a = {1812,1813,1816}; op[1811] = getOpcodeCat(a);}
        op[1812] = getOpcodeRnm(381, 2782); // BWS
        {int[] a = {1814,1815}; op[1813] = getOpcodeAlt(a);}
        {char[] a = {123}; op[1814] = getOpcodeTls(a);}
        {char[] a = {37,55,66}; op[1815] = getOpcodeTls(a);}
        op[1816] = getOpcodeRnm(381, 2782); // BWS
        {int[] a = {1818,1819}; op[1817] = getOpcodeCat(a);}
        op[1818] = getOpcodeRnm(381, 2782); // BWS
        {int[] a = {1820,1821}; op[1819] = getOpcodeAlt(a);}
        {char[] a = {125}; op[1820] = getOpcodeTls(a);}
        {char[] a = {37,55,68}; op[1821] = getOpcodeTls(a);}
        {int[] a = {1823,1824,1827}; op[1822] = getOpcodeCat(a);}
        op[1823] = getOpcodeRnm(381, 2782); // BWS
        {int[] a = {1825,1826}; op[1824] = getOpcodeAlt(a);}
        {char[] a = {91}; op[1825] = getOpcodeTls(a);}
        {char[] a = {37,53,66}; op[1826] = getOpcodeTls(a);}
        op[1827] = getOpcodeRnm(381, 2782); // BWS
        {int[] a = {1829,1830}; op[1828] = getOpcodeCat(a);}
        op[1829] = getOpcodeRnm(381, 2782); // BWS
        {int[] a = {1831,1832}; op[1830] = getOpcodeAlt(a);}
        {char[] a = {93}; op[1831] = getOpcodeTls(a);}
        {char[] a = {37,53,68}; op[1832] = getOpcodeTls(a);}
        {int[] a = {1834,1835}; op[1833] = getOpcodeAlt(a);}
        op[1834] = getOpcodeRnm(433, 3218); // DQUOTE
        {char[] a = {37,50,50}; op[1835] = getOpcodeTls(a);}
        {int[] a = {1837,1838,1839}; op[1836] = getOpcodeCat(a);}
        op[1837] = getOpcodeRnm(381, 2782); // BWS
        op[1838] = getOpcodeRnm(383, 2791); // COLON
        op[1839] = getOpcodeRnm(381, 2782); // BWS
        {int[] a = {1841,1842,1843}; op[1840] = getOpcodeCat(a);}
        op[1841] = getOpcodeRnm(381, 2782); // BWS
        op[1842] = getOpcodeRnm(384, 2794); // COMMA
        op[1843] = getOpcodeRnm(381, 2782); // BWS
        {int[] a = {1845,1846,1847,1848,1849}; op[1844] = getOpcodeAlt(a);}
        op[1845] = getOpcodeRnm(218, 1850); // stringInJSON
        op[1846] = getOpcodeRnm(222, 1885); // numberInJSON
        {char[] a = {116,114,117,101}; op[1847] = getOpcodeTbs(a);}
        {char[] a = {102,97,108,115,101}; op[1848] = getOpcodeTbs(a);}
        {char[] a = {110,117,108,108}; op[1849] = getOpcodeTbs(a);}
        {int[] a = {1851,1852,1854}; op[1850] = getOpcodeCat(a);}
        op[1851] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1852] = getOpcodeRep((char)0, Character.MAX_VALUE, 1853);
        op[1853] = getOpcodeRnm(219, 1855); // charInJSON
        op[1854] = getOpcodeRnm(214, 1833); // quotation-mark
        {int[] a = {1856,1857,1858}; op[1855] = getOpcodeAlt(a);}
        op[1856] = getOpcodeRnm(424, 3142); // qchar-unescaped
        op[1857] = getOpcodeRnm(220, 1875); // qchar-JSON-special
        {int[] a = {1859,1860}; op[1858] = getOpcodeCat(a);}
        op[1859] = getOpcodeRnm(221, 1882); // escape
        {int[] a = {1861,1862,1863,1866,1867,1868,1869,1870,1871}; op[1860] = getOpcodeAlt(a);}
        op[1861] = getOpcodeRnm(214, 1833); // quotation-mark
        op[1862] = getOpcodeRnm(221, 1882); // escape
        {int[] a = {1864,1865}; op[1863] = getOpcodeAlt(a);}
        {char[] a = {47}; op[1864] = getOpcodeTls(a);}
        {char[] a = {37,50,70}; op[1865] = getOpcodeTls(a);}
        {char[] a = {98}; op[1866] = getOpcodeTbs(a);}
        {char[] a = {102}; op[1867] = getOpcodeTbs(a);}
        {char[] a = {110}; op[1868] = getOpcodeTbs(a);}
        {char[] a = {114}; op[1869] = getOpcodeTbs(a);}
        {char[] a = {116}; op[1870] = getOpcodeTbs(a);}
        {int[] a = {1872,1873}; op[1871] = getOpcodeCat(a);}
        {char[] a = {117}; op[1872] = getOpcodeTbs(a);}
        op[1873] = getOpcodeRep((char)4, (char)4, 1874);
        op[1874] = getOpcodeRnm(431, 3208); // HEXDIG
        {int[] a = {1876,1877,1878,1879,1880,1881}; op[1875] = getOpcodeAlt(a);}
        op[1876] = getOpcodeRnm(434, 3219); // SP
        {char[] a = {58}; op[1877] = getOpcodeTls(a);}
        {char[] a = {123}; op[1878] = getOpcodeTls(a);}
        {char[] a = {125}; op[1879] = getOpcodeTls(a);}
        {char[] a = {91}; op[1880] = getOpcodeTls(a);}
        {char[] a = {93}; op[1881] = getOpcodeTls(a);}
        {int[] a = {1883,1884}; op[1882] = getOpcodeAlt(a);}
        {char[] a = {92}; op[1883] = getOpcodeTls(a);}
        {char[] a = {37,53,67}; op[1884] = getOpcodeTls(a);}
        {int[] a = {1886,1888,1889,1891}; op[1885] = getOpcodeCat(a);}
        op[1886] = getOpcodeRep((char)0, (char)1, 1887);
        {char[] a = {45}; op[1887] = getOpcodeTls(a);}
        op[1888] = getOpcodeRnm(223, 1893); // int
        op[1889] = getOpcodeRep((char)0, (char)1, 1890);
        op[1890] = getOpcodeRnm(224, 1899); // frac
        op[1891] = getOpcodeRep((char)0, (char)1, 1892);
        op[1892] = getOpcodeRnm(225, 1903); // exp
        {int[] a = {1894,1895}; op[1893] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1894] = getOpcodeTls(a);}
        {int[] a = {1896,1897}; op[1895] = getOpcodeCat(a);}
        op[1896] = getOpcodeRnm(305, 2346); // oneToNine
        op[1897] = getOpcodeRep((char)0, Character.MAX_VALUE, 1898);
        op[1898] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {1900,1901}; op[1899] = getOpcodeCat(a);}
        {char[] a = {46}; op[1900] = getOpcodeTls(a);}
        op[1901] = getOpcodeRep((char)1, Character.MAX_VALUE, 1902);
        op[1902] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {1904,1905,1909}; op[1903] = getOpcodeCat(a);}
        {char[] a = {101}; op[1904] = getOpcodeTls(a);}
        op[1905] = getOpcodeRep((char)0, (char)1, 1906);
        {int[] a = {1907,1908}; op[1906] = getOpcodeAlt(a);}
        {char[] a = {45}; op[1907] = getOpcodeTls(a);}
        {char[] a = {43}; op[1908] = getOpcodeTls(a);}
        op[1909] = getOpcodeRep((char)1, Character.MAX_VALUE, 1910);
        op[1910] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {1912,1913}; op[1911] = getOpcodeAlt(a);}
        op[1912] = getOpcodeRnm(228, 1931); // singleQualifiedTypeName
        {int[] a = {1914,1915,1916,1917}; op[1913] = getOpcodeCat(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110}; op[1914] = getOpcodeTbs(a);}
        op[1915] = getOpcodeRnm(390, 2811); // OPEN
        op[1916] = getOpcodeRnm(228, 1931); // singleQualifiedTypeName
        op[1917] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1919,1920,1925,1926}; op[1918] = getOpcodeAlt(a);}
        op[1919] = getOpcodeRnm(228, 1931); // singleQualifiedTypeName
        {int[] a = {1921,1922,1923,1924}; op[1920] = getOpcodeCat(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110}; op[1921] = getOpcodeTbs(a);}
        op[1922] = getOpcodeRnm(390, 2811); // OPEN
        op[1923] = getOpcodeRnm(228, 1931); // singleQualifiedTypeName
        op[1924] = getOpcodeRnm(391, 2814); // CLOSE
        op[1925] = getOpcodeRnm(229, 1937); // singleTypeName
        {int[] a = {1927,1928,1929,1930}; op[1926] = getOpcodeCat(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110}; op[1927] = getOpcodeTbs(a);}
        op[1928] = getOpcodeRnm(390, 2811); // OPEN
        op[1929] = getOpcodeRnm(229, 1937); // singleTypeName
        op[1930] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {1932,1933,1934,1935,1936}; op[1931] = getOpcodeAlt(a);}
        op[1932] = getOpcodeRnm(230, 1942); // qualifiedEntityTypeName
        op[1933] = getOpcodeRnm(231, 1946); // qualifiedComplexTypeName
        op[1934] = getOpcodeRnm(232, 1950); // qualifiedTypeDefinitionName
        op[1935] = getOpcodeRnm(233, 1954); // qualifiedEnumTypeName
        op[1936] = getOpcodeRnm(249, 1996); // primitiveTypeName
        {int[] a = {1938,1939,1940,1941}; op[1937] = getOpcodeAlt(a);}
        op[1938] = getOpcodeRnm(240, 1979); // entityTypeName
        op[1939] = getOpcodeRnm(241, 1980); // complexTypeName
        op[1940] = getOpcodeRnm(242, 1981); // typeDefinitionName
        op[1941] = getOpcodeRnm(243, 1982); // enumerationTypeName
        {int[] a = {1943,1944,1945}; op[1942] = getOpcodeCat(a);}
        op[1943] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[1944] = getOpcodeTls(a);}
        op[1945] = getOpcodeRnm(240, 1979); // entityTypeName
        {int[] a = {1947,1948,1949}; op[1946] = getOpcodeCat(a);}
        op[1947] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[1948] = getOpcodeTls(a);}
        op[1949] = getOpcodeRnm(241, 1980); // complexTypeName
        {int[] a = {1951,1952,1953}; op[1950] = getOpcodeCat(a);}
        op[1951] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[1952] = getOpcodeTls(a);}
        op[1953] = getOpcodeRnm(242, 1981); // typeDefinitionName
        {int[] a = {1955,1956,1957}; op[1954] = getOpcodeCat(a);}
        op[1955] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[1956] = getOpcodeTls(a);}
        op[1957] = getOpcodeRnm(243, 1982); // enumerationTypeName
        {int[] a = {1959,1963}; op[1958] = getOpcodeCat(a);}
        op[1959] = getOpcodeRep((char)0, (char)1, 1960);
        {int[] a = {1961,1962}; op[1960] = getOpcodeCat(a);}
        op[1961] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[1962] = getOpcodeTls(a);}
        op[1963] = getOpcodeRnm(240, 1979); // entityTypeName
        {int[] a = {1965,1969}; op[1964] = getOpcodeCat(a);}
        op[1965] = getOpcodeRep((char)0, (char)1, 1966);
        {int[] a = {1967,1968}; op[1966] = getOpcodeCat(a);}
        op[1967] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[1968] = getOpcodeTls(a);}
        op[1969] = getOpcodeRnm(241, 1980); // complexTypeName
        {int[] a = {1971,1972}; op[1970] = getOpcodeCat(a);}
        op[1971] = getOpcodeRnm(237, 1976); // namespacePart
        op[1972] = getOpcodeRep((char)0, Character.MAX_VALUE, 1973);
        {int[] a = {1974,1975}; op[1973] = getOpcodeCat(a);}
        {char[] a = {46}; op[1974] = getOpcodeTls(a);}
        op[1975] = getOpcodeRnm(237, 1976); // namespacePart
        op[1976] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[1977] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[1978] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[1979] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[1980] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[1981] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[1982] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[1983] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[1984] = getOpcodeRnm(246, 1985); // odataIdentifier
        {int[] a = {1986,1987}; op[1985] = getOpcodeCat(a);}
        op[1986] = getOpcodeRnm(247, 1989); // identifierLeadingCharacter
        op[1987] = getOpcodeRep((char)0, (char)127, 1988);
        op[1988] = getOpcodeRnm(248, 1992); // identifierCharacter
        {int[] a = {1990,1991}; op[1989] = getOpcodeAlt(a);}
        op[1990] = getOpcodeRnm(429, 3204); // ALPHA
        {char[] a = {95}; op[1991] = getOpcodeTls(a);}
        {int[] a = {1993,1994,1995}; op[1992] = getOpcodeAlt(a);}
        op[1993] = getOpcodeRnm(429, 3204); // ALPHA
        {char[] a = {95}; op[1994] = getOpcodeTls(a);}
        op[1995] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {1997,1998}; op[1996] = getOpcodeCat(a);}
        {char[] a = {69,100,109,46}; op[1997] = getOpcodeTbs(a);}
        {int[] a = {1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016}; op[1998] = getOpcodeAlt(a);}
        {char[] a = {66,105,110,97,114,121}; op[1999] = getOpcodeTbs(a);}
        {char[] a = {66,111,111,108,101,97,110}; op[2000] = getOpcodeTbs(a);}
        {char[] a = {66,121,116,101}; op[2001] = getOpcodeTbs(a);}
        {char[] a = {68,97,116,101}; op[2002] = getOpcodeTbs(a);}
        {char[] a = {68,97,116,101,84,105,109,101,79,102,102,115,101,116}; op[2003] = getOpcodeTbs(a);}
        {char[] a = {68,101,99,105,109,97,108}; op[2004] = getOpcodeTbs(a);}
        {char[] a = {68,111,117,98,108,101}; op[2005] = getOpcodeTbs(a);}
        {char[] a = {68,117,114,97,116,105,111,110}; op[2006] = getOpcodeTbs(a);}
        {char[] a = {71,117,105,100}; op[2007] = getOpcodeTbs(a);}
        {char[] a = {73,110,116,49,54}; op[2008] = getOpcodeTbs(a);}
        {char[] a = {73,110,116,51,50}; op[2009] = getOpcodeTbs(a);}
        {char[] a = {73,110,116,54,52}; op[2010] = getOpcodeTbs(a);}
        {char[] a = {83,66,121,116,101}; op[2011] = getOpcodeTbs(a);}
        {char[] a = {83,105,110,103,108,101}; op[2012] = getOpcodeTbs(a);}
        {char[] a = {83,116,114,101,97,109}; op[2013] = getOpcodeTbs(a);}
        {char[] a = {83,116,114,105,110,103}; op[2014] = getOpcodeTbs(a);}
        {char[] a = {84,105,109,101,79,102,68,97,121}; op[2015] = getOpcodeTbs(a);}
        {int[] a = {2017,2018}; op[2016] = getOpcodeCat(a);}
        op[2017] = getOpcodeRnm(250, 2020); // abstractSpatialTypeName
        op[2018] = getOpcodeRep((char)0, (char)1, 2019);
        op[2019] = getOpcodeRnm(251, 2023); // concreteSpatialTypeName
    }
    private static void addOpcodes01(Opcode[] op){
        {int[] a = {2021,2022}; op[2020] = getOpcodeAlt(a);}
        {char[] a = {71,101,111,103,114,97,112,104,121}; op[2021] = getOpcodeTbs(a);}
        {char[] a = {71,101,111,109,101,116,114,121}; op[2022] = getOpcodeTbs(a);}
        {int[] a = {2024,2025,2026,2027,2028,2029,2030}; op[2023] = getOpcodeAlt(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110}; op[2024] = getOpcodeTbs(a);}
        {char[] a = {76,105,110,101,83,116,114,105,110,103}; op[2025] = getOpcodeTbs(a);}
        {char[] a = {77,117,108,116,105,76,105,110,101,83,116,114,105,110,103}; op[2026] = getOpcodeTbs(a);}
        {char[] a = {77,117,108,116,105,80,111,105,110,116}; op[2027] = getOpcodeTbs(a);}
        {char[] a = {77,117,108,116,105,80,111,108,121,103,111,110}; op[2028] = getOpcodeTbs(a);}
        {char[] a = {80,111,105,110,116}; op[2029] = getOpcodeTbs(a);}
        {char[] a = {80,111,108,121,103,111,110}; op[2030] = getOpcodeTbs(a);}
        {int[] a = {2032,2033}; op[2031] = getOpcodeAlt(a);}
        op[2032] = getOpcodeRnm(253, 2034); // primitiveKeyProperty
        op[2033] = getOpcodeRnm(254, 2035); // primitiveNonKeyProperty
        op[2034] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2035] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2036] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2037] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2038] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2039] = getOpcodeRnm(246, 1985); // odataIdentifier
        {int[] a = {2041,2042}; op[2040] = getOpcodeAlt(a);}
        op[2041] = getOpcodeRnm(260, 2043); // entityNavigationProperty
        op[2042] = getOpcodeRnm(261, 2044); // entityColNavigationProperty
        op[2043] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2044] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2045] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2046] = getOpcodeRnm(246, 1985); // odataIdentifier
        {int[] a = {2048,2049,2050,2051,2052,2053}; op[2047] = getOpcodeAlt(a);}
        op[2048] = getOpcodeRnm(265, 2054); // entityFunction
        op[2049] = getOpcodeRnm(266, 2055); // entityColFunction
        op[2050] = getOpcodeRnm(267, 2056); // complexFunction
        op[2051] = getOpcodeRnm(268, 2057); // complexColFunction
        op[2052] = getOpcodeRnm(269, 2058); // primitiveFunction
        op[2053] = getOpcodeRnm(270, 2059); // primitiveColFunction
        op[2054] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2055] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2056] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2057] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2058] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2059] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2060] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2061] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2062] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2063] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2064] = getOpcodeRnm(246, 1985); // odataIdentifier
        op[2065] = getOpcodeRnm(246, 1985); // odataIdentifier
        {int[] a = {2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098}; op[2066] = getOpcodeAlt(a);}
        op[2067] = getOpcodeRnm(279, 2123); // nullValue
        op[2068] = getOpcodeRnm(285, 2173); // booleanValue
        op[2069] = getOpcodeRnm(290, 2201); // guidValue
        op[2070] = getOpcodeRnm(300, 2269); // dateTimeOffsetValueInUrl
        op[2071] = getOpcodeRnm(298, 2248); // dateValue
        op[2072] = getOpcodeRnm(304, 2334); // timeOfDayValueInUrl
        op[2073] = getOpcodeRnm(286, 2176); // decimalValue
        op[2074] = getOpcodeRnm(287, 2195); // doubleValue
        op[2075] = getOpcodeRnm(288, 2196); // singleValue
        op[2076] = getOpcodeRnm(292, 2218); // sbyteValue
        op[2077] = getOpcodeRnm(291, 2216); // byteValue
        op[2078] = getOpcodeRnm(293, 2223); // int16Value
        op[2079] = getOpcodeRnm(294, 2228); // int32Value
        op[2080] = getOpcodeRnm(295, 2233); // int64Value
        op[2081] = getOpcodeRnm(296, 2238); // string
        op[2082] = getOpcodeRnm(301, 2284); // duration
        op[2083] = getOpcodeRnm(314, 2418); // enum
        op[2084] = getOpcodeRnm(280, 2124); // binary
        op[2085] = getOpcodeRnm(318, 2434); // geographyCollection
        op[2086] = getOpcodeRnm(322, 2458); // geographyLineString
        op[2087] = getOpcodeRnm(326, 2477); // geographyMultiLineString
        op[2088] = getOpcodeRnm(329, 2495); // geographyMultiPoint
        op[2089] = getOpcodeRnm(332, 2513); // geographyMultiPolygon
        op[2090] = getOpcodeRnm(335, 2531); // geographyPoint
        op[2091] = getOpcodeRnm(341, 2556); // geographyPolygon
        op[2092] = getOpcodeRnm(346, 2583); // geometryCollection
        op[2093] = getOpcodeRnm(347, 2588); // geometryLineString
        op[2094] = getOpcodeRnm(348, 2593); // geometryMultiLineString
        op[2095] = getOpcodeRnm(349, 2598); // geometryMultiPoint
        op[2096] = getOpcodeRnm(350, 2603); // geometryMultiPolygon
        op[2097] = getOpcodeRnm(351, 2608); // geometryPoint
        op[2098] = getOpcodeRnm(352, 2613); // geometryPolygon
        {int[] a = {2100,2101,2102,2103,2104,2105,2106,2107,2108,2109,2110,2111,2112,2113,2114,2115,2116,2117,2118,2119,2120,2121,2122}; op[2099] = getOpcodeAlt(a);}
        op[2100] = getOpcodeRnm(285, 2173); // booleanValue
        op[2101] = getOpcodeRnm(290, 2201); // guidValue
        op[2102] = getOpcodeRnm(302, 2290); // durationValue
        op[2103] = getOpcodeRnm(299, 2254); // dateTimeOffsetValue
        op[2104] = getOpcodeRnm(298, 2248); // dateValue
        op[2105] = getOpcodeRnm(303, 2322); // timeOfDayValue
        op[2106] = getOpcodeRnm(315, 2424); // enumValue
        op[2107] = getOpcodeRnm(319, 2439); // fullCollectionLiteral
        op[2108] = getOpcodeRnm(323, 2463); // fullLineStringLiteral
        op[2109] = getOpcodeRnm(330, 2500); // fullMultiPointLiteral
        op[2110] = getOpcodeRnm(327, 2482); // fullMultiLineStringLiteral
        op[2111] = getOpcodeRnm(333, 2518); // fullMultiPolygonLiteral
        op[2112] = getOpcodeRnm(336, 2536); // fullPointLiteral
        op[2113] = getOpcodeRnm(342, 2561); // fullPolygonLiteral
        op[2114] = getOpcodeRnm(286, 2176); // decimalValue
        op[2115] = getOpcodeRnm(287, 2195); // doubleValue
        op[2116] = getOpcodeRnm(288, 2196); // singleValue
        op[2117] = getOpcodeRnm(292, 2218); // sbyteValue
        op[2118] = getOpcodeRnm(291, 2216); // byteValue
        op[2119] = getOpcodeRnm(293, 2223); // int16Value
        op[2120] = getOpcodeRnm(294, 2228); // int32Value
        op[2121] = getOpcodeRnm(295, 2233); // int64Value
        op[2122] = getOpcodeRnm(281, 2129); // binaryValue
        {char[] a = {110,117,108,108}; op[2123] = getOpcodeTbs(a);}
        {int[] a = {2125,2126,2127,2128}; op[2124] = getOpcodeCat(a);}
        {char[] a = {98,105,110,97,114,121}; op[2125] = getOpcodeTls(a);}
        op[2126] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2127] = getOpcodeRnm(281, 2129); // binaryValue
        op[2128] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2130,2133}; op[2129] = getOpcodeCat(a);}
        op[2130] = getOpcodeRep((char)0, Character.MAX_VALUE, 2131);
        op[2131] = getOpcodeRep((char)4, (char)4, 2132);
        op[2132] = getOpcodeRnm(284, 2168); // base64char
        op[2133] = getOpcodeRep((char)0, (char)1, 2134);
        {int[] a = {2135,2136}; op[2134] = getOpcodeAlt(a);}
        op[2135] = getOpcodeRnm(282, 2137); // base64b16
        op[2136] = getOpcodeRnm(283, 2159); // base64b8
        {int[] a = {2138,2140,2157}; op[2137] = getOpcodeCat(a);}
        op[2138] = getOpcodeRep((char)2, (char)2, 2139);
        op[2139] = getOpcodeRnm(284, 2168); // base64char
        {int[] a = {2141,2142,2143,2144,2145,2146,2147,2148,2149,2150,2151,2152,2153,2154,2155,2156}; op[2140] = getOpcodeAlt(a);}
        {char[] a = {65}; op[2141] = getOpcodeTbs(a);}
        {char[] a = {69}; op[2142] = getOpcodeTbs(a);}
        {char[] a = {73}; op[2143] = getOpcodeTbs(a);}
        {char[] a = {77}; op[2144] = getOpcodeTbs(a);}
        {char[] a = {81}; op[2145] = getOpcodeTbs(a);}
        {char[] a = {85}; op[2146] = getOpcodeTbs(a);}
        {char[] a = {89}; op[2147] = getOpcodeTbs(a);}
        {char[] a = {99}; op[2148] = getOpcodeTbs(a);}
        {char[] a = {103}; op[2149] = getOpcodeTbs(a);}
        {char[] a = {107}; op[2150] = getOpcodeTbs(a);}
        {char[] a = {111}; op[2151] = getOpcodeTbs(a);}
        {char[] a = {115}; op[2152] = getOpcodeTbs(a);}
        {char[] a = {119}; op[2153] = getOpcodeTbs(a);}
        {char[] a = {48}; op[2154] = getOpcodeTbs(a);}
        {char[] a = {52}; op[2155] = getOpcodeTbs(a);}
        {char[] a = {56}; op[2156] = getOpcodeTbs(a);}
        op[2157] = getOpcodeRep((char)0, (char)1, 2158);
        {char[] a = {61}; op[2158] = getOpcodeTls(a);}
        {int[] a = {2160,2161,2166}; op[2159] = getOpcodeCat(a);}
        op[2160] = getOpcodeRnm(284, 2168); // base64char
        {int[] a = {2162,2163,2164,2165}; op[2161] = getOpcodeAlt(a);}
        {char[] a = {65}; op[2162] = getOpcodeTbs(a);}
        {char[] a = {81}; op[2163] = getOpcodeTbs(a);}
        {char[] a = {103}; op[2164] = getOpcodeTbs(a);}
        {char[] a = {119}; op[2165] = getOpcodeTbs(a);}
        op[2166] = getOpcodeRep((char)0, (char)1, 2167);
        {char[] a = {61,61}; op[2167] = getOpcodeTls(a);}
        {int[] a = {2169,2170,2171,2172}; op[2168] = getOpcodeAlt(a);}
        op[2169] = getOpcodeRnm(429, 3204); // ALPHA
        op[2170] = getOpcodeRnm(430, 3207); // DIGIT
        {char[] a = {45}; op[2171] = getOpcodeTls(a);}
        {char[] a = {95}; op[2172] = getOpcodeTls(a);}
        {int[] a = {2174,2175}; op[2173] = getOpcodeAlt(a);}
        {char[] a = {116,114,117,101}; op[2174] = getOpcodeTls(a);}
        {char[] a = {102,97,108,115,101}; op[2175] = getOpcodeTls(a);}
        {int[] a = {2177,2194}; op[2176] = getOpcodeAlt(a);}
        {int[] a = {2178,2180,2182,2187}; op[2177] = getOpcodeCat(a);}
        op[2178] = getOpcodeRep((char)0, (char)1, 2179);
        op[2179] = getOpcodeRnm(386, 2798); // SIGN
        op[2180] = getOpcodeRep((char)1, Character.MAX_VALUE, 2181);
        op[2181] = getOpcodeRnm(430, 3207); // DIGIT
        op[2182] = getOpcodeRep((char)0, (char)1, 2183);
        {int[] a = {2184,2185}; op[2183] = getOpcodeCat(a);}
        {char[] a = {46}; op[2184] = getOpcodeTls(a);}
        op[2185] = getOpcodeRep((char)1, Character.MAX_VALUE, 2186);
        op[2186] = getOpcodeRnm(430, 3207); // DIGIT
        op[2187] = getOpcodeRep((char)0, (char)1, 2188);
        {int[] a = {2189,2190,2192}; op[2188] = getOpcodeCat(a);}
        {char[] a = {101}; op[2189] = getOpcodeTls(a);}
        op[2190] = getOpcodeRep((char)0, (char)1, 2191);
        op[2191] = getOpcodeRnm(386, 2798); // SIGN
        op[2192] = getOpcodeRep((char)1, Character.MAX_VALUE, 2193);
        op[2193] = getOpcodeRnm(430, 3207); // DIGIT
        op[2194] = getOpcodeRnm(289, 2197); // nanInfinity
        op[2195] = getOpcodeRnm(286, 2176); // decimalValue
        op[2196] = getOpcodeRnm(286, 2176); // decimalValue
        {int[] a = {2198,2199,2200}; op[2197] = getOpcodeAlt(a);}
        {char[] a = {78,97,78}; op[2198] = getOpcodeTbs(a);}
        {char[] a = {45,73,78,70}; op[2199] = getOpcodeTbs(a);}
        {char[] a = {73,78,70}; op[2200] = getOpcodeTbs(a);}
        {int[] a = {2202,2204,2205,2207,2208,2210,2211,2213,2214}; op[2201] = getOpcodeCat(a);}
        op[2202] = getOpcodeRep((char)8, (char)8, 2203);
        op[2203] = getOpcodeRnm(431, 3208); // HEXDIG
        {char[] a = {45}; op[2204] = getOpcodeTls(a);}
        op[2205] = getOpcodeRep((char)4, (char)4, 2206);
        op[2206] = getOpcodeRnm(431, 3208); // HEXDIG
        {char[] a = {45}; op[2207] = getOpcodeTls(a);}
        op[2208] = getOpcodeRep((char)4, (char)4, 2209);
        op[2209] = getOpcodeRnm(431, 3208); // HEXDIG
        {char[] a = {45}; op[2210] = getOpcodeTls(a);}
        op[2211] = getOpcodeRep((char)4, (char)4, 2212);
        op[2212] = getOpcodeRnm(431, 3208); // HEXDIG
        {char[] a = {45}; op[2213] = getOpcodeTls(a);}
        op[2214] = getOpcodeRep((char)12, (char)12, 2215);
        op[2215] = getOpcodeRnm(431, 3208); // HEXDIG
        op[2216] = getOpcodeRep((char)1, (char)3, 2217);
        op[2217] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {2219,2221}; op[2218] = getOpcodeCat(a);}
        op[2219] = getOpcodeRep((char)0, (char)1, 2220);
        op[2220] = getOpcodeRnm(386, 2798); // SIGN
        op[2221] = getOpcodeRep((char)1, (char)3, 2222);
        op[2222] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {2224,2226}; op[2223] = getOpcodeCat(a);}
        op[2224] = getOpcodeRep((char)0, (char)1, 2225);
        op[2225] = getOpcodeRnm(386, 2798); // SIGN
        op[2226] = getOpcodeRep((char)1, (char)5, 2227);
        op[2227] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {2229,2231}; op[2228] = getOpcodeCat(a);}
        op[2229] = getOpcodeRep((char)0, (char)1, 2230);
        op[2230] = getOpcodeRnm(386, 2798); // SIGN
        op[2231] = getOpcodeRep((char)1, (char)10, 2232);
        op[2232] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {2234,2236}; op[2233] = getOpcodeCat(a);}
        op[2234] = getOpcodeRep((char)0, (char)1, 2235);
        op[2235] = getOpcodeRnm(386, 2798); // SIGN
        op[2236] = getOpcodeRep((char)1, (char)19, 2237);
        op[2237] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {2239,2240,2244}; op[2238] = getOpcodeCat(a);}
        op[2239] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2240] = getOpcodeRep((char)0, Character.MAX_VALUE, 2241);
        {int[] a = {2242,2243}; op[2241] = getOpcodeAlt(a);}
        op[2242] = getOpcodeRnm(297, 2245); // SQUOTE-in-string
        op[2243] = getOpcodeRnm(419, 3076); // pchar-no-SQUOTE
        op[2244] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2246,2247}; op[2245] = getOpcodeCat(a);}
        op[2246] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2247] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2249,2250,2251,2252,2253}; op[2248] = getOpcodeCat(a);}
        op[2249] = getOpcodeRnm(307, 2365); // year
        {char[] a = {45}; op[2250] = getOpcodeTls(a);}
        op[2251] = getOpcodeRnm(308, 2377); // month
        {char[] a = {45}; op[2252] = getOpcodeTls(a);}
        op[2253] = getOpcodeRnm(309, 2387); // day
        {int[] a = {2255,2256,2257,2258,2259,2260,2261,2262}; op[2254] = getOpcodeCat(a);}
        op[2255] = getOpcodeRnm(307, 2365); // year
        {char[] a = {45}; op[2256] = getOpcodeTls(a);}
        op[2257] = getOpcodeRnm(308, 2377); // month
        {char[] a = {45}; op[2258] = getOpcodeTls(a);}
        op[2259] = getOpcodeRnm(309, 2387); // day
        {char[] a = {84}; op[2260] = getOpcodeTls(a);}
        op[2261] = getOpcodeRnm(303, 2322); // timeOfDayValue
        {int[] a = {2263,2264}; op[2262] = getOpcodeAlt(a);}
        {char[] a = {90}; op[2263] = getOpcodeTls(a);}
        {int[] a = {2265,2266,2267,2268}; op[2264] = getOpcodeCat(a);}
        op[2265] = getOpcodeRnm(386, 2798); // SIGN
        op[2266] = getOpcodeRnm(310, 2401); // hour
        {char[] a = {58}; op[2267] = getOpcodeTls(a);}
        op[2268] = getOpcodeRnm(311, 2414); // minute
        {int[] a = {2270,2271,2272,2273,2274,2275,2276,2277}; op[2269] = getOpcodeCat(a);}
        op[2270] = getOpcodeRnm(307, 2365); // year
        {char[] a = {45}; op[2271] = getOpcodeTls(a);}
        op[2272] = getOpcodeRnm(308, 2377); // month
        {char[] a = {45}; op[2273] = getOpcodeTls(a);}
        op[2274] = getOpcodeRnm(309, 2387); // day
        {char[] a = {84}; op[2275] = getOpcodeTls(a);}
        op[2276] = getOpcodeRnm(304, 2334); // timeOfDayValueInUrl
        {int[] a = {2278,2279}; op[2277] = getOpcodeAlt(a);}
        {char[] a = {90}; op[2278] = getOpcodeTls(a);}
        {int[] a = {2280,2281,2282,2283}; op[2279] = getOpcodeCat(a);}
        op[2280] = getOpcodeRnm(386, 2798); // SIGN
        op[2281] = getOpcodeRnm(310, 2401); // hour
        op[2282] = getOpcodeRnm(383, 2791); // COLON
        op[2283] = getOpcodeRnm(311, 2414); // minute
        {int[] a = {2285,2287,2288,2289}; op[2284] = getOpcodeCat(a);}
        op[2285] = getOpcodeRep((char)0, (char)1, 2286);
        {char[] a = {100,117,114,97,116,105,111,110}; op[2286] = getOpcodeTls(a);}
        op[2287] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2288] = getOpcodeRnm(302, 2290); // durationValue
        op[2289] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2291,2293,2294,2299}; op[2290] = getOpcodeCat(a);}
        op[2291] = getOpcodeRep((char)0, (char)1, 2292);
        op[2292] = getOpcodeRnm(386, 2798); // SIGN
        {char[] a = {80}; op[2293] = getOpcodeTls(a);}
        op[2294] = getOpcodeRep((char)0, (char)1, 2295);
        {int[] a = {2296,2298}; op[2295] = getOpcodeCat(a);}
        op[2296] = getOpcodeRep((char)1, Character.MAX_VALUE, 2297);
        op[2297] = getOpcodeRnm(430, 3207); // DIGIT
        {char[] a = {68}; op[2298] = getOpcodeTls(a);}
        op[2299] = getOpcodeRep((char)0, (char)1, 2300);
        {int[] a = {2301,2302,2307,2312}; op[2300] = getOpcodeCat(a);}
        {char[] a = {84}; op[2301] = getOpcodeTls(a);}
        op[2302] = getOpcodeRep((char)0, (char)1, 2303);
        {int[] a = {2304,2306}; op[2303] = getOpcodeCat(a);}
        op[2304] = getOpcodeRep((char)1, Character.MAX_VALUE, 2305);
        op[2305] = getOpcodeRnm(430, 3207); // DIGIT
        {char[] a = {72}; op[2306] = getOpcodeTls(a);}
        op[2307] = getOpcodeRep((char)0, (char)1, 2308);
        {int[] a = {2309,2311}; op[2308] = getOpcodeCat(a);}
        op[2309] = getOpcodeRep((char)1, Character.MAX_VALUE, 2310);
        op[2310] = getOpcodeRnm(430, 3207); // DIGIT
        {char[] a = {77}; op[2311] = getOpcodeTls(a);}
        op[2312] = getOpcodeRep((char)0, (char)1, 2313);
        {int[] a = {2314,2316,2321}; op[2313] = getOpcodeCat(a);}
        op[2314] = getOpcodeRep((char)1, Character.MAX_VALUE, 2315);
        op[2315] = getOpcodeRnm(430, 3207); // DIGIT
        op[2316] = getOpcodeRep((char)0, (char)1, 2317);
        {int[] a = {2318,2319}; op[2317] = getOpcodeCat(a);}
        {char[] a = {46}; op[2318] = getOpcodeTls(a);}
        op[2319] = getOpcodeRep((char)1, Character.MAX_VALUE, 2320);
        op[2320] = getOpcodeRnm(430, 3207); // DIGIT
        {char[] a = {83}; op[2321] = getOpcodeTls(a);}
        {int[] a = {2323,2324,2325,2326}; op[2322] = getOpcodeCat(a);}
        op[2323] = getOpcodeRnm(310, 2401); // hour
        {char[] a = {58}; op[2324] = getOpcodeTls(a);}
        op[2325] = getOpcodeRnm(311, 2414); // minute
        op[2326] = getOpcodeRep((char)0, (char)1, 2327);
        {int[] a = {2328,2329,2330}; op[2327] = getOpcodeCat(a);}
        {char[] a = {58}; op[2328] = getOpcodeTls(a);}
        op[2329] = getOpcodeRnm(312, 2415); // second
        op[2330] = getOpcodeRep((char)0, (char)1, 2331);
        {int[] a = {2332,2333}; op[2331] = getOpcodeCat(a);}
        {char[] a = {46}; op[2332] = getOpcodeTls(a);}
        op[2333] = getOpcodeRnm(313, 2416); // fractionalSeconds
        {int[] a = {2335,2336,2337,2338}; op[2334] = getOpcodeCat(a);}
        op[2335] = getOpcodeRnm(310, 2401); // hour
        op[2336] = getOpcodeRnm(383, 2791); // COLON
        op[2337] = getOpcodeRnm(311, 2414); // minute
        op[2338] = getOpcodeRep((char)0, (char)1, 2339);
        {int[] a = {2340,2341,2342}; op[2339] = getOpcodeCat(a);}
        op[2340] = getOpcodeRnm(383, 2791); // COLON
        op[2341] = getOpcodeRnm(312, 2415); // second
        op[2342] = getOpcodeRep((char)0, (char)1, 2343);
        {int[] a = {2344,2345}; op[2343] = getOpcodeCat(a);}
        {char[] a = {46}; op[2344] = getOpcodeTls(a);}
        op[2345] = getOpcodeRnm(313, 2416); // fractionalSeconds
        {int[] a = {2347,2348,2349,2350,2351,2352,2353,2354,2355}; op[2346] = getOpcodeAlt(a);}
        {char[] a = {49}; op[2347] = getOpcodeTls(a);}
        {char[] a = {50}; op[2348] = getOpcodeTls(a);}
        {char[] a = {51}; op[2349] = getOpcodeTls(a);}
        {char[] a = {52}; op[2350] = getOpcodeTls(a);}
        {char[] a = {53}; op[2351] = getOpcodeTls(a);}
        {char[] a = {54}; op[2352] = getOpcodeTls(a);}
        {char[] a = {55}; op[2353] = getOpcodeTls(a);}
        {char[] a = {56}; op[2354] = getOpcodeTls(a);}
        {char[] a = {57}; op[2355] = getOpcodeTls(a);}
        {int[] a = {2357,2364}; op[2356] = getOpcodeCat(a);}
        {int[] a = {2358,2359,2360,2361,2362,2363}; op[2357] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2358] = getOpcodeTls(a);}
        {char[] a = {49}; op[2359] = getOpcodeTls(a);}
        {char[] a = {50}; op[2360] = getOpcodeTls(a);}
        {char[] a = {51}; op[2361] = getOpcodeTls(a);}
        {char[] a = {52}; op[2362] = getOpcodeTls(a);}
        {char[] a = {53}; op[2363] = getOpcodeTls(a);}
        op[2364] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {2366,2368}; op[2365] = getOpcodeCat(a);}
        op[2366] = getOpcodeRep((char)0, (char)1, 2367);
        {char[] a = {45}; op[2367] = getOpcodeTls(a);}
        {int[] a = {2369,2373}; op[2368] = getOpcodeAlt(a);}
        {int[] a = {2370,2371}; op[2369] = getOpcodeCat(a);}
        {char[] a = {48}; op[2370] = getOpcodeTls(a);}
        op[2371] = getOpcodeRep((char)3, (char)3, 2372);
        op[2372] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {2374,2375}; op[2373] = getOpcodeCat(a);}
        op[2374] = getOpcodeRnm(305, 2346); // oneToNine
        op[2375] = getOpcodeRep((char)3, Character.MAX_VALUE, 2376);
        op[2376] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {2378,2381}; op[2377] = getOpcodeAlt(a);}
        {int[] a = {2379,2380}; op[2378] = getOpcodeCat(a);}
        {char[] a = {48}; op[2379] = getOpcodeTls(a);}
        op[2380] = getOpcodeRnm(305, 2346); // oneToNine
        {int[] a = {2382,2383}; op[2381] = getOpcodeCat(a);}
        {char[] a = {49}; op[2382] = getOpcodeTls(a);}
        {int[] a = {2384,2385,2386}; op[2383] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2384] = getOpcodeTls(a);}
        {char[] a = {49}; op[2385] = getOpcodeTls(a);}
        {char[] a = {50}; op[2386] = getOpcodeTls(a);}
        {int[] a = {2388,2391,2396}; op[2387] = getOpcodeAlt(a);}
        {int[] a = {2389,2390}; op[2388] = getOpcodeCat(a);}
        {char[] a = {48}; op[2389] = getOpcodeTls(a);}
        op[2390] = getOpcodeRnm(305, 2346); // oneToNine
        {int[] a = {2392,2395}; op[2391] = getOpcodeCat(a);}
        {int[] a = {2393,2394}; op[2392] = getOpcodeAlt(a);}
        {char[] a = {49}; op[2393] = getOpcodeTls(a);}
        {char[] a = {50}; op[2394] = getOpcodeTls(a);}
        op[2395] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {2397,2398}; op[2396] = getOpcodeCat(a);}
        {char[] a = {51}; op[2397] = getOpcodeTls(a);}
        {int[] a = {2399,2400}; op[2398] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2399] = getOpcodeTls(a);}
        {char[] a = {49}; op[2400] = getOpcodeTls(a);}
        {int[] a = {2402,2407}; op[2401] = getOpcodeAlt(a);}
        {int[] a = {2403,2406}; op[2402] = getOpcodeCat(a);}
        {int[] a = {2404,2405}; op[2403] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2404] = getOpcodeTls(a);}
        {char[] a = {49}; op[2405] = getOpcodeTls(a);}
        op[2406] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {2408,2409}; op[2407] = getOpcodeCat(a);}
        {char[] a = {50}; op[2408] = getOpcodeTls(a);}
        {int[] a = {2410,2411,2412,2413}; op[2409] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2410] = getOpcodeTls(a);}
        {char[] a = {49}; op[2411] = getOpcodeTls(a);}
        {char[] a = {50}; op[2412] = getOpcodeTls(a);}
        {char[] a = {51}; op[2413] = getOpcodeTls(a);}
        op[2414] = getOpcodeRnm(306, 2356); // zeroToFiftyNine
        op[2415] = getOpcodeRnm(306, 2356); // zeroToFiftyNine
        op[2416] = getOpcodeRep((char)1, (char)12, 2417);
        op[2417] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {2419,2421,2422,2423}; op[2418] = getOpcodeCat(a);}
        op[2419] = getOpcodeRep((char)0, (char)1, 2420);
        op[2420] = getOpcodeRnm(233, 1954); // qualifiedEnumTypeName
        op[2421] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2422] = getOpcodeRnm(315, 2424); // enumValue
        op[2423] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2425,2426}; op[2424] = getOpcodeCat(a);}
        op[2425] = getOpcodeRnm(316, 2430); // singleEnumValue
        op[2426] = getOpcodeRep((char)0, Character.MAX_VALUE, 2427);
        {int[] a = {2428,2429}; op[2427] = getOpcodeCat(a);}
        op[2428] = getOpcodeRnm(384, 2794); // COMMA
        op[2429] = getOpcodeRnm(316, 2430); // singleEnumValue
        {int[] a = {2431,2432}; op[2430] = getOpcodeAlt(a);}
        op[2431] = getOpcodeRnm(244, 1983); // enumerationMember
        op[2432] = getOpcodeRnm(317, 2433); // enumMemberValue
        op[2433] = getOpcodeRnm(295, 2233); // int64Value
        {int[] a = {2435,2436,2437,2438}; op[2434] = getOpcodeCat(a);}
        op[2435] = getOpcodeRnm(353, 2618); // geographyPrefix
        op[2436] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2437] = getOpcodeRnm(319, 2439); // fullCollectionLiteral
        op[2438] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2440,2441}; op[2439] = getOpcodeCat(a);}
        op[2440] = getOpcodeRnm(337, 2539); // sridLiteral
        op[2441] = getOpcodeRnm(320, 2442); // collectionLiteral
        {int[] a = {2443,2444,2445,2449}; op[2442] = getOpcodeCat(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110,40}; op[2443] = getOpcodeTls(a);}
        op[2444] = getOpcodeRnm(321, 2450); // geoLiteral
        op[2445] = getOpcodeRep((char)0, Character.MAX_VALUE, 2446);
        {int[] a = {2447,2448}; op[2446] = getOpcodeCat(a);}
        op[2447] = getOpcodeRnm(384, 2794); // COMMA
        op[2448] = getOpcodeRnm(321, 2450); // geoLiteral
        op[2449] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {2451,2452,2453,2454,2455,2456,2457}; op[2450] = getOpcodeAlt(a);}
        op[2451] = getOpcodeRnm(320, 2442); // collectionLiteral
        op[2452] = getOpcodeRnm(324, 2466); // lineStringLiteral
        op[2453] = getOpcodeRnm(331, 2503); // multiPointLiteral
        op[2454] = getOpcodeRnm(328, 2485); // multiLineStringLiteral
        op[2455] = getOpcodeRnm(334, 2521); // multiPolygonLiteral
        op[2456] = getOpcodeRnm(338, 2545); // pointLiteral
        op[2457] = getOpcodeRnm(343, 2564); // polygonLiteral
        {int[] a = {2459,2460,2461,2462}; op[2458] = getOpcodeCat(a);}
        op[2459] = getOpcodeRnm(353, 2618); // geographyPrefix
        op[2460] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2461] = getOpcodeRnm(323, 2463); // fullLineStringLiteral
        op[2462] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2464,2465}; op[2463] = getOpcodeCat(a);}
        op[2464] = getOpcodeRnm(337, 2539); // sridLiteral
        op[2465] = getOpcodeRnm(324, 2466); // lineStringLiteral
        {int[] a = {2467,2468}; op[2466] = getOpcodeCat(a);}
        {char[] a = {76,105,110,101,83,116,114,105,110,103}; op[2467] = getOpcodeTls(a);}
        op[2468] = getOpcodeRnm(325, 2469); // lineStringData
        {int[] a = {2470,2471,2472,2476}; op[2469] = getOpcodeCat(a);}
        op[2470] = getOpcodeRnm(390, 2811); // OPEN
        op[2471] = getOpcodeRnm(340, 2552); // positionLiteral
        op[2472] = getOpcodeRep((char)1, Character.MAX_VALUE, 2473);
        {int[] a = {2474,2475}; op[2473] = getOpcodeCat(a);}
        op[2474] = getOpcodeRnm(384, 2794); // COMMA
        op[2475] = getOpcodeRnm(340, 2552); // positionLiteral
        op[2476] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {2478,2479,2480,2481}; op[2477] = getOpcodeCat(a);}
        op[2478] = getOpcodeRnm(353, 2618); // geographyPrefix
        op[2479] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2480] = getOpcodeRnm(327, 2482); // fullMultiLineStringLiteral
        op[2481] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2483,2484}; op[2482] = getOpcodeCat(a);}
        op[2483] = getOpcodeRnm(337, 2539); // sridLiteral
        op[2484] = getOpcodeRnm(328, 2485); // multiLineStringLiteral
        {int[] a = {2486,2487,2494}; op[2485] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,76,105,110,101,83,116,114,105,110,103,40}; op[2486] = getOpcodeTls(a);}
        op[2487] = getOpcodeRep((char)0, (char)1, 2488);
        {int[] a = {2489,2490}; op[2488] = getOpcodeCat(a);}
        op[2489] = getOpcodeRnm(325, 2469); // lineStringData
        op[2490] = getOpcodeRep((char)0, Character.MAX_VALUE, 2491);
        {int[] a = {2492,2493}; op[2491] = getOpcodeCat(a);}
        op[2492] = getOpcodeRnm(384, 2794); // COMMA
        op[2493] = getOpcodeRnm(325, 2469); // lineStringData
        op[2494] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {2496,2497,2498,2499}; op[2495] = getOpcodeCat(a);}
        op[2496] = getOpcodeRnm(353, 2618); // geographyPrefix
        op[2497] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2498] = getOpcodeRnm(330, 2500); // fullMultiPointLiteral
        op[2499] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2501,2502}; op[2500] = getOpcodeCat(a);}
        op[2501] = getOpcodeRnm(337, 2539); // sridLiteral
        op[2502] = getOpcodeRnm(331, 2503); // multiPointLiteral
        {int[] a = {2504,2505,2512}; op[2503] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,80,111,105,110,116,40}; op[2504] = getOpcodeTls(a);}
        op[2505] = getOpcodeRep((char)0, (char)1, 2506);
        {int[] a = {2507,2508}; op[2506] = getOpcodeCat(a);}
        op[2507] = getOpcodeRnm(339, 2548); // pointData
        op[2508] = getOpcodeRep((char)0, Character.MAX_VALUE, 2509);
        {int[] a = {2510,2511}; op[2509] = getOpcodeCat(a);}
        op[2510] = getOpcodeRnm(384, 2794); // COMMA
        op[2511] = getOpcodeRnm(339, 2548); // pointData
        op[2512] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {2514,2515,2516,2517}; op[2513] = getOpcodeCat(a);}
        op[2514] = getOpcodeRnm(353, 2618); // geographyPrefix
        op[2515] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2516] = getOpcodeRnm(333, 2518); // fullMultiPolygonLiteral
        op[2517] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2519,2520}; op[2518] = getOpcodeCat(a);}
        op[2519] = getOpcodeRnm(337, 2539); // sridLiteral
        op[2520] = getOpcodeRnm(334, 2521); // multiPolygonLiteral
        {int[] a = {2522,2523,2530}; op[2521] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,80,111,108,121,103,111,110,40}; op[2522] = getOpcodeTls(a);}
        op[2523] = getOpcodeRep((char)0, (char)1, 2524);
        {int[] a = {2525,2526}; op[2524] = getOpcodeCat(a);}
        op[2525] = getOpcodeRnm(344, 2567); // polygonData
        op[2526] = getOpcodeRep((char)0, Character.MAX_VALUE, 2527);
        {int[] a = {2528,2529}; op[2527] = getOpcodeCat(a);}
        op[2528] = getOpcodeRnm(384, 2794); // COMMA
        op[2529] = getOpcodeRnm(344, 2567); // polygonData
        op[2530] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {2532,2533,2534,2535}; op[2531] = getOpcodeCat(a);}
        op[2532] = getOpcodeRnm(353, 2618); // geographyPrefix
        op[2533] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2534] = getOpcodeRnm(336, 2536); // fullPointLiteral
        op[2535] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2537,2538}; op[2536] = getOpcodeCat(a);}
        op[2537] = getOpcodeRnm(337, 2539); // sridLiteral
        op[2538] = getOpcodeRnm(338, 2545); // pointLiteral
        {int[] a = {2540,2541,2542,2544}; op[2539] = getOpcodeCat(a);}
        {char[] a = {83,82,73,68}; op[2540] = getOpcodeTls(a);}
        op[2541] = getOpcodeRnm(385, 2797); // EQ
        op[2542] = getOpcodeRep((char)1, (char)5, 2543);
        op[2543] = getOpcodeRnm(430, 3207); // DIGIT
        op[2544] = getOpcodeRnm(387, 2802); // SEMI
        {int[] a = {2546,2547}; op[2545] = getOpcodeCat(a);}
        {char[] a = {80,111,105,110,116}; op[2546] = getOpcodeTls(a);}
        op[2547] = getOpcodeRnm(339, 2548); // pointData
        {int[] a = {2549,2550,2551}; op[2548] = getOpcodeCat(a);}
        op[2549] = getOpcodeRnm(390, 2811); // OPEN
        op[2550] = getOpcodeRnm(340, 2552); // positionLiteral
        op[2551] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {2553,2554,2555}; op[2552] = getOpcodeCat(a);}
        op[2553] = getOpcodeRnm(287, 2195); // doubleValue
        op[2554] = getOpcodeRnm(434, 3219); // SP
        op[2555] = getOpcodeRnm(287, 2195); // doubleValue
        {int[] a = {2557,2558,2559,2560}; op[2556] = getOpcodeCat(a);}
        op[2557] = getOpcodeRnm(353, 2618); // geographyPrefix
        op[2558] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2559] = getOpcodeRnm(342, 2561); // fullPolygonLiteral
        op[2560] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2562,2563}; op[2561] = getOpcodeCat(a);}
        op[2562] = getOpcodeRnm(337, 2539); // sridLiteral
        op[2563] = getOpcodeRnm(343, 2564); // polygonLiteral
        {int[] a = {2565,2566}; op[2564] = getOpcodeCat(a);}
        {char[] a = {80,111,108,121,103,111,110}; op[2565] = getOpcodeTls(a);}
        op[2566] = getOpcodeRnm(344, 2567); // polygonData
        {int[] a = {2568,2569,2570,2574}; op[2567] = getOpcodeCat(a);}
        op[2568] = getOpcodeRnm(390, 2811); // OPEN
        op[2569] = getOpcodeRnm(345, 2575); // ringLiteral
        op[2570] = getOpcodeRep((char)0, Character.MAX_VALUE, 2571);
        {int[] a = {2572,2573}; op[2571] = getOpcodeCat(a);}
        op[2572] = getOpcodeRnm(384, 2794); // COMMA
        op[2573] = getOpcodeRnm(345, 2575); // ringLiteral
        op[2574] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {2576,2577,2578,2582}; op[2575] = getOpcodeCat(a);}
        op[2576] = getOpcodeRnm(390, 2811); // OPEN
        op[2577] = getOpcodeRnm(340, 2552); // positionLiteral
        op[2578] = getOpcodeRep((char)0, Character.MAX_VALUE, 2579);
        {int[] a = {2580,2581}; op[2579] = getOpcodeCat(a);}
        op[2580] = getOpcodeRnm(384, 2794); // COMMA
        op[2581] = getOpcodeRnm(340, 2552); // positionLiteral
        op[2582] = getOpcodeRnm(391, 2814); // CLOSE
        {int[] a = {2584,2585,2586,2587}; op[2583] = getOpcodeCat(a);}
        op[2584] = getOpcodeRnm(354, 2619); // geometryPrefix
        op[2585] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2586] = getOpcodeRnm(319, 2439); // fullCollectionLiteral
        op[2587] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2589,2590,2591,2592}; op[2588] = getOpcodeCat(a);}
        op[2589] = getOpcodeRnm(354, 2619); // geometryPrefix
        op[2590] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2591] = getOpcodeRnm(323, 2463); // fullLineStringLiteral
        op[2592] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2594,2595,2596,2597}; op[2593] = getOpcodeCat(a);}
        op[2594] = getOpcodeRnm(354, 2619); // geometryPrefix
        op[2595] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2596] = getOpcodeRnm(327, 2482); // fullMultiLineStringLiteral
        op[2597] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2599,2600,2601,2602}; op[2598] = getOpcodeCat(a);}
        op[2599] = getOpcodeRnm(354, 2619); // geometryPrefix
        op[2600] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2601] = getOpcodeRnm(330, 2500); // fullMultiPointLiteral
        op[2602] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2604,2605,2606,2607}; op[2603] = getOpcodeCat(a);}
        op[2604] = getOpcodeRnm(354, 2619); // geometryPrefix
        op[2605] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2606] = getOpcodeRnm(333, 2518); // fullMultiPolygonLiteral
        op[2607] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2609,2610,2611,2612}; op[2608] = getOpcodeCat(a);}
        op[2609] = getOpcodeRnm(354, 2619); // geometryPrefix
        op[2610] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2611] = getOpcodeRnm(336, 2536); // fullPointLiteral
        op[2612] = getOpcodeRnm(389, 2808); // SQUOTE
        {int[] a = {2614,2615,2616,2617}; op[2613] = getOpcodeCat(a);}
        op[2614] = getOpcodeRnm(354, 2619); // geometryPrefix
        op[2615] = getOpcodeRnm(389, 2808); // SQUOTE
        op[2616] = getOpcodeRnm(342, 2561); // fullPolygonLiteral
        op[2617] = getOpcodeRnm(389, 2808); // SQUOTE
        {char[] a = {103,101,111,103,114,97,112,104,121}; op[2618] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,121}; op[2619] = getOpcodeTls(a);}
        {int[] a = {2621,2622,2623,2624,2625,2626}; op[2620] = getOpcodeAlt(a);}
        op[2621] = getOpcodeRnm(356, 2627); // content-id
        op[2622] = getOpcodeRnm(358, 2634); // entityid
        op[2623] = getOpcodeRnm(359, 2641); // isolation
        op[2624] = getOpcodeRnm(360, 2648); // odata-maxversion
        op[2625] = getOpcodeRnm(361, 2657); // odata-version
        op[2626] = getOpcodeRnm(362, 2664); // prefer
        {int[] a = {2628,2629,2630,2631}; op[2627] = getOpcodeCat(a);}
        {char[] a = {67,111,110,116,101,110,116,45,73,68}; op[2628] = getOpcodeTls(a);}
        {char[] a = {58}; op[2629] = getOpcodeTls(a);}
        op[2630] = getOpcodeRnm(377, 2764); // OWS
        op[2631] = getOpcodeRnm(357, 2632); // request-id
        op[2632] = getOpcodeRep((char)1, Character.MAX_VALUE, 2633);
        op[2633] = getOpcodeRnm(416, 3055); // unreserved
        {int[] a = {2635,2637,2638,2639,2640}; op[2634] = getOpcodeCat(a);}
        op[2635] = getOpcodeRep((char)0, (char)1, 2636);
        {char[] a = {79,68,97,116,97,45}; op[2636] = getOpcodeTls(a);}
        {char[] a = {69,110,116,105,116,121,73,68}; op[2637] = getOpcodeTls(a);}
        {char[] a = {58}; op[2638] = getOpcodeTls(a);}
        op[2639] = getOpcodeRnm(377, 2764); // OWS
        op[2640] = getOpcodeRnm(427, 3198); // IRI-in-header
        {int[] a = {2642,2644,2645,2646,2647}; op[2641] = getOpcodeCat(a);}
        op[2642] = getOpcodeRep((char)0, (char)1, 2643);
        {char[] a = {79,68,97,116,97,45}; op[2643] = getOpcodeTls(a);}
        {char[] a = {73,115,111,108,97,116,105,111,110}; op[2644] = getOpcodeTls(a);}
        {char[] a = {58}; op[2645] = getOpcodeTls(a);}
        op[2646] = getOpcodeRnm(377, 2764); // OWS
        {char[] a = {115,110,97,112,115,104,111,116}; op[2647] = getOpcodeTls(a);}
        {int[] a = {2649,2650,2651,2652,2654,2655}; op[2648] = getOpcodeCat(a);}
        {char[] a = {79,68,97,116,97,45,77,97,120,86,101,114,115,105,111,110}; op[2649] = getOpcodeTls(a);}
        {char[] a = {58}; op[2650] = getOpcodeTls(a);}
        op[2651] = getOpcodeRnm(377, 2764); // OWS
        op[2652] = getOpcodeRep((char)1, Character.MAX_VALUE, 2653);
        op[2653] = getOpcodeRnm(430, 3207); // DIGIT
        {char[] a = {46}; op[2654] = getOpcodeTls(a);}
        op[2655] = getOpcodeRep((char)1, Character.MAX_VALUE, 2656);
        op[2656] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {2658,2659,2660,2661,2662}; op[2657] = getOpcodeCat(a);}
        {char[] a = {79,68,97,116,97,45,86,101,114,115,105,111,110}; op[2658] = getOpcodeTls(a);}
        {char[] a = {58}; op[2659] = getOpcodeTls(a);}
        op[2660] = getOpcodeRnm(377, 2764); // OWS
        {char[] a = {52,46,48}; op[2661] = getOpcodeTls(a);}
        op[2662] = getOpcodeRep((char)0, (char)1, 2663);
        op[2663] = getOpcodeRnm(305, 2346); // oneToNine
        {int[] a = {2665,2666,2667,2668,2669}; op[2664] = getOpcodeCat(a);}
        {char[] a = {80,114,101,102,101,114}; op[2665] = getOpcodeTls(a);}
        {char[] a = {58}; op[2666] = getOpcodeTls(a);}
        op[2667] = getOpcodeRnm(377, 2764); // OWS
        op[2668] = getOpcodeRnm(363, 2675); // preference
        op[2669] = getOpcodeRep((char)0, Character.MAX_VALUE, 2670);
        {int[] a = {2671,2672,2673,2674}; op[2670] = getOpcodeCat(a);}
        op[2671] = getOpcodeRnm(377, 2764); // OWS
        {char[] a = {44}; op[2672] = getOpcodeTls(a);}
        op[2673] = getOpcodeRnm(377, 2764); // OWS
        op[2674] = getOpcodeRnm(363, 2675); // preference
        {int[] a = {2676,2677,2678,2679,2680,2681,2682,2683,2684}; op[2675] = getOpcodeAlt(a);}
        op[2676] = getOpcodeRnm(364, 2685); // allowEntityReferencesPreference
        op[2677] = getOpcodeRnm(365, 2689); // callbackPreference
        op[2678] = getOpcodeRnm(366, 2701); // continueOnErrorPreference
        op[2679] = getOpcodeRnm(367, 2709); // includeAnnotationsPreference
        op[2680] = getOpcodeRnm(371, 2739); // maxpagesizePreference
        op[2681] = getOpcodeRnm(372, 2747); // respondAsyncPreference
        op[2682] = getOpcodeRnm(373, 2748); // returnPreference
        op[2683] = getOpcodeRnm(374, 2754); // trackChangesPreference
        op[2684] = getOpcodeRnm(375, 2758); // waitPreference
        {int[] a = {2686,2688}; op[2685] = getOpcodeCat(a);}
        op[2686] = getOpcodeRep((char)0, (char)1, 2687);
        {char[] a = {111,100,97,116,97,46}; op[2687] = getOpcodeTls(a);}
        {char[] a = {97,108,108,111,119,45,101,110,116,105,116,121,114,101,102,101,114,101,110,99,101,115}; op[2688] = getOpcodeTls(a);}
        {int[] a = {2690,2692,2693,2694,2695,2696,2697,2698,2699,2700}; op[2689] = getOpcodeCat(a);}
        op[2690] = getOpcodeRep((char)0, (char)1, 2691);
        {char[] a = {111,100,97,116,97,46}; op[2691] = getOpcodeTls(a);}
        {char[] a = {99,97,108,108,98,97,99,107}; op[2692] = getOpcodeTls(a);}
        op[2693] = getOpcodeRnm(377, 2764); // OWS
        {char[] a = {59}; op[2694] = getOpcodeTls(a);}
        op[2695] = getOpcodeRnm(377, 2764); // OWS
        {char[] a = {117,114,108}; op[2696] = getOpcodeTls(a);}
        op[2697] = getOpcodeRnm(379, 2772); // EQ-h
        op[2698] = getOpcodeRnm(433, 3218); // DQUOTE
        op[2699] = getOpcodeRnm(392, 2817); // URI
        op[2700] = getOpcodeRnm(433, 3218); // DQUOTE
        {int[] a = {2702,2704,2705}; op[2701] = getOpcodeCat(a);}
        op[2702] = getOpcodeRep((char)0, (char)1, 2703);
        {char[] a = {111,100,97,116,97,46}; op[2703] = getOpcodeTls(a);}
        {char[] a = {99,111,110,116,105,110,117,101,45,111,110,45,101,114,114,111,114}; op[2704] = getOpcodeTls(a);}
        op[2705] = getOpcodeRep((char)0, (char)1, 2706);
        {int[] a = {2707,2708}; op[2706] = getOpcodeCat(a);}
        op[2707] = getOpcodeRnm(379, 2772); // EQ-h
        op[2708] = getOpcodeRnm(285, 2173); // booleanValue
        {int[] a = {2710,2712,2713,2714,2715,2716}; op[2709] = getOpcodeCat(a);}
        op[2710] = getOpcodeRep((char)0, (char)1, 2711);
        {char[] a = {111,100,97,116,97,46}; op[2711] = getOpcodeTls(a);}
        {char[] a = {105,110,99,108,117,100,101,45,97,110,110,111,116,97,116,105,111,110,115}; op[2712] = getOpcodeTls(a);}
        op[2713] = getOpcodeRnm(379, 2772); // EQ-h
        op[2714] = getOpcodeRnm(433, 3218); // DQUOTE
        op[2715] = getOpcodeRnm(368, 2717); // annotationsList
        op[2716] = getOpcodeRnm(433, 3218); // DQUOTE
        {int[] a = {2718,2719}; op[2717] = getOpcodeCat(a);}
        op[2718] = getOpcodeRnm(369, 2723); // annotationIdentifier
        op[2719] = getOpcodeRep((char)0, Character.MAX_VALUE, 2720);
        {int[] a = {2721,2722}; op[2720] = getOpcodeCat(a);}
        {char[] a = {44}; op[2721] = getOpcodeTls(a);}
        op[2722] = getOpcodeRnm(369, 2723); // annotationIdentifier
        {int[] a = {2724,2726,2734}; op[2723] = getOpcodeCat(a);}
        op[2724] = getOpcodeRep((char)0, (char)1, 2725);
        op[2725] = getOpcodeRnm(370, 2738); // excludeOperator
        {int[] a = {2727,2728}; op[2726] = getOpcodeAlt(a);}
        op[2727] = getOpcodeRnm(388, 2805); // STAR
        {int[] a = {2729,2730,2731}; op[2728] = getOpcodeCat(a);}
        op[2729] = getOpcodeRnm(236, 1970); // namespace
        {char[] a = {46}; op[2730] = getOpcodeTls(a);}
        {int[] a = {2732,2733}; op[2731] = getOpcodeAlt(a);}
        op[2732] = getOpcodeRnm(245, 1984); // termName
        op[2733] = getOpcodeRnm(388, 2805); // STAR
        op[2734] = getOpcodeRep((char)0, (char)1, 2735);
        {int[] a = {2736,2737}; op[2735] = getOpcodeCat(a);}
        {char[] a = {35}; op[2736] = getOpcodeTls(a);}
        op[2737] = getOpcodeRnm(246, 1985); // odataIdentifier
        {char[] a = {45}; op[2738] = getOpcodeTls(a);}
        {int[] a = {2740,2742,2743,2744,2745}; op[2739] = getOpcodeCat(a);}
        op[2740] = getOpcodeRep((char)0, (char)1, 2741);
        {char[] a = {111,100,97,116,97,46}; op[2741] = getOpcodeTls(a);}
        {char[] a = {109,97,120,112,97,103,101,115,105,122,101}; op[2742] = getOpcodeTls(a);}
        op[2743] = getOpcodeRnm(379, 2772); // EQ-h
        op[2744] = getOpcodeRnm(305, 2346); // oneToNine
        op[2745] = getOpcodeRep((char)0, Character.MAX_VALUE, 2746);
        op[2746] = getOpcodeRnm(430, 3207); // DIGIT
        {char[] a = {114,101,115,112,111,110,100,45,97,115,121,110,99}; op[2747] = getOpcodeTls(a);}
        {int[] a = {2749,2750,2751}; op[2748] = getOpcodeCat(a);}
        {char[] a = {114,101,116,117,114,110}; op[2749] = getOpcodeTls(a);}
        op[2750] = getOpcodeRnm(379, 2772); // EQ-h
        {int[] a = {2752,2753}; op[2751] = getOpcodeAlt(a);}
        {char[] a = {114,101,112,114,101,115,101,110,116,97,116,105,111,110}; op[2752] = getOpcodeTbs(a);}
        {char[] a = {109,105,110,105,109,97,108}; op[2753] = getOpcodeTbs(a);}
        {int[] a = {2755,2757}; op[2754] = getOpcodeCat(a);}
        op[2755] = getOpcodeRep((char)0, (char)1, 2756);
        {char[] a = {111,100,97,116,97,46}; op[2756] = getOpcodeTls(a);}
        {char[] a = {116,114,97,99,107,45,99,104,97,110,103,101,115}; op[2757] = getOpcodeTls(a);}
        {int[] a = {2759,2760,2761}; op[2758] = getOpcodeCat(a);}
        {char[] a = {119,97,105,116}; op[2759] = getOpcodeTls(a);}
        op[2760] = getOpcodeRnm(379, 2772); // EQ-h
        op[2761] = getOpcodeRep((char)1, Character.MAX_VALUE, 2762);
        op[2762] = getOpcodeRnm(430, 3207); // DIGIT
        op[2763] = getOpcodeTrg((char)128, (char)255);
        op[2764] = getOpcodeRep((char)0, Character.MAX_VALUE, 2765);
        {int[] a = {2766,2767}; op[2765] = getOpcodeAlt(a);}
        op[2766] = getOpcodeRnm(434, 3219); // SP
        op[2767] = getOpcodeRnm(435, 3220); // HTAB
        op[2768] = getOpcodeRep((char)0, Character.MAX_VALUE, 2769);
        {int[] a = {2770,2771}; op[2769] = getOpcodeAlt(a);}
        op[2770] = getOpcodeRnm(434, 3219); // SP
        op[2771] = getOpcodeRnm(435, 3220); // HTAB
        {int[] a = {2773,2774,2775}; op[2772] = getOpcodeCat(a);}
        op[2773] = getOpcodeRnm(378, 2768); // BWS-h
        op[2774] = getOpcodeRnm(385, 2797); // EQ
        op[2775] = getOpcodeRnm(378, 2768); // BWS-h
        op[2776] = getOpcodeRep((char)1, Character.MAX_VALUE, 2777);
        {int[] a = {2778,2779,2780,2781}; op[2777] = getOpcodeAlt(a);}
        op[2778] = getOpcodeRnm(434, 3219); // SP
        op[2779] = getOpcodeRnm(435, 3220); // HTAB
        {char[] a = {37,50,48}; op[2780] = getOpcodeTls(a);}
        {char[] a = {37,48,57}; op[2781] = getOpcodeTls(a);}
        op[2782] = getOpcodeRep((char)0, Character.MAX_VALUE, 2783);
        {int[] a = {2784,2785,2786,2787}; op[2783] = getOpcodeAlt(a);}
        op[2784] = getOpcodeRnm(434, 3219); // SP
        op[2785] = getOpcodeRnm(435, 3220); // HTAB
        {char[] a = {37,50,48}; op[2786] = getOpcodeTls(a);}
        {char[] a = {37,48,57}; op[2787] = getOpcodeTls(a);}
        {int[] a = {2789,2790}; op[2788] = getOpcodeAlt(a);}
        {char[] a = {64}; op[2789] = getOpcodeTls(a);}
        {char[] a = {37,52,48}; op[2790] = getOpcodeTls(a);}
        {int[] a = {2792,2793}; op[2791] = getOpcodeAlt(a);}
        {char[] a = {58}; op[2792] = getOpcodeTls(a);}
        {char[] a = {37,51,65}; op[2793] = getOpcodeTls(a);}
        {int[] a = {2795,2796}; op[2794] = getOpcodeAlt(a);}
        {char[] a = {44}; op[2795] = getOpcodeTls(a);}
        {char[] a = {37,50,67}; op[2796] = getOpcodeTls(a);}
        {char[] a = {61}; op[2797] = getOpcodeTls(a);}
        {int[] a = {2799,2800,2801}; op[2798] = getOpcodeAlt(a);}
        {char[] a = {43}; op[2799] = getOpcodeTls(a);}
        {char[] a = {37,50,66}; op[2800] = getOpcodeTls(a);}
        {char[] a = {45}; op[2801] = getOpcodeTls(a);}
        {int[] a = {2803,2804}; op[2802] = getOpcodeAlt(a);}
        {char[] a = {59}; op[2803] = getOpcodeTls(a);}
        {char[] a = {37,51,66}; op[2804] = getOpcodeTls(a);}
        {int[] a = {2806,2807}; op[2805] = getOpcodeAlt(a);}
        {char[] a = {42}; op[2806] = getOpcodeTls(a);}
        {char[] a = {37,50,65}; op[2807] = getOpcodeTls(a);}
        {int[] a = {2809,2810}; op[2808] = getOpcodeAlt(a);}
        {char[] a = {39}; op[2809] = getOpcodeTls(a);}
        {char[] a = {37,50,55}; op[2810] = getOpcodeTls(a);}
        {int[] a = {2812,2813}; op[2811] = getOpcodeAlt(a);}
        {char[] a = {40}; op[2812] = getOpcodeTls(a);}
        {char[] a = {37,50,56}; op[2813] = getOpcodeTls(a);}
        {int[] a = {2815,2816}; op[2814] = getOpcodeAlt(a);}
        {char[] a = {41}; op[2815] = getOpcodeTls(a);}
        {char[] a = {37,50,57}; op[2816] = getOpcodeTls(a);}
        {int[] a = {2818,2819,2820,2821,2825}; op[2817] = getOpcodeCat(a);}
        op[2818] = getOpcodeRnm(394, 2836); // scheme
        {char[] a = {58}; op[2819] = getOpcodeTls(a);}
        op[2820] = getOpcodeRnm(393, 2829); // hier-part
        op[2821] = getOpcodeRep((char)0, (char)1, 2822);
        {int[] a = {2823,2824}; op[2822] = getOpcodeCat(a);}
        {char[] a = {63}; op[2823] = getOpcodeTls(a);}
        op[2824] = getOpcodeRnm(413, 3041); // query
        op[2825] = getOpcodeRep((char)0, (char)1, 2826);
        {int[] a = {2827,2828}; op[2826] = getOpcodeCat(a);}
        {char[] a = {35}; op[2827] = getOpcodeTls(a);}
        op[2828] = getOpcodeRnm(414, 3046); // fragment
        {int[] a = {2830,2834,2835}; op[2829] = getOpcodeAlt(a);}
        {int[] a = {2831,2832,2833}; op[2830] = getOpcodeCat(a);}
        {char[] a = {47,47}; op[2831] = getOpcodeTls(a);}
        op[2832] = getOpcodeRnm(395, 2845); // authority
        op[2833] = getOpcodeRnm(407, 3012); // path-abempty
        op[2834] = getOpcodeRnm(408, 3016); // path-absolute
        op[2835] = getOpcodeRnm(409, 3025); // path-rootless
        {int[] a = {2837,2838}; op[2836] = getOpcodeCat(a);}
        op[2837] = getOpcodeRnm(429, 3204); // ALPHA
        op[2838] = getOpcodeRep((char)0, Character.MAX_VALUE, 2839);
        {int[] a = {2840,2841,2842,2843,2844}; op[2839] = getOpcodeAlt(a);}
        op[2840] = getOpcodeRnm(429, 3204); // ALPHA
        op[2841] = getOpcodeRnm(430, 3207); // DIGIT
        {char[] a = {43}; op[2842] = getOpcodeTls(a);}
        {char[] a = {45}; op[2843] = getOpcodeTls(a);}
        {char[] a = {46}; op[2844] = getOpcodeTls(a);}
        {int[] a = {2846,2850,2851}; op[2845] = getOpcodeCat(a);}
        op[2846] = getOpcodeRep((char)0, (char)1, 2847);
        {int[] a = {2848,2849}; op[2847] = getOpcodeCat(a);}
        op[2848] = getOpcodeRnm(396, 2855); // userinfo
        {char[] a = {64}; op[2849] = getOpcodeTls(a);}
        op[2850] = getOpcodeRnm(397, 2861); // host
        op[2851] = getOpcodeRep((char)0, (char)1, 2852);
        {int[] a = {2853,2854}; op[2852] = getOpcodeCat(a);}
        {char[] a = {58}; op[2853] = getOpcodeTls(a);}
        op[2854] = getOpcodeRnm(398, 2865); // port
        op[2855] = getOpcodeRep((char)0, Character.MAX_VALUE, 2856);
        {int[] a = {2857,2858,2859,2860}; op[2856] = getOpcodeAlt(a);}
        op[2857] = getOpcodeRnm(416, 3055); // unreserved
        op[2858] = getOpcodeRnm(415, 3051); // pct-encoded
        op[2859] = getOpcodeRnm(417, 3062); // sub-delims
        {char[] a = {58}; op[2860] = getOpcodeTls(a);}
        {int[] a = {2862,2863,2864}; op[2861] = getOpcodeAlt(a);}
        op[2862] = getOpcodeRnm(399, 2867); // IP-literal
        op[2863] = getOpcodeRnm(404, 2983); // IPv4address
        op[2864] = getOpcodeRnm(406, 3007); // reg-name
        op[2865] = getOpcodeRep((char)0, Character.MAX_VALUE, 2866);
        op[2866] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {2868,2869,2872}; op[2867] = getOpcodeCat(a);}
        {char[] a = {91}; op[2868] = getOpcodeTls(a);}
        {int[] a = {2870,2871}; op[2869] = getOpcodeAlt(a);}
        op[2870] = getOpcodeRnm(401, 2883); // IPv6address
        op[2871] = getOpcodeRnm(400, 2873); // IPvFuture
        {char[] a = {93}; op[2872] = getOpcodeTls(a);}
        {int[] a = {2874,2875,2877,2878}; op[2873] = getOpcodeCat(a);}
        {char[] a = {118}; op[2874] = getOpcodeTls(a);}
        op[2875] = getOpcodeRep((char)1, Character.MAX_VALUE, 2876);
        op[2876] = getOpcodeRnm(431, 3208); // HEXDIG
        {char[] a = {46}; op[2877] = getOpcodeTls(a);}
        op[2878] = getOpcodeRep((char)1, Character.MAX_VALUE, 2879);
        {int[] a = {2880,2881,2882}; op[2879] = getOpcodeAlt(a);}
        op[2880] = getOpcodeRnm(416, 3055); // unreserved
        op[2881] = getOpcodeRnm(417, 3062); // sub-delims
        {char[] a = {58}; op[2882] = getOpcodeTls(a);}
        {int[] a = {2884,2890,2897,2906,2920,2934,2946,2956,2966}; op[2883] = getOpcodeAlt(a);}
        {int[] a = {2885,2889}; op[2884] = getOpcodeCat(a);}
        op[2885] = getOpcodeRep((char)6, (char)6, 2886);
        {int[] a = {2887,2888}; op[2886] = getOpcodeCat(a);}
        op[2887] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58}; op[2888] = getOpcodeTls(a);}
        op[2889] = getOpcodeRnm(403, 2977); // ls32
        {int[] a = {2891,2892,2896}; op[2890] = getOpcodeCat(a);}
        {char[] a = {58,58}; op[2891] = getOpcodeTls(a);}
        op[2892] = getOpcodeRep((char)5, (char)5, 2893);
        {int[] a = {2894,2895}; op[2893] = getOpcodeCat(a);}
        op[2894] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58}; op[2895] = getOpcodeTls(a);}
        op[2896] = getOpcodeRnm(403, 2977); // ls32
        {int[] a = {2898,2900,2901,2905}; op[2897] = getOpcodeCat(a);}
        op[2898] = getOpcodeRep((char)0, (char)1, 2899);
        op[2899] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58,58}; op[2900] = getOpcodeTls(a);}
        op[2901] = getOpcodeRep((char)4, (char)4, 2902);
        {int[] a = {2903,2904}; op[2902] = getOpcodeCat(a);}
        op[2903] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58}; op[2904] = getOpcodeTls(a);}
        op[2905] = getOpcodeRnm(403, 2977); // ls32
        {int[] a = {2907,2914,2915,2919}; op[2906] = getOpcodeCat(a);}
        op[2907] = getOpcodeRep((char)0, (char)1, 2908);
        {int[] a = {2909,2913}; op[2908] = getOpcodeCat(a);}
        op[2909] = getOpcodeRep((char)0, (char)1, 2910);
        {int[] a = {2911,2912}; op[2910] = getOpcodeCat(a);}
        op[2911] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58}; op[2912] = getOpcodeTls(a);}
        op[2913] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58,58}; op[2914] = getOpcodeTls(a);}
        op[2915] = getOpcodeRep((char)3, (char)3, 2916);
        {int[] a = {2917,2918}; op[2916] = getOpcodeCat(a);}
        op[2917] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58}; op[2918] = getOpcodeTls(a);}
        op[2919] = getOpcodeRnm(403, 2977); // ls32
        {int[] a = {2921,2928,2929,2933}; op[2920] = getOpcodeCat(a);}
        op[2921] = getOpcodeRep((char)0, (char)1, 2922);
        {int[] a = {2923,2927}; op[2922] = getOpcodeCat(a);}
        op[2923] = getOpcodeRep((char)0, (char)2, 2924);
        {int[] a = {2925,2926}; op[2924] = getOpcodeCat(a);}
        op[2925] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58}; op[2926] = getOpcodeTls(a);}
        op[2927] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58,58}; op[2928] = getOpcodeTls(a);}
        op[2929] = getOpcodeRep((char)2, (char)2, 2930);
        {int[] a = {2931,2932}; op[2930] = getOpcodeCat(a);}
        op[2931] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58}; op[2932] = getOpcodeTls(a);}
        op[2933] = getOpcodeRnm(403, 2977); // ls32
        {int[] a = {2935,2942,2943,2944,2945}; op[2934] = getOpcodeCat(a);}
        op[2935] = getOpcodeRep((char)0, (char)1, 2936);
        {int[] a = {2937,2941}; op[2936] = getOpcodeCat(a);}
        op[2937] = getOpcodeRep((char)0, (char)3, 2938);
        {int[] a = {2939,2940}; op[2938] = getOpcodeCat(a);}
        op[2939] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58}; op[2940] = getOpcodeTls(a);}
        op[2941] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58,58}; op[2942] = getOpcodeTls(a);}
        op[2943] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58}; op[2944] = getOpcodeTls(a);}
        op[2945] = getOpcodeRnm(403, 2977); // ls32
        {int[] a = {2947,2954,2955}; op[2946] = getOpcodeCat(a);}
        op[2947] = getOpcodeRep((char)0, (char)1, 2948);
        {int[] a = {2949,2953}; op[2948] = getOpcodeCat(a);}
        op[2949] = getOpcodeRep((char)0, (char)4, 2950);
        {int[] a = {2951,2952}; op[2950] = getOpcodeCat(a);}
        op[2951] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58}; op[2952] = getOpcodeTls(a);}
        op[2953] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58,58}; op[2954] = getOpcodeTls(a);}
        op[2955] = getOpcodeRnm(403, 2977); // ls32
        {int[] a = {2957,2964,2965}; op[2956] = getOpcodeCat(a);}
        op[2957] = getOpcodeRep((char)0, (char)1, 2958);
        {int[] a = {2959,2963}; op[2958] = getOpcodeCat(a);}
        op[2959] = getOpcodeRep((char)0, (char)5, 2960);
        {int[] a = {2961,2962}; op[2960] = getOpcodeCat(a);}
        op[2961] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58}; op[2962] = getOpcodeTls(a);}
        op[2963] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58,58}; op[2964] = getOpcodeTls(a);}
        op[2965] = getOpcodeRnm(402, 2975); // h16
        {int[] a = {2967,2974}; op[2966] = getOpcodeCat(a);}
        op[2967] = getOpcodeRep((char)0, (char)1, 2968);
        {int[] a = {2969,2973}; op[2968] = getOpcodeCat(a);}
        op[2969] = getOpcodeRep((char)0, (char)6, 2970);
        {int[] a = {2971,2972}; op[2970] = getOpcodeCat(a);}
        op[2971] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58}; op[2972] = getOpcodeTls(a);}
        op[2973] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58,58}; op[2974] = getOpcodeTls(a);}
        op[2975] = getOpcodeRep((char)1, (char)4, 2976);
        op[2976] = getOpcodeRnm(431, 3208); // HEXDIG
        {int[] a = {2978,2982}; op[2977] = getOpcodeAlt(a);}
        {int[] a = {2979,2980,2981}; op[2978] = getOpcodeCat(a);}
        op[2979] = getOpcodeRnm(402, 2975); // h16
        {char[] a = {58}; op[2980] = getOpcodeTls(a);}
        op[2981] = getOpcodeRnm(402, 2975); // h16
        op[2982] = getOpcodeRnm(404, 2983); // IPv4address
        {int[] a = {2984,2985,2986,2987,2988,2989,2990}; op[2983] = getOpcodeCat(a);}
        op[2984] = getOpcodeRnm(405, 2991); // dec-octet
        {char[] a = {46}; op[2985] = getOpcodeTls(a);}
        op[2986] = getOpcodeRnm(405, 2991); // dec-octet
        {char[] a = {46}; op[2987] = getOpcodeTls(a);}
        op[2988] = getOpcodeRnm(405, 2991); // dec-octet
        {char[] a = {46}; op[2989] = getOpcodeTls(a);}
        op[2990] = getOpcodeRnm(405, 2991); // dec-octet
        {int[] a = {2992,2996,3000,3003,3006}; op[2991] = getOpcodeAlt(a);}
        {int[] a = {2993,2994}; op[2992] = getOpcodeCat(a);}
        {char[] a = {49}; op[2993] = getOpcodeTls(a);}
        op[2994] = getOpcodeRep((char)2, (char)2, 2995);
        op[2995] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {2997,2998,2999}; op[2996] = getOpcodeCat(a);}
        {char[] a = {50}; op[2997] = getOpcodeTls(a);}
        op[2998] = getOpcodeTrg((char)48, (char)52);
        op[2999] = getOpcodeRnm(430, 3207); // DIGIT
        {int[] a = {3001,3002}; op[3000] = getOpcodeCat(a);}
        {char[] a = {50,53}; op[3001] = getOpcodeTls(a);}
        op[3002] = getOpcodeTrg((char)48, (char)53);
        {int[] a = {3004,3005}; op[3003] = getOpcodeCat(a);}
        op[3004] = getOpcodeTrg((char)49, (char)57);
        op[3005] = getOpcodeRnm(430, 3207); // DIGIT
        op[3006] = getOpcodeRnm(430, 3207); // DIGIT
        op[3007] = getOpcodeRep((char)0, Character.MAX_VALUE, 3008);
        {int[] a = {3009,3010,3011}; op[3008] = getOpcodeAlt(a);}
        op[3009] = getOpcodeRnm(416, 3055); // unreserved
        op[3010] = getOpcodeRnm(415, 3051); // pct-encoded
        op[3011] = getOpcodeRnm(417, 3062); // sub-delims
        op[3012] = getOpcodeRep((char)0, Character.MAX_VALUE, 3013);
        {int[] a = {3014,3015}; op[3013] = getOpcodeCat(a);}
        {char[] a = {47}; op[3014] = getOpcodeTls(a);}
        op[3015] = getOpcodeRnm(410, 3031); // segment
        {int[] a = {3017,3018}; op[3016] = getOpcodeCat(a);}
        {char[] a = {47}; op[3017] = getOpcodeTls(a);}
        op[3018] = getOpcodeRep((char)0, (char)1, 3019);
        {int[] a = {3020,3021}; op[3019] = getOpcodeCat(a);}
        op[3020] = getOpcodeRnm(411, 3033); // segment-nz
        op[3021] = getOpcodeRep((char)0, Character.MAX_VALUE, 3022);
        {int[] a = {3023,3024}; op[3022] = getOpcodeCat(a);}
        {char[] a = {47}; op[3023] = getOpcodeTls(a);}
        op[3024] = getOpcodeRnm(410, 3031); // segment
        {int[] a = {3026,3027}; op[3025] = getOpcodeCat(a);}
        op[3026] = getOpcodeRnm(411, 3033); // segment-nz
        op[3027] = getOpcodeRep((char)0, Character.MAX_VALUE, 3028);
        {int[] a = {3029,3030}; op[3028] = getOpcodeCat(a);}
        {char[] a = {47}; op[3029] = getOpcodeTls(a);}
        op[3030] = getOpcodeRnm(410, 3031); // segment
        op[3031] = getOpcodeRep((char)0, Character.MAX_VALUE, 3032);
        op[3032] = getOpcodeRnm(412, 3035); // pchar
        op[3033] = getOpcodeRep((char)1, Character.MAX_VALUE, 3034);
        op[3034] = getOpcodeRnm(412, 3035); // pchar
        {int[] a = {3036,3037,3038,3039,3040}; op[3035] = getOpcodeAlt(a);}
        op[3036] = getOpcodeRnm(416, 3055); // unreserved
        op[3037] = getOpcodeRnm(415, 3051); // pct-encoded
        op[3038] = getOpcodeRnm(417, 3062); // sub-delims
        {char[] a = {58}; op[3039] = getOpcodeTls(a);}
        {char[] a = {64}; op[3040] = getOpcodeTls(a);}
        op[3041] = getOpcodeRep((char)0, Character.MAX_VALUE, 3042);
        {int[] a = {3043,3044,3045}; op[3042] = getOpcodeAlt(a);}
        op[3043] = getOpcodeRnm(412, 3035); // pchar
        {char[] a = {47}; op[3044] = getOpcodeTls(a);}
        {char[] a = {63}; op[3045] = getOpcodeTls(a);}
        op[3046] = getOpcodeRep((char)0, Character.MAX_VALUE, 3047);
        {int[] a = {3048,3049,3050}; op[3047] = getOpcodeAlt(a);}
        op[3048] = getOpcodeRnm(412, 3035); // pchar
        {char[] a = {47}; op[3049] = getOpcodeTls(a);}
        {char[] a = {63}; op[3050] = getOpcodeTls(a);}
        {int[] a = {3052,3053,3054}; op[3051] = getOpcodeCat(a);}
        {char[] a = {37}; op[3052] = getOpcodeTls(a);}
        op[3053] = getOpcodeRnm(431, 3208); // HEXDIG
        op[3054] = getOpcodeRnm(431, 3208); // HEXDIG
        {int[] a = {3056,3057,3058,3059,3060,3061}; op[3055] = getOpcodeAlt(a);}
        op[3056] = getOpcodeRnm(429, 3204); // ALPHA
        op[3057] = getOpcodeRnm(430, 3207); // DIGIT
        {char[] a = {45}; op[3058] = getOpcodeTls(a);}
        {char[] a = {46}; op[3059] = getOpcodeTls(a);}
        {char[] a = {95}; op[3060] = getOpcodeTls(a);}
        {char[] a = {126}; op[3061] = getOpcodeTls(a);}
        {int[] a = {3063,3064,3065,3066,3067}; op[3062] = getOpcodeAlt(a);}
        {char[] a = {36}; op[3063] = getOpcodeTls(a);}
        {char[] a = {38}; op[3064] = getOpcodeTls(a);}
        {char[] a = {39}; op[3065] = getOpcodeTls(a);}
        {char[] a = {61}; op[3066] = getOpcodeTls(a);}
        op[3067] = getOpcodeRnm(418, 3068); // other-delims
        {int[] a = {3069,3070,3071,3072,3073,3074,3075}; op[3068] = getOpcodeAlt(a);}
        {char[] a = {33}; op[3069] = getOpcodeTls(a);}
        {char[] a = {40}; op[3070] = getOpcodeTls(a);}
        {char[] a = {41}; op[3071] = getOpcodeTls(a);}
        {char[] a = {42}; op[3072] = getOpcodeTls(a);}
        {char[] a = {43}; op[3073] = getOpcodeTls(a);}
        {char[] a = {44}; op[3074] = getOpcodeTls(a);}
        {char[] a = {59}; op[3075] = getOpcodeTls(a);}
        {int[] a = {3077,3078,3079,3080,3081,3082,3083,3084}; op[3076] = getOpcodeAlt(a);}
        op[3077] = getOpcodeRnm(416, 3055); // unreserved
        op[3078] = getOpcodeRnm(420, 3085); // pct-encoded-no-SQUOTE
        op[3079] = getOpcodeRnm(418, 3068); // other-delims
        {char[] a = {36}; op[3080] = getOpcodeTls(a);}
        {char[] a = {38}; op[3081] = getOpcodeTls(a);}
        {char[] a = {61}; op[3082] = getOpcodeTls(a);}
        {char[] a = {58}; op[3083] = getOpcodeTls(a);}
        {char[] a = {64}; op[3084] = getOpcodeTls(a);}
        {int[] a = {3086,3099}; op[3085] = getOpcodeAlt(a);}
        {int[] a = {3087,3088,3098}; op[3086] = getOpcodeCat(a);}
        {char[] a = {37}; op[3087] = getOpcodeTls(a);}
        {int[] a = {3089,3090,3091,3092,3093,3094,3095,3096,3097}; op[3088] = getOpcodeAlt(a);}
        {char[] a = {48}; op[3089] = getOpcodeTls(a);}
        {char[] a = {49}; op[3090] = getOpcodeTls(a);}
        {char[] a = {51}; op[3091] = getOpcodeTls(a);}
        {char[] a = {52}; op[3092] = getOpcodeTls(a);}
        {char[] a = {53}; op[3093] = getOpcodeTls(a);}
        {char[] a = {54}; op[3094] = getOpcodeTls(a);}
        {char[] a = {56}; op[3095] = getOpcodeTls(a);}
        {char[] a = {57}; op[3096] = getOpcodeTls(a);}
        op[3097] = getOpcodeRnm(432, 3211); // A-to-F
        op[3098] = getOpcodeRnm(431, 3208); // HEXDIG
        {int[] a = {3100,3101,3102}; op[3099] = getOpcodeCat(a);}
        {char[] a = {37}; op[3100] = getOpcodeTls(a);}
        {char[] a = {50}; op[3101] = getOpcodeTls(a);}
        {int[] a = {3103,3104,3105,3106,3107,3108,3109,3110,3111,3112}; op[3102] = getOpcodeAlt(a);}
        {char[] a = {48}; op[3103] = getOpcodeTls(a);}
        {char[] a = {49}; op[3104] = getOpcodeTls(a);}
        {char[] a = {50}; op[3105] = getOpcodeTls(a);}
        {char[] a = {51}; op[3106] = getOpcodeTls(a);}
        {char[] a = {52}; op[3107] = getOpcodeTls(a);}
        {char[] a = {53}; op[3108] = getOpcodeTls(a);}
        {char[] a = {54}; op[3109] = getOpcodeTls(a);}
        {char[] a = {56}; op[3110] = getOpcodeTls(a);}
        {char[] a = {57}; op[3111] = getOpcodeTls(a);}
        op[3112] = getOpcodeRnm(432, 3211); // A-to-F
        {int[] a = {3114,3115,3116,3117,3118,3119,3120,3121,3122,3123}; op[3113] = getOpcodeAlt(a);}
        op[3114] = getOpcodeRnm(416, 3055); // unreserved
        op[3115] = getOpcodeRnm(415, 3051); // pct-encoded
        op[3116] = getOpcodeRnm(418, 3068); // other-delims
        {char[] a = {58}; op[3117] = getOpcodeTls(a);}
        {char[] a = {64}; op[3118] = getOpcodeTls(a);}
        {char[] a = {47}; op[3119] = getOpcodeTls(a);}
        {char[] a = {63}; op[3120] = getOpcodeTls(a);}
        {char[] a = {36}; op[3121] = getOpcodeTls(a);}
        {char[] a = {39}; op[3122] = getOpcodeTls(a);}
        {char[] a = {61}; op[3123] = getOpcodeTls(a);}
        {int[] a = {3125,3126,3127,3128,3129,3130,3131,3132,3133}; op[3124] = getOpcodeAlt(a);}
        op[3125] = getOpcodeRnm(416, 3055); // unreserved
        op[3126] = getOpcodeRnm(415, 3051); // pct-encoded
        op[3127] = getOpcodeRnm(418, 3068); // other-delims
        {char[] a = {58}; op[3128] = getOpcodeTls(a);}
        {char[] a = {64}; op[3129] = getOpcodeTls(a);}
        {char[] a = {47}; op[3130] = getOpcodeTls(a);}
        {char[] a = {63}; op[3131] = getOpcodeTls(a);}
        {char[] a = {36}; op[3132] = getOpcodeTls(a);}
        {char[] a = {39}; op[3133] = getOpcodeTls(a);}
        {int[] a = {3135,3136,3137,3138,3139,3140,3141}; op[3134] = getOpcodeAlt(a);}
        op[3135] = getOpcodeRnm(416, 3055); // unreserved
        op[3136] = getOpcodeRnm(415, 3051); // pct-encoded
        op[3137] = getOpcodeRnm(418, 3068); // other-delims
        {char[] a = {58}; op[3138] = getOpcodeTls(a);}
        {char[] a = {47}; op[3139] = getOpcodeTls(a);}
        {char[] a = {63}; op[3140] = getOpcodeTls(a);}
        {char[] a = {39}; op[3141] = getOpcodeTls(a);}
        {int[] a = {3143,3144,3145,3146,3147,3148,3149,3150,3151,3152}; op[3142] = getOpcodeAlt(a);}
        op[3143] = getOpcodeRnm(416, 3055); // unreserved
        op[3144] = getOpcodeRnm(425, 3153); // pct-encoded-unescaped
        op[3145] = getOpcodeRnm(418, 3068); // other-delims
        {char[] a = {58}; op[3146] = getOpcodeTls(a);}
        {char[] a = {64}; op[3147] = getOpcodeTls(a);}
        {char[] a = {47}; op[3148] = getOpcodeTls(a);}
        {char[] a = {63}; op[3149] = getOpcodeTls(a);}
        {char[] a = {36}; op[3150] = getOpcodeTls(a);}
        {char[] a = {39}; op[3151] = getOpcodeTls(a);}
        {char[] a = {61}; op[3152] = getOpcodeTls(a);}
        {int[] a = {3154,3167,3181}; op[3153] = getOpcodeAlt(a);}
        {int[] a = {3155,3156,3166}; op[3154] = getOpcodeCat(a);}
        {char[] a = {37}; op[3155] = getOpcodeTls(a);}
        {int[] a = {3157,3158,3159,3160,3161,3162,3163,3164,3165}; op[3156] = getOpcodeAlt(a);}
        {char[] a = {48}; op[3157] = getOpcodeTls(a);}
        {char[] a = {49}; op[3158] = getOpcodeTls(a);}
        {char[] a = {51}; op[3159] = getOpcodeTls(a);}
        {char[] a = {52}; op[3160] = getOpcodeTls(a);}
        {char[] a = {54}; op[3161] = getOpcodeTls(a);}
        {char[] a = {55}; op[3162] = getOpcodeTls(a);}
        {char[] a = {56}; op[3163] = getOpcodeTls(a);}
        {char[] a = {57}; op[3164] = getOpcodeTls(a);}
        op[3165] = getOpcodeRnm(432, 3211); // A-to-F
        op[3166] = getOpcodeRnm(431, 3208); // HEXDIG
        {int[] a = {3168,3169,3170}; op[3167] = getOpcodeCat(a);}
        {char[] a = {37}; op[3168] = getOpcodeTls(a);}
        {char[] a = {50}; op[3169] = getOpcodeTls(a);}
        {int[] a = {3171,3172,3173,3174,3175,3176,3177,3178,3179,3180}; op[3170] = getOpcodeAlt(a);}
        {char[] a = {48}; op[3171] = getOpcodeTls(a);}
        {char[] a = {49}; op[3172] = getOpcodeTls(a);}
        {char[] a = {51}; op[3173] = getOpcodeTls(a);}
        {char[] a = {52}; op[3174] = getOpcodeTls(a);}
        {char[] a = {53}; op[3175] = getOpcodeTls(a);}
        {char[] a = {54}; op[3176] = getOpcodeTls(a);}
        {char[] a = {55}; op[3177] = getOpcodeTls(a);}
        {char[] a = {56}; op[3178] = getOpcodeTls(a);}
        {char[] a = {57}; op[3179] = getOpcodeTls(a);}
        op[3180] = getOpcodeRnm(432, 3211); // A-to-F
        {int[] a = {3182,3183,3184}; op[3181] = getOpcodeCat(a);}
        {char[] a = {37}; op[3182] = getOpcodeTls(a);}
        {char[] a = {53}; op[3183] = getOpcodeTls(a);}
        {int[] a = {3185,3186,3187,3188,3189,3190}; op[3184] = getOpcodeAlt(a);}
        op[3185] = getOpcodeRnm(430, 3207); // DIGIT
        {char[] a = {65}; op[3186] = getOpcodeTls(a);}
        {char[] a = {66}; op[3187] = getOpcodeTls(a);}
        {char[] a = {68}; op[3188] = getOpcodeTls(a);}
        {char[] a = {69}; op[3189] = getOpcodeTls(a);}
        {char[] a = {70}; op[3190] = getOpcodeTls(a);}
        {int[] a = {3192,3193}; op[3191] = getOpcodeAlt(a);}
        op[3192] = getOpcodeRnm(424, 3142); // qchar-unescaped
        {int[] a = {3194,3195}; op[3193] = getOpcodeCat(a);}
        op[3194] = getOpcodeRnm(221, 1882); // escape
        {int[] a = {3196,3197}; op[3195] = getOpcodeAlt(a);}
        op[3196] = getOpcodeRnm(221, 1882); // escape
        op[3197] = getOpcodeRnm(214, 1833); // quotation-mark
        op[3198] = getOpcodeRep((char)1, Character.MAX_VALUE, 3199);
        {int[] a = {3200,3201}; op[3199] = getOpcodeAlt(a);}
        op[3200] = getOpcodeRnm(436, 3221); // VCHAR
        op[3201] = getOpcodeRnm(376, 2763); // obs-text
        op[3202] = getOpcodeRep((char)1, Character.MAX_VALUE, 3203);
        op[3203] = getOpcodeRnm(421, 3113); // qchar-no-AMP
        {int[] a = {3205,3206}; op[3204] = getOpcodeAlt(a);}
        op[3205] = getOpcodeTrg((char)65, (char)90);
        op[3206] = getOpcodeTrg((char)97, (char)122);
        op[3207] = getOpcodeTrg((char)48, (char)57);
        {int[] a = {3209,3210}; op[3208] = getOpcodeAlt(a);}
        op[3209] = getOpcodeRnm(430, 3207); // DIGIT
        op[3210] = getOpcodeRnm(432, 3211); // A-to-F
        {int[] a = {3212,3213,3214,3215,3216,3217}; op[3211] = getOpcodeAlt(a);}
        {char[] a = {65}; op[3212] = getOpcodeTls(a);}
        {char[] a = {66}; op[3213] = getOpcodeTls(a);}
        {char[] a = {67}; op[3214] = getOpcodeTls(a);}
        {char[] a = {68}; op[3215] = getOpcodeTls(a);}
        {char[] a = {69}; op[3216] = getOpcodeTls(a);}
        {char[] a = {70}; op[3217] = getOpcodeTls(a);}
        {char[] a = {34}; op[3218] = getOpcodeTbs(a);}
        {char[] a = {32}; op[3219] = getOpcodeTbs(a);}
        {char[] a = {9}; op[3220] = getOpcodeTbs(a);}
        op[3221] = getOpcodeTrg((char)33, (char)126);
    }

    /** Displays the original SABNF grammar on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; grammar.GrammarUnderTest");
        out.println(";");
        out.println(";------------------------------------------------------------------------------");
        out.println("; OData ABNF Construction Rules Version 4.01 and 4.0");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 06 March 2018");
        out.println(";------------------------------------------------------------------------------");
        out.println(";");
        out.println("; Technical Committee:");
        out.println(";   OASIS Open Data Protocol (OData) TC");
        out.println(";   https://www.oasis-open.org/committees/odata");
        out.println(";");
        out.println("; Chairs:");
        out.println(";   - Ralf Handl (ralf.handl@sap.com), SAP SE");
        out.println(";   - Michael Pizzo (mikep@microsoft.com), Microsoft");
        out.println(";");
        out.println("; Editors:");
        out.println(";   - Ralf Handl (ralf.handl@sap.com), SAP SE");
        out.println(";   - Michael Pizzo (mikep@microsoft.com), Microsoft");
        out.println(";   - Martin Zurmuehl (martin.zurmuehl@sap.com), SAP SE");
        out.println(";");
        out.println("; Additional artifacts: ");
        out.println(";   This grammar is one component of a Work Product which consists of:");
        out.println(";   - OData Version 4.01 Part 1: Protocol");
        out.println(";   - OData Version 4.01 Part 2: URL Conventions");
        out.println(";   - OData ABNF Construction Rules Version 4.01 (this document)");
        out.println(";   - OData ABNF Test Cases Version 4.01");
        out.println(";");
        out.println("; Related work:");
        out.println(";   This specification replaces or supersedes:");
        out.println(";   - OData ABNF Construction Rules Version 4.0");
        out.println(";   This work product is related to");
        out.println(";   - OData Common Schema Definition Language (CSDL) JSON Representation Version 4.01");
        out.println(";   - OData Common Schema Definition Language (CSDL) XML Representation Version 4.01");
        out.println(";   - OData JSON Format Version 4.01");
        out.println(";");
        out.println("; Abstract:");
        out.println(";   The Open Data Protocol (OData) enables the creation of REST-based data");
        out.println(";   services, which allow resources, identified using Uniform Resource");
        out.println(";   Identifiers (URLs) and defined in a data model, to be published and ");
        out.println(";   edited by Web clients using simple HTTP messages. This document defines");
        out.println(";   the URL syntax for requests and the serialization format for primitive ");
        out.println(";   literals in request and response payloads.");
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
        out.println("dummyStartRule = odataUri / header / primitiveValue ; just to please the test parser");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("");
        out.println("odataUri = serviceRoot [ odataRelativeUri ]  ");
        out.println("");
        out.println("serviceRoot = ( \"https\" / \"http\" )                    ; Note: case-insensitive ");
        out.println("              \"://\" host [ \":\" port ]");
        out.println("              \"/\" *( segment-nz \"/\" )");
        out.println("");
        out.println("; Note: dollar-prefixed path segments are case-sensitive!");
        out.println("odataRelativeUri = '$batch'  [ \"?\" batchOptions ]");
        out.println("                 / '$entity' \"?\" entityOptions  ");
        out.println("                 / '$entity' \"/\" optionallyQualifiedEntityTypeName \"?\" entityCastOptions  ");
        out.println("                 / '$metadata' [ \"?\" metadataOptions ] [ context ]");
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
        out.println("             / complexColFunctionImportCall   [ complexColPath ] ");
        out.println("             / complexFunctionImportCall      [ complexPath ] ");
        out.println("             / primitiveColFunctionImportCall [ primitiveColPath ] ");
        out.println("             / primitiveFunctionImportCall    [ primitivePath ] ");
        out.println("             / functionImportCallNoParens");
        out.println("             / crossjoin");
        out.println("             / '$all'                         [ \"/\" optionallyQualifiedEntityTypeName ]");
        out.println("");
        out.println("collectionNavigation = [ \"/\" optionallyQualifiedEntityTypeName ] [ collectionNavPath ]");
        out.println("collectionNavPath    = keyPredicate [ singleNavigation ]");
        out.println("                     / filterInPath [ collectionNavigation ]");
        out.println("                     / each [ boundOperation ]");
        out.println("                     / boundOperation");
        out.println("                     / count");
        out.println("                     / ref");
        out.println("");
        out.println("keyPredicate     = simpleKey / compoundKey / keyPathSegments");
        out.println("simpleKey        = OPEN ( parameterAlias / keyPropertyValue ) CLOSE");
        out.println("compoundKey      = OPEN keyValuePair *( COMMA keyValuePair ) CLOSE");
        out.println("keyValuePair     = ( primitiveKeyProperty / keyPropertyAlias  ) EQ ( parameterAlias / keyPropertyValue )");
        out.println("keyPropertyValue = primitiveLiteral");
        out.println("keyPropertyAlias = odataIdentifier");
        out.println("keyPathSegments  = 1*( \"/\" keyPathLiteral )");
        out.println("keyPathLiteral   = *pchar");
        out.println("");
        out.println("singleNavigation = [ \"/\" optionallyQualifiedEntityTypeName ] ");
        out.println("                   [ \"/\" propertyPath");
        out.println("                   / boundOperation");
        out.println("                   / ref ");
        out.println("                   / value  ; request the media resource of a media entity ");
        out.println("                   ]");
        out.println("");
        out.println("propertyPath = entityColNavigationProperty [ collectionNavigation ]");
        out.println("             / entityNavigationProperty    [ singleNavigation ]");
        out.println("             / complexColProperty          [ complexColPath ]");
        out.println("             / complexProperty             [ complexPath ]");
        out.println("             / primitiveColProperty        [ primitiveColPath ]");
        out.println("             / primitiveProperty           [ primitivePath ]");
        out.println("             / streamProperty              [ boundOperation ]");
        out.println("");
        out.println("primitiveColPath = count / boundOperation / ordinalIndex");
        out.println("");
        out.println("primitivePath  = value / boundOperation");
        out.println("");
        out.println("complexColPath = ordinalIndex");
        out.println("               / [ \"/\" optionallyQualifiedComplexTypeName ] [ count / boundOperation ]");
        out.println("");
        out.println("complexPath    = [ \"/\" optionallyQualifiedComplexTypeName ] ");
        out.println("                 [ \"/\" propertyPath ");
        out.println("                 / boundOperation");
        out.println("                 ]");
        out.println("                 ");
        out.println("filterInPath = '/$filter' EQ parameterAlias");
        out.println("");
        out.println("each  = '/$each'");
        out.println("count = '/$count'");
        out.println("ref   = '/$ref'");
        out.println("value = '/$value'");
        out.println("");
        out.println("ordinalIndex = \"/\" 1*DIGIT");
        out.println("");
        out.println("; boundOperation segments can only be composed if the type of the previous segment ");
        out.println("; matches the type of the first parameter of the action or function being called.");
        out.println("; Note that the rule name reflects the return type of the function.");
        out.println("boundOperation = \"/\" ( boundActionCall");
        out.println("                     / boundEntityColFunctionCall    [ collectionNavigation ] ");
        out.println("                     / boundEntityFunctionCall       [ singleNavigation ] ");
        out.println("                     / boundComplexColFunctionCall   [ complexColPath ] ");
        out.println("                     / boundComplexFunctionCall      [ complexPath ]");
        out.println("                     / boundPrimitiveColFunctionCall [ primitiveColPath ] ");
        out.println("                     / boundPrimitiveFunctionCall    [ primitivePath ] ");
        out.println("                     / boundFunctionCallNoParens");
        out.println("                     )");
        out.println("");
        out.println("actionImportCall = actionImport");
        out.println("boundActionCall  = [ namespace \".\" ] action");
        out.println("                   ; with the added restriction that the binding parameter MUST be either an entity or collection of entities");
        out.println("                   ; and is specified by reference using the URI immediately preceding (to the left) of the boundActionCall");
        out.println("");
        out.println("; The following boundXxxFunctionCall rules have the added restrictions that");
        out.println(";  - the function MUST support binding, and ");
        out.println(";  - the binding parameter type MUST match the type of resource identified by the ");
        out.println(";    URI immediately preceding (to the left) of the boundXxxFunctionCall, and");
        out.println(";  - the functionParameters MUST NOT include the bindingParameter.");
        out.println("boundEntityFunctionCall       = [ namespace \".\" ] entityFunction       functionParameters");
        out.println("boundEntityColFunctionCall    = [ namespace \".\" ] entityColFunction    functionParameters");
        out.println("boundComplexFunctionCall      = [ namespace \".\" ] complexFunction      functionParameters");
        out.println("boundComplexColFunctionCall   = [ namespace \".\" ] complexColFunction   functionParameters");
        out.println("boundPrimitiveFunctionCall    = [ namespace \".\" ] primitiveFunction    functionParameters");
        out.println("boundPrimitiveColFunctionCall = [ namespace \".\" ] primitiveColFunction functionParameters");
        out.println("");
        out.println("boundFunctionCallNoParens     = [ namespace \".\" ] entityFunction");
        out.println("                              / [ namespace \".\" ] entityColFunction");
        out.println("                              / [ namespace \".\" ] complexFunction");
        out.println("                              / [ namespace \".\" ] complexColFunction");
        out.println("                              / [ namespace \".\" ] primitiveFunction");
        out.println("                              / [ namespace \".\" ] primitiveColFunction");
        out.println("");
        out.println("entityFunctionImportCall       = entityFunctionImport       functionParameters");
        out.println("entityColFunctionImportCall    = entityColFunctionImport    functionParameters");
        out.println("complexFunctionImportCall      = complexFunctionImport      functionParameters");
        out.println("complexColFunctionImportCall   = complexColFunctionImport   functionParameters");
        out.println("primitiveFunctionImportCall    = primitiveFunctionImport    functionParameters");
        out.println("primitiveColFunctionImportCall = primitiveColFunctionImport functionParameters");
        out.println("");
        out.println("functionImportCallNoParens     = entityFunctionImport");
        out.println("                               / entityColFunctionImport");
        out.println("                               / complexFunctionImport");
        out.println("                               / complexColFunctionImport");
        out.println("                               / primitiveFunctionImport");
        out.println("                               / primitiveColFunctionImport");
        out.println("");
        out.println("functionParameters = OPEN [ functionParameter *( COMMA functionParameter ) ] CLOSE");
        out.println("functionParameter  = parameterName EQ ( parameterAlias / primitiveLiteral )");
        out.println("parameterName      = odataIdentifier");
        out.println("parameterAlias     = AT odataIdentifier ");
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
        out.println("             / nameAndValue");
        out.println("             / customQueryOption  ");
        out.println("");
        out.println("batchOptions = batchOption *( \"&\" batchOption )   ");
        out.println("batchOption  = format");
        out.println("             /customQueryOption   ");
        out.println("             ");
        out.println("metadataOptions = metadataOption *( \"&\" metadataOption )   ");
        out.println("metadataOption  = format");
        out.println("                /customQueryOption   ");
        out.println("");
        out.println("entityOptions  = *( entityIdOption \"&\" ) id *( \"&\" entityIdOption )");
        out.println("entityIdOption = format");
        out.println("               / customQueryOption");
        out.println("entityCastOptions = *( entityCastOption \"&\" ) id *( \"&\" entityCastOption )");
        out.println("entityCastOption  = entityIdOption");
        out.println("                  / expand ");
        out.println("                  / select");
        out.println("");
        out.println("id = ( \"$id\" / \"id\" ) EQ IRI-in-query       ");
        out.println("");
        out.println("systemQueryOption = compute");
        out.println("                  / deltatoken");
        out.println("                  / expand ");
        out.println("                  / filter ");
        out.println("                  / format ");
        out.println("                  / id");
        out.println("                  / inlinecount ");
        out.println("                  / orderby ");
        out.println("                  / schemaversion");
        out.println("                  / search");
        out.println("                  / select ");
        out.println("                  / skip ");
        out.println("                  / skiptoken");
        out.println("                  / top ");
        out.println("                  / index");
        out.println("");
        out.println("compute          = ( \"$compute\" / \"compute\" ) EQ computeItem *( COMMA computeItem )");
        out.println("computeItem      = commonExpr RWS \"as\" RWS computedProperty");
        out.println("computedProperty = odataIdentifier         ");
        out.println("");
        out.println("expand            = ( \"$expand\" / \"expand\" ) EQ expandItem *( COMMA expandItem )");
        out.println("expandItem        = \"$value\"");
        out.println("                  / expandPath");
        out.println("                  / optionallyQualifiedEntityTypeName \"/\" expandPath");
        out.println("expandPath        = *( ( complexProperty / complexColProperty / optionallyQualifiedComplexTypeName ) \"/\" )");
        out.println("                    ( STAR [ ref / OPEN levels CLOSE ]");
        out.println("                    / streamProperty ");
        out.println("                    / navigationProperty [ \"/\" optionallyQualifiedEntityTypeName ] ");
        out.println("                      [ ref   [ OPEN expandRefOption   *( SEMI expandRefOption   ) CLOSE ]");
        out.println("                      / count [ OPEN expandCountOption *( SEMI expandCountOption ) CLOSE ]");
        out.println("                      /         OPEN expandOption      *( SEMI expandOption      ) CLOSE ");
        out.println("                      ]                    ");
        out.println("                    )");
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
        out.println("                  / compute");
        out.println("                  / levels");
        out.println("                  / aliasAndValue");
        out.println("                ");
        out.println("levels = ( \"$levels\" / \"levels\" ) EQ ( oneToNine *DIGIT / \"max\" )");
        out.println("");
        out.println("filter = ( \"$filter\" / \"filter\" ) EQ boolCommonExpr");
        out.println("");
        out.println("orderby     = ( \"$orderby\" / \"orderby\" ) EQ orderbyItem *( COMMA orderbyItem )");
        out.println("orderbyItem = commonExpr [ RWS ( \"asc\" / \"desc\" ) ]");
        out.println("");
        out.println("skip = ( \"$skip\" / \"skip\" ) EQ 1*DIGIT");
        out.println("top  = ( \"$top\"  / \"top\"  ) EQ 1*DIGIT");
        out.println("");
        out.println("index  = ( \"$index\" / \"index\" ) EQ 1*DIGIT");
        out.println("");
        out.println("format = ( \"$format\" / \"format\" ) EQ");
        out.println("         ( \"atom\"");
        out.println("         / \"json\" ");
        out.println("         / \"xml\"");
        out.println("         / 1*pchar \"/\" 1*pchar ; <a data service specific value indicating a");
        out.println("         )                     ; format specific to the specific data service> or");
        out.println("                               ; <An IANA-defined [IANA-MMT] content type>");
        out.println("                          ");
        out.println("inlinecount = ( \"$count\" / \"count\" ) EQ booleanValue");
        out.println("");
        out.println("schemaversion   = ( \"$schemaversion\" / \"schemaversion\" ) EQ ( STAR / 1*unreserved )");
        out.println("");
        out.println("search     = ( \"$search\" / \"search\" ) EQ BWS searchExpr");
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
        out.println("");
        out.println("; A searchWord is a sequence of one or more letters, digits, commas, or dots.");
        out.println("; This includes Unicode characters of categories L or N using UTF-8 and percent-encoding.");
        out.println("; The words AND, OR, and NOT are not a valid searchWord.");
        out.println("; Expressing this in ABNF is somewhat clumsy, so the following rule is overly generous.");
        out.println("searchWord   = 1*( ALPHA / DIGIT / COMMA / \".\" / pct-encoded )");
        out.println("");
        out.println("select         = ( \"$select\" / \"select\" ) EQ selectItem *( COMMA selectItem )");
        out.println("selectItem     = STAR");
        out.println("               / allOperationsInSchema ");
        out.println("               / selectProperty");
        out.println("               / optionallyQualifiedActionName  ");
        out.println("               / optionallyQualifiedFunctionName  ");
        out.println("               / ( optionallyQualifiedEntityTypeName / optionallyQualifiedComplexTypeName ) ");
        out.println("                 \"/\" ( selectProperty");
        out.println("                     / optionallyQualifiedActionName   ");
        out.println("                     / optionallyQualifiedFunctionName  ");
        out.println("                     )");
        out.println("selectProperty = primitiveProperty  ");
        out.println("               / primitiveColProperty [ OPEN selectOptionPC *( SEMI selectOptionPC ) CLOSE ]");
        out.println("               / navigationProperty");
        out.println("               / selectPath [ OPEN selectOption *( SEMI selectOption ) CLOSE");
        out.println("                            / \"/\" selectProperty ");
        out.println("                            ]");
        out.println("selectPath     = ( complexProperty / complexColProperty ) [ \"/\" optionallyQualifiedComplexTypeName ] ");
        out.println("selectOptionPC = filter / search / inlinecount / orderby / skip / top ");
        out.println("selectOption   = selectOptionPC");
        out.println("               / compute / select / expand / aliasAndValue");
        out.println("");
        out.println("allOperationsInSchema = namespace \".\" STAR                 ");
        out.println("");
        out.println("; The parameterNames uniquely identify the bound function overload");
        out.println("; Necessary only if it has overloads");
        out.println("optionallyQualifiedActionName   = [ namespace \".\" ] action");
        out.println("optionallyQualifiedFunctionName = [ namespace \".\" ] function [ OPEN parameterNames CLOSE ]");
        out.println("");
        out.println("; The names of all non-binding parameters, separated by commas ");
        out.println("parameterNames = parameterName *( COMMA parameterName )");
        out.println("");
        out.println("deltatoken = \"$deltatoken\" EQ 1*( qchar-no-AMP )");
        out.println("");
        out.println("skiptoken = \"$skiptoken\" EQ 1*( qchar-no-AMP )");
        out.println("");
        out.println("aliasAndValue = parameterAlias EQ parameterValue");
        out.println("");
        out.println("nameAndValue = parameterName EQ parameterValue");
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
        out.println("context         = \"#\" contextFragment");
        out.println("contextFragment = 'Collection($ref)'");
        out.println("                / '$ref'");
        out.println("                / 'Collection(Edm.EntityType)'");
        out.println("                / 'Collection(Edm.ComplexType)'");
        out.println("                / singletonEntity [ navigation *( containmentNavigation ) [ \"/\" qualifiedEntityTypeName ] ] [ selectList ]");
        out.println("                / qualifiedTypeName [ selectList ]");
        out.println("                / entitySet ( '/$deletedEntity' / '/$link' / '/$deletedLink' )");
        out.println("                / entitySet keyPredicate \"/\" contextPropertyPath [ selectList ]");
        out.println("                / entitySet [ selectList ] [ '/$entity' / '/$delta' ]");
        out.println("                ");
        out.println("entitySet = entitySetName *( containmentNavigation ) [ \"/\" qualifiedEntityTypeName ]");
        out.println("            ");
        out.println("containmentNavigation = keyPredicate [ \"/\" qualifiedEntityTypeName ] navigation");
        out.println("navigation            = *( \"/\" complexProperty [ \"/\" qualifiedComplexTypeName ] ) \"/\" navigationProperty   ");
        out.println("");
        out.println("selectList         = OPEN [ selectListItem *( COMMA selectListItem ) ] CLOSE");
        out.println("selectListItem     = STAR ; all structural properties");
        out.println("                   / allOperationsInSchema ");
        out.println("                   / [ ( qualifiedEntityTypeName / qualifiedComplexTypeName ) \"/\" ] ");
        out.println("                     ( qualifiedActionName");
        out.println("                     / qualifiedFunctionName ");
        out.println("                     / selectListProperty");
        out.println("                     )");
        out.println("selectListProperty = primitiveProperty  ");
        out.println("                   / primitiveColProperty ");
        out.println("                   / navigationProperty [ \"+\" ] [ selectList ]");
        out.println("                   / ( complexProperty / complexColProperty ) [ \"/\" qualifiedComplexTypeName ] [ \"/\" selectListProperty ]");
        out.println("");
        out.println("contextPropertyPath = primitiveProperty");
        out.println("                    / primitiveColProperty");
        out.println("                    / complexColProperty");
        out.println("                    / complexProperty [ [ \"/\" qualifiedComplexTypeName ] \"/\" contextPropertyPath ]");
        out.println("");
        out.println("qualifiedActionName   = namespace \".\" action");
        out.println("qualifiedFunctionName = namespace \".\" function [ OPEN parameterNames CLOSE ]");
        out.println("                 ");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 4. Expressions");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("; Note: a boolCommonExpr is also a commonExpr, e.g. sort by Boolean ");
        out.println("commonExpr = ( primitiveLiteral");
        out.println("             / arrayOrObject");
        out.println("             / rootExpr");
        out.println("             / firstMemberExpr");
        out.println("             / functionExpr");
        out.println("             / negateExpr ");
        out.println("             / methodCallExpr ");
        out.println("             / parenExpr ");
        out.println("             / listExpr");
        out.println("             / castExpr ");
        out.println("             / isofExpr");
        out.println("             / notExpr");
        out.println("             ) ");
        out.println("             [ addExpr ");
        out.println("             / subExpr ");
        out.println("             / mulExpr ");
        out.println("             / divExpr");
        out.println("             / divbyExpr ");
        out.println("             / modExpr");
        out.println("             ]  ");
        out.println("             [ eqExpr ");
        out.println("             / neExpr ");
        out.println("             / ltExpr  ");
        out.println("             / leExpr  ");
        out.println("             / gtExpr ");
        out.println("             / geExpr ");
        out.println("             / hasExpr ");
        out.println("             / inExpr ");
        out.println("             ]");
        out.println("             [ andExpr ");
        out.println("             / orExpr ");
        out.println("             ] ");
        out.println("");
        out.println("boolCommonExpr = commonExpr ; resulting in a Boolean");
        out.println("");
        out.println("rootExpr = '$root/' ( entitySetName keyPredicate / singletonEntity ) [ singleNavigationExpr ]");
        out.println("");
        out.println("firstMemberExpr = memberExpr");
        out.println("                / inscopeVariableExpr [ \"/\" memberExpr ]");
        out.println("");
        out.println("memberExpr = directMemberExpr");
        out.println("           / ( optionallyQualifiedEntityTypeName / optionallyQualifiedComplexTypeName ) \"/\" directMemberExpr");
        out.println("             ");
        out.println("directMemberExpr = propertyPathExpr");
        out.println("                 / boundFunctionExpr ");
        out.println("                 / annotationExpr");
        out.println("             ");
        out.println("propertyPathExpr = ( entityColNavigationProperty [ collectionNavigationExpr ] ");
        out.println("                   / entityNavigationProperty    [ singleNavigationExpr ] ");
        out.println("                   / complexColProperty          [ complexColPathExpr ]");
        out.println("                   / complexProperty             [ complexPathExpr ] ");
        out.println("                   / primitiveColProperty        [ collectionPathExpr ]");
        out.println("                   / primitiveProperty           [ primitivePathExpr ]");
        out.println("                   / streamProperty              [ primitivePathExpr ]");
        out.println("                   )");
        out.println("                   ");
        out.println("annotationExpr = annotation");
        out.println("                 [ collectionPathExpr");
        out.println("                 / singleNavigationExpr");
        out.println("                 / complexPathExpr");
        out.println("                 / primitivePathExpr");
        out.println("                 ]");
        out.println("                 ");
        out.println("annotation          = AT [ namespace \".\" ] termName [ '#' annotationQualifier ]");
        out.println("annotationQualifier = odataIdentifier                ");
        out.println("                   ");
        out.println("inscopeVariableExpr  = implicitVariableExpr ");
        out.println("                     / parameterAlias");
        out.println("                     / lambdaVariableExpr ; only allowed inside a lambdaPredicateExpr");
        out.println("implicitVariableExpr = '$it'              ; the current instance of the resource identified by the resource path");
        out.println("                     / '$this'            ; the instance on which the query option is evaluated");
        out.println("lambdaVariableExpr   = odataIdentifier");
        out.println("");
        out.println("collectionNavigationExpr = [ \"/\" optionallyQualifiedEntityTypeName ]");
        out.println("                           ( collectionPathExpr");
        out.println("                           / keyPredicate [ singleNavigationExpr ] ");
        out.println("                           )");
        out.println("");
        out.println("singleNavigationExpr = \"/\" memberExpr");
        out.println("");
        out.println("complexColPathExpr = collectionPathExpr");
        out.println("                   / \"/\" optionallyQualifiedComplexTypeName [ collectionPathExpr ]");
        out.println(" ");
        out.println("collectionPathExpr = count [ OPEN expandCountOption *( SEMI expandCountOption ) CLOSE ]");
        out.println("                   / \"/\" anyExpr");
        out.println("                   / \"/\" allExpr");
        out.println("                   / \"/\" boundFunctionExpr");
        out.println("                   / \"/\" annotationExpr");
        out.println(" ");
        out.println("complexPathExpr = \"/\" directMemberExpr");
        out.println("                / \"/\" optionallyQualifiedComplexTypeName [ \"/\" directMemberExpr ]");
        out.println("");
        out.println("primitivePathExpr = \"/\" [ annotationExpr / boundFunctionExpr ]");
        out.println("");
        out.println("boundFunctionExpr = functionExpr ; boundFunction segments can only be composed if the type of the    ");
        out.println("                                 ; previous segment matches the type of the first function parameter");
        out.println("                                     ");
        out.println("functionExpr = [ namespace \".\" ]");
        out.println("               ( entityColFunction    functionExprParameters [ collectionNavigationExpr ] ");
        out.println("               / entityFunction       functionExprParameters [ singleNavigationExpr ] ");
        out.println("               / complexColFunction   functionExprParameters [ complexColPathExpr ]");
        out.println("               / complexFunction      functionExprParameters [ complexPathExpr ] ");
        out.println("               / primitiveColFunction functionExprParameters [ collectionPathExpr ] ");
        out.println("               / primitiveFunction    functionExprParameters [ primitivePathExpr ] ");
        out.println("               )");
        out.println("");
        out.println("functionExprParameters = OPEN [ functionExprParameter *( COMMA functionExprParameter ) ] CLOSE");
        out.println("functionExprParameter  = parameterName EQ ( parameterAlias / parameterValue )");
        out.println("");
        out.println("anyExpr = \"any\" OPEN BWS [ lambdaVariableExpr BWS COLON BWS lambdaPredicateExpr ] BWS CLOSE");
        out.println("allExpr = \"all\" OPEN BWS   lambdaVariableExpr BWS COLON BWS lambdaPredicateExpr   BWS CLOSE");
        out.println("lambdaPredicateExpr = boolCommonExpr ; containing at least one lambdaVariableExpr");
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
        out.println("               / boolMethodCallExpr");
        out.println("");
        out.println("boolMethodCallExpr = endsWithMethodCallExpr ");
        out.println("                   / startsWithMethodCallExpr ");
        out.println("                   / containsMethodCallExpr                                          ");
        out.println("                   / intersectsMethodCallExpr ");
        out.println("                   / hasSubsetMethodCallExpr");
        out.println("                   / hasSubsequenceMethodCallExpr");
        out.println("");
        out.println("concatMethodCallExpr     = \"concat\"     OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("containsMethodCallExpr   = \"contains\"   OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("endsWithMethodCallExpr   = \"endswith\"   OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("indexOfMethodCallExpr    = \"indexof\"    OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("lengthMethodCallExpr     = \"length\"     OPEN BWS commonExpr BWS CLOSE");
        out.println("startsWithMethodCallExpr = \"startswith\" OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("substringMethodCallExpr  = \"substring\"  OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS [ COMMA BWS commonExpr BWS ] CLOSE");
        out.println("toLowerMethodCallExpr    = \"tolower\"    OPEN BWS commonExpr BWS CLOSE");
        out.println("toUpperMethodCallExpr    = \"toupper\"    OPEN BWS commonExpr BWS CLOSE");
        out.println("trimMethodCallExpr       = \"trim\"       OPEN BWS commonExpr BWS CLOSE");
        out.println("");
        out.println("yearMethodCallExpr               = \"year\"               OPEN BWS commonExpr BWS CLOSE");
        out.println("monthMethodCallExpr              = \"month\"              OPEN BWS commonExpr BWS CLOSE");
        out.println("dayMethodCallExpr                = \"day\"                OPEN BWS commonExpr BWS CLOSE");
        out.println("hourMethodCallExpr               = \"hour\"               OPEN BWS commonExpr BWS CLOSE");
        out.println("minuteMethodCallExpr             = \"minute\"             OPEN BWS commonExpr BWS CLOSE");
        out.println("secondMethodCallExpr             = \"second\"             OPEN BWS commonExpr BWS CLOSE");
        out.println("fractionalsecondsMethodCallExpr  = \"fractionalseconds\"  OPEN BWS commonExpr BWS CLOSE");
        out.println("totalsecondsMethodCallExpr       = \"totalseconds\"       OPEN BWS commonExpr BWS CLOSE");
        out.println("dateMethodCallExpr               = \"date\"               OPEN BWS commonExpr BWS CLOSE");
        out.println("timeMethodCallExpr               = \"time\"               OPEN BWS commonExpr BWS CLOSE");
        out.println("totalOffsetMinutesMethodCallExpr = \"totaloffsetminutes\" OPEN BWS commonExpr BWS CLOSE ");
        out.println("");
        out.println("minDateTimeMethodCallExpr = \"mindatetime\" OPEN BWS CLOSE");
        out.println("maxDateTimeMethodCallExpr = \"maxdatetime\" OPEN BWS CLOSE");
        out.println("nowMethodCallExpr         = \"now\"         OPEN BWS CLOSE");
        out.println("");
        out.println("roundMethodCallExpr   = \"round\"   OPEN BWS commonExpr BWS CLOSE");
        out.println("floorMethodCallExpr   = \"floor\"   OPEN BWS commonExpr BWS CLOSE");
        out.println("ceilingMethodCallExpr = \"ceiling\" OPEN BWS commonExpr BWS CLOSE");
        out.println("");
        out.println("distanceMethodCallExpr   = \"geo.distance\"   OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("geoLengthMethodCallExpr  = \"geo.length\"     OPEN BWS commonExpr BWS CLOSE");
        out.println("intersectsMethodCallExpr = \"geo.intersects\" OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("");
        out.println("hasSubsetMethodCallExpr      = \"hassubset\"      OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("hasSubsequenceMethodCallExpr = \"hassubsequence\" OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("");
        out.println("parenExpr = OPEN BWS commonExpr BWS CLOSE");
        out.println("listExpr  = OPEN BWS commonExpr BWS *( COMMA BWS commonExpr BWS ) CLOSE");
        out.println("");
        out.println("andExpr = RWS \"and\" RWS boolCommonExpr");
        out.println("orExpr  = RWS \"or\"  RWS boolCommonExpr");
        out.println("");
        out.println("eqExpr = RWS \"eq\" RWS commonExpr     ");
        out.println("neExpr = RWS \"ne\" RWS commonExpr");
        out.println("ltExpr = RWS \"lt\" RWS commonExpr");
        out.println("leExpr = RWS \"le\" RWS commonExpr");
        out.println("gtExpr = RWS \"gt\" RWS commonExpr");
        out.println("geExpr = RWS \"ge\" RWS commonExpr");
        out.println("inExpr = RWS \"in\" RWS commonExpr");
        out.println("");
        out.println("hasExpr = RWS \"has\" RWS enum");
        out.println("");
        out.println("addExpr   = RWS \"add\"   RWS commonExpr");
        out.println("subExpr   = RWS \"sub\"   RWS commonExpr");
        out.println("mulExpr   = RWS \"mul\"   RWS commonExpr");
        out.println("divExpr   = RWS \"div\"   RWS commonExpr");
        out.println("divbyExpr = RWS \"divby\" RWS commonExpr");
        out.println("modExpr   = RWS \"mod\"   RWS commonExpr");
        out.println("");
        out.println("negateExpr = \"-\" BWS commonExpr");
        out.println("");
        out.println("notExpr = \"not\" RWS boolCommonExpr");
        out.println("");
        out.println("isofExpr = \"isof\" OPEN BWS [ commonExpr BWS COMMA BWS ] optionallyQualifiedTypeName BWS CLOSE");
        out.println("castExpr = \"cast\" OPEN BWS [ commonExpr BWS COMMA BWS ] optionallyQualifiedTypeName BWS CLOSE");
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
        out.println("annotationInUri = quotation-mark AT [ namespace \".\" ] termName quotation-mark");
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
        out.println("end-object   = BWS ( \"}\" / \"%7D\" )");
        out.println("");
        out.println("begin-array = BWS ( \"[\" / \"%5B\" ) BWS ");
        out.println("end-array   = BWS ( \"]\" / \"%5D\" )");
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
        out.println("                      / ( \"/\" / \"%2F\" ) ; solidus         U+002F - literal form is allowed in the query part of a URL");
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
        out.println("qualifiedTypeName = singleQualifiedTypeName                  ");
        out.println("                  / 'Collection' OPEN singleQualifiedTypeName CLOSE");
        out.println("");
        out.println("optionallyQualifiedTypeName = singleQualifiedTypeName                  ");
        out.println("                            / 'Collection' OPEN singleQualifiedTypeName CLOSE");
        out.println("                            / singleTypeName");
        out.println("                            / 'Collection' OPEN singleTypeName CLOSE");
        out.println("");
        out.println("singleQualifiedTypeName = qualifiedEntityTypeName ");
        out.println("                        / qualifiedComplexTypeName");
        out.println("                        / qualifiedTypeDefinitionName");
        out.println("                        / qualifiedEnumTypeName");
        out.println("                        / primitiveTypeName ");
        out.println("                        ");
        out.println("singleTypeName = entityTypeName ");
        out.println("               / complexTypeName ");
        out.println("               / typeDefinitionName ");
        out.println("               / enumerationTypeName                         ");
        out.println("                  ");
        out.println("qualifiedEntityTypeName     = namespace \".\" entityTypeName");
        out.println("qualifiedComplexTypeName    = namespace \".\" complexTypeName");
        out.println("qualifiedTypeDefinitionName = namespace \".\" typeDefinitionName ");
        out.println("qualifiedEnumTypeName       = namespace \".\" enumerationTypeName");
        out.println("");
        out.println("optionallyQualifiedEntityTypeName     = [ namespace \".\" ] entityTypeName");
        out.println("optionallyQualifiedComplexTypeName    = [ namespace \".\" ] complexTypeName");
        out.println("");
        out.println("; an alias is just a single-part namespace");
        out.println("namespace     = namespacePart *( \".\" namespacePart )");
        out.println("namespacePart = odataIdentifier");
        out.println("");
        out.println("entitySetName       = odataIdentifier");
        out.println("singletonEntity     = odataIdentifier          ");
        out.println("entityTypeName      = odataIdentifier");
        out.println("complexTypeName     = odataIdentifier");
        out.println("typeDefinitionName  = odataIdentifier ");
        out.println("enumerationTypeName = odataIdentifier");
        out.println("enumerationMember   = odataIdentifier");
        out.println("termName            = odataIdentifier");
        out.println("");
        out.println("; Note: this pattern is overly restrictive, the normative definition is type TSimpleIdentifier in OData EDM XML Schema");
        out.println("odataIdentifier             = identifierLeadingCharacter *127identifierCharacter");
        out.println("identifierLeadingCharacter  = ALPHA / \"_\"         ; plus Unicode characters from the categories L or Nl");
        out.println("identifierCharacter         = ALPHA / \"_\" / DIGIT ; plus Unicode characters from the categories L, Nl, Nd, Mn, Mc, Pc, or Cf");
        out.println("");
        out.println("primitiveTypeName = 'Edm.' ( 'Binary'");
        out.println("                           / 'Boolean'");
        out.println("                           / 'Byte'");
        out.println("                           / 'Date' ");
        out.println("                           / 'DateTimeOffset'");
        out.println("                           / 'Decimal'");
        out.println("                           / 'Double'");
        out.println("                           / 'Duration' ");
        out.println("                           / 'Guid' ");
        out.println("                           / 'Int16'");
        out.println("                           / 'Int32'");
        out.println("                           / 'Int64'");
        out.println("                           / 'SByte'");
        out.println("                           / 'Single'");
        out.println("                           / 'Stream'");
        out.println("                           / 'String'");
        out.println("                           / 'TimeOfDay'");
        out.println("                           / abstractSpatialTypeName [ concreteSpatialTypeName ] ");
        out.println("                           )");
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
        out.println("; in URLs");
        out.println("primitiveLiteral = nullValue                  ; plain values up to int64Value");
        out.println("                 / booleanValue ");
        out.println("                 / guidValue ");
        out.println("                 / dateTimeOffsetValueInUrl ");
        out.println("                 / dateValue");
        out.println("                 / timeOfDayValueInUrl");
        out.println("                 / decimalValue ");
        out.println("                 / doubleValue ");
        out.println("                 / singleValue ");
        out.println("                 / sbyteValue ");
        out.println("                 / byteValue");
        out.println("                 / int16Value ");
        out.println("                 / int32Value ");
        out.println("                 / int64Value ");
        out.println("                 / string                     ; single-quoted");
        out.println("                 / duration");
        out.println("                 / enum");
        out.println("                 / binary                     ; all others are quoted and prefixed ");
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
        out.println("                 / geometryPolygon");
        out.println("         ");
        out.println("; in Atom and JSON message bodies and CSDL DefaultValue attributes                 ");
        out.println("primitiveValue = booleanValue");
        out.println("               / guidValue");
        out.println("               / durationValue");
        out.println("               / dateTimeOffsetValue ");
        out.println("               / dateValue");
        out.println("               / timeOfDayValue");
        out.println("               / enumValue");
        out.println("               / fullCollectionLiteral");
        out.println("               / fullLineStringLiteral");
        out.println("               / fullMultiPointLiteral");
        out.println("               / fullMultiLineStringLiteral");
        out.println("               / fullMultiPolygonLiteral");
        out.println("               / fullPointLiteral");
        out.println("               / fullPolygonLiteral");
        out.println("               / decimalValue ");
        out.println("               / doubleValue ");
        out.println("               / singleValue ");
        out.println("               / sbyteValue ");
        out.println("               / byteValue");
        out.println("               / int16Value ");
        out.println("               / int32Value ");
        out.println("               / int64Value ");
        out.println("               / binaryValue ");
        out.println("               ; also valid are:");
        out.println("               ; - any XML string for strings in Atom and CSDL documents");
        out.println("               ; - any JSON string for JSON documents ");
        out.println("");
        out.println("nullValue = 'null' ");
        out.println("");
        out.println("; base64url encoding according to http://tools.ietf.org/html/rfc4648#section-5                                             ");
        out.println("binary      = \"binary\" SQUOTE binaryValue SQUOTE");
        out.println("binaryValue = *(4base64char) [ base64b16  / base64b8 ]");
        out.println("base64b16   = 2base64char ( 'A' / 'E' / 'I' / 'M' / 'Q' / 'U' / 'Y' / 'c' / 'g' / 'k' / 'o' / 's' / 'w' / '0' / '4' / '8' )   [ \"=\" ]");
        out.println("base64b8    = base64char ( 'A' / 'Q' / 'g' / 'w' ) [ \"==\" ]");
        out.println("base64char  = ALPHA / DIGIT / \"-\" / \"_\"");
        out.println("");
        out.println("booleanValue = \"true\" / \"false\"");
        out.println("");
        out.println("decimalValue = [ SIGN ] 1*DIGIT [ \".\" 1*DIGIT ] [ \"e\" [ SIGN ] 1*DIGIT ] / nanInfinity");
        out.println("doubleValue  = decimalValue ; IEEE 754 binary64 floating-point number (15-17 decimal digits)");
        out.println("singleValue  = decimalValue ; IEEE 754 binary32 floating-point number (6-9 decimal digits)");
        out.println("nanInfinity  = 'NaN' / '-INF' / 'INF'");
        out.println("");
        out.println("guidValue = 8HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 12HEXDIG ");
        out.println("");
        out.println("byteValue  = 1*3DIGIT           ; numbers in the range from 0 to 255");
        out.println("sbyteValue = [ SIGN ] 1*3DIGIT  ; numbers in the range from -128 to 127");
        out.println("int16Value = [ SIGN ] 1*5DIGIT  ; numbers in the range from -32768 to 32767        ");
        out.println("int32Value = [ SIGN ] 1*10DIGIT ; numbers in the range from -2147483648 to 2147483647");
        out.println("int64Value = [ SIGN ] 1*19DIGIT ; numbers in the range from -9223372036854775808 to 9223372036854775807");
        out.println("");
        out.println("string           = SQUOTE *( SQUOTE-in-string / pchar-no-SQUOTE ) SQUOTE");
        out.println("SQUOTE-in-string = SQUOTE SQUOTE ; two consecutive single quotes represent one within a string literal");
        out.println("");
        out.println("dateValue = year \"-\" month \"-\" day");
        out.println("");
        out.println("dateTimeOffsetValue      = year \"-\" month \"-\" day \"T\" timeOfDayValue      ( \"Z\" / SIGN hour \":\"   minute )");
        out.println("dateTimeOffsetValueInUrl = year \"-\" month \"-\" day \"T\" timeOfDayValueInUrl ( \"Z\" / SIGN hour COLON minute )");
        out.println("");
        out.println("duration      = [ \"duration\" ] SQUOTE durationValue SQUOTE");
        out.println("durationValue = [ SIGN ] \"P\" [ 1*DIGIT \"D\" ] [ \"T\" [ 1*DIGIT \"H\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT [ \".\" 1*DIGIT ] \"S\" ] ]");
        out.println("     ; the above is an approximation of the rules for an xml dayTimeDuration.");
        out.println("     ; see the lexical representation for dayTimeDuration in http://www.w3.org/TR/xmlschema11-2#dayTimeDuration for more information");
        out.println("");
        out.println("timeOfDayValue      = hour \":\"   minute [ \":\"   second [ \".\" fractionalSeconds ] ]");
        out.println("timeOfDayValueInUrl = hour COLON minute [ COLON second [ \".\" fractionalSeconds ] ]");
        out.println(" ");
        out.println("oneToNine       = \"1\" / \"2\" / \"3\" / \"4\" / \"5\" / \"6\" / \"7\" / \"8\" / \"9\" ");
        out.println("zeroToFiftyNine = ( \"0\" / \"1\" / \"2\" / \"3\" / \"4\" / \"5\" ) DIGIT");
        out.println("year  = [ \"-\" ] ( \"0\" 3DIGIT / oneToNine 3*DIGIT )");
        out.println("month = \"0\" oneToNine");
        out.println("      / \"1\" ( \"0\" / \"1\" / \"2\" )");
        out.println("day   = \"0\" oneToNine");
        out.println("      / ( \"1\" / \"2\" ) DIGIT");
        out.println("      / \"3\" ( \"0\" / \"1\" )");
        out.println("hour   = ( \"0\" / \"1\" ) DIGIT");
        out.println("       / \"2\" ( \"0\" / \"1\" / \"2\" / \"3\" ) ");
        out.println("minute = zeroToFiftyNine");
        out.println("second = zeroToFiftyNine       ");
        out.println("fractionalSeconds = 1*12DIGIT");
        out.println("");
        out.println("enum            = [ qualifiedEnumTypeName ] SQUOTE enumValue SQUOTE");
        out.println("enumValue       = singleEnumValue *( COMMA singleEnumValue )");
        out.println("singleEnumValue = enumerationMember / enumMemberValue");
        out.println("enumMemberValue = int64Value");
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
        out.println("header = content-id");
        out.println("       / entityid ");
        out.println("       / isolation");
        out.println("       / odata-maxversion");
        out.println("       / odata-version");
        out.println("       / prefer");
        out.println("");
        out.println("content-id = \"Content-ID\" \":\" OWS request-id");
        out.println("request-id = 1*unreserved");
        out.println("       ");
        out.println("entityid   = [ \"OData-\" ] \"EntityID\" \":\" OWS IRI-in-header");
        out.println("isolation  = [ \"OData-\" ] \"Isolation\" \":\" OWS \"snapshot\"");
        out.println("odata-maxversion = \"OData-MaxVersion\" \":\" OWS 1*DIGIT \".\" 1*DIGIT     ");
        out.println("odata-version    = \"OData-Version\"    \":\" OWS \"4.0\" [ oneToNine ]");
        out.println("      ");
        out.println("prefer     = \"Prefer\" \":\" OWS preference *( OWS \",\" OWS preference )       ");
        out.println("preference = allowEntityReferencesPreference");
        out.println("           / callbackPreference");
        out.println("           / continueOnErrorPreference");
        out.println("           / includeAnnotationsPreference");
        out.println("           / maxpagesizePreference");
        out.println("           / respondAsyncPreference");
        out.println("           / returnPreference");
        out.println("           / trackChangesPreference");
        out.println("           / waitPreference");
        out.println("           ; and everything allowed by https://tools.ietf.org/html/rfc7240");
        out.println("           ; / ( parameter / token ) *( OWS \";\" [ OWS ( parameter / token ) ] )");
        out.println("           ");
        out.println("allowEntityReferencesPreference = [ \"odata.\" ] \"allow-entityreferences\"");
        out.println("");
        out.println("callbackPreference = [ \"odata.\" ] \"callback\" OWS \";\" OWS \"url\" EQ-h DQUOTE URI DQUOTE");
        out.println("");
        out.println("continueOnErrorPreference = [ \"odata.\" ] \"continue-on-error\" [ EQ-h booleanValue ]   ");
        out.println("           ");
        out.println("includeAnnotationsPreference = [ \"odata.\" ] \"include-annotations\" EQ-h DQUOTE annotationsList DQUOTE");
        out.println("annotationsList      = annotationIdentifier *(\",\" annotationIdentifier)");
        out.println("annotationIdentifier = [ excludeOperator ]");
        out.println("                       ( STAR ");
        out.println("                       / namespace \".\" ( termName / STAR ) ");
        out.println("                       ) ");
        out.println("                       [ \"#\" odataIdentifier ]");
        out.println("excludeOperator      = \"-\"");
        out.println("           ");
        out.println("maxpagesizePreference = [ \"odata.\" ] \"maxpagesize\" EQ-h oneToNine *DIGIT         ");
        out.println("");
        out.println("respondAsyncPreference = \"respond-async\"");
        out.println("");
        out.println("returnPreference = \"return\" EQ-h ( 'representation' / 'minimal' )");
        out.println("");
        out.println("trackChangesPreference = [ \"odata.\" ] \"track-changes\"");
        out.println("");
        out.println("waitPreference = \"wait\" EQ-h 1*DIGIT");
        out.println("");
        out.println(";parameter      = token \"=\" ( token / quoted-string )");
        out.println(";token          = 1*tchar");
        out.println(";tchar          = \"!\" / \"#\" / \"$\" / \"%\" / \"&\" / \"'\" / \"*\"");
        out.println(";               / \"+\" / \"-\" / \".\" / \"^\" / \"_\" / \"`\" / \"|\" / \"~\"");
        out.println(";               / DIGIT / ALPHA");
        out.println(";quoted-string  = DQUOTE *( qdtext / quoted-pair ) DQUOTE");
        out.println(";qdtext         = %x21 / %x23-5B / %x5D-7E / obs-text / OWS");
        out.println("obs-text       = %x80-FF");
        out.println(";quoted-pair    = \"\\\" ( HTAB / SP / VCHAR / obs-text )");
        out.println("");
        out.println("OWS   = *( SP / HTAB )  ; \"optional\" whitespace ");
        out.println("BWS-h = *( SP / HTAB )  ; \"bad\" whitespace in header values ");
        out.println("EQ-h  = BWS-h EQ BWS-h ");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 9. Punctuation");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("RWS = 1*( SP / HTAB / \"%20\" / \"%09\" )  ; \"required\" whitespace ");
        out.println("BWS =  *( SP / HTAB / \"%20\" / \"%09\" )  ; \"bad\" whitespace ");
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
        out.println("pct-encoded-unescaped = \"%\" ( \"0\" / \"1\" /   \"3\" / \"4\" /   \"6\" / \"7\" / \"8\" / \"9\" / A-to-F ) HEXDIG ");
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
    }
}
