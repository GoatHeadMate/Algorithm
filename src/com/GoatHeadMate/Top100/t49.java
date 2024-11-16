package com.GoatHeadMate.Top100;

import java.util.*;

/**
 * Author: GoatHead Mate
 * DATA: 2024/11/6-11-06-下午3:36
 * Description: com.GoatHeadMate.Top100
 * Version: 1.0
 */

public class t49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] chr = str.toCharArray();
            Arrays.sort(chr);
            String key=new String(chr);
            List<String> list = map.getOrDefault(key, new ArrayList());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
