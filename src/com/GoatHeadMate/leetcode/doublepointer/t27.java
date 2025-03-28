package com.GoatHeadMate.leetcode.doublepointer;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/26-03-26-下午8:29
 * Description: com.GoatHeadMate.leetcode.doublepointer
 * Version: 1.0
 */
public class t27 {
    public int removeElement(int[] nums, int val) {
        int flag = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[flag]=nums[i];
                flag++;
            }
        }
        return flag;
    }
}
