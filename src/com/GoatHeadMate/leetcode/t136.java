package com.GoatHeadMate.Top100;

import java.util.HashMap;

/**
 * Author: GoatHead Mate
 * DATA: 2024/11/20-11-20-下午1:36
 * Description: com.GoatHeadMate.Top100
 * Version: 1.0
 */
public class t136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
