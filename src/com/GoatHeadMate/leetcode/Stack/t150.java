package com.GoatHeadMate.leetcode.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Author: GoatHead Mate
 * DATA: 2025/4/3-04-03-上午9:06
 * Description: com.GoatHeadMate.leetcode.Stack
 * Version: 1.0
 */
public class t150 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")){
                stack.push(Integer.parseInt(token));
            }else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                if(token.equals("+")){
                    stack.push(num1 + num2);
                }else if(token.equals("-")){
                    stack.push(num2-num1);
                }else if(token.equals("*")){
                    stack.push(num2*num1);
                }else{
                    stack.push(num2/num1);
                }
            }
        }
        return stack.pop();
    }
}
