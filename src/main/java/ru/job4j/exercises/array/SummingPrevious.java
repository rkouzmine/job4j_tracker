package ru.job4j.exercises.array;

import java.util.Arrays;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[]result = new int[n];
        result[0] = a;
        result[1] = b;
        int index = 2;
        int num = a + b;
        for (int i = 2; i < result.length; i++) {
            result[index++] = num;
            num *= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculate(1, 2, 5)));
    }
}