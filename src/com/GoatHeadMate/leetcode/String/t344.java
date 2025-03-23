package com.GoatHeadMate.leetcode.String;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/23-03-23-下午7:36
 * Description: com.GoatHeadMate.leetcode.String
 * Version: 1.0
 */
public class t344 {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}
