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
        // 假如i=0，也就是首字符，则length-1-0,则是最后一个字符的下标。
        // 也即是，假如是hello，则h和o交换，e和l交换即可。只需要交换一半的元素
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