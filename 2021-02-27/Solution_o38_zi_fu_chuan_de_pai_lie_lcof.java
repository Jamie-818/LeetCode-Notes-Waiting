import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 剑指 Offer 38. 字符串的排列
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 * 示例:
 * 输入：s = "abc"
 * 输出：["abc","acb","bac","bca","cab","cba"]
 *
 * 限制：
 * 1 <= s 的长度 <= 8
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof
 * @author jamie
 * @date 2021/2/27 9:54
 */
public class Solution_o38_zi_fu_chuan_de_pai_lie_lcof {

    public String[] permutation(String s) {
        List<String> ans = new ArrayList<>();
        processByBranchAndBound(s.toCharArray(), 0, ans);
        return ans.toArray(new String[0]);
    }

    /**
     * str[0...i-1]已经做好决定的
     * str[i...]都有机会来到i位置
     * i终止位置，str当前的样子，就是一种结果 -> ans
     * HashSet实现不重复
     * @param str 待遍历的字符串
     * @param i   下标
     * @param ans 结果集合
     */
    public static void processBySet(char[] str, int i, Set<String> ans) {
        if(i == str.length){
            ans.add(String.valueOf(str));
        }
        // 如果i没有终止，i... 都可以来到i位置
        // j i 后面所有的字符都有激活
        for(int j = i; j < str.length; j++){
            //  反转位置
            swap(str, i, j);
            processBySet(str, i + 1, ans);
            // 恢复现场
            swap(str, i, j);
        }
    }

    /**
     * 分支限界 实现不重复
     * @param str 待遍历的字符串
     * @param i   下标
     * @param ans 结果集合
     */
    public static void processByBranchAndBound(char[] str, int i, List<String> ans) {
        if(i == str.length){
            ans.add(String.valueOf(str));
        }
        boolean[] visit = new boolean[26];
        for(int j = i; j < str.length; j++){
            // 判断当前字符是否已经被使用过，是的话，不向下执行
            // str[j] = 'a' -> 0 visit[0] -> 'a'
            // str[j] = 'z' -> 25 visit[25] -> 'z'
            if(!visit[str[j] - 'a']){
                visit[str[j] - 'a'] = true;
                //  反转位置
                swap(str, i, j);
                processByBranchAndBound(str, i + 1, ans);
                // 恢复现场
                swap(str, i, j);
            }
        }
    }

    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        String s = "abcc";
        Solution_o38_zi_fu_chuan_de_pai_lie_lcof solution = new Solution_o38_zi_fu_chuan_de_pai_lie_lcof();
        String[] permutation = solution.permutation(s);
        System.out.println(permutation.length);
        for(String s1: permutation){
            System.out.print(s1 + ",");
        }

    }

}
