package ru.job4j.exercises.array;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int min = ints[0];
        int max = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
            if (ints[i] > max) {
                max = ints[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, -5, -1, -6, 8};
        System.out.println(calculate(array));
    }
}