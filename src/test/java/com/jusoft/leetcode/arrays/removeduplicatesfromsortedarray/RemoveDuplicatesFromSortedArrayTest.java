package com.jusoft.leetcode.arrays.removeduplicatesfromsortedarray;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveDuplicatesFromSortedArrayTest {

    private record Output(int uniqueValues, int[] nums) {}
    private final RemoveDuplicatesFromSortedArray algo = new RemoveDuplicatesFromSortedArray();

    @ParameterizedTest
    @MethodSource("testData")
    public void testCase(int[] input, Output output) {
        int uniqueValues = algo.algo(input);

        assertThat(uniqueValues).isEqualTo(output.uniqueValues);
        assertThat(input).containsExactly((output.nums));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                arguments(new int[]{1,1,2}, new Output(2, new int[]{1,2,2})),
                arguments(new int[]{0,0,1,1,1,2,2,3,3,4}, new Output(5, new int[]{0,1,2,3,4,2,2,3,3,4}))
        );
    }
}
