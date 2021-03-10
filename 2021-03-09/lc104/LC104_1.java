package lc104;

import lc.LcUtils;
import pojo.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 104. 二叉树的最大深度
 * @author jamie
 * @date 2021/3/9 15:17
 */
public class LC104_1 {

    /**
     * 广度优先搜索，用队列解决
     * 时间复杂度O(n)，所有节点都要遍历
     * 空间复杂度O(n)，取决于队列存储的元素数量，最好O(1)，最坏O(n);
     * @param root 当前节点
     */
public int maxDepth(TreeNode root) {
    if(root == null){
        return 0;
    }
    // 记录高度
    int heightNum = 0;
    Queue<TreeNode> nodeQueue = new LinkedList<>();
    nodeQueue.offer(root);
    // 队列不为空则执行
    while(!nodeQueue.isEmpty()){
        // 获取队列大小
        int size = nodeQueue.size();
        // 大小大于0说明还没到根节点
        while(size > 0){
            TreeNode node = nodeQueue.poll();
            TreeNode left = node.left;
            TreeNode right = node.right;
            if(left != null){
                nodeQueue.offer(left);
            }
            if(right != null){
                nodeQueue.offer(right);
            }
            // 走到这里，说明该树节点已经遍历完，向下遍历
            size--;
        }
        heightNum++;
    }
    return heightNum;
}

    public static void main(String[] args) {
        String s = "[3,9,20,null,null,15,7]";
        TreeNode root = LcUtils.treeNodeFactory(s);
        LC104_1 lc104 = new LC104_1();
        int result = lc104.maxDepth(root);
        int yesResult = 3;
        System.out.println("正确答案：" + yesResult + "，输出答案：" + result);

    }

}
