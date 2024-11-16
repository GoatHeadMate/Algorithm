package com.GoatHeadMate.Top100;

/**
 * Author: GoatHead Mate
 * DATA: 2024/11/16-11-16-下午2:33
 * Description: com.GoatHeadMate.Top100
 * Version: 1.0
 */

public class t283 {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if(nums[right]!=0){
                nums[left++]=nums[right];
            }
            right++;
        }
        for (int i = left; i < nums.length; i++) {
            nums[i]=0;
        }
    }
}
