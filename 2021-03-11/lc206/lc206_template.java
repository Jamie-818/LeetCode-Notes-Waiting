package lc206;

import lc.LcUtils;
import pojo.ListNode;

/**
 * LC206. 反转链表
 * @author jamie
 * @date 2021/3/14 11:04
 */
public class lc206_template {

    /**
     * 1、栈
     * 2、迭代
     * @param head 链表
     */
    public ListNode reverseList(ListNode head) {
        return null;
    }

    public static void main(String[] args) {
        String init = "[1,2,3,4,5]";
        ListNode root = LcUtils.listNodeFactory(init);
        lc206_template lc206 = new lc206_template();
        ListNode node = lc206.reverseList(root);
        System.out.println("初始数据为：" + init);
        System.out.print("算法输出为：");
        LcUtils.print(node);

    }

}
