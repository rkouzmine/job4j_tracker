package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task43 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 300; i <= 325; i++) {
            int num = i;
            int left = num % 10;
            num /= 10;
            int middle = num % 10;
            int right = num / 10;
            if (middle >= 1 && (left + middle) % right == 0) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
