package lc235;

import lc.LcUtils;
import pojo.TreeNode;

/**
 * 235. 二叉搜索树的最近公共祖先
 * @author jamie
 */
public class lc235_template {

    /**
     * 递归左右节点
     * @param root 树根节点
     * @param p    节点p
     * @param q    节点q
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = LcUtils.treeNodeFactory("[6,2,8,0,4,7,9,null,null,3,5]");
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        lc235_template lc235 = new lc235_template();
        TreeNode node = lc235.lowestCommonAncestor(root, p, q);
        System.out.println("正确答案为：" + 6);
        System.out.println("算法输出为：" + node.val);
    }

}
