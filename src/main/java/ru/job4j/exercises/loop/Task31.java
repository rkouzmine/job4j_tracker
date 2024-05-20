package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task31 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        final int start = 10;
        final int end = 20;

        for (int i = start; i <= end; i++) {
            int num1, num2;
            int temp = i;
            num2 = temp % 10;
            temp /= 10;
            num1 = temp % 10;
            if (num > num1 * num2) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }

    public static void main(String[] args) {
        loop(5);
        loop(3);
        loop(1);
    }
}