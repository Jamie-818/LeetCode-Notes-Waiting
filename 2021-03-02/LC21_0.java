import pojo.ListNode;

/**
 * 21. 合并两个有序链表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @author jamie
 * @date 2021/3/2 9:41
 */
public class LC21_0 {

    /**
     * 迭代法
     * @param l1 链表1
     * @param l2 链表2
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 其中一个集合为空直接返回另外一个集合
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        //创建一个头节点
        ListNode res = new ListNode(-1);
        //  创建一个临时节点用于遍历去追求
        ListNode prev = res;
        while(l1 != null && l2 != null){
            //把小的数放到下一个节点，然后继续下次循环
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else{
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        // 当循环完的时候，不为空的则直接放在末尾
        prev.next = l1 != null?l1:l2;
        // 丢起头节点返回
        return res.next;
    }

    public static void main(String[] args) {
        LC21_0 lc21 = new LC21_0();
        IntArrOneFactory intArr = new IntArrOneFactory();
        int[] a = intArr.produce("[1,2,4]");
        int[] b = intArr.produce("[1,3,4]");
        ListNode next1 = new ListNode(a);
        ListNode next2 = new ListNode(b);
        ListNode.print(next1);
        ListNode.print(next2);
        // [1,2,4]
        // [1,3,4]
        ListNode listNode = lc21.mergeTwoLists(next1, next2);
        ListNode.print(listNode);
        // [1,1,2,3,4,4]
    }

}
