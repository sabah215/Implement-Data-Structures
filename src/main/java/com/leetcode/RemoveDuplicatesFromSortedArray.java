package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        // j
        // 0,0,1,1,1,2,2,3,3,4      1. if(nums[i] == nums[j]) i proceeds 1 next
        // i                        because it needs to be exchanged with a different value
        //                          2. If (nums[i] != nums[j]) move j to next index
        //                          and replace j index value with i
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != nums[j]) nums[++j] = nums[i];
        }

        return ++j;
    }
}
