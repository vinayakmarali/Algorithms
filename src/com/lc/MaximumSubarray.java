package com.lc;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int tempMax = nums[0], max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            tempMax = Math.max(nums[i], tempMax + nums[i]);
            max = Math.max(tempMax, max);
        }
        return max;
    }
}