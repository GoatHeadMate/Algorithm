package com.GoatHeadMate.leetcode.Array;

/**
 * Author: GoatHead Mate
 * DATA: 2025/2/17-02-17-下午5:04
 * Description: com.GoatHeadMate.leetcode.Array
 * Version: 1.0
 */
public class t27 {
    public int removeElement(int[] nums, int val) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[flag] = nums[i];
                flag++;
            }
        }
        return flag;
    }
}
