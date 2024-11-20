package com.GoatHeadMate.leetcode.Array;

/**
 * Author: GoatHead Mate
 * DATA: 2025/2/17-02-17-下午5:00
 * Description: com.GoatHeadMate.leetcode.Array
 * Version: 1.0
 */
public class t704 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
