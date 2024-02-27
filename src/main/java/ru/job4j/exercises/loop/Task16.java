package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task16 {
    public static void loop() {
        String ln = System.lineSeparator();
        StringJoiner stringJoiner = new StringJoiner(" ", "Старт" + ln, "\nФиниш" + ln);
        for (int i = 1; i <= 9; i++) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.print(stringJoiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
