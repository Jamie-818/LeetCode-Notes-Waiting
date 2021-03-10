package lc70;

/**
 * 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 *
 * 示例 2：
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 * @author jamie
 */
public class LC70_template {

    /**
     * 1、动态规划（用数组）
     * 2、交换法
     * @param n 楼梯数
     */
    public int climbStairs(int n) {
        // start

        // end
        return 0;
    }

    public static void main(String[] args) {
        LC70_1 lc70_1 = new LC70_1();
        LC70_template solution = new LC70_template();
        for(int i = 0; i <= 10; i++){
            int result = solution.climbStairs(i);
            int yesResult = lc70_1.climbStairs(i);
            System.out.println("目前楼梯数为：" + i + "，正确答案为：" + yesResult + "，输出答案为：" + result + "，是否正确：" + (yesResult
                    == result));
        }
    }

}
