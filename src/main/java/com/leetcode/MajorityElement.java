package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

        int [] nums = {3,2,3};
        System.out.println(majorityElement3(nums));
    }

    public static int majorityElement3(int[] nums) {
        int count = 0;
        int majority = Integer.MAX_VALUE;

        for (int i : nums) {
            if (count == 0 ) {
                majority = i;
            }
            if(i == majority)
                count++;
            else count--;
        }
        return majority;
    }


    // By sorting
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

    //by using HashMap
    public static int majorityElement2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }
            else{
                map.put(i, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }

        return 0;
    }
}
