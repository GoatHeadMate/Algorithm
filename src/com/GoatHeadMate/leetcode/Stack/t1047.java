package com.GoatHeadMate.leetcode.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Author: GoatHead Mate
 * DATA: 2025/4/1-04-01-下午5:24
 * Description: com.GoatHeadMate.leetcode.Stack
 * Version: 1.0
 */

public class t1047 {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }else {
                if(c == stack.peek()){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
