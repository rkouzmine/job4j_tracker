package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task30 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 100; i <= 130; i++) {
            if (num % 10 == i % 10) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }

    public static void main(String[] args) {
        loop(34);
    }
}
