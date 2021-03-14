package lc136;

import lc.LcUtils;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @author jamie
 */
public class lc136_1 {

    /**
     * 异或运算:当遇到相通的数字时，会变成0, 如：0^0=0  1^1=0  1^0=1  0^1=1
     * 时间复杂度 `O(n)` : 其中n是数组长度，只需队数组遍历一遍
     * 空间复杂度 `O(1)`
     * @param nums 非空数组
     */
    public int singleNumber(int[] nums) {
        int single = 0;
        for(int num: nums){
            single = single ^ num;
        }
        return single;
    }

    public static void main(String[] args) {
        String s = "[2,2,1]";
        int[] nums = LcUtils.oneIntArrFactory(s);
        lc136_1 lc135 = new lc136_1();
        int result = lc135.singleNumber(nums);
        System.out.println("正确答案为：1");
        System.out.println("算法输出为：" + result);

    }

}
