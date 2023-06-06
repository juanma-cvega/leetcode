package com.jusoft.leetcode.mergedsortedarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergedSortedArrayTest {

    public static final MergedSortedArray algo = new MergedSortedArray();
    @Test
    public void testCaseOne() {
        var result = new int[]{1,2,2,3,5,6};
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        algo.merge(nums1, 3, new int[]{2,5,6}, 3);
        assertArrayEquals(result, nums1);
    }

    @Test
    public void testCaseTwo() {
        int[] result = {1};
        int[] nums1 = {1};
        algo.merge(nums1, 1, new int[]{}, 0);
        assertArrayEquals(result, nums1);
    }

    @Test
    public void testCaseThree() {
        int[] result = {1};
        int[] nums1 = {0};
        algo.merge(nums1, 0, new int[]{1}, 1);
        assertArrayEquals(result, nums1);
    }

    @Test
    public void testCaseFour() {
        int[] result = {};
        int[] nums1 = {};
        algo.merge(nums1, 0, new int[]{0}, 0);
        assertArrayEquals(result, nums1);
    }
}
