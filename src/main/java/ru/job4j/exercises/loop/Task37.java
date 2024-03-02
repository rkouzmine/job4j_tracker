package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task37 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 100; i <= 130; i++) {
            int num = i;
            int num1 = num % 10;
            num /= 10;
            int num2 = num % 10;
            int num3 = num / 10;

            if (num1 * num3 == Math.pow(num2, 2)) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
