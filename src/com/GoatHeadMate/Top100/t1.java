package com.GoatHeadMate.Top100;

/**
 * Author: GoatHead Mate
 * DATA: 2024/11/6-11-06-下午3:33
 * Description: com.GoatHeadMate.Top100
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
