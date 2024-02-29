package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task25 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int count = 0;
        for (int i = 7; ; i += 4) {
            count++;
            stringJoiner.add(String.valueOf(i));
            if (count == num) {
                break;
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(5);
    }
}