package ru.job4j.exercises.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int size = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                size++;
            }
        }

        int[] result = new int[size];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                result[index++] = data[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(changeData(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
    }
}