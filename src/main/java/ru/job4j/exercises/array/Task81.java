package ru.job4j.exercises.array;

import java.util.Arrays;

public class Task81 {
    public static int[] array(int[] nums) {
        int countP = 0, countM = 0, countZ = 0;
        for (int num : nums) {
            if (num > 0) {
                countP++;
            } else if (num < 0) {
                countM++;
            } else {
                countZ++;
            }
        }
        return new int[] {countM, countZ, countP};
    }

    public static void main(String[] args) {
        int[]arr = new int[]{5, -5, -4, 0, 3, 1};
        int[] result = array(arr);
        System.out.println(Arrays.toString(result));
    }
}
