package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task21 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ", "Старт\n", "\nФиниш");
        for (int i = 38; i >= 10; i--) {
            if (i % 5 == 0) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}