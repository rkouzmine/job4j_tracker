package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task24 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int count = 0;
        for (int i = num - 10; ; i -= 6) {
            count++;
            stringJoiner.add(String.valueOf(i));
            if (count == 5) {
                break;
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(50);
        loop(20);
        loop(0);
    }
}