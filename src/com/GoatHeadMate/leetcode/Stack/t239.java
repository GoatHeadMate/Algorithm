package com.GoatHeadMate.leetcode.Stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author: GoatHead Mate
 * DATA: 2025/4/3-04-03-上午9:26
 * Description: com.GoatHeadMate.leetcode.Stack
 * Version: 1.0
 */
public class t239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return null;
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            // 移除超出窗口的队首元素
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            // 维护单调递减队列
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            // 记录结果
            if (i >= k - 1) {
                res[i - k + 1] = nums[deque.peek()];
            }
        }
        return res;
    }
}
