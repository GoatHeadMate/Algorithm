package com.GoatHeadMate.leetcode.doublepointer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/26-03-26-下午8:57
 * Description: com.GoatHeadMate.leetcode.doublepointer
 * Version: 1.0
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class t206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ArrayList<Integer> list = new ArrayList();
        ListNode cur = head;
        ListNode res=head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            res.val=list.get(i);
            res=res.next;
        }
        return head;
    }
}



