package ru.job4j.exercises.array;

import java.util.Arrays;

public class Task82 {
    public static int[] array(int[] nums) {
        int sumPositive = 0, sumNegative = 0, countZero = 0;
        for (int num : nums) {
            if (num > 0) {
                sumPositive += num;
            } else if (num < 0) {
                sumNegative += num;
            } else {
                countZero++;
            }
        }
        return new int[]{sumPositive, sumNegative, countZero};
    }

    public static void main(String[] args) {
            int[]arr = new int[]{5, -5, -4, 0, 3, 1};
            int[] result = array(arr);
            System.out.println(Arrays.toString(result));
    }
}