package com.GoatHeadMate.leetcode.String;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/25-03-25-上午8:38
 * Description: com.GoatHeadMate.leetcode.String
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

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }
}
