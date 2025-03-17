package com.GoatHeadMate.leetcode.hashtable;

import java.util.HashMap;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/16-03-16-下午1:24
 * Description: com.GoatHeadMate.leetcode.hashtable
 * Version: 1.0
 */
public class t454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int temp;
        int res = 0;
        for(int i:nums1){
            for(int j:nums2){
                temp = i+j;
                if(map.containsKey(temp)){
                    map.put(temp, map.get(temp)+1);
                }else {
                    map.put(temp, 1);
                }
            }
        }
        for(int i:nums3){
            for(int j:nums4){
                temp=i+j;
                if(map.containsKey(0-temp)){
                    res += map.get(0-temp);
                }
            }
        }
        return res;
    }
}
