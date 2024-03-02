package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task38 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 200; i <= 223; i++) {
            int num1 = i % 10;
            int num2 = i % 10;
            int num3 = i / 10;
            if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
