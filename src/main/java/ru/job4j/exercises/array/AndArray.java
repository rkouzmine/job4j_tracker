package ru.job4j.exercises.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        Set<Integer> resultSet = new HashSet<>();
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    resultSet.add(right[j]);
                }
            }
        }
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (Integer integer : resultSet) {
            result[index++] = integer;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2, 1};
        System.out.println(Arrays.toString(and(array1, array2)));
    }
}