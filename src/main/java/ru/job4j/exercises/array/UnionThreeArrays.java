package ru.job4j.exercises.array;

import java.util.Arrays;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[right.length + 1];
        int index = 2;
        result[0] = left[0];
        result[result.length - 1] = left[left.length - 1];

        for (int i = 1; i < middle.length; i += 2) {
            result[index] = middle[i];
            index += 2;
        }
        index = 1;
        for (int i = 0; i < right.length; i += 2) {
            result[index] = right[i];
            index += 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3, 4, 5};
        int[] middle = {6, 7, 8, 9, 10};
        int[] right = {11, 12, 13, 14, 15, 16};
        String result = Arrays.toString(union(left, middle, right));
        System.out.println(result);
    }
}