package ru.job4j.exercises.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        Set<Integer> resultSet = new HashSet<>();
        for (int i = 0; i < left.length; i++) {
            resultSet.add(left[i]);
        }
        for (int i = 0; i < right.length; i++) {
            resultSet.add(right[i]);
        }
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2};
        int[] array2 = new int[]{2};
        System.out.println(Arrays.toString(or(array1, array2)));
    }
}