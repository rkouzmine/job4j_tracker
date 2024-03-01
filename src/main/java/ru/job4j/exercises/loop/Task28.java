package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task28 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 10; i <= 30; i++) {
            if (num == i % 10 + i / 10) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(1);
        loop(6);
        loop(8);
    }
}
