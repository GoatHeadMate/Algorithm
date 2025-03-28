package com.GoatHeadMate.leetcode.doublepointer;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/26-03-26-下午8:34
 * Description: com.GoatHeadMate.leetcode.doublepointer
 * Version: 1.0
 */
public class t344 {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
