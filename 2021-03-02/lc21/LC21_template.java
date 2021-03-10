package lc21;

import lc.LcUtils;
import pojo.ListNode;

/**
 * 21. 合并两个有序链表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @author jamie
 * @date 2021/3/2 9:41
 */
public class LC21_template {

    /**
     * 1.递归法
     * 2.迭代法
     * @param l1 链表1
     * @param l2 链表2
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return null;
    }

    public static void main(String[] args) {
        LC21_template lc21 = new LC21_template();
        LC21_1 lc21_1 = new LC21_1();
        int[] a = LcUtils.oneIntArrFactory("[1,2,4]");
        int[] b = LcUtils.oneIntArrFactory("[1,3,4]");
        ListNode result = lc21.mergeTwoLists(new ListNode(a), new ListNode(b));
        ListNode yesResult = lc21_1.mergeTwoLists(new ListNode(a), new ListNode(b));
        System.out.print("算法输出为：");
        LcUtils.print(result);
        System.out.print("正确答案为：");
        LcUtils.print(yesResult);

    }

}
