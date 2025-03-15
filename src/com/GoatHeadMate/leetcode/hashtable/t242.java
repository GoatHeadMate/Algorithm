package com.GoatHeadMate.leetcode.hashtable;

import java.util.HashMap;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/13-03-13-下午2:36
 * Description: com.GoatHeadMate.leetcode.hashtable
 * Version: 1.0
 */
public class t242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else {
                map.put(c, 1);
            }
        }
        for(char c : t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }else if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
            }
        }
        for(char c : map.keySet()){
            if(map.get(c)!=0){
                return false;
            }
        }
        return true;
    }
}
