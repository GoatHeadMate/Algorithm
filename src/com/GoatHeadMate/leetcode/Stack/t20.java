package com.GoatHeadMate.leetcode.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/28-03-28-上午10:31
 * Description: com.GoatHeadMate.leetcode.Stack
 * Version: 1.0
 */

public class t20 {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) { // 当前字符是左括号
                stack.push(c);
            } else { // 当前字符是右括号
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (top != map.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
