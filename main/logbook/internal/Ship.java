/**
 * 
 */
package logbook.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 艦娘
 *
 */
public class Ship {

    /**
     * 艦娘プリセット値
     */
    private static final Map<String, String> SHIP = new ConcurrentHashMap<String, String>() {
        {
            this.put("1", "睦月");
            this.put("2", "如月");
            this.put("3", "");
            this.put("4", "");
            this.put("5", "");
            this.put("6", "長月");
            this.put("7", "三日月");
            this.put("8", "");
            this.put("9", "吹雪");
            this.put("10", "白雪");
            this.put("11", "深雪");
            this.put("12", "磯波");
            this.put("13", "綾波");
            this.put("14", "敷波");
            this.put("15", "曙");
            this.put("16", "潮");
            this.put("17", "陽炎");
            this.put("18", "不知火");
            this.put("19", "黒潮");
            this.put("20", "雪風");
            this.put("21", "長良");
            this.put("22", "五十鈴");
            this.put("23", "由良");
            this.put("24", "大井");
            this.put("25", "北上");
            this.put("26", "扶桑");
            this.put("27", "山城");
            this.put("28", "皐月");
            this.put("29", "文月");
            this.put("30", "菊月");
            this.put("31", "望月");
            this.put("32", "初雪");
            this.put("33", "叢雲");
            this.put("34", "暁");
            this.put("35", "響");
            this.put("36", "雷");
            this.put("37", "電");
            this.put("38", "初春");
            this.put("39", "子日");
            this.put("40", "若葉");
            this.put("41", "初霜");
            this.put("42", "白露");
            this.put("43", "時雨");
            this.put("44", "村雨");
            this.put("45", "夕立");
            this.put("46", "五月雨");
            this.put("47", "涼風");
            this.put("48", "霰");
            this.put("49", "霞");
            this.put("50", "島風");
            this.put("51", "天龍");
            this.put("52", "龍田");
            this.put("53", "名取");
            this.put("54", "川内");
            this.put("55", "神通");
            this.put("56", "那珂");
            this.put("57", "大井改");
            this.put("58", "北上改");
            this.put("59", "古鷹");
            this.put("60", "加古");
            this.put("61", "青葉");
            this.put("62", "妙高");
            this.put("63", "那智");
            this.put("64", "足柄");
            this.put("65", "羽黒");
            this.put("66", "高雄");
            this.put("67", "愛宕");
            this.put("68", "摩耶");
            this.put("69", "鳥海");
            this.put("70", "最上");
            this.put("71", "利根");
            this.put("72", "筑摩");
            this.put("73", "最上改");
            this.put("74", "祥鳳");
            this.put("75", "飛鷹");
            this.put("76", "龍驤");
            this.put("77", "伊勢");
            this.put("78", "金剛");
            this.put("79", "榛名");
            this.put("80", "長門");
            this.put("81", "陸奥");
            this.put("82", "伊勢改");
            this.put("83", "赤城");
            this.put("84", "加賀");
            this.put("85", "霧島");
            this.put("86", "比叡");
            this.put("87", "日向");
            this.put("88", "日向改");
            this.put("89", "鳳翔");
            this.put("90", "蒼龍");
            this.put("91", "飛龍");
            this.put("92", "隼鷹");
            this.put("93", "朧");
            this.put("94", "漣");
            this.put("95", "朝潮");
            this.put("96", "大潮");
            this.put("97", "満潮");
            this.put("98", "荒潮");
            this.put("99", "球磨");
            this.put("100", "多摩");
            this.put("101", "木曾");
            this.put("102", "千歳");
            this.put("103", "千代田");
            this.put("104", "千歳改");
            this.put("105", "千代田改");
            this.put("106", "千歳甲");
            this.put("107", "千代田甲");
            this.put("108", "千歳航");
            this.put("109", "千代田航");
            this.put("110", "翔鶴");
            this.put("111", "瑞鶴");
            this.put("112", "瑞鶴改");
            this.put("113", "鬼怒");
            this.put("114", "阿武隈");
            this.put("115", "夕張");
            this.put("116", "瑞鳳");
            this.put("117", "瑞鳳改");
            this.put("118", "大井改二");
            this.put("119", "北上改二");
            this.put("120", "三隈");
            this.put("121", "三隈改");
            this.put("122", "舞風");
            this.put("123", "衣笠");
            this.put("124", "鈴谷");
            this.put("125", "熊野");
            this.put("126", "伊168");
            this.put("127", "伊58");
            this.put("128", "");
            this.put("129", "鈴谷改");
            this.put("130", "熊野改");
            this.put("131", "大和");
            this.put("132", "");
            this.put("133", "");
            this.put("134", "");
            this.put("135", "");
            this.put("136", "大和改");
            this.put("137", "");
            this.put("138", "");
            this.put("139", "");
            this.put("140", "");
            this.put("141", "");
            this.put("142", "");
            this.put("143", "");
            this.put("144", "");
            this.put("145", "");
            this.put("146", "");
            this.put("147", "");
            this.put("148", "");
            this.put("149", "");
            this.put("150", "");
            this.put("151", "");
            this.put("152", "");
            this.put("153", "");
            this.put("154", "");
            this.put("155", "");
            this.put("156", "");
            this.put("157", "");
            this.put("158", "");
            this.put("159", "");
            this.put("160", "");
            this.put("161", "");
            this.put("162", "");
            this.put("163", "");
            this.put("164", "");
            this.put("165", "");
            this.put("166", "");
            this.put("167", "");
            this.put("168", "");
            this.put("169", "");
            this.put("170", "");
            this.put("171", "");
            this.put("172", "");
            this.put("173", "");
            this.put("174", "");
            this.put("175", "");
            this.put("176", "");
            this.put("177", "");
            this.put("178", "");
            this.put("179", "");
            this.put("180", "");
            this.put("181", "");
            this.put("182", "");
            this.put("183", "");
            this.put("184", "");
            this.put("185", "");
            this.put("186", "");
            this.put("187", "");
            this.put("188", "");
            this.put("189", "");
            this.put("190", "初風");
            this.put("191", "");
            this.put("192", "");
            this.put("193", "");
            this.put("194", "");
            this.put("195", "");
            this.put("196", "");
            this.put("197", "");
            this.put("198", "");
            this.put("199", "");
            this.put("200", "");
            this.put("201", "吹雪改");
            this.put("202", "白雪改");
            this.put("203", "初雪改");
            this.put("204", "深雪改");
            this.put("205", "叢雲改");
            this.put("206", "磯波改");
            this.put("207", "綾波改");
            this.put("208", "敷波改");
            this.put("209", "金剛改");
            this.put("210", "比叡改");
            this.put("211", "榛名改");
            this.put("212", "霧島改");
            this.put("213", "天龍改");
            this.put("214", "龍田改");
            this.put("215", "球磨改");
            this.put("216", "多摩改");
            this.put("217", "木曾改");
            this.put("218", "長良改");
            this.put("219", "五十鈴改");
            this.put("220", "由良改");
            this.put("221", "名取改");
            this.put("222", "川内改");
            this.put("223", "神通改");
            this.put("224", "那珂改");
            this.put("225", "陽炎改");
            this.put("226", "不知火改");
            this.put("227", "黒潮改");
            this.put("228", "雪風改");
            this.put("229", "島風改");
            this.put("230", "朧改");
            this.put("231", "曙改");
            this.put("232", "漣改");
            this.put("233", "潮改");
            this.put("234", "暁改");
            this.put("235", "響改");
            this.put("236", "雷改");
            this.put("237", "電改");
            this.put("238", "初春改");
            this.put("239", "子日改");
            this.put("240", "若葉");
            this.put("241", "初霜改");
            this.put("242", "白露改");
            this.put("243", "時雨改");
            this.put("244", "村雨改");
            this.put("245", "夕立改");
            this.put("246", "五月雨改");
            this.put("247", "涼風改");
            this.put("248", "朝潮改");
            this.put("249", "大潮改");
            this.put("250", "満潮改");
            this.put("251", "荒潮改");
            this.put("252", "霰改");
            this.put("253", "霞改");
            this.put("254", "睦月改");
            this.put("255", "如月改");
            this.put("256", "皐月改");
            this.put("257", "文月改");
            this.put("258", "長月改");
            this.put("259", "菊月改");
            this.put("260", "三日月改");
            this.put("261", "望月改");
            this.put("262", "古鷹改");
            this.put("263", "加古改");
            this.put("264", "青葉改");
            this.put("265", "妙高改");
            this.put("266", "那智改");
            this.put("267", "足柄改");
            this.put("268", "羽黒改");
            this.put("269", "高雄改");
            this.put("270", "愛宕改");
            this.put("271", "摩耶改");
            this.put("272", "鳥海改");
            this.put("273", "利根改");
            this.put("274", "筑摩改");
            this.put("275", "長門改");
            this.put("276", "陸奥改");
            this.put("277", "赤城改");
            this.put("278", "加賀改");
            this.put("279", "蒼龍改");
            this.put("280", "飛龍改");
            this.put("281", "龍驤改");
            this.put("282", "祥鳳改");
            this.put("283", "飛鷹改");
            this.put("284", "隼鷹改");
            this.put("285", "鳳翔改");
            this.put("286", "扶桑改");
            this.put("287", "山城改");
            this.put("288", "翔鶴改");
            this.put("289", "鬼怒改");
            this.put("290", "阿武隈改");
            this.put("291", "千歳航改");
            this.put("292", "千代田航改");
            this.put("293", "夕張改");
            this.put("294", "舞風改");
            this.put("295", "衣笠改");
            this.put("296", "千歳航改二");
            this.put("297", "千代田航改二");
            this.put("298", "");
            this.put("299", "");
            this.put("300", "初風改");
            this.put("301", "");
            this.put("302", "");
            this.put("303", "");
            this.put("304", "");
            this.put("305", "");
            this.put("306", "");
            this.put("307", "");
            this.put("308", "");
            this.put("309", "");
            this.put("310", "");
            this.put("311", "");
            this.put("312", "");
            this.put("313", "");
            this.put("314", "");
            this.put("315", "");
            this.put("316", "");
            this.put("317", "");
            this.put("318", "");
            this.put("319", "");
            this.put("320", "");
            this.put("321", "");
            this.put("322", "");
            this.put("323", "");
            this.put("324", "");
            this.put("325", "");
            this.put("326", "");
            this.put("327", "");
            this.put("328", "");
            this.put("329", "");
            this.put("330", "");
            this.put("331", "");
            this.put("332", "");
            this.put("333", "");
            this.put("334", "");
            this.put("335", "");
            this.put("336", "");
            this.put("337", "");
            this.put("338", "");
            this.put("339", "");
            this.put("340", "");
            this.put("341", "");
            this.put("342", "");
            this.put("343", "");
            this.put("344", "");
            this.put("345", "");
            this.put("346", "");
            this.put("347", "");
            this.put("348", "");
            this.put("349", "");
            this.put("350", "");
            this.put("351", "");
            this.put("352", "");
            this.put("353", "");
            this.put("354", "");
            this.put("355", "");
            this.put("356", "");
            this.put("357", "");
            this.put("358", "");
            this.put("359", "");
            this.put("360", "");
            this.put("361", "");
            this.put("362", "");
            this.put("363", "");
            this.put("364", "");
            this.put("365", "");
            this.put("366", "");
            this.put("367", "");
            this.put("368", "");
            this.put("369", "");
            this.put("370", "");
            this.put("371", "");
            this.put("372", "");
            this.put("373", "");
            this.put("374", "");
            this.put("375", "");
            this.put("376", "");
            this.put("377", "");
            this.put("378", "");
            this.put("379", "");
            this.put("380", "");
            this.put("381", "");
            this.put("382", "");
            this.put("383", "");
            this.put("384", "");
            this.put("385", "");
            this.put("386", "");
            this.put("387", "");
            this.put("388", "");
            this.put("389", "");
            this.put("390", "");
            this.put("391", "");
            this.put("392", "");
            this.put("393", "");
            this.put("394", "");
            this.put("395", "");
            this.put("396", "");
            this.put("397", "");
            this.put("398", "伊168改");
            this.put("399", "伊58改");
            this.put("400", "");
            this.put("401", "");
            this.put("402", "");
            this.put("403", "");
            this.put("404", "");
            this.put("405", "");
            this.put("406", "");
            this.put("407", "");
            this.put("408", "");
            this.put("409", "");
            this.put("410", "");
            this.put("411", "");
            this.put("412", "");
            this.put("413", "");
            this.put("414", "");
            this.put("415", "");
            this.put("416", "");
            this.put("417", "");
            this.put("418", "");
            this.put("419", "");
            this.put("420", "");
            this.put("421", "");
            this.put("422", "");
            this.put("423", "");
            this.put("424", "");
            this.put("425", "");
            this.put("426", "");
            this.put("427", "");
            this.put("428", "");
            this.put("429", "");
            this.put("430", "");
            this.put("431", "");
            this.put("432", "");
            this.put("433", "");
            this.put("434", "");
            this.put("435", "");
            this.put("436", "");
            this.put("437", "");
            this.put("438", "");
            this.put("439", "");
            this.put("440", "");
            this.put("441", "");
            this.put("442", "");
            this.put("443", "");
            this.put("444", "");
            this.put("445", "");
            this.put("446", "");
            this.put("447", "");
            this.put("448", "");
            this.put("449", "");
            this.put("450", "");
            this.put("451", "");
            this.put("452", "");
            this.put("453", "");
            this.put("454", "");
            this.put("455", "");
            this.put("456", "");
            this.put("457", "");
            this.put("458", "");
            this.put("459", "");
            this.put("460", "");
            this.put("461", "");
            this.put("462", "");
            this.put("463", "");
            this.put("464", "");
            this.put("465", "");
            this.put("466", "");
            this.put("467", "");
            this.put("468", "");
            this.put("469", "");
            this.put("470", "");
            this.put("471", "");
            this.put("472", "");
            this.put("473", "");
            this.put("474", "");
            this.put("475", "");
            this.put("476", "");
            this.put("477", "");
            this.put("478", "");
            this.put("479", "");
            this.put("480", "");
            this.put("481", "");
            this.put("482", "");
            this.put("483", "");
            this.put("484", "");
            this.put("485", "");
            this.put("486", "");
            this.put("487", "");
            this.put("488", "");
            this.put("489", "");
            this.put("490", "");
            this.put("491", "");
            this.put("492", "");
            this.put("493", "");
            this.put("494", "");
            this.put("495", "");
            this.put("496", "");
            this.put("497", "");
            this.put("498", "");
            this.put("499", "");
            this.put("500", "");
        }
    };

    /**
     * 艦娘を取得します
     * 
     * @param id ID
     * @return 艦娘
     */
    public static String get(String id) {
        return SHIP.get(id);
    }
}
