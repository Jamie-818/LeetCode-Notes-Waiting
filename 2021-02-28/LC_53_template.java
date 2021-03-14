/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * @author jamie
 */
public class LC_53_template {

    public int maxSubArray(int[] nums) {
        int countNum = nums[0];

        return countNum;
    }

    public static void main(String[] args) {
        String s = "[-2,1,-3,4,-1,2,1,-5,4]";
        LC_53_template lc530 = new LC_53_template();
        IntArrOneFactory intArrOneFactory = new IntArrOneFactory();
        int[] produce = intArrOneFactory.produce(s);
        int i = lc530.maxSubArray(produce);
        int yesNumber = (new LC_53_0()).maxSubArray(produce);
        if(i != yesNumber){
            System.out.println("算法错误！正确答案是：" + yesNumber);
        }else{
            System.out.println("算法正确！计算值为：" + i + ",答案是：" + yesNumber);
        }

    }

}
