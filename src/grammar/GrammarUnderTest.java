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
    public static int ruleCount = 368;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>364</code>, name = <code>"A-to-F"</code> */
        A_TO_F("A-to-F", 364, 2657, 7),
        /** id = <code>216</code>, name = <code>"abstractSpatialTypeName"</code> */
        ABSTRACTSPATIALTYPENAME("abstractSpatialTypeName", 216, 1725, 3),
        /** id = <code>230</code>, name = <code>"action"</code> */
        ACTION("action", 230, 1757, 1),
        /** id = <code>231</code>, name = <code>"actionImport"</code> */
        ACTIONIMPORT("actionImport", 231, 1758, 1),
        /** id = <code>19</code>, name = <code>"actionImportCall"</code> */
        ACTIONIMPORTCALL("actionImportCall", 19, 197, 6),
        /** id = <code>165</code>, name = <code>"addExpr"</code> */
        ADDEXPR("addExpr", 165, 1404, 5),
        /** id = <code>45</code>, name = <code>"aggregateParam"</code> */
        AGGREGATEPARAM("aggregateParam", 45, 361, 29),
        /** id = <code>44</code>, name = <code>"aggregateTrafo"</code> */
        AGGREGATETRAFO("aggregateTrafo", 44, 346, 15),
        /** id = <code>47</code>, name = <code>"aggregationFunction"</code> */
        AGGREGATIONFUNCTION("aggregationFunction", 47, 403, 10),
        /** id = <code>92</code>, name = <code>"aliasAndValue"</code> */
        ALIASANDVALUE("aliasAndValue", 92, 803, 4),
        /** id = <code>119</code>, name = <code>"allExpr"</code> */
        ALLEXPR("allExpr", 119, 1052, 11),
        /** id = <code>86</code>, name = <code>"allOperationsInSchema"</code> */
        ALLOPERATIONSINSCHEMA("allOperationsInSchema", 86, 766, 4),
        /** id = <code>361</code>, name = <code>"ALPHA"</code> */
        ALPHA("ALPHA", 361, 2650, 3),
        /** id = <code>156</code>, name = <code>"andExpr"</code> */
        ANDEXPR("andExpr", 156, 1359, 5),
        /** id = <code>118</code>, name = <code>"anyExpr"</code> */
        ANYEXPR("anyExpr", 118, 1039, 13),
        /** id = <code>41</code>, name = <code>"apply"</code> */
        APPLY("apply", 41, 323, 4),
        /** id = <code>42</code>, name = <code>"applyExpr"</code> */
        APPLYEXPR("applyExpr", 42, 327, 6),
        /** id = <code>43</code>, name = <code>"applyTrafo"</code> */
        APPLYTRAFO("applyTrafo", 43, 333, 13),
        /** id = <code>327</code>, name = <code>"AT"</code> */
        AT("AT", 327, 2316, 3),
        /** id = <code>186</code>, name = <code>"begin-array"</code> */
        BEGIN_ARRAY("begin-array", 186, 1560, 6),
        /** id = <code>184</code>, name = <code>"begin-object"</code> */
        BEGIN_OBJECT("begin-object", 184, 1548, 6),
        /** id = <code>247</code>, name = <code>"binary"</code> */
        BINARY("binary", 247, 1818, 7),
        /** id = <code>248</code>, name = <code>"binaryBody"</code> */
        BINARYBODY("binaryBody", 248, 1825, 3),
        /** id = <code>101</code>, name = <code>"boolCommonExpr"</code> */
        BOOLCOMMONEXPR("boolCommonExpr", 101, 882, 21),
        /** id = <code>249</code>, name = <code>"boolean"</code> */
        BOOLEAN("boolean", 249, 1828, 7),
        /** id = <code>122</code>, name = <code>"boolMethodCallExpr"</code> */
        BOOLMETHODCALLEXPR("boolMethodCallExpr", 122, 1092, 5),
        /** id = <code>154</code>, name = <code>"boolParenExpr"</code> */
        BOOLPARENEXPR("boolParenExpr", 154, 1347, 6),
        /** id = <code>48</code>, name = <code>"bottomcountTrafo"</code> */
        BOTTOMCOUNTTRAFO("bottomcountTrafo", 48, 413, 11),
        /** id = <code>49</code>, name = <code>"bottompercentTrafo"</code> */
        BOTTOMPERCENTTRAFO("bottompercentTrafo", 49, 424, 11),
        /** id = <code>50</code>, name = <code>"bottomsumTrafo"</code> */
        BOTTOMSUMTRAFO("bottomsumTrafo", 50, 435, 11),
        /** id = <code>20</code>, name = <code>"boundActionCall"</code> */
        BOUNDACTIONCALL("boundActionCall", 20, 203, 6),
        /** id = <code>24</code>, name = <code>"boundComplexColFuncCall"</code> */
        BOUNDCOMPLEXCOLFUNCCALL("boundComplexColFuncCall", 24, 224, 5),
        /** id = <code>23</code>, name = <code>"boundComplexFuncCall"</code> */
        BOUNDCOMPLEXFUNCCALL("boundComplexFuncCall", 23, 219, 5),
        /** id = <code>22</code>, name = <code>"boundEntityColFuncCall"</code> */
        BOUNDENTITYCOLFUNCCALL("boundEntityColFuncCall", 22, 214, 5),
        /** id = <code>21</code>, name = <code>"boundEntityFuncCall"</code> */
        BOUNDENTITYFUNCCALL("boundEntityFuncCall", 21, 209, 5),
        /** id = <code>114</code>, name = <code>"boundFunctionExpr"</code> */
        BOUNDFUNCTIONEXPR("boundFunctionExpr", 114, 987, 1),
        /** id = <code>18</code>, name = <code>"boundOperation"</code> */
        BOUNDOPERATION("boundOperation", 18, 169, 28),
        /** id = <code>26</code>, name = <code>"boundPrimitiveColFuncCall"</code> */
        BOUNDPRIMITIVECOLFUNCCALL("boundPrimitiveColFuncCall", 26, 234, 5),
        /** id = <code>25</code>, name = <code>"boundPrimitiveFuncCall"</code> */
        BOUNDPRIMITIVEFUNCCALL("boundPrimitiveFuncCall", 25, 229, 5),
        /** id = <code>326</code>, name = <code>"BWS"</code> */
        BWS("BWS", 326, 2315, 1),
        /** id = <code>259</code>, name = <code>"byte"</code> */
        BYTE("byte", 259, 1903, 2),
        /** id = <code>173</code>, name = <code>"castExpr"</code> */
        CASTEXPR("castExpr", 173, 1450, 13),
        /** id = <code>150</code>, name = <code>"ceilingMethodCallExpr"</code> */
        CEILINGMETHODCALLEXPR("ceilingMethodCallExpr", 150, 1311, 7),
        /** id = <code>193</code>, name = <code>"charInJSON"</code> */
        CHARINJSON("charInJSON", 193, 1594, 20),
        /** id = <code>336</code>, name = <code>"CLOSE"</code> */
        CLOSE("CLOSE", 336, 2342, 3),
        /** id = <code>289</code>, name = <code>"collectionLiteral"</code> */
        COLLECTIONLITERAL("collectionLiteral", 289, 2125, 8),
        /** id = <code>4</code>, name = <code>"collectionNavigation"</code> */
        COLLECTIONNAVIGATION("collectionNavigation", 4, 78, 13),
        /** id = <code>109</code>, name = <code>"collectionNavigationExpr"</code> */
        COLLECTIONNAVIGATIONEXPR("collectionNavigationExpr", 109, 949, 12),
        /** id = <code>12</code>, name = <code>"collectionPath"</code> */
        COLLECTIONPATH("collectionPath", 12, 150, 3),
        /** id = <code>111</code>, name = <code>"collectionPathExpr"</code> */
        COLLECTIONPATHEXPR("collectionPathExpr", 111, 964, 11),
        /** id = <code>176</code>, name = <code>"collectionPropertyInUri"</code> */
        COLLECTIONPROPERTYINURI("collectionPropertyInUri", 176, 1490, 13),
        /** id = <code>328</code>, name = <code>"COLON"</code> */
        COLON("COLON", 328, 2319, 3),
        /** id = <code>51</code>, name = <code>"combineTrafo"</code> */
        COMBINETRAFO("combineTrafo", 51, 446, 13),
        /** id = <code>329</code>, name = <code>"COMMA"</code> */
        COMMA("COMMA", 329, 2322, 3),
        /** id = <code>100</code>, name = <code>"commonExpr"</code> */
        COMMONEXPR("commonExpr", 100, 865, 17),
        /** id = <code>236</code>, name = <code>"complexColFunction"</code> */
        COMPLEXCOLFUNCTION("complexColFunction", 236, 1769, 1),
        /** id = <code>242</code>, name = <code>"complexColFunctionImport"</code> */
        COMPLEXCOLFUNCTIONIMPORT("complexColFunctionImport", 242, 1775, 1),
        /** id = <code>30</code>, name = <code>"complexColFunctionImportCall"</code> */
        COMPLEXCOLFUNCTIONIMPORTCALL("complexColFunctionImportCall", 30, 257, 6),
        /** id = <code>174</code>, name = <code>"complexColInUri"</code> */
        COMPLEXCOLINURI("complexColInUri", 174, 1463, 10),
        /** id = <code>224</code>, name = <code>"complexColProperty"</code> */
        COMPLEXCOLPROPERTY("complexColProperty", 224, 1749, 1),
        /** id = <code>235</code>, name = <code>"complexFunction"</code> */
        COMPLEXFUNCTION("complexFunction", 235, 1768, 1),
        /** id = <code>241</code>, name = <code>"complexFunctionImport"</code> */
        COMPLEXFUNCTIONIMPORT("complexFunctionImport", 241, 1774, 1),
        /** id = <code>29</code>, name = <code>"complexFunctionImportCall"</code> */
        COMPLEXFUNCTIONIMPORTCALL("complexFunctionImportCall", 29, 251, 6),
        /** id = <code>175</code>, name = <code>"complexInUri"</code> */
        COMPLEXINURI("complexInUri", 175, 1473, 17),
        /** id = <code>14</code>, name = <code>"complexPath"</code> */
        COMPLEXPATH("complexPath", 14, 156, 10),
        /** id = <code>112</code>, name = <code>"complexPathExpr"</code> */
        COMPLEXPATHEXPR("complexPathExpr", 112, 975, 9),
        /** id = <code>223</code>, name = <code>"complexProperty"</code> */
        COMPLEXPROPERTY("complexProperty", 223, 1748, 1),
        /** id = <code>178</code>, name = <code>"complexPropertyInUri"</code> */
        COMPLEXPROPERTYINURI("complexPropertyInUri", 178, 1513, 6),
        /** id = <code>179</code>, name = <code>"complexTypeMetadataInUri"</code> */
        COMPLEXTYPEMETADATAINURI("complexTypeMetadataInUri", 179, 1519, 1),
        /** id = <code>209</code>, name = <code>"complexTypeName"</code> */
        COMPLEXTYPENAME("complexTypeName", 209, 1686, 1),
        /** id = <code>7</code>, name = <code>"compoundKey"</code> */
        COMPOUNDKEY("compoundKey", 7, 98, 8),
        /** id = <code>132</code>, name = <code>"concatMethodCallExpr"</code> */
        CONCATMETHODCALLEXPR("concatMethodCallExpr", 132, 1186, 11),
        /** id = <code>217</code>, name = <code>"concreteSpatialTypeName"</code> */
        CONCRETESPATIALTYPENAME("concreteSpatialTypeName", 217, 1728, 8),
        /** id = <code>37</code>, name = <code>"containerQualifier"</code> */
        CONTAINERQUALIFIER("containerQualifier", 37, 295, 5),
        /** id = <code>15</code>, name = <code>"count"</code> */
        COUNT("count", 15, 166, 1),
        /** id = <code>62</code>, name = <code>"countOrPropertyWithPath"</code> */
        COUNTORPROPERTYWITHPATH("countOrPropertyWithPath", 62, 552, 11),
        /** id = <code>97</code>, name = <code>"customName"</code> */
        CUSTOMNAME("customName", 97, 838, 4),
        /** id = <code>96</code>, name = <code>"customQueryOption"</code> */
        CUSTOMQUERYOPTION("customQueryOption", 96, 832, 6),
        /** id = <code>98</code>, name = <code>"customValue"</code> */
        CUSTOMVALUE("customValue", 98, 842, 2),
        /** id = <code>267</code>, name = <code>"date"</code> */
        DATE("date", 267, 1939, 5),
        /** id = <code>268</code>, name = <code>"dateBody"</code> */
        DATEBODY("dateBody", 268, 1944, 6),
        /** id = <code>141</code>, name = <code>"dateMethodCallExpr"</code> */
        DATEMETHODCALLEXPR("dateMethodCallExpr", 141, 1253, 7),
        /** id = <code>269</code>, name = <code>"dateTimeOffset"</code> */
        DATETIMEOFFSET("dateTimeOffset", 269, 1950, 5),
        /** id = <code>270</code>, name = <code>"dateTimeOffsetBody"</code> */
        DATETIMEOFFSETBODY("dateTimeOffsetBody", 270, 1955, 25),
        /** id = <code>279</code>, name = <code>"day"</code> */
        DAY("day", 279, 2075, 12),
        /** id = <code>135</code>, name = <code>"dayMethodCallExpr"</code> */
        DAYMETHODCALLEXPR("dayMethodCallExpr", 135, 1211, 7),
        /** id = <code>345</code>, name = <code>"dec-octet"</code> */
        DEC_OCTET("dec-octet", 345, 2475, 16),
        /** id = <code>250</code>, name = <code>"decimal"</code> */
        DECIMAL("decimal", 250, 1835, 4),
        /** id = <code>251</code>, name = <code>"decimalBody"</code> */
        DECIMALBODY("decimalBody", 251, 1839, 10),
        /** id = <code>362</code>, name = <code>"DIGIT"</code> */
        DIGIT("DIGIT", 362, 2653, 1),
        /** id = <code>151</code>, name = <code>"distanceMethodCallExpr"</code> */
        DISTANCEMETHODCALLEXPR("distanceMethodCallExpr", 151, 1318, 11),
        /** id = <code>168</code>, name = <code>"divExpr"</code> */
        DIVEXPR("divExpr", 168, 1419, 5),
        /** id = <code>252</code>, name = <code>"double"</code> */
        DOUBLE("double", 252, 1849, 6),
        /** id = <code>253</code>, name = <code>"doubleBody"</code> */
        DOUBLEBODY("doubleBody", 253, 1855, 9),
        /** id = <code>365</code>, name = <code>"DQUOTE"</code> */
        DQUOTE("DQUOTE", 365, 2664, 1),
        /** id = <code>271</code>, name = <code>"duration"</code> */
        DURATION("duration", 271, 1980, 5),
        /** id = <code>272</code>, name = <code>"durationBody"</code> */
        DURATIONBODY("durationBody", 272, 1985, 32),
        /** id = <code>187</code>, name = <code>"end-array"</code> */
        END_ARRAY("end-array", 187, 1566, 6),
        /** id = <code>185</code>, name = <code>"end-object"</code> */
        END_OBJECT("end-object", 185, 1554, 6),
        /** id = <code>125</code>, name = <code>"endsWithMethodCallExpr"</code> */
        ENDSWITHMETHODCALLEXPR("endsWithMethodCallExpr", 125, 1119, 11),
        /** id = <code>234</code>, name = <code>"entityColFunction"</code> */
        ENTITYCOLFUNCTION("entityColFunction", 234, 1767, 1),
        /** id = <code>240</code>, name = <code>"entityColFunctionImport"</code> */
        ENTITYCOLFUNCTIONIMPORT("entityColFunctionImport", 240, 1773, 1),
        /** id = <code>28</code>, name = <code>"entityColFunctionImportCall"</code> */
        ENTITYCOLFUNCTIONIMPORTCALL("entityColFunctionImportCall", 28, 245, 6),
        /** id = <code>228</code>, name = <code>"entityColNavigationProperty"</code> */
        ENTITYCOLNAVIGATIONPROPERTY("entityColNavigationProperty", 228, 1755, 1),
        /** id = <code>229</code>, name = <code>"entityContainer"</code> */
        ENTITYCONTAINER("entityContainer", 229, 1756, 1),
        /** id = <code>233</code>, name = <code>"entityFunction"</code> */
        ENTITYFUNCTION("entityFunction", 233, 1766, 1),
        /** id = <code>239</code>, name = <code>"entityFunctionImport"</code> */
        ENTITYFUNCTIONIMPORT("entityFunctionImport", 239, 1772, 1),
        /** id = <code>27</code>, name = <code>"entityFunctionImportCall"</code> */
        ENTITYFUNCTIONIMPORTCALL("entityFunctionImportCall", 27, 239, 6),
        /** id = <code>227</code>, name = <code>"entityNavigationProperty"</code> */
        ENTITYNAVIGATIONPROPERTY("entityNavigationProperty", 227, 1754, 1),
        /** id = <code>182</code>, name = <code>"entityRefColInUri"</code> */
        ENTITYREFCOLINURI("entityRefColInUri", 182, 1534, 10),
        /** id = <code>95</code>, name = <code>"entityReference"</code> */
        ENTITYREFERENCE("entityReference", 95, 818, 14),
        /** id = <code>183</code>, name = <code>"entityRefInJSON"</code> */
        ENTITYREFINJSON("entityRefInJSON", 183, 1544, 4),
        /** id = <code>206</code>, name = <code>"entitySetName"</code> */
        ENTITYSETNAME("entitySetName", 206, 1683, 1),
        /** id = <code>208</code>, name = <code>"entityTypeName"</code> */
        ENTITYTYPENAME("entityTypeName", 208, 1685, 1),
        /** id = <code>284</code>, name = <code>"enum"</code> */
        ENUM("enum", 284, 2103, 5),
        /** id = <code>285</code>, name = <code>"enumBody"</code> */
        ENUMBODY("enumBody", 285, 2108, 6),
        /** id = <code>211</code>, name = <code>"enumerationMember"</code> */
        ENUMERATIONMEMBER("enumerationMember", 211, 1688, 1),
        /** id = <code>210</code>, name = <code>"enumerationTypeName"</code> */
        ENUMERATIONTYPENAME("enumerationTypeName", 210, 1687, 1),
        /** id = <code>286</code>, name = <code>"enumValue"</code> */
        ENUMVALUE("enumValue", 286, 2114, 3),
        /** id = <code>330</code>, name = <code>"EQ"</code> */
        EQ("EQ", 330, 2325, 1),
        /** id = <code>158</code>, name = <code>"eqExpr"</code> */
        EQEXPR("eqExpr", 158, 1369, 5),
        /** id = <code>195</code>, name = <code>"escape"</code> */
        ESCAPE("escape", 195, 1621, 3),
        /** id = <code>46</code>, name = <code>"evalExpr"</code> */
        EVALEXPR("evalExpr", 46, 390, 13),
        /** id = <code>199</code>, name = <code>"exp"</code> */
        EXP("exp", 199, 1642, 8),
        /** id = <code>65</code>, name = <code>"expand"</code> */
        EXPAND("expand", 65, 581, 8),
        /** id = <code>66</code>, name = <code>"expandItem"</code> */
        EXPANDITEM("expandItem", 66, 589, 33),
        /** id = <code>68</code>, name = <code>"expandOption"</code> */
        EXPANDOPTION("expandOption", 68, 629, 5),
        /** id = <code>67</code>, name = <code>"expandRefOption"</code> */
        EXPANDREFOPTION("expandRefOption", 67, 622, 7),
        /** id = <code>52</code>, name = <code>"expandTrafo"</code> */
        EXPANDTRAFO("expandTrafo", 52, 459, 11),
        /** id = <code>70</code>, name = <code>"filter"</code> */
        FILTER("filter", 70, 641, 4),
        /** id = <code>53</code>, name = <code>"filterTrafo"</code> */
        FILTERTRAFO("filterTrafo", 53, 470, 7),
        /** id = <code>102</code>, name = <code>"firstMemberExpr"</code> */
        FIRSTMEMBEREXPR("firstMemberExpr", 102, 903, 4),
        /** id = <code>149</code>, name = <code>"floorMethodCallExpr"</code> */
        FLOORMETHODCALLEXPR("floorMethodCallExpr", 149, 1304, 7),
        /** id = <code>75</code>, name = <code>"format"</code> */
        FORMAT("format", 75, 671, 11),
        /** id = <code>198</code>, name = <code>"frac"</code> */
        FRAC("frac", 198, 1638, 4),
        /** id = <code>283</code>, name = <code>"fractionalSeconds"</code> */
        FRACTIONALSECONDS("fractionalSeconds", 283, 2101, 2),
        /** id = <code>139</code>, name = <code>"fractionalsecondsMethodCallExpr"</code> */
        FRACTIONALSECONDSMETHODCALLEXPR("fractionalsecondsMethodCallExpr", 139, 1239, 7),
        /** id = <code>288</code>, name = <code>"fullCollectionLiteral"</code> */
        FULLCOLLECTIONLITERAL("fullCollectionLiteral", 288, 2122, 3),
        /** id = <code>292</code>, name = <code>"fullLineStringLiteral"</code> */
        FULLLINESTRINGLITERAL("fullLineStringLiteral", 292, 2146, 3),
        /** id = <code>296</code>, name = <code>"fullMultiLineStringLiteral"</code> */
        FULLMULTILINESTRINGLITERAL("fullMultiLineStringLiteral", 296, 2165, 3),
        /** id = <code>299</code>, name = <code>"fullMultiPointLiteral"</code> */
        FULLMULTIPOINTLITERAL("fullMultiPointLiteral", 299, 2183, 3),
        /** id = <code>302</code>, name = <code>"fullMultiPolygonLiteral"</code> */
        FULLMULTIPOLYGONLITERAL("fullMultiPolygonLiteral", 302, 2201, 3),
        /** id = <code>305</code>, name = <code>"fullPointLiteral"</code> */
        FULLPOINTLITERAL("fullPointLiteral", 305, 2219, 3),
        /** id = <code>311</code>, name = <code>"fullPolygonLiteral"</code> */
        FULLPOLYGONLITERAL("fullPolygonLiteral", 311, 2244, 3),
        /** id = <code>232</code>, name = <code>"function"</code> */
        FUNCTION("function", 232, 1759, 7),
        /** id = <code>115</code>, name = <code>"functionExpr"</code> */
        FUNCTIONEXPR("functionExpr", 115, 988, 34),
        /** id = <code>117</code>, name = <code>"functionExprParameter"</code> */
        FUNCTIONEXPRPARAMETER("functionExprParameter", 117, 1032, 7),
        /** id = <code>116</code>, name = <code>"functionExprParameters"</code> */
        FUNCTIONEXPRPARAMETERS("functionExprParameters", 116, 1022, 10),
        /** id = <code>34</code>, name = <code>"functionParameter"</code> */
        FUNCTIONPARAMETER("functionParameter", 34, 285, 6),
        /** id = <code>33</code>, name = <code>"functionParameters"</code> */
        FUNCTIONPARAMETERS("functionParameters", 33, 275, 10),
        /** id = <code>163</code>, name = <code>"geExpr"</code> */
        GEEXPR("geExpr", 163, 1394, 5),
        /** id = <code>287</code>, name = <code>"geographyCollection"</code> */
        GEOGRAPHYCOLLECTION("geographyCollection", 287, 2117, 5),
        /** id = <code>291</code>, name = <code>"geographyLineString"</code> */
        GEOGRAPHYLINESTRING("geographyLineString", 291, 2141, 5),
        /** id = <code>295</code>, name = <code>"geographyMultiLineString"</code> */
        GEOGRAPHYMULTILINESTRING("geographyMultiLineString", 295, 2160, 5),
        /** id = <code>298</code>, name = <code>"geographyMultiPoint"</code> */
        GEOGRAPHYMULTIPOINT("geographyMultiPoint", 298, 2178, 5),
        /** id = <code>301</code>, name = <code>"geographyMultiPolygon"</code> */
        GEOGRAPHYMULTIPOLYGON("geographyMultiPolygon", 301, 2196, 5),
        /** id = <code>304</code>, name = <code>"geographyPoint"</code> */
        GEOGRAPHYPOINT("geographyPoint", 304, 2214, 5),
        /** id = <code>310</code>, name = <code>"geographyPolygon"</code> */
        GEOGRAPHYPOLYGON("geographyPolygon", 310, 2239, 5),
        /** id = <code>322</code>, name = <code>"geographyPrefix"</code> */
        GEOGRAPHYPREFIX("geographyPrefix", 322, 2301, 1),
        /** id = <code>152</code>, name = <code>"geoLengthMethodCallExpr"</code> */
        GEOLENGTHMETHODCALLEXPR("geoLengthMethodCallExpr", 152, 1329, 7),
        /** id = <code>290</code>, name = <code>"geoLiteral"</code> */
        GEOLITERAL("geoLiteral", 290, 2133, 8),
        /** id = <code>315</code>, name = <code>"geometryCollection"</code> */
        GEOMETRYCOLLECTION("geometryCollection", 315, 2266, 5),
        /** id = <code>316</code>, name = <code>"geometryLineString"</code> */
        GEOMETRYLINESTRING("geometryLineString", 316, 2271, 5),
        /** id = <code>317</code>, name = <code>"geometryMultiLineString"</code> */
        GEOMETRYMULTILINESTRING("geometryMultiLineString", 317, 2276, 5),
        /** id = <code>318</code>, name = <code>"geometryMultiPoint"</code> */
        GEOMETRYMULTIPOINT("geometryMultiPoint", 318, 2281, 5),
        /** id = <code>319</code>, name = <code>"geometryMultiPolygon"</code> */
        GEOMETRYMULTIPOLYGON("geometryMultiPolygon", 319, 2286, 5),
        /** id = <code>320</code>, name = <code>"geometryPoint"</code> */
        GEOMETRYPOINT("geometryPoint", 320, 2291, 5),
        /** id = <code>321</code>, name = <code>"geometryPolygon"</code> */
        GEOMETRYPOLYGON("geometryPolygon", 321, 2296, 5),
        /** id = <code>323</code>, name = <code>"geometryPrefix"</code> */
        GEOMETRYPREFIX("geometryPrefix", 323, 2302, 1),
        /** id = <code>56</code>, name = <code>"groupbyElement"</code> */
        GROUPBYELEMENT("groupbyElement", 56, 500, 3),
        /** id = <code>55</code>, name = <code>"groupbyList"</code> */
        GROUPBYLIST("groupbyList", 55, 488, 12),
        /** id = <code>54</code>, name = <code>"groupbyTrafo"</code> */
        GROUPBYTRAFO("groupbyTrafo", 54, 477, 11),
        /** id = <code>162</code>, name = <code>"gtExpr"</code> */
        GTEXPR("gtExpr", 162, 1389, 5),
        /** id = <code>257</code>, name = <code>"guid"</code> */
        GUID("guid", 257, 1883, 5),
        /** id = <code>258</code>, name = <code>"guidBody"</code> */
        GUIDBODY("guidBody", 258, 1888, 15),
        /** id = <code>342</code>, name = <code>"h16"</code> */
        H16("h16", 342, 2459, 2),
        /** id = <code>164</code>, name = <code>"hasExpr"</code> */
        HASEXPR("hasExpr", 164, 1399, 5),
        /** id = <code>363</code>, name = <code>"HEXDIG"</code> */
        HEXDIG("HEXDIG", 363, 2654, 3),
        /** id = <code>337</code>, name = <code>"host"</code> */
        HOST("host", 337, 2345, 4),
        /** id = <code>280</code>, name = <code>"hour"</code> */
        HOUR("hour", 280, 2087, 12),
        /** id = <code>136</code>, name = <code>"hourMethodCallExpr"</code> */
        HOURMETHODCALLEXPR("hourMethodCallExpr", 136, 1218, 7),
        /** id = <code>367</code>, name = <code>"HTAB"</code> */
        HTAB("HTAB", 367, 2666, 1),
        /** id = <code>214</code>, name = <code>"identifierCharacter"</code> */
        IDENTIFIERCHARACTER("identifierCharacter", 214, 1696, 4),
        /** id = <code>213</code>, name = <code>"identifierLeadingCharacter"</code> */
        IDENTIFIERLEADINGCHARACTER("identifierLeadingCharacter", 213, 1693, 3),
        /** id = <code>58</code>, name = <code>"identityTrafo"</code> */
        IDENTITYTRAFO("identityTrafo", 58, 518, 1),
        /** id = <code>107</code>, name = <code>"implicitVariableExpr"</code> */
        IMPLICITVARIABLEEXPR("implicitVariableExpr", 107, 947, 1),
        /** id = <code>127</code>, name = <code>"indexOfMethodCallExpr"</code> */
        INDEXOFMETHODCALLEXPR("indexOfMethodCallExpr", 127, 1137, 11),
        /** id = <code>76</code>, name = <code>"inlinecount"</code> */
        INLINECOUNT("inlinecount", 76, 682, 6),
        /** id = <code>106</code>, name = <code>"inscopeVariableExpr"</code> */
        INSCOPEVARIABLEEXPR("inscopeVariableExpr", 106, 944, 3),
        /** id = <code>197</code>, name = <code>"int"</code> */
        INT("int", 197, 1632, 6),
        /** id = <code>261</code>, name = <code>"int16"</code> */
        INT16("int16", 261, 1910, 5),
        /** id = <code>262</code>, name = <code>"int32"</code> */
        INT32("int32", 262, 1915, 5),
        /** id = <code>263</code>, name = <code>"int64"</code> */
        INT64("int64", 263, 1920, 4),
        /** id = <code>264</code>, name = <code>"int64Body"</code> */
        INT64BODY("int64Body", 264, 1924, 5),
        /** id = <code>153</code>, name = <code>"intersectsMethodCallExpr"</code> */
        INTERSECTSMETHODCALLEXPR("intersectsMethodCallExpr", 153, 1336, 11),
        /** id = <code>339</code>, name = <code>"IP-literal"</code> */
        IP_LITERAL("IP-literal", 339, 2351, 6),
        /** id = <code>344</code>, name = <code>"IPv4address"</code> */
        IPV4ADDRESS("IPv4address", 344, 2467, 8),
        /** id = <code>341</code>, name = <code>"IPv6address"</code> */
        IPV6ADDRESS("IPv6address", 341, 2367, 92),
        /** id = <code>340</code>, name = <code>"IPvFuture"</code> */
        IPVFUTURE("IPvFuture", 340, 2357, 10),
        /** id = <code>172</code>, name = <code>"isofExpr"</code> */
        ISOFEXPR("isofExpr", 172, 1437, 13),
        /** id = <code>5</code>, name = <code>"keyPredicate"</code> */
        KEYPREDICATE("keyPredicate", 5, 91, 3),
        /** id = <code>9</code>, name = <code>"keyPropertyValue"</code> */
        KEYPROPERTYVALUE("keyPropertyValue", 9, 110, 1),
        /** id = <code>8</code>, name = <code>"keyValuePair"</code> */
        KEYVALUEPAIR("keyValuePair", 8, 106, 4),
        /** id = <code>120</code>, name = <code>"lambdaPredicateExpr"</code> */
        LAMBDAPREDICATEEXPR("lambdaPredicateExpr", 120, 1063, 1),
        /** id = <code>105</code>, name = <code>"lambdaPredicatePrefixExpr"</code> */
        LAMBDAPREDICATEPREFIXEXPR("lambdaPredicatePrefixExpr", 105, 941, 3),
        /** id = <code>108</code>, name = <code>"lambdaVariableExpr"</code> */
        LAMBDAVARIABLEEXPR("lambdaVariableExpr", 108, 948, 1),
        /** id = <code>161</code>, name = <code>"leExpr"</code> */
        LEEXPR("leExpr", 161, 1384, 5),
        /** id = <code>126</code>, name = <code>"lengthMethodCallExpr"</code> */
        LENGTHMETHODCALLEXPR("lengthMethodCallExpr", 126, 1130, 7),
        /** id = <code>69</code>, name = <code>"levels"</code> */
        LEVELS("levels", 69, 634, 7),
        /** id = <code>294</code>, name = <code>"lineStringData"</code> */
        LINESTRINGDATA("lineStringData", 294, 2152, 8),
        /** id = <code>293</code>, name = <code>"lineStringLiteral"</code> */
        LINESTRINGLITERAL("lineStringLiteral", 293, 2149, 3),
        /** id = <code>343</code>, name = <code>"ls32"</code> */
        LS32("ls32", 343, 2461, 6),
        /** id = <code>160</code>, name = <code>"ltExpr"</code> */
        LTEXPR("ltExpr", 160, 1379, 5),
        /** id = <code>145</code>, name = <code>"maxDateTimeMethodCallExpr"</code> */
        MAXDATETIMEMETHODCALLEXPR("maxDateTimeMethodCallExpr", 145, 1278, 4),
        /** id = <code>103</code>, name = <code>"memberExpr"</code> */
        MEMBEREXPR("memberExpr", 103, 907, 8),
        /** id = <code>99</code>, name = <code>"metadataFragment"</code> */
        METADATAFRAGMENT("metadataFragment", 99, 844, 21),
        /** id = <code>121</code>, name = <code>"methodCallExpr"</code> */
        METHODCALLEXPR("methodCallExpr", 121, 1064, 28),
        /** id = <code>144</code>, name = <code>"minDateTimeMethodCallExpr"</code> */
        MINDATETIMEMETHODCALLEXPR("minDateTimeMethodCallExpr", 144, 1274, 4),
        /** id = <code>281</code>, name = <code>"minute"</code> */
        MINUTE("minute", 281, 2099, 1),
        /** id = <code>137</code>, name = <code>"minuteMethodCallExpr"</code> */
        MINUTEMETHODCALLEXPR("minuteMethodCallExpr", 137, 1225, 7),
        /** id = <code>169</code>, name = <code>"modExpr"</code> */
        MODEXPR("modExpr", 169, 1424, 5),
        /** id = <code>278</code>, name = <code>"month"</code> */
        MONTH("month", 278, 2065, 10),
        /** id = <code>134</code>, name = <code>"monthMethodCallExpr"</code> */
        MONTHMETHODCALLEXPR("monthMethodCallExpr", 134, 1204, 7),
        /** id = <code>167</code>, name = <code>"mulExpr"</code> */
        MULEXPR("mulExpr", 167, 1414, 5),
        /** id = <code>297</code>, name = <code>"multiLineStringLiteral"</code> */
        MULTILINESTRINGLITERAL("multiLineStringLiteral", 297, 2168, 10),
        /** id = <code>300</code>, name = <code>"multiPointLiteral"</code> */
        MULTIPOINTLITERAL("multiPointLiteral", 300, 2186, 10),
        /** id = <code>303</code>, name = <code>"multiPolygonLiteral"</code> */
        MULTIPOLYGONLITERAL("multiPolygonLiteral", 303, 2204, 10),
        /** id = <code>189</code>, name = <code>"name-separator"</code> */
        NAME_SEPARATOR("name-separator", 189, 1575, 4),
        /** id = <code>207</code>, name = <code>"namedEntity"</code> */
        NAMEDENTITY("namedEntity", 207, 1684, 1),
        /** id = <code>204</code>, name = <code>"namespace"</code> */
        NAMESPACE("namespace", 204, 1676, 6),
        /** id = <code>205</code>, name = <code>"namespacePart"</code> */
        NAMESPACEPART("namespacePart", 205, 1682, 1),
        /** id = <code>256</code>, name = <code>"nanInfinity"</code> */
        NANINFINITY("nanInfinity", 256, 1879, 4),
        /** id = <code>226</code>, name = <code>"navigationProperty"</code> */
        NAVIGATIONPROPERTY("navigationProperty", 226, 1751, 3),
        /** id = <code>64</code>, name = <code>"navigationPropertyWithPath"</code> */
        NAVIGATIONPROPERTYWITHPATH("navigationPropertyWithPath", 64, 573, 8),
        /** id = <code>159</code>, name = <code>"neExpr"</code> */
        NEEXPR("neExpr", 159, 1374, 5),
        /** id = <code>170</code>, name = <code>"negateExpr"</code> */
        NEGATEEXPR("negateExpr", 170, 1429, 4),
        /** id = <code>171</code>, name = <code>"notExpr"</code> */
        NOTEXPR("notExpr", 171, 1433, 4),
        /** id = <code>146</code>, name = <code>"nowMethodCallExpr"</code> */
        NOWMETHODCALLEXPR("nowMethodCallExpr", 146, 1282, 4),
        /** id = <code>246</code>, name = <code>"null"</code> */
        NULL("null", 246, 1811, 7),
        /** id = <code>196</code>, name = <code>"numberInJSON"</code> */
        NUMBERINJSON("numberInJSON", 196, 1624, 8),
        /** id = <code>212</code>, name = <code>"odataIdentifier"</code> */
        ODATAIDENTIFIER("odataIdentifier", 212, 1689, 4),
        /** id = <code>2</code>, name = <code>"odataRelativeUri"</code> */
        ODATARELATIVEURI("odataRelativeUri", 2, 34, 6),
        /** id = <code>0</code>, name = <code>"odataUri"</code> */
        ODATAURI("odataUri", 0, 0, 28),
        /** id = <code>275</code>, name = <code>"oneToNine"</code> */
        ONETONINE("oneToNine", 275, 2034, 10),
        /** id = <code>335</code>, name = <code>"OPEN"</code> */
        OPEN("OPEN", 335, 2339, 3),
        /** id = <code>71</code>, name = <code>"orderby"</code> */
        ORDERBY("orderby", 71, 645, 8),
        /** id = <code>72</code>, name = <code>"orderbyItem"</code> */
        ORDERBYITEM("orderbyItem", 72, 653, 8),
        /** id = <code>157</code>, name = <code>"orExpr"</code> */
        OREXPR("orExpr", 157, 1364, 5),
        /** id = <code>352</code>, name = <code>"other-delims"</code> */
        OTHER_DELIMS("other-delims", 352, 2521, 8),
        /** id = <code>324</code>, name = <code>"OWS"</code> */
        OWS("OWS", 324, 2303, 6),
        /** id = <code>36</code>, name = <code>"parameterAlias"</code> */
        PARAMETERALIAS("parameterAlias", 36, 292, 3),
        /** id = <code>35</code>, name = <code>"parameterName"</code> */
        PARAMETERNAME("parameterName", 35, 291, 1),
        /** id = <code>90</code>, name = <code>"parameterNameAndType"</code> */
        PARAMETERNAMEANDTYPE("parameterNameAndType", 90, 794, 4),
        /** id = <code>93</code>, name = <code>"parameterNameAndValue"</code> */
        PARAMETERNAMEANDVALUE("parameterNameAndValue", 93, 807, 4),
        /** id = <code>89</code>, name = <code>"parameterNamesAndTypes"</code> */
        PARAMETERNAMESANDTYPES("parameterNamesAndTypes", 89, 788, 6),
        /** id = <code>94</code>, name = <code>"parameterValue"</code> */
        PARAMETERVALUE("parameterValue", 94, 811, 7),
        /** id = <code>155</code>, name = <code>"parenExpr"</code> */
        PARENEXPR("parenExpr", 155, 1353, 6),
        /** id = <code>348</code>, name = <code>"pchar"</code> */
        PCHAR("pchar", 348, 2498, 6),
        /** id = <code>353</code>, name = <code>"pchar-no-SQUOTE"</code> */
        PCHAR_NO_SQUOTE("pchar-no-SQUOTE", 353, 2529, 9),
        /** id = <code>349</code>, name = <code>"pct-encoded"</code> */
        PCT_ENCODED("pct-encoded", 349, 2504, 4),
        /** id = <code>354</code>, name = <code>"pct-encoded-no-SQUOTE"</code> */
        PCT_ENCODED_NO_SQUOTE("pct-encoded-no-SQUOTE", 354, 2538, 28),
        /** id = <code>359</code>, name = <code>"pct-encoded-unescaped"</code> */
        PCT_ENCODED_UNESCAPED("pct-encoded-unescaped", 359, 2606, 37),
        /** id = <code>308</code>, name = <code>"pointData"</code> */
        POINTDATA("pointData", 308, 2231, 4),
        /** id = <code>307</code>, name = <code>"pointLiteral"</code> */
        POINTLITERAL("pointLiteral", 307, 2228, 3),
        /** id = <code>313</code>, name = <code>"polygonData"</code> */
        POLYGONDATA("polygonData", 313, 2250, 8),
        /** id = <code>312</code>, name = <code>"polygonLiteral"</code> */
        POLYGONLITERAL("polygonLiteral", 312, 2247, 3),
        /** id = <code>338</code>, name = <code>"port"</code> */
        PORT("port", 338, 2349, 2),
        /** id = <code>309</code>, name = <code>"positionLiteral"</code> */
        POSITIONLITERAL("positionLiteral", 309, 2235, 4),
        /** id = <code>238</code>, name = <code>"primitiveColFunction"</code> */
        PRIMITIVECOLFUNCTION("primitiveColFunction", 238, 1771, 1),
        /** id = <code>244</code>, name = <code>"primitiveColFunctionImport"</code> */
        PRIMITIVECOLFUNCTIONIMPORT("primitiveColFunctionImport", 244, 1777, 1),
        /** id = <code>32</code>, name = <code>"primitiveColFunctionImportCall"</code> */
        PRIMITIVECOLFUNCTIONIMPORTCALL("primitiveColFunctionImportCall", 32, 269, 6),
        /** id = <code>177</code>, name = <code>"primitiveColInUri"</code> */
        PRIMITIVECOLINURI("primitiveColInUri", 177, 1503, 10),
        /** id = <code>222</code>, name = <code>"primitiveColProperty"</code> */
        PRIMITIVECOLPROPERTY("primitiveColProperty", 222, 1747, 1),
        /** id = <code>237</code>, name = <code>"primitiveFunction"</code> */
        PRIMITIVEFUNCTION("primitiveFunction", 237, 1770, 1),
        /** id = <code>243</code>, name = <code>"primitiveFunctionImport"</code> */
        PRIMITIVEFUNCTIONIMPORT("primitiveFunctionImport", 243, 1776, 1),
        /** id = <code>31</code>, name = <code>"primitiveFunctionImportCall"</code> */
        PRIMITIVEFUNCTIONIMPORTCALL("primitiveFunctionImportCall", 31, 263, 6),
        /** id = <code>220</code>, name = <code>"primitiveKeyProperty"</code> */
        PRIMITIVEKEYPROPERTY("primitiveKeyProperty", 220, 1745, 1),
        /** id = <code>245</code>, name = <code>"primitiveLiteral"</code> */
        PRIMITIVELITERAL("primitiveLiteral", 245, 1778, 33),
        /** id = <code>191</code>, name = <code>"primitiveLiteralInJSON"</code> */
        PRIMITIVELITERALINJSON("primitiveLiteralInJSON", 191, 1583, 6),
        /** id = <code>221</code>, name = <code>"primitiveNonKeyProperty"</code> */
        PRIMITIVENONKEYPROPERTY("primitiveNonKeyProperty", 221, 1746, 1),
        /** id = <code>219</code>, name = <code>"primitiveProperty"</code> */
        PRIMITIVEPROPERTY("primitiveProperty", 219, 1742, 3),
        /** id = <code>181</code>, name = <code>"primitivePropertyInUri"</code> */
        PRIMITIVEPROPERTYINURI("primitivePropertyInUri", 181, 1528, 6),
        /** id = <code>215</code>, name = <code>"primitiveTypeName"</code> */
        PRIMITIVETYPENAME("primitiveTypeName", 215, 1700, 25),
        /** id = <code>218</code>, name = <code>"property"</code> */
        PROPERTY("property", 218, 1736, 6),
        /** id = <code>11</code>, name = <code>"propertyPath"</code> */
        PROPERTYPATH("propertyPath", 11, 124, 26),
        /** id = <code>104</code>, name = <code>"propertyPathExpr"</code> */
        PROPERTYPATHEXPR("propertyPathExpr", 104, 915, 26),
        /** id = <code>63</code>, name = <code>"propertyWithPath"</code> */
        PROPERTYWITHPATH("propertyWithPath", 63, 563, 10),
        /** id = <code>194</code>, name = <code>"qchar-JSON-special"</code> */
        QCHAR_JSON_SPECIAL("qchar-JSON-special", 194, 1614, 7),
        /** id = <code>355</code>, name = <code>"qchar-no-AMP"</code> */
        QCHAR_NO_AMP("qchar-no-AMP", 355, 2566, 11),
        /** id = <code>360</code>, name = <code>"qchar-no-AMP-DQUOTE"</code> */
        QCHAR_NO_AMP_DQUOTE("qchar-no-AMP-DQUOTE", 360, 2643, 7),
        /** id = <code>356</code>, name = <code>"qchar-no-AMP-EQ"</code> */
        QCHAR_NO_AMP_EQ("qchar-no-AMP-EQ", 356, 2577, 10),
        /** id = <code>357</code>, name = <code>"qchar-no-AMP-EQ-AT-DOLLAR"</code> */
        QCHAR_NO_AMP_EQ_AT_DOLLAR("qchar-no-AMP-EQ-AT-DOLLAR", 357, 2587, 8),
        /** id = <code>358</code>, name = <code>"qchar-unescaped"</code> */
        QCHAR_UNESCAPED("qchar-unescaped", 358, 2595, 11),
        /** id = <code>87</code>, name = <code>"qualifiedActionName"</code> */
        QUALIFIEDACTIONNAME("qualifiedActionName", 87, 770, 9),
        /** id = <code>202</code>, name = <code>"qualifiedComplexTypeName"</code> */
        QUALIFIEDCOMPLEXTYPENAME("qualifiedComplexTypeName", 202, 1668, 4),
        /** id = <code>201</code>, name = <code>"qualifiedEntityTypeName"</code> */
        QUALIFIEDENTITYTYPENAME("qualifiedEntityTypeName", 201, 1664, 4),
        /** id = <code>203</code>, name = <code>"qualifiedEnumerationTypeName"</code> */
        QUALIFIEDENUMERATIONTYPENAME("qualifiedEnumerationTypeName", 203, 1672, 4),
        /** id = <code>88</code>, name = <code>"qualifiedFunctionName"</code> */
        QUALIFIEDFUNCTIONNAME("qualifiedFunctionName", 88, 779, 9),
        /** id = <code>200</code>, name = <code>"qualifiedTypeName"</code> */
        QUALIFIEDTYPENAME("qualifiedTypeName", 200, 1650, 14),
        /** id = <code>39</code>, name = <code>"queryOption"</code> */
        QUERYOPTION("queryOption", 39, 306, 5),
        /** id = <code>38</code>, name = <code>"queryOptions"</code> */
        QUERYOPTIONS("queryOptions", 38, 300, 6),
        /** id = <code>188</code>, name = <code>"quotation-mark"</code> */
        QUOTATION_MARK("quotation-mark", 188, 1572, 3),
        /** id = <code>16</code>, name = <code>"ref"</code> */
        REF("ref", 16, 167, 1),
        /** id = <code>346</code>, name = <code>"reg-name"</code> */
        REG_NAME("reg-name", 346, 2491, 5),
        /** id = <code>3</code>, name = <code>"resourcePath"</code> */
        RESOURCEPATH("resourcePath", 3, 40, 38),
        /** id = <code>314</code>, name = <code>"ringLiteral"</code> */
        RINGLITERAL("ringLiteral", 314, 2258, 8),
        /** id = <code>57</code>, name = <code>"rollupSpec"</code> */
        ROLLUPSPEC("rollupSpec", 57, 503, 15),
        /** id = <code>148</code>, name = <code>"roundMethodCallExpr"</code> */
        ROUNDMETHODCALLEXPR("roundMethodCallExpr", 148, 1297, 7),
        /** id = <code>325</code>, name = <code>"RWS"</code> */
        RWS("RWS", 325, 2309, 6),
        /** id = <code>260</code>, name = <code>"sbyte"</code> */
        SBYTE("sbyte", 260, 1905, 5),
        /** id = <code>77</code>, name = <code>"search"</code> */
        SEARCH("search", 77, 688, 5),
        /** id = <code>80</code>, name = <code>"searchAndExpr"</code> */
        SEARCHANDEXPR("searchAndExpr", 80, 711, 7),
        /** id = <code>78</code>, name = <code>"searchExpr"</code> */
        SEARCHEXPR("searchExpr", 78, 693, 13),
        /** id = <code>147</code>, name = <code>"searchMethodCallExpr"</code> */
        SEARCHMETHODCALLEXPR("searchMethodCallExpr", 147, 1286, 11),
        /** id = <code>79</code>, name = <code>"searchOrExpr"</code> */
        SEARCHOREXPR("searchOrExpr", 79, 706, 5),
        /** id = <code>82</code>, name = <code>"searchPhrase"</code> */
        SEARCHPHRASE("searchPhrase", 82, 726, 5),
        /** id = <code>81</code>, name = <code>"searchTerm"</code> */
        SEARCHTERM("searchTerm", 81, 718, 8),
        /** id = <code>83</code>, name = <code>"searchWord"</code> */
        SEARCHWORD("searchWord", 83, 731, 2),
        /** id = <code>282</code>, name = <code>"second"</code> */
        SECOND("second", 282, 2100, 1),
        /** id = <code>138</code>, name = <code>"secondMethodCallExpr"</code> */
        SECONDMETHODCALLEXPR("secondMethodCallExpr", 138, 1232, 7),
        /** id = <code>347</code>, name = <code>"segment-nz"</code> */
        SEGMENT_NZ("segment-nz", 347, 2496, 2),
        /** id = <code>84</code>, name = <code>"select"</code> */
        SELECT("select", 84, 733, 8),
        /** id = <code>85</code>, name = <code>"selectItem"</code> */
        SELECTITEM("selectItem", 85, 741, 25),
        /** id = <code>332</code>, name = <code>"SEMI"</code> */
        SEMI("SEMI", 332, 2330, 3),
        /** id = <code>1</code>, name = <code>"serviceRoot"</code> */
        SERVICEROOT("serviceRoot", 1, 28, 6),
        /** id = <code>331</code>, name = <code>"SIGN"</code> */
        SIGN("SIGN", 331, 2326, 4),
        /** id = <code>6</code>, name = <code>"simpleKey"</code> */
        SIMPLEKEY("simpleKey", 6, 94, 4),
        /** id = <code>254</code>, name = <code>"single"</code> */
        SINGLE("single", 254, 1864, 6),
        /** id = <code>255</code>, name = <code>"singleBody"</code> */
        SINGLEBODY("singleBody", 255, 1870, 9),
        /** id = <code>10</code>, name = <code>"singleNavigation"</code> */
        SINGLENAVIGATION("singleNavigation", 10, 111, 13),
        /** id = <code>110</code>, name = <code>"singleNavigationExpr"</code> */
        SINGLENAVIGATIONEXPR("singleNavigationExpr", 110, 961, 3),
        /** id = <code>13</code>, name = <code>"singlePath"</code> */
        SINGLEPATH("singlePath", 13, 153, 3),
        /** id = <code>113</code>, name = <code>"singlePathExpr"</code> */
        SINGLEPATHEXPR("singlePathExpr", 113, 984, 3),
        /** id = <code>73</code>, name = <code>"skip"</code> */
        SKIP("skip", 73, 661, 5),
        /** id = <code>91</code>, name = <code>"skiptoken"</code> */
        SKIPTOKEN("skiptoken", 91, 798, 5),
        /** id = <code>366</code>, name = <code>"SP"</code> */
        SP("SP", 366, 2665, 1),
        /** id = <code>334</code>, name = <code>"SQUOTE"</code> */
        SQUOTE("SQUOTE", 334, 2336, 3),
        /** id = <code>266</code>, name = <code>"SQUOTE-in-string"</code> */
        SQUOTE_IN_STRING("SQUOTE-in-string", 266, 1936, 3),
        /** id = <code>306</code>, name = <code>"sridLiteral"</code> */
        SRIDLITERAL("sridLiteral", 306, 2222, 6),
        /** id = <code>333</code>, name = <code>"STAR"</code> */
        STAR("STAR", 333, 2333, 3),
        /** id = <code>124</code>, name = <code>"startsWithMethodCallExpr"</code> */
        STARTSWITHMETHODCALLEXPR("startsWithMethodCallExpr", 124, 1108, 11),
        /** id = <code>225</code>, name = <code>"streamProperty"</code> */
        STREAMPROPERTY("streamProperty", 225, 1750, 1),
        /** id = <code>265</code>, name = <code>"string"</code> */
        STRING("string", 265, 1929, 7),
        /** id = <code>192</code>, name = <code>"stringInJSON"</code> */
        STRINGINJSON("stringInJSON", 192, 1589, 5),
        /** id = <code>351</code>, name = <code>"sub-delims"</code> */
        SUB_DELIMS("sub-delims", 351, 2515, 6),
        /** id = <code>166</code>, name = <code>"subExpr"</code> */
        SUBEXPR("subExpr", 166, 1409, 5),
        /** id = <code>128</code>, name = <code>"substringMethodCallExpr"</code> */
        SUBSTRINGMETHODCALLEXPR("substringMethodCallExpr", 128, 1148, 17),
        /** id = <code>123</code>, name = <code>"substringOfMethodCallExpr"</code> */
        SUBSTRINGOFMETHODCALLEXPR("substringOfMethodCallExpr", 123, 1097, 11),
        /** id = <code>40</code>, name = <code>"systemQueryOption"</code> */
        SYSTEMQUERYOPTION("systemQueryOption", 40, 311, 12),
        /** id = <code>142</code>, name = <code>"timeMethodCallExpr"</code> */
        TIMEMETHODCALLEXPR("timeMethodCallExpr", 142, 1260, 7),
        /** id = <code>273</code>, name = <code>"timeOfDay"</code> */
        TIMEOFDAY("timeOfDay", 273, 2017, 5),
        /** id = <code>274</code>, name = <code>"timeOfDayBody"</code> */
        TIMEOFDAYBODY("timeOfDayBody", 274, 2022, 12),
        /** id = <code>129</code>, name = <code>"toLowerMethodCallExpr"</code> */
        TOLOWERMETHODCALLEXPR("toLowerMethodCallExpr", 129, 1165, 7),
        /** id = <code>74</code>, name = <code>"top"</code> */
        TOP("top", 74, 666, 5),
        /** id = <code>59</code>, name = <code>"topcountTrafo"</code> */
        TOPCOUNTTRAFO("topcountTrafo", 59, 519, 11),
        /** id = <code>60</code>, name = <code>"toppercentTrafo"</code> */
        TOPPERCENTTRAFO("toppercentTrafo", 60, 530, 11),
        /** id = <code>61</code>, name = <code>"topsumTrafo"</code> */
        TOPSUMTRAFO("topsumTrafo", 61, 541, 11),
        /** id = <code>143</code>, name = <code>"totalOffsetMinutesMethodCallExpr"</code> */
        TOTALOFFSETMINUTESMETHODCALLEXPR("totalOffsetMinutesMethodCallExpr", 143, 1267, 7),
        /** id = <code>140</code>, name = <code>"totalsecondsMethodCallExpr"</code> */
        TOTALSECONDSMETHODCALLEXPR("totalsecondsMethodCallExpr", 140, 1246, 7),
        /** id = <code>130</code>, name = <code>"toUpperMethodCallExpr"</code> */
        TOUPPERMETHODCALLEXPR("toUpperMethodCallExpr", 130, 1172, 7),
        /** id = <code>131</code>, name = <code>"trimMethodCallExpr"</code> */
        TRIMMETHODCALLEXPR("trimMethodCallExpr", 131, 1179, 7),
        /** id = <code>180</code>, name = <code>"typeNVPInUri"</code> */
        TYPENVPINURI("typeNVPInUri", 180, 1520, 8),
        /** id = <code>350</code>, name = <code>"unreserved"</code> */
        UNRESERVED("unreserved", 350, 2508, 7),
        /** id = <code>17</code>, name = <code>"value"</code> */
        VALUE("value", 17, 168, 1),
        /** id = <code>190</code>, name = <code>"value-separator"</code> */
        VALUE_SEPARATOR("value-separator", 190, 1579, 4),
        /** id = <code>277</code>, name = <code>"year"</code> */
        YEAR("year", 277, 2053, 12),
        /** id = <code>133</code>, name = <code>"yearMethodCallExpr"</code> */
        YEARMETHODCALLEXPR("yearMethodCallExpr", 133, 1197, 7),
        /** id = <code>276</code>, name = <code>"zeroToFiftyNine"</code> */
        ZEROTOFIFTYNINE("zeroToFiftyNine", 276, 2044, 9);
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
     Rule[] rules = new Rule[368];
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
     Opcode[] op = new Opcode[2667];
        {int[] a = {1,4,5,6,10,11,19}; op[0] = getOpcodeCat(a);}
        {int[] a = {2,3}; op[1] = getOpcodeAlt(a);}
        {char[] a = {104,116,116,112,115}; op[2] = getOpcodeTls(a);}
        {char[] a = {104,116,116,112}; op[3] = getOpcodeTls(a);}
        {char[] a = {58,47,47}; op[4] = getOpcodeTls(a);}
        op[5] = getOpcodeRnm(337, 2345); // host
        op[6] = getOpcodeRep((char)0, (char)1, 7);
        {int[] a = {8,9}; op[7] = getOpcodeCat(a);}
        {char[] a = {58}; op[8] = getOpcodeTls(a);}
        op[9] = getOpcodeRnm(338, 2349); // port
        op[10] = getOpcodeRnm(1, 28); // serviceRoot
        op[11] = getOpcodeRep((char)0, (char)1, 12);
        {int[] a = {13,17,18}; op[12] = getOpcodeAlt(a);}
        {int[] a = {14,15}; op[13] = getOpcodeCat(a);}
        {char[] a = {36,109,101,116,97,100,97,116,97}; op[14] = getOpcodeTbs(a);}
        op[15] = getOpcodeRep((char)0, (char)1, 16);
        op[16] = getOpcodeRnm(99, 844); // metadataFragment
        {char[] a = {36,98,97,116,99,104}; op[17] = getOpcodeTbs(a);}
        op[18] = getOpcodeRnm(2, 34); // odataRelativeUri
        op[19] = getOpcodeRep((char)0, (char)1, 20);
        {int[] a = {21,26,27}; op[20] = getOpcodeCat(a);}
        op[21] = getOpcodeRep((char)0, (char)1, 22);
        {int[] a = {23,24,25}; op[22] = getOpcodeCat(a);}
        op[23] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[24] = getOpcodeTls(a);}
        op[25] = getOpcodeRnm(229, 1756); // entityContainer
        {char[] a = {63}; op[26] = getOpcodeTls(a);}
        op[27] = getOpcodeRnm(77, 688); // search
        {int[] a = {29,30}; op[28] = getOpcodeCat(a);}
        {char[] a = {47}; op[29] = getOpcodeTls(a);}
        op[30] = getOpcodeRep((char)0, Character.MAX_VALUE, 31);
        {int[] a = {32,33}; op[31] = getOpcodeCat(a);}
        op[32] = getOpcodeRnm(347, 2496); // segment-nz
        {char[] a = {47}; op[33] = getOpcodeTls(a);}
        {int[] a = {35,36}; op[34] = getOpcodeCat(a);}
        op[35] = getOpcodeRnm(3, 40); // resourcePath
        op[36] = getOpcodeRep((char)0, (char)1, 37);
        {int[] a = {38,39}; op[37] = getOpcodeCat(a);}
        {char[] a = {63}; op[38] = getOpcodeTls(a);}
        op[39] = getOpcodeRnm(38, 300); // queryOptions
        {int[] a = {41,47,53,54,58,62,66,70,74}; op[40] = getOpcodeAlt(a);}
        {int[] a = {42,44,45}; op[41] = getOpcodeCat(a);}
        op[42] = getOpcodeRep((char)0, (char)1, 43);
        op[43] = getOpcodeRnm(37, 295); // containerQualifier
        op[44] = getOpcodeRnm(206, 1683); // entitySetName
        op[45] = getOpcodeRep((char)0, (char)1, 46);
        op[46] = getOpcodeRnm(4, 78); // collectionNavigation
        {int[] a = {48,50,51}; op[47] = getOpcodeCat(a);}
        op[48] = getOpcodeRep((char)0, (char)1, 49);
        op[49] = getOpcodeRnm(37, 295); // containerQualifier
        op[50] = getOpcodeRnm(207, 1684); // namedEntity
        op[51] = getOpcodeRep((char)0, (char)1, 52);
        op[52] = getOpcodeRnm(10, 111); // singleNavigation
        op[53] = getOpcodeRnm(19, 197); // actionImportCall
        {int[] a = {55,56}; op[54] = getOpcodeCat(a);}
        op[55] = getOpcodeRnm(28, 245); // entityColFunctionImportCall
        op[56] = getOpcodeRep((char)0, (char)1, 57);
        op[57] = getOpcodeRnm(4, 78); // collectionNavigation
        {int[] a = {59,60}; op[58] = getOpcodeCat(a);}
        op[59] = getOpcodeRnm(27, 239); // entityFunctionImportCall
        op[60] = getOpcodeRep((char)0, (char)1, 61);
        op[61] = getOpcodeRnm(10, 111); // singleNavigation
        {int[] a = {63,64}; op[62] = getOpcodeCat(a);}
        op[63] = getOpcodeRnm(30, 257); // complexColFunctionImportCall
        op[64] = getOpcodeRep((char)0, (char)1, 65);
        op[65] = getOpcodeRnm(12, 150); // collectionPath
        {int[] a = {67,68}; op[66] = getOpcodeCat(a);}
        op[67] = getOpcodeRnm(29, 251); // complexFunctionImportCall
        op[68] = getOpcodeRep((char)0, (char)1, 69);
        op[69] = getOpcodeRnm(14, 156); // complexPath
        {int[] a = {71,72}; op[70] = getOpcodeCat(a);}
        op[71] = getOpcodeRnm(32, 269); // primitiveColFunctionImportCall
        op[72] = getOpcodeRep((char)0, (char)1, 73);
        op[73] = getOpcodeRnm(12, 150); // collectionPath
        {int[] a = {75,76}; op[74] = getOpcodeCat(a);}
        op[75] = getOpcodeRnm(31, 263); // primitiveFunctionImportCall
        op[76] = getOpcodeRep((char)0, (char)1, 77);
        op[77] = getOpcodeRnm(13, 153); // singlePath
        {int[] a = {79,83}; op[78] = getOpcodeCat(a);}
        op[79] = getOpcodeRep((char)0, (char)1, 80);
        {int[] a = {81,82}; op[80] = getOpcodeCat(a);}
        {char[] a = {47}; op[81] = getOpcodeTls(a);}
        op[82] = getOpcodeRnm(201, 1664); // qualifiedEntityTypeName
        {int[] a = {84,88,89,90}; op[83] = getOpcodeAlt(a);}
        {int[] a = {85,86}; op[84] = getOpcodeCat(a);}
        op[85] = getOpcodeRnm(5, 91); // keyPredicate
        op[86] = getOpcodeRep((char)0, (char)1, 87);
        op[87] = getOpcodeRnm(10, 111); // singleNavigation
        op[88] = getOpcodeRnm(12, 150); // collectionPath
        op[89] = getOpcodeRnm(16, 167); // ref
        {char[] a = {}; op[90] = getOpcodeTls(a);}
        {int[] a = {92,93}; op[91] = getOpcodeAlt(a);}
        op[92] = getOpcodeRnm(6, 94); // simpleKey
        op[93] = getOpcodeRnm(7, 98); // compoundKey
        {int[] a = {95,96,97}; op[94] = getOpcodeCat(a);}
        op[95] = getOpcodeRnm(335, 2339); // OPEN
        op[96] = getOpcodeRnm(9, 110); // keyPropertyValue
        op[97] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {99,100,101,105}; op[98] = getOpcodeCat(a);}
        op[99] = getOpcodeRnm(335, 2339); // OPEN
        op[100] = getOpcodeRnm(8, 106); // keyValuePair
        op[101] = getOpcodeRep((char)0, Character.MAX_VALUE, 102);
        {int[] a = {103,104}; op[102] = getOpcodeCat(a);}
        op[103] = getOpcodeRnm(329, 2322); // COMMA
        op[104] = getOpcodeRnm(8, 106); // keyValuePair
        op[105] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {107,108,109}; op[106] = getOpcodeCat(a);}
        op[107] = getOpcodeRnm(220, 1745); // primitiveKeyProperty
        op[108] = getOpcodeRnm(330, 2325); // EQ
        op[109] = getOpcodeRnm(9, 110); // keyPropertyValue
        op[110] = getOpcodeRnm(245, 1778); // primitiveLiteral
        {int[] a = {112,116}; op[111] = getOpcodeCat(a);}
        op[112] = getOpcodeRep((char)0, (char)1, 113);
        {int[] a = {114,115}; op[113] = getOpcodeCat(a);}
        {char[] a = {47}; op[114] = getOpcodeTls(a);}
        op[115] = getOpcodeRnm(201, 1664); // qualifiedEntityTypeName
        {int[] a = {117,120,121,122,123}; op[116] = getOpcodeAlt(a);}
        {int[] a = {118,119}; op[117] = getOpcodeCat(a);}
        {char[] a = {47}; op[118] = getOpcodeTls(a);}
        op[119] = getOpcodeRnm(11, 124); // propertyPath
        op[120] = getOpcodeRnm(18, 169); // boundOperation
        op[121] = getOpcodeRnm(16, 167); // ref
        op[122] = getOpcodeRnm(17, 168); // value
        {char[] a = {}; op[123] = getOpcodeTls(a);}
        {int[] a = {125,129,133,137,141,145,149}; op[124] = getOpcodeAlt(a);}
        {int[] a = {126,127}; op[125] = getOpcodeCat(a);}
        op[126] = getOpcodeRnm(228, 1755); // entityColNavigationProperty
        op[127] = getOpcodeRep((char)0, (char)1, 128);
        op[128] = getOpcodeRnm(4, 78); // collectionNavigation
        {int[] a = {130,131}; op[129] = getOpcodeCat(a);}
        op[130] = getOpcodeRnm(227, 1754); // entityNavigationProperty
        op[131] = getOpcodeRep((char)0, (char)1, 132);
        op[132] = getOpcodeRnm(10, 111); // singleNavigation
        {int[] a = {134,135}; op[133] = getOpcodeCat(a);}
        op[134] = getOpcodeRnm(224, 1749); // complexColProperty
        op[135] = getOpcodeRep((char)0, (char)1, 136);
        op[136] = getOpcodeRnm(12, 150); // collectionPath
        {int[] a = {138,139}; op[137] = getOpcodeCat(a);}
        op[138] = getOpcodeRnm(223, 1748); // complexProperty
        op[139] = getOpcodeRep((char)0, (char)1, 140);
        op[140] = getOpcodeRnm(14, 156); // complexPath
        {int[] a = {142,143}; op[141] = getOpcodeCat(a);}
        op[142] = getOpcodeRnm(222, 1747); // primitiveColProperty
        op[143] = getOpcodeRep((char)0, (char)1, 144);
        op[144] = getOpcodeRnm(12, 150); // collectionPath
        {int[] a = {146,147}; op[145] = getOpcodeCat(a);}
        op[146] = getOpcodeRnm(219, 1742); // primitiveProperty
        op[147] = getOpcodeRep((char)0, (char)1, 148);
        op[148] = getOpcodeRnm(13, 153); // singlePath
        op[149] = getOpcodeRnm(225, 1750); // streamProperty
        {int[] a = {151,152}; op[150] = getOpcodeAlt(a);}
        op[151] = getOpcodeRnm(15, 166); // count
        op[152] = getOpcodeRnm(18, 169); // boundOperation
        {int[] a = {154,155}; op[153] = getOpcodeAlt(a);}
        op[154] = getOpcodeRnm(17, 168); // value
        op[155] = getOpcodeRnm(18, 169); // boundOperation
        {int[] a = {157,161}; op[156] = getOpcodeCat(a);}
        op[157] = getOpcodeRep((char)0, (char)1, 158);
        {int[] a = {159,160}; op[158] = getOpcodeCat(a);}
        {char[] a = {47}; op[159] = getOpcodeTls(a);}
        op[160] = getOpcodeRnm(202, 1668); // qualifiedComplexTypeName
        {int[] a = {162,165}; op[161] = getOpcodeAlt(a);}
        {int[] a = {163,164}; op[162] = getOpcodeCat(a);}
        {char[] a = {47}; op[163] = getOpcodeTls(a);}
        op[164] = getOpcodeRnm(11, 124); // propertyPath
        op[165] = getOpcodeRnm(18, 169); // boundOperation
        {char[] a = {47,36,99,111,117,110,116}; op[166] = getOpcodeTbs(a);}
        {char[] a = {47,36,114,101,102}; op[167] = getOpcodeTbs(a);}
        {char[] a = {47,36,118,97,108,117,101}; op[168] = getOpcodeTbs(a);}
        {int[] a = {170,171}; op[169] = getOpcodeCat(a);}
        {char[] a = {47}; op[170] = getOpcodeTls(a);}
        {int[] a = {172,173,177,181,185,189,193}; op[171] = getOpcodeAlt(a);}
        op[172] = getOpcodeRnm(20, 203); // boundActionCall
        {int[] a = {174,175}; op[173] = getOpcodeCat(a);}
        op[174] = getOpcodeRnm(22, 214); // boundEntityColFuncCall
        op[175] = getOpcodeRep((char)0, (char)1, 176);
        op[176] = getOpcodeRnm(4, 78); // collectionNavigation
        {int[] a = {178,179}; op[177] = getOpcodeCat(a);}
        op[178] = getOpcodeRnm(21, 209); // boundEntityFuncCall
        op[179] = getOpcodeRep((char)0, (char)1, 180);
        op[180] = getOpcodeRnm(10, 111); // singleNavigation
        {int[] a = {182,183}; op[181] = getOpcodeCat(a);}
        op[182] = getOpcodeRnm(24, 224); // boundComplexColFuncCall
        op[183] = getOpcodeRep((char)0, (char)1, 184);
        op[184] = getOpcodeRnm(12, 150); // collectionPath
        {int[] a = {186,187}; op[185] = getOpcodeCat(a);}
        op[186] = getOpcodeRnm(23, 219); // boundComplexFuncCall
        op[187] = getOpcodeRep((char)0, (char)1, 188);
        op[188] = getOpcodeRnm(14, 156); // complexPath
        {int[] a = {190,191}; op[189] = getOpcodeCat(a);}
        op[190] = getOpcodeRnm(26, 234); // boundPrimitiveColFuncCall
        op[191] = getOpcodeRep((char)0, (char)1, 192);
        op[192] = getOpcodeRnm(12, 150); // collectionPath
        {int[] a = {194,195}; op[193] = getOpcodeCat(a);}
        op[194] = getOpcodeRnm(25, 229); // boundPrimitiveFuncCall
        op[195] = getOpcodeRep((char)0, (char)1, 196);
        op[196] = getOpcodeRnm(13, 153); // singlePath
        {int[] a = {198,200,201}; op[197] = getOpcodeCat(a);}
        op[198] = getOpcodeRep((char)0, (char)1, 199);
        op[199] = getOpcodeRnm(37, 295); // containerQualifier
        op[200] = getOpcodeRnm(231, 1758); // actionImport
        op[201] = getOpcodeRep((char)0, (char)1, 202);
        {char[] a = {40,41}; op[202] = getOpcodeTls(a);}
        {int[] a = {204,205,206,207}; op[203] = getOpcodeCat(a);}
        op[204] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[205] = getOpcodeTls(a);}
        op[206] = getOpcodeRnm(230, 1757); // action
        op[207] = getOpcodeRep((char)0, (char)1, 208);
        {char[] a = {40,41}; op[208] = getOpcodeTls(a);}
        {int[] a = {210,211,212,213}; op[209] = getOpcodeCat(a);}
        op[210] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[211] = getOpcodeTls(a);}
        op[212] = getOpcodeRnm(233, 1766); // entityFunction
        op[213] = getOpcodeRnm(33, 275); // functionParameters
        {int[] a = {215,216,217,218}; op[214] = getOpcodeCat(a);}
        op[215] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[216] = getOpcodeTls(a);}
        op[217] = getOpcodeRnm(234, 1767); // entityColFunction
        op[218] = getOpcodeRnm(33, 275); // functionParameters
        {int[] a = {220,221,222,223}; op[219] = getOpcodeCat(a);}
        op[220] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[221] = getOpcodeTls(a);}
        op[222] = getOpcodeRnm(235, 1768); // complexFunction
        op[223] = getOpcodeRnm(33, 275); // functionParameters
        {int[] a = {225,226,227,228}; op[224] = getOpcodeCat(a);}
        op[225] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[226] = getOpcodeTls(a);}
        op[227] = getOpcodeRnm(236, 1769); // complexColFunction
        op[228] = getOpcodeRnm(33, 275); // functionParameters
        {int[] a = {230,231,232,233}; op[229] = getOpcodeCat(a);}
        op[230] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[231] = getOpcodeTls(a);}
        op[232] = getOpcodeRnm(237, 1770); // primitiveFunction
        op[233] = getOpcodeRnm(33, 275); // functionParameters
        {int[] a = {235,236,237,238}; op[234] = getOpcodeCat(a);}
        op[235] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[236] = getOpcodeTls(a);}
        op[237] = getOpcodeRnm(238, 1771); // primitiveColFunction
        op[238] = getOpcodeRnm(33, 275); // functionParameters
        {int[] a = {240,242,243}; op[239] = getOpcodeCat(a);}
        op[240] = getOpcodeRep((char)0, (char)1, 241);
        op[241] = getOpcodeRnm(37, 295); // containerQualifier
        op[242] = getOpcodeRnm(239, 1772); // entityFunctionImport
        op[243] = getOpcodeRep((char)0, (char)1, 244);
        op[244] = getOpcodeRnm(33, 275); // functionParameters
        {int[] a = {246,248,249}; op[245] = getOpcodeCat(a);}
        op[246] = getOpcodeRep((char)0, (char)1, 247);
        op[247] = getOpcodeRnm(37, 295); // containerQualifier
        op[248] = getOpcodeRnm(240, 1773); // entityColFunctionImport
        op[249] = getOpcodeRep((char)0, (char)1, 250);
        op[250] = getOpcodeRnm(33, 275); // functionParameters
        {int[] a = {252,254,255}; op[251] = getOpcodeCat(a);}
        op[252] = getOpcodeRep((char)0, (char)1, 253);
        op[253] = getOpcodeRnm(37, 295); // containerQualifier
        op[254] = getOpcodeRnm(241, 1774); // complexFunctionImport
        op[255] = getOpcodeRep((char)0, (char)1, 256);
        op[256] = getOpcodeRnm(33, 275); // functionParameters
        {int[] a = {258,260,261}; op[257] = getOpcodeCat(a);}
        op[258] = getOpcodeRep((char)0, (char)1, 259);
        op[259] = getOpcodeRnm(37, 295); // containerQualifier
        op[260] = getOpcodeRnm(242, 1775); // complexColFunctionImport
        op[261] = getOpcodeRep((char)0, (char)1, 262);
        op[262] = getOpcodeRnm(33, 275); // functionParameters
        {int[] a = {264,266,267}; op[263] = getOpcodeCat(a);}
        op[264] = getOpcodeRep((char)0, (char)1, 265);
        op[265] = getOpcodeRnm(37, 295); // containerQualifier
        op[266] = getOpcodeRnm(243, 1776); // primitiveFunctionImport
        op[267] = getOpcodeRep((char)0, (char)1, 268);
        op[268] = getOpcodeRnm(33, 275); // functionParameters
        {int[] a = {270,272,273}; op[269] = getOpcodeCat(a);}
        op[270] = getOpcodeRep((char)0, (char)1, 271);
        op[271] = getOpcodeRnm(37, 295); // containerQualifier
        op[272] = getOpcodeRnm(244, 1777); // primitiveColFunctionImport
        op[273] = getOpcodeRep((char)0, (char)1, 274);
        op[274] = getOpcodeRnm(33, 275); // functionParameters
        {int[] a = {276,277,284}; op[275] = getOpcodeCat(a);}
        op[276] = getOpcodeRnm(335, 2339); // OPEN
        op[277] = getOpcodeRep((char)0, (char)1, 278);
        {int[] a = {279,280}; op[278] = getOpcodeCat(a);}
        op[279] = getOpcodeRnm(34, 285); // functionParameter
        op[280] = getOpcodeRep((char)0, Character.MAX_VALUE, 281);
        {int[] a = {282,283}; op[281] = getOpcodeCat(a);}
        op[282] = getOpcodeRnm(329, 2322); // COMMA
        op[283] = getOpcodeRnm(34, 285); // functionParameter
        op[284] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {286,287,288}; op[285] = getOpcodeCat(a);}
        op[286] = getOpcodeRnm(35, 291); // parameterName
        op[287] = getOpcodeRnm(330, 2325); // EQ
        {int[] a = {289,290}; op[288] = getOpcodeAlt(a);}
        op[289] = getOpcodeRnm(36, 292); // parameterAlias
        op[290] = getOpcodeRnm(245, 1778); // primitiveLiteral
        op[291] = getOpcodeRnm(212, 1689); // odataIdentifier
        {int[] a = {293,294}; op[292] = getOpcodeCat(a);}
        op[293] = getOpcodeRnm(327, 2316); // AT
        op[294] = getOpcodeRnm(212, 1689); // odataIdentifier
        {int[] a = {296,297,298,299}; op[295] = getOpcodeCat(a);}
        op[296] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[297] = getOpcodeTls(a);}
        op[298] = getOpcodeRnm(229, 1756); // entityContainer
        {char[] a = {46}; op[299] = getOpcodeTls(a);}
        {int[] a = {301,302}; op[300] = getOpcodeCat(a);}
        op[301] = getOpcodeRnm(39, 306); // queryOption
        op[302] = getOpcodeRep((char)0, Character.MAX_VALUE, 303);
        {int[] a = {304,305}; op[303] = getOpcodeCat(a);}
        {char[] a = {38}; op[304] = getOpcodeTls(a);}
        op[305] = getOpcodeRnm(39, 306); // queryOption
        {int[] a = {307,308,309,310}; op[306] = getOpcodeAlt(a);}
        op[307] = getOpcodeRnm(40, 311); // systemQueryOption
        op[308] = getOpcodeRnm(92, 803); // aliasAndValue
        op[309] = getOpcodeRnm(93, 807); // parameterNameAndValue
        op[310] = getOpcodeRnm(96, 832); // customQueryOption
        {int[] a = {312,313,314,315,316,317,318,319,320,321,322}; op[311] = getOpcodeAlt(a);}
        op[312] = getOpcodeRnm(41, 323); // apply
        op[313] = getOpcodeRnm(65, 581); // expand
        op[314] = getOpcodeRnm(70, 641); // filter
        op[315] = getOpcodeRnm(75, 671); // format
        op[316] = getOpcodeRnm(71, 645); // orderby
        op[317] = getOpcodeRnm(73, 661); // skip
        op[318] = getOpcodeRnm(74, 666); // top
        op[319] = getOpcodeRnm(76, 682); // inlinecount
        op[320] = getOpcodeRnm(77, 688); // search
        op[321] = getOpcodeRnm(84, 733); // select
        op[322] = getOpcodeRnm(91, 798); // skiptoken
        {int[] a = {324,325,326}; op[323] = getOpcodeCat(a);}
        {char[] a = {36,97,112,112,108,121}; op[324] = getOpcodeTbs(a);}
        op[325] = getOpcodeRnm(330, 2325); // EQ
        op[326] = getOpcodeRnm(42, 327); // applyExpr
        {int[] a = {328,329}; op[327] = getOpcodeCat(a);}
        op[328] = getOpcodeRnm(43, 333); // applyTrafo
        op[329] = getOpcodeRep((char)0, Character.MAX_VALUE, 330);
        {int[] a = {331,332}; op[330] = getOpcodeCat(a);}
        {char[] a = {47}; op[331] = getOpcodeTls(a);}
        op[332] = getOpcodeRnm(43, 333); // applyTrafo
        {int[] a = {334,335,336,337,338,339,340,341,342,343,344,345}; op[333] = getOpcodeAlt(a);}
        op[334] = getOpcodeRnm(44, 346); // aggregateTrafo
        op[335] = getOpcodeRnm(48, 413); // bottomcountTrafo
        op[336] = getOpcodeRnm(49, 424); // bottompercentTrafo
        op[337] = getOpcodeRnm(50, 435); // bottomsumTrafo
        op[338] = getOpcodeRnm(51, 446); // combineTrafo
        op[339] = getOpcodeRnm(52, 459); // expandTrafo
        op[340] = getOpcodeRnm(53, 470); // filterTrafo
        op[341] = getOpcodeRnm(54, 477); // groupbyTrafo
        op[342] = getOpcodeRnm(58, 518); // identityTrafo
        op[343] = getOpcodeRnm(59, 519); // topcountTrafo
        op[344] = getOpcodeRnm(60, 530); // toppercentTrafo
        op[345] = getOpcodeRnm(61, 541); // topsumTrafo
        {int[] a = {347,348,349,359,360}; op[346] = getOpcodeCat(a);}
        {char[] a = {97,103,103,114,101,103,97,116,101}; op[347] = getOpcodeTbs(a);}
        op[348] = getOpcodeRnm(335, 2339); // OPEN
        op[349] = getOpcodeRep((char)0, (char)1, 350);
        {int[] a = {351,352,353}; op[350] = getOpcodeCat(a);}
        op[351] = getOpcodeRnm(326, 2315); // BWS
        op[352] = getOpcodeRnm(45, 361); // aggregateParam
        op[353] = getOpcodeRep((char)0, Character.MAX_VALUE, 354);
        {int[] a = {355,356,357,358}; op[354] = getOpcodeCat(a);}
        op[355] = getOpcodeRnm(326, 2315); // BWS
        op[356] = getOpcodeRnm(329, 2322); // COMMA
        op[357] = getOpcodeRnm(326, 2315); // BWS
        op[358] = getOpcodeRnm(45, 361); // aggregateParam
        op[359] = getOpcodeRnm(326, 2315); // BWS
        op[360] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {362,366,372,384}; op[361] = getOpcodeCat(a);}
        {int[] a = {363,364,365}; op[362] = getOpcodeAlt(a);}
        {char[] a = {36,99,111,117,110,116}; op[363] = getOpcodeTbs(a);}
        op[364] = getOpcodeRnm(46, 390); // evalExpr
        op[365] = getOpcodeRnm(62, 552); // countOrPropertyWithPath
        op[366] = getOpcodeRep((char)0, (char)1, 367);
        {int[] a = {368,369,370,371}; op[367] = getOpcodeCat(a);}
        op[368] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {119,105,116,104}; op[369] = getOpcodeTbs(a);}
        op[370] = getOpcodeRnm(325, 2309); // RWS
        op[371] = getOpcodeRnm(47, 403); // aggregationFunction
        op[372] = getOpcodeRep((char)0, Character.MAX_VALUE, 373);
        {int[] a = {374,375,376,377,378}; op[373] = getOpcodeCat(a);}
        op[374] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {102,114,111,109}; op[375] = getOpcodeTbs(a);}
        op[376] = getOpcodeRnm(325, 2309); // RWS
        op[377] = getOpcodeRnm(63, 563); // propertyWithPath
        op[378] = getOpcodeRep((char)0, (char)1, 379);
        {int[] a = {380,381,382,383}; op[379] = getOpcodeCat(a);}
        op[380] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {119,105,116,104}; op[381] = getOpcodeTbs(a);}
        op[382] = getOpcodeRnm(325, 2309); // RWS
        op[383] = getOpcodeRnm(47, 403); // aggregationFunction
        op[384] = getOpcodeRep((char)0, (char)1, 385);
        {int[] a = {386,387,388,389}; op[385] = getOpcodeCat(a);}
        op[386] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {97,115}; op[387] = getOpcodeTbs(a);}
        op[388] = getOpcodeRnm(325, 2309); // RWS
        op[389] = getOpcodeRnm(212, 1689); // odataIdentifier
        {int[] a = {391,392,393,394,395,401,402}; op[390] = getOpcodeCat(a);}
        {char[] a = {101,118,97,108}; op[391] = getOpcodeTbs(a);}
        op[392] = getOpcodeRnm(335, 2339); // OPEN
        op[393] = getOpcodeRnm(326, 2315); // BWS
        op[394] = getOpcodeRnm(100, 865); // commonExpr
        op[395] = getOpcodeRep((char)0, (char)1, 396);
        {int[] a = {397,398,399,400}; op[396] = getOpcodeCat(a);}
        op[397] = getOpcodeRnm(326, 2315); // BWS
        op[398] = getOpcodeRnm(329, 2322); // COMMA
        op[399] = getOpcodeRnm(326, 2315); // BWS
        op[400] = getOpcodeRnm(64, 573); // navigationPropertyWithPath
        op[401] = getOpcodeRnm(326, 2315); // BWS
        op[402] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {404,405,406,407,408,409}; op[403] = getOpcodeAlt(a);}
        {char[] a = {115,117,109}; op[404] = getOpcodeTbs(a);}
        {char[] a = {109,105,110}; op[405] = getOpcodeTbs(a);}
        {char[] a = {109,97,120}; op[406] = getOpcodeTbs(a);}
        {char[] a = {97,118,101,114,97,103,101}; op[407] = getOpcodeTbs(a);}
        {char[] a = {99,111,117,110,116,100,105,115,116,105,110,99,116}; op[408] = getOpcodeTbs(a);}
        {int[] a = {410,411,412}; op[409] = getOpcodeCat(a);}
        op[410] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[411] = getOpcodeTls(a);}
        op[412] = getOpcodeRnm(212, 1689); // odataIdentifier
        {int[] a = {414,415,416,417,418,419,420,421,422,423}; op[413] = getOpcodeCat(a);}
        {char[] a = {98,111,116,116,111,109,99,111,117,110,116}; op[414] = getOpcodeTbs(a);}
        op[415] = getOpcodeRnm(335, 2339); // OPEN
        op[416] = getOpcodeRnm(326, 2315); // BWS
        op[417] = getOpcodeRnm(100, 865); // commonExpr
        op[418] = getOpcodeRnm(326, 2315); // BWS
        op[419] = getOpcodeRnm(329, 2322); // COMMA
        op[420] = getOpcodeRnm(326, 2315); // BWS
        op[421] = getOpcodeRnm(100, 865); // commonExpr
        op[422] = getOpcodeRnm(326, 2315); // BWS
        op[423] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {425,426,427,428,429,430,431,432,433,434}; op[424] = getOpcodeCat(a);}
        {char[] a = {98,111,116,116,111,109,112,101,114,99,101,110,116}; op[425] = getOpcodeTbs(a);}
        op[426] = getOpcodeRnm(335, 2339); // OPEN
        op[427] = getOpcodeRnm(326, 2315); // BWS
        op[428] = getOpcodeRnm(100, 865); // commonExpr
        op[429] = getOpcodeRnm(326, 2315); // BWS
        op[430] = getOpcodeRnm(329, 2322); // COMMA
        op[431] = getOpcodeRnm(326, 2315); // BWS
        op[432] = getOpcodeRnm(100, 865); // commonExpr
        op[433] = getOpcodeRnm(326, 2315); // BWS
        op[434] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {436,437,438,439,440,441,442,443,444,445}; op[435] = getOpcodeCat(a);}
        {char[] a = {98,111,116,116,111,109,115,117,109}; op[436] = getOpcodeTbs(a);}
        op[437] = getOpcodeRnm(335, 2339); // OPEN
        op[438] = getOpcodeRnm(326, 2315); // BWS
        op[439] = getOpcodeRnm(100, 865); // commonExpr
        op[440] = getOpcodeRnm(326, 2315); // BWS
        op[441] = getOpcodeRnm(329, 2322); // COMMA
        op[442] = getOpcodeRnm(326, 2315); // BWS
        op[443] = getOpcodeRnm(100, 865); // commonExpr
        op[444] = getOpcodeRnm(326, 2315); // BWS
        op[445] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {447,448,449,450,451,457,458}; op[446] = getOpcodeCat(a);}
        {char[] a = {99,111,109,98,105,110,101}; op[447] = getOpcodeTbs(a);}
        op[448] = getOpcodeRnm(335, 2339); // OPEN
        op[449] = getOpcodeRnm(326, 2315); // BWS
        op[450] = getOpcodeRnm(42, 327); // applyExpr
        op[451] = getOpcodeRep((char)1, Character.MAX_VALUE, 452);
        {int[] a = {453,454,455,456}; op[452] = getOpcodeCat(a);}
        op[453] = getOpcodeRnm(326, 2315); // BWS
        op[454] = getOpcodeRnm(329, 2322); // COMMA
        op[455] = getOpcodeRnm(326, 2315); // BWS
        op[456] = getOpcodeRnm(42, 327); // applyExpr
        op[457] = getOpcodeRnm(326, 2315); // BWS
        op[458] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {460,461,462,463,464,465,466,467,468,469}; op[459] = getOpcodeCat(a);}
        {char[] a = {101,120,112,97,110,100}; op[460] = getOpcodeTbs(a);}
        op[461] = getOpcodeRnm(335, 2339); // OPEN
        op[462] = getOpcodeRnm(326, 2315); // BWS
        op[463] = getOpcodeRnm(64, 573); // navigationPropertyWithPath
        op[464] = getOpcodeRnm(326, 2315); // BWS
        op[465] = getOpcodeRnm(329, 2322); // COMMA
        op[466] = getOpcodeRnm(326, 2315); // BWS
        op[467] = getOpcodeRnm(101, 882); // boolCommonExpr
        op[468] = getOpcodeRnm(326, 2315); // BWS
        op[469] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {471,472,473,474,475,476}; op[470] = getOpcodeCat(a);}
        {char[] a = {102,105,108,116,101,114}; op[471] = getOpcodeTbs(a);}
        op[472] = getOpcodeRnm(335, 2339); // OPEN
        op[473] = getOpcodeRnm(326, 2315); // BWS
        op[474] = getOpcodeRnm(101, 882); // boolCommonExpr
        op[475] = getOpcodeRnm(326, 2315); // BWS
        op[476] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {478,479,480,481,482,483,484,485,486,487}; op[477] = getOpcodeCat(a);}
        {char[] a = {103,114,111,117,112,98,121}; op[478] = getOpcodeTbs(a);}
        op[479] = getOpcodeRnm(335, 2339); // OPEN
        op[480] = getOpcodeRnm(326, 2315); // BWS
        op[481] = getOpcodeRnm(55, 488); // groupbyList
        op[482] = getOpcodeRnm(326, 2315); // BWS
        op[483] = getOpcodeRnm(329, 2322); // COMMA
        op[484] = getOpcodeRnm(326, 2315); // BWS
        op[485] = getOpcodeRnm(42, 327); // applyExpr
        op[486] = getOpcodeRnm(326, 2315); // BWS
        op[487] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {489,490,491,492,498,499}; op[488] = getOpcodeCat(a);}
        op[489] = getOpcodeRnm(335, 2339); // OPEN
        op[490] = getOpcodeRnm(326, 2315); // BWS
        op[491] = getOpcodeRnm(56, 500); // groupbyElement
        op[492] = getOpcodeRep((char)0, Character.MAX_VALUE, 493);
        {int[] a = {494,495,496,497}; op[493] = getOpcodeCat(a);}
        op[494] = getOpcodeRnm(326, 2315); // BWS
        op[495] = getOpcodeRnm(329, 2322); // COMMA
        op[496] = getOpcodeRnm(326, 2315); // BWS
        op[497] = getOpcodeRnm(56, 500); // groupbyElement
        op[498] = getOpcodeRnm(326, 2315); // BWS
        op[499] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {501,502}; op[500] = getOpcodeAlt(a);}
        op[501] = getOpcodeRnm(63, 563); // propertyWithPath
        op[502] = getOpcodeRnm(57, 503); // rollupSpec
        {int[] a = {504,505,506,507,510,516,517}; op[503] = getOpcodeCat(a);}
        {char[] a = {114,111,108,108,117,112}; op[504] = getOpcodeTbs(a);}
        op[505] = getOpcodeRnm(335, 2339); // OPEN
        op[506] = getOpcodeRnm(326, 2315); // BWS
        {int[] a = {508,509}; op[507] = getOpcodeAlt(a);}
        {char[] a = {36,97,108,108}; op[508] = getOpcodeTbs(a);}
        op[509] = getOpcodeRnm(63, 563); // propertyWithPath
        op[510] = getOpcodeRep((char)1, Character.MAX_VALUE, 511);
        {int[] a = {512,513,514,515}; op[511] = getOpcodeCat(a);}
        op[512] = getOpcodeRnm(326, 2315); // BWS
        op[513] = getOpcodeRnm(329, 2322); // COMMA
        op[514] = getOpcodeRnm(326, 2315); // BWS
        op[515] = getOpcodeRnm(63, 563); // propertyWithPath
        op[516] = getOpcodeRnm(326, 2315); // BWS
        op[517] = getOpcodeRnm(336, 2342); // CLOSE
        {char[] a = {105,100,101,110,116,105,116,121}; op[518] = getOpcodeTbs(a);}
        {int[] a = {520,521,522,523,524,525,526,527,528,529}; op[519] = getOpcodeCat(a);}
        {char[] a = {116,111,112,99,111,117,110,116}; op[520] = getOpcodeTbs(a);}
        op[521] = getOpcodeRnm(335, 2339); // OPEN
        op[522] = getOpcodeRnm(326, 2315); // BWS
        op[523] = getOpcodeRnm(100, 865); // commonExpr
        op[524] = getOpcodeRnm(326, 2315); // BWS
        op[525] = getOpcodeRnm(329, 2322); // COMMA
        op[526] = getOpcodeRnm(326, 2315); // BWS
        op[527] = getOpcodeRnm(100, 865); // commonExpr
        op[528] = getOpcodeRnm(326, 2315); // BWS
        op[529] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {531,532,533,534,535,536,537,538,539,540}; op[530] = getOpcodeCat(a);}
        {char[] a = {116,111,112,112,101,114,99,101,110,116}; op[531] = getOpcodeTbs(a);}
        op[532] = getOpcodeRnm(335, 2339); // OPEN
        op[533] = getOpcodeRnm(326, 2315); // BWS
        op[534] = getOpcodeRnm(100, 865); // commonExpr
        op[535] = getOpcodeRnm(326, 2315); // BWS
        op[536] = getOpcodeRnm(329, 2322); // COMMA
        op[537] = getOpcodeRnm(326, 2315); // BWS
        op[538] = getOpcodeRnm(100, 865); // commonExpr
        op[539] = getOpcodeRnm(326, 2315); // BWS
        op[540] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {542,543,544,545,546,547,548,549,550,551}; op[541] = getOpcodeCat(a);}
        {char[] a = {116,111,112,115,117,109}; op[542] = getOpcodeTbs(a);}
        op[543] = getOpcodeRnm(335, 2339); // OPEN
        op[544] = getOpcodeRnm(326, 2315); // BWS
        op[545] = getOpcodeRnm(100, 865); // commonExpr
        op[546] = getOpcodeRnm(326, 2315); // BWS
        op[547] = getOpcodeRnm(329, 2322); // COMMA
        op[548] = getOpcodeRnm(326, 2315); // BWS
        op[549] = getOpcodeRnm(100, 865); // commonExpr
        op[550] = getOpcodeRnm(326, 2315); // BWS
        op[551] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {553,559}; op[552] = getOpcodeCat(a);}
        op[553] = getOpcodeRep((char)0, Character.MAX_VALUE, 554);
        {int[] a = {555,558}; op[554] = getOpcodeCat(a);}
        {int[] a = {556,557}; op[555] = getOpcodeAlt(a);}
        op[556] = getOpcodeRnm(223, 1748); // complexProperty
        op[557] = getOpcodeRnm(226, 1751); // navigationProperty
        {char[] a = {47}; op[558] = getOpcodeTls(a);}
        {int[] a = {560,561,562}; op[559] = getOpcodeAlt(a);}
        op[560] = getOpcodeRnm(226, 1751); // navigationProperty
        op[561] = getOpcodeRnm(218, 1736); // property
        {char[] a = {36,99,111,117,110,116}; op[562] = getOpcodeTbs(a);}
        {int[] a = {564,570}; op[563] = getOpcodeCat(a);}
        op[564] = getOpcodeRep((char)0, Character.MAX_VALUE, 565);
        {int[] a = {566,569}; op[565] = getOpcodeCat(a);}
        {int[] a = {567,568}; op[566] = getOpcodeAlt(a);}
        op[567] = getOpcodeRnm(223, 1748); // complexProperty
        op[568] = getOpcodeRnm(226, 1751); // navigationProperty
        {char[] a = {47}; op[569] = getOpcodeTls(a);}
        {int[] a = {571,572}; op[570] = getOpcodeAlt(a);}
        op[571] = getOpcodeRnm(226, 1751); // navigationProperty
        op[572] = getOpcodeRnm(218, 1736); // property
        {int[] a = {574,580}; op[573] = getOpcodeCat(a);}
        op[574] = getOpcodeRep((char)0, Character.MAX_VALUE, 575);
        {int[] a = {576,579}; op[575] = getOpcodeCat(a);}
        {int[] a = {577,578}; op[576] = getOpcodeAlt(a);}
        op[577] = getOpcodeRnm(223, 1748); // complexProperty
        op[578] = getOpcodeRnm(226, 1751); // navigationProperty
        {char[] a = {47}; op[579] = getOpcodeTls(a);}
        op[580] = getOpcodeRnm(226, 1751); // navigationProperty
        {int[] a = {582,583,584,585}; op[581] = getOpcodeCat(a);}
        {char[] a = {36,101,120,112,97,110,100}; op[582] = getOpcodeTbs(a);}
        op[583] = getOpcodeRnm(330, 2325); // EQ
        op[584] = getOpcodeRnm(66, 589); // expandItem
        op[585] = getOpcodeRep((char)0, Character.MAX_VALUE, 586);
        {int[] a = {587,588}; op[586] = getOpcodeCat(a);}
        op[587] = getOpcodeRnm(329, 2322); // COMMA
        op[588] = getOpcodeRnm(66, 589); // expandItem
        {int[] a = {590,594,604,605,609,618}; op[589] = getOpcodeCat(a);}
        op[590] = getOpcodeRep((char)0, (char)1, 591);
        {int[] a = {592,593}; op[591] = getOpcodeCat(a);}
        op[592] = getOpcodeRnm(201, 1664); // qualifiedEntityTypeName
        {char[] a = {47}; op[593] = getOpcodeTls(a);}
        op[594] = getOpcodeRep((char)0, Character.MAX_VALUE, 595);
        {int[] a = {596,599,600}; op[595] = getOpcodeCat(a);}
        {int[] a = {597,598}; op[596] = getOpcodeAlt(a);}
        op[597] = getOpcodeRnm(223, 1748); // complexProperty
        op[598] = getOpcodeRnm(224, 1749); // complexColProperty
        {char[] a = {47}; op[599] = getOpcodeTls(a);}
        op[600] = getOpcodeRep((char)0, (char)1, 601);
        {int[] a = {602,603}; op[601] = getOpcodeCat(a);}
        op[602] = getOpcodeRnm(202, 1668); // qualifiedComplexTypeName
        {char[] a = {47}; op[603] = getOpcodeTls(a);}
        op[604] = getOpcodeRnm(226, 1751); // navigationProperty
        op[605] = getOpcodeRep((char)0, (char)1, 606);
        {int[] a = {607,608}; op[606] = getOpcodeCat(a);}
        {char[] a = {47}; op[607] = getOpcodeTls(a);}
        op[608] = getOpcodeRnm(201, 1664); // qualifiedEntityTypeName
        op[609] = getOpcodeRep((char)0, (char)1, 610);
        {int[] a = {611,612,613,617}; op[610] = getOpcodeCat(a);}
        op[611] = getOpcodeRnm(335, 2339); // OPEN
        op[612] = getOpcodeRnm(68, 629); // expandOption
        op[613] = getOpcodeRep((char)0, Character.MAX_VALUE, 614);
        {int[] a = {615,616}; op[614] = getOpcodeCat(a);}
        op[615] = getOpcodeRnm(332, 2330); // SEMI
        op[616] = getOpcodeRnm(68, 629); // expandOption
        op[617] = getOpcodeRnm(336, 2342); // CLOSE
        op[618] = getOpcodeRep((char)0, (char)1, 619);
        {int[] a = {620,621}; op[619] = getOpcodeAlt(a);}
        op[620] = getOpcodeRnm(16, 167); // ref
        op[621] = getOpcodeRnm(15, 166); // count
        {int[] a = {623,624,625,626,627,628}; op[622] = getOpcodeAlt(a);}
        op[623] = getOpcodeRnm(70, 641); // filter
        op[624] = getOpcodeRnm(71, 645); // orderby
        op[625] = getOpcodeRnm(77, 688); // search
        op[626] = getOpcodeRnm(73, 661); // skip
        op[627] = getOpcodeRnm(74, 666); // top
        op[628] = getOpcodeRnm(76, 682); // inlinecount
        {int[] a = {630,631,632,633}; op[629] = getOpcodeAlt(a);}
        op[630] = getOpcodeRnm(67, 622); // expandRefOption
        op[631] = getOpcodeRnm(84, 733); // select
        op[632] = getOpcodeRnm(65, 581); // expand
        op[633] = getOpcodeRnm(69, 634); // levels
        {int[] a = {635,636,637}; op[634] = getOpcodeCat(a);}
        {char[] a = {36,108,101,118,101,108,115}; op[635] = getOpcodeTbs(a);}
        op[636] = getOpcodeRnm(330, 2325); // EQ
        {int[] a = {638,640}; op[637] = getOpcodeAlt(a);}
        op[638] = getOpcodeRep((char)1, Character.MAX_VALUE, 639);
        op[639] = getOpcodeRnm(362, 2653); // DIGIT
        {char[] a = {109,97,120}; op[640] = getOpcodeTbs(a);}
        {int[] a = {642,643,644}; op[641] = getOpcodeCat(a);}
        {char[] a = {36,102,105,108,116,101,114}; op[642] = getOpcodeTbs(a);}
        op[643] = getOpcodeRnm(330, 2325); // EQ
        op[644] = getOpcodeRnm(101, 882); // boolCommonExpr
        {int[] a = {646,647,648,649}; op[645] = getOpcodeCat(a);}
        {char[] a = {36,111,114,100,101,114,98,121}; op[646] = getOpcodeTbs(a);}
        op[647] = getOpcodeRnm(330, 2325); // EQ
        op[648] = getOpcodeRnm(72, 653); // orderbyItem
        op[649] = getOpcodeRep((char)0, Character.MAX_VALUE, 650);
        {int[] a = {651,652}; op[650] = getOpcodeCat(a);}
        op[651] = getOpcodeRnm(329, 2322); // COMMA
        op[652] = getOpcodeRnm(72, 653); // orderbyItem
        {int[] a = {654,655}; op[653] = getOpcodeCat(a);}
        op[654] = getOpcodeRnm(100, 865); // commonExpr
        op[655] = getOpcodeRep((char)0, (char)1, 656);
        {int[] a = {657,658}; op[656] = getOpcodeCat(a);}
        op[657] = getOpcodeRnm(325, 2309); // RWS
        {int[] a = {659,660}; op[658] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[659] = getOpcodeTbs(a);}
        {char[] a = {100,101,115,99}; op[660] = getOpcodeTbs(a);}
        {int[] a = {662,663,664}; op[661] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112}; op[662] = getOpcodeTbs(a);}
        op[663] = getOpcodeRnm(330, 2325); // EQ
        op[664] = getOpcodeRep((char)1, Character.MAX_VALUE, 665);
        op[665] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {667,668,669}; op[666] = getOpcodeCat(a);}
        {char[] a = {36,116,111,112}; op[667] = getOpcodeTbs(a);}
        op[668] = getOpcodeRnm(330, 2325); // EQ
        op[669] = getOpcodeRep((char)1, Character.MAX_VALUE, 670);
        op[670] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {672,673,674}; op[671] = getOpcodeCat(a);}
        {char[] a = {36,102,111,114,109,97,116}; op[672] = getOpcodeTbs(a);}
        op[673] = getOpcodeRnm(330, 2325); // EQ
        {int[] a = {675,676,677,678}; op[674] = getOpcodeAlt(a);}
        {char[] a = {97,116,111,109}; op[675] = getOpcodeTbs(a);}
        {char[] a = {106,115,111,110}; op[676] = getOpcodeTbs(a);}
        {char[] a = {120,109,108}; op[677] = getOpcodeTbs(a);}
        op[678] = getOpcodeRep((char)1, Character.MAX_VALUE, 679);
        {int[] a = {680,681}; op[679] = getOpcodeAlt(a);}
        op[680] = getOpcodeRnm(348, 2498); // pchar
        {char[] a = {47}; op[681] = getOpcodeTls(a);}
        {int[] a = {683,684,685}; op[682] = getOpcodeCat(a);}
        {char[] a = {36,105,110,108,105,110,101,99,111,117,110,116}; op[683] = getOpcodeTbs(a);}
        op[684] = getOpcodeRnm(330, 2325); // EQ
        {int[] a = {686,687}; op[685] = getOpcodeAlt(a);}
        {char[] a = {97,108,108,112,97,103,101,115}; op[686] = getOpcodeTbs(a);}
        {char[] a = {110,111,110,101}; op[687] = getOpcodeTbs(a);}
        {int[] a = {689,690,691,692}; op[688] = getOpcodeCat(a);}
        {char[] a = {36,115,101,97,114,99,104}; op[689] = getOpcodeTbs(a);}
        op[690] = getOpcodeRnm(330, 2325); // EQ
        op[691] = getOpcodeRnm(326, 2315); // BWS
        op[692] = getOpcodeRnm(78, 693); // searchExpr
        {int[] a = {694,702}; op[693] = getOpcodeCat(a);}
        {int[] a = {695,701}; op[694] = getOpcodeAlt(a);}
        {int[] a = {696,697,698,699,700}; op[695] = getOpcodeCat(a);}
        op[696] = getOpcodeRnm(335, 2339); // OPEN
        op[697] = getOpcodeRnm(326, 2315); // BWS
        op[698] = getOpcodeRnm(78, 693); // searchExpr
        op[699] = getOpcodeRnm(326, 2315); // BWS
        op[700] = getOpcodeRnm(336, 2342); // CLOSE
        op[701] = getOpcodeRnm(81, 718); // searchTerm
        op[702] = getOpcodeRep((char)0, (char)1, 703);
        {int[] a = {704,705}; op[703] = getOpcodeAlt(a);}
        op[704] = getOpcodeRnm(79, 706); // searchOrExpr
        op[705] = getOpcodeRnm(80, 711); // searchAndExpr
        {int[] a = {707,708,709,710}; op[706] = getOpcodeCat(a);}
        op[707] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {79,82}; op[708] = getOpcodeTbs(a);}
        op[709] = getOpcodeRnm(325, 2309); // RWS
        op[710] = getOpcodeRnm(78, 693); // searchExpr
        {int[] a = {712,713,717}; op[711] = getOpcodeCat(a);}
        op[712] = getOpcodeRnm(325, 2309); // RWS
        op[713] = getOpcodeRep((char)0, (char)1, 714);
        {int[] a = {715,716}; op[714] = getOpcodeCat(a);}
        {char[] a = {65,78,68}; op[715] = getOpcodeTbs(a);}
        op[716] = getOpcodeRnm(325, 2309); // RWS
        op[717] = getOpcodeRnm(78, 693); // searchExpr
        {int[] a = {719,723}; op[718] = getOpcodeCat(a);}
        op[719] = getOpcodeRep((char)0, (char)1, 720);
        {int[] a = {721,722}; op[720] = getOpcodeCat(a);}
        {char[] a = {78,79,84}; op[721] = getOpcodeTbs(a);}
        op[722] = getOpcodeRnm(325, 2309); // RWS
        {int[] a = {724,725}; op[723] = getOpcodeAlt(a);}
        op[724] = getOpcodeRnm(82, 726); // searchPhrase
        op[725] = getOpcodeRnm(83, 731); // searchWord
        {int[] a = {727,728,730}; op[726] = getOpcodeCat(a);}
        op[727] = getOpcodeRnm(188, 1572); // quotation-mark
        op[728] = getOpcodeRep((char)1, Character.MAX_VALUE, 729);
        op[729] = getOpcodeRnm(360, 2643); // qchar-no-AMP-DQUOTE
        op[730] = getOpcodeRnm(188, 1572); // quotation-mark
        op[731] = getOpcodeRep((char)1, Character.MAX_VALUE, 732);
        op[732] = getOpcodeRnm(361, 2650); // ALPHA
        {int[] a = {734,735,736,737}; op[733] = getOpcodeCat(a);}
        {char[] a = {36,115,101,108,101,99,116}; op[734] = getOpcodeTbs(a);}
        op[735] = getOpcodeRnm(330, 2325); // EQ
        op[736] = getOpcodeRnm(85, 741); // selectItem
        op[737] = getOpcodeRep((char)0, Character.MAX_VALUE, 738);
        {int[] a = {739,740}; op[738] = getOpcodeCat(a);}
        op[739] = getOpcodeRnm(329, 2322); // COMMA
        op[740] = getOpcodeRnm(85, 741); // selectItem
        {int[] a = {742,743,744}; op[741] = getOpcodeAlt(a);}
        op[742] = getOpcodeRnm(333, 2333); // STAR
        op[743] = getOpcodeRnm(86, 766); // allOperationsInSchema
        {int[] a = {745,749}; op[744] = getOpcodeCat(a);}
        op[745] = getOpcodeRep((char)0, (char)1, 746);
        {int[] a = {747,748}; op[746] = getOpcodeCat(a);}
        op[747] = getOpcodeRnm(201, 1664); // qualifiedEntityTypeName
        {char[] a = {47}; op[748] = getOpcodeTls(a);}
        {int[] a = {750,764,765}; op[749] = getOpcodeAlt(a);}
        {int[] a = {751,761}; op[750] = getOpcodeCat(a);}
        op[751] = getOpcodeRep((char)0, Character.MAX_VALUE, 752);
        {int[] a = {753,756,757}; op[752] = getOpcodeCat(a);}
        {int[] a = {754,755}; op[753] = getOpcodeAlt(a);}
        op[754] = getOpcodeRnm(223, 1748); // complexProperty
        op[755] = getOpcodeRnm(224, 1749); // complexColProperty
        {char[] a = {47}; op[756] = getOpcodeTls(a);}
        op[757] = getOpcodeRep((char)0, (char)1, 758);
        {int[] a = {759,760}; op[758] = getOpcodeCat(a);}
        op[759] = getOpcodeRnm(202, 1668); // qualifiedComplexTypeName
        {char[] a = {47}; op[760] = getOpcodeTls(a);}
        {int[] a = {762,763}; op[761] = getOpcodeAlt(a);}
        op[762] = getOpcodeRnm(218, 1736); // property
        op[763] = getOpcodeRnm(226, 1751); // navigationProperty
        op[764] = getOpcodeRnm(87, 770); // qualifiedActionName
        op[765] = getOpcodeRnm(88, 779); // qualifiedFunctionName
        {int[] a = {767,768,769}; op[766] = getOpcodeCat(a);}
        op[767] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[768] = getOpcodeTls(a);}
        op[769] = getOpcodeRnm(333, 2333); // STAR
        {int[] a = {771,772,773,774}; op[770] = getOpcodeCat(a);}
        op[771] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[772] = getOpcodeTls(a);}
        op[773] = getOpcodeRnm(230, 1757); // action
        op[774] = getOpcodeRep((char)0, (char)1, 775);
        {int[] a = {776,777,778}; op[775] = getOpcodeCat(a);}
        op[776] = getOpcodeRnm(335, 2339); // OPEN
        op[777] = getOpcodeRnm(89, 788); // parameterNamesAndTypes
        op[778] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {780,781,782,783}; op[779] = getOpcodeCat(a);}
        op[780] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[781] = getOpcodeTls(a);}
        op[782] = getOpcodeRnm(232, 1759); // function
        op[783] = getOpcodeRep((char)0, (char)1, 784);
        {int[] a = {785,786,787}; op[784] = getOpcodeCat(a);}
        op[785] = getOpcodeRnm(335, 2339); // OPEN
        op[786] = getOpcodeRnm(89, 788); // parameterNamesAndTypes
        op[787] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {789,790}; op[788] = getOpcodeCat(a);}
        op[789] = getOpcodeRnm(90, 794); // parameterNameAndType
        op[790] = getOpcodeRep((char)0, Character.MAX_VALUE, 791);
        {int[] a = {792,793}; op[791] = getOpcodeCat(a);}
        op[792] = getOpcodeRnm(329, 2322); // COMMA
        op[793] = getOpcodeRnm(90, 794); // parameterNameAndType
        {int[] a = {795,796,797}; op[794] = getOpcodeCat(a);}
        op[795] = getOpcodeRnm(35, 291); // parameterName
        {char[] a = {58}; op[796] = getOpcodeTls(a);}
        op[797] = getOpcodeRnm(200, 1650); // qualifiedTypeName
        {int[] a = {799,800,801}; op[798] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,116,111,107,101,110}; op[799] = getOpcodeTbs(a);}
        op[800] = getOpcodeRnm(330, 2325); // EQ
        op[801] = getOpcodeRep((char)1, Character.MAX_VALUE, 802);
        op[802] = getOpcodeRnm(355, 2566); // qchar-no-AMP
        {int[] a = {804,805,806}; op[803] = getOpcodeCat(a);}
        op[804] = getOpcodeRnm(36, 292); // parameterAlias
        op[805] = getOpcodeRnm(330, 2325); // EQ
        op[806] = getOpcodeRnm(94, 811); // parameterValue
        {int[] a = {808,809,810}; op[807] = getOpcodeCat(a);}
        op[808] = getOpcodeRnm(35, 291); // parameterName
        op[809] = getOpcodeRnm(330, 2325); // EQ
        op[810] = getOpcodeRnm(94, 811); // parameterValue
        {int[] a = {812,813,814,815,816,817}; op[811] = getOpcodeAlt(a);}
        op[812] = getOpcodeRnm(175, 1473); // complexInUri
        op[813] = getOpcodeRnm(174, 1463); // complexColInUri
        op[814] = getOpcodeRnm(95, 818); // entityReference
        op[815] = getOpcodeRnm(182, 1534); // entityRefColInUri
        op[816] = getOpcodeRnm(245, 1778); // primitiveLiteral
        op[817] = getOpcodeRnm(177, 1503); // primitiveColInUri
        {int[] a = {819,820,821,825,826,827,831}; op[818] = getOpcodeCat(a);}
        {char[] a = {75,69,89}; op[819] = getOpcodeTbs(a);}
        op[820] = getOpcodeRnm(335, 2339); // OPEN
        op[821] = getOpcodeRep((char)0, (char)1, 822);
        {int[] a = {823,824}; op[822] = getOpcodeCat(a);}
        op[823] = getOpcodeRnm(229, 1756); // entityContainer
        {char[] a = {46}; op[824] = getOpcodeTls(a);}
        op[825] = getOpcodeRnm(206, 1683); // entitySetName
        op[826] = getOpcodeRnm(5, 91); // keyPredicate
        op[827] = getOpcodeRep((char)0, (char)1, 828);
        {int[] a = {829,830}; op[828] = getOpcodeCat(a);}
        {char[] a = {47}; op[829] = getOpcodeTls(a);}
        op[830] = getOpcodeRnm(201, 1664); // qualifiedEntityTypeName
        op[831] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {833,834}; op[832] = getOpcodeCat(a);}
        op[833] = getOpcodeRnm(97, 838); // customName
        op[834] = getOpcodeRep((char)0, (char)1, 835);
        {int[] a = {836,837}; op[835] = getOpcodeCat(a);}
        op[836] = getOpcodeRnm(330, 2325); // EQ
        op[837] = getOpcodeRnm(98, 842); // customValue
        {int[] a = {839,840}; op[838] = getOpcodeCat(a);}
        op[839] = getOpcodeRnm(357, 2587); // qchar-no-AMP-EQ-AT-DOLLAR
        op[840] = getOpcodeRep((char)0, Character.MAX_VALUE, 841);
        op[841] = getOpcodeRnm(356, 2577); // qchar-no-AMP-EQ
        op[842] = getOpcodeRep((char)0, Character.MAX_VALUE, 843);
        op[843] = getOpcodeRnm(355, 2566); // qchar-no-AMP
        {int[] a = {845,846}; op[844] = getOpcodeCat(a);}
        {char[] a = {35}; op[845] = getOpcodeTls(a);}
        {int[] a = {847,848,849}; op[846] = getOpcodeAlt(a);}
        {char[] a = {69,100,109,46,78,117,108,108}; op[847] = getOpcodeTbs(a);}
        op[848] = getOpcodeRnm(200, 1650); // qualifiedTypeName
        {int[] a = {850,851,855}; op[849] = getOpcodeCat(a);}
        op[850] = getOpcodeRnm(206, 1683); // entitySetName
        op[851] = getOpcodeRep((char)0, (char)1, 852);
        {int[] a = {853,854}; op[852] = getOpcodeCat(a);}
        {char[] a = {47}; op[853] = getOpcodeTls(a);}
        op[854] = getOpcodeRnm(201, 1664); // qualifiedEntityTypeName
        op[855] = getOpcodeRep((char)0, (char)1, 856);
        {int[] a = {857,858}; op[856] = getOpcodeAlt(a);}
        {char[] a = {47,64,68,101,108,116,97}; op[857] = getOpcodeTbs(a);}
        {int[] a = {859,861}; op[858] = getOpcodeCat(a);}
        op[859] = getOpcodeRep((char)0, (char)1, 860);
        {char[] a = {47,64,69,108,101,109,101,110,116}; op[860] = getOpcodeTbs(a);}
        op[861] = getOpcodeRep((char)0, (char)1, 862);
        {int[] a = {863,864}; op[862] = getOpcodeCat(a);}
        {char[] a = {38}; op[863] = getOpcodeTls(a);}
        op[864] = getOpcodeRnm(84, 733); // select
        {int[] a = {866,875}; op[865] = getOpcodeCat(a);}
        {int[] a = {867,868,869,870,871,872,873,874}; op[866] = getOpcodeAlt(a);}
        op[867] = getOpcodeRnm(245, 1778); // primitiveLiteral
        op[868] = getOpcodeRnm(36, 292); // parameterAlias
        op[869] = getOpcodeRnm(102, 903); // firstMemberExpr
        op[870] = getOpcodeRnm(115, 988); // functionExpr
        op[871] = getOpcodeRnm(170, 1429); // negateExpr
        op[872] = getOpcodeRnm(121, 1064); // methodCallExpr
        op[873] = getOpcodeRnm(155, 1353); // parenExpr
        op[874] = getOpcodeRnm(173, 1450); // castExpr
        op[875] = getOpcodeRep((char)0, (char)1, 876);
        {int[] a = {877,878,879,880,881}; op[876] = getOpcodeAlt(a);}
        op[877] = getOpcodeRnm(165, 1404); // addExpr
        op[878] = getOpcodeRnm(166, 1409); // subExpr
        op[879] = getOpcodeRnm(167, 1414); // mulExpr
        op[880] = getOpcodeRnm(168, 1419); // divExpr
        op[881] = getOpcodeRnm(169, 1424); // modExpr
        {int[] a = {883,899}; op[882] = getOpcodeCat(a);}
        {int[] a = {884,885,886,887,898}; op[883] = getOpcodeAlt(a);}
        op[884] = getOpcodeRnm(172, 1437); // isofExpr
        op[885] = getOpcodeRnm(122, 1092); // boolMethodCallExpr
        op[886] = getOpcodeRnm(171, 1433); // notExpr
        {int[] a = {888,889}; op[887] = getOpcodeCat(a);}
        op[888] = getOpcodeRnm(100, 865); // commonExpr
        op[889] = getOpcodeRep((char)0, (char)1, 890);
        {int[] a = {891,892,893,894,895,896,897}; op[890] = getOpcodeAlt(a);}
        op[891] = getOpcodeRnm(158, 1369); // eqExpr
        op[892] = getOpcodeRnm(159, 1374); // neExpr
        op[893] = getOpcodeRnm(160, 1379); // ltExpr
        op[894] = getOpcodeRnm(161, 1384); // leExpr
        op[895] = getOpcodeRnm(162, 1389); // gtExpr
        op[896] = getOpcodeRnm(163, 1394); // geExpr
        op[897] = getOpcodeRnm(164, 1399); // hasExpr
        op[898] = getOpcodeRnm(154, 1347); // boolParenExpr
        op[899] = getOpcodeRep((char)0, (char)1, 900);
        {int[] a = {901,902}; op[900] = getOpcodeAlt(a);}
        op[901] = getOpcodeRnm(156, 1359); // andExpr
        op[902] = getOpcodeRnm(157, 1364); // orExpr
        {int[] a = {904,906}; op[903] = getOpcodeCat(a);}
        op[904] = getOpcodeRep((char)0, (char)1, 905);
        op[905] = getOpcodeRnm(105, 941); // lambdaPredicatePrefixExpr
        op[906] = getOpcodeRnm(103, 907); // memberExpr
        {int[] a = {908,912}; op[907] = getOpcodeCat(a);}
        op[908] = getOpcodeRep((char)0, (char)1, 909);
        {int[] a = {910,911}; op[909] = getOpcodeCat(a);}
        op[910] = getOpcodeRnm(201, 1664); // qualifiedEntityTypeName
        {char[] a = {47}; op[911] = getOpcodeTls(a);}
        {int[] a = {913,914}; op[912] = getOpcodeAlt(a);}
        op[913] = getOpcodeRnm(104, 915); // propertyPathExpr
        op[914] = getOpcodeRnm(114, 987); // boundFunctionExpr
        {int[] a = {916,920,924,928,932,936,940}; op[915] = getOpcodeAlt(a);}
        {int[] a = {917,918}; op[916] = getOpcodeCat(a);}
        op[917] = getOpcodeRnm(228, 1755); // entityColNavigationProperty
        op[918] = getOpcodeRep((char)0, (char)1, 919);
        op[919] = getOpcodeRnm(109, 949); // collectionNavigationExpr
        {int[] a = {921,922}; op[920] = getOpcodeCat(a);}
        op[921] = getOpcodeRnm(227, 1754); // entityNavigationProperty
        op[922] = getOpcodeRep((char)0, (char)1, 923);
        op[923] = getOpcodeRnm(110, 961); // singleNavigationExpr
        {int[] a = {925,926}; op[924] = getOpcodeCat(a);}
        op[925] = getOpcodeRnm(224, 1749); // complexColProperty
        op[926] = getOpcodeRep((char)0, (char)1, 927);
        op[927] = getOpcodeRnm(111, 964); // collectionPathExpr
        {int[] a = {929,930}; op[928] = getOpcodeCat(a);}
        op[929] = getOpcodeRnm(223, 1748); // complexProperty
        op[930] = getOpcodeRep((char)0, (char)1, 931);
        op[931] = getOpcodeRnm(112, 975); // complexPathExpr
        {int[] a = {933,934}; op[932] = getOpcodeCat(a);}
        op[933] = getOpcodeRnm(222, 1747); // primitiveColProperty
        op[934] = getOpcodeRep((char)0, (char)1, 935);
        op[935] = getOpcodeRnm(111, 964); // collectionPathExpr
        {int[] a = {937,938}; op[936] = getOpcodeCat(a);}
        op[937] = getOpcodeRnm(219, 1742); // primitiveProperty
        op[938] = getOpcodeRep((char)0, (char)1, 939);
        op[939] = getOpcodeRnm(113, 984); // singlePathExpr
        op[940] = getOpcodeRnm(225, 1750); // streamProperty
        {int[] a = {942,943}; op[941] = getOpcodeCat(a);}
        op[942] = getOpcodeRnm(106, 944); // inscopeVariableExpr
        {char[] a = {47}; op[943] = getOpcodeTls(a);}
        {int[] a = {945,946}; op[944] = getOpcodeAlt(a);}
        op[945] = getOpcodeRnm(107, 947); // implicitVariableExpr
        op[946] = getOpcodeRnm(108, 948); // lambdaVariableExpr
        {char[] a = {36,105,116}; op[947] = getOpcodeTls(a);}
        op[948] = getOpcodeRnm(212, 1689); // odataIdentifier
        {int[] a = {950,951}; op[949] = getOpcodeAlt(a);}
        op[950] = getOpcodeRnm(15, 166); // count
        {int[] a = {952,953,957}; op[951] = getOpcodeCat(a);}
        {char[] a = {47}; op[952] = getOpcodeTls(a);}
        op[953] = getOpcodeRep((char)0, (char)1, 954);
        {int[] a = {955,956}; op[954] = getOpcodeCat(a);}
        op[955] = getOpcodeRnm(201, 1664); // qualifiedEntityTypeName
        {char[] a = {47}; op[956] = getOpcodeTls(a);}
        {int[] a = {958,959,960}; op[957] = getOpcodeAlt(a);}
        op[958] = getOpcodeRnm(114, 987); // boundFunctionExpr
        op[959] = getOpcodeRnm(118, 1039); // anyExpr
        op[960] = getOpcodeRnm(119, 1052); // allExpr
        {int[] a = {962,963}; op[961] = getOpcodeCat(a);}
        {char[] a = {47}; op[962] = getOpcodeTls(a);}
        op[963] = getOpcodeRnm(103, 907); // memberExpr
        {int[] a = {965,966,969,972}; op[964] = getOpcodeAlt(a);}
        op[965] = getOpcodeRnm(15, 166); // count
        {int[] a = {967,968}; op[966] = getOpcodeCat(a);}
        {char[] a = {47}; op[967] = getOpcodeTls(a);}
        op[968] = getOpcodeRnm(114, 987); // boundFunctionExpr
        {int[] a = {970,971}; op[969] = getOpcodeCat(a);}
        {char[] a = {47}; op[970] = getOpcodeTls(a);}
        op[971] = getOpcodeRnm(118, 1039); // anyExpr
        {int[] a = {973,974}; op[972] = getOpcodeCat(a);}
        {char[] a = {47}; op[973] = getOpcodeTls(a);}
        op[974] = getOpcodeRnm(119, 1052); // allExpr
        {int[] a = {976,977,981}; op[975] = getOpcodeCat(a);}
        {char[] a = {47}; op[976] = getOpcodeTls(a);}
        op[977] = getOpcodeRep((char)0, (char)1, 978);
        {int[] a = {979,980}; op[978] = getOpcodeCat(a);}
        op[979] = getOpcodeRnm(202, 1668); // qualifiedComplexTypeName
        {char[] a = {47}; op[980] = getOpcodeTls(a);}
        {int[] a = {982,983}; op[981] = getOpcodeAlt(a);}
        op[982] = getOpcodeRnm(104, 915); // propertyPathExpr
        op[983] = getOpcodeRnm(114, 987); // boundFunctionExpr
        {int[] a = {985,986}; op[984] = getOpcodeCat(a);}
        {char[] a = {47}; op[985] = getOpcodeTls(a);}
        op[986] = getOpcodeRnm(114, 987); // boundFunctionExpr
        op[987] = getOpcodeRnm(115, 988); // functionExpr
        {int[] a = {989,990,991}; op[988] = getOpcodeCat(a);}
        op[989] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[990] = getOpcodeTls(a);}
        {int[] a = {992,997,1002,1007,1012,1017}; op[991] = getOpcodeAlt(a);}
        {int[] a = {993,994,995}; op[992] = getOpcodeCat(a);}
        op[993] = getOpcodeRnm(234, 1767); // entityColFunction
        op[994] = getOpcodeRnm(116, 1022); // functionExprParameters
        op[995] = getOpcodeRep((char)0, (char)1, 996);
        op[996] = getOpcodeRnm(109, 949); // collectionNavigationExpr
        {int[] a = {998,999,1000}; op[997] = getOpcodeCat(a);}
        op[998] = getOpcodeRnm(233, 1766); // entityFunction
        op[999] = getOpcodeRnm(116, 1022); // functionExprParameters
        op[1000] = getOpcodeRep((char)0, (char)1, 1001);
        op[1001] = getOpcodeRnm(110, 961); // singleNavigationExpr
        {int[] a = {1003,1004,1005}; op[1002] = getOpcodeCat(a);}
        op[1003] = getOpcodeRnm(236, 1769); // complexColFunction
        op[1004] = getOpcodeRnm(116, 1022); // functionExprParameters
        op[1005] = getOpcodeRep((char)0, (char)1, 1006);
        op[1006] = getOpcodeRnm(111, 964); // collectionPathExpr
        {int[] a = {1008,1009,1010}; op[1007] = getOpcodeCat(a);}
        op[1008] = getOpcodeRnm(235, 1768); // complexFunction
        op[1009] = getOpcodeRnm(116, 1022); // functionExprParameters
        op[1010] = getOpcodeRep((char)0, (char)1, 1011);
        op[1011] = getOpcodeRnm(112, 975); // complexPathExpr
        {int[] a = {1013,1014,1015}; op[1012] = getOpcodeCat(a);}
        op[1013] = getOpcodeRnm(238, 1771); // primitiveColFunction
        op[1014] = getOpcodeRnm(116, 1022); // functionExprParameters
        op[1015] = getOpcodeRep((char)0, (char)1, 1016);
        op[1016] = getOpcodeRnm(111, 964); // collectionPathExpr
        {int[] a = {1018,1019,1020}; op[1017] = getOpcodeCat(a);}
        op[1018] = getOpcodeRnm(237, 1770); // primitiveFunction
        op[1019] = getOpcodeRnm(116, 1022); // functionExprParameters
        op[1020] = getOpcodeRep((char)0, (char)1, 1021);
        op[1021] = getOpcodeRnm(113, 984); // singlePathExpr
        {int[] a = {1023,1024,1031}; op[1022] = getOpcodeCat(a);}
        op[1023] = getOpcodeRnm(335, 2339); // OPEN
        op[1024] = getOpcodeRep((char)0, (char)1, 1025);
        {int[] a = {1026,1027}; op[1025] = getOpcodeCat(a);}
        op[1026] = getOpcodeRnm(117, 1032); // functionExprParameter
        op[1027] = getOpcodeRep((char)0, Character.MAX_VALUE, 1028);
        {int[] a = {1029,1030}; op[1028] = getOpcodeCat(a);}
        op[1029] = getOpcodeRnm(329, 2322); // COMMA
        op[1030] = getOpcodeRnm(117, 1032); // functionExprParameter
        op[1031] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1033,1034,1035}; op[1032] = getOpcodeCat(a);}
        op[1033] = getOpcodeRnm(35, 291); // parameterName
        op[1034] = getOpcodeRnm(330, 2325); // EQ
        {int[] a = {1036,1037,1038}; op[1035] = getOpcodeAlt(a);}
        op[1036] = getOpcodeRnm(94, 811); // parameterValue
        op[1037] = getOpcodeRnm(36, 292); // parameterAlias
        op[1038] = getOpcodeRnm(102, 903); // firstMemberExpr
        {int[] a = {1040,1041,1042,1043,1050,1051}; op[1039] = getOpcodeCat(a);}
        {char[] a = {97,110,121}; op[1040] = getOpcodeTbs(a);}
        op[1041] = getOpcodeRnm(335, 2339); // OPEN
        op[1042] = getOpcodeRnm(326, 2315); // BWS
        op[1043] = getOpcodeRep((char)0, (char)1, 1044);
        {int[] a = {1045,1046,1047,1048,1049}; op[1044] = getOpcodeCat(a);}
        op[1045] = getOpcodeRnm(108, 948); // lambdaVariableExpr
        op[1046] = getOpcodeRnm(326, 2315); // BWS
        op[1047] = getOpcodeRnm(328, 2319); // COLON
        op[1048] = getOpcodeRnm(326, 2315); // BWS
        op[1049] = getOpcodeRnm(120, 1063); // lambdaPredicateExpr
        op[1050] = getOpcodeRnm(326, 2315); // BWS
        op[1051] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1053,1054,1055,1056,1057,1058,1059,1060,1061,1062}; op[1052] = getOpcodeCat(a);}
        {char[] a = {97,108,108}; op[1053] = getOpcodeTbs(a);}
        op[1054] = getOpcodeRnm(335, 2339); // OPEN
        op[1055] = getOpcodeRnm(326, 2315); // BWS
        op[1056] = getOpcodeRnm(108, 948); // lambdaVariableExpr
        op[1057] = getOpcodeRnm(326, 2315); // BWS
        op[1058] = getOpcodeRnm(328, 2319); // COLON
        op[1059] = getOpcodeRnm(326, 2315); // BWS
        op[1060] = getOpcodeRnm(120, 1063); // lambdaPredicateExpr
        op[1061] = getOpcodeRnm(326, 2315); // BWS
        op[1062] = getOpcodeRnm(336, 2342); // CLOSE
        op[1063] = getOpcodeRnm(101, 882); // boolCommonExpr
        {int[] a = {1065,1066,1067,1068,1069,1070,1071,1072,1073,1074,1075,1076,1077,1078,1079,1080,1081,1082,1083,1084,1085,1086,1087,1088,1089,1090,1091}; op[1064] = getOpcodeAlt(a);}
        op[1065] = getOpcodeRnm(127, 1137); // indexOfMethodCallExpr
        op[1066] = getOpcodeRnm(129, 1165); // toLowerMethodCallExpr
        op[1067] = getOpcodeRnm(130, 1172); // toUpperMethodCallExpr
        op[1068] = getOpcodeRnm(131, 1179); // trimMethodCallExpr
        op[1069] = getOpcodeRnm(128, 1148); // substringMethodCallExpr
        op[1070] = getOpcodeRnm(132, 1186); // concatMethodCallExpr
        op[1071] = getOpcodeRnm(126, 1130); // lengthMethodCallExpr
        op[1072] = getOpcodeRnm(133, 1197); // yearMethodCallExpr
        op[1073] = getOpcodeRnm(134, 1204); // monthMethodCallExpr
        op[1074] = getOpcodeRnm(135, 1211); // dayMethodCallExpr
        op[1075] = getOpcodeRnm(136, 1218); // hourMethodCallExpr
        op[1076] = getOpcodeRnm(137, 1225); // minuteMethodCallExpr
        op[1077] = getOpcodeRnm(138, 1232); // secondMethodCallExpr
        op[1078] = getOpcodeRnm(139, 1239); // fractionalsecondsMethodCallExpr
        op[1079] = getOpcodeRnm(140, 1246); // totalsecondsMethodCallExpr
        op[1080] = getOpcodeRnm(141, 1253); // dateMethodCallExpr
        op[1081] = getOpcodeRnm(142, 1260); // timeMethodCallExpr
        op[1082] = getOpcodeRnm(148, 1297); // roundMethodCallExpr
        op[1083] = getOpcodeRnm(149, 1304); // floorMethodCallExpr
        op[1084] = getOpcodeRnm(150, 1311); // ceilingMethodCallExpr
        op[1085] = getOpcodeRnm(151, 1318); // distanceMethodCallExpr
        op[1086] = getOpcodeRnm(152, 1329); // geoLengthMethodCallExpr
        op[1087] = getOpcodeRnm(143, 1267); // totalOffsetMinutesMethodCallExpr
        op[1088] = getOpcodeRnm(144, 1274); // minDateTimeMethodCallExpr
        op[1089] = getOpcodeRnm(145, 1278); // maxDateTimeMethodCallExpr
        op[1090] = getOpcodeRnm(146, 1282); // nowMethodCallExpr
        op[1091] = getOpcodeRnm(147, 1286); // searchMethodCallExpr
        {int[] a = {1093,1094,1095,1096}; op[1092] = getOpcodeAlt(a);}
        op[1093] = getOpcodeRnm(125, 1119); // endsWithMethodCallExpr
        op[1094] = getOpcodeRnm(124, 1108); // startsWithMethodCallExpr
        op[1095] = getOpcodeRnm(123, 1097); // substringOfMethodCallExpr
        op[1096] = getOpcodeRnm(153, 1336); // intersectsMethodCallExpr
        {int[] a = {1098,1099,1100,1101,1102,1103,1104,1105,1106,1107}; op[1097] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103,111,102}; op[1098] = getOpcodeTbs(a);}
        op[1099] = getOpcodeRnm(335, 2339); // OPEN
        op[1100] = getOpcodeRnm(326, 2315); // BWS
        op[1101] = getOpcodeRnm(100, 865); // commonExpr
        op[1102] = getOpcodeRnm(326, 2315); // BWS
        op[1103] = getOpcodeRnm(329, 2322); // COMMA
        op[1104] = getOpcodeRnm(326, 2315); // BWS
        op[1105] = getOpcodeRnm(100, 865); // commonExpr
        op[1106] = getOpcodeRnm(326, 2315); // BWS
        op[1107] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1109,1110,1111,1112,1113,1114,1115,1116,1117,1118}; op[1108] = getOpcodeCat(a);}
        {char[] a = {115,116,97,114,116,115,119,105,116,104}; op[1109] = getOpcodeTbs(a);}
        op[1110] = getOpcodeRnm(335, 2339); // OPEN
        op[1111] = getOpcodeRnm(326, 2315); // BWS
        op[1112] = getOpcodeRnm(100, 865); // commonExpr
        op[1113] = getOpcodeRnm(326, 2315); // BWS
        op[1114] = getOpcodeRnm(329, 2322); // COMMA
        op[1115] = getOpcodeRnm(326, 2315); // BWS
        op[1116] = getOpcodeRnm(100, 865); // commonExpr
        op[1117] = getOpcodeRnm(326, 2315); // BWS
        op[1118] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1120,1121,1122,1123,1124,1125,1126,1127,1128,1129}; op[1119] = getOpcodeCat(a);}
        {char[] a = {101,110,100,115,119,105,116,104}; op[1120] = getOpcodeTbs(a);}
        op[1121] = getOpcodeRnm(335, 2339); // OPEN
        op[1122] = getOpcodeRnm(326, 2315); // BWS
        op[1123] = getOpcodeRnm(100, 865); // commonExpr
        op[1124] = getOpcodeRnm(326, 2315); // BWS
        op[1125] = getOpcodeRnm(329, 2322); // COMMA
        op[1126] = getOpcodeRnm(326, 2315); // BWS
        op[1127] = getOpcodeRnm(100, 865); // commonExpr
        op[1128] = getOpcodeRnm(326, 2315); // BWS
        op[1129] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1131,1132,1133,1134,1135,1136}; op[1130] = getOpcodeCat(a);}
        {char[] a = {108,101,110,103,116,104}; op[1131] = getOpcodeTbs(a);}
        op[1132] = getOpcodeRnm(335, 2339); // OPEN
        op[1133] = getOpcodeRnm(326, 2315); // BWS
        op[1134] = getOpcodeRnm(100, 865); // commonExpr
        op[1135] = getOpcodeRnm(326, 2315); // BWS
        op[1136] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1138,1139,1140,1141,1142,1143,1144,1145,1146,1147}; op[1137] = getOpcodeCat(a);}
        {char[] a = {105,110,100,101,120,111,102}; op[1138] = getOpcodeTbs(a);}
        op[1139] = getOpcodeRnm(335, 2339); // OPEN
        op[1140] = getOpcodeRnm(326, 2315); // BWS
        op[1141] = getOpcodeRnm(100, 865); // commonExpr
        op[1142] = getOpcodeRnm(326, 2315); // BWS
        op[1143] = getOpcodeRnm(329, 2322); // COMMA
        op[1144] = getOpcodeRnm(326, 2315); // BWS
        op[1145] = getOpcodeRnm(100, 865); // commonExpr
        op[1146] = getOpcodeRnm(326, 2315); // BWS
        op[1147] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1149,1150,1151,1152,1153,1154,1155,1156,1157,1164}; op[1148] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103}; op[1149] = getOpcodeTbs(a);}
        op[1150] = getOpcodeRnm(335, 2339); // OPEN
        op[1151] = getOpcodeRnm(326, 2315); // BWS
        op[1152] = getOpcodeRnm(100, 865); // commonExpr
        op[1153] = getOpcodeRnm(326, 2315); // BWS
        op[1154] = getOpcodeRnm(329, 2322); // COMMA
        op[1155] = getOpcodeRnm(326, 2315); // BWS
        op[1156] = getOpcodeRnm(100, 865); // commonExpr
        op[1157] = getOpcodeRep((char)0, (char)1, 1158);
        {int[] a = {1159,1160,1161,1162,1163}; op[1158] = getOpcodeCat(a);}
        op[1159] = getOpcodeRnm(326, 2315); // BWS
        op[1160] = getOpcodeRnm(329, 2322); // COMMA
        op[1161] = getOpcodeRnm(326, 2315); // BWS
        op[1162] = getOpcodeRnm(100, 865); // commonExpr
        op[1163] = getOpcodeRnm(326, 2315); // BWS
        op[1164] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1166,1167,1168,1169,1170,1171}; op[1165] = getOpcodeCat(a);}
        {char[] a = {116,111,108,111,119,101,114}; op[1166] = getOpcodeTbs(a);}
        op[1167] = getOpcodeRnm(335, 2339); // OPEN
        op[1168] = getOpcodeRnm(326, 2315); // BWS
        op[1169] = getOpcodeRnm(100, 865); // commonExpr
        op[1170] = getOpcodeRnm(326, 2315); // BWS
        op[1171] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1173,1174,1175,1176,1177,1178}; op[1172] = getOpcodeCat(a);}
        {char[] a = {116,111,117,112,112,101,114}; op[1173] = getOpcodeTbs(a);}
        op[1174] = getOpcodeRnm(335, 2339); // OPEN
        op[1175] = getOpcodeRnm(326, 2315); // BWS
        op[1176] = getOpcodeRnm(100, 865); // commonExpr
        op[1177] = getOpcodeRnm(326, 2315); // BWS
        op[1178] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1180,1181,1182,1183,1184,1185}; op[1179] = getOpcodeCat(a);}
        {char[] a = {116,114,105,109}; op[1180] = getOpcodeTbs(a);}
        op[1181] = getOpcodeRnm(335, 2339); // OPEN
        op[1182] = getOpcodeRnm(326, 2315); // BWS
        op[1183] = getOpcodeRnm(100, 865); // commonExpr
        op[1184] = getOpcodeRnm(326, 2315); // BWS
        op[1185] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1187,1188,1189,1190,1191,1192,1193,1194,1195,1196}; op[1186] = getOpcodeCat(a);}
        {char[] a = {99,111,110,99,97,116}; op[1187] = getOpcodeTbs(a);}
        op[1188] = getOpcodeRnm(335, 2339); // OPEN
        op[1189] = getOpcodeRnm(326, 2315); // BWS
        op[1190] = getOpcodeRnm(100, 865); // commonExpr
        op[1191] = getOpcodeRnm(326, 2315); // BWS
        op[1192] = getOpcodeRnm(329, 2322); // COMMA
        op[1193] = getOpcodeRnm(326, 2315); // BWS
        op[1194] = getOpcodeRnm(100, 865); // commonExpr
        op[1195] = getOpcodeRnm(326, 2315); // BWS
        op[1196] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1198,1199,1200,1201,1202,1203}; op[1197] = getOpcodeCat(a);}
        {char[] a = {121,101,97,114}; op[1198] = getOpcodeTbs(a);}
        op[1199] = getOpcodeRnm(335, 2339); // OPEN
        op[1200] = getOpcodeRnm(326, 2315); // BWS
        op[1201] = getOpcodeRnm(100, 865); // commonExpr
        op[1202] = getOpcodeRnm(326, 2315); // BWS
        op[1203] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1205,1206,1207,1208,1209,1210}; op[1204] = getOpcodeCat(a);}
        {char[] a = {109,111,110,116,104}; op[1205] = getOpcodeTbs(a);}
        op[1206] = getOpcodeRnm(335, 2339); // OPEN
        op[1207] = getOpcodeRnm(326, 2315); // BWS
        op[1208] = getOpcodeRnm(100, 865); // commonExpr
        op[1209] = getOpcodeRnm(326, 2315); // BWS
        op[1210] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1212,1213,1214,1215,1216,1217}; op[1211] = getOpcodeCat(a);}
        {char[] a = {100,97,121}; op[1212] = getOpcodeTbs(a);}
        op[1213] = getOpcodeRnm(335, 2339); // OPEN
        op[1214] = getOpcodeRnm(326, 2315); // BWS
        op[1215] = getOpcodeRnm(100, 865); // commonExpr
        op[1216] = getOpcodeRnm(326, 2315); // BWS
        op[1217] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1219,1220,1221,1222,1223,1224}; op[1218] = getOpcodeCat(a);}
        {char[] a = {104,111,117,114}; op[1219] = getOpcodeTbs(a);}
        op[1220] = getOpcodeRnm(335, 2339); // OPEN
        op[1221] = getOpcodeRnm(326, 2315); // BWS
        op[1222] = getOpcodeRnm(100, 865); // commonExpr
        op[1223] = getOpcodeRnm(326, 2315); // BWS
        op[1224] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1226,1227,1228,1229,1230,1231}; op[1225] = getOpcodeCat(a);}
        {char[] a = {109,105,110,117,116,101}; op[1226] = getOpcodeTbs(a);}
        op[1227] = getOpcodeRnm(335, 2339); // OPEN
        op[1228] = getOpcodeRnm(326, 2315); // BWS
        op[1229] = getOpcodeRnm(100, 865); // commonExpr
        op[1230] = getOpcodeRnm(326, 2315); // BWS
        op[1231] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1233,1234,1235,1236,1237,1238}; op[1232] = getOpcodeCat(a);}
        {char[] a = {115,101,99,111,110,100}; op[1233] = getOpcodeTbs(a);}
        op[1234] = getOpcodeRnm(335, 2339); // OPEN
        op[1235] = getOpcodeRnm(326, 2315); // BWS
        op[1236] = getOpcodeRnm(100, 865); // commonExpr
        op[1237] = getOpcodeRnm(326, 2315); // BWS
        op[1238] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1240,1241,1242,1243,1244,1245}; op[1239] = getOpcodeCat(a);}
        {char[] a = {102,114,97,99,116,105,111,110,97,108,115,101,99,111,110,100,115}; op[1240] = getOpcodeTbs(a);}
        op[1241] = getOpcodeRnm(335, 2339); // OPEN
        op[1242] = getOpcodeRnm(326, 2315); // BWS
        op[1243] = getOpcodeRnm(100, 865); // commonExpr
        op[1244] = getOpcodeRnm(326, 2315); // BWS
        op[1245] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1247,1248,1249,1250,1251,1252}; op[1246] = getOpcodeCat(a);}
        {char[] a = {116,111,116,97,108,115,101,99,111,110,100,115}; op[1247] = getOpcodeTbs(a);}
        op[1248] = getOpcodeRnm(335, 2339); // OPEN
        op[1249] = getOpcodeRnm(326, 2315); // BWS
        op[1250] = getOpcodeRnm(100, 865); // commonExpr
        op[1251] = getOpcodeRnm(326, 2315); // BWS
        op[1252] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1254,1255,1256,1257,1258,1259}; op[1253] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101}; op[1254] = getOpcodeTbs(a);}
        op[1255] = getOpcodeRnm(335, 2339); // OPEN
        op[1256] = getOpcodeRnm(326, 2315); // BWS
        op[1257] = getOpcodeRnm(100, 865); // commonExpr
        op[1258] = getOpcodeRnm(326, 2315); // BWS
        op[1259] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1261,1262,1263,1264,1265,1266}; op[1260] = getOpcodeCat(a);}
        {char[] a = {116,105,109,101}; op[1261] = getOpcodeTbs(a);}
        op[1262] = getOpcodeRnm(335, 2339); // OPEN
        op[1263] = getOpcodeRnm(326, 2315); // BWS
        op[1264] = getOpcodeRnm(100, 865); // commonExpr
        op[1265] = getOpcodeRnm(326, 2315); // BWS
        op[1266] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1268,1269,1270,1271,1272,1273}; op[1267] = getOpcodeCat(a);}
        {char[] a = {116,111,116,97,108,111,102,102,115,101,116,109,105,110,117,116,101,115}; op[1268] = getOpcodeTbs(a);}
        op[1269] = getOpcodeRnm(335, 2339); // OPEN
        op[1270] = getOpcodeRnm(326, 2315); // BWS
        op[1271] = getOpcodeRnm(100, 865); // commonExpr
        op[1272] = getOpcodeRnm(326, 2315); // BWS
        op[1273] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1275,1276,1277}; op[1274] = getOpcodeCat(a);}
        {char[] a = {109,105,110,100,97,116,101,116,105,109,101,40}; op[1275] = getOpcodeTbs(a);}
        op[1276] = getOpcodeRnm(326, 2315); // BWS
        {char[] a = {41}; op[1277] = getOpcodeTbs(a);}
        {int[] a = {1279,1280,1281}; op[1278] = getOpcodeCat(a);}
        {char[] a = {109,97,120,100,97,116,101,116,105,109,101,40}; op[1279] = getOpcodeTbs(a);}
        op[1280] = getOpcodeRnm(326, 2315); // BWS
        {char[] a = {41}; op[1281] = getOpcodeTbs(a);}
        {int[] a = {1283,1284,1285}; op[1282] = getOpcodeCat(a);}
        {char[] a = {110,111,119,40}; op[1283] = getOpcodeTbs(a);}
        op[1284] = getOpcodeRnm(326, 2315); // BWS
        {char[] a = {41}; op[1285] = getOpcodeTbs(a);}
        {int[] a = {1287,1288,1289,1290,1291,1292,1293,1294,1295,1296}; op[1286] = getOpcodeCat(a);}
        {char[] a = {115,101,97,114,99,104}; op[1287] = getOpcodeTbs(a);}
        op[1288] = getOpcodeRnm(335, 2339); // OPEN
        op[1289] = getOpcodeRnm(326, 2315); // BWS
        op[1290] = getOpcodeRnm(100, 865); // commonExpr
        op[1291] = getOpcodeRnm(326, 2315); // BWS
        op[1292] = getOpcodeRnm(329, 2322); // COMMA
        op[1293] = getOpcodeRnm(326, 2315); // BWS
        op[1294] = getOpcodeRnm(100, 865); // commonExpr
        op[1295] = getOpcodeRnm(326, 2315); // BWS
        op[1296] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1298,1299,1300,1301,1302,1303}; op[1297] = getOpcodeCat(a);}
        {char[] a = {114,111,117,110,100}; op[1298] = getOpcodeTbs(a);}
        op[1299] = getOpcodeRnm(335, 2339); // OPEN
        op[1300] = getOpcodeRnm(326, 2315); // BWS
        op[1301] = getOpcodeRnm(100, 865); // commonExpr
        op[1302] = getOpcodeRnm(326, 2315); // BWS
        op[1303] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1305,1306,1307,1308,1309,1310}; op[1304] = getOpcodeCat(a);}
        {char[] a = {102,108,111,111,114}; op[1305] = getOpcodeTbs(a);}
        op[1306] = getOpcodeRnm(335, 2339); // OPEN
        op[1307] = getOpcodeRnm(326, 2315); // BWS
        op[1308] = getOpcodeRnm(100, 865); // commonExpr
        op[1309] = getOpcodeRnm(326, 2315); // BWS
        op[1310] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1312,1313,1314,1315,1316,1317}; op[1311] = getOpcodeCat(a);}
        {char[] a = {99,101,105,108,105,110,103}; op[1312] = getOpcodeTbs(a);}
        op[1313] = getOpcodeRnm(335, 2339); // OPEN
        op[1314] = getOpcodeRnm(326, 2315); // BWS
        op[1315] = getOpcodeRnm(100, 865); // commonExpr
        op[1316] = getOpcodeRnm(326, 2315); // BWS
        op[1317] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1319,1320,1321,1322,1323,1324,1325,1326,1327,1328}; op[1318] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,100,105,115,116,97,110,99,101}; op[1319] = getOpcodeTbs(a);}
        op[1320] = getOpcodeRnm(335, 2339); // OPEN
        op[1321] = getOpcodeRnm(326, 2315); // BWS
        op[1322] = getOpcodeRnm(100, 865); // commonExpr
        op[1323] = getOpcodeRnm(326, 2315); // BWS
        op[1324] = getOpcodeRnm(329, 2322); // COMMA
        op[1325] = getOpcodeRnm(326, 2315); // BWS
        op[1326] = getOpcodeRnm(100, 865); // commonExpr
        op[1327] = getOpcodeRnm(326, 2315); // BWS
        op[1328] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1330,1331,1332,1333,1334,1335}; op[1329] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,108,101,110,103,116,104}; op[1330] = getOpcodeTbs(a);}
        op[1331] = getOpcodeRnm(335, 2339); // OPEN
        op[1332] = getOpcodeRnm(326, 2315); // BWS
        op[1333] = getOpcodeRnm(100, 865); // commonExpr
        op[1334] = getOpcodeRnm(326, 2315); // BWS
        op[1335] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1337,1338,1339,1340,1341,1342,1343,1344,1345,1346}; op[1336] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,105,110,116,101,114,115,101,99,116,115}; op[1337] = getOpcodeTbs(a);}
        op[1338] = getOpcodeRnm(335, 2339); // OPEN
        op[1339] = getOpcodeRnm(326, 2315); // BWS
        op[1340] = getOpcodeRnm(100, 865); // commonExpr
        op[1341] = getOpcodeRnm(326, 2315); // BWS
        op[1342] = getOpcodeRnm(329, 2322); // COMMA
        op[1343] = getOpcodeRnm(326, 2315); // BWS
        op[1344] = getOpcodeRnm(100, 865); // commonExpr
        op[1345] = getOpcodeRnm(326, 2315); // BWS
        op[1346] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1348,1349,1350,1351,1352}; op[1347] = getOpcodeCat(a);}
        op[1348] = getOpcodeRnm(335, 2339); // OPEN
        op[1349] = getOpcodeRnm(326, 2315); // BWS
        op[1350] = getOpcodeRnm(101, 882); // boolCommonExpr
        op[1351] = getOpcodeRnm(326, 2315); // BWS
        op[1352] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1354,1355,1356,1357,1358}; op[1353] = getOpcodeCat(a);}
        op[1354] = getOpcodeRnm(335, 2339); // OPEN
        op[1355] = getOpcodeRnm(326, 2315); // BWS
        op[1356] = getOpcodeRnm(100, 865); // commonExpr
        op[1357] = getOpcodeRnm(326, 2315); // BWS
        op[1358] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1360,1361,1362,1363}; op[1359] = getOpcodeCat(a);}
        op[1360] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {97,110,100}; op[1361] = getOpcodeTbs(a);}
        op[1362] = getOpcodeRnm(325, 2309); // RWS
        op[1363] = getOpcodeRnm(101, 882); // boolCommonExpr
        {int[] a = {1365,1366,1367,1368}; op[1364] = getOpcodeCat(a);}
        op[1365] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {111,114}; op[1366] = getOpcodeTbs(a);}
        op[1367] = getOpcodeRnm(325, 2309); // RWS
        op[1368] = getOpcodeRnm(101, 882); // boolCommonExpr
        {int[] a = {1370,1371,1372,1373}; op[1369] = getOpcodeCat(a);}
        op[1370] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {101,113}; op[1371] = getOpcodeTbs(a);}
        op[1372] = getOpcodeRnm(325, 2309); // RWS
        op[1373] = getOpcodeRnm(100, 865); // commonExpr
        {int[] a = {1375,1376,1377,1378}; op[1374] = getOpcodeCat(a);}
        op[1375] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {110,101}; op[1376] = getOpcodeTbs(a);}
        op[1377] = getOpcodeRnm(325, 2309); // RWS
        op[1378] = getOpcodeRnm(100, 865); // commonExpr
        {int[] a = {1380,1381,1382,1383}; op[1379] = getOpcodeCat(a);}
        op[1380] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {108,116}; op[1381] = getOpcodeTbs(a);}
        op[1382] = getOpcodeRnm(325, 2309); // RWS
        op[1383] = getOpcodeRnm(100, 865); // commonExpr
        {int[] a = {1385,1386,1387,1388}; op[1384] = getOpcodeCat(a);}
        op[1385] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {108,101}; op[1386] = getOpcodeTbs(a);}
        op[1387] = getOpcodeRnm(325, 2309); // RWS
        op[1388] = getOpcodeRnm(100, 865); // commonExpr
        {int[] a = {1390,1391,1392,1393}; op[1389] = getOpcodeCat(a);}
        op[1390] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {103,116}; op[1391] = getOpcodeTbs(a);}
        op[1392] = getOpcodeRnm(325, 2309); // RWS
        op[1393] = getOpcodeRnm(100, 865); // commonExpr
        {int[] a = {1395,1396,1397,1398}; op[1394] = getOpcodeCat(a);}
        op[1395] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {103,101}; op[1396] = getOpcodeTbs(a);}
        op[1397] = getOpcodeRnm(325, 2309); // RWS
        op[1398] = getOpcodeRnm(100, 865); // commonExpr
        {int[] a = {1400,1401,1402,1403}; op[1399] = getOpcodeCat(a);}
        op[1400] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {104,97,115}; op[1401] = getOpcodeTbs(a);}
        op[1402] = getOpcodeRnm(325, 2309); // RWS
        op[1403] = getOpcodeRnm(100, 865); // commonExpr
        {int[] a = {1405,1406,1407,1408}; op[1404] = getOpcodeCat(a);}
        op[1405] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {97,100,100}; op[1406] = getOpcodeTbs(a);}
        op[1407] = getOpcodeRnm(325, 2309); // RWS
        op[1408] = getOpcodeRnm(100, 865); // commonExpr
        {int[] a = {1410,1411,1412,1413}; op[1409] = getOpcodeCat(a);}
        op[1410] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {115,117,98}; op[1411] = getOpcodeTbs(a);}
        op[1412] = getOpcodeRnm(325, 2309); // RWS
        op[1413] = getOpcodeRnm(100, 865); // commonExpr
        {int[] a = {1415,1416,1417,1418}; op[1414] = getOpcodeCat(a);}
        op[1415] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {109,117,108}; op[1416] = getOpcodeTbs(a);}
        op[1417] = getOpcodeRnm(325, 2309); // RWS
        op[1418] = getOpcodeRnm(100, 865); // commonExpr
        {int[] a = {1420,1421,1422,1423}; op[1419] = getOpcodeCat(a);}
        op[1420] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {100,105,118}; op[1421] = getOpcodeTbs(a);}
        op[1422] = getOpcodeRnm(325, 2309); // RWS
        op[1423] = getOpcodeRnm(100, 865); // commonExpr
        {int[] a = {1425,1426,1427,1428}; op[1424] = getOpcodeCat(a);}
        op[1425] = getOpcodeRnm(325, 2309); // RWS
        {char[] a = {109,111,100}; op[1426] = getOpcodeTbs(a);}
        op[1427] = getOpcodeRnm(325, 2309); // RWS
        op[1428] = getOpcodeRnm(100, 865); // commonExpr
        {int[] a = {1430,1431,1432}; op[1429] = getOpcodeCat(a);}
        {char[] a = {45}; op[1430] = getOpcodeTls(a);}
        op[1431] = getOpcodeRnm(326, 2315); // BWS
        op[1432] = getOpcodeRnm(100, 865); // commonExpr
        {int[] a = {1434,1435,1436}; op[1433] = getOpcodeCat(a);}
        {char[] a = {110,111,116}; op[1434] = getOpcodeTbs(a);}
        op[1435] = getOpcodeRnm(325, 2309); // RWS
        op[1436] = getOpcodeRnm(101, 882); // boolCommonExpr
        {int[] a = {1438,1439,1440,1441,1447,1448,1449}; op[1437] = getOpcodeCat(a);}
        {char[] a = {105,115,111,102}; op[1438] = getOpcodeTbs(a);}
        op[1439] = getOpcodeRnm(335, 2339); // OPEN
        op[1440] = getOpcodeRnm(326, 2315); // BWS
        op[1441] = getOpcodeRep((char)0, (char)1, 1442);
        {int[] a = {1443,1444,1445,1446}; op[1442] = getOpcodeCat(a);}
        op[1443] = getOpcodeRnm(100, 865); // commonExpr
        op[1444] = getOpcodeRnm(326, 2315); // BWS
        op[1445] = getOpcodeRnm(329, 2322); // COMMA
        op[1446] = getOpcodeRnm(326, 2315); // BWS
        op[1447] = getOpcodeRnm(200, 1650); // qualifiedTypeName
        op[1448] = getOpcodeRnm(326, 2315); // BWS
        op[1449] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1451,1452,1453,1454,1460,1461,1462}; op[1450] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[1451] = getOpcodeTbs(a);}
        op[1452] = getOpcodeRnm(335, 2339); // OPEN
        op[1453] = getOpcodeRnm(326, 2315); // BWS
        op[1454] = getOpcodeRep((char)0, (char)1, 1455);
        {int[] a = {1456,1457,1458,1459}; op[1455] = getOpcodeCat(a);}
        op[1456] = getOpcodeRnm(100, 865); // commonExpr
        op[1457] = getOpcodeRnm(326, 2315); // BWS
        op[1458] = getOpcodeRnm(329, 2322); // COMMA
        op[1459] = getOpcodeRnm(326, 2315); // BWS
        op[1460] = getOpcodeRnm(200, 1650); // qualifiedTypeName
        op[1461] = getOpcodeRnm(326, 2315); // BWS
        op[1462] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1464,1465,1472}; op[1463] = getOpcodeCat(a);}
        op[1464] = getOpcodeRnm(186, 1560); // begin-array
        op[1465] = getOpcodeRep((char)0, (char)1, 1466);
        {int[] a = {1467,1468}; op[1466] = getOpcodeCat(a);}
        op[1467] = getOpcodeRnm(175, 1473); // complexInUri
        op[1468] = getOpcodeRep((char)0, Character.MAX_VALUE, 1469);
        {int[] a = {1470,1471}; op[1469] = getOpcodeCat(a);}
        op[1470] = getOpcodeRnm(190, 1579); // value-separator
        op[1471] = getOpcodeRnm(175, 1473); // complexInUri
        op[1472] = getOpcodeRnm(187, 1566); // end-array
        {int[] a = {1474,1475,1489}; op[1473] = getOpcodeCat(a);}
        op[1474] = getOpcodeRnm(184, 1548); // begin-object
        op[1475] = getOpcodeRep((char)0, (char)1, 1476);
        {int[] a = {1477,1482}; op[1476] = getOpcodeCat(a);}
        {int[] a = {1478,1479,1480,1481}; op[1477] = getOpcodeAlt(a);}
        op[1478] = getOpcodeRnm(179, 1519); // complexTypeMetadataInUri
        op[1479] = getOpcodeRnm(181, 1528); // primitivePropertyInUri
        op[1480] = getOpcodeRnm(178, 1513); // complexPropertyInUri
        op[1481] = getOpcodeRnm(176, 1490); // collectionPropertyInUri
        op[1482] = getOpcodeRep((char)0, Character.MAX_VALUE, 1483);
        {int[] a = {1484,1485}; op[1483] = getOpcodeCat(a);}
        op[1484] = getOpcodeRnm(190, 1579); // value-separator
        {int[] a = {1486,1487,1488}; op[1485] = getOpcodeAlt(a);}
        op[1486] = getOpcodeRnm(181, 1528); // primitivePropertyInUri
        op[1487] = getOpcodeRnm(178, 1513); // complexPropertyInUri
        op[1488] = getOpcodeRnm(176, 1490); // collectionPropertyInUri
        op[1489] = getOpcodeRnm(185, 1554); // end-object
        {int[] a = {1491,1497}; op[1490] = getOpcodeAlt(a);}
        {int[] a = {1492,1493,1494,1495,1496}; op[1491] = getOpcodeCat(a);}
        op[1492] = getOpcodeRnm(188, 1572); // quotation-mark
        op[1493] = getOpcodeRnm(222, 1747); // primitiveColProperty
        op[1494] = getOpcodeRnm(188, 1572); // quotation-mark
        op[1495] = getOpcodeRnm(189, 1575); // name-separator
        op[1496] = getOpcodeRnm(177, 1503); // primitiveColInUri
        {int[] a = {1498,1499,1500,1501,1502}; op[1497] = getOpcodeCat(a);}
        op[1498] = getOpcodeRnm(188, 1572); // quotation-mark
        op[1499] = getOpcodeRnm(224, 1749); // complexColProperty
        op[1500] = getOpcodeRnm(188, 1572); // quotation-mark
        op[1501] = getOpcodeRnm(189, 1575); // name-separator
        op[1502] = getOpcodeRnm(174, 1463); // complexColInUri
        {int[] a = {1504,1505,1512}; op[1503] = getOpcodeCat(a);}
        op[1504] = getOpcodeRnm(186, 1560); // begin-array
        op[1505] = getOpcodeRep((char)0, (char)1, 1506);
        {int[] a = {1507,1508}; op[1506] = getOpcodeCat(a);}
        op[1507] = getOpcodeRnm(191, 1583); // primitiveLiteralInJSON
        op[1508] = getOpcodeRep((char)0, Character.MAX_VALUE, 1509);
        {int[] a = {1510,1511}; op[1509] = getOpcodeCat(a);}
        op[1510] = getOpcodeRnm(190, 1579); // value-separator
        op[1511] = getOpcodeRnm(191, 1583); // primitiveLiteralInJSON
        op[1512] = getOpcodeRnm(187, 1566); // end-array
        {int[] a = {1514,1515,1516,1517,1518}; op[1513] = getOpcodeCat(a);}
        op[1514] = getOpcodeRnm(188, 1572); // quotation-mark
        op[1515] = getOpcodeRnm(223, 1748); // complexProperty
        op[1516] = getOpcodeRnm(188, 1572); // quotation-mark
        op[1517] = getOpcodeRnm(189, 1575); // name-separator
        op[1518] = getOpcodeRnm(175, 1473); // complexInUri
        op[1519] = getOpcodeRnm(180, 1520); // typeNVPInUri
        {int[] a = {1521,1522,1523,1524,1525,1526,1527}; op[1520] = getOpcodeCat(a);}
        op[1521] = getOpcodeRnm(188, 1572); // quotation-mark
        {char[] a = {111,100,97,116,97,46,116,121,112,101}; op[1522] = getOpcodeTbs(a);}
        op[1523] = getOpcodeRnm(188, 1572); // quotation-mark
        op[1524] = getOpcodeRnm(189, 1575); // name-separator
        op[1525] = getOpcodeRnm(188, 1572); // quotation-mark
        op[1526] = getOpcodeRnm(200, 1650); // qualifiedTypeName
        op[1527] = getOpcodeRnm(188, 1572); // quotation-mark
        {int[] a = {1529,1530,1531,1532,1533}; op[1528] = getOpcodeCat(a);}
        op[1529] = getOpcodeRnm(188, 1572); // quotation-mark
        op[1530] = getOpcodeRnm(219, 1742); // primitiveProperty
        op[1531] = getOpcodeRnm(188, 1572); // quotation-mark
        op[1532] = getOpcodeRnm(189, 1575); // name-separator
        op[1533] = getOpcodeRnm(191, 1583); // primitiveLiteralInJSON
        {int[] a = {1535,1536,1543}; op[1534] = getOpcodeCat(a);}
        op[1535] = getOpcodeRnm(186, 1560); // begin-array
        op[1536] = getOpcodeRep((char)0, (char)1, 1537);
        {int[] a = {1538,1539}; op[1537] = getOpcodeCat(a);}
        op[1538] = getOpcodeRnm(183, 1544); // entityRefInJSON
        op[1539] = getOpcodeRep((char)0, Character.MAX_VALUE, 1540);
        {int[] a = {1541,1542}; op[1540] = getOpcodeCat(a);}
        op[1541] = getOpcodeRnm(190, 1579); // value-separator
        op[1542] = getOpcodeRnm(183, 1544); // entityRefInJSON
        op[1543] = getOpcodeRnm(187, 1566); // end-array
        {int[] a = {1545,1546,1547}; op[1544] = getOpcodeCat(a);}
        op[1545] = getOpcodeRnm(188, 1572); // quotation-mark
        op[1546] = getOpcodeRnm(95, 818); // entityReference
        op[1547] = getOpcodeRnm(188, 1572); // quotation-mark
        {int[] a = {1549,1550,1553}; op[1548] = getOpcodeCat(a);}
        op[1549] = getOpcodeRnm(326, 2315); // BWS
        {int[] a = {1551,1552}; op[1550] = getOpcodeAlt(a);}
        {char[] a = {123}; op[1551] = getOpcodeTls(a);}
        {char[] a = {37,55,66}; op[1552] = getOpcodeTls(a);}
        op[1553] = getOpcodeRnm(326, 2315); // BWS
        {int[] a = {1555,1556,1559}; op[1554] = getOpcodeCat(a);}
        op[1555] = getOpcodeRnm(326, 2315); // BWS
        {int[] a = {1557,1558}; op[1556] = getOpcodeAlt(a);}
        {char[] a = {125}; op[1557] = getOpcodeTls(a);}
        {char[] a = {37,55,68}; op[1558] = getOpcodeTls(a);}
        op[1559] = getOpcodeRnm(326, 2315); // BWS
        {int[] a = {1561,1562,1565}; op[1560] = getOpcodeCat(a);}
        op[1561] = getOpcodeRnm(326, 2315); // BWS
        {int[] a = {1563,1564}; op[1562] = getOpcodeAlt(a);}
        {char[] a = {91}; op[1563] = getOpcodeTls(a);}
        {char[] a = {37,53,66}; op[1564] = getOpcodeTls(a);}
        op[1565] = getOpcodeRnm(326, 2315); // BWS
        {int[] a = {1567,1568,1571}; op[1566] = getOpcodeCat(a);}
        op[1567] = getOpcodeRnm(326, 2315); // BWS
        {int[] a = {1569,1570}; op[1568] = getOpcodeAlt(a);}
        {char[] a = {93}; op[1569] = getOpcodeTls(a);}
        {char[] a = {37,53,68}; op[1570] = getOpcodeTls(a);}
        op[1571] = getOpcodeRnm(326, 2315); // BWS
        {int[] a = {1573,1574}; op[1572] = getOpcodeAlt(a);}
        op[1573] = getOpcodeRnm(365, 2664); // DQUOTE
        {char[] a = {37,50,50}; op[1574] = getOpcodeTls(a);}
        {int[] a = {1576,1577,1578}; op[1575] = getOpcodeCat(a);}
        op[1576] = getOpcodeRnm(326, 2315); // BWS
        op[1577] = getOpcodeRnm(328, 2319); // COLON
        op[1578] = getOpcodeRnm(326, 2315); // BWS
        {int[] a = {1580,1581,1582}; op[1579] = getOpcodeCat(a);}
        op[1580] = getOpcodeRnm(326, 2315); // BWS
        op[1581] = getOpcodeRnm(329, 2322); // COMMA
        op[1582] = getOpcodeRnm(326, 2315); // BWS
        {int[] a = {1584,1585,1586,1587,1588}; op[1583] = getOpcodeAlt(a);}
        op[1584] = getOpcodeRnm(192, 1589); // stringInJSON
        op[1585] = getOpcodeRnm(196, 1624); // numberInJSON
        {char[] a = {116,114,117,101}; op[1586] = getOpcodeTbs(a);}
        {char[] a = {102,97,108,115,101}; op[1587] = getOpcodeTbs(a);}
        {char[] a = {110,117,108,108}; op[1588] = getOpcodeTbs(a);}
        {int[] a = {1590,1591,1593}; op[1589] = getOpcodeCat(a);}
        op[1590] = getOpcodeRnm(188, 1572); // quotation-mark
        op[1591] = getOpcodeRep((char)0, Character.MAX_VALUE, 1592);
        op[1592] = getOpcodeRnm(193, 1594); // charInJSON
        op[1593] = getOpcodeRnm(188, 1572); // quotation-mark
        {int[] a = {1595,1596,1597}; op[1594] = getOpcodeAlt(a);}
        op[1595] = getOpcodeRnm(358, 2595); // qchar-unescaped
        op[1596] = getOpcodeRnm(194, 1614); // qchar-JSON-special
        {int[] a = {1598,1599}; op[1597] = getOpcodeCat(a);}
        op[1598] = getOpcodeRnm(195, 1621); // escape
        {int[] a = {1600,1601,1602,1605,1606,1607,1608,1609,1610}; op[1599] = getOpcodeAlt(a);}
        op[1600] = getOpcodeRnm(188, 1572); // quotation-mark
        op[1601] = getOpcodeRnm(195, 1621); // escape
        {int[] a = {1603,1604}; op[1602] = getOpcodeAlt(a);}
        {char[] a = {47}; op[1603] = getOpcodeTls(a);}
        {char[] a = {37,50,70}; op[1604] = getOpcodeTls(a);}
        {char[] a = {98}; op[1605] = getOpcodeTbs(a);}
        {char[] a = {102}; op[1606] = getOpcodeTbs(a);}
        {char[] a = {110}; op[1607] = getOpcodeTbs(a);}
        {char[] a = {114}; op[1608] = getOpcodeTbs(a);}
        {char[] a = {116}; op[1609] = getOpcodeTbs(a);}
        {int[] a = {1611,1612}; op[1610] = getOpcodeCat(a);}
        {char[] a = {117}; op[1611] = getOpcodeTbs(a);}
        op[1612] = getOpcodeRep((char)4, (char)4, 1613);
        op[1613] = getOpcodeRnm(363, 2654); // HEXDIG
        {int[] a = {1615,1616,1617,1618,1619,1620}; op[1614] = getOpcodeAlt(a);}
        op[1615] = getOpcodeRnm(366, 2665); // SP
        {char[] a = {58}; op[1616] = getOpcodeTls(a);}
        {char[] a = {123}; op[1617] = getOpcodeTls(a);}
        {char[] a = {125}; op[1618] = getOpcodeTls(a);}
        {char[] a = {91}; op[1619] = getOpcodeTls(a);}
        {char[] a = {93}; op[1620] = getOpcodeTls(a);}
        {int[] a = {1622,1623}; op[1621] = getOpcodeAlt(a);}
        {char[] a = {92}; op[1622] = getOpcodeTls(a);}
        {char[] a = {37,53,67}; op[1623] = getOpcodeTls(a);}
        {int[] a = {1625,1627,1628,1630}; op[1624] = getOpcodeCat(a);}
        op[1625] = getOpcodeRep((char)0, (char)1, 1626);
        {char[] a = {45}; op[1626] = getOpcodeTls(a);}
        op[1627] = getOpcodeRnm(197, 1632); // int
        op[1628] = getOpcodeRep((char)0, (char)1, 1629);
        op[1629] = getOpcodeRnm(198, 1638); // frac
        op[1630] = getOpcodeRep((char)0, (char)1, 1631);
        op[1631] = getOpcodeRnm(199, 1642); // exp
        {int[] a = {1633,1634}; op[1632] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1633] = getOpcodeTls(a);}
        {int[] a = {1635,1636}; op[1634] = getOpcodeCat(a);}
        op[1635] = getOpcodeRnm(275, 2034); // oneToNine
        op[1636] = getOpcodeRep((char)0, Character.MAX_VALUE, 1637);
        op[1637] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {1639,1640}; op[1638] = getOpcodeCat(a);}
        {char[] a = {46}; op[1639] = getOpcodeTls(a);}
        op[1640] = getOpcodeRep((char)1, Character.MAX_VALUE, 1641);
        op[1641] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {1643,1644,1648}; op[1642] = getOpcodeCat(a);}
        {char[] a = {101}; op[1643] = getOpcodeTls(a);}
        op[1644] = getOpcodeRep((char)0, (char)1, 1645);
        {int[] a = {1646,1647}; op[1645] = getOpcodeAlt(a);}
        {char[] a = {45}; op[1646] = getOpcodeTls(a);}
        {char[] a = {43}; op[1647] = getOpcodeTls(a);}
        op[1648] = getOpcodeRep((char)1, Character.MAX_VALUE, 1649);
        op[1649] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {1651,1652,1653,1654,1655}; op[1650] = getOpcodeAlt(a);}
        op[1651] = getOpcodeRnm(201, 1664); // qualifiedEntityTypeName
        op[1652] = getOpcodeRnm(202, 1668); // qualifiedComplexTypeName
        op[1653] = getOpcodeRnm(203, 1672); // qualifiedEnumerationTypeName
        op[1654] = getOpcodeRnm(215, 1700); // primitiveTypeName
        {int[] a = {1656,1657,1658,1663}; op[1655] = getOpcodeCat(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110}; op[1656] = getOpcodeTbs(a);}
        op[1657] = getOpcodeRnm(335, 2339); // OPEN
        {int[] a = {1659,1660,1661,1662}; op[1658] = getOpcodeAlt(a);}
        op[1659] = getOpcodeRnm(201, 1664); // qualifiedEntityTypeName
        op[1660] = getOpcodeRnm(202, 1668); // qualifiedComplexTypeName
        op[1661] = getOpcodeRnm(203, 1672); // qualifiedEnumerationTypeName
        op[1662] = getOpcodeRnm(215, 1700); // primitiveTypeName
        op[1663] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {1665,1666,1667}; op[1664] = getOpcodeCat(a);}
        op[1665] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[1666] = getOpcodeTls(a);}
        op[1667] = getOpcodeRnm(208, 1685); // entityTypeName
        {int[] a = {1669,1670,1671}; op[1668] = getOpcodeCat(a);}
        op[1669] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[1670] = getOpcodeTls(a);}
        op[1671] = getOpcodeRnm(209, 1686); // complexTypeName
        {int[] a = {1673,1674,1675}; op[1672] = getOpcodeCat(a);}
        op[1673] = getOpcodeRnm(204, 1676); // namespace
        {char[] a = {46}; op[1674] = getOpcodeTls(a);}
        op[1675] = getOpcodeRnm(210, 1687); // enumerationTypeName
        {int[] a = {1677,1678}; op[1676] = getOpcodeCat(a);}
        op[1677] = getOpcodeRnm(205, 1682); // namespacePart
        op[1678] = getOpcodeRep((char)0, Character.MAX_VALUE, 1679);
        {int[] a = {1680,1681}; op[1679] = getOpcodeCat(a);}
        {char[] a = {46}; op[1680] = getOpcodeTls(a);}
        op[1681] = getOpcodeRnm(205, 1682); // namespacePart
        op[1682] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1683] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1684] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1685] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1686] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1687] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1688] = getOpcodeRnm(212, 1689); // odataIdentifier
        {int[] a = {1690,1691}; op[1689] = getOpcodeCat(a);}
        op[1690] = getOpcodeRnm(213, 1693); // identifierLeadingCharacter
        op[1691] = getOpcodeRep((char)0, (char)127, 1692);
        op[1692] = getOpcodeRnm(214, 1696); // identifierCharacter
        {int[] a = {1694,1695}; op[1693] = getOpcodeAlt(a);}
        op[1694] = getOpcodeRnm(361, 2650); // ALPHA
        {char[] a = {95}; op[1695] = getOpcodeTls(a);}
        {int[] a = {1697,1698,1699}; op[1696] = getOpcodeAlt(a);}
        op[1697] = getOpcodeRnm(361, 2650); // ALPHA
        op[1698] = getOpcodeRnm(362, 2653); // DIGIT
        {char[] a = {95}; op[1699] = getOpcodeTls(a);}
        {int[] a = {1701,1703}; op[1700] = getOpcodeCat(a);}
        op[1701] = getOpcodeRep((char)0, (char)1, 1702);
        {char[] a = {69,100,109,46}; op[1702] = getOpcodeTbs(a);}
        {int[] a = {1704,1705,1706,1707,1708,1709,1710,1711,1712,1713,1714,1715,1716,1717,1718,1719,1720,1721}; op[1703] = getOpcodeAlt(a);}
        {char[] a = {66,105,110,97,114,121}; op[1704] = getOpcodeTbs(a);}
        {char[] a = {66,111,111,108,101,97,110}; op[1705] = getOpcodeTbs(a);}
        {char[] a = {66,121,116,101}; op[1706] = getOpcodeTbs(a);}
        {char[] a = {68,97,116,101}; op[1707] = getOpcodeTbs(a);}
        {char[] a = {68,97,116,101,84,105,109,101,79,102,102,115,101,116}; op[1708] = getOpcodeTbs(a);}
        {char[] a = {68,101,99,105,109,97,108}; op[1709] = getOpcodeTbs(a);}
        {char[] a = {68,111,117,98,108,101}; op[1710] = getOpcodeTbs(a);}
        {char[] a = {68,117,114,97,116,105,111,110}; op[1711] = getOpcodeTbs(a);}
        {char[] a = {71,117,105,100}; op[1712] = getOpcodeTbs(a);}
        {char[] a = {73,110,116,49,54}; op[1713] = getOpcodeTbs(a);}
        {char[] a = {73,110,116,51,50}; op[1714] = getOpcodeTbs(a);}
        {char[] a = {73,110,116,54,52}; op[1715] = getOpcodeTbs(a);}
        {char[] a = {83,66,121,116,101}; op[1716] = getOpcodeTbs(a);}
        {char[] a = {83,105,110,103,108,101}; op[1717] = getOpcodeTbs(a);}
        {char[] a = {83,116,114,101,97,109}; op[1718] = getOpcodeTbs(a);}
        {char[] a = {83,116,114,105,110,103}; op[1719] = getOpcodeTbs(a);}
        {char[] a = {84,105,109,101,79,102,68,97,121}; op[1720] = getOpcodeTbs(a);}
        {int[] a = {1722,1723}; op[1721] = getOpcodeCat(a);}
        op[1722] = getOpcodeRnm(216, 1725); // abstractSpatialTypeName
        op[1723] = getOpcodeRep((char)0, (char)1, 1724);
        op[1724] = getOpcodeRnm(217, 1728); // concreteSpatialTypeName
        {int[] a = {1726,1727}; op[1725] = getOpcodeAlt(a);}
        {char[] a = {71,101,111,103,114,97,112,104,121}; op[1726] = getOpcodeTbs(a);}
        {char[] a = {71,101,111,109,101,116,114,121}; op[1727] = getOpcodeTbs(a);}
        {int[] a = {1729,1730,1731,1732,1733,1734,1735}; op[1728] = getOpcodeAlt(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110}; op[1729] = getOpcodeTbs(a);}
        {char[] a = {76,105,110,101,83,116,114,105,110,103}; op[1730] = getOpcodeTbs(a);}
        {char[] a = {77,117,108,116,105,76,105,110,101,83,116,114,105,110,103}; op[1731] = getOpcodeTbs(a);}
        {char[] a = {77,117,108,116,105,80,111,105,110,116}; op[1732] = getOpcodeTbs(a);}
        {char[] a = {77,117,108,116,105,80,111,108,121,103,111,110}; op[1733] = getOpcodeTbs(a);}
        {char[] a = {80,111,105,110,116}; op[1734] = getOpcodeTbs(a);}
        {char[] a = {80,111,108,121,103,111,110}; op[1735] = getOpcodeTbs(a);}
        {int[] a = {1737,1738,1739,1740,1741}; op[1736] = getOpcodeAlt(a);}
        op[1737] = getOpcodeRnm(219, 1742); // primitiveProperty
        op[1738] = getOpcodeRnm(222, 1747); // primitiveColProperty
        op[1739] = getOpcodeRnm(223, 1748); // complexProperty
        op[1740] = getOpcodeRnm(224, 1749); // complexColProperty
        op[1741] = getOpcodeRnm(225, 1750); // streamProperty
        {int[] a = {1743,1744}; op[1742] = getOpcodeAlt(a);}
        op[1743] = getOpcodeRnm(220, 1745); // primitiveKeyProperty
        op[1744] = getOpcodeRnm(221, 1746); // primitiveNonKeyProperty
        op[1745] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1746] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1747] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1748] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1749] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1750] = getOpcodeRnm(212, 1689); // odataIdentifier
        {int[] a = {1752,1753}; op[1751] = getOpcodeAlt(a);}
        op[1752] = getOpcodeRnm(227, 1754); // entityNavigationProperty
        op[1753] = getOpcodeRnm(228, 1755); // entityColNavigationProperty
        op[1754] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1755] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1756] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1757] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1758] = getOpcodeRnm(212, 1689); // odataIdentifier
        {int[] a = {1760,1761,1762,1763,1764,1765}; op[1759] = getOpcodeAlt(a);}
        op[1760] = getOpcodeRnm(233, 1766); // entityFunction
        op[1761] = getOpcodeRnm(234, 1767); // entityColFunction
        op[1762] = getOpcodeRnm(235, 1768); // complexFunction
        op[1763] = getOpcodeRnm(236, 1769); // complexColFunction
        op[1764] = getOpcodeRnm(237, 1770); // primitiveFunction
        op[1765] = getOpcodeRnm(238, 1771); // primitiveColFunction
        op[1766] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1767] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1768] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1769] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1770] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1771] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1772] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1773] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1774] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1775] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1776] = getOpcodeRnm(212, 1689); // odataIdentifier
        op[1777] = getOpcodeRnm(212, 1689); // odataIdentifier
        {int[] a = {1779,1780,1781,1782,1783,1784,1785,1786,1787,1788,1789,1790,1791,1792,1793,1794,1795,1796,1797,1798,1799,1800,1801,1802,1803,1804,1805,1806,1807,1808,1809,1810}; op[1778] = getOpcodeAlt(a);}
        op[1779] = getOpcodeRnm(246, 1811); // null
        op[1780] = getOpcodeRnm(250, 1835); // decimal
        op[1781] = getOpcodeRnm(254, 1864); // single
        op[1782] = getOpcodeRnm(252, 1849); // double
        op[1783] = getOpcodeRnm(260, 1905); // sbyte
        op[1784] = getOpcodeRnm(259, 1903); // byte
        op[1785] = getOpcodeRnm(261, 1910); // int16
        op[1786] = getOpcodeRnm(262, 1915); // int32
        op[1787] = getOpcodeRnm(263, 1920); // int64
        op[1788] = getOpcodeRnm(247, 1818); // binary
        op[1789] = getOpcodeRnm(267, 1939); // date
        op[1790] = getOpcodeRnm(269, 1950); // dateTimeOffset
        op[1791] = getOpcodeRnm(271, 1980); // duration
        op[1792] = getOpcodeRnm(257, 1883); // guid
        op[1793] = getOpcodeRnm(265, 1929); // string
        op[1794] = getOpcodeRnm(273, 2017); // timeOfDay
        op[1795] = getOpcodeRnm(249, 1828); // boolean
        op[1796] = getOpcodeRnm(284, 2103); // enum
        op[1797] = getOpcodeRnm(287, 2117); // geographyCollection
        op[1798] = getOpcodeRnm(291, 2141); // geographyLineString
        op[1799] = getOpcodeRnm(295, 2160); // geographyMultiLineString
        op[1800] = getOpcodeRnm(298, 2178); // geographyMultiPoint
        op[1801] = getOpcodeRnm(301, 2196); // geographyMultiPolygon
        op[1802] = getOpcodeRnm(304, 2214); // geographyPoint
        op[1803] = getOpcodeRnm(310, 2239); // geographyPolygon
        op[1804] = getOpcodeRnm(315, 2266); // geometryCollection
        op[1805] = getOpcodeRnm(316, 2271); // geometryLineString
        op[1806] = getOpcodeRnm(317, 2276); // geometryMultiLineString
        op[1807] = getOpcodeRnm(318, 2281); // geometryMultiPoint
        op[1808] = getOpcodeRnm(319, 2286); // geometryMultiPolygon
        op[1809] = getOpcodeRnm(320, 2291); // geometryPoint
        op[1810] = getOpcodeRnm(321, 2296); // geometryPolygon
        {int[] a = {1812,1813}; op[1811] = getOpcodeCat(a);}
        {char[] a = {110,117,108,108}; op[1812] = getOpcodeTbs(a);}
        op[1813] = getOpcodeRep((char)0, (char)1, 1814);
        {int[] a = {1815,1816,1817}; op[1814] = getOpcodeCat(a);}
        op[1815] = getOpcodeRnm(334, 2336); // SQUOTE
        op[1816] = getOpcodeRnm(200, 1650); // qualifiedTypeName
        op[1817] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {1819,1822,1823,1824}; op[1818] = getOpcodeCat(a);}
        {int[] a = {1820,1821}; op[1819] = getOpcodeAlt(a);}
        {char[] a = {88}; op[1820] = getOpcodeTbs(a);}
        {char[] a = {98,105,110,97,114,121}; op[1821] = getOpcodeTls(a);}
        op[1822] = getOpcodeRnm(334, 2336); // SQUOTE
        op[1823] = getOpcodeRnm(248, 1825); // binaryBody
        op[1824] = getOpcodeRnm(334, 2336); // SQUOTE
        op[1825] = getOpcodeRep((char)0, Character.MAX_VALUE, 1826);
        op[1826] = getOpcodeRep((char)2, (char)2, 1827);
        op[1827] = getOpcodeRnm(363, 2654); // HEXDIG
        {int[] a = {1829,1832}; op[1828] = getOpcodeAlt(a);}
        {int[] a = {1830,1831}; op[1829] = getOpcodeAlt(a);}
        {char[] a = {116,114,117,101}; op[1830] = getOpcodeTls(a);}
        {char[] a = {49}; op[1831] = getOpcodeTls(a);}
        {int[] a = {1833,1834}; op[1832] = getOpcodeAlt(a);}
        {char[] a = {102,97,108,115,101}; op[1833] = getOpcodeTls(a);}
        {char[] a = {48}; op[1834] = getOpcodeTls(a);}
        {int[] a = {1836,1837}; op[1835] = getOpcodeCat(a);}
        op[1836] = getOpcodeRnm(251, 1839); // decimalBody
        op[1837] = getOpcodeRep((char)0, (char)1, 1838);
        {char[] a = {109}; op[1838] = getOpcodeTls(a);}
        {int[] a = {1840,1842,1844}; op[1839] = getOpcodeCat(a);}
        op[1840] = getOpcodeRep((char)0, (char)1, 1841);
        op[1841] = getOpcodeRnm(331, 2326); // SIGN
        op[1842] = getOpcodeRep((char)1, Character.MAX_VALUE, 1843);
        op[1843] = getOpcodeRnm(362, 2653); // DIGIT
        op[1844] = getOpcodeRep((char)0, (char)1, 1845);
        {int[] a = {1846,1847}; op[1845] = getOpcodeCat(a);}
        {char[] a = {46}; op[1846] = getOpcodeTls(a);}
        op[1847] = getOpcodeRep((char)1, Character.MAX_VALUE, 1848);
        op[1848] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {1850,1854}; op[1849] = getOpcodeAlt(a);}
        {int[] a = {1851,1852}; op[1850] = getOpcodeCat(a);}
        op[1851] = getOpcodeRnm(253, 1855); // doubleBody
        op[1852] = getOpcodeRep((char)0, (char)1, 1853);
        {char[] a = {100}; op[1853] = getOpcodeTls(a);}
        op[1854] = getOpcodeRnm(256, 1879); // nanInfinity
        {int[] a = {1856,1857}; op[1855] = getOpcodeCat(a);}
        op[1856] = getOpcodeRnm(251, 1839); // decimalBody
        op[1857] = getOpcodeRep((char)0, (char)1, 1858);
        {int[] a = {1859,1860,1862}; op[1858] = getOpcodeCat(a);}
        {char[] a = {101}; op[1859] = getOpcodeTls(a);}
        op[1860] = getOpcodeRep((char)0, (char)1, 1861);
        op[1861] = getOpcodeRnm(331, 2326); // SIGN
        op[1862] = getOpcodeRep((char)1, Character.MAX_VALUE, 1863);
        op[1863] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {1865,1869}; op[1864] = getOpcodeAlt(a);}
        {int[] a = {1866,1867}; op[1865] = getOpcodeCat(a);}
        op[1866] = getOpcodeRnm(255, 1870); // singleBody
        op[1867] = getOpcodeRep((char)0, (char)1, 1868);
        {char[] a = {102}; op[1868] = getOpcodeTls(a);}
        op[1869] = getOpcodeRnm(256, 1879); // nanInfinity
        {int[] a = {1871,1872}; op[1870] = getOpcodeCat(a);}
        op[1871] = getOpcodeRnm(251, 1839); // decimalBody
        op[1872] = getOpcodeRep((char)0, (char)1, 1873);
        {int[] a = {1874,1875,1877}; op[1873] = getOpcodeCat(a);}
        {char[] a = {101}; op[1874] = getOpcodeTls(a);}
        op[1875] = getOpcodeRep((char)0, (char)1, 1876);
        op[1876] = getOpcodeRnm(331, 2326); // SIGN
        op[1877] = getOpcodeRep((char)1, Character.MAX_VALUE, 1878);
        op[1878] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {1880,1881,1882}; op[1879] = getOpcodeAlt(a);}
        {char[] a = {78,97,78}; op[1880] = getOpcodeTbs(a);}
        {char[] a = {45,73,78,70}; op[1881] = getOpcodeTbs(a);}
        {char[] a = {73,78,70}; op[1882] = getOpcodeTbs(a);}
        {int[] a = {1884,1885,1886,1887}; op[1883] = getOpcodeCat(a);}
        {char[] a = {103,117,105,100}; op[1884] = getOpcodeTls(a);}
        op[1885] = getOpcodeRnm(334, 2336); // SQUOTE
        op[1886] = getOpcodeRnm(258, 1888); // guidBody
        op[1887] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {1889,1891,1892,1894,1895,1897,1898,1900,1901}; op[1888] = getOpcodeCat(a);}
        op[1889] = getOpcodeRep((char)8, (char)8, 1890);
        op[1890] = getOpcodeRnm(363, 2654); // HEXDIG
        {char[] a = {45}; op[1891] = getOpcodeTls(a);}
        op[1892] = getOpcodeRep((char)4, (char)4, 1893);
        op[1893] = getOpcodeRnm(363, 2654); // HEXDIG
        {char[] a = {45}; op[1894] = getOpcodeTls(a);}
        op[1895] = getOpcodeRep((char)4, (char)4, 1896);
        op[1896] = getOpcodeRnm(363, 2654); // HEXDIG
        {char[] a = {45}; op[1897] = getOpcodeTls(a);}
        op[1898] = getOpcodeRep((char)4, (char)4, 1899);
        op[1899] = getOpcodeRnm(363, 2654); // HEXDIG
        {char[] a = {45}; op[1900] = getOpcodeTls(a);}
        op[1901] = getOpcodeRep((char)12, (char)12, 1902);
        op[1902] = getOpcodeRnm(363, 2654); // HEXDIG
        op[1903] = getOpcodeRep((char)1, (char)3, 1904);
        op[1904] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {1906,1908}; op[1905] = getOpcodeCat(a);}
        op[1906] = getOpcodeRep((char)0, (char)1, 1907);
        op[1907] = getOpcodeRnm(331, 2326); // SIGN
        op[1908] = getOpcodeRep((char)1, (char)3, 1909);
        op[1909] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {1911,1913}; op[1910] = getOpcodeCat(a);}
        op[1911] = getOpcodeRep((char)0, (char)1, 1912);
        op[1912] = getOpcodeRnm(331, 2326); // SIGN
        op[1913] = getOpcodeRep((char)1, (char)5, 1914);
        op[1914] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {1916,1918}; op[1915] = getOpcodeCat(a);}
        op[1916] = getOpcodeRep((char)0, (char)1, 1917);
        op[1917] = getOpcodeRnm(331, 2326); // SIGN
        op[1918] = getOpcodeRep((char)1, (char)10, 1919);
        op[1919] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {1921,1922}; op[1920] = getOpcodeCat(a);}
        op[1921] = getOpcodeRnm(264, 1924); // int64Body
        op[1922] = getOpcodeRep((char)0, (char)1, 1923);
        {char[] a = {76}; op[1923] = getOpcodeTls(a);}
        {int[] a = {1925,1927}; op[1924] = getOpcodeCat(a);}
        op[1925] = getOpcodeRep((char)0, (char)1, 1926);
        op[1926] = getOpcodeRnm(331, 2326); // SIGN
        op[1927] = getOpcodeRep((char)1, (char)19, 1928);
        op[1928] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {1930,1931,1935}; op[1929] = getOpcodeCat(a);}
        op[1930] = getOpcodeRnm(334, 2336); // SQUOTE
        op[1931] = getOpcodeRep((char)0, Character.MAX_VALUE, 1932);
        {int[] a = {1933,1934}; op[1932] = getOpcodeAlt(a);}
        op[1933] = getOpcodeRnm(266, 1936); // SQUOTE-in-string
        op[1934] = getOpcodeRnm(353, 2529); // pchar-no-SQUOTE
        op[1935] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {1937,1938}; op[1936] = getOpcodeCat(a);}
        op[1937] = getOpcodeRnm(334, 2336); // SQUOTE
        op[1938] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {1940,1941,1942,1943}; op[1939] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101}; op[1940] = getOpcodeTls(a);}
        op[1941] = getOpcodeRnm(334, 2336); // SQUOTE
        op[1942] = getOpcodeRnm(268, 1944); // dateBody
        op[1943] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {1945,1946,1947,1948,1949}; op[1944] = getOpcodeCat(a);}
        op[1945] = getOpcodeRnm(277, 2053); // year
        {char[] a = {45}; op[1946] = getOpcodeTls(a);}
        op[1947] = getOpcodeRnm(278, 2065); // month
        {char[] a = {45}; op[1948] = getOpcodeTls(a);}
        op[1949] = getOpcodeRnm(279, 2075); // day
        {int[] a = {1951,1952,1953,1954}; op[1950] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[1951] = getOpcodeTls(a);}
        op[1952] = getOpcodeRnm(334, 2336); // SQUOTE
        op[1953] = getOpcodeRnm(270, 1955); // dateTimeOffsetBody
        op[1954] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {1956,1957,1958,1959,1960,1961,1962,1963,1964,1965,1973}; op[1955] = getOpcodeCat(a);}
        op[1956] = getOpcodeRnm(277, 2053); // year
        {char[] a = {45}; op[1957] = getOpcodeTls(a);}
        op[1958] = getOpcodeRnm(278, 2065); // month
        {char[] a = {45}; op[1959] = getOpcodeTls(a);}
        op[1960] = getOpcodeRnm(279, 2075); // day
        {char[] a = {84}; op[1961] = getOpcodeTls(a);}
        op[1962] = getOpcodeRnm(280, 2087); // hour
        {char[] a = {58}; op[1963] = getOpcodeTls(a);}
        op[1964] = getOpcodeRnm(281, 2099); // minute
        op[1965] = getOpcodeRep((char)0, (char)1, 1966);
        {int[] a = {1967,1968,1969}; op[1966] = getOpcodeCat(a);}
        {char[] a = {58}; op[1967] = getOpcodeTls(a);}
        op[1968] = getOpcodeRnm(282, 2100); // second
        op[1969] = getOpcodeRep((char)0, (char)1, 1970);
        {int[] a = {1971,1972}; op[1970] = getOpcodeCat(a);}
        {char[] a = {46}; op[1971] = getOpcodeTls(a);}
        op[1972] = getOpcodeRnm(283, 2101); // fractionalSeconds
        {int[] a = {1974,1975}; op[1973] = getOpcodeAlt(a);}
        {char[] a = {90}; op[1974] = getOpcodeTls(a);}
        {int[] a = {1976,1977,1978,1979}; op[1975] = getOpcodeCat(a);}
        op[1976] = getOpcodeRnm(331, 2326); // SIGN
        op[1977] = getOpcodeRnm(280, 2087); // hour
        {char[] a = {58}; op[1978] = getOpcodeTls(a);}
        op[1979] = getOpcodeRnm(281, 2099); // minute
        {int[] a = {1981,1982,1983,1984}; op[1980] = getOpcodeCat(a);}
        {char[] a = {100,117,114,97,116,105,111,110}; op[1981] = getOpcodeTls(a);}
        op[1982] = getOpcodeRnm(334, 2336); // SQUOTE
        op[1983] = getOpcodeRnm(272, 1985); // durationBody
        op[1984] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {1986,1988,1989,1994}; op[1985] = getOpcodeCat(a);}
        op[1986] = getOpcodeRep((char)0, (char)1, 1987);
        op[1987] = getOpcodeRnm(331, 2326); // SIGN
        {char[] a = {80}; op[1988] = getOpcodeTls(a);}
        op[1989] = getOpcodeRep((char)0, (char)1, 1990);
        {int[] a = {1991,1993}; op[1990] = getOpcodeCat(a);}
        op[1991] = getOpcodeRep((char)1, Character.MAX_VALUE, 1992);
        op[1992] = getOpcodeRnm(362, 2653); // DIGIT
        {char[] a = {68}; op[1993] = getOpcodeTls(a);}
        op[1994] = getOpcodeRep((char)0, (char)1, 1995);
        {int[] a = {1996,1997,2002,2007}; op[1995] = getOpcodeCat(a);}
        {char[] a = {84}; op[1996] = getOpcodeTls(a);}
        op[1997] = getOpcodeRep((char)0, (char)1, 1998);
        {int[] a = {1999,2001}; op[1998] = getOpcodeCat(a);}
        op[1999] = getOpcodeRep((char)1, Character.MAX_VALUE, 2000);
        op[2000] = getOpcodeRnm(362, 2653); // DIGIT
        {char[] a = {72}; op[2001] = getOpcodeTls(a);}
        op[2002] = getOpcodeRep((char)0, (char)1, 2003);
        {int[] a = {2004,2006}; op[2003] = getOpcodeCat(a);}
        op[2004] = getOpcodeRep((char)1, Character.MAX_VALUE, 2005);
        op[2005] = getOpcodeRnm(362, 2653); // DIGIT
        {char[] a = {77}; op[2006] = getOpcodeTls(a);}
        op[2007] = getOpcodeRep((char)0, (char)1, 2008);
        {int[] a = {2009,2011,2016}; op[2008] = getOpcodeCat(a);}
        op[2009] = getOpcodeRep((char)1, Character.MAX_VALUE, 2010);
        op[2010] = getOpcodeRnm(362, 2653); // DIGIT
        op[2011] = getOpcodeRep((char)0, (char)1, 2012);
        {int[] a = {2013,2014}; op[2012] = getOpcodeCat(a);}
        {char[] a = {46}; op[2013] = getOpcodeTls(a);}
        op[2014] = getOpcodeRep((char)1, Character.MAX_VALUE, 2015);
        op[2015] = getOpcodeRnm(362, 2653); // DIGIT
        {char[] a = {83}; op[2016] = getOpcodeTls(a);}
        {int[] a = {2018,2019,2020,2021}; op[2017] = getOpcodeCat(a);}
        {char[] a = {116,105,109,101,111,102,100,97,121}; op[2018] = getOpcodeTls(a);}
        op[2019] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2020] = getOpcodeRnm(274, 2022); // timeOfDayBody
        op[2021] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2023,2024,2025,2026}; op[2022] = getOpcodeCat(a);}
        op[2023] = getOpcodeRnm(280, 2087); // hour
        {char[] a = {58}; op[2024] = getOpcodeTls(a);}
        op[2025] = getOpcodeRnm(281, 2099); // minute
        op[2026] = getOpcodeRep((char)0, (char)1, 2027);
        {int[] a = {2028,2029,2030}; op[2027] = getOpcodeCat(a);}
        {char[] a = {58}; op[2028] = getOpcodeTls(a);}
        op[2029] = getOpcodeRnm(282, 2100); // second
        op[2030] = getOpcodeRep((char)0, (char)1, 2031);
        {int[] a = {2032,2033}; op[2031] = getOpcodeCat(a);}
        {char[] a = {46}; op[2032] = getOpcodeTls(a);}
        op[2033] = getOpcodeRnm(283, 2101); // fractionalSeconds
        {int[] a = {2035,2036,2037,2038,2039,2040,2041,2042,2043}; op[2034] = getOpcodeAlt(a);}
        {char[] a = {49}; op[2035] = getOpcodeTls(a);}
        {char[] a = {50}; op[2036] = getOpcodeTls(a);}
        {char[] a = {51}; op[2037] = getOpcodeTls(a);}
        {char[] a = {52}; op[2038] = getOpcodeTls(a);}
        {char[] a = {53}; op[2039] = getOpcodeTls(a);}
        {char[] a = {54}; op[2040] = getOpcodeTls(a);}
        {char[] a = {55}; op[2041] = getOpcodeTls(a);}
        {char[] a = {56}; op[2042] = getOpcodeTls(a);}
        {char[] a = {57}; op[2043] = getOpcodeTls(a);}
        {int[] a = {2045,2052}; op[2044] = getOpcodeCat(a);}
        {int[] a = {2046,2047,2048,2049,2050,2051}; op[2045] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2046] = getOpcodeTls(a);}
        {char[] a = {49}; op[2047] = getOpcodeTls(a);}
        {char[] a = {50}; op[2048] = getOpcodeTls(a);}
        {char[] a = {51}; op[2049] = getOpcodeTls(a);}
        {char[] a = {52}; op[2050] = getOpcodeTls(a);}
        {char[] a = {53}; op[2051] = getOpcodeTls(a);}
        op[2052] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {2054,2056}; op[2053] = getOpcodeCat(a);}
        op[2054] = getOpcodeRep((char)0, (char)1, 2055);
        {char[] a = {45}; op[2055] = getOpcodeTls(a);}
        {int[] a = {2057,2061}; op[2056] = getOpcodeAlt(a);}
        {int[] a = {2058,2059}; op[2057] = getOpcodeCat(a);}
        {char[] a = {48}; op[2058] = getOpcodeTls(a);}
        op[2059] = getOpcodeRep((char)3, (char)3, 2060);
        op[2060] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {2062,2063}; op[2061] = getOpcodeCat(a);}
        op[2062] = getOpcodeRnm(275, 2034); // oneToNine
        op[2063] = getOpcodeRep((char)3, Character.MAX_VALUE, 2064);
        op[2064] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {2066,2069}; op[2065] = getOpcodeAlt(a);}
        {int[] a = {2067,2068}; op[2066] = getOpcodeCat(a);}
        {char[] a = {48}; op[2067] = getOpcodeTls(a);}
        op[2068] = getOpcodeRnm(275, 2034); // oneToNine
        {int[] a = {2070,2071}; op[2069] = getOpcodeCat(a);}
        {char[] a = {49}; op[2070] = getOpcodeTls(a);}
        {int[] a = {2072,2073,2074}; op[2071] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2072] = getOpcodeTls(a);}
        {char[] a = {49}; op[2073] = getOpcodeTls(a);}
        {char[] a = {50}; op[2074] = getOpcodeTls(a);}
        {int[] a = {2076,2082}; op[2075] = getOpcodeAlt(a);}
        {int[] a = {2077,2081}; op[2076] = getOpcodeCat(a);}
        {int[] a = {2078,2079,2080}; op[2077] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2078] = getOpcodeTls(a);}
        {char[] a = {49}; op[2079] = getOpcodeTls(a);}
        {char[] a = {50}; op[2080] = getOpcodeTls(a);}
        op[2081] = getOpcodeRnm(275, 2034); // oneToNine
        {int[] a = {2083,2084}; op[2082] = getOpcodeCat(a);}
        {char[] a = {51}; op[2083] = getOpcodeTls(a);}
        {int[] a = {2085,2086}; op[2084] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2085] = getOpcodeTls(a);}
        {char[] a = {49}; op[2086] = getOpcodeTls(a);}
        {int[] a = {2088,2093}; op[2087] = getOpcodeAlt(a);}
        {int[] a = {2089,2092}; op[2088] = getOpcodeCat(a);}
        {int[] a = {2090,2091}; op[2089] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2090] = getOpcodeTls(a);}
        {char[] a = {49}; op[2091] = getOpcodeTls(a);}
        op[2092] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {2094,2095}; op[2093] = getOpcodeCat(a);}
        {char[] a = {50}; op[2094] = getOpcodeTls(a);}
        {int[] a = {2096,2097,2098}; op[2095] = getOpcodeAlt(a);}
        {char[] a = {49}; op[2096] = getOpcodeTls(a);}
        {char[] a = {50}; op[2097] = getOpcodeTls(a);}
        {char[] a = {51}; op[2098] = getOpcodeTls(a);}
        op[2099] = getOpcodeRnm(276, 2044); // zeroToFiftyNine
        op[2100] = getOpcodeRnm(276, 2044); // zeroToFiftyNine
        op[2101] = getOpcodeRep((char)1, (char)12, 2102);
        op[2102] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {2104,2105,2106,2107}; op[2103] = getOpcodeCat(a);}
        op[2104] = getOpcodeRnm(203, 1672); // qualifiedEnumerationTypeName
        op[2105] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2106] = getOpcodeRnm(285, 2108); // enumBody
        op[2107] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2109,2110}; op[2108] = getOpcodeCat(a);}
        op[2109] = getOpcodeRnm(286, 2114); // enumValue
        op[2110] = getOpcodeRep((char)0, Character.MAX_VALUE, 2111);
        {int[] a = {2112,2113}; op[2111] = getOpcodeCat(a);}
        op[2112] = getOpcodeRnm(329, 2322); // COMMA
        op[2113] = getOpcodeRnm(286, 2114); // enumValue
        {int[] a = {2115,2116}; op[2114] = getOpcodeAlt(a);}
        op[2115] = getOpcodeRnm(211, 1688); // enumerationMember
        op[2116] = getOpcodeRnm(264, 1924); // int64Body
        {int[] a = {2118,2119,2120,2121}; op[2117] = getOpcodeCat(a);}
        op[2118] = getOpcodeRnm(322, 2301); // geographyPrefix
        op[2119] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2120] = getOpcodeRnm(288, 2122); // fullCollectionLiteral
        op[2121] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2123,2124}; op[2122] = getOpcodeCat(a);}
        op[2123] = getOpcodeRnm(306, 2222); // sridLiteral
        op[2124] = getOpcodeRnm(289, 2125); // collectionLiteral
        {int[] a = {2126,2127,2128,2132}; op[2125] = getOpcodeCat(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110,40}; op[2126] = getOpcodeTls(a);}
        op[2127] = getOpcodeRnm(290, 2133); // geoLiteral
        op[2128] = getOpcodeRep((char)0, Character.MAX_VALUE, 2129);
        {int[] a = {2130,2131}; op[2129] = getOpcodeCat(a);}
        op[2130] = getOpcodeRnm(329, 2322); // COMMA
        op[2131] = getOpcodeRnm(290, 2133); // geoLiteral
        op[2132] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {2134,2135,2136,2137,2138,2139,2140}; op[2133] = getOpcodeAlt(a);}
        op[2134] = getOpcodeRnm(289, 2125); // collectionLiteral
        op[2135] = getOpcodeRnm(293, 2149); // lineStringLiteral
        op[2136] = getOpcodeRnm(300, 2186); // multiPointLiteral
        op[2137] = getOpcodeRnm(297, 2168); // multiLineStringLiteral
        op[2138] = getOpcodeRnm(303, 2204); // multiPolygonLiteral
        op[2139] = getOpcodeRnm(307, 2228); // pointLiteral
        op[2140] = getOpcodeRnm(312, 2247); // polygonLiteral
        {int[] a = {2142,2143,2144,2145}; op[2141] = getOpcodeCat(a);}
        op[2142] = getOpcodeRnm(322, 2301); // geographyPrefix
        op[2143] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2144] = getOpcodeRnm(292, 2146); // fullLineStringLiteral
        op[2145] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2147,2148}; op[2146] = getOpcodeCat(a);}
        op[2147] = getOpcodeRnm(306, 2222); // sridLiteral
        op[2148] = getOpcodeRnm(293, 2149); // lineStringLiteral
        {int[] a = {2150,2151}; op[2149] = getOpcodeCat(a);}
        {char[] a = {76,105,110,101,83,116,114,105,110,103}; op[2150] = getOpcodeTls(a);}
        op[2151] = getOpcodeRnm(294, 2152); // lineStringData
        {int[] a = {2153,2154,2155,2159}; op[2152] = getOpcodeCat(a);}
        op[2153] = getOpcodeRnm(335, 2339); // OPEN
        op[2154] = getOpcodeRnm(309, 2235); // positionLiteral
        op[2155] = getOpcodeRep((char)1, Character.MAX_VALUE, 2156);
        {int[] a = {2157,2158}; op[2156] = getOpcodeCat(a);}
        op[2157] = getOpcodeRnm(329, 2322); // COMMA
        op[2158] = getOpcodeRnm(309, 2235); // positionLiteral
        op[2159] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {2161,2162,2163,2164}; op[2160] = getOpcodeCat(a);}
        op[2161] = getOpcodeRnm(322, 2301); // geographyPrefix
        op[2162] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2163] = getOpcodeRnm(296, 2165); // fullMultiLineStringLiteral
        op[2164] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2166,2167}; op[2165] = getOpcodeCat(a);}
        op[2166] = getOpcodeRnm(306, 2222); // sridLiteral
        op[2167] = getOpcodeRnm(297, 2168); // multiLineStringLiteral
        {int[] a = {2169,2170,2177}; op[2168] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,76,105,110,101,83,116,114,105,110,103,40}; op[2169] = getOpcodeTls(a);}
        op[2170] = getOpcodeRep((char)0, (char)1, 2171);
        {int[] a = {2172,2173}; op[2171] = getOpcodeCat(a);}
        op[2172] = getOpcodeRnm(294, 2152); // lineStringData
        op[2173] = getOpcodeRep((char)0, Character.MAX_VALUE, 2174);
        {int[] a = {2175,2176}; op[2174] = getOpcodeCat(a);}
        op[2175] = getOpcodeRnm(329, 2322); // COMMA
        op[2176] = getOpcodeRnm(294, 2152); // lineStringData
        op[2177] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {2179,2180,2181,2182}; op[2178] = getOpcodeCat(a);}
        op[2179] = getOpcodeRnm(322, 2301); // geographyPrefix
        op[2180] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2181] = getOpcodeRnm(299, 2183); // fullMultiPointLiteral
        op[2182] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2184,2185}; op[2183] = getOpcodeCat(a);}
        op[2184] = getOpcodeRnm(306, 2222); // sridLiteral
        op[2185] = getOpcodeRnm(300, 2186); // multiPointLiteral
        {int[] a = {2187,2188,2195}; op[2186] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,80,111,105,110,116,40}; op[2187] = getOpcodeTls(a);}
        op[2188] = getOpcodeRep((char)0, (char)1, 2189);
        {int[] a = {2190,2191}; op[2189] = getOpcodeCat(a);}
        op[2190] = getOpcodeRnm(308, 2231); // pointData
        op[2191] = getOpcodeRep((char)0, Character.MAX_VALUE, 2192);
        {int[] a = {2193,2194}; op[2192] = getOpcodeCat(a);}
        op[2193] = getOpcodeRnm(329, 2322); // COMMA
        op[2194] = getOpcodeRnm(308, 2231); // pointData
        op[2195] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {2197,2198,2199,2200}; op[2196] = getOpcodeCat(a);}
        op[2197] = getOpcodeRnm(322, 2301); // geographyPrefix
        op[2198] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2199] = getOpcodeRnm(302, 2201); // fullMultiPolygonLiteral
        op[2200] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2202,2203}; op[2201] = getOpcodeCat(a);}
        op[2202] = getOpcodeRnm(306, 2222); // sridLiteral
        op[2203] = getOpcodeRnm(303, 2204); // multiPolygonLiteral
        {int[] a = {2205,2206,2213}; op[2204] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,80,111,108,121,103,111,110,40}; op[2205] = getOpcodeTls(a);}
        op[2206] = getOpcodeRep((char)0, (char)1, 2207);
        {int[] a = {2208,2209}; op[2207] = getOpcodeCat(a);}
        op[2208] = getOpcodeRnm(313, 2250); // polygonData
        op[2209] = getOpcodeRep((char)0, Character.MAX_VALUE, 2210);
        {int[] a = {2211,2212}; op[2210] = getOpcodeCat(a);}
        op[2211] = getOpcodeRnm(329, 2322); // COMMA
        op[2212] = getOpcodeRnm(313, 2250); // polygonData
        op[2213] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {2215,2216,2217,2218}; op[2214] = getOpcodeCat(a);}
        op[2215] = getOpcodeRnm(322, 2301); // geographyPrefix
        op[2216] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2217] = getOpcodeRnm(305, 2219); // fullPointLiteral
        op[2218] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2220,2221}; op[2219] = getOpcodeCat(a);}
        op[2220] = getOpcodeRnm(306, 2222); // sridLiteral
        op[2221] = getOpcodeRnm(307, 2228); // pointLiteral
        {int[] a = {2223,2224,2225,2227}; op[2222] = getOpcodeCat(a);}
        {char[] a = {83,82,73,68}; op[2223] = getOpcodeTls(a);}
        op[2224] = getOpcodeRnm(330, 2325); // EQ
        op[2225] = getOpcodeRep((char)1, (char)5, 2226);
        op[2226] = getOpcodeRnm(362, 2653); // DIGIT
        op[2227] = getOpcodeRnm(332, 2330); // SEMI
        {int[] a = {2229,2230}; op[2228] = getOpcodeCat(a);}
        {char[] a = {80,111,105,110,116}; op[2229] = getOpcodeTls(a);}
        op[2230] = getOpcodeRnm(308, 2231); // pointData
        {int[] a = {2232,2233,2234}; op[2231] = getOpcodeCat(a);}
        op[2232] = getOpcodeRnm(335, 2339); // OPEN
        op[2233] = getOpcodeRnm(309, 2235); // positionLiteral
        op[2234] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {2236,2237,2238}; op[2235] = getOpcodeCat(a);}
        op[2236] = getOpcodeRnm(252, 1849); // double
        op[2237] = getOpcodeRnm(366, 2665); // SP
        op[2238] = getOpcodeRnm(252, 1849); // double
        {int[] a = {2240,2241,2242,2243}; op[2239] = getOpcodeCat(a);}
        op[2240] = getOpcodeRnm(322, 2301); // geographyPrefix
        op[2241] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2242] = getOpcodeRnm(311, 2244); // fullPolygonLiteral
        op[2243] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2245,2246}; op[2244] = getOpcodeCat(a);}
        op[2245] = getOpcodeRnm(306, 2222); // sridLiteral
        op[2246] = getOpcodeRnm(312, 2247); // polygonLiteral
        {int[] a = {2248,2249}; op[2247] = getOpcodeCat(a);}
        {char[] a = {80,111,108,121,103,111,110}; op[2248] = getOpcodeTls(a);}
        op[2249] = getOpcodeRnm(313, 2250); // polygonData
        {int[] a = {2251,2252,2253,2257}; op[2250] = getOpcodeCat(a);}
        op[2251] = getOpcodeRnm(335, 2339); // OPEN
        op[2252] = getOpcodeRnm(314, 2258); // ringLiteral
        op[2253] = getOpcodeRep((char)0, Character.MAX_VALUE, 2254);
        {int[] a = {2255,2256}; op[2254] = getOpcodeCat(a);}
        op[2255] = getOpcodeRnm(329, 2322); // COMMA
        op[2256] = getOpcodeRnm(314, 2258); // ringLiteral
        op[2257] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {2259,2260,2261,2265}; op[2258] = getOpcodeCat(a);}
        op[2259] = getOpcodeRnm(335, 2339); // OPEN
        op[2260] = getOpcodeRnm(309, 2235); // positionLiteral
        op[2261] = getOpcodeRep((char)0, Character.MAX_VALUE, 2262);
        {int[] a = {2263,2264}; op[2262] = getOpcodeCat(a);}
        op[2263] = getOpcodeRnm(329, 2322); // COMMA
        op[2264] = getOpcodeRnm(309, 2235); // positionLiteral
        op[2265] = getOpcodeRnm(336, 2342); // CLOSE
        {int[] a = {2267,2268,2269,2270}; op[2266] = getOpcodeCat(a);}
        op[2267] = getOpcodeRnm(323, 2302); // geometryPrefix
        op[2268] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2269] = getOpcodeRnm(288, 2122); // fullCollectionLiteral
        op[2270] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2272,2273,2274,2275}; op[2271] = getOpcodeCat(a);}
        op[2272] = getOpcodeRnm(323, 2302); // geometryPrefix
        op[2273] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2274] = getOpcodeRnm(292, 2146); // fullLineStringLiteral
        op[2275] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2277,2278,2279,2280}; op[2276] = getOpcodeCat(a);}
        op[2277] = getOpcodeRnm(323, 2302); // geometryPrefix
        op[2278] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2279] = getOpcodeRnm(296, 2165); // fullMultiLineStringLiteral
        op[2280] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2282,2283,2284,2285}; op[2281] = getOpcodeCat(a);}
        op[2282] = getOpcodeRnm(323, 2302); // geometryPrefix
        op[2283] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2284] = getOpcodeRnm(299, 2183); // fullMultiPointLiteral
        op[2285] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2287,2288,2289,2290}; op[2286] = getOpcodeCat(a);}
        op[2287] = getOpcodeRnm(323, 2302); // geometryPrefix
        op[2288] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2289] = getOpcodeRnm(302, 2201); // fullMultiPolygonLiteral
        op[2290] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2292,2293,2294,2295}; op[2291] = getOpcodeCat(a);}
        op[2292] = getOpcodeRnm(323, 2302); // geometryPrefix
        op[2293] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2294] = getOpcodeRnm(305, 2219); // fullPointLiteral
        op[2295] = getOpcodeRnm(334, 2336); // SQUOTE
        {int[] a = {2297,2298,2299,2300}; op[2296] = getOpcodeCat(a);}
        op[2297] = getOpcodeRnm(323, 2302); // geometryPrefix
        op[2298] = getOpcodeRnm(334, 2336); // SQUOTE
        op[2299] = getOpcodeRnm(311, 2244); // fullPolygonLiteral
        op[2300] = getOpcodeRnm(334, 2336); // SQUOTE
        {char[] a = {103,101,111,103,114,97,112,104,121}; op[2301] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,121}; op[2302] = getOpcodeTls(a);}
        op[2303] = getOpcodeRep((char)0, Character.MAX_VALUE, 2304);
        {int[] a = {2305,2306,2307,2308}; op[2304] = getOpcodeAlt(a);}
        op[2305] = getOpcodeRnm(366, 2665); // SP
        op[2306] = getOpcodeRnm(367, 2666); // HTAB
        {char[] a = {37,50,48}; op[2307] = getOpcodeTls(a);}
        {char[] a = {37,48,57}; op[2308] = getOpcodeTls(a);}
        op[2309] = getOpcodeRep((char)1, Character.MAX_VALUE, 2310);
        {int[] a = {2311,2312,2313,2314}; op[2310] = getOpcodeAlt(a);}
        op[2311] = getOpcodeRnm(366, 2665); // SP
        op[2312] = getOpcodeRnm(367, 2666); // HTAB
        {char[] a = {37,50,48}; op[2313] = getOpcodeTls(a);}
        {char[] a = {37,48,57}; op[2314] = getOpcodeTls(a);}
        op[2315] = getOpcodeRnm(324, 2303); // OWS
        {int[] a = {2317,2318}; op[2316] = getOpcodeAlt(a);}
        {char[] a = {64}; op[2317] = getOpcodeTls(a);}
        {char[] a = {37,52,48}; op[2318] = getOpcodeTls(a);}
        {int[] a = {2320,2321}; op[2319] = getOpcodeAlt(a);}
        {char[] a = {58}; op[2320] = getOpcodeTls(a);}
        {char[] a = {37,51,65}; op[2321] = getOpcodeTls(a);}
        {int[] a = {2323,2324}; op[2322] = getOpcodeAlt(a);}
        {char[] a = {44}; op[2323] = getOpcodeTls(a);}
        {char[] a = {37,50,67}; op[2324] = getOpcodeTls(a);}
        {char[] a = {61}; op[2325] = getOpcodeTls(a);}
        {int[] a = {2327,2328,2329}; op[2326] = getOpcodeAlt(a);}
        {char[] a = {43}; op[2327] = getOpcodeTls(a);}
        {char[] a = {37,50,66}; op[2328] = getOpcodeTls(a);}
        {char[] a = {45}; op[2329] = getOpcodeTls(a);}
        {int[] a = {2331,2332}; op[2330] = getOpcodeAlt(a);}
        {char[] a = {59}; op[2331] = getOpcodeTls(a);}
        {char[] a = {37,51,66}; op[2332] = getOpcodeTls(a);}
        {int[] a = {2334,2335}; op[2333] = getOpcodeAlt(a);}
        {char[] a = {42}; op[2334] = getOpcodeTls(a);}
        {char[] a = {37,50,65}; op[2335] = getOpcodeTls(a);}
        {int[] a = {2337,2338}; op[2336] = getOpcodeAlt(a);}
        {char[] a = {39}; op[2337] = getOpcodeTls(a);}
        {char[] a = {37,50,55}; op[2338] = getOpcodeTls(a);}
        {int[] a = {2340,2341}; op[2339] = getOpcodeAlt(a);}
        {char[] a = {40}; op[2340] = getOpcodeTls(a);}
        {char[] a = {37,50,56}; op[2341] = getOpcodeTls(a);}
        {int[] a = {2343,2344}; op[2342] = getOpcodeAlt(a);}
        {char[] a = {41}; op[2343] = getOpcodeTls(a);}
        {char[] a = {37,50,57}; op[2344] = getOpcodeTls(a);}
        {int[] a = {2346,2347,2348}; op[2345] = getOpcodeAlt(a);}
        op[2346] = getOpcodeRnm(339, 2351); // IP-literal
        op[2347] = getOpcodeRnm(344, 2467); // IPv4address
        op[2348] = getOpcodeRnm(346, 2491); // reg-name
        op[2349] = getOpcodeRep((char)0, Character.MAX_VALUE, 2350);
        op[2350] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {2352,2353,2356}; op[2351] = getOpcodeCat(a);}
        {char[] a = {91}; op[2352] = getOpcodeTls(a);}
        {int[] a = {2354,2355}; op[2353] = getOpcodeAlt(a);}
        op[2354] = getOpcodeRnm(341, 2367); // IPv6address
        op[2355] = getOpcodeRnm(340, 2357); // IPvFuture
        {char[] a = {93}; op[2356] = getOpcodeTls(a);}
        {int[] a = {2358,2359,2361,2362}; op[2357] = getOpcodeCat(a);}
        {char[] a = {118}; op[2358] = getOpcodeTls(a);}
        op[2359] = getOpcodeRep((char)1, Character.MAX_VALUE, 2360);
        op[2360] = getOpcodeRnm(363, 2654); // HEXDIG
        {char[] a = {46}; op[2361] = getOpcodeTls(a);}
        op[2362] = getOpcodeRep((char)1, Character.MAX_VALUE, 2363);
        {int[] a = {2364,2365,2366}; op[2363] = getOpcodeAlt(a);}
        op[2364] = getOpcodeRnm(350, 2508); // unreserved
        op[2365] = getOpcodeRnm(351, 2515); // sub-delims
        {char[] a = {58}; op[2366] = getOpcodeTls(a);}
        {int[] a = {2368,2374,2381,2390,2404,2418,2430,2440,2450}; op[2367] = getOpcodeAlt(a);}
        {int[] a = {2369,2373}; op[2368] = getOpcodeCat(a);}
        op[2369] = getOpcodeRep((char)6, (char)6, 2370);
        {int[] a = {2371,2372}; op[2370] = getOpcodeCat(a);}
        op[2371] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58}; op[2372] = getOpcodeTls(a);}
        op[2373] = getOpcodeRnm(343, 2461); // ls32
        {int[] a = {2375,2376,2380}; op[2374] = getOpcodeCat(a);}
        {char[] a = {58,58}; op[2375] = getOpcodeTls(a);}
        op[2376] = getOpcodeRep((char)5, (char)5, 2377);
        {int[] a = {2378,2379}; op[2377] = getOpcodeCat(a);}
        op[2378] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58}; op[2379] = getOpcodeTls(a);}
        op[2380] = getOpcodeRnm(343, 2461); // ls32
        {int[] a = {2382,2384,2385,2389}; op[2381] = getOpcodeCat(a);}
        op[2382] = getOpcodeRep((char)0, (char)1, 2383);
        op[2383] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58,58}; op[2384] = getOpcodeTls(a);}
        op[2385] = getOpcodeRep((char)4, (char)4, 2386);
        {int[] a = {2387,2388}; op[2386] = getOpcodeCat(a);}
        op[2387] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58}; op[2388] = getOpcodeTls(a);}
        op[2389] = getOpcodeRnm(343, 2461); // ls32
        {int[] a = {2391,2398,2399,2403}; op[2390] = getOpcodeCat(a);}
        op[2391] = getOpcodeRep((char)0, (char)1, 2392);
        {int[] a = {2393,2397}; op[2392] = getOpcodeCat(a);}
        op[2393] = getOpcodeRep((char)0, (char)1, 2394);
        {int[] a = {2395,2396}; op[2394] = getOpcodeCat(a);}
        op[2395] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58}; op[2396] = getOpcodeTls(a);}
        op[2397] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58,58}; op[2398] = getOpcodeTls(a);}
        op[2399] = getOpcodeRep((char)3, (char)3, 2400);
        {int[] a = {2401,2402}; op[2400] = getOpcodeCat(a);}
        op[2401] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58}; op[2402] = getOpcodeTls(a);}
        op[2403] = getOpcodeRnm(343, 2461); // ls32
        {int[] a = {2405,2412,2413,2417}; op[2404] = getOpcodeCat(a);}
        op[2405] = getOpcodeRep((char)0, (char)1, 2406);
        {int[] a = {2407,2411}; op[2406] = getOpcodeCat(a);}
        op[2407] = getOpcodeRep((char)0, (char)2, 2408);
        {int[] a = {2409,2410}; op[2408] = getOpcodeCat(a);}
        op[2409] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58}; op[2410] = getOpcodeTls(a);}
        op[2411] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58,58}; op[2412] = getOpcodeTls(a);}
        op[2413] = getOpcodeRep((char)2, (char)2, 2414);
        {int[] a = {2415,2416}; op[2414] = getOpcodeCat(a);}
        op[2415] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58}; op[2416] = getOpcodeTls(a);}
        op[2417] = getOpcodeRnm(343, 2461); // ls32
        {int[] a = {2419,2426,2427,2428,2429}; op[2418] = getOpcodeCat(a);}
        op[2419] = getOpcodeRep((char)0, (char)1, 2420);
        {int[] a = {2421,2425}; op[2420] = getOpcodeCat(a);}
        op[2421] = getOpcodeRep((char)0, (char)3, 2422);
        {int[] a = {2423,2424}; op[2422] = getOpcodeCat(a);}
        op[2423] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58}; op[2424] = getOpcodeTls(a);}
        op[2425] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58,58}; op[2426] = getOpcodeTls(a);}
        op[2427] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58}; op[2428] = getOpcodeTls(a);}
        op[2429] = getOpcodeRnm(343, 2461); // ls32
        {int[] a = {2431,2438,2439}; op[2430] = getOpcodeCat(a);}
        op[2431] = getOpcodeRep((char)0, (char)1, 2432);
        {int[] a = {2433,2437}; op[2432] = getOpcodeCat(a);}
        op[2433] = getOpcodeRep((char)0, (char)4, 2434);
        {int[] a = {2435,2436}; op[2434] = getOpcodeCat(a);}
        op[2435] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58}; op[2436] = getOpcodeTls(a);}
        op[2437] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58,58}; op[2438] = getOpcodeTls(a);}
        op[2439] = getOpcodeRnm(343, 2461); // ls32
        {int[] a = {2441,2448,2449}; op[2440] = getOpcodeCat(a);}
        op[2441] = getOpcodeRep((char)0, (char)1, 2442);
        {int[] a = {2443,2447}; op[2442] = getOpcodeCat(a);}
        op[2443] = getOpcodeRep((char)0, (char)5, 2444);
        {int[] a = {2445,2446}; op[2444] = getOpcodeCat(a);}
        op[2445] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58}; op[2446] = getOpcodeTls(a);}
        op[2447] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58,58}; op[2448] = getOpcodeTls(a);}
        op[2449] = getOpcodeRnm(342, 2459); // h16
        {int[] a = {2451,2458}; op[2450] = getOpcodeCat(a);}
        op[2451] = getOpcodeRep((char)0, (char)1, 2452);
        {int[] a = {2453,2457}; op[2452] = getOpcodeCat(a);}
        op[2453] = getOpcodeRep((char)0, (char)6, 2454);
        {int[] a = {2455,2456}; op[2454] = getOpcodeCat(a);}
        op[2455] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58}; op[2456] = getOpcodeTls(a);}
        op[2457] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58,58}; op[2458] = getOpcodeTls(a);}
        op[2459] = getOpcodeRep((char)1, (char)4, 2460);
        op[2460] = getOpcodeRnm(363, 2654); // HEXDIG
        {int[] a = {2462,2466}; op[2461] = getOpcodeAlt(a);}
        {int[] a = {2463,2464,2465}; op[2462] = getOpcodeCat(a);}
        op[2463] = getOpcodeRnm(342, 2459); // h16
        {char[] a = {58}; op[2464] = getOpcodeTls(a);}
        op[2465] = getOpcodeRnm(342, 2459); // h16
        op[2466] = getOpcodeRnm(344, 2467); // IPv4address
        {int[] a = {2468,2469,2470,2471,2472,2473,2474}; op[2467] = getOpcodeCat(a);}
        op[2468] = getOpcodeRnm(345, 2475); // dec-octet
        {char[] a = {46}; op[2469] = getOpcodeTls(a);}
        op[2470] = getOpcodeRnm(345, 2475); // dec-octet
        {char[] a = {46}; op[2471] = getOpcodeTls(a);}
        op[2472] = getOpcodeRnm(345, 2475); // dec-octet
        {char[] a = {46}; op[2473] = getOpcodeTls(a);}
        op[2474] = getOpcodeRnm(345, 2475); // dec-octet
        {int[] a = {2476,2480,2484,2487,2490}; op[2475] = getOpcodeAlt(a);}
        {int[] a = {2477,2478}; op[2476] = getOpcodeCat(a);}
        {char[] a = {49}; op[2477] = getOpcodeTls(a);}
        op[2478] = getOpcodeRep((char)2, (char)2, 2479);
        op[2479] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {2481,2482,2483}; op[2480] = getOpcodeCat(a);}
        {char[] a = {50}; op[2481] = getOpcodeTls(a);}
        op[2482] = getOpcodeTrg((char)48, (char)52);
        op[2483] = getOpcodeRnm(362, 2653); // DIGIT
        {int[] a = {2485,2486}; op[2484] = getOpcodeCat(a);}
        {char[] a = {50,53}; op[2485] = getOpcodeTls(a);}
        op[2486] = getOpcodeTrg((char)48, (char)53);
        {int[] a = {2488,2489}; op[2487] = getOpcodeCat(a);}
        op[2488] = getOpcodeTrg((char)49, (char)57);
        op[2489] = getOpcodeRnm(362, 2653); // DIGIT
        op[2490] = getOpcodeRnm(362, 2653); // DIGIT
        op[2491] = getOpcodeRep((char)0, Character.MAX_VALUE, 2492);
        {int[] a = {2493,2494,2495}; op[2492] = getOpcodeAlt(a);}
        op[2493] = getOpcodeRnm(350, 2508); // unreserved
        op[2494] = getOpcodeRnm(349, 2504); // pct-encoded
        op[2495] = getOpcodeRnm(351, 2515); // sub-delims
        op[2496] = getOpcodeRep((char)1, Character.MAX_VALUE, 2497);
        op[2497] = getOpcodeRnm(348, 2498); // pchar
        {int[] a = {2499,2500,2501,2502,2503}; op[2498] = getOpcodeAlt(a);}
        op[2499] = getOpcodeRnm(350, 2508); // unreserved
        op[2500] = getOpcodeRnm(349, 2504); // pct-encoded
        op[2501] = getOpcodeRnm(351, 2515); // sub-delims
        {char[] a = {58}; op[2502] = getOpcodeTls(a);}
        {char[] a = {64}; op[2503] = getOpcodeTls(a);}
        {int[] a = {2505,2506,2507}; op[2504] = getOpcodeCat(a);}
        {char[] a = {37}; op[2505] = getOpcodeTls(a);}
        op[2506] = getOpcodeRnm(363, 2654); // HEXDIG
        op[2507] = getOpcodeRnm(363, 2654); // HEXDIG
        {int[] a = {2509,2510,2511,2512,2513,2514}; op[2508] = getOpcodeAlt(a);}
        op[2509] = getOpcodeRnm(361, 2650); // ALPHA
        op[2510] = getOpcodeRnm(362, 2653); // DIGIT
        {char[] a = {45}; op[2511] = getOpcodeTls(a);}
        {char[] a = {46}; op[2512] = getOpcodeTls(a);}
        {char[] a = {95}; op[2513] = getOpcodeTls(a);}
        {char[] a = {126}; op[2514] = getOpcodeTls(a);}
        {int[] a = {2516,2517,2518,2519,2520}; op[2515] = getOpcodeAlt(a);}
        {char[] a = {36}; op[2516] = getOpcodeTls(a);}
        {char[] a = {38}; op[2517] = getOpcodeTls(a);}
        {char[] a = {39}; op[2518] = getOpcodeTls(a);}
        {char[] a = {61}; op[2519] = getOpcodeTls(a);}
        op[2520] = getOpcodeRnm(352, 2521); // other-delims
        {int[] a = {2522,2523,2524,2525,2526,2527,2528}; op[2521] = getOpcodeAlt(a);}
        {char[] a = {33}; op[2522] = getOpcodeTls(a);}
        {char[] a = {40}; op[2523] = getOpcodeTls(a);}
        {char[] a = {41}; op[2524] = getOpcodeTls(a);}
        {char[] a = {42}; op[2525] = getOpcodeTls(a);}
        {char[] a = {43}; op[2526] = getOpcodeTls(a);}
        {char[] a = {44}; op[2527] = getOpcodeTls(a);}
        {char[] a = {59}; op[2528] = getOpcodeTls(a);}
        {int[] a = {2530,2531,2532,2533,2534,2535,2536,2537}; op[2529] = getOpcodeAlt(a);}
        op[2530] = getOpcodeRnm(350, 2508); // unreserved
        op[2531] = getOpcodeRnm(354, 2538); // pct-encoded-no-SQUOTE
        op[2532] = getOpcodeRnm(352, 2521); // other-delims
        {char[] a = {36}; op[2533] = getOpcodeTls(a);}
        {char[] a = {38}; op[2534] = getOpcodeTls(a);}
        {char[] a = {61}; op[2535] = getOpcodeTls(a);}
        {char[] a = {58}; op[2536] = getOpcodeTls(a);}
        {char[] a = {64}; op[2537] = getOpcodeTls(a);}
        {int[] a = {2539,2552}; op[2538] = getOpcodeAlt(a);}
        {int[] a = {2540,2541,2551}; op[2539] = getOpcodeCat(a);}
        {char[] a = {37}; op[2540] = getOpcodeTls(a);}
        {int[] a = {2542,2543,2544,2545,2546,2547,2548,2549,2550}; op[2541] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2542] = getOpcodeTls(a);}
        {char[] a = {49}; op[2543] = getOpcodeTls(a);}
        {char[] a = {51}; op[2544] = getOpcodeTls(a);}
        {char[] a = {52}; op[2545] = getOpcodeTls(a);}
        {char[] a = {53}; op[2546] = getOpcodeTls(a);}
        {char[] a = {54}; op[2547] = getOpcodeTls(a);}
        {char[] a = {56}; op[2548] = getOpcodeTls(a);}
        {char[] a = {57}; op[2549] = getOpcodeTls(a);}
        op[2550] = getOpcodeRnm(364, 2657); // A-to-F
        op[2551] = getOpcodeRnm(363, 2654); // HEXDIG
        {int[] a = {2553,2554,2555}; op[2552] = getOpcodeCat(a);}
        {char[] a = {37}; op[2553] = getOpcodeTls(a);}
        {char[] a = {50}; op[2554] = getOpcodeTls(a);}
        {int[] a = {2556,2557,2558,2559,2560,2561,2562,2563,2564,2565}; op[2555] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2556] = getOpcodeTls(a);}
        {char[] a = {49}; op[2557] = getOpcodeTls(a);}
        {char[] a = {50}; op[2558] = getOpcodeTls(a);}
        {char[] a = {51}; op[2559] = getOpcodeTls(a);}
        {char[] a = {52}; op[2560] = getOpcodeTls(a);}
        {char[] a = {53}; op[2561] = getOpcodeTls(a);}
        {char[] a = {54}; op[2562] = getOpcodeTls(a);}
        {char[] a = {56}; op[2563] = getOpcodeTls(a);}
        {char[] a = {57}; op[2564] = getOpcodeTls(a);}
        op[2565] = getOpcodeRnm(364, 2657); // A-to-F
        {int[] a = {2567,2568,2569,2570,2571,2572,2573,2574,2575,2576}; op[2566] = getOpcodeAlt(a);}
        op[2567] = getOpcodeRnm(350, 2508); // unreserved
        op[2568] = getOpcodeRnm(349, 2504); // pct-encoded
        op[2569] = getOpcodeRnm(352, 2521); // other-delims
        {char[] a = {58}; op[2570] = getOpcodeTls(a);}
        {char[] a = {64}; op[2571] = getOpcodeTls(a);}
        {char[] a = {47}; op[2572] = getOpcodeTls(a);}
        {char[] a = {63}; op[2573] = getOpcodeTls(a);}
        {char[] a = {36}; op[2574] = getOpcodeTls(a);}
        {char[] a = {39}; op[2575] = getOpcodeTls(a);}
        {char[] a = {61}; op[2576] = getOpcodeTls(a);}
        {int[] a = {2578,2579,2580,2581,2582,2583,2584,2585,2586}; op[2577] = getOpcodeAlt(a);}
        op[2578] = getOpcodeRnm(350, 2508); // unreserved
        op[2579] = getOpcodeRnm(349, 2504); // pct-encoded
        op[2580] = getOpcodeRnm(352, 2521); // other-delims
        {char[] a = {58}; op[2581] = getOpcodeTls(a);}
        {char[] a = {64}; op[2582] = getOpcodeTls(a);}
        {char[] a = {47}; op[2583] = getOpcodeTls(a);}
        {char[] a = {63}; op[2584] = getOpcodeTls(a);}
        {char[] a = {36}; op[2585] = getOpcodeTls(a);}
        {char[] a = {39}; op[2586] = getOpcodeTls(a);}
        {int[] a = {2588,2589,2590,2591,2592,2593,2594}; op[2587] = getOpcodeAlt(a);}
        op[2588] = getOpcodeRnm(350, 2508); // unreserved
        op[2589] = getOpcodeRnm(349, 2504); // pct-encoded
        op[2590] = getOpcodeRnm(352, 2521); // other-delims
        {char[] a = {58}; op[2591] = getOpcodeTls(a);}
        {char[] a = {47}; op[2592] = getOpcodeTls(a);}
        {char[] a = {63}; op[2593] = getOpcodeTls(a);}
        {char[] a = {39}; op[2594] = getOpcodeTls(a);}
        {int[] a = {2596,2597,2598,2599,2600,2601,2602,2603,2604,2605}; op[2595] = getOpcodeAlt(a);}
        op[2596] = getOpcodeRnm(350, 2508); // unreserved
        op[2597] = getOpcodeRnm(359, 2606); // pct-encoded-unescaped
        op[2598] = getOpcodeRnm(352, 2521); // other-delims
        {char[] a = {58}; op[2599] = getOpcodeTls(a);}
        {char[] a = {64}; op[2600] = getOpcodeTls(a);}
        {char[] a = {47}; op[2601] = getOpcodeTls(a);}
        {char[] a = {63}; op[2602] = getOpcodeTls(a);}
        {char[] a = {36}; op[2603] = getOpcodeTls(a);}
        {char[] a = {39}; op[2604] = getOpcodeTls(a);}
        {char[] a = {61}; op[2605] = getOpcodeTls(a);}
        {int[] a = {2607,2619,2633}; op[2606] = getOpcodeAlt(a);}
        {int[] a = {2608,2609,2618}; op[2607] = getOpcodeCat(a);}
        {char[] a = {37}; op[2608] = getOpcodeTls(a);}
        {int[] a = {2610,2611,2612,2613,2614,2615,2616,2617}; op[2609] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2610] = getOpcodeTls(a);}
        {char[] a = {49}; op[2611] = getOpcodeTls(a);}
        {char[] a = {51}; op[2612] = getOpcodeTls(a);}
        {char[] a = {52}; op[2613] = getOpcodeTls(a);}
        {char[] a = {54}; op[2614] = getOpcodeTls(a);}
        {char[] a = {56}; op[2615] = getOpcodeTls(a);}
        {char[] a = {57}; op[2616] = getOpcodeTls(a);}
        op[2617] = getOpcodeRnm(364, 2657); // A-to-F
        op[2618] = getOpcodeRnm(363, 2654); // HEXDIG
        {int[] a = {2620,2621,2622}; op[2619] = getOpcodeCat(a);}
        {char[] a = {37}; op[2620] = getOpcodeTls(a);}
        {char[] a = {50}; op[2621] = getOpcodeTls(a);}
        {int[] a = {2623,2624,2625,2626,2627,2628,2629,2630,2631,2632}; op[2622] = getOpcodeAlt(a);}
        {char[] a = {48}; op[2623] = getOpcodeTls(a);}
        {char[] a = {49}; op[2624] = getOpcodeTls(a);}
        {char[] a = {51}; op[2625] = getOpcodeTls(a);}
        {char[] a = {52}; op[2626] = getOpcodeTls(a);}
        {char[] a = {53}; op[2627] = getOpcodeTls(a);}
        {char[] a = {54}; op[2628] = getOpcodeTls(a);}
        {char[] a = {55}; op[2629] = getOpcodeTls(a);}
        {char[] a = {56}; op[2630] = getOpcodeTls(a);}
        {char[] a = {57}; op[2631] = getOpcodeTls(a);}
        op[2632] = getOpcodeRnm(364, 2657); // A-to-F
        {int[] a = {2634,2635,2636}; op[2633] = getOpcodeCat(a);}
        {char[] a = {37}; op[2634] = getOpcodeTls(a);}
        {char[] a = {53}; op[2635] = getOpcodeTls(a);}
        {int[] a = {2637,2638,2639,2640,2641,2642}; op[2636] = getOpcodeAlt(a);}
        op[2637] = getOpcodeRnm(362, 2653); // DIGIT
        {char[] a = {65}; op[2638] = getOpcodeTls(a);}
        {char[] a = {66}; op[2639] = getOpcodeTls(a);}
        {char[] a = {68}; op[2640] = getOpcodeTls(a);}
        {char[] a = {69}; op[2641] = getOpcodeTls(a);}
        {char[] a = {70}; op[2642] = getOpcodeTls(a);}
        {int[] a = {2644,2645}; op[2643] = getOpcodeAlt(a);}
        op[2644] = getOpcodeRnm(358, 2595); // qchar-unescaped
        {int[] a = {2646,2647}; op[2645] = getOpcodeCat(a);}
        op[2646] = getOpcodeRnm(195, 1621); // escape
        {int[] a = {2648,2649}; op[2647] = getOpcodeAlt(a);}
        op[2648] = getOpcodeRnm(195, 1621); // escape
        op[2649] = getOpcodeRnm(188, 1572); // quotation-mark
        {int[] a = {2651,2652}; op[2650] = getOpcodeAlt(a);}
        op[2651] = getOpcodeTrg((char)65, (char)90);
        op[2652] = getOpcodeTrg((char)97, (char)122);
        op[2653] = getOpcodeTrg((char)48, (char)57);
        {int[] a = {2655,2656}; op[2654] = getOpcodeAlt(a);}
        op[2655] = getOpcodeRnm(362, 2653); // DIGIT
        op[2656] = getOpcodeRnm(364, 2657); // A-to-F
        {int[] a = {2658,2659,2660,2661,2662,2663}; op[2657] = getOpcodeAlt(a);}
        {char[] a = {65}; op[2658] = getOpcodeTls(a);}
        {char[] a = {66}; op[2659] = getOpcodeTls(a);}
        {char[] a = {67}; op[2660] = getOpcodeTls(a);}
        {char[] a = {68}; op[2661] = getOpcodeTls(a);}
        {char[] a = {69}; op[2662] = getOpcodeTls(a);}
        {char[] a = {70}; op[2663] = getOpcodeTls(a);}
        {char[] a = {34}; op[2664] = getOpcodeTbs(a);}
        {char[] a = {32}; op[2665] = getOpcodeTbs(a);}
        {char[] a = {9}; op[2666] = getOpcodeTbs(a);}
        return op;
    }

    /** Displays the original SABNF grammar on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; grammar.GrammarUnderTest");
        out.println(";");
        out.println(";------------------------------------------------------------------------------");
        out.println("; odata-abnf-v4.0-wd01");
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
        out.println(";   - OData Core Part 1: Protocol");
        out.println(";   - OData Core Part 2: URL Conventions");
        out.println(";   - OData Core Part 3: Common Schema Defi  nition Language");
        out.println(";   - OData ABNF Construction Rules (this document)");
        out.println(";");
        out.println("; Related work:");
        out.println(";   This work product is related to the following two Work Products, each of ");
        out.println(";   which define alternate formats for OData payloads");
        out.println(";   - OData JSON Format");
        out.println(";   - OData ATOM Format");
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
        out.println(";   3. Metadata URL Fragments");
        out.println(";   4. Expressions");
        out.println(";   5. JSON format for function parameters");
        out.println(";   6. Names and identifiers");
        out.println(";   7. Literal Data Values");
        out.println(";   8. Punctuation");
        out.println(";");
        out.println(";   A. URI syntax [RFC3986]");
        out.println(";   B. ABNF core definitions [RFC5234]");
        out.println(";   C. UTF-8 syntax [RFC3629]");
        out.println(";");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("odataUri = ( \"https\" / \"http\" ) \"://\" host [ \":\" port ] ");
        out.println("           serviceRoot");
        out.println("           [ '$metadata' [ metadataFragment ]");
        out.println("           / '$batch' ");
        out.println("           / odataRelativeUri ]  ");
        out.println("           [ [ namespace \".\" entityContainer ] \"?\" search ]  ");
        out.println("");
        out.println("serviceRoot = \"/\" *( segment-nz \"/\" )");
        out.println("");
        out.println("odataRelativeUri = resourcePath [ \"?\" queryOptions ]");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 1. Resource Path");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("resourcePath = [ containerQualifier ] entitySetName [ collectionNavigation ] ");
        out.println("             / [ containerQualifier ] namedEntity   [ singleNavigation ]");
        out.println("             / actionImportCall ");
        out.println("             / entityColFunctionImportCall    [ collectionNavigation ] ");
        out.println("             / entityFunctionImportCall       [ singleNavigation ] ");
        out.println("             / complexColFunctionImportCall   [ collectionPath ] ");
        out.println("             / complexFunctionImportCall      [ complexPath ] ");
        out.println("             / primitiveColFunctionImportCall [ collectionPath ] ");
        out.println("             / primitiveFunctionImportCall    [ singlePath ] ");
        out.println("");
        out.println("collectionNavigation = [ \"/\" qualifiedEntityTypeName ]");
        out.println("                       ( keyPredicate [ singleNavigation ]");
        out.println("                       / collectionPath");
        out.println("                       / ref");
        out.println("                       / \"\"     ; for restricting to a derived entity type");
        out.println("                       )");
        out.println("");
        out.println("keyPredicate     = simpleKey / compoundKey");
        out.println("simpleKey        = OPEN keyPropertyValue CLOSE");
        out.println("compoundKey      = OPEN keyValuePair *( COMMA keyValuePair ) CLOSE");
        out.println("keyValuePair     = primitiveKeyProperty EQ keyPropertyValue");
        out.println("keyPropertyValue = primitiveLiteral");
        out.println("");
        out.println("singleNavigation = [ \"/\" qualifiedEntityTypeName ] ");
        out.println("                   ( \"/\" propertyPath");
        out.println("                   / boundOperation");
        out.println("                   / ref ");
        out.println("                   / value  ; request the media resource of a media entity ");
        out.println("                   / \"\"     ; type cast after key access");
        out.println("                   )");
        out.println("");
        out.println("propertyPath = entityColNavigationProperty [ collectionNavigation ]");
        out.println("             / entityNavigationProperty    [ singleNavigation ]");
        out.println("             / complexColProperty          [ collectionPath ]");
        out.println("             / complexProperty             [ complexPath ]");
        out.println("             / primitiveColProperty        [ collectionPath ]");
        out.println("             / primitiveProperty           [ singlePath ]");
        out.println("             / streamProperty ");
        out.println("");
        out.println("collectionPath = count / boundOperation");
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
        out.println("boundOperation = \"/\" ( boundActionCall");
        out.println("                     / boundEntityColFuncCall    [ collectionNavigation ] ");
        out.println("                     / boundEntityFuncCall       [ singleNavigation ] ");
        out.println("                     / boundComplexColFuncCall   [ collectionPath ] ");
        out.println("                     / boundComplexFuncCall      [ complexPath ]");
        out.println("                     / boundPrimitiveColFuncCall [ collectionPath ] ");
        out.println("                     / boundPrimitiveFuncCall    [ singlePath ] ");
        out.println("                     )");
        out.println("");
        out.println("actionImportCall = [ containerQualifier ] actionImport [ \"()\" ]");
        out.println("boundActionCall  = namespace \".\" action [ \"()\" ]");
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
        out.println("entityFunctionImportCall       = [ containerQualifier ] entityFunctionImport       [ functionParameters ]");
        out.println("entityColFunctionImportCall    = [ containerQualifier ] entityColFunctionImport    [ functionParameters ]");
        out.println("complexFunctionImportCall      = [ containerQualifier ] complexFunctionImport      [ functionParameters ]");
        out.println("complexColFunctionImportCall   = [ containerQualifier ] complexColFunctionImport   [ functionParameters ]");
        out.println("primitiveFunctionImportCall    = [ containerQualifier ] primitiveFunctionImport    [ functionParameters ]");
        out.println("primitiveColFunctionImportCall = [ containerQualifier ] primitiveColFunctionImport [ functionParameters ]");
        out.println("");
        out.println("functionParameters = OPEN [ functionParameter *( COMMA functionParameter ) ] CLOSE");
        out.println("functionParameter  = parameterName EQ ( parameterAlias / primitiveLiteral )");
        out.println("parameterName      = odataIdentifier");
        out.println("parameterAlias     = AT odataIdentifier");
        out.println("");
        out.println("containerQualifier = namespace \".\" entityContainer \".\"");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 2. Query Options");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("queryOptions = queryOption *( \"&\" queryOption )        ");
        out.println("queryOption  = systemQueryOption  ");
        out.println("             / aliasAndValue ");
        out.println("             / parameterNameAndValue");
        out.println("             / customQueryOption  ");
        out.println("");
        out.println("systemQueryOption = apply");
        out.println("                  / expand ");
        out.println("                  / filter ");
        out.println("                  / format ");
        out.println("                  / orderby ");
        out.println("                  / skip ");
        out.println("                  / top ");
        out.println("                  / inlinecount ");
        out.println("                  / search");
        out.println("                  / select ");
        out.println("                  / skiptoken");
        out.println("");
        out.println("apply      = '$apply' EQ applyExpr");
        out.println("applyExpr  = applyTrafo *( \"/\" applyTrafo )");
        out.println("applyTrafo = aggregateTrafo");
        out.println("           / bottomcountTrafo");
        out.println("           / bottompercentTrafo");
        out.println("           / bottomsumTrafo");
        out.println("           / combineTrafo");
        out.println("           / expandTrafo");
        out.println("           / filterTrafo");
        out.println("           / groupbyTrafo");
        out.println("           / identityTrafo");
        out.println("           / topcountTrafo");
        out.println("           / toppercentTrafo");
        out.println("           / topsumTrafo");
        out.println("");
        out.println("aggregateTrafo      = 'aggregate' OPEN [ BWS aggregateParam *( BWS COMMA BWS aggregateParam ) ] BWS CLOSE");
        out.println("aggregateParam      = ( '$count' / evalExpr / countOrPropertyWithPath )");
        out.println("                      [ RWS 'with' RWS aggregationFunction ]");
        out.println("                      *( RWS 'from' RWS propertyWithPath [ RWS 'with' RWS aggregationFunction ] )");
        out.println("                      [ RWS 'as'   RWS odataIdentifier ]");
        out.println("evalExpr            = 'eval' OPEN BWS commonExpr [ BWS COMMA BWS navigationPropertyWithPath ] BWS CLOSE");
        out.println("aggregationFunction = 'sum' ");
        out.println("                    / 'min' ");
        out.println("                    / 'max' ");
        out.println("                    / 'average' ");
        out.println("                    / 'countdistinct' ");
        out.println("                    / namespace \".\" odataIdentifier");
        out.println("                    ");
        out.println("bottomcountTrafo   = 'bottomcount'   OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("bottompercentTrafo = 'bottompercent' OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("bottomsumTrafo     = 'bottomsum'     OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("");
        out.println("combineTrafo = 'combine' OPEN BWS applyExpr 1*( BWS COMMA BWS applyExpr ) BWS CLOSE");
        out.println("expandTrafo  = 'expand' OPEN BWS navigationPropertyWithPath BWS COMMA BWS boolCommonExpr BWS CLOSE");
        out.println("");
        out.println("filterTrafo  = 'filter' OPEN BWS boolCommonExpr BWS CLOSE");
        out.println("");
        out.println("groupbyTrafo   = 'groupby' OPEN BWS groupbyList BWS COMMA BWS applyExpr BWS CLOSE");
        out.println("groupbyList    = OPEN BWS groupbyElement *( BWS COMMA BWS groupbyElement ) BWS CLOSE");
        out.println("groupbyElement = propertyWithPath / rollupSpec");
        out.println("rollupSpec     = 'rollup' OPEN BWS ");
        out.println("                  ( '$all' / propertyWithPath ) ");
        out.println("                  1*( BWS COMMA BWS propertyWithPath ) ");
        out.println("                  BWS CLOSE");
        out.println("");
        out.println("identityTrafo = 'identity'");
        out.println("");
        out.println("topcountTrafo   = 'topcount'   OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("toppercentTrafo = 'toppercent' OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("topsumTrafo     = 'topsum'     OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("");
        out.println("countOrPropertyWithPath    = *( ( complexProperty / navigationProperty ) \"/\" ) ( navigationProperty / property / '$count' )");
        out.println("propertyWithPath           = *( ( complexProperty / navigationProperty ) \"/\" ) ( navigationProperty / property )");
        out.println("navigationPropertyWithPath = *( ( complexProperty / navigationProperty ) \"/\" )   navigationProperty");
        out.println("");
        out.println("expand          = '$expand' EQ expandItem *( COMMA expandItem )");
        out.println("expandItem      = [ qualifiedEntityTypeName \"/\" ] ");
        out.println("                  *( ( complexProperty / complexColProperty ) \"/\" [ qualifiedComplexTypeName \"/\" ] )");
        out.println("                  navigationProperty ");
        out.println("                  [ \"/\" qualifiedEntityTypeName ]");
        out.println("                  [ OPEN expandOption *( SEMI expandOption ) CLOSE ]");
        out.println("                  [ ref / count ] ; TODO: move before expandOptions");
        out.println("expandRefOption = filter");
        out.println("                / orderby");
        out.println("                / search");
        out.println("                / skip ");
        out.println("                / top ");
        out.println("                / inlinecount");
        out.println("expandOption    = expandRefOption");
        out.println("                / select ");
        out.println("                / expand");
        out.println("                / levels");
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
        out.println("         ( 'atom'");
        out.println("         / 'json' ");
        out.println("         / 'xml'");
        out.println("         / 1*( pchar / \"/\" ) ; <a data service specific value indicating a");
        out.println("         )                   ; format specific to the specific data service> or");
        out.println("                             ; <An IANA-defined [IANA-MMT] content type>");
        out.println("                          ");
        out.println("; TODO: replace just with '$count'                          ");
        out.println("inlinecount = '$inlinecount' EQ ( 'allpages' / 'none' )");
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
        out.println("searchWord   = 1*ALPHA ; TODO: any character from the Unicode categories L or Nl, ");
        out.println("                       ;       but not the words AND, OR, and NOT");
        out.println("");
        out.println("select     = '$select' EQ selectItem *( COMMA selectItem )");
        out.println("selectItem = STAR  ");
        out.println("           / allOperationsInSchema ");
        out.println("           / [ qualifiedEntityTypeName \"/\" ] ");
        out.println("             ( *( ( complexProperty / complexColProperty ) \"/\" [ qualifiedComplexTypeName \"/\" ] )");
        out.println("               ( property / navigationProperty ) ");
        out.println("             / qualifiedActionName  ");
        out.println("             / qualifiedFunctionName  ");
        out.println("             )");
        out.println("allOperationsInSchema = namespace \".\" STAR                 ");
        out.println("");
        out.println("; The parameterTypeNames are required to uniquely identify the action or function");
        out.println("; only if it has overloads.");
        out.println("qualifiedActionName   = namespace \".\" action   [ OPEN parameterNamesAndTypes CLOSE ]");
        out.println("qualifiedFunctionName = namespace \".\" function [ OPEN parameterNamesAndTypes CLOSE ]");
        out.println("");
        out.println("; The names of all parameters, suffixed with a colon and the parameter type ");
        out.println("parameterNamesAndTypes = parameterNameAndType *( COMMA parameterNameAndType )");
        out.println("parameterNameAndType   = parameterName \":\" qualifiedTypeName ");
        out.println("");
        out.println("skiptoken = '$skiptoken' EQ 1*( qchar-no-AMP )");
        out.println("");
        out.println("aliasAndValue         = parameterAlias EQ parameterValue");
        out.println("parameterNameAndValue = parameterName  EQ parameterValue");
        out.println("");
        out.println("parameterValue = complexInUri  ");
        out.println("               / complexColInUri");
        out.println("               / entityReference");
        out.println("               / entityRefColInUri");
        out.println("               / primitiveLiteral");
        out.println("               / primitiveColInUri");
        out.println("               ");
        out.println("entityReference = 'KEY' OPEN ");
        out.println("                  [ entityContainer \".\" ] entitySetName keyPredicate");
        out.println("                  [ \"/\" qualifiedEntityTypeName ]");
        out.println("                  CLOSE                ");
        out.println("");
        out.println("customQueryOption = customName [ EQ customValue ]");
        out.println("customName        = qchar-no-AMP-EQ-AT-DOLLAR *( qchar-no-AMP-EQ ) ");
        out.println("customValue       = *( qchar-no-AMP )");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 3. Metadata URL Fragments");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("; TODO: Set/$ref and Set/$ref/@Element");
        out.println("metadataFragment = \"#\" ");
        out.println("                   ( 'Edm.Null'");
        out.println("                   / qualifiedTypeName");
        out.println("                   / entitySetName [ \"/\" qualifiedEntityTypeName ] ");
        out.println("                     [ '/@Delta'");
        out.println("                     / [ '/@Element' ] [ \"&\" select ]");
        out.println("                     ]");
        out.println("                   )");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 4. Expressions");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("; TODO: is a boolCommonExpr also a commonExpr? To e.g. sort by Boolean?");
        out.println("commonExpr = ( primitiveLiteral");
        out.println("             / parameterAlias");
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
        out.println("; TODO: this may be too generous: did we intend to allow arbitrary member expressions as function parameters?");
        out.println("firstMemberExpr = [ lambdaPredicatePrefixExpr ]  ; only allowed inside a lambdaPredicateExpr");
        out.println("                  memberExpr");
        out.println("");
        out.println("memberExpr = [ qualifiedEntityTypeName \"/\" ]");
        out.println("             ( propertyPathExpr");
        out.println("             / boundFunctionExpr ");
        out.println("             )");
        out.println("             ");
        out.println("propertyPathExpr = ( entityColNavigationProperty [ collectionNavigationExpr ] ");
        out.println("                 / entityNavigationProperty    [ singleNavigationExpr ] ");
        out.println("                 / complexColProperty          [ collectionPathExpr ]");
        out.println("                 / complexProperty             [ complexPathExpr ] ");
        out.println("                 / primitiveColProperty        [ collectionPathExpr ]");
        out.println("                 / primitiveProperty           [ singlePathExpr ]");
        out.println("                 / streamProperty              ; TODO: do we allow bindable functions that take an Edm.Stream as input?");
        out.println("                 )");
        out.println("                   ");
        out.println("lambdaPredicatePrefixExpr = inscopeVariableExpr \"/\"");
        out.println("inscopeVariableExpr       = implicitVariableExpr / lambdaVariableExpr");
        out.println("implicitVariableExpr      = \"$it\" ; references the unnamed outer variable of the query");
        out.println("lambdaVariableExpr        = odataIdentifier");
        out.println("");
        out.println("collectionNavigationExpr = count");
        out.println("                         / \"/\" [ qualifiedEntityTypeName \"/\" ] ");
        out.println("                           ( boundFunctionExpr ");
        out.println("                           / anyExpr");
        out.println("                           / allExpr ");
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
        out.println("functionExprParameter  = parameterName EQ ( parameterValue / parameterAlias / firstMemberExpr )");
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
        out.println("               / searchMethodCallExpr");
        out.println("");
        out.println("boolMethodCallExpr = endsWithMethodCallExpr ");
        out.println("                   / startsWithMethodCallExpr ");
        out.println("                   / substringOfMethodCallExpr                                          ");
        out.println("                   / intersectsMethodCallExpr ");
        out.println("");
        out.println("substringOfMethodCallExpr = 'substringof' OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("startsWithMethodCallExpr  = 'startswith'  OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("endsWithMethodCallExpr    = 'endswith'    OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("lengthMethodCallExpr      = 'length'      OPEN BWS commonExpr BWS CLOSE");
        out.println("indexOfMethodCallExpr     = 'indexof'     OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("substringMethodCallExpr   = 'substring'   OPEN BWS commonExpr BWS COMMA BWS commonExpr [ BWS COMMA BWS commonExpr BWS ] CLOSE");
        out.println("toLowerMethodCallExpr     = 'tolower'     OPEN BWS commonExpr BWS CLOSE");
        out.println("toUpperMethodCallExpr     = 'toupper'     OPEN BWS commonExpr BWS CLOSE");
        out.println("trimMethodCallExpr        = 'trim'        OPEN BWS commonExpr BWS CLOSE");
        out.println("concatMethodCallExpr      = 'concat'      OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
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
        out.println("searchMethodCallExpr = 'search' OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
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
        out.println("");
        out.println("complexColInUri = begin-array ");
        out.println("                  [ complexInUri *( value-separator complexInUri ) ] ");
        out.println("                  end-array");
        out.println("                  ");
        out.println("complexInUri = begin-object");
        out.println("               [ ( complexTypeMetadataInUri  ");
        out.println("                 / primitivePropertyInUri ");
        out.println("                 / complexPropertyInUri ");
        out.println("                 / collectionPropertyInUri  ");
        out.println("                 )");
        out.println("                 *( value-separator ");
        out.println("                    ( primitivePropertyInUri ");
        out.println("                    / complexPropertyInUri ");
        out.println("                    / collectionPropertyInUri  ");
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
        out.println("complexTypeMetadataInUri = typeNVPInUri");
        out.println("");
        out.println("typeNVPInUri = quotation-mark 'odata.type' quotation-mark");
        out.println("               name-separator");
        out.println("               quotation-mark qualifiedTypeName quotation-mark");
        out.println("");
        out.println("primitivePropertyInUri = quotation-mark primitiveProperty quotation-mark ");
        out.println("                         name-separator ");
        out.println("                         primitiveLiteralInJSON");
        out.println("");
        out.println("entityRefColInUri = begin-array");
        out.println("                    [ entityRefInJSON *( value-separator entityRefInJSON ) ]");
        out.println("                    end-array");
        out.println("entityRefInJSON   = quotation-mark entityReference quotation-mark                                        ");
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
        out.println("                  / qualifiedEnumerationTypeName");
        out.println("                  / primitiveTypeName ");
        out.println("                  / 'Collection' OPEN ");
        out.println("                    ( qualifiedEntityTypeName ");
        out.println("                    / qualifiedComplexTypeName");
        out.println("                    / qualifiedEnumerationTypeName ");
        out.println("                    / primitiveTypeName ");
        out.println("                    ) CLOSE");
        out.println("");
        out.println("qualifiedEntityTypeName      = namespace \".\" entityTypeName");
        out.println("qualifiedComplexTypeName     = namespace \".\" complexTypeName");
        out.println("qualifiedEnumerationTypeName = namespace \".\" enumerationTypeName");
        out.println("");
        out.println("; an alias is just a single-part namespace");
        out.println("namespace     = namespacePart *( \".\" namespacePart )");
        out.println("namespacePart = odataIdentifier");
        out.println("");
        out.println("entitySetName       = odataIdentifier");
        out.println("namedEntity         = odataIdentifier          ");
        out.println("entityTypeName      = odataIdentifier");
        out.println("complexTypeName     = odataIdentifier ");
        out.println("enumerationTypeName = odataIdentifier");
        out.println("enumerationMember   = odataIdentifier");
        out.println("");
        out.println("odataIdentifier             = identifierLeadingCharacter *127identifierCharacter");
        out.println("identifierLeadingCharacter  = ALPHA / \"_\"            ; TODO: Any character from the Unicode categories L or Nl");
        out.println("identifierCharacter         = ALPHA / DIGIT / \"_\"    ; TODO: Any character from the Unicode categories L, Nl, Nd, Mn, Mc, Pc or Cf");
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
        out.println("property = primitiveProperty  ");
        out.println("         / primitiveColProperty ");
        out.println("         / complexProperty ");
        out.println("         / complexColProperty ");
        out.println("         / streamProperty");
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
        out.println("entityContainer = odataIdentifier");
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
        out.println("                 / decimal ");
        out.println("                 / single ");
        out.println("                 / double ");
        out.println("                 / sbyte ");
        out.println("                 / byte ");
        out.println("                 / int16 ");
        out.println("                 / int32 ");
        out.println("                 / int64 ");
        out.println("                 / binary ");
        out.println("                 / date");
        out.println("                 / dateTimeOffset ");
        out.println("                 / duration");
        out.println("                 / guid ");
        out.println("                 / string ");
        out.println("                 / timeOfDay ");
        out.println("                 / boolean ");
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
        out.println("null = 'null' [ SQUOTE qualifiedTypeName SQUOTE ] ");
        out.println("       ; The optional qualifiedTypeName is used to specify what type this null value should be considered. ");
        out.println("       ; Knowing the type is useful for function overload resolution purposes ");
        out.println("                                                ");
        out.println("binary  = ( 'X' / \"binary\" ) SQUOTE binaryBody SQUOTE ; Note: 'X' is case sensitive, \"binary\" is not");
        out.println("binaryBody = *(2HEXDIG)");
        out.println("");
        out.println("boolean = ( \"true\" / \"1\" ) / ( \"false\" / \"0\" )");
        out.println("");
        out.println("decimal     = decimalBody [ \"m\" ]");
        out.println("decimalBody = [SIGN] 1*DIGIT [\".\" 1*DIGIT]");
        out.println("");
        out.println("double      = doubleBody [ \"d\" ] / nanInfinity");
        out.println("doubleBody  = decimalBody [ \"e\" [SIGN] 1*DIGIT ] ; TODO: restrict range");
        out.println("");
        out.println("single      = singleBody [ \"f\" ] / nanInfinity");
        out.println("singleBody  = decimalBody [ \"e\" [SIGN] 1*DIGIT ] ; TODO: restrict range");
        out.println("");
        out.println("nanInfinity = 'NaN' / '-INF' / 'INF'");
        out.println("");
        out.println("guid     = \"guid\" SQUOTE guidBody SQUOTE");
        out.println("guidBody = 8HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 12HEXDIG ");
        out.println("");
        out.println("byte  = 1*3DIGIT ; numbers in the range from 0 to 255");
        out.println("sbyte = [ sign ] 1*3DIGIT ; numbers in the range from -128 to 127");
        out.println("int16 = [ sign ] 1*5DIGIT ; numbers in the range from -32768 to 32767        ");
        out.println("int32 = [ sign ] 1*10DIGIT ; numbers in the range from -2147483648 to 2147483647");
        out.println("int64 = int64Body [ \"L\" ] ");
        out.println("int64Body = [ sign ] 1*19DIGIT ; numbers in the range from -9223372036854775808 to 9223372036854775807");
        out.println("");
        out.println("string           = SQUOTE *( SQUOTE-in-string / pchar-no-SQUOTE ) SQUOTE");
        out.println("SQUOTE-in-string = SQUOTE SQUOTE ; two quotes represent one within string literal");
        out.println("");
        out.println("date     = \"date\" SQUOTE dateBody SQUOTE");
        out.println("dateBody = year \"-\" month \"-\" day");
        out.println("");
        out.println("dateTimeOffset     = \"datetimeoffset\" SQUOTE dateTimeOffsetBody SQUOTE");
        out.println("dateTimeOffsetBody = year \"-\" month \"-\" day \"T\" hour \":\" minute [ \":\" second [ \".\" fractionalSeconds ] ] ( \"Z\" / sign hour \":\" minute )");
        out.println("");
        out.println("duration     = \"duration\" SQUOTE durationBody SQUOTE");
        out.println("durationBody = [ sign ] \"P\" [ 1*DIGIT \"D\" ] [ \"T\" [ 1*DIGIT \"H\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT [ \".\" 1*DIGIT ] \"S\" ] ]");
        out.println("     ; the above is an approximation of the rules for an xml dayTimeDuration.");
        out.println("     ; see the lexical representation for dayTimeDuration in http://www.w3.org/TR/xmlschema11-2#dayTimeDuration for more information");
        out.println("");
        out.println("timeOfDay     = \"timeofday\" SQUOTE timeOfDayBody SQUOTE ");
        out.println("timeOfDayBody = hour \":\" minute [ \":\" second [ \".\" fractionalSeconds ] ]");
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
        out.println("enum      = qualifiedEnumerationTypeName SQUOTE enumBody SQUOTE");
        out.println("enumBody  = enumValue *( COMMA enumValue )");
        out.println("enumValue = enumerationMember / int64Body");
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
        out.println("positionLiteral  = double SP double  ; longitude, then latitude");
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
        out.println("; 8. Punctuation");
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
        out.println(";URI           = scheme \":\" hier-part [ \"?\" query ] [ \"#\" fragment ]");
        out.println(";hier-part     = \"//\" authority path-abempty");
        out.println(";              / path-absolute");
        out.println(";              / path-rootless");
        out.println(";              / path-empty");
        out.println(";URI-reference = URI / relative-ref");
        out.println(";absolute-URI  = scheme \":\" hier-part [ \"?\" query ]");
        out.println(";relative-ref  = relative-part [ \"?\" query ] [ \"#\" fragment ]");
        out.println(";relative-part = \"//\" authority path-abempty");
        out.println(";              / path-absolute");
        out.println(";              / path-noscheme");
        out.println(";              / path-empty");
        out.println(";scheme        = ALPHA *( ALPHA / DIGIT / \"+\" / \"-\" / \".\" )");
        out.println(";authority     = [ userinfo \"@\" ] host [ \":\" port ]");
        out.println(";userinfo      = *( unreserved / pct-encoded / sub-delims / \":\" )");
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
        out.println(";path-abempty  = *( \"/\" segment )");
        out.println(";path-absolute = \"/\" [ segment-nz *( \"/\" segment ) ]");
        out.println(";path-noscheme = segment-nz-nc *( \"/\" segment )");
        out.println(";path-rootless = segment-nz *( \"/\" segment )");
        out.println(";path-empty    = \"\"");
        out.println(";segment       = *pchar");
        out.println("segment-nz    = 1*pchar");
        out.println(";segment-nz-nc = 1*( unreserved / pct-encoded / sub-delims / \"@\" ) ; non-zero-length segment without any colon \":\"");
        out.println("pchar         = unreserved / pct-encoded / sub-delims / \":\" / \"@\"");
        out.println(";query         = *( pchar / \"/\" / \"?\" )");
        out.println(";fragment      = *( pchar / \"/\" / \"?\" )");
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
        out.println("                     ");
        out.println("                      ");
        out.println(";------------------------------------------------------------------------------");
        out.println("; B. ABNF core definitions [RFC5234]");
        out.println(";------------------------------------------------------------------------------");
        out.println("ALPHA  = %x41-5A / %x61-7A ");
        out.println("DIGIT  = %x30-39 ");
        out.println("HEXDIG = DIGIT / A-to-F");
        out.println("A-to-F = \"A\" / \"B\" / \"C\" / \"D\" / \"E\" / \"F\" ");
        out.println("DQUOTE = %x22");
        out.println("SP     = %x20 ");
        out.println("HTAB   = %x09 ");
        out.println(";WSP    = SP / HTAB ");
        out.println(";LWSP = *(WSP / CRLF WSP) ");
        out.println(";VCHAR = %x21-7E ");
        out.println(";CHAR = %x01-7F");
        out.println(";LOCTET = %x00-FF ");
        out.println(";CR     = %x0D ");
        out.println(";LF     = %x0A ");
        out.println(";CRLF   = CR LF");
        out.println(";BIT = \"0\" / \"1\" ");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; C. UTF-8 syntax [RFC3629]");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println(";UTF8-octets = *( UTF8-char )");
        out.println(";UTF8-char   = UTF8-1 / UTF8-2 / UTF8-3 / UTF8-4");
        out.println(";UTF8-1      = %x00-7F");
        out.println(";UTF8-2      = %xC2-DF UTF8-tail");
        out.println(";UTF8-3      = %xE0 %xA0-BF UTF8-tail / %xE1-EC 2( UTF8-tail ) /");
        out.println(";              %xED %x80-9F UTF8-tail / %xEE-EF 2( UTF8-tail )");
        out.println(";UTF8-4      = %xF0 %x90-BF 2( UTF8-tail ) / %xF1-F3 3( UTF8-tail ) /");
        out.println(";              %xF4 %x80-8F 2( UTF8-tail )");
        out.println(";UTF8-tail   = %x80-BF");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; End of odata-abnf-v4.0-wd01");
        out.println(";------------------------------------------------------------------------------");
    }
}
