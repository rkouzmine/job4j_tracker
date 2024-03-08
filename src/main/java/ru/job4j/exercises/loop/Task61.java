package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task61 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 100; i <= 500; i++) {
            int num = i;
            int num1 = num % 10;
            num /= 10;
            int num2 = num % 10;
            int num3 = num / 10;
            if (Math.pow(num1, 2) + Math.pow(num3, 2) == Math.pow(num2, 2)) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }

    public static void main(String[] args) {
        loop();
    }
}