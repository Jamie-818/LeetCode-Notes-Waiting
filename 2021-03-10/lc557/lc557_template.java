package lc557;

public class lc557_template {

    /**
     * 1、字符串切割 + 前后交换
     * 2、从头截取单词从头到尾处理
     * @param s 字符串
     */
    public String reverseWords(String s) {
        return "";
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        lc557_template lc557 = new lc557_template();
        String result = lc557.reverseWords(s);
        System.out.println(result);
        String yesResult = "s'teL ekat edoCteeL tsetnoc";
        System.out.println(yesResult);
        System.out.println(yesResult.equals(result));
    }

}
