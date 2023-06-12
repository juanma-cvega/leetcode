package com.jusoft.leetcode.arrays.jumpgame;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JumpGame {

    public boolean canJump(int[] nums) {
        //TOO SLOW
//        if (nums.length <= 1) {
//            return true;
//        }
//        for (int steps = nums[0];steps > 0;steps--) {
//            if (steps >= nums.length - 1) {
//                return true;
//            } else {
//                boolean reachable = canJump(Arrays.copyOfRange(nums, steps, nums.length));
//                if (reachable) {
//                    return true;
//                }
//            }
//        }
//        return false;
        if(nums.length <= 1){
            return true;
        }
        int stepsleft = nums[0];
        int index = 1;
        while(stepsleft > 0){
            if (index == nums.length-1){
                return true;
            }
            stepsleft = Math.max(stepsleft-1, nums[index]);
            index++;
        }
        return false;
    }
}
