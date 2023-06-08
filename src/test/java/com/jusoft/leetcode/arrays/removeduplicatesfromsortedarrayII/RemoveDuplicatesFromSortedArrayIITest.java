package com.jusoft.leetcode.arrays.removeduplicatesfromsortedarrayII;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveDuplicatesFromSortedArrayIITest {

    private record Output(int uniqueValues, int[] nums) {}

    private final RemoveDuplicatesFromSortedArrayII algo = new RemoveDuplicatesFromSortedArrayII();

    @ParameterizedTest
    @MethodSource("testData")
    public void testCase(int[] input, Output output) {
        int uniqueValues = algo.algo(input);

        assertThat(uniqueValues).isEqualTo(output.uniqueValues);
        assertThat(input).containsExactly(output.nums);
    }

    private static Stream<Arguments> testData(){
        return Stream.of(
                arguments(new int[]{1,1,1,2,2,3}, new Output(5, new int[]{1,1,2,2,3,3})),
                arguments(new int[]{0,0,1,1,1,1,2,3,3}, new Output(7, new int[]{0,0,1,1,2,3,3,3,3}))
        );
    }
}
