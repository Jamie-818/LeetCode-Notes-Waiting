package lc27;

/**
 * 移除元素
 * https://leetcode-cn.com/problems/remove-element/
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * @author jamie
 */
public class lc27_template {

    /**
     * 1、双指针 - 判断 nums[i] == val
     * 2、双指针 - 判断 nums[i] != val
     * @param nums 待移除的数组
     * @param val  需要移除的元素值
     */
    public int removeElement(int[] nums, int val) {
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        lc27_template lc27 = new lc27_template();
        int i = lc27.removeElement(nums, val);
        System.out.println("正确答案为: 2");
        System.out.println("算法输出为：" + i);

    }

}
