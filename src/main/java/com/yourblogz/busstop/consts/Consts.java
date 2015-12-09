package com.yourblogz.busstop.consts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public interface Consts {
    /**
     * 获取线路uid请求路径
     */
    static String BUSSTOP_UID_REQUEST_URL = "http://api.map.baidu.com/?qt=bl&c=%d&wd=%s&ie=utf-8&oue=1&fromproduct=jsapi&res=api";
    /**
     * 获取具体公交站点请求
     */
    static String BUSLINE_REQUEST_URL = "http://api.map.baidu.com/?qt=bsl&c=%d&uid=%s&ie=utf-8&oue=1&fromproduct=jsapi&res=api";
    /**
     * 获取公交站信息位置请求
     */
    static String BUSSTOP_LOCATION_REQUEST_URL = "http://api.map.baidu.com/?qt=s&c=%d&wd=%s&rn=10&ie=utf-8&oue=1&res=api";
    /**
     * 类型代号：公交车站主点
     */
    static int CATALOG_BUSSTOP = 524;
    
    @SuppressWarnings("serial")
    static Map<Integer, String> CITY_MAP = Collections.unmodifiableMap(new HashMap<Integer, String>(){{
        this.put(100, "拉萨市");
        this.put(101, "那曲地区");
        this.put(102, "日喀则地区");
        this.put(103, "阿里地区");
        this.put(104, "昆明市");
        this.put(105, "楚雄彝族自治州");
        this.put(106, "玉溪市");
        this.put(107, "红河哈尼族彝族自治州");
        this.put(108, "普洱市");
        this.put(109, "西双版纳傣族自治州");
        this.put(110, "临沧市");
        this.put(111, "大理白族自治州");
        this.put(112, "保山市");
        this.put(113, "怒江傈僳族自治州");
        this.put(114, "丽江市");
        this.put(115, "迪庆藏族自治州");
        this.put(116, "德宏傣族景颇族自治州");
        this.put(117, "张掖市");
        this.put(118, "武威市");
        this.put(119, "东莞市");
        this.put(120, "东沙群岛");
        this.put(121, "三亚市");
        this.put(122, "鄂州市");
        this.put(123, "乌海市");
        this.put(124, "莱芜市");
        this.put(125, "海口市");
        this.put(126, "蚌埠市");
        this.put(1277, "河南省直辖县级行政单位");
        this.put(1277, "济源市");
        this.put(127, "合肥市");
        this.put(128, "阜阳市");
        this.put(129, "芜湖市");
        this.put(130, "安庆市");
        this.put(131, "北京市");
        this.put(132, "重庆市");
        this.put(133, "南平市");
        this.put(134, "泉州市");
        this.put(135, "庆阳市");
        this.put(136, "定西市");
        this.put(137, "韶关市");
        this.put(138, "佛山市");
        this.put(139, "茂名市");
        this.put(140, "珠海市");
        this.put(141, "梅州市");
        this.put(142, "桂林市");
        this.put(143, "河池市");
        this.put(144, "崇左市");
        this.put(145, "钦州市");
        this.put(146, "贵阳市");
        this.put(147, "六盘水市");
        this.put(148, "秦皇岛市");
        this.put(149, "沧州市");
        this.put(150, "石家庄市");
        this.put(151, "邯郸市");
        this.put(152, "新乡市");
        this.put(153, "洛阳市");
        this.put(154, "商丘市");
        this.put(155, "许昌市");
        this.put(156, "襄樊市");
        this.put(157, "荆州市");
        this.put(158, "长沙市");
        this.put(159, "衡阳市");
        this.put(160, "镇江市");
        this.put(161, "南通市");
        this.put(162, "淮安市");
        this.put(163, "南昌市");
        this.put(164, "新余市");
        this.put(165, "通化市");
        this.put(166, "锦州市");
        this.put(167, "大连市");
        this.put(168, "乌兰察布市");
        this.put(169, "巴彦淖尔市");
        this.put(170, "渭南市");
        this.put(171, "宝鸡市");
        this.put(172, "枣庄市");
        this.put(173, "日照市");
        this.put(174, "东营市");
        this.put(175, "威海市");
        this.put(176, "太原市");
        this.put(177, "文山壮族苗族自治州");
        this.put(178, "温州市");
        this.put(179, "杭州市");
        this.put(180, "宁波市");
        this.put(181, "中卫市");
        this.put(182, "临夏回族自治州");
        this.put(183, "辽源市");
        this.put(184, "抚顺市");
        this.put(185, "阿坝藏族羌族自治州");
        this.put(186, "宜宾市");
        this.put(187, "中山市");
        this.put(188, "亳州市");
        this.put(189, "滁州市");
        this.put(190, "宣城市");
        this.put(191, "廊坊市");
        this.put(192, "宁德市");
        this.put(193, "龙岩市");
        this.put(194, "厦门市");
        this.put(195, "莆田市");
        this.put(196, "天水市");
        this.put(197, "清远市");
        this.put(198, "湛江市");
        this.put(199, "阳江市");
        this.put(200, "河源市");
        this.put(201, "潮州市");
        this.put(202, "来宾市");
        this.put(203, "百色市");
        this.put(204, "防城港市");
        this.put(205, "铜仁地区");
        this.put(206, "毕节地区");
        this.put(207, "承德市");
        this.put(208, "衡水市");
        this.put(209, "濮阳市");
        this.put(210, "开封市");
        this.put(211, "焦作市");
        this.put(212, "三门峡市");
        this.put(213, "平顶山市");
        this.put(214, "信阳市");
        this.put(215, "鹤壁市");
        this.put(216, "十堰市");
        this.put(217, "荆门市");
        this.put(218, "武汉市");
        this.put(219, "常德市");
        this.put(220, "岳阳市");
        this.put(221, "娄底市");
        this.put(222, "株洲市");
        this.put(223, "盐城市");
        this.put(224, "苏州市");
        this.put(225, "景德镇市");
        this.put(226, "抚州市");
        this.put(227, "本溪市");
        this.put(228, "盘锦市");
        this.put(229, "包头市");
        this.put(230, "阿拉善盟");
        this.put(231, "榆林市");
        this.put(232, "铜川市");
        this.put(233, "西安市");
        this.put(234, "临沂市");
        this.put(235, "滨州市");
        this.put(236, "青岛市");
        this.put(237, "朔州市");
        this.put(238, "晋中市");
        this.put(239, "巴中市");
        this.put(240, "绵阳市");
        this.put(241, "广安市");
        this.put(242, "资阳市");
        this.put(243, "衢州市");
        this.put(244, "台州市");
        this.put(245, "舟山市");
        this.put(246, "固原市");
        this.put(247, "甘南藏族自治州");
        this.put(248, "内江市");
        this.put(249, "曲靖市");
        this.put(250, "淮南市");
        this.put(251, "巢湖市");
        this.put(252, "黄山市");
        this.put(253, "淮北市");
        this.put(254, "三明市");
        this.put(255, "漳州市");
        this.put(256, "陇南市");
        this.put(257, "广州市");
        this.put(258, "云浮市");
        this.put(259, "揭阳市");
        this.put(260, "贺州市");
        this.put(261, "南宁市");
        this.put(262, "遵义市");
        this.put(263, "安顺市");
        this.put(264, "张家口市");
        this.put(265, "唐山市");
        this.put(266, "邢台市");
        this.put(267, "安阳市");
        this.put(268, "郑州市");
        this.put(269, "驻马店市");
        this.put(270, "宜昌市");
        this.put(271, "黄冈市");
        this.put(272, "益阳市");
        this.put(273, "邵阳市");
        this.put(274, "湘西土家族苗族自治州");
        this.put(275, "郴州市");
        this.put(276, "泰州市");
        this.put(277, "宿迁市");
        this.put(278, "宜春市");
        this.put(279, "鹰潭市");
        this.put(280, "朝阳市");
        this.put(281, "营口市");
        this.put(282, "丹东市");
        this.put(283, "鄂尔多斯市");
        this.put(284, "延安市");
        this.put(285, "商洛市");
        this.put(286, "济宁市");
        this.put(287, "潍坊市");
        this.put(288, "济南市");
        this.put(289, "上海市");
        this.put(290, "晋城市");
        this.put(2911, "澳门特别行政区");
        this.put(2912, "香港特别行政区");
        this.put(291, "南充市");
        this.put(292, "丽水市");
        this.put(293, "绍兴市");
        this.put(294, "湖州市");
        this.put(295, "北海市");
        this.put(296, "海南省直辖县级行政单位");
        this.put(297, "赤峰市");
        this.put(298, "六安市");
        this.put(299, "池州市");
        this.put(300, "福州市");
        this.put(301, "惠州市");
        this.put(302, "江门市");
        this.put(303, "汕头市");
        this.put(304, "梧州市");
        this.put(305, "柳州市");
        this.put(306, "黔南布依族苗族自治州");
        this.put(307, "保定市");
        this.put(308, "周口市");
        this.put(309, "南阳市");
        this.put(310, "孝感市");
        this.put(311, "黄石市");
        this.put(312, "张家界市");
        this.put(313, "湘潭市");
        this.put(314, "永州市");
        this.put(315, "南京市");
        this.put(316, "徐州市");
        this.put(317, "无锡市");
        this.put(318, "吉安市");
        this.put(319, "葫芦岛市");
        this.put(320, "鞍山市");
        this.put(321, "呼和浩特市");
        this.put(322, "吴忠市");
        this.put(323, "咸阳市");
        this.put(324, "安康市");
        this.put(325, "泰安市");
        this.put(326, "烟台市");
        this.put(327, "吕梁市");
        this.put(328, "运城市");
        this.put(329, "广元市");
        this.put(330, "遂宁市");
        this.put(331, "泸州市");
        this.put(332, "天津市");
        this.put(333, "金华市");
        this.put(334, "嘉兴市");
        this.put(335, "石嘴山市");
        this.put(336, "昭通市");
        this.put(337, "铜陵市");
        this.put(338, "肇庆市");
        this.put(339, "汕尾市");
        this.put(33, "嘉峪关市");
        this.put(340, "深圳市");
        this.put(341, "贵港市");
        this.put(342, "黔东南苗族侗族自治州");
        this.put(343, "黔西南布依族苗族自治州");
        this.put(344, "漯河市");
        this.put(345, "湖北省直辖县级行政单位");
        this.put(346, "扬州市");
        this.put(347, "连云港市");
        this.put(348, "常州市");
        this.put(349, "九江市");
        this.put(34, "金昌市");
        this.put(350, "萍乡市");
        this.put(351, "辽阳市");
        this.put(352, "汉中市");
        this.put(353, "菏泽市");
        this.put(354, "淄博市");
        this.put(355, "大同市");
        this.put(356, "长治市");
        this.put(357, "阳泉市");
        this.put(358, "马鞍山市");
        this.put(359, "平凉市");
        this.put(35, "白银市");
        this.put(360, "银川市");
        this.put(361, "玉林市");
        this.put(362, "咸宁市");
        this.put(363, "怀化市");
        this.put(364, "上饶市");
        this.put(365, "赣州市");
        this.put(366, "聊城市");
        this.put(367, "忻州市");
        this.put(368, "临汾市");
        this.put(369, "达州市");
        this.put(36, "兰州市");
        this.put(370, "宿州市");
        this.put(371, "随州市");
        this.put(372, "德州市");
        this.put(373, "恩施土家族苗族自治州");
        this.put(37, "酒泉市");
        this.put(38, "大兴安岭地区");
        this.put(39, "黑河市");
        this.put(40, "伊春市");
        this.put(41, "齐齐哈尔市");
        this.put(42, "佳木斯市");
        this.put(43, "鹤岗市");
        this.put(44, "绥化市");
        this.put(45, "双鸭山市");
        this.put(46, "鸡西市");
        this.put(47, "七台河市");
        this.put(48, "哈尔滨市");
        this.put(49, "牡丹江市");
        this.put(50, "大庆市");
        this.put(51, "白城市");
        this.put(52, "松原市");
        this.put(53, "长春市");
        this.put(54, "延边朝鲜族自治州");
        this.put(55, "吉林市");
        this.put(56, "四平市");
        this.put(57, "白山市");
        this.put(58, "沈阳市");
        this.put(59, "阜新市");
        this.put(60, "铁岭市");
        this.put(61, "呼伦贝尔市");
        this.put(62, "兴安盟");
        this.put(63, "锡林郭勒盟");
        this.put(64, "通辽市");
        this.put(65, "海西蒙古族藏族自治州");
        this.put(66, "西宁市");
        this.put(67, "海北藏族自治州");
        this.put(68, "海南藏族自治州");
        this.put(69, "海东地区");
        this.put(70, "黄南藏族自治州");
        this.put(71, "玉树藏族自治州");
        this.put(72, "果洛藏族自治州");
        this.put(73, "甘孜藏族自治州");
        this.put(74, "德阳市");
        this.put(75, "成都市");
        this.put(76, "雅安市");
        this.put(77, "眉山市");
        this.put(78, "自贡市");
        this.put(79, "乐山市");
        this.put(80, "凉山彝族自治州");
        this.put(81, "攀枝花市");
        this.put(82, "和田地区");
        this.put(83, "喀什地区");
        this.put(84, "克孜勒苏柯尔克孜自治州");
        this.put(85, "阿克苏地区");
        this.put(86, "巴音郭楞蒙古自治州");
        this.put(87, "新疆直辖县级行政单位");
        this.put(87, "新疆维吾尔自治区直辖县级行政单位");
        this.put(88, "博尔塔拉蒙古自治州");
        this.put(89, "吐鲁番地区");
        this.put(90, "伊犁哈萨克自治州");
        this.put(91, "哈密地区");
        this.put(92, "乌鲁木齐市");
        this.put(93, "昌吉回族自治州");
        this.put(94, "塔城地区");
        this.put(95, "克拉玛依市");
        this.put(96, "阿勒泰地区");
        this.put(97, "山南地区");
        this.put(98, "林芝地区");
        this.put(99, "昌都地区");
    }});
}
