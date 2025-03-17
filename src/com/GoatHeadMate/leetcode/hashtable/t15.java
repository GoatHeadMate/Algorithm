package com.GoatHeadMate.leetcode.hashtable;

import java.util.*;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/16-03-16-下午4:01
 * Description: com.GoatHeadMate.leetcode.hashtable
 * Version: 1.0
 */
public class t15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // 排序

        for (int i = 0; i < nums.length - 2; i++) {
            // 去重：跳过相同的元素
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // 跳过重复元素
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // 和小于 0，增加左指针
                } else {
                    right--; // 和大于 0，减小右指针
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }
}
