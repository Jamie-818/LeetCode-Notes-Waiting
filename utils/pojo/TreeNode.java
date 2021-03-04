package pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeNode {

    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) { this.val = val; }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return Integer.toString(val);
    }

    public static void printNode(TreeNode root) {
        int maxLevel = TreeNode.maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static void printNodeInternal(List<TreeNode> nodes, int level, int maxLevel) {
        if(nodes.isEmpty() || TreeNode.isAllElementsNull(nodes)){
            return;
        }

        int floor = maxLevel - level;
        int endgeLines = (int)Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int)Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int)Math.pow(2, (floor + 1)) - 1;
        List<TreeNode> newNodes = new ArrayList<>();

        TreeNode.printWhitespaces(firstSpaces);
        List<Integer> nullIndexBak = new ArrayList<>();

        for(int i = 0; i < nodes.size(); i++){
            TreeNode node = nodes.get(i);
            if(node != null){
                System.out.print(node.val);
                newNodes.add(node.left);
                newNodes.add(node.right);
            }else{
                nullIndexBak.add(i);
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }
            TreeNode.printWhitespaces(betweenSpaces);
        }
        System.out.println();
        for(int i = 1; i <= endgeLines; i++){
            for(TreeNode node: nodes){
                TreeNode.printWhitespaces(firstSpaces - i);
                if(node == null){
                    TreeNode.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if(node.left != null){
                    System.out.print("/");
                }else{
                    TreeNode.printWhitespaces(1);
                }

                TreeNode.printWhitespaces(i + i - 1);

                if(node.right != null){
                    System.out.print("\\");
                }else{
                    TreeNode.printWhitespaces(1);
                }

                TreeNode.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println();
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for(int i = 0; i < count; i++){
            System.out.print(" ");
        }
    }

    private static int maxLevel(TreeNode node) {
        if(node == null){
            return 0;
        }

        return Math.max(TreeNode.maxLevel(node.left), TreeNode.maxLevel(node.right)) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for(Object object: list){
            if(object != null){
                return false;
            }
        }

        return true;
    }

}