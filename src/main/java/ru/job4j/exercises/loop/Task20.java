package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task20 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ", "Начало\n", "\nКонец");
        for (int i = 1500; i >= 1100; i -= 100) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);
    }
}
