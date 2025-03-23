package com.GoatHeadMate.leetcode.String;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/23-03-23-下午7:38
 * Description: com.GoatHeadMate.leetcode.String
 * Version: 1.0
 */
public class t541 {
    public String reverseStr(String s, int k) {
        if (s.isEmpty() || k == 0) {
            return s;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length ; i=i+k*2) {
            int end = Math.min(i + k - 1, chars.length - 1);
            reverse(chars, i, end);
        }
        return new String(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
