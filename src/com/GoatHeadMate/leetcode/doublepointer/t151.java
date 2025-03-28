package com.GoatHeadMate.leetcode.doublepointer;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/26-03-26-下午8:40
 * Description: com.GoatHeadMate.leetcode.doublepointer
 * Version: 1.0
 */
public class t151 {
    public static String reverseWords(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        char[] chars = sb.toString().toCharArray();
        int flag = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                reverseWords(chars, flag, i - 1);
                flag = i + 1;
            }
        }
        reverseWords(chars, flag, chars.length - 1);
        String str = new String(chars).trim().replaceAll("\\s+", " ");
        return str;
    }

    private static void reverseWords(char[] s,int start,int end) {
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
