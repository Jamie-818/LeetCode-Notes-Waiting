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
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author jamie
 * @date 2021/3/1 17:48
 */
public class LC70_Expand {

    /**
     * 扩展 每次最多能爬多少阶梯
     * @param n 楼梯数
     * @param m 每次最多爬多少阶
     */
    public int climbStairsMax(int n, int m) {
        if(n == 0 || n == 1 || n == 2){
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

    public static void main(String[] args) {
        LC70_Expand solution = new LC70_Expand();
        for(int i = 0; i <= 10; i++){
            int i1 = solution.climbStairsMax(i, 2);
            System.out.println(i + ":---" + i1);
        }

        System.out.println(solution.reverseLeftWords("abcdefg", 2));
    }

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);

    }

}
