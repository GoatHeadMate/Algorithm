package com.GoatHeadMate.leetcode.String;

import java.util.HashMap;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/25-03-25-上午9:37
 * Description: com.GoatHeadMate.leetcode.String
 * Version: 1.0
 */
public class t459 {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                String sub=s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n / i; j++) {
                    sb.append(sub);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
