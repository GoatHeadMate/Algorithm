package com.GoatHeadMate.leetcode.Array;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/9-03-09-下午8:27
 * Description: com.GoatHeadMate.leetcode.Array
 * Version: 1.0
 */
public class t58 {
    public static int lengthOfLastWord(String s) {
        String str=s.strip();
        //System.out.println(s);
        if(str.isEmpty()) return 0;
        int len=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                len++;
            }else {
                return len;
            }
        }
        return len;
    }


    public static void main(String[] args) {
        String s="    day";
        int len=lengthOfLastWord(s);
        System.out.println(len);
    }
}
