package com.GoatHeadMate.leetcode.hashtable;

import java.util.HashMap;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/16-03-16-下午1:39
 * Description: com.GoatHeadMate.leetcode.hashtable
 * Version: 1.0
 */
public class t383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char c:magazine.toCharArray()){
            if(map1.containsKey(c)){
                map1.put(c,map1.get(c)+1);
            }else {
                map1.put(c,1);
            }
        }
        for(char c:ransomNote.toCharArray()){
            if(!map1.containsKey(c)){
                return false;
            }else if(map1.containsKey(c)){
                map1.put(c,map1.get(c)-1);
            }
            if(map1.get(c)<0){
                return false;
            }
        }
        return true;
    }
}
