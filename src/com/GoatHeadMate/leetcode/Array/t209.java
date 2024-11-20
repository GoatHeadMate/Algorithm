package com.GoatHeadMate.leetcode.Array;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/9-03-09-下午8:14
 * Description: com.GoatHeadMate.leetcode.Array
 * Version: 1.0
 */
public class t209 {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int k=0;
        int len=0;
        for(int i = 0 ; i < nums.length ; i++){
            sum=sum+nums[i];
            while(sum>=target){
                len=len==0?i-k+1:Math.min(len,i-k+1);
                sum=sum-nums[k++];
            }
        }
        return len;
    }
}
