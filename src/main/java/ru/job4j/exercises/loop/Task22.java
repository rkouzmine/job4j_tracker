package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task22 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 100; i <= 300; i++) {
            if (i % 80 == 45) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop();
    }
}