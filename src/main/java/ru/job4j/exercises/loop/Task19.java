package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task19 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ", "Старт\n", "\nФиниш");
        for (int i = 107; i <= 147; i += 10) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);
    }
}
