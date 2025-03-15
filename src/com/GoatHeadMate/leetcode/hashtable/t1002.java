package com.GoatHeadMate.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/13-03-13-下午3:15
 * Description: com.GoatHeadMate.leetcode.hashtable
 * Version: 1.0
 */
public class t1002 {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        if(words == null || words.length == 0) {
            return result;
        }
        int[] hash= new int[26];
        for(int i=0;i<words[0].length();i++){
            hash[words[0].charAt(i)-'a']++;
        }
        for(int i=1;i<words.length;i++){
            int[] hashOtherStr= new int[26];
            for(int j=0;j<words[i].length();j++){
                hashOtherStr[words[i].charAt(j)-'a']++;
            }
            for (int k = 0; k < 26; k++) {
                hash[k] = Math.min(hash[k], hashOtherStr[k]);
            }
        }
        for(int i=0;i<26;i++){
            while(hash[i]!=0){
                char c= (char)(i+'a');
                result.add(String.valueOf(c));
            }
        }
        return result;
    }
}
