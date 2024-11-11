package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task122 {
    public static void loop(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");

        for (int num : nums) {
            int sum = 0;
            int digit = num;
            while (digit != 0) {
                sum += digit % 10;
                digit /= 10;
            }
            if (sum == 5) {
                break;
            }
            sj.add(String.valueOf(num));
        }
        System.out.println(sj.toString());
    }

    public static void main(String[] args) {
        loop(new int[]{11, 222, 36, 23, 10});
    }
}