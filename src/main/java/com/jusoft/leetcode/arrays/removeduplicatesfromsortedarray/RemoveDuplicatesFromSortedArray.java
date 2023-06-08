package com.jusoft.leetcode.arrays.removeduplicatesfromsortedarray;

public class RemoveDuplicatesFromSortedArray {

    public int algo(int[] nums) {
        int lastUnique = 1;
        int i = 1;
        int current = nums[0];
        while (i < nums.length) {
            if (nums[i] != current) {
                current = nums[i];
                nums[lastUnique++] = nums[i];
            }
            i++;
        }
        return lastUnique;
    }
}
