package lc104;

import lc.LcUtils;
import pojo.TreeNode;

/**
 * 104. 二叉树的最大深度
 * @author jamie
 * @date 2021/3/9 15:17
 */
public class LC104_0 {

    /**
     * 深度优先搜索
     * 时间复杂度O(n)，所有节点都要遍历
     * 空间复杂度O(H)，取决于树的高度
     * @param root 当前节点
     */
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        // 递归获取右子树的最大节点
        int x = maxDepth(root.left);
        // 递归获取右子树的最大节点
        int y = maxDepth(root.right);
        //返回左右子树的最大节点
        return Math.max(x, y) + 1;
    }

    public static void main(String[] args) {
        String s = "[3,9,20,null,null,15,7]";
        TreeNode root = LcUtils.treeNodeFactory(s);
        LC104_0 lc104 = new LC104_0();
        int result = lc104.maxDepth(root);
        int yesResult = 3;
        System.out.println("正确答案：" + yesResult + "，输出答案：" + result);

    }

}
