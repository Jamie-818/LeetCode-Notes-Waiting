package lc169;

import java.util.Arrays;

/**
 * LC169. 多数元素
 * @author jamie
 */
public class lc169_1 {

    /**
     * 排序法
     * 时间复杂度：`O(nlogn)`。将数组排序的时间复杂度为 `O(nlogn)`。
     * 空间复杂度：`O(logn)`。如果使用语言自带的排序算法，需要使用 `O(logn)` 的栈空间。如果自己编写堆排序，则只需要使用 `O(1)` 的额外空间。
     * @param nums 数组
     */
    public int majorityElement(int[] nums) {
        // 排序
        Arrays.sort(nums);
        // 中间数一定是多数
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        lc169_1 lc169 = new lc169_1();
        int i = lc169.majorityElement(nums);
        System.out.println(i);
    }

}