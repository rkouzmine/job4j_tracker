package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task32 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        final int start = 50;
        final int end = 10;

        for (int i = start; i >= end; i--) {
            if (i % 10 == 7) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }

    public static void main(String[] args) {
        loop();
    }
}