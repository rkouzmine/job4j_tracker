package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task29 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 100; i <= 150; i++) {
            int temp = i;
            int num1, num2, num3;
            num1 = temp % 10;
            temp /= 10;
            num2 = temp % 10;
            temp /= 10;
            num3 = temp % 10;

            if (num == num1 + num2 + num3) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(5);
    }
}