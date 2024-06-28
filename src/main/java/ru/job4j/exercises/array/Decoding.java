package ru.job4j.exercises.array;

import java.util.Arrays;

public class Decoding {
    public static int[] decode(int[] ints, int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        int[] result = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            result[i] = ints[i] % number;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{5, 7, 8, 2, 1};
        System.out.println(Arrays.toString(decode(ints, 2)));
    }
}