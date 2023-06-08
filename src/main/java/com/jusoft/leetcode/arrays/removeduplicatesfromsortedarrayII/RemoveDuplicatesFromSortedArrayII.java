package com.jusoft.leetcode.arrays.removeduplicatesfromsortedarrayII;

public class RemoveDuplicatesFromSortedArrayII {

    public int algo(int[] nums) {
        int i = 1;
        int currentPos = 1;
        int currentReps = 1;
        while(i < nums.length) {
            if (nums[i] != nums[i-1]) {
                nums[currentPos++] = nums[i];
                currentReps = 1;
            } else if (nums[i] == nums[i-1] && currentReps < 2){
                nums[currentPos++] = nums[i];
                currentReps++;
            }
            i++;
        }
        return currentPos;
    }
}
