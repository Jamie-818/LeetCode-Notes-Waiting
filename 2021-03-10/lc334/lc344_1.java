package lc334;

public class lc344_1 {

    /**
     * 对称交换 - for
     * @param s 入参数组
     */
    public void reverseString(char[] s) {
        int length = s.length;
        int n = length / 2;
        for(int i = 0; i < n; i++){
            char temp = s[i];
            s[i] = s[length - 1 - i];
            s[length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        String demo = "hello";
        char[] chars = demo.toCharArray();
        lc344_1 lc334 = new lc344_1();
        lc334.reverseString(chars);
        System.out.println(chars);
    }

}