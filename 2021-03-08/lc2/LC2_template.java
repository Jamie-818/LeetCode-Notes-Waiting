package lc2;

import lc.LcUtils;
import pojo.ListNode;

/**
 * 2. 两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * @author jamie
 */
public class LC2_template {

    /**
     * 1、进位
     * @param l1 链表1
     * @param l2 链表2
     * @return 相加的链表
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        //  start

        //end
        return pre.next;
    }

    public static void main(String[] args) {
        LC2_template lc2 = new LC2_template();
        ListNode l1 = new ListNode(new int[]{2, 4, 5});
        ListNode l2 = new ListNode(new int[]{5, 6, 4});
        ListNode node = lc2.addTwoNumbers(l1, l2);
        LcUtils.print(node);
        // 7001
    }

}
