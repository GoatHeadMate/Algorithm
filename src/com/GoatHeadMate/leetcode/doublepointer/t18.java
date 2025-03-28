package com.GoatHeadMate.leetcode.doublepointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/28-03-28-上午10:06
 * Description: com.GoatHeadMate.leetcode.doublepointer
 * Version: 1.0
 */
public class t18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i< nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    if((long)nums[left]+nums[right]+nums[i]+nums[j]==target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while (left<right && nums[left]==nums[left+1]){
                            left++;
                        }
                        while (left<right && nums[right]==nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }else if(nums[left]+nums[right]+nums[i]+nums[j]>target){
                        right--;
                    }else {
                        left++;
                    }
                }
            }
        }
        return res;
    }
}
