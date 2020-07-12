package ua.kiev.minaeva;

import java.util.Arrays;

public class Test2 {

    public int test(int[] height) {
        validateInput(height);
        int length = height.length;
        int[][] area = new int[length][length];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < length-1; i++) {
            for (int j = i + 1; j < length; j++) {
                area[i][j] = (j - i) * Math.min(height[i], height[j]);
                if (area[i][j] > max) {
                    max = area[i][j];
                }
            }
        }

        return max;
    }

    private void validateInput(int[] height) {
        if (height == null) {
            throw new RuntimeException("input array is null");
        }

        if (height.length < 2) {
            throw new RuntimeException("array length should be not less than 2");
        }

        if (Arrays.stream(height).anyMatch(element -> element < 0)) {
            throw new RuntimeException("array elements should be positive");
        }
    }
}
