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
public class LC2_0 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        // 记录补位数
        int carry = 0;
        while(l1 != null | l2 != null){
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            // 位数相加
            int sum = x + y + carry;
            // 获取补位数 or 计算位数值
            carry = sum / 10;
            sum = sum % 10;
            // 插入值
            cur.next = new ListNode(sum);
            // 往前走一步
            cur = cur.next;
            // 如果l1 or l2不为空，则向前走一步
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        // 判断有没有补位数
        if(carry >= 1){
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }

    public static void main(String[] args) {
        LC2_0 lc2_0 = new LC2_0();
        ListNode l1 = new ListNode(new int[]{2, 4, 3});
        ListNode l2 = new ListNode(new int[]{5, 6, 4});
        ListNode node = lc2_0.addTwoNumbers(l1, l2);
        LcUtils.print(node);
    }

}
