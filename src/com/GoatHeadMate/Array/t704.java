package com.GoatHeadMate.Array;

/**
 * Author: GoatHead Mate
 * DATA: 2024/7/31-07-31-上午11:30
 * Description: com.GoatHeadMate.Array
 * Version: 1.0
 */
public class t704 {

    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int index=search(nums,9);
        System.out.println(index);
    }


    public static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }else {
                if(nums[mid] < target){
                    left = mid + 1;
                }else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
