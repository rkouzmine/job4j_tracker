package ru.job4j.exercises.stream;

import java.util.Arrays;

public class FlatMapForPrimitive {
    public static int sum(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(subArray -> Arrays.stream(subArray))
                .sum();
    }
}