package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task53 {
    public static void loop(int n) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 1; i <= n; i++) {
            stringJoiner.add(String.valueOf((int) Math.pow(2, i)));
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(4);
        loop(2);
        loop(1);
    }
}