package com.GoatHeadMate.leetcode.LinkList;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/13-03-13-下午2:07
 * Description: com.GoatHeadMate.leetcode.LinkList
 * Version: 1.0
 */


public class t203 {
    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            }else {
                pre = pre.next;
            }
        }
        return dummy.next;
    }
}
