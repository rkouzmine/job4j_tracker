package ru.job4j.exercises.array;

public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        return Math.max(array[0], array[array.length - 1]);
    }
}