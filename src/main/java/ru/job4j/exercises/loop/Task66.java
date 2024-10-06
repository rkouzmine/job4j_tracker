package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task66 {
    public static void loop(int num) {
        int count = 0;
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sj.add(String.valueOf(i));
                count++;
            }
        }
        System.out.printf("Количество: %s, Делители: %s%n", count, sj.length() != 0 ? sj : 0);
    }

    public static void main(String[] args) {
        loop(30);
        loop(1);
    }
}