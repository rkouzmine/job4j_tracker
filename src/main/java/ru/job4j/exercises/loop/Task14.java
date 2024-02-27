package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task14 {
    public static void loop(int a, int b) {
        String ln = System.lineSeparator();
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = a; i < b; i++) {
            if (i >= 10) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.print(
                "Старт" + ln
                + stringJoiner + ln
                + "Финиш" + ln
        );
    }

    public static void main(String[] args) {
        loop(26, 29);
    }
}