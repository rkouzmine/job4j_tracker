package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task87 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 10; i <= 70; i++) {
            int digitFirst = i % 10;
            int digitSecond = i / 10;
            int sumDigit = digitFirst + digitSecond;
            if (Math.pow(sumDigit, 3) == Math.pow(i, 2)) {
                sj.add(String.valueOf(i)).toString();
            }
        }
        System.out.println(sj);
    }

    public static void main(String[] args) {
        loop();
    }
}