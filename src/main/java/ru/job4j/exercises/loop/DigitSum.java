package ru.job4j.exercises.loop;

public class DigitSum {
    public static int sum(int num) {
        return String.valueOf(num)
                .chars()
                .map(i -> i - '0')
                .sum();
    }
}