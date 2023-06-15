package com.jusoft.leetcode.arrays.jumpgameII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class JumpGameIITest {

    private final JumpGameII algo = new JumpGameII();

    @ParameterizedTest
    @MethodSource("testData")
    public void testCase(int[] nums, int output) {
        int res = algo.jump(nums);

        assertThat(res).isEqualTo(output);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new int[]{2,3,1,1,4}, 2),
                arguments(new int[]{2,3,0,1,4}, 2),
                arguments(new int[]{2,3,1}, 1),
                arguments(new int[]{0}, 0),
                arguments(new int[]{2,1}, 1),
                arguments(new int[]{1,2,3}, 2),
                arguments(new int[]{3,1,1,1,1}, 2)
        );
    }
}
