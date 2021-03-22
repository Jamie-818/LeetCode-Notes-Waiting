package lc27;

/**
 * 移除元素
 * https://leetcode-cn.com/problems/remove-element/
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * @author jamie
 */
public class lc27_2 {

    /**
     * 双指针 - 遇到删除的元素时，把数组最后一个元素覆盖删除元素的位置，这样就等于完成了把元素删除的功能。适合于当删除的元素很少的情况
     * 当我们遇到 nums[i] = val 时，我们可以将当前元素与最后一个元素进行交换，并释放最后一个元素。这实际上使数组的大小减少了 1。
     * 交换后因为i指针并没有增加，所以还会继续判断交换后当前下标的新值，所以不会漏数据。
     * 直到i=缩减后的len，说明所有元素已经检查完毕。i也是最终数组的长度。
     * 时间复杂度 `O(n)` ：需要循环的次数为数组的长度。
     * 空间复杂度 `O(1)` ：只需要创建一个返回值的空间。
     * @param nums 待移除的数组
     * @param val  需要移除的元素值
     */
    public int removeElement(int[] nums, int val) {
        // 定义一个计数器(也是需要移除元素的指针)
        int i = 0;
        int len = nums.length;
        // 指针不断增加，当匹配到删除的元素时，数组长度len也会不断减少。
        while(i < len){
            if(nums[i] == val){
                // 遇到需要删除的元素时，把最后一个元素给覆盖到当前位置。
                // 因为遇到删除的元素了，所以数组的长度也要对应的减去，继续下次循环
                nums[i] = nums[len - 1];
                len--;
            }else{
                // 当前元素不是需要删除的元素时，把i指针向后挪一位，继续下次循环。
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        lc27_2 lc27 = new lc27_2();
        int i = lc27.removeElement(nums, val);
        System.out.println("正确答案为: 2");
        System.out.println("算法输出为：" + i);

    }

}
