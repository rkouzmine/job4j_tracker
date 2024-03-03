package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task47 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 1345; i <= 1445; i++) {
            int num = i;
            int first = num % 10;
            num /= 10;
            int second = num % 10;
            num /= 10;
            int third = num % 10;
            int fourth = num / 10;
            if (first + second == third + fourth) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
