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
public class LC70_climbing_stairs_1 {

    /**
     * 优化递归法，计算值记录
     * @param n 楼梯数
     */
    public int climbStairs(int n) {
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

    public static void main(String[] args) {
        LC70_climbing_stairs_1 solution = new LC70_climbing_stairs_1();
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
