import java.util.HashMap;
import java.util.Map;

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
public class LC70_climbing_stairs {

    /**
     * 传统递归法，会超时
     * @param n 楼梯数
     */
    public int climbStairs0(int n) {
        if(n == 0 || n == 1 || n == 2){
            return n;
        }
        return climbStairs0(n - 1) + climbStairs0(n - 2);
    }

    /**
     * 优化递归法，计算值记录记录
     * @param n 楼梯数
     */
    public int climbStairs1(int n) {
        if(n == 0 || n == 1 || n == 2){
            return n;
        }
        Map<Integer, Integer> recordMap = new HashMap<>(n + 1);
        recordMap.put(0, 0);
        recordMap.put(1, 1);
        recordMap.put(2, 2);
        return climbStairs1(recordMap, n - 1) + climbStairs1(recordMap, n - 2);
    }

    private int climbStairs1(Map<Integer, Integer> recordMap, int n) {
        if(recordMap.containsKey(n)){
            return recordMap.get(n);
        }
        return climbStairs1(recordMap, n - 1) + climbStairs1(recordMap, n - 2);
    }

    /**
     * 动态规划，使用数组
     * @param n 楼梯数
     */
    public int climbStairs(int n) {
        if(n == 0 || n == 1 || n == 2){
            return n;
        }
        int[] arrays = new int[n + 1];
        arrays[0] = 0;
        arrays[1] = 1;
        arrays[2] = 2;
        for(int i = 3; i <= n; i++){
            arrays[i] = arrays[i - 1] + arrays[i - 2];
        }
        return arrays[n];
    }

    /**
     * 交换法，交换刚刚计算过前后的值，达到前两位数相加的效果
     * @param n 楼梯数
     */
    public int climbStairs3(int n) {
        if(n == 0 || n == 1 || n == 2){
            return n;
        }
        // 假设a是第一个阶梯
        int a = 1;
        // 假设b是第二个阶梯
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
        LC70_climbing_stairs solution = new LC70_climbing_stairs();
        for(int i = 0; i <= 10; i++){
            int i1 = solution.climbStairs1(i);
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
        int i1 = solution.climbStairsMax(10, 2);
        System.out.println(i1);

    }

    /**
     * 扩展 每次最多能爬多少阶梯
     * @param n 楼梯数
     * @param m 每次最多爬多少阶
     */
    public int climbStairsMax(int n, int m) {
        if(n == 1 || n == 2){
            return n;
        }
        int[] arrays = new int[n + 1];
        arrays[0] = 1;
        arrays[1] = 1;
        for(int i = 2; i <= n; i++){
            int max = Math.min(i, m);
            for(int j = 1; j <= max; j++){
                arrays[i] = arrays[i] + arrays[i - j];
            }
        }

        return arrays[n];
    }

}
