package com.jusoft.leetcode.arrays.rotatearray;

public class RotateArray {
    public void algo(int[] nums, int k) {
        //TIMING OUT FOR LARGE ARRAYS AND K VALUES
//        int loops = k % nums.length;
//        for (int i = 0;i < loops;i++) {
//            int last = nums[nums.length - 1];
//            for (int j = nums.length - 1;j > 0;j--) {
//                nums[j] = nums[j - 1];
//            }
//            nums[0] = last;
//        }
        int[] res = new int[nums.length];
        int movement = k % nums.length;
        System.arraycopy(nums,0, res, 0, nums.length);
        int start = 0;
        int count = 0;
        for (int i = res.length - movement;i < res.length;i++) {
            nums[start++] = res[i];
            count++;
        }
        for (int i = 0;i < nums.length - movement;i++) {
            nums[count++] = res[i];
        }
        System.gc();
    }
}
