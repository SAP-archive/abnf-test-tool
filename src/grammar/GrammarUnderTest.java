package grammar;

import apg.Grammar;
import java.io.PrintStream;

public class GrammarUnderTest extends Grammar{

    // public API
    public static Grammar getInstance(){
        if(factoryInstance == null){
            factoryInstance = new GrammarUnderTest(getRules(), getUdts(), getOpcodes());
        }
        return factoryInstance;
    }

    // rule name enum
    public static int ruleCount = 111;
    public enum RuleNames{
        A_TO_F("A-to-F", 107, 707, 7),
        ADDEXPR("addExpr", 53, 376, 5),
        ALPHA("ALPHA", 104, 700, 3),
        ANDEXPR("andExpr", 44, 331, 5),
        BOOLCOMMONEXPR("boolCommonExpr", 29, 194, 1),
        BOOLEANVALUE("booleanValue", 71, 436, 3),
        BOOLFUNCTIONEXPR("boolFunctionExpr", 33, 237, 4),
        BWS("BWS", 85, 551, 6),
        CLOSE("CLOSE", 93, 577, 3),
        COLLECTIONNAVIGATION("collectionNavigation", 2, 15, 4),
        COLLECTIONPROPERTY("collectionProperty", 63, 414, 1),
        COMMA("COMMA", 86, 557, 3),
        COMMONEXPR("commonExpr", 30, 195, 29),
        COMPOUNDKEY("compoundKey", 5, 27, 8),
        CONTAINS("contains", 34, 241, 11),
        DATEVALUE("dateValue", 77, 487, 6),
        DAY("day", 80, 515, 14),
        DIGIT("DIGIT", 105, 703, 1),
        DIVEXPR("divExpr", 56, 391, 5),
        DQUOTE("DQUOTE", 108, 714, 1),
        ENDSWITH("endsWith", 35, 252, 11),
        ENTITYSET("entitySet", 60, 409, 1),
        EQ("EQ", 87, 560, 1),
        EQEXPR("eqExpr", 46, 341, 5),
        ESCAPE("escape", 83, 542, 3),
        EXPECT("expect", 13, 71, 8),
        EXPECTITEM("expectItem", 14, 79, 19),
        EXPECTOPTION("expectOption", 15, 98, 3),
        FILTER("filter", 17, 110, 4),
        FUNCTIONEXPR("functionExpr", 32, 230, 7),
        GEEXPR("geExpr", 51, 366, 5),
        GTEXPR("gtExpr", 50, 361, 5),
        GUIDVALUE("guidValue", 74, 462, 15),
        HEXDIG("HEXDIG", 106, 704, 3),
        HTAB("HTAB", 110, 716, 1),
        IDENTIFIER("identifier", 66, 417, 4),
        IDENTIFIERCHARACTER("identifierCharacter", 68, 424, 4),
        IDENTIFIERLEADINGCHARACTER("identifierLeadingCharacter", 67, 421, 3),
        INDEXOF("indexOf", 36, 263, 11),
        INEXPR("inExpr", 52, 371, 5),
        KEYPATHLITERAL("keyPathLiteral", 9, 44, 2),
        KEYPATHSEGMENTS("keyPathSegments", 8, 40, 4),
        KEYPREDICATE("keyPredicate", 3, 19, 4),
        KEYPROPERTY("keyProperty", 65, 416, 1),
        KEYPROPERTYVALUE("keyPropertyValue", 7, 39, 1),
        KEYVALUEPAIR("keyValuePair", 6, 35, 4),
        LEEXPR("leExpr", 49, 356, 5),
        LENGTH("length", 37, 274, 7),
        LEVELS("levels", 16, 101, 9),
        LISTEXPR("listExpr", 43, 319, 12),
        LTEXPR("ltExpr", 48, 351, 5),
        MODEXPR("modExpr", 57, 396, 5),
        MONTH("month", 79, 505, 10),
        MULEXPR("mulExpr", 55, 386, 5),
        NANINFINITY("nanInfinity", 73, 458, 4),
        NEEXPR("neExpr", 47, 346, 5),
        NEGATEEXPR("negateExpr", 58, 401, 4),
        NOTEXPR("notExpr", 59, 405, 4),
        NULLVALUE("nullValue", 70, 435, 1),
        NUMBERVALUE("numberValue", 72, 439, 19),
        ONETONINE("oneToNine", 81, 529, 10),
        OPEN("OPEN", 92, 574, 3),
        ORDERBY("orderby", 18, 114, 8),
        ORDERBYITEM("orderbyItem", 19, 122, 12),
        OREXPR("orExpr", 45, 336, 5),
        OTHER_DELIMS("other-delims", 98, 601, 10),
        PARENEXPR("parenExpr", 42, 313, 6),
        PCHAR("pchar", 94, 580, 6),
        PCHAR_NO_SQUOTE("pchar-no-SQUOTE", 99, 611, 7),
        PCT_ENCODED("pct-encoded", 95, 586, 4),
        PCT_ENCODED_NO_SQUOTE("pct-encoded-no-SQUOTE", 100, 618, 28),
        PCT_ENCODED_UNESCAPED("pct-encoded-unescaped", 103, 662, 38),
        PRIMITIVELITERAL("primitiveLiteral", 69, 428, 7),
        PROPERTY("property", 62, 411, 3),
        PROPERTYPATHEXPR("propertyPathExpr", 31, 224, 6),
        QCHAR_NO_AMP_DQUOTE("qchar-no-AMP-DQUOTE", 101, 646, 7),
        QCHAR_UNESCAPED("qchar-unescaped", 102, 653, 9),
        QUERYOPTION("queryOption", 12, 64, 7),
        QUERYOPTIONS("queryOptions", 11, 58, 6),
        QUOTATION_MARK("quotation-mark", 82, 539, 3),
        RELATIVEURL("relativeUrl", 0, 0, 6),
        RESOURCEPATH("resourcePath", 1, 6, 9),
        RWS("RWS", 84, 545, 6),
        SEARCH("search", 22, 144, 5),
        SEARCHANDEXPR("searchAndExpr", 25, 167, 7),
        SEARCHEXPR("searchExpr", 23, 149, 13),
        SEARCHOREXPR("searchOrExpr", 24, 162, 5),
        SEARCHPHRASE("searchPhrase", 27, 182, 5),
        SEARCHTERM("searchTerm", 26, 174, 8),
        SEARCHWORD("searchWord", 28, 187, 7),
        SEMI("SEMI", 89, 565, 3),
        SIGN("SIGN", 88, 561, 4),
        SIMPLEKEY("simpleKey", 4, 23, 4),
        SINGLENAVIGATION("singleNavigation", 10, 46, 12),
        SINGLEPROPERTY("singleProperty", 64, 415, 1),
        SINGLETONENTITY("singletonEntity", 61, 410, 1),
        SKIP("skip", 20, 134, 5),
        SP("SP", 109, 715, 1),
        SQUOTE("SQUOTE", 91, 571, 3),
        SQUOTE_IN_STRING("SQUOTE-in-string", 76, 484, 3),
        STAR("STAR", 90, 568, 3),
        STARTSWITH("startsWith", 38, 281, 11),
        STRINGVALUE("stringValue", 75, 477, 7),
        SUB_DELIMS("sub-delims", 97, 597, 4),
        SUBEXPR("subExpr", 54, 381, 5),
        TOLOWER("toLower", 39, 292, 7),
        TOP("top", 21, 139, 5),
        TOUPPER("toUpper", 40, 299, 7),
        TRIM("trim", 41, 306, 7),
        UNRESERVED("unreserved", 96, 590, 7),
        YEAR("year", 78, 493, 12);
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
        public  String ruleName(){return name;}
        public  int    ruleID(){return id;}
        private int    opcodeOffset(){return offset;}
        private int    opcodeCount(){return count;}
    }

    // UDT name enum
    public static int udtCount = 0;
    public enum UdtNames{
    }

    // private
    private static GrammarUnderTest factoryInstance = null;
    private GrammarUnderTest(Rule[] rules, Udt[] udts, Opcode[] opcodes){
        super(rules, udts, opcodes);
    }

    private static Rule[] getRules(){
    	Rule[] rules = new Rule[111];
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
    	Opcode[] op = new Opcode[717];
    	addOpcodes00(op);
        return op;
    }

