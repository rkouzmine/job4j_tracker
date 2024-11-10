package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task121 {
    public static void loop(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");

        for (int num : nums) {
            int sumDigit = sumDigits(num);
            sj.add(String.valueOf(sumDigit));
        }
        System.out.println(sj.toString());
    }

    private static int sumDigits(int nums) {
        int sum = 0;
        while (nums != 0) {
            sum += nums % 10;
            nums /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        loop(new int[]{20, 321, 452, 58, 5});
    }
}