package com.minimumgapalgorithm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumGapAlgorithmTest {

    @Test
    void testWithNumbersInOrder() {
        int[] numbers = {1, 4, 10};
        assertEquals(2, MinimumGapAlgorithm.findMinimumGap(numbers),
                "The minimum gap should be 2 for numbers in order.");
    }

    @Test
    void testWithNumbersOutOfOrder() {
        int[] numbers = {10, 1, 4};
        assertEquals(2, MinimumGapAlgorithm.findMinimumGap(numbers),
                "The minimum gap should be 2 regardless of the order.");
    }

    @Test
    void testWithDuplicateNumbers() {
        int[] numbers = {1, 4, 4, 10};
        assertEquals(2, MinimumGapAlgorithm.findMinimumGap(numbers),
                "The minimum gap should be 2 with duplicate numbers.");
    }

    @Test
    void testWithEqualLengthGaps() {
        int[] numbers = {1, 3, 5};
        assertEquals(1, MinimumGapAlgorithm.findMinimumGap(numbers),
                "The minimum gap should be 1 for equal length gaps.");
    }

    @Test
    void testWithNoGaps() {
        int[] numbers = {1, 2, 3, 4};
        assertEquals(0, MinimumGapAlgorithm.findMinimumGap(numbers),
                "The minimum gap should be 0 when there are no gaps.");
    }

    @Test
    void testWithSingleElement() {
        int[] numbers = {1};
        assertEquals(0, MinimumGapAlgorithm.findMinimumGap(numbers),
                "The minimum gap should be 0 when there is only one element.");
    }

    @Test
    void testWithNegativeAndPositiveNumbers() {
        int[] numbers = {-2, -1, 0, 1, 2};
        assertEquals(0, MinimumGapAlgorithm.findMinimumGap(numbers),
                "The minimum gap should be 0 when including both negative and positive numbers without gaps.");
    }

    @Test
    void testWithLargeNumbers() {
        int[] numbers = {100, 200, 300, 400};
        assertEquals(99, MinimumGapAlgorithm.findMinimumGap(numbers),
                "The minimum gap should be 99 for large numbers with equal gaps.");
    }
}


