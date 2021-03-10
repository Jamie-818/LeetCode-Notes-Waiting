package lc112;

import lc.LcUtils;
import pojo.TreeNode;

/**
 * 112. 路径总和
 * https://leetcode-cn.com/problems/path-sum/
 * @author Jmaie
 */
public class LC112_1 {

    /**
     * 递归法
     * 时间复杂度O(N)：每个树节点只需要遍历一次
     * 空间复杂度O(H)：其中H的是树的高度，来源于递归时栈空间的开销，最坏的情况是链式树，空间复杂度为O(N)
     * @param root      二叉树的root节点
     * @param targetSum 匹配的数
     */
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        //如果树是空的，直接返回
        if(root == null){
            return false;
        }
        // 如果左右子树是空的，直接判断最后的数字是否匹配，不匹配继续向下执行
        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }
        // 然后把左右子树分别递归，如果随便一个返回true，那就是匹配到
        // 注意，每向下一层要删除掉当前节点的val值,这样直接最终子节点可以直接判断
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {
        String s = "[5,4,8,11,null,13,4,7,2,null,null,null,1]";
        int targetSum = 22;
        TreeNode root = LcUtils.treeNodeFactory(s);
        boolean b = LC112_1.hasPathSum(root, targetSum);
        System.out.println(b);
    }

}

