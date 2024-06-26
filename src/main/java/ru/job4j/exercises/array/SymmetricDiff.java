package ru.job4j.exercises.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : left) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : right) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[map.size()];
        int index = 0;
        for (Map.Entry<Integer, Integer> num : map.entrySet()) {
            if (num.getValue() == 1) {
                result[index++] = num.getKey();
            }
        }
        return Arrays.copyOf(result, index);
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2};
        int[] array2 = new int[]{2, 3};
        System.out.println(Arrays.toString(diff(array1, array2)));
    }
}