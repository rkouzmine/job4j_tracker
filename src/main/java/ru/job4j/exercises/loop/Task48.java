package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task48 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner("+");
        for (int i = 1; i <= num; i++) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(5);
    }
}