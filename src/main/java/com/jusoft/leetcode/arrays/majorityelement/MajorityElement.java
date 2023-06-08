package com.jusoft.leetcode.arrays.majorityelement;

import java.util.Arrays;

public class MajorityElement {
    public int algo(int[] nums) {
        Arrays.sort(nums);
        int res = nums[0];
        int previousCount = 0;
        int currentCount = 1;
        for (int i = 1;i < nums.length;i++) {
            if (nums[i] != nums[i-1]) {
                if (previousCount < currentCount) {
                    res = nums[i-1];
                    previousCount = currentCount;
                    currentCount = 1;
                }
            } else {
                currentCount++;
            }
        }
        if (currentCount > previousCount) {
            res = nums[nums.length - 1];
        }
        return res;
    }
}
