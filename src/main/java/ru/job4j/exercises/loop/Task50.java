package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task50 {
    public static void loop(int n) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int num = 1;
        for (int i = 0; i < 5; i++) {
            stringJoiner.add(String.valueOf(num));
            num += n;
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(3);
        loop(6);
        loop(1);
    }
}
