package com.jusoft.leetcode.arrays.jumpgameIII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class JumpGameIIITest {

    private record Input(int[] nums, int index) {}
    private final JumpGameIII algo = new JumpGameIII();

    @ParameterizedTest
    @MethodSource("testData")
    public void testCase(Input input, boolean output) {
        boolean res = algo.dfs(input.nums, input.index);

        assertThat(res).isEqualTo(output);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new Input(new int[]{4,2,3,0,3,1,2},5), true),
                arguments(new Input(new int[]{4,2,3,0,3,1,2},0), true),
                arguments(new Input(new int[]{3,0,2,1,2},2), false)
        );
    }
}
