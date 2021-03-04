import pojo.TreeNode;

/**
 * 112. 路径总和
 * https://leetcode-cn.com/problems/path-sum/
 * @author Jmaie
 */
public class LC112_template {

    /**
     * 使用队列进行判断
     * @param root
     * @param targetSum
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return false;
    }

    public static void main(String[] args) {
        String s = "[5,4,8,11,null,13,4,7,2,null,null,null,1]";
        int targetSum = 22;
        TreeNodeFactory treeNodeFactory = new TreeNodeFactory();
        TreeNode root = treeNodeFactory.produce(s);
        TreeNode.printNode(root);
        LC112_template lc112_template = new LC112_template();
        boolean b = lc112_template.hasPathSum(root, targetSum);
        boolean yesResult = LC112_1.hasPathSum(root, targetSum);
        System.out.println("算法结果：" + (b == yesResult));
    }

}

