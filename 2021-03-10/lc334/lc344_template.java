package lc334;

public class lc344_template {

    /**
     * 1、对称交换 while
     * 2、对称交换 for
     * @param s 入参数组
     */
    public void reverseString(char[] s) {

    }

    public static void main(String[] args) {
        String demo = "hello";
        char[] chars = demo.toCharArray();
        lc344_template lc334 = new lc344_template();
        lc334.reverseString(chars);
        System.out.println(String.valueOf(chars));
        System.out.println("olleh".equals(String.valueOf(chars)));
    }

}