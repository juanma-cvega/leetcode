package com.jusoft.leetcode.arrays.mergedsortedarray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MergedSortedArrayTest {

    public static final MergedSortedArray algo = new MergedSortedArray();

    private record Input(int[] nums1, int m, int[] nums2, int n) {}

    @ParameterizedTest
    @MethodSource("testData")
    public void testCase(Input data, int[] result) {
        algo.merge(data.nums1, data.m, data.nums2, data.n);
        assertArrayEquals(result, data.nums1);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new Input(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2,5,6}, 3), new int[]{1,2,2,3,5,6}),
                arguments(new Input(new int[]{1}, 1, new int[]{}, 0), new int[]{1}),
                arguments(new Input(new int[]{0}, 0, new int[]{1}, 1), new int[]{1})
        );
    }
}
