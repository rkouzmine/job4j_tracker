package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task88 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int digitFirst = i % 10;
            int digitSecond = i / 10;
            int sumDigit = digitFirst * digitSecond;
            if (sumDigit * 3 == i) {
                sj.add(String.valueOf(i));
                count++;
            }
        }
        System.out.printf("Числа: %s, Количество: %d%n", sj, count);
    }

    public static void main(String[] args) {
        loop();
    }
}