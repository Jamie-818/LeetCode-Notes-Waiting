import lc.LcUtils;

import java.util.Arrays;

/**
 * 503. 下一个更大元素 II
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。数字 x
 * 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1。
 *
 * 链接：https://leetcode-cn.com/problems/next-greater-element-ii
 */
public class LC503_template {

    public int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];
        // start

        // end
        return res;
    }

    public static void main(String[] args) {
        String data = "[1,2,1]";
        int[] oneIntArr = LcUtils.oneIntArrFactory(data);
        LC503_template lc503_template = new LC503_template();
        LC503_0 lc503_0 = new LC503_0();
        int[] ints = lc503_template.nextGreaterElements(oneIntArr);
        int[] yesResult = lc503_0.nextGreaterElements(oneIntArr);
        System.out.println("算法输出为：" + Arrays.toString(ints));
        System.out.println("正确输出为：" + Arrays.toString(yesResult));

    }

}
