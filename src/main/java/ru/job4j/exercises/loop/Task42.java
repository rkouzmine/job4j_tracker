package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task42 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 20; i <= 30; i++) {
            int num1 = i % 10;
            int num2 = i / 10;
            if (num1 % 3 != num2 % 3) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop();
    }
}