    private static void addOpcodes00(Opcode[] op){
        {int[] a = {1,2}; op[0] = getOpcodeCat(a);}
        op[1] = getOpcodeRnm(1, 6); // resourcePath
        op[2] = getOpcodeRep((char)0, (char)1, 3);
        {int[] a = {4,5}; op[3] = getOpcodeCat(a);}
        {char[] a = {63}; op[4] = getOpcodeTls(a);}
        op[5] = getOpcodeRnm(11, 58); // queryOptions
        {int[] a = {7,11}; op[6] = getOpcodeAlt(a);}
        {int[] a = {8,9}; op[7] = getOpcodeCat(a);}
        op[8] = getOpcodeRnm(60, 409); // entitySet
        op[9] = getOpcodeRep((char)0, (char)1, 10);
        op[10] = getOpcodeRnm(2, 15); // collectionNavigation
        {int[] a = {12,13}; op[11] = getOpcodeCat(a);}
        op[12] = getOpcodeRnm(61, 410); // singletonEntity
        op[13] = getOpcodeRep((char)0, (char)1, 14);
        op[14] = getOpcodeRnm(10, 46); // singleNavigation
        {int[] a = {16,17}; op[15] = getOpcodeCat(a);}
        op[16] = getOpcodeRnm(3, 19); // keyPredicate
        op[17] = getOpcodeRep((char)0, (char)1, 18);
        op[18] = getOpcodeRnm(10, 46); // singleNavigation
        {int[] a = {20,21,22}; op[19] = getOpcodeAlt(a);}
        op[20] = getOpcodeRnm(4, 23); // simpleKey
        op[21] = getOpcodeRnm(5, 27); // compoundKey
        op[22] = getOpcodeRnm(8, 40); // keyPathSegments
        {int[] a = {24,25,26}; op[23] = getOpcodeCat(a);}
        op[24] = getOpcodeRnm(92, 574); // OPEN
        op[25] = getOpcodeRnm(7, 39); // keyPropertyValue
        op[26] = getOpcodeRnm(93, 577); // CLOSE
        {int[] a = {28,29,30,34}; op[27] = getOpcodeCat(a);}
        op[28] = getOpcodeRnm(92, 574); // OPEN
        op[29] = getOpcodeRnm(6, 35); // keyValuePair
        op[30] = getOpcodeRep((char)0, Character.MAX_VALUE, 31);
        {int[] a = {32,33}; op[31] = getOpcodeCat(a);}
        op[32] = getOpcodeRnm(86, 557); // COMMA
        op[33] = getOpcodeRnm(6, 35); // keyValuePair
        op[34] = getOpcodeRnm(93, 577); // CLOSE
        {int[] a = {36,37,38}; op[35] = getOpcodeCat(a);}
        op[36] = getOpcodeRnm(65, 416); // keyProperty
        op[37] = getOpcodeRnm(87, 560); // EQ
        op[38] = getOpcodeRnm(7, 39); // keyPropertyValue
        op[39] = getOpcodeRnm(69, 428); // primitiveLiteral
        op[40] = getOpcodeRep((char)1, Character.MAX_VALUE, 41);
        {int[] a = {42,43}; op[41] = getOpcodeCat(a);}
        {char[] a = {47}; op[42] = getOpcodeTls(a);}
        op[43] = getOpcodeRnm(9, 44); // keyPathLiteral
        op[44] = getOpcodeRep((char)0, Character.MAX_VALUE, 45);
        op[45] = getOpcodeRnm(94, 580); // pchar
        op[46] = getOpcodeRep((char)0, (char)1, 47);
        {int[] a = {48,53}; op[47] = getOpcodeAlt(a);}
        {int[] a = {49,50,51}; op[48] = getOpcodeCat(a);}
        {char[] a = {47}; op[49] = getOpcodeTls(a);}
        op[50] = getOpcodeRnm(63, 414); // collectionProperty
        op[51] = getOpcodeRep((char)0, (char)1, 52);
        op[52] = getOpcodeRnm(2, 15); // collectionNavigation
        {int[] a = {54,55,56}; op[53] = getOpcodeCat(a);}
        {char[] a = {47}; op[54] = getOpcodeTls(a);}
        op[55] = getOpcodeRnm(64, 415); // singleProperty
        op[56] = getOpcodeRep((char)0, (char)1, 57);
        op[57] = getOpcodeRnm(10, 46); // singleNavigation
        {int[] a = {59,60}; op[58] = getOpcodeCat(a);}
        op[59] = getOpcodeRnm(12, 64); // queryOption
        op[60] = getOpcodeRep((char)0, Character.MAX_VALUE, 61);
        {int[] a = {62,63}; op[61] = getOpcodeCat(a);}
        {char[] a = {38}; op[62] = getOpcodeTls(a);}
        op[63] = getOpcodeRnm(12, 64); // queryOption
        {int[] a = {65,66,67,68,69,70}; op[64] = getOpcodeAlt(a);}
        op[65] = getOpcodeRnm(13, 71); // expect
        op[66] = getOpcodeRnm(17, 110); // filter
        op[67] = getOpcodeRnm(18, 114); // orderby
        op[68] = getOpcodeRnm(22, 144); // search
        op[69] = getOpcodeRnm(20, 134); // skip
        op[70] = getOpcodeRnm(21, 139); // top
        {int[] a = {72,73,74,75}; op[71] = getOpcodeCat(a);}
        {char[] a = {101,120,112,101,99,116}; op[72] = getOpcodeTls(a);}
        op[73] = getOpcodeRnm(87, 560); // EQ
        op[74] = getOpcodeRnm(14, 79); // expectItem
        op[75] = getOpcodeRep((char)0, Character.MAX_VALUE, 76);
        {int[] a = {77,78}; op[76] = getOpcodeCat(a);}
        op[77] = getOpcodeRnm(86, 557); // COMMA
        op[78] = getOpcodeRnm(14, 79); // expectItem
        {int[] a = {80,87}; op[79] = getOpcodeAlt(a);}
        {int[] a = {81,82}; op[80] = getOpcodeCat(a);}
        op[81] = getOpcodeRnm(90, 568); // STAR
        op[82] = getOpcodeRep((char)0, (char)1, 83);
        {int[] a = {84,85,86}; op[83] = getOpcodeCat(a);}
        op[84] = getOpcodeRnm(92, 574); // OPEN
        op[85] = getOpcodeRnm(16, 101); // levels
        op[86] = getOpcodeRnm(93, 577); // CLOSE
        {int[] a = {88,89}; op[87] = getOpcodeCat(a);}
        op[88] = getOpcodeRnm(62, 411); // property
        op[89] = getOpcodeRep((char)0, (char)1, 90);
        {int[] a = {91,92,93,97}; op[90] = getOpcodeCat(a);}
        op[91] = getOpcodeRnm(92, 574); // OPEN
        op[92] = getOpcodeRnm(15, 98); // expectOption
        op[93] = getOpcodeRep((char)0, Character.MAX_VALUE, 94);
        {int[] a = {95,96}; op[94] = getOpcodeCat(a);}
        op[95] = getOpcodeRnm(89, 565); // SEMI
        op[96] = getOpcodeRnm(15, 98); // expectOption
        op[97] = getOpcodeRnm(93, 577); // CLOSE
        {int[] a = {99,100}; op[98] = getOpcodeAlt(a);}
        op[99] = getOpcodeRnm(12, 64); // queryOption
        op[100] = getOpcodeRnm(16, 101); // levels
        {int[] a = {102,103,104}; op[101] = getOpcodeCat(a);}
        {char[] a = {108,101,118,101,108,115}; op[102] = getOpcodeTls(a);}
        op[103] = getOpcodeRnm(87, 560); // EQ
        {int[] a = {105,109}; op[104] = getOpcodeAlt(a);}
        {int[] a = {106,107}; op[105] = getOpcodeCat(a);}
        op[106] = getOpcodeRnm(81, 529); // oneToNine
        op[107] = getOpcodeRep((char)0, Character.MAX_VALUE, 108);
        op[108] = getOpcodeRnm(105, 703); // DIGIT
        {char[] a = {109,97,120}; op[109] = getOpcodeTls(a);}
        {int[] a = {111,112,113}; op[110] = getOpcodeCat(a);}
        {char[] a = {102,105,108,116,101,114}; op[111] = getOpcodeTls(a);}
        op[112] = getOpcodeRnm(87, 560); // EQ
        op[113] = getOpcodeRnm(29, 194); // boolCommonExpr
        {int[] a = {115,116,117,118}; op[114] = getOpcodeCat(a);}
        {char[] a = {111,114,100,101,114,98,121}; op[115] = getOpcodeTls(a);}
        op[116] = getOpcodeRnm(87, 560); // EQ
        op[117] = getOpcodeRnm(19, 122); // orderbyItem
        op[118] = getOpcodeRep((char)0, Character.MAX_VALUE, 119);
        {int[] a = {120,121}; op[119] = getOpcodeCat(a);}
        op[120] = getOpcodeRnm(86, 557); // COMMA
        op[121] = getOpcodeRnm(19, 122); // orderbyItem
        {int[] a = {123,124,128}; op[122] = getOpcodeCat(a);}
        op[123] = getOpcodeRnm(62, 411); // property
        op[124] = getOpcodeRep((char)0, Character.MAX_VALUE, 125);
        {int[] a = {126,127}; op[125] = getOpcodeCat(a);}
        {char[] a = {47}; op[126] = getOpcodeTls(a);}
        op[127] = getOpcodeRnm(62, 411); // property
        op[128] = getOpcodeRep((char)0, (char)1, 129);
        {int[] a = {130,131}; op[129] = getOpcodeCat(a);}
        op[130] = getOpcodeRnm(84, 545); // RWS
        {int[] a = {132,133}; op[131] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[132] = getOpcodeTls(a);}
        {char[] a = {100,101,115,99}; op[133] = getOpcodeTls(a);}
        {int[] a = {135,136,137}; op[134] = getOpcodeCat(a);}
        {char[] a = {115,107,105,112}; op[135] = getOpcodeTls(a);}
        op[136] = getOpcodeRnm(87, 560); // EQ
        op[137] = getOpcodeRep((char)1, Character.MAX_VALUE, 138);
        op[138] = getOpcodeRnm(105, 703); // DIGIT
        {int[] a = {140,141,142}; op[139] = getOpcodeCat(a);}
        {char[] a = {116,111,112}; op[140] = getOpcodeTls(a);}
        op[141] = getOpcodeRnm(87, 560); // EQ
        op[142] = getOpcodeRep((char)1, Character.MAX_VALUE, 143);
        op[143] = getOpcodeRnm(105, 703); // DIGIT
        {int[] a = {145,146,147,148}; op[144] = getOpcodeCat(a);}
        {char[] a = {115,101,97,114,99,104}; op[145] = getOpcodeTls(a);}
        op[146] = getOpcodeRnm(87, 560); // EQ
        op[147] = getOpcodeRnm(85, 551); // BWS
        op[148] = getOpcodeRnm(23, 149); // searchExpr
        {int[] a = {150,158}; op[149] = getOpcodeCat(a);}
        {int[] a = {151,157}; op[150] = getOpcodeAlt(a);}
        {int[] a = {152,153,154,155,156}; op[151] = getOpcodeCat(a);}
        op[152] = getOpcodeRnm(92, 574); // OPEN
        op[153] = getOpcodeRnm(85, 551); // BWS
        op[154] = getOpcodeRnm(23, 149); // searchExpr
        op[155] = getOpcodeRnm(85, 551); // BWS
        op[156] = getOpcodeRnm(93, 577); // CLOSE
        op[157] = getOpcodeRnm(26, 174); // searchTerm
        op[158] = getOpcodeRep((char)0, (char)1, 159);
        {int[] a = {160,161}; op[159] = getOpcodeAlt(a);}
        op[160] = getOpcodeRnm(24, 162); // searchOrExpr
        op[161] = getOpcodeRnm(25, 167); // searchAndExpr
        {int[] a = {163,164,165,166}; op[162] = getOpcodeCat(a);}
        op[163] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {79,82}; op[164] = getOpcodeTbs(a);}
        op[165] = getOpcodeRnm(84, 545); // RWS
        op[166] = getOpcodeRnm(23, 149); // searchExpr
        {int[] a = {168,169,173}; op[167] = getOpcodeCat(a);}
        op[168] = getOpcodeRnm(84, 545); // RWS
        op[169] = getOpcodeRep((char)0, (char)1, 170);
        {int[] a = {171,172}; op[170] = getOpcodeCat(a);}
        {char[] a = {65,78,68}; op[171] = getOpcodeTbs(a);}
        op[172] = getOpcodeRnm(84, 545); // RWS
        op[173] = getOpcodeRnm(23, 149); // searchExpr
        {int[] a = {175,179}; op[174] = getOpcodeCat(a);}
        op[175] = getOpcodeRep((char)0, (char)1, 176);
        {int[] a = {177,178}; op[176] = getOpcodeCat(a);}
        {char[] a = {78,79,84}; op[177] = getOpcodeTbs(a);}
        op[178] = getOpcodeRnm(84, 545); // RWS
        {int[] a = {180,181}; op[179] = getOpcodeAlt(a);}
        op[180] = getOpcodeRnm(27, 182); // searchPhrase
        op[181] = getOpcodeRnm(28, 187); // searchWord
        {int[] a = {183,184,186}; op[182] = getOpcodeCat(a);}
        op[183] = getOpcodeRnm(82, 539); // quotation-mark
        op[184] = getOpcodeRep((char)1, Character.MAX_VALUE, 185);
        op[185] = getOpcodeRnm(101, 646); // qchar-no-AMP-DQUOTE
        op[186] = getOpcodeRnm(82, 539); // quotation-mark
        op[187] = getOpcodeRep((char)1, Character.MAX_VALUE, 188);
        {int[] a = {189,190,191,192,193}; op[188] = getOpcodeAlt(a);}
        op[189] = getOpcodeRnm(104, 700); // ALPHA
        op[190] = getOpcodeRnm(105, 703); // DIGIT
        op[191] = getOpcodeRnm(86, 557); // COMMA
        {char[] a = {46}; op[192] = getOpcodeTls(a);}
        op[193] = getOpcodeRnm(95, 586); // pct-encoded
        op[194] = getOpcodeRnm(30, 195); // commonExpr
        {int[] a = {196,204,211,220}; op[195] = getOpcodeCat(a);}
        {int[] a = {197,198,199,200,201,202,203}; op[196] = getOpcodeAlt(a);}
        op[197] = getOpcodeRnm(69, 428); // primitiveLiteral
        op[198] = getOpcodeRnm(32, 230); // functionExpr
        op[199] = getOpcodeRnm(58, 401); // negateExpr
        op[200] = getOpcodeRnm(42, 313); // parenExpr
        op[201] = getOpcodeRnm(43, 319); // listExpr
        op[202] = getOpcodeRnm(59, 405); // notExpr
        op[203] = getOpcodeRnm(31, 224); // propertyPathExpr
        op[204] = getOpcodeRep((char)0, (char)1, 205);
        {int[] a = {206,207,208,209,210}; op[205] = getOpcodeAlt(a);}
        op[206] = getOpcodeRnm(53, 376); // addExpr
        op[207] = getOpcodeRnm(54, 381); // subExpr
        op[208] = getOpcodeRnm(55, 386); // mulExpr
        op[209] = getOpcodeRnm(56, 391); // divExpr
        op[210] = getOpcodeRnm(57, 396); // modExpr
        op[211] = getOpcodeRep((char)0, (char)1, 212);
        {int[] a = {213,214,215,216,217,218,219}; op[212] = getOpcodeAlt(a);}
        op[213] = getOpcodeRnm(46, 341); // eqExpr
        op[214] = getOpcodeRnm(47, 346); // neExpr
        op[215] = getOpcodeRnm(48, 351); // ltExpr
        op[216] = getOpcodeRnm(49, 356); // leExpr
        op[217] = getOpcodeRnm(50, 361); // gtExpr
        op[218] = getOpcodeRnm(51, 366); // geExpr
        op[219] = getOpcodeRnm(52, 371); // inExpr
        op[220] = getOpcodeRep((char)0, (char)1, 221);
        {int[] a = {222,223}; op[221] = getOpcodeAlt(a);}
        op[222] = getOpcodeRnm(44, 331); // andExpr
        op[223] = getOpcodeRnm(45, 336); // orExpr
        {int[] a = {225,226}; op[224] = getOpcodeCat(a);}
        op[225] = getOpcodeRnm(62, 411); // property
        op[226] = getOpcodeRep((char)0, Character.MAX_VALUE, 227);
        {int[] a = {228,229}; op[227] = getOpcodeCat(a);}
        {char[] a = {47}; op[228] = getOpcodeTls(a);}
        op[229] = getOpcodeRnm(62, 411); // property
        {int[] a = {231,232,233,234,235,236}; op[230] = getOpcodeAlt(a);}
        op[231] = getOpcodeRnm(36, 263); // indexOf
        op[232] = getOpcodeRnm(39, 292); // toLower
        op[233] = getOpcodeRnm(40, 299); // toUpper
        op[234] = getOpcodeRnm(41, 306); // trim
        op[235] = getOpcodeRnm(37, 274); // length
        op[236] = getOpcodeRnm(33, 237); // boolFunctionExpr
        {int[] a = {238,239,240}; op[237] = getOpcodeAlt(a);}
        op[238] = getOpcodeRnm(35, 252); // endsWith
        op[239] = getOpcodeRnm(38, 281); // startsWith
        op[240] = getOpcodeRnm(34, 241); // contains
        {int[] a = {242,243,244,245,246,247,248,249,250,251}; op[241] = getOpcodeCat(a);}
        {char[] a = {99,111,110,116,97,105,110,115}; op[242] = getOpcodeTls(a);}
        op[243] = getOpcodeRnm(92, 574); // OPEN
        op[244] = getOpcodeRnm(85, 551); // BWS
        op[245] = getOpcodeRnm(30, 195); // commonExpr
        op[246] = getOpcodeRnm(85, 551); // BWS
        op[247] = getOpcodeRnm(86, 557); // COMMA
        op[248] = getOpcodeRnm(85, 551); // BWS
        op[249] = getOpcodeRnm(30, 195); // commonExpr
        op[250] = getOpcodeRnm(85, 551); // BWS
        op[251] = getOpcodeRnm(93, 577); // CLOSE
        {int[] a = {253,254,255,256,257,258,259,260,261,262}; op[252] = getOpcodeCat(a);}
        {char[] a = {101,110,100,115,119,105,116,104}; op[253] = getOpcodeTls(a);}
        op[254] = getOpcodeRnm(92, 574); // OPEN
        op[255] = getOpcodeRnm(85, 551); // BWS
        op[256] = getOpcodeRnm(30, 195); // commonExpr
        op[257] = getOpcodeRnm(85, 551); // BWS
        op[258] = getOpcodeRnm(86, 557); // COMMA
        op[259] = getOpcodeRnm(85, 551); // BWS
        op[260] = getOpcodeRnm(30, 195); // commonExpr
        op[261] = getOpcodeRnm(85, 551); // BWS
        op[262] = getOpcodeRnm(93, 577); // CLOSE
        {int[] a = {264,265,266,267,268,269,270,271,272,273}; op[263] = getOpcodeCat(a);}
        {char[] a = {105,110,100,101,120,111,102}; op[264] = getOpcodeTls(a);}
        op[265] = getOpcodeRnm(92, 574); // OPEN
        op[266] = getOpcodeRnm(85, 551); // BWS
        op[267] = getOpcodeRnm(30, 195); // commonExpr
        op[268] = getOpcodeRnm(85, 551); // BWS
        op[269] = getOpcodeRnm(86, 557); // COMMA
        op[270] = getOpcodeRnm(85, 551); // BWS
        op[271] = getOpcodeRnm(30, 195); // commonExpr
        op[272] = getOpcodeRnm(85, 551); // BWS
        op[273] = getOpcodeRnm(93, 577); // CLOSE
        {int[] a = {275,276,277,278,279,280}; op[274] = getOpcodeCat(a);}
        {char[] a = {108,101,110,103,116,104}; op[275] = getOpcodeTls(a);}
        op[276] = getOpcodeRnm(92, 574); // OPEN
        op[277] = getOpcodeRnm(85, 551); // BWS
        op[278] = getOpcodeRnm(30, 195); // commonExpr
        op[279] = getOpcodeRnm(85, 551); // BWS
        op[280] = getOpcodeRnm(93, 577); // CLOSE
        {int[] a = {282,283,284,285,286,287,288,289,290,291}; op[281] = getOpcodeCat(a);}
        {char[] a = {115,116,97,114,116,115,119,105,116,104}; op[282] = getOpcodeTls(a);}
        op[283] = getOpcodeRnm(92, 574); // OPEN
        op[284] = getOpcodeRnm(85, 551); // BWS
        op[285] = getOpcodeRnm(30, 195); // commonExpr
        op[286] = getOpcodeRnm(85, 551); // BWS
        op[287] = getOpcodeRnm(86, 557); // COMMA
        op[288] = getOpcodeRnm(85, 551); // BWS
        op[289] = getOpcodeRnm(30, 195); // commonExpr
        op[290] = getOpcodeRnm(85, 551); // BWS
        op[291] = getOpcodeRnm(93, 577); // CLOSE
        {int[] a = {293,294,295,296,297,298}; op[292] = getOpcodeCat(a);}
        {char[] a = {116,111,108,111,119,101,114}; op[293] = getOpcodeTls(a);}
        op[294] = getOpcodeRnm(92, 574); // OPEN
        op[295] = getOpcodeRnm(85, 551); // BWS
        op[296] = getOpcodeRnm(30, 195); // commonExpr
        op[297] = getOpcodeRnm(85, 551); // BWS
        op[298] = getOpcodeRnm(93, 577); // CLOSE
        {int[] a = {300,301,302,303,304,305}; op[299] = getOpcodeCat(a);}
        {char[] a = {116,111,117,112,112,101,114}; op[300] = getOpcodeTls(a);}
        op[301] = getOpcodeRnm(92, 574); // OPEN
        op[302] = getOpcodeRnm(85, 551); // BWS
        op[303] = getOpcodeRnm(30, 195); // commonExpr
        op[304] = getOpcodeRnm(85, 551); // BWS
        op[305] = getOpcodeRnm(93, 577); // CLOSE
        {int[] a = {307,308,309,310,311,312}; op[306] = getOpcodeCat(a);}
        {char[] a = {116,114,105,109}; op[307] = getOpcodeTls(a);}
        op[308] = getOpcodeRnm(92, 574); // OPEN
        op[309] = getOpcodeRnm(85, 551); // BWS
        op[310] = getOpcodeRnm(30, 195); // commonExpr
        op[311] = getOpcodeRnm(85, 551); // BWS
        op[312] = getOpcodeRnm(93, 577); // CLOSE
        {int[] a = {314,315,316,317,318}; op[313] = getOpcodeCat(a);}
        op[314] = getOpcodeRnm(92, 574); // OPEN
        op[315] = getOpcodeRnm(85, 551); // BWS
        op[316] = getOpcodeRnm(30, 195); // commonExpr
        op[317] = getOpcodeRnm(85, 551); // BWS
        op[318] = getOpcodeRnm(93, 577); // CLOSE
        {int[] a = {320,321,322,323,324,330}; op[319] = getOpcodeCat(a);}
        op[320] = getOpcodeRnm(92, 574); // OPEN
        op[321] = getOpcodeRnm(85, 551); // BWS
        op[322] = getOpcodeRnm(30, 195); // commonExpr
        op[323] = getOpcodeRnm(85, 551); // BWS
        op[324] = getOpcodeRep((char)0, Character.MAX_VALUE, 325);
        {int[] a = {326,327,328,329}; op[325] = getOpcodeCat(a);}
        op[326] = getOpcodeRnm(86, 557); // COMMA
        op[327] = getOpcodeRnm(85, 551); // BWS
        op[328] = getOpcodeRnm(30, 195); // commonExpr
        op[329] = getOpcodeRnm(85, 551); // BWS
        op[330] = getOpcodeRnm(93, 577); // CLOSE
        {int[] a = {332,333,334,335}; op[331] = getOpcodeCat(a);}
        op[332] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {97,110,100}; op[333] = getOpcodeTls(a);}
        op[334] = getOpcodeRnm(84, 545); // RWS
        op[335] = getOpcodeRnm(29, 194); // boolCommonExpr
        {int[] a = {337,338,339,340}; op[336] = getOpcodeCat(a);}
        op[337] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {111,114}; op[338] = getOpcodeTls(a);}
        op[339] = getOpcodeRnm(84, 545); // RWS
        op[340] = getOpcodeRnm(29, 194); // boolCommonExpr
        {int[] a = {342,343,344,345}; op[341] = getOpcodeCat(a);}
        op[342] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {101,113}; op[343] = getOpcodeTls(a);}
        op[344] = getOpcodeRnm(84, 545); // RWS
        op[345] = getOpcodeRnm(30, 195); // commonExpr
        {int[] a = {347,348,349,350}; op[346] = getOpcodeCat(a);}
        op[347] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {110,101}; op[348] = getOpcodeTls(a);}
        op[349] = getOpcodeRnm(84, 545); // RWS
        op[350] = getOpcodeRnm(30, 195); // commonExpr
        {int[] a = {352,353,354,355}; op[351] = getOpcodeCat(a);}
        op[352] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {108,116}; op[353] = getOpcodeTls(a);}
        op[354] = getOpcodeRnm(84, 545); // RWS
        op[355] = getOpcodeRnm(30, 195); // commonExpr
        {int[] a = {357,358,359,360}; op[356] = getOpcodeCat(a);}
        op[357] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {108,101}; op[358] = getOpcodeTls(a);}
        op[359] = getOpcodeRnm(84, 545); // RWS
        op[360] = getOpcodeRnm(30, 195); // commonExpr
        {int[] a = {362,363,364,365}; op[361] = getOpcodeCat(a);}
        op[362] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {103,116}; op[363] = getOpcodeTls(a);}
        op[364] = getOpcodeRnm(84, 545); // RWS
        op[365] = getOpcodeRnm(30, 195); // commonExpr
        {int[] a = {367,368,369,370}; op[366] = getOpcodeCat(a);}
        op[367] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {103,101}; op[368] = getOpcodeTls(a);}
        op[369] = getOpcodeRnm(84, 545); // RWS
        op[370] = getOpcodeRnm(30, 195); // commonExpr
        {int[] a = {372,373,374,375}; op[371] = getOpcodeCat(a);}
        op[372] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {105,110}; op[373] = getOpcodeTls(a);}
        op[374] = getOpcodeRnm(84, 545); // RWS
        op[375] = getOpcodeRnm(30, 195); // commonExpr
        {int[] a = {377,378,379,380}; op[376] = getOpcodeCat(a);}
        op[377] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {97,100,100}; op[378] = getOpcodeTls(a);}
        op[379] = getOpcodeRnm(84, 545); // RWS
        op[380] = getOpcodeRnm(30, 195); // commonExpr
        {int[] a = {382,383,384,385}; op[381] = getOpcodeCat(a);}
        op[382] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {115,117,98}; op[383] = getOpcodeTls(a);}
        op[384] = getOpcodeRnm(84, 545); // RWS
        op[385] = getOpcodeRnm(30, 195); // commonExpr
        {int[] a = {387,388,389,390}; op[386] = getOpcodeCat(a);}
        op[387] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {109,117,108}; op[388] = getOpcodeTls(a);}
        op[389] = getOpcodeRnm(84, 545); // RWS
        op[390] = getOpcodeRnm(30, 195); // commonExpr
        {int[] a = {392,393,394,395}; op[391] = getOpcodeCat(a);}
        op[392] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {100,105,118}; op[393] = getOpcodeTls(a);}
        op[394] = getOpcodeRnm(84, 545); // RWS
        op[395] = getOpcodeRnm(30, 195); // commonExpr
        {int[] a = {397,398,399,400}; op[396] = getOpcodeCat(a);}
        op[397] = getOpcodeRnm(84, 545); // RWS
        {char[] a = {109,111,100}; op[398] = getOpcodeTls(a);}
        op[399] = getOpcodeRnm(84, 545); // RWS
        op[400] = getOpcodeRnm(30, 195); // commonExpr
        {int[] a = {402,403,404}; op[401] = getOpcodeCat(a);}
        {char[] a = {45}; op[402] = getOpcodeTls(a);}
        op[403] = getOpcodeRnm(85, 551); // BWS
        op[404] = getOpcodeRnm(30, 195); // commonExpr
        {int[] a = {406,407,408}; op[405] = getOpcodeCat(a);}
        {char[] a = {110,111,116}; op[406] = getOpcodeTls(a);}
        op[407] = getOpcodeRnm(84, 545); // RWS
        op[408] = getOpcodeRnm(29, 194); // boolCommonExpr
        op[409] = getOpcodeRnm(66, 417); // identifier
        op[410] = getOpcodeRnm(66, 417); // identifier
        {int[] a = {412,413}; op[411] = getOpcodeAlt(a);}
        op[412] = getOpcodeRnm(63, 414); // collectionProperty
        op[413] = getOpcodeRnm(64, 415); // singleProperty
        op[414] = getOpcodeRnm(66, 417); // identifier
        op[415] = getOpcodeRnm(66, 417); // identifier
        op[416] = getOpcodeRnm(66, 417); // identifier
        {int[] a = {418,419}; op[417] = getOpcodeCat(a);}
        op[418] = getOpcodeRnm(67, 421); // identifierLeadingCharacter
        op[419] = getOpcodeRep((char)0, (char)127, 420);
        op[420] = getOpcodeRnm(68, 424); // identifierCharacter
        {int[] a = {422,423}; op[421] = getOpcodeAlt(a);}
        op[422] = getOpcodeRnm(104, 700); // ALPHA
        {char[] a = {95}; op[423] = getOpcodeTls(a);}
        {int[] a = {425,426,427}; op[424] = getOpcodeAlt(a);}
        op[425] = getOpcodeRnm(104, 700); // ALPHA
        {char[] a = {95}; op[426] = getOpcodeTls(a);}
        op[427] = getOpcodeRnm(105, 703); // DIGIT
        {int[] a = {429,430,431,432,433,434}; op[428] = getOpcodeAlt(a);}
        op[429] = getOpcodeRnm(70, 435); // nullValue
        op[430] = getOpcodeRnm(71, 436); // booleanValue
        op[431] = getOpcodeRnm(74, 462); // guidValue
        op[432] = getOpcodeRnm(77, 487); // dateValue
        op[433] = getOpcodeRnm(72, 439); // numberValue
        op[434] = getOpcodeRnm(75, 477); // stringValue
        {char[] a = {110,117,108,108}; op[435] = getOpcodeTls(a);}
        {int[] a = {437,438}; op[436] = getOpcodeAlt(a);}
        {char[] a = {116,114,117,101}; op[437] = getOpcodeTls(a);}
        {char[] a = {102,97,108,115,101}; op[438] = getOpcodeTls(a);}
        {int[] a = {440,457}; op[439] = getOpcodeAlt(a);}
        {int[] a = {441,443,445,450}; op[440] = getOpcodeCat(a);}
        op[441] = getOpcodeRep((char)0, (char)1, 442);
        op[442] = getOpcodeRnm(88, 561); // SIGN
        op[443] = getOpcodeRep((char)1, Character.MAX_VALUE, 444);
        op[444] = getOpcodeRnm(105, 703); // DIGIT
        op[445] = getOpcodeRep((char)0, (char)1, 446);
        {int[] a = {447,448}; op[446] = getOpcodeCat(a);}
        {char[] a = {46}; op[447] = getOpcodeTls(a);}
        op[448] = getOpcodeRep((char)1, Character.MAX_VALUE, 449);
        op[449] = getOpcodeRnm(105, 703); // DIGIT
        op[450] = getOpcodeRep((char)0, (char)1, 451);
        {int[] a = {452,453,455}; op[451] = getOpcodeCat(a);}
        {char[] a = {101}; op[452] = getOpcodeTls(a);}
        op[453] = getOpcodeRep((char)0, (char)1, 454);
        op[454] = getOpcodeRnm(88, 561); // SIGN
        op[455] = getOpcodeRep((char)1, Character.MAX_VALUE, 456);
        op[456] = getOpcodeRnm(105, 703); // DIGIT
        op[457] = getOpcodeRnm(73, 458); // nanInfinity
        {int[] a = {459,460,461}; op[458] = getOpcodeAlt(a);}
        {char[] a = {78,97,78}; op[459] = getOpcodeTbs(a);}
        {char[] a = {45,73,78,70}; op[460] = getOpcodeTbs(a);}
        {char[] a = {73,78,70}; op[461] = getOpcodeTbs(a);}
        {int[] a = {463,465,466,468,469,471,472,474,475}; op[462] = getOpcodeCat(a);}
        op[463] = getOpcodeRep((char)8, (char)8, 464);
        op[464] = getOpcodeRnm(106, 704); // HEXDIG
        {char[] a = {45}; op[465] = getOpcodeTls(a);}
        op[466] = getOpcodeRep((char)4, (char)4, 467);
        op[467] = getOpcodeRnm(106, 704); // HEXDIG
        {char[] a = {45}; op[468] = getOpcodeTls(a);}
        op[469] = getOpcodeRep((char)4, (char)4, 470);
        op[470] = getOpcodeRnm(106, 704); // HEXDIG
        {char[] a = {45}; op[471] = getOpcodeTls(a);}
        op[472] = getOpcodeRep((char)4, (char)4, 473);
        op[473] = getOpcodeRnm(106, 704); // HEXDIG
        {char[] a = {45}; op[474] = getOpcodeTls(a);}
        op[475] = getOpcodeRep((char)12, (char)12, 476);
        op[476] = getOpcodeRnm(106, 704); // HEXDIG
        {int[] a = {478,479,483}; op[477] = getOpcodeCat(a);}
        op[478] = getOpcodeRnm(91, 571); // SQUOTE
        op[479] = getOpcodeRep((char)0, Character.MAX_VALUE, 480);
        {int[] a = {481,482}; op[480] = getOpcodeAlt(a);}
        op[481] = getOpcodeRnm(76, 484); // SQUOTE-in-string
        op[482] = getOpcodeRnm(99, 611); // pchar-no-SQUOTE
        op[483] = getOpcodeRnm(91, 571); // SQUOTE
        {int[] a = {485,486}; op[484] = getOpcodeCat(a);}
        op[485] = getOpcodeRnm(91, 571); // SQUOTE
        op[486] = getOpcodeRnm(91, 571); // SQUOTE
        {int[] a = {488,489,490,491,492}; op[487] = getOpcodeCat(a);}
        op[488] = getOpcodeRnm(78, 493); // year
        {char[] a = {45}; op[489] = getOpcodeTls(a);}
        op[490] = getOpcodeRnm(79, 505); // month
        {char[] a = {45}; op[491] = getOpcodeTls(a);}
        op[492] = getOpcodeRnm(80, 515); // day
        {int[] a = {494,496}; op[493] = getOpcodeCat(a);}
        op[494] = getOpcodeRep((char)0, (char)1, 495);
        {char[] a = {45}; op[495] = getOpcodeTls(a);}
        {int[] a = {497,501}; op[496] = getOpcodeAlt(a);}
        {int[] a = {498,499}; op[497] = getOpcodeCat(a);}
        {char[] a = {48}; op[498] = getOpcodeTls(a);}
        op[499] = getOpcodeRep((char)3, (char)3, 500);
        op[500] = getOpcodeRnm(105, 703); // DIGIT
        {int[] a = {502,503}; op[501] = getOpcodeCat(a);}
        op[502] = getOpcodeRnm(81, 529); // oneToNine
        op[503] = getOpcodeRep((char)3, Character.MAX_VALUE, 504);
        op[504] = getOpcodeRnm(105, 703); // DIGIT
        {int[] a = {506,509}; op[505] = getOpcodeAlt(a);}
        {int[] a = {507,508}; op[506] = getOpcodeCat(a);}
        {char[] a = {48}; op[507] = getOpcodeTls(a);}
        op[508] = getOpcodeRnm(81, 529); // oneToNine
        {int[] a = {510,511}; op[509] = getOpcodeCat(a);}
        {char[] a = {49}; op[510] = getOpcodeTls(a);}
        {int[] a = {512,513,514}; op[511] = getOpcodeAlt(a);}
        {char[] a = {48}; op[512] = getOpcodeTls(a);}
        {char[] a = {49}; op[513] = getOpcodeTls(a);}
        {char[] a = {50}; op[514] = getOpcodeTls(a);}
        {int[] a = {516,519,524}; op[515] = getOpcodeAlt(a);}
        {int[] a = {517,518}; op[516] = getOpcodeCat(a);}
        {char[] a = {48}; op[517] = getOpcodeTls(a);}
        op[518] = getOpcodeRnm(81, 529); // oneToNine
        {int[] a = {520,523}; op[519] = getOpcodeCat(a);}
        {int[] a = {521,522}; op[520] = getOpcodeAlt(a);}
        {char[] a = {49}; op[521] = getOpcodeTls(a);}
        {char[] a = {50}; op[522] = getOpcodeTls(a);}
        op[523] = getOpcodeRnm(105, 703); // DIGIT
        {int[] a = {525,526}; op[524] = getOpcodeCat(a);}
        {char[] a = {51}; op[525] = getOpcodeTls(a);}
        {int[] a = {527,528}; op[526] = getOpcodeAlt(a);}
        {char[] a = {48}; op[527] = getOpcodeTls(a);}
        {char[] a = {49}; op[528] = getOpcodeTls(a);}
        {int[] a = {530,531,532,533,534,535,536,537,538}; op[529] = getOpcodeAlt(a);}
        {char[] a = {49}; op[530] = getOpcodeTls(a);}
        {char[] a = {50}; op[531] = getOpcodeTls(a);}
        {char[] a = {51}; op[532] = getOpcodeTls(a);}
        {char[] a = {52}; op[533] = getOpcodeTls(a);}
        {char[] a = {53}; op[534] = getOpcodeTls(a);}
        {char[] a = {54}; op[535] = getOpcodeTls(a);}
        {char[] a = {55}; op[536] = getOpcodeTls(a);}
        {char[] a = {56}; op[537] = getOpcodeTls(a);}
        {char[] a = {57}; op[538] = getOpcodeTls(a);}
        {int[] a = {540,541}; op[539] = getOpcodeAlt(a);}
        op[540] = getOpcodeRnm(108, 714); // DQUOTE
        {char[] a = {37,50,50}; op[541] = getOpcodeTls(a);}
        {int[] a = {543,544}; op[542] = getOpcodeAlt(a);}
        {char[] a = {92}; op[543] = getOpcodeTls(a);}
        {char[] a = {37,53,67}; op[544] = getOpcodeTls(a);}
        op[545] = getOpcodeRep((char)1, Character.MAX_VALUE, 546);
        {int[] a = {547,548,549,550}; op[546] = getOpcodeAlt(a);}
        op[547] = getOpcodeRnm(109, 715); // SP
        op[548] = getOpcodeRnm(110, 716); // HTAB
        {char[] a = {37,50,48}; op[549] = getOpcodeTls(a);}
        {char[] a = {37,48,57}; op[550] = getOpcodeTls(a);}
        op[551] = getOpcodeRep((char)0, Character.MAX_VALUE, 552);
        {int[] a = {553,554,555,556}; op[552] = getOpcodeAlt(a);}
        op[553] = getOpcodeRnm(109, 715); // SP
        op[554] = getOpcodeRnm(110, 716); // HTAB
        {char[] a = {37,50,48}; op[555] = getOpcodeTls(a);}
        {char[] a = {37,48,57}; op[556] = getOpcodeTls(a);}
        {int[] a = {558,559}; op[557] = getOpcodeAlt(a);}
        {char[] a = {44}; op[558] = getOpcodeTls(a);}
        {char[] a = {37,50,67}; op[559] = getOpcodeTls(a);}
        {char[] a = {61}; op[560] = getOpcodeTls(a);}
        {int[] a = {562,563,564}; op[561] = getOpcodeAlt(a);}
        {char[] a = {43}; op[562] = getOpcodeTls(a);}
        {char[] a = {37,50,66}; op[563] = getOpcodeTls(a);}
        {char[] a = {45}; op[564] = getOpcodeTls(a);}
        {int[] a = {566,567}; op[565] = getOpcodeAlt(a);}
        {char[] a = {59}; op[566] = getOpcodeTls(a);}
        {char[] a = {37,51,66}; op[567] = getOpcodeTls(a);}
        {int[] a = {569,570}; op[568] = getOpcodeAlt(a);}
        {char[] a = {42}; op[569] = getOpcodeTls(a);}
        {char[] a = {37,50,65}; op[570] = getOpcodeTls(a);}
        {int[] a = {572,573}; op[571] = getOpcodeAlt(a);}
        {char[] a = {39}; op[572] = getOpcodeTls(a);}
        {char[] a = {37,50,55}; op[573] = getOpcodeTls(a);}
        {int[] a = {575,576}; op[574] = getOpcodeAlt(a);}
        {char[] a = {40}; op[575] = getOpcodeTls(a);}
        {char[] a = {37,50,56}; op[576] = getOpcodeTls(a);}
        {int[] a = {578,579}; op[577] = getOpcodeAlt(a);}
        {char[] a = {41}; op[578] = getOpcodeTls(a);}
        {char[] a = {37,50,57}; op[579] = getOpcodeTls(a);}
        {int[] a = {581,582,583,584,585}; op[580] = getOpcodeAlt(a);}
        op[581] = getOpcodeRnm(96, 590); // unreserved
        op[582] = getOpcodeRnm(95, 586); // pct-encoded
        op[583] = getOpcodeRnm(97, 597); // sub-delims
        {char[] a = {58}; op[584] = getOpcodeTls(a);}
        {char[] a = {64}; op[585] = getOpcodeTls(a);}
        {int[] a = {587,588,589}; op[586] = getOpcodeCat(a);}
        {char[] a = {37}; op[587] = getOpcodeTls(a);}
        op[588] = getOpcodeRnm(106, 704); // HEXDIG
        op[589] = getOpcodeRnm(106, 704); // HEXDIG
        {int[] a = {591,592,593,594,595,596}; op[590] = getOpcodeAlt(a);}
        op[591] = getOpcodeRnm(104, 700); // ALPHA
        op[592] = getOpcodeRnm(105, 703); // DIGIT
        {char[] a = {45}; op[593] = getOpcodeTls(a);}
        {char[] a = {46}; op[594] = getOpcodeTls(a);}
        {char[] a = {95}; op[595] = getOpcodeTls(a);}
        {char[] a = {126}; op[596] = getOpcodeTls(a);}
        {int[] a = {598,599,600}; op[597] = getOpcodeAlt(a);}
        {char[] a = {38}; op[598] = getOpcodeTls(a);}
        {char[] a = {39}; op[599] = getOpcodeTls(a);}
        op[600] = getOpcodeRnm(98, 601); // other-delims
        {int[] a = {602,603,604,605,606,607,608,609,610}; op[601] = getOpcodeAlt(a);}
        {char[] a = {33}; op[602] = getOpcodeTls(a);}
        {char[] a = {36}; op[603] = getOpcodeTls(a);}
        {char[] a = {40}; op[604] = getOpcodeTls(a);}
        {char[] a = {41}; op[605] = getOpcodeTls(a);}
        {char[] a = {42}; op[606] = getOpcodeTls(a);}
        {char[] a = {43}; op[607] = getOpcodeTls(a);}
        {char[] a = {44}; op[608] = getOpcodeTls(a);}
        {char[] a = {59}; op[609] = getOpcodeTls(a);}
        {char[] a = {61}; op[610] = getOpcodeTls(a);}
        {int[] a = {612,613,614,615,616,617}; op[611] = getOpcodeAlt(a);}
        op[612] = getOpcodeRnm(96, 590); // unreserved
        op[613] = getOpcodeRnm(100, 618); // pct-encoded-no-SQUOTE
        op[614] = getOpcodeRnm(98, 601); // other-delims
        {char[] a = {38}; op[615] = getOpcodeTls(a);}
        {char[] a = {58}; op[616] = getOpcodeTls(a);}
        {char[] a = {64}; op[617] = getOpcodeTls(a);}
        {int[] a = {619,632}; op[618] = getOpcodeAlt(a);}
        {int[] a = {620,621,631}; op[619] = getOpcodeCat(a);}
        {char[] a = {37}; op[620] = getOpcodeTls(a);}
        {int[] a = {622,623,624,625,626,627,628,629,630}; op[621] = getOpcodeAlt(a);}
        {char[] a = {48}; op[622] = getOpcodeTls(a);}
        {char[] a = {49}; op[623] = getOpcodeTls(a);}
        {char[] a = {51}; op[624] = getOpcodeTls(a);}
        {char[] a = {52}; op[625] = getOpcodeTls(a);}
        {char[] a = {53}; op[626] = getOpcodeTls(a);}
        {char[] a = {54}; op[627] = getOpcodeTls(a);}
        {char[] a = {56}; op[628] = getOpcodeTls(a);}
        {char[] a = {57}; op[629] = getOpcodeTls(a);}
        op[630] = getOpcodeRnm(107, 707); // A-to-F
        op[631] = getOpcodeRnm(106, 704); // HEXDIG
        {int[] a = {633,634,635}; op[632] = getOpcodeCat(a);}
        {char[] a = {37}; op[633] = getOpcodeTls(a);}
        {char[] a = {50}; op[634] = getOpcodeTls(a);}
        {int[] a = {636,637,638,639,640,641,642,643,644,645}; op[635] = getOpcodeAlt(a);}
        {char[] a = {48}; op[636] = getOpcodeTls(a);}
        {char[] a = {49}; op[637] = getOpcodeTls(a);}
        {char[] a = {50}; op[638] = getOpcodeTls(a);}
        {char[] a = {51}; op[639] = getOpcodeTls(a);}
        {char[] a = {52}; op[640] = getOpcodeTls(a);}
        {char[] a = {53}; op[641] = getOpcodeTls(a);}
        {char[] a = {54}; op[642] = getOpcodeTls(a);}
        {char[] a = {56}; op[643] = getOpcodeTls(a);}
        {char[] a = {57}; op[644] = getOpcodeTls(a);}
        op[645] = getOpcodeRnm(107, 707); // A-to-F
        {int[] a = {647,648}; op[646] = getOpcodeAlt(a);}
        op[647] = getOpcodeRnm(102, 653); // qchar-unescaped
        {int[] a = {649,650}; op[648] = getOpcodeCat(a);}
        op[649] = getOpcodeRnm(83, 542); // escape
        {int[] a = {651,652}; op[650] = getOpcodeAlt(a);}
        op[651] = getOpcodeRnm(83, 542); // escape
        op[652] = getOpcodeRnm(82, 539); // quotation-mark
        {int[] a = {654,655,656,657,658,659,660,661}; op[653] = getOpcodeAlt(a);}
        op[654] = getOpcodeRnm(96, 590); // unreserved
        op[655] = getOpcodeRnm(103, 662); // pct-encoded-unescaped
        op[656] = getOpcodeRnm(98, 601); // other-delims
        {char[] a = {58}; op[657] = getOpcodeTls(a);}
        {char[] a = {64}; op[658] = getOpcodeTls(a);}
        {char[] a = {47}; op[659] = getOpcodeTls(a);}
        {char[] a = {63}; op[660] = getOpcodeTls(a);}
        {char[] a = {39}; op[661] = getOpcodeTls(a);}
        {int[] a = {663,676,690}; op[662] = getOpcodeAlt(a);}
        {int[] a = {664,665,675}; op[663] = getOpcodeCat(a);}
        {char[] a = {37}; op[664] = getOpcodeTls(a);}
        {int[] a = {666,667,668,669,670,671,672,673,674}; op[665] = getOpcodeAlt(a);}
        {char[] a = {48}; op[666] = getOpcodeTls(a);}
        {char[] a = {49}; op[667] = getOpcodeTls(a);}
        {char[] a = {51}; op[668] = getOpcodeTls(a);}
        {char[] a = {52}; op[669] = getOpcodeTls(a);}
        {char[] a = {54}; op[670] = getOpcodeTls(a);}
        {char[] a = {55}; op[671] = getOpcodeTls(a);}
        {char[] a = {56}; op[672] = getOpcodeTls(a);}
        {char[] a = {57}; op[673] = getOpcodeTls(a);}
        op[674] = getOpcodeRnm(107, 707); // A-to-F
        op[675] = getOpcodeRnm(106, 704); // HEXDIG
        {int[] a = {677,678,679}; op[676] = getOpcodeCat(a);}
        {char[] a = {37}; op[677] = getOpcodeTls(a);}
        {char[] a = {50}; op[678] = getOpcodeTls(a);}
        {int[] a = {680,681,682,683,684,685,686,687,688,689}; op[679] = getOpcodeAlt(a);}
        {char[] a = {48}; op[680] = getOpcodeTls(a);}
        {char[] a = {49}; op[681] = getOpcodeTls(a);}
        {char[] a = {51}; op[682] = getOpcodeTls(a);}
        {char[] a = {52}; op[683] = getOpcodeTls(a);}
        {char[] a = {53}; op[684] = getOpcodeTls(a);}
        {char[] a = {54}; op[685] = getOpcodeTls(a);}
        {char[] a = {55}; op[686] = getOpcodeTls(a);}
        {char[] a = {56}; op[687] = getOpcodeTls(a);}
        {char[] a = {57}; op[688] = getOpcodeTls(a);}
        op[689] = getOpcodeRnm(107, 707); // A-to-F
        {int[] a = {691,692,693}; op[690] = getOpcodeCat(a);}
        {char[] a = {37}; op[691] = getOpcodeTls(a);}
        {char[] a = {53}; op[692] = getOpcodeTls(a);}
        {int[] a = {694,695,696,697,698,699}; op[693] = getOpcodeAlt(a);}
        op[694] = getOpcodeRnm(105, 703); // DIGIT
        {char[] a = {65}; op[695] = getOpcodeTls(a);}
        {char[] a = {66}; op[696] = getOpcodeTls(a);}
        {char[] a = {68}; op[697] = getOpcodeTls(a);}
        {char[] a = {69}; op[698] = getOpcodeTls(a);}
        {char[] a = {70}; op[699] = getOpcodeTls(a);}
        {int[] a = {701,702}; op[700] = getOpcodeAlt(a);}
        op[701] = getOpcodeTrg((char)65, (char)90);
        op[702] = getOpcodeTrg((char)97, (char)122);
        op[703] = getOpcodeTrg((char)48, (char)57);
        {int[] a = {705,706}; op[704] = getOpcodeAlt(a);}
        op[705] = getOpcodeRnm(105, 703); // DIGIT
        op[706] = getOpcodeRnm(107, 707); // A-to-F
        {int[] a = {708,709,710,711,712,713}; op[707] = getOpcodeAlt(a);}
        {char[] a = {65}; op[708] = getOpcodeTls(a);}
        {char[] a = {66}; op[709] = getOpcodeTls(a);}
        {char[] a = {67}; op[710] = getOpcodeTls(a);}
        {char[] a = {68}; op[711] = getOpcodeTls(a);}
        {char[] a = {69}; op[712] = getOpcodeTls(a);}
        {char[] a = {70}; op[713] = getOpcodeTls(a);}
        {char[] a = {34}; op[714] = getOpcodeTbs(a);}
        {char[] a = {32}; op[715] = getOpcodeTbs(a);}
        {char[] a = {9}; op[716] = getOpcodeTbs(a);}
    }

    public static void display(PrintStream out){
        out.println(";");
        out.println("; grammar.GrammarUnderTest");
        out.println(";");
        out.println(";------------------------------------------------------------------------------");
        out.println("; Example ABNF Rules");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 30 May 2018");
        out.println(";------------------------------------------------------------------------------");
        out.println(";");
        out.println("; Note: the first rule is the start rule. The ABNF generator will warn if not");
        out.println("; all rules are eventually referenced by the start rule.");
        out.println("; If the ABNF intentionally has more than one logical start rule, simply add");
        out.println("; a dummy start rule that references all logical start rules");
        out.println(";");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("relativeUrl = resourcePath [ \"?\" queryOptions ]");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; Resource Path");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("resourcePath = entitySet   [ collectionNavigation ] ");
        out.println("             / singletonEntity [ singleNavigation ]");
        out.println("");
        out.println("collectionNavigation = keyPredicate [ singleNavigation ]");
        out.println("");
        out.println("keyPredicate     = simpleKey / compoundKey / keyPathSegments");
        out.println("simpleKey        = OPEN ( keyPropertyValue ) CLOSE");
        out.println("compoundKey      = OPEN keyValuePair *( COMMA keyValuePair ) CLOSE");
        out.println("keyValuePair     = keyProperty EQ keyPropertyValue");
        out.println("keyPropertyValue = primitiveLiteral");
        out.println("keyPathSegments  = 1*( \"/\" keyPathLiteral )");
        out.println("keyPathLiteral   = *pchar");
        out.println("");
        out.println("singleNavigation = [ \"/\" collectionProperty [ collectionNavigation ]");
        out.println("                   / \"/\" singleProperty     [ singleNavigation ]");
        out.println("                   ]");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; Query Options");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("queryOptions = queryOption *( \"&\" queryOption )        ");
        out.println("queryOption  = expect ");
        out.println("             / filter ");
        out.println("             / orderby ");
        out.println("             / search");
        out.println("             / skip ");
        out.println("             / top ");
        out.println("");
        out.println("expect            = \"expect\" EQ expectItem *( COMMA expectItem )");
        out.println("expectItem        = STAR [ OPEN levels CLOSE ]");
        out.println("                  / property [ OPEN expectOption *( SEMI expectOption ) CLOSE ]                    ");
        out.println("expectOption      = queryOption");
        out.println("                  / levels");
        out.println("                ");
        out.println("levels = \"levels\" EQ ( oneToNine *DIGIT / \"max\" )");
        out.println("");
        out.println("filter = \"filter\" EQ boolCommonExpr");
        out.println("");
        out.println("orderby     = \"orderby\" EQ orderbyItem *( COMMA orderbyItem )");
        out.println("orderbyItem = property *( \"/\" property ) [ RWS ( \"asc\" / \"desc\" ) ]");
        out.println("");
        out.println("skip = \"skip\" EQ 1*DIGIT");
        out.println("top  = \"top\"  EQ 1*DIGIT");
        out.println("");
        out.println("search     = \"search\" EQ BWS searchExpr");
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
        out.println("searchWord   = 1*( ALPHA / DIGIT / COMMA / \".\" / pct-encoded )");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; Expressions");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("boolCommonExpr = commonExpr ; resulting in a Boolean");
        out.println("");
        out.println("commonExpr = ( primitiveLiteral");
        out.println("             / functionExpr");
        out.println("             / negateExpr ");
        out.println("             / parenExpr ");
        out.println("             / listExpr");
        out.println("             / notExpr");
        out.println("             / propertyPathExpr");
        out.println("             ) ");
        out.println("             [ addExpr ");
        out.println("             / subExpr ");
        out.println("             / mulExpr ");
        out.println("             / divExpr");
        out.println("             / modExpr");
        out.println("             ]  ");
        out.println("             [ eqExpr ");
        out.println("             / neExpr ");
        out.println("             / ltExpr  ");
        out.println("             / leExpr  ");
        out.println("             / gtExpr ");
        out.println("             / geExpr ");
        out.println("             / inExpr ");
        out.println("             ]");
        out.println("             [ andExpr ");
        out.println("             / orExpr ");
        out.println("             ] ");
        out.println("");
        out.println("propertyPathExpr = property *( \"/\" property )");
        out.println("                   ");
        out.println("functionExpr = indexOf ");
        out.println("             / toLower ");
        out.println("             / toUpper  ");
        out.println("             / trim ");
        out.println("             / length ");
        out.println("             / boolFunctionExpr");
        out.println("");
        out.println("boolFunctionExpr = endsWith ");
        out.println("                 / startsWith ");
        out.println("                 / contains                                          ");
        out.println("");
        out.println("contains   = \"contains\"   OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("endsWith   = \"endswith\"   OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("indexOf    = \"indexof\"    OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("length     = \"length\"     OPEN BWS commonExpr BWS CLOSE");
        out.println("startsWith = \"startswith\" OPEN BWS commonExpr BWS COMMA BWS commonExpr BWS CLOSE");
        out.println("toLower    = \"tolower\"    OPEN BWS commonExpr BWS CLOSE");
        out.println("toUpper    = \"toupper\"    OPEN BWS commonExpr BWS CLOSE");
        out.println("trim       = \"trim\"       OPEN BWS commonExpr BWS CLOSE");
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
        out.println("addExpr = RWS \"add\"   RWS commonExpr");
        out.println("subExpr = RWS \"sub\"   RWS commonExpr");
        out.println("mulExpr = RWS \"mul\"   RWS commonExpr");
        out.println("divExpr = RWS \"div\"   RWS commonExpr");
        out.println("modExpr = RWS \"mod\"   RWS commonExpr");
        out.println("");
        out.println("negateExpr = \"-\" BWS commonExpr");
        out.println("");
        out.println("notExpr = \"not\" RWS boolCommonExpr");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; Names and identifiers");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("entitySet       = identifier");
        out.println("singletonEntity = identifier          ");
        out.println("");
        out.println("property = collectionProperty / singleProperty");
        out.println("");
        out.println("collectionProperty = identifier");
        out.println("singleProperty     = identifier");
        out.println("");
        out.println("keyProperty = identifier");
        out.println("");
        out.println("identifier                  = identifierLeadingCharacter *127identifierCharacter");
        out.println("identifierLeadingCharacter  = ALPHA / \"_\"         ");
        out.println("identifierCharacter         = ALPHA / \"_\" / DIGIT ");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; Literal Values");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("primitiveLiteral = nullValue");
        out.println("                 / booleanValue ");
        out.println("                 / guidValue ");
        out.println("                 / dateValue");
        out.println("                 / numberValue ");
        out.println("                 / stringValue");
        out.println("         ");
        out.println("nullValue = \"null\" ");
        out.println("");
        out.println("booleanValue = \"true\" / \"false\"");
        out.println("");
        out.println("numberValue = [ SIGN ] 1*DIGIT [ \".\" 1*DIGIT ] [ \"e\" [ SIGN ] 1*DIGIT ] / nanInfinity");
        out.println("nanInfinity = 'NaN' / '-INF' / 'INF'");
        out.println("");
        out.println("guidValue = 8HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 12HEXDIG ");
        out.println("");
        out.println("stringValue      = SQUOTE *( SQUOTE-in-string / pchar-no-SQUOTE ) SQUOTE");
        out.println("SQUOTE-in-string = SQUOTE SQUOTE ; two consecutive single quotes represent one within a string literal");
        out.println("");
        out.println("dateValue = year \"-\" month \"-\" day");
        out.println("year      = [ \"-\" ] ( \"0\" 3DIGIT / oneToNine 3*DIGIT )");
        out.println("month     = \"0\" oneToNine");
        out.println("          / \"1\" ( \"0\" / \"1\" / \"2\" )");
        out.println("day       = \"0\" oneToNine");
        out.println("          / ( \"1\" / \"2\" ) DIGIT");
        out.println("          / \"3\" ( \"0\" / \"1\" )");
        out.println("oneToNine = \"1\" / \"2\" / \"3\" / \"4\" / \"5\" / \"6\" / \"7\" / \"8\" / \"9\" ");
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; Punctuation");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("quotation-mark  = DQUOTE / \"%22\"");
        out.println("escape = \"\\\" / \"%5C\"     ; reverse solidus U+005C");
        out.println("");
        out.println("RWS = 1*( SP / HTAB / \"%20\" / \"%09\" )  ; \"required\" whitespace ");
        out.println("BWS =  *( SP / HTAB / \"%20\" / \"%09\" )  ; \"bad\" whitespace ");
        out.println("");
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
        out.println("pchar         = unreserved / pct-encoded / sub-delims / \":\" / \"@\"");
        out.println("pct-encoded   = \"%\" HEXDIG HEXDIG");
        out.println("unreserved    = ALPHA / DIGIT / \"-\" / \".\" / \"_\" / \"~\"");
        out.println(";sub-delims   = \"!\" / \"$\" / \"&\" / \"'\" / \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\" / \"=\"");
        out.println("sub-delims    =             \"&\" / \"'\" / other-delims");
        out.println("other-delims  = \"!\" / \"$\" /             \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\" / \"=\"");
        out.println("");
        out.println("pchar-no-SQUOTE       = unreserved / pct-encoded-no-SQUOTE / other-delims / \"&\" / \":\" / \"@\"");
        out.println("pct-encoded-no-SQUOTE = \"%\" ( \"0\" / \"1\" /   \"3\" / \"4\" / \"5\" / \"6\" / \"8\" / \"9\" / A-to-F ) HEXDIG ");
        out.println("                      / \"%\" \"2\" ( \"0\" / \"1\" / \"2\" / \"3\" / \"4\" / \"5\" / \"6\" /   \"8\" / \"9\" / A-to-F )");
        out.println("");
        out.println("qchar-no-AMP-DQUOTE   = qchar-unescaped ");
        out.println("                      / escape ( escape / quotation-mark )               ");
        out.println("qchar-unescaped       = unreserved / pct-encoded-unescaped / other-delims / \":\" / \"@\" / \"/\" / \"?\" / \"'\"");
        out.println("pct-encoded-unescaped = \"%\" ( \"0\" / \"1\" /   \"3\" / \"4\" /   \"6\" / \"7\" / \"8\" / \"9\" / A-to-F ) HEXDIG ");
        out.println("                      / \"%\" \"2\" ( \"0\" / \"1\" /   \"3\" / \"4\" / \"5\" / \"6\" / \"7\" / \"8\" / \"9\" / A-to-F ) ");
        out.println("                      / \"%\" \"5\" ( DIGIT / \"A\" / \"B\" /   \"D\" / \"E\" / \"F\" )");
        out.println("");
        out.println("                 ");
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
        out.println("");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; End of Example ABNF Rules");
        out.println(";------------------------------------------------------------------------------");
    }
}
