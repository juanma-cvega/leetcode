package com.jusoft.leetcode.arrays.besttimetobuyandsellstockII;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BestTimeToBuyAndSellStockIITest {

    private final BestTimeToBuyAndSellStockII algo = new BestTimeToBuyAndSellStockII();

    @ParameterizedTest
    @MethodSource("testData")
    public void testCase(int[] input, int output) {
        int res = algo.algo(input);

        assertThat(res).isEqualTo(output);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new int[]{7,1,5,3,6,4}, 7),
                arguments(new int[]{1,2,3,4,5}, 4),
                arguments(new int[]{7,6,4,3,1}, 0),
                arguments(new int[]{2,1,2,0,1}, 2)
        );
    }
}
