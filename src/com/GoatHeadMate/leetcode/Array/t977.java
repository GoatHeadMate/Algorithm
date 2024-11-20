package com.GoatHeadMate.leetcode.Array;

import java.util.Arrays;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/9-03-09-下午8:12
 * Description: com.GoatHeadMate.leetcode.Array
 * Version: 1.0
 */
public class t977 {
    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            res[i] = nums[i]*nums[i];
        }
        Arrays.sort(res);
        return res;
    }
}
