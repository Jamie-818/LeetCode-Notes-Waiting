package lc136;

import lc.LcUtils;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @author jamie
 */
public class lc135_template {

    /**
     * 异或运算
     * @param nums 非空数组
     */
    public int singleNumber(int[] nums) {

        return 0;
    }

    public static void main(String[] args) {
        String s = "[2,2,1]";
        int[] nums = LcUtils.oneIntArrFactory(s);
        lc135_template lc135 = new lc135_template();
        int result = lc135.singleNumber(nums);
        System.out.println("正确答案为：1");
        System.out.println("算法输出为：" + result);

    }

}
