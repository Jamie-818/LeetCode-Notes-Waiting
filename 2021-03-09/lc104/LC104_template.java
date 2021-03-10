package lc104;

import lc.LcUtils;
import pojo.TreeNode;

/**
 * 104. 二叉树的最大深度
 * @author jamie
 * @date 2021/3/9 15:17
 */
public class LC104_template {

    /**
     * 1、深度优先搜索
     * 2、广度优先搜索
     * 空间复杂度O(H),取决于数的高度
     * @param root 当前节点
     */
    public int maxDepth(TreeNode root) {
        return 0;
    }

    public static void main(String[] args) {
        String s = "[3,9,20,null,null,15,7]";
        TreeNode root = LcUtils.treeNodeFactory(s);
        LC104_template lc104 = new LC104_template();
        int result = lc104.maxDepth(root);
        int yesResult = 3;
        System.out.println("正确答案：" + yesResult + "，输出答案：" + result);

    }

}
