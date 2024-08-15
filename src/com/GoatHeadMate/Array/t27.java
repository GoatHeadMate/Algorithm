package com.GoatHeadMate.Array;

import java.util.ArrayList;

/**
 * Author: GoatHead Mate
 * DATA: 2024/8/14-08-14-下午2:50
 * Description: com.GoatHeadMate.Array
 * Version: 1.0
 */
public class t27 {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}


