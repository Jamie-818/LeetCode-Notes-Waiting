package lc112;

import lc.LcUtils;
import pojo.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 112. 路径总和
 * https://leetcode-cn.com/problems/path-sum/
 * @author Jmaie
 */
public class LC112_2 {

    /**
     * 使用队列进行判断
     * 时间复杂度O(N)：每个节点只需要遍历一次
     * 空间复杂度O(N)：使用的最大的空间来源于队列，队列的最大空间不会超过其节点总数，最大值为最大高度。
     * @param root      当前节点
     * @param targetSum 目标总数
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 如果二叉树直接为空，直接返回
        if(root == null){
            return false;
        }
        // 如果左右子树都是空，则直接判断根节点的值是否等于目标值
        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }
        // 创建队列用于做循环
        Queue<TreeNode> nodeQuery = new LinkedList<>();
        Queue<Integer> numberQueue = new LinkedList<>();
        // 无边界插入
        nodeQuery.offer(root);
        numberQueue.offer(root.val);
        while(!nodeQuery.isEmpty()){
            //拿出当前节点的元素
            TreeNode node = nodeQuery.poll();
            Integer sum = numberQueue.poll();
            // 拿出左右子树
            TreeNode right = node.right;
            TreeNode left = node.left;
            // 都为空，说明到了最终子节点，则直接匹配值，匹配成功则直接返回
            if(right == null && left == null){
                if(sum == targetSum){
                    return true;
                }
            }
            // 如果左节点不为空，则插入把当前节点插入队列，进行下一次循环
            if(left != null){
                nodeQuery.offer(left);
                // 这里插入队列要带上当前节点的值，因为要累加到最终子节点
                numberQueue.offer(left.val + sum);
            }
            if(right != null){
                nodeQuery.offer(right);
                numberQueue.offer(right.val + sum);
            }

        }
        // 都不匹配则返回false
        return false;
    }

    public static void main(String[] args) {
        String s = "[5,4,8,11,null,13,4,7,2,null,null,null,1]";
        int targetSum = 22;
        TreeNode root = LcUtils.treeNodeFactory(s);
        TreeNode.printNode(root);
        LC112_2 lc112_template = new LC112_2();
        boolean b = lc112_template.hasPathSum(root, targetSum);
        boolean yesResult = LC112_1.hasPathSum(root, targetSum);
        System.out.println("算法结果：" + (b == yesResult));
    }

}

