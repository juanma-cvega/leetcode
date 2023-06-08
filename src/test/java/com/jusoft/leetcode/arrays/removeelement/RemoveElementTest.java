package com.jusoft.leetcode.arrays.removeelement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveElementTest {

    private record Input(int[] nums, int val) {}
    private record Output(int foundValues, int[] remainingValues) {}

    private final RemoveElement removeElement = new RemoveElement();

    @ParameterizedTest
    @MethodSource("casesData")
    public void testCase(Input input, Output output) {
        var res = removeElement.removeElement(input.nums, input.val);

        assertEquals(output.foundValues, res);
        assertThat(input.nums).containsExactlyInAnyOrder(output.remainingValues);
    }

    private static Stream<Arguments> casesData() {
        return Stream.of(
                arguments(new Input(new int[]{0,1,2,2,3,0,4,2}, 2), new Output(5, new int[]{0,1,3,0,4,2,2,2})),
                arguments(new Input(new int[]{3,2,2,3}, 3), new Output(2, new int[]{2,2,3,3}))
        );
    }
}
