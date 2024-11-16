package com.GoatHeadMate.Top100;

/**
 * Author: GoatHead Mate
 * DATA: 2024/11/16-11-16-下午2:59
 * Description: com.GoatHeadMate.Top100
 * Version: 1.0
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }

public class t160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while(pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
