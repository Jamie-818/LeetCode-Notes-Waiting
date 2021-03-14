package lc;

import pojo.ListNode;
import pojo.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode工具类
 * @author jamie
 * @date 2021/3/6 11:58
 */
public class LcUtils {

    /**
     * 一维int数组生成
     * @param s String
     */
    public static int[] oneIntArrFactory(String s) {
        String temp1 = s.replace("[", "");
        String temp2 = temp1.replace("]", "");
        if(temp2.length() == 0){
            return new int[0];
        }
        String[] s2 = temp2.split(",");
        int n = s2.length;
        int[] res = new int[n];
        for(int i = 0; i < n; ++i){
            res[i] = Integer.parseInt(s2[i]);
        }
        return res;
    }

    /**
     * 二叉树生成
     * @param s String
     */
    public static TreeNode treeNodeFactory(String s) {
        s = s.replace("[", "");
        s = s.replace("]", "");
        String[] sArr = s.split(",");
        int n = sArr.length;
        Queue<TreeNode> qTree = new LinkedList<>();
        TreeNode headNode = new TreeNode(Integer.parseInt(sArr[0]));
        qTree.add(headNode);
        int i = 1;
        while(i < n){
            TreeNode tempNode = qTree.poll();
            TreeNode left = null;
            String tempString = sArr[i];
            if(!"null".equals(tempString)){
                try{
                    int temp = Integer.parseInt(tempString);
                    left = new TreeNode(temp);
                    tempNode.left = left;
                }catch(Exception e){
                    // TODO: handle exception
                }
            }

            i++;
            if(i == n){
                break;
            }
            TreeNode right = null;
            tempString = sArr[i];
            if(!"null".equals(tempString)){
                try{
                    int temp = Integer.parseInt(tempString);
                    right = new TreeNode(temp);
                    tempNode.right = right;
                }catch(Exception e){
                    // TODO: handle exception
                }
            }

            i++;
            qTree.add(left);
            qTree.add(right);
        }
        return headNode;
    }

    /**
     * 输出对象
     * @param head 链表
     */
    public static void print(ListNode head) {
        ListNode pre = head;
        System.out.print("[");
        while(pre != null){
            if(pre.next != null){
                System.out.print(pre.val + ",");
            }else{
                System.out.print(pre.val);
            }
            pre = pre.next;
        }
        System.out.println("]");
    }

    public static ListNode listNodeFactory(String s) {
        s = s.replace("[", "");
        s = s.replace("]", "");
        String[] nums = s.split(",");

        ListNode head = new ListNode(-1);
        ListNode target = head;
        for(String num: nums){
            target.next = new ListNode(Integer.parseInt(num));
            target = target.next;
        }
        return head.next;
    }

}
