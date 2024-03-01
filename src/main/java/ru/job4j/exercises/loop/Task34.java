package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task34 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int count = 0;
        for (int i = num + 1; ; i++) {
            if (i % 2 != 0) {
                count++;
                stringJoiner.add(String.valueOf(i));
            } else if (count == 5) {
                break;
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(5);
        loop(9);
        loop(20);
    }
}