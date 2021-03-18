package lc169;

/**
 * LC169. 多数元素
 * @author jamie
 */
public class lc169_2 {

    /**
     * 投票法
     * 时间复杂度：`O(n)`。Boyer-Moore 算法只对数组进行一次遍历。
     * 空间复杂度：`O(1)`。Boyer-Moore 算法只需要常数级别的额外空间。
     * @param nums 数组
     */
    public int majorityElement(int[] nums) {
        // 选举人
        int candidate = 0;
        // 票数
        int count = 0;
        for(int num: nums){
            if(count == 0){
                // 当票数为0的时候，换选举人
                candidate = num;
            }
            count += (candidate == num) ? 1 : -1;
        }
        // 最后没换下来的选举人就是结果
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        lc169_2 lc169 = new lc169_2();
        int i = lc169.majorityElement(nums);
        System.out.println(i);
    }

}