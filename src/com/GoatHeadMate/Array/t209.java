package com.GoatHeadMate.Array;

/**
 * Author: GoatHead Mate
 * DATA: 2024/8/15-08-15-下午3:36
 * Description: com.GoatHeadMate.Array
 * Version: 1.0
 */

public class t209 {
    // 滑动窗口
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
