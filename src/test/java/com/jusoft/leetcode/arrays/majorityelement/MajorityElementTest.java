package com.jusoft.leetcode.arrays.majorityelement;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MajorityElementTest {

    private final MajorityElement algo = new MajorityElement();

    @ParameterizedTest
    @MethodSource("testData")
    public void testCase(int[] nums, int output) {
        int res = algo.algo(nums);

        assertThat(res).isEqualTo(output);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new int[]{3,2,3}, 3),
                arguments(new int[]{2,2,1,1,1,2,2}, 2),
                arguments(new int[]{3,3,4}, 3),
                arguments(new int[]{3,3,4,5,5,4,5,4,4,3}, 4)
        );
    }
}
