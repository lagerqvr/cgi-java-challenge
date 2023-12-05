package com.minimumgapalgorithm;

import java.util.Arrays;

public class MinimumGapAlgorithm {

    public static int findMinimumGap(int[] numbers) {
        Arrays.sort(numbers);
        int minGap = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length - 1; i++) {
            // Calculate the gap between two numbers
            int gap = numbers[i + 1] - numbers[i] - 1;
            if (gap > 0 && gap < minGap) {
                minGap = gap;
            }
        }

        // Return the smallest gap or 0 if no gaps exist
        return minGap == Integer.MAX_VALUE ? 0 : minGap;
    }

    public static void main(String[] args) {
        int[] exampleNumbers = {1, 4, 10};
        System.out.println("The minimum gap is: " + findMinimumGap(exampleNumbers));
    }
}
