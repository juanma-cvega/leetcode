package com.jusoft.leetcode.arrays.jumpgame;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class JumpGameTest {

    private final JumpGame algo = new JumpGame();

    @ParameterizedTest
    @MethodSource("testData")
    public void testCase(int[] input, boolean output) {
        boolean res = algo.canJump(input);

        assertThat(res).isEqualTo(output);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new int[]{2,3,1,1,4}, true),
                arguments(new int[]{3,2,1,0,4}, false),
                arguments(new int[]{0}, true),
                arguments(new int[]{2,0,0}, true),
                arguments(new int[]{3,0,8,2,0,0,1}, true),
                arguments(new int[]{2,0,6,9,8,4,5,0,8,9,1,2,9,6,8,8,0,6,3,1,2,2,1,2,6,5,3,1,2,2,6,4,2,4,3,0,0,0,3,8,2,4,0,1,2,0,1,4,6,5,8,0,7,9,3,4,6,6,5,8,9,3,4,3,7,0,4,9,0,9,8,4,3,0,7,7,1,9,1,9,4,9,0,1,9,5,7,7,1,5,8,2,8,2,6,8,2,2,7,5,1,7,9,6},false));
    }
}
