package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task35 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < 5; i++) {
            num -= 6;
            stringJoiner.add(String.valueOf(num));
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(10);
        loop(35);
        loop(-6);
    }
}
