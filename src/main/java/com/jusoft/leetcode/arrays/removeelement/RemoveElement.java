package com.jusoft.leetcode.arrays.removeelement;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int length = nums.length;
        int found = 0;
        while (i < length) {
            if (nums[i] == val) {
                found++;
                for (int j = i;j < nums.length - 1;j++) {
                    nums[j] = nums[j+1];
                }
                length--;
            } else {
                i++;
            }
        }
        return nums.length - found;
    }
}
