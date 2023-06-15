package com.jusoft.leetcode.arrays.jumpgameII;

public class JumpGameII {

    public int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }

        int steps = 0;
        int currentIndex = 0;
        while(true) {
            if (currentIndex + nums[currentIndex] >= nums.length - 1) {
                return ++steps;
            }
            currentIndex = findNextHop(nums, currentIndex, Math.min(nums[currentIndex] + currentIndex, nums.length));
            steps++;
        }
    }

    private int findNextHop(int[] nums, int start, int end) {
        int jumpDistance = nums[start];
        int currentIndex = start;
        int indexDistance = 1;
        for (int i = start + 1;i <= end;i++) {
            if (jumpDistance <= nums[i] + indexDistance) {
                jumpDistance = nums[i] + indexDistance;
                currentIndex = i;
            }
            indexDistance++;
        }
        return currentIndex;
    }
}
