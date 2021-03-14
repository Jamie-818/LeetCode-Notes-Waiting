package lc206;

import lc.LcUtils;
import pojo.ListNode;
/**
 * LC206. 反转链表
 * @author jamie
 * @date 2021/3/14 11:04
 */
public class lc206_2 {

    /**
     * 通过迭代处理,思想就是把cur把指针不断的反转，然后指向给pre
     * 时间复杂度 `O(n)` : 其中 nn 是链表的长度。需要遍历链表一次。
     * 空间复杂度 `O(1)`
     * @param head 链表
     */
    public ListNode reverseList(ListNode head) {
        //申请节点，pre和 cur，pre指向null
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp;
        while(cur != null){
            //记录当前节点的下一个节点
            tmp = cur.next;
            //然后将当前节点指向pre
            cur.next = pre;
            //pre和cur节点都前进一位
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode root = LcUtils.listNodeFactory("[1,2,3,4,5]");
        lc206_2 lc206 = new lc206_2();
        ListNode node = lc206.reverseList(root);
        System.out.println("初始数据为：[1,2,3,4,5]");
        System.out.print("算法输出为：");
        LcUtils.print(node);

    }

}
