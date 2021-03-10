package lc334;

public class lc334_1 {

    /**
     * 对称交换
     * @param s 入参数组
     */
    public void reverseString(char[] s) {
        int length = s.length;
        for(int i = 0; i < length / 2; i++){
            char temp = s[i];
            s[i] = s[length - 1 - i];
            s[length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        String demo = "hello";
        char[] chars = demo.toCharArray();
        lc334_1 lc334 = new lc334_1();
        lc334.reverseString(chars);
        System.out.println(chars);
    }

}