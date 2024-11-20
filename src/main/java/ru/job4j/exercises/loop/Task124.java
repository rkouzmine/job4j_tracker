package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task124 {
    public static void loop(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        int index = 0;
        int maxSumDigits = 0;
        for (int i = 0; i < nums.length; i++) {
            int sumDigits = 0;
            int digit = nums[i];
            while (digit != 0) {
                sumDigits += digit % 10;
                digit /= 10;
            }
            if (sumDigits > maxSumDigits) {
                maxSumDigits = sumDigits;
                index = i;
            }
            sj.add(String.valueOf(sumDigits));
        }
        System.out.printf("Суммы: %s, индекс: %d%n", sj.toString(), index);
    }

    public static void main(String[] args) {
        loop(new int[]{4, 351, 250, 29, 93});
        loop(new int[]{19, 22});
    }
}