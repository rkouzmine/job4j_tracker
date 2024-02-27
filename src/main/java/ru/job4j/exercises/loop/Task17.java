package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task17 {
    public static void loop() {
        String ln = System.lineSeparator();
        StringJoiner stringJoiner = new StringJoiner(" ", "Начало" + ln, "\nКонец" + ln);
        for (int i = 10; i <= 19; i += 2) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.print(stringJoiner);
    }

    public static void main(String[] args) {
        loop();
    }
}