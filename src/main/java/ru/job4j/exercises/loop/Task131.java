package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task131 {
    public static void loop(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
            if (count == 3) {
                break;
            }
            sj.add(String.valueOf(num));
        }
        System.out.println(sj.toString());
    }

    public static void main(String[] args) {
        loop(new int[]{1, 2, 3, 4, 5, 6, 7});
        loop(new int[]{1, 3, 5, 7, 2, 5, 2, 2});
    }
}