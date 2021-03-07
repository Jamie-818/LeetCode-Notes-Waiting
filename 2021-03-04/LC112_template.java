import pojo.TreeNode;

/**
 * 112. 路径总和
 * https://leetcode-cn.com/problems/path-sum/
 * @author Jmaie
 */
public class LC112_template {

    /**
     * 使用队列
     * 使用递归法
     * @param root      当前节点
     * @param targetSum 预计到根子树的总数
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {

        return false;
    }

    public static void main(String[] args) {
        String s = "[5,4,8,11,null,13,4,7,2,null,null,null,1]";
        int targetSum = 22;
        TreeNodeFactory treeNodeFactory = new TreeNodeFactory();
        TreeNode root = treeNodeFactory.produce(s);
        LC112_template lc112_template = new LC112_template();
        boolean result = lc112_template.hasPathSum(root, targetSum);
        boolean yesResult = LC112_1.hasPathSum(root, targetSum);
        System.out.println("算法结果：" + result);
        System.out.println("正确结果：" + yesResult);
    }

}

