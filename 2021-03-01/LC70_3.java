

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
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author jamie
 * @date 2021/3/1 17:48
 */
public class LC70_3 {

    /**
     * 交换法，交换刚刚计算过前后的值，达到前两位数相加的效果
     * @param n 楼梯数
     */
    public int climbStairs(int n) {
        if(n == 0 || n == 1 || n == 2){
            return n;
        }
        // 假设a是第一个阶梯,b是第二个阶梯
        int a = 1;
        int b = 2;
        // count 用于记录总数
        int c = 0;
        // 因为前面已经有两个台阶了，所以从3算起
        for(int i = 3; i <= n; i++){
            // c是当前台阶，也就是前两台阶相加
            c = a + b;
            // 然后把前两个台阶各自提前一个台阶
            a = b;
            b = c;
        }
        // 最终计算完，c就是当前台阶的数
        return c;
    }

    public static void main(String[] args) {
        LC70_3 solution = new LC70_3();
        for(int i = 0; i <= 10; i++){
            int i1 = solution.climbStairs(i);
            System.out.println(i + ":---" + i1);
        }
        //        0:---0
        //        1:---1
        //        2:---2
        //        3:---3
        //        4:---5
        //        5:---8
        //        6:---13
        //        7:---21
        //        8:---34
        //        9:---55
        //        10:---89
    }

}
