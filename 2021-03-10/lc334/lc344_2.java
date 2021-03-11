package lc334;

public class lc344_2 {

    /**
     * 对称交换 - while
     * @param s 入参数组
     */
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;

        }
    }

    public static void main(String[] args) {
        String demo = "hello";
        char[] chars = demo.toCharArray();
        lc344_2 lc334 = new lc344_2();
        lc334.reverseString(chars);
        System.out.println(String.valueOf(chars));
        System.out.println("olleh".equals(String.valueOf(chars)));
    }

}