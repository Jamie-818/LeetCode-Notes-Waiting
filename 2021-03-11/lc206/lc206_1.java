package lc206;

import lc.LcUtils;
import pojo.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * LC206. 反转链表
 * @author jamie
 * @date 2021/3/14 11:04
 */
public class lc206_1 {

    /**
     * 通过栈处理
     * 时间复杂度 `O(n)` : 2N，取决于链表的长度X2，因为两次循环
     * 空间复杂度 `O(n)` : N，取决于栈的高度，也就是链表的长度
     * @param head 链表
     */
    public ListNode reverseList(ListNode head) {
        ListNode ret = new ListNode(-1);
        ListNode node = ret;
        Deque<Integer> stack = new LinkedList<>();
        // 迭代head节点插入栈
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        // 迭代栈节点出栈
        while(!stack.isEmpty()){
            Integer pop = stack.pop();
            node.next = new ListNode(pop);
            node = node.next;
        }
        return ret.next;
    }

    public static void main(String[] args) {
        ListNode root = LcUtils.listNodeFactory("[1,2,3,4,5]");
        ListNode yesRsult = LcUtils.listNodeFactory("[1,2,3,4,5]");

        lc206_1 lc206 = new lc206_1();
        ListNode node = lc206.reverseList(root);
        LcUtils.print(node);

    }

}
