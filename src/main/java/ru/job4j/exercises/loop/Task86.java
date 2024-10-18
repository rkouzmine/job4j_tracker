package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task86 {
    public static void loop(int[] num) {
        StringJoiner sj = new StringJoiner(" ");
        sj.setEmptyValue("Стабильных чисел нет");
        for (int number : num) {
            int sumDigitBefore = number % 10 + number / 10;
            int sumDigitAfter = number * 2 % 10 + number * 2 / 10;
            if (sumDigitBefore == sumDigitAfter) {
                sj.add(String.valueOf(number));
            }
        }
        System.out.println(sj.toString());
    }

    public static void main(String[] args) {
        loop(new int[]{36, 39});
        loop(new int[]{18, 27});
        loop(new int[]{12, 33});
    }
}