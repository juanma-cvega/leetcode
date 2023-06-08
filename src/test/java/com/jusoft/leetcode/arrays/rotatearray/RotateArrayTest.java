package com.jusoft.leetcode.arrays.rotatearray;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RotateArrayTest {

    private record Input(int[] nums, int k) {}

    private final RotateArray algo = new RotateArray();
    @ParameterizedTest
    @MethodSource("testData")
    public void testCase(Input input, int[] output) {
        algo.algo(input.nums, input.k);

        assertThat(input.nums).containsExactly(output);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new Input(new int[]{1,2,3,4,5,6,7}, 3), new int[]{5,6,7,1,2,3,4}),
                arguments(new Input(new int[]{-1,-100,3,99}, 2), new int[]{3,99,-1,-100}),
                arguments(new Input(new int[]{-1}, 2), new int[]{-1}),
                arguments(new Input(new int[]{1,2}, 3), new int[]{2,1})
        );
    }
}
