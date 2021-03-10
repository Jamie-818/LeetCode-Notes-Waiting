package lc237;

import pojo.ListNode;

/**
 * 237. 删除链表中的节点
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点 。
 * @author jamie
 */
public class LC237_0 {

    /**
     * 坑爹题目，这题目进来其实就是直接要删除的node接口
     * @param node 待删除的node结点
     */
    public void deleteNode(ListNode node) {
        // 直接把值和指针指向下一个节点即可
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

    }

}
