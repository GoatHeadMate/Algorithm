package com.GoatHeadMate.Array;

import java.util.Arrays;

/**
 * Author: GoatHead Mate
 * DATA: 2024/8/15-08-15-下午2:26
 * Description: com.GoatHeadMate.Array
 * Version: 1.0
 */
public class t977 {
    // 暴力法
//    public int[] sortedSquares(int[] nums) {
//        for (int i = 0; i < nums.length ; i++) {
//            nums[i]=nums[i]*nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;
//    }

    // 双指针法
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left=0,right=nums.length-1;
        int index= res.length-1;
        while(left<=right && index>=0){
            if(Math.abs(nums[left])>=Math.abs(nums[right])){
                res[index] = nums[left]*nums[left];
                left++;
                index--;
            }else {
                res[index] = nums[right]*nums[right];
                right--;
                index--;
            }
        }
        return res;
    }
}
