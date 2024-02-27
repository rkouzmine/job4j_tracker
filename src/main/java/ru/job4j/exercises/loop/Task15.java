package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task15 {
    public static void loop(int a, int b) {
        String ln = System.lineSeparator();
        StringJoiner stringJoiner = new StringJoiner(" ", "Старт" + ln, "\nФиниш" + ln);
        for (int i = b; i > a; i--) {
            if (i >= 100) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.print(stringJoiner);
    }

    public static void main(String[] args) {
        loop(16, 104);
    }
}