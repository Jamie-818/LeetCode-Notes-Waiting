package lc557;

public class lc557_1 {

    /**
     * 字符串切割 + 前后交换
     * 时间复杂度O(N)：取决于字符串的长度
     * 空间复杂度O(N)：取决于单次数
     * @param s 字符串
     */
    public String reverseWords(String s) {
        // 先用空格切割成单词数组
        String[] workArray = s.split(" ");
        StringBuilder ret = new StringBuilder();
        // 遍历每个单词
        for(String work: workArray){
            // 把单词转成char数组
            char[] chars = work.toCharArray();
            int length = chars.length;
            // 使用前后交换
            for(int i = 0; i < length / 2; i++){
                char temp = chars[i];
                chars[i] = chars[length - 1 - i];
                chars[length - 1 - i] = temp;
            }
            // 再拼接回去
            ret.append(chars).append(" ");
        }
        return ret.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        lc557_1 lc557 = new lc557_1();
        String result = lc557.reverseWords(s);
        System.out.println(result);
        String yesResult = "s'teL ekat edoCteeL tsetnoc";
        System.out.println(yesResult);
        System.out.println(yesResult.equals(result));
    }

}
