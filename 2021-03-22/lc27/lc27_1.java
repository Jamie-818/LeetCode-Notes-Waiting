package lc27;

/**
 * 移除元素
 * https://leetcode-cn.com/problems/remove-element/
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * @author jamie
 */
public class lc27_1 {

    /**
     * 双指针 - 把不需要删除的元素往前移动
     * 当nums[i]和val不相等时，我们就复制num[i]到num[count]的位置,覆盖需要移除的元素的位置。
     * 直到i等于数组的长度，同时count也是新数组的长度。
     * 时间复杂度 `O(n)` ：需要循环的次数为数组的长度。
     * 空间复杂度 `O(1)` ：只需要创建一个返回值的空间。
     * @param nums 待移除的数组
     * @param val  需要移除的元素值
     */
    public int removeElement(int[] nums, int val) {
        // 定义一个计数器(也是需要移除元素的指针)
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            // 不等，说明该元素不需要移除
            if(nums[i] != val){
                // 把不需要移除的元素移到全面，覆盖需要移除的元素的位置。
                nums[count] = nums[i];
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        lc27_1 lc27 = new lc27_1();
        int i = lc27.removeElement(nums, val);
        System.out.println("正确答案为: 2");
        System.out.println("算法输出为：" + i);

    }

}
