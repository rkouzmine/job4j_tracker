package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task34 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int start = num + 1;
        if (start % 2 == 0) {
            start++;
        }
        for (int i = 0; i < 5; i++) {
            stringJoiner.add(String.valueOf(start));
            start += 2;
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(5);
        loop(9);
        loop(20);
    }
}