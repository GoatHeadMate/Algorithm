package com.GoatHeadMate.LinkList;

/**
 * Author: GoatHead Mate
 * DATA: 2024/9/18-09-18-下午5:40
 * Description: com.GoatHeadMate.LinkList
 * Version: 1.0
 */

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class t203 {
      public ListNode removeElements(ListNode head, int val) {
            if(head == null) {
                  return null;
            }
            ListNode listNode=new ListNode(0);
            listNode.next=head;
            ListNode current=listNode;
            while(current.next!=null){
                  if(current.next.val == val){
                        current.next=current.next.next;
                  }else {
                        current=current.next;
                  }
            }
            return listNode.next;
      }
}
