import pojo.ListNode;

/**
 * 21. 合并两个有序链表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @author jamie
 * @date 2021/3/2 9:41
 */
public class LC21_1 {

    /**
     * 递归法
     * list1[0] + merge(list1[1:],list2) list1[0]<list2[0]
     * list2[0] + merge(list1,list2[1:]) list1[0]>=list2[0]
     * @param l1 链表1
     * @param l2 链表2
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 如果l1、l2空的话，返回l2、l1
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        // 如果l1的值少于l2的值，则递归去比较l1的next和l2，并把结果赋值给l1的next。然后返回l1
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }

    public static void main(String[] args) {
        LC21_1 lc21 = new LC21_1();
        IntArrOneFactory intArr = new IntArrOneFactory();
        int[] a = intArr.produce("[1,2,4]");
        int[] b = intArr.produce("[1,3,4]");
        ListNode next1 = new ListNode(a);
        ListNode next2 = new ListNode(b);
        ListNode.print(next1);
        ListNode.print(next2);
        ListNode listNode = lc21.mergeTwoLists(next1, next2);
        ListNode.print(listNode);

    }

}
