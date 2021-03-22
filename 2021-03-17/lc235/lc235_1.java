package lc235;

import lc.LcUtils;
import pojo.TreeNode;

/**
 * 235. 二叉搜索树的最近公共祖先
 * @author jamie
 */
public class lc235_1 {

    /**
     * 递归左右节点
     * 利用二叉树的定义，左边一定小于根节点，右边一定大于根节点的性质
     * - 时间复杂度：`O(n)`，其中 `n` 是给定的二叉搜索树中的节点个数。
     * - 空间复杂度：`O(1)`。
     * @param root 树根节点
     * @param p    节点p
     * @param q    节点q
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 当root节点大于p和q节点的话，最近公共节点祖先肯定在root节点的左边
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        // 当root节点小于p和q节点的话，最近公共祖先节点肯定在root节点的右边
        if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        // 两者都不匹配，说明root节点就是公共祖先节点
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = LcUtils.treeNodeFactory("[6,2,8,0,4,7,9,null,null,3,5]");
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        lc235_1 lc235 = new lc235_1();
        TreeNode node = lc235.lowestCommonAncestor(root, p, q);
        System.out.println("正确答案为：" + 6);
        System.out.println("算法输出为：" + node.val);
    }

}
