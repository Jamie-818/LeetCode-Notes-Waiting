/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author jamie
 * @date 2021/2/28 21:19
 */
public class LC_53_0 {

    public int maxSubArray(int[] nums) {
        // 前面计算累计的最大值
        int pre = 0;
        // 最终的最大值;
        int maxCount = nums[0];
        for(int num: nums){
            // 把前面累计的最大值和现在遍历到的值进行对比，拿到最大值
            pre = Math.max(pre + num, num);
            // 把最大值存入maxCount
            maxCount = Math.max(pre, maxCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String s = "[-2,1,-3,4,-1,2,1,-5,4]";
        LC_53_0 lc530 = new LC_53_0();
        IntArrOneFactory intArrOneFactory = new IntArrOneFactory();
        int[] produce = intArrOneFactory.produce(s);
        int i = lc530.maxSubArray(produce);
        System.out.println(i);
    }

}
