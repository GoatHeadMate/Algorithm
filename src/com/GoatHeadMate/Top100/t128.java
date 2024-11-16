package com.GoatHeadMate.Top100;

import java.util.Arrays;

/**
 * Author: GoatHead Mate
 * DATA: 2024/11/6-11-06-下午3:48
 * Description: com.GoatHeadMate.Top100
 * Version: 1.0
 */

public class t128 {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int n=nums.length;
        int slow=0;
        int max=1;
        while(slow<n){
            int fast=slow+1;
            int count=1;
            while(slow<n && fast<n &&(nums[fast-1]==nums[fast]-1)){
                if(nums[fast]-1==nums[fast-1]){
                    count++;
                }
                fast++;
            }
            max = Math.max(count,max);
            slow = fast;
        }
        return max;
    }
}
