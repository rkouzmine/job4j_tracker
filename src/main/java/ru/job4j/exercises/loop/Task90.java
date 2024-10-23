package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task90 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int count = 0;
        int sum = 0;
        for (int i = 10; i < 100; i++) {
            int digitFirst = i % 10;
            int digitSecond = i / 10;
            int sumDigit = digitFirst + digitSecond;
            if (sumDigit * 2 == digitFirst * digitSecond) {
                sj.add(String.valueOf(i));
                count++;
                sum += i;
            }
        }
        System.out.printf("Числа: %s, Количество: %d, Сумма: %d%n", sj, count, sum);
    }

    public static void main(String[] args) {
        loop();
    }
}