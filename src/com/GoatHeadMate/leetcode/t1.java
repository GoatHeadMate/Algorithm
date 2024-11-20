package com.GoatHeadMate.leetcode;

/**
 * Author: GoatHead Mate
 * DATA: 2025/1/14-01-14-下午4:16
 * Description: com.GoatHeadMate.leetcode
 * Version: 1.0
 */
public class t1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
