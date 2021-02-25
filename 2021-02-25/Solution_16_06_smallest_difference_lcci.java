import java.util.Arrays;

/**
 * 给定两个整数数组a和b，计算具有最小差绝对值的一对数值（每个数组中取一个值），并返回该对数值的差
 * https://leetcode-cn.com/problems/smallest-difference-lcci/
 * 示例：
 *
 * 输入：{1, 3, 15, 11, 2}, {23, 127, 235, 19, 8}
 * 输出：3，即数值对(11, 8)
 * @author jamie
 * @date 2021/2/25 16:26
 */
public class Solution_16_06_smallest_difference_lcci {

    /**
     * 题目简单，但是有两点需要注意
     * 1。不能用双重for循环，因为会超时，要用双指针减少遍历次数。
     * 2。要注意int运算超过最大值导致的溢出，运算要转成long运算
     */
    public int smallestDifference(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int aIndex = 0;
        int bIndex = 0;
        long abs = Integer.MAX_VALUE;
        while(aIndex < a.length && bIndex < b.length){
            int i = a[aIndex];
            int y = b[bIndex];
            if(i == y){
                return 0;
            }else if(i > y){
                abs = (Math.min(((long)i - (long)y), abs));
                bIndex++;
            }else{
                abs = (Math.min(((long)y - (long)i), abs));
                aIndex++;
            }
        }
        return (int)abs;
    }

    public static void main(String[] args) {
        //[-2147483648,1]
        //[2147483647,0]
        IntArrOneFactory intArrOneFactory = new IntArrOneFactory();
        int[] produce = intArrOneFactory.produce("[0]");
        int[] produce1 = intArrOneFactory.produce("[2147483647]");
        Solution_16_06_smallest_difference_lcci solution = new Solution_16_06_smallest_difference_lcci();
        int i = solution.smallestDifference(produce, produce1);
        System.out.println(i);

    }

}
