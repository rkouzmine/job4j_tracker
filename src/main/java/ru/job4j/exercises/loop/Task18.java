package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task18 {
    public static void loop() {
        String ln = System.lineSeparator();
        StringJoiner stringJoiner = new StringJoiner(" ", "Начало" + ln, "\nКонец" + ln);
        for (int i = 10; i <= 19; i += 2) {
            if (i % 4 == 0) {
                stringJoiner.add(String.valueOf(i + "#"));
            } else {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.print(stringJoiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
