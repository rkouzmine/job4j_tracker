package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task26 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int count = 0;
        for (int i = 0; ; i -= 8) {
            count++;
            stringJoiner.add(String.valueOf(i));
            if (count == num * 2) {
                break;
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(1);
        loop(2);
        loop(3);
    }
}
