package com.GoatHeadMate.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/15-03-15-下午4:28
 * Description: com.GoatHeadMate.leetcode.hashtable
 * Version: 1.0
 */
public class t349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                map.put(nums2[i],map.get(nums2[i])+1);
            }
        }
        int count=0;
        for(Integer key:map.keySet()){
            if(map.get(key)>1){
                count++;
            }
        }
        int[] res=new int[count];
        int index=0;
        for(Integer key:map.keySet()){
            if(map.get(key)>1){
                res[index++]=key;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = intersection(nums1, nums2);
        System.out.println(intersection);
    }
}
