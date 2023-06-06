package com.jusoft.leetcode.mergedsortedarray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var algo = new MergedSortedArray();
        var nums1 = new int[]{1,2,3,0,0,0};
        algo.merge(nums1, 3, new int[]{2,5,6}, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
