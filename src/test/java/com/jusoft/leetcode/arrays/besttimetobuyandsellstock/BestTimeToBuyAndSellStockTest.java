package com.jusoft.leetcode.arrays.besttimetobuyandsellstock;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock algo = new BestTimeToBuyAndSellStock();

    @ParameterizedTest
    @MethodSource("testData")
    public void testCase(int[] input, int output) {
        int res = algo.algo(input);

        assertThat(res).isEqualTo(output);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new int[]{7,1,5,3,6,4}, 5),
                arguments(new int[]{7,6,4,3,1}, 0),
                arguments(new int[]{1,2}, 1),
                arguments(new int[]{7,2,8,1,5,3,6,4}, 6)
        );
    }
}
