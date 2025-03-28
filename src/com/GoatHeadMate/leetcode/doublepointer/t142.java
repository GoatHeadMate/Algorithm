package com.GoatHeadMate.leetcode.doublepointer;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/27-03-27-上午8:57
 * Description: com.GoatHeadMate.leetcode.doublepointer
 * Version: 1.0
 */
public class t142 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast=head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}



