package com.jusoft.leetcode.arrays.hindex;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class HIndexTest {

    private final HIndex algo = new HIndex();
    @ParameterizedTest
    @MethodSource("testData")
    public void testCase(int[] input, int output) {
        int res = algo.binarySearchSolution(input);
        assertThat(res).isEqualTo(output);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new int[]{3,0,6,1,5}, 3),
                arguments(new int[]{1,3,1}, 1),
                arguments(new int[]{100}, 1),
                arguments(new int[]{4,4,0,0}, 2),
                arguments(new int[]{7,10,10,1,1}, 3)
        );
    }
}
