package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task45 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 100; i <= 500; i++) {
            String number = String.valueOf(num);
            if (String.valueOf(i).indexOf(number) > 0) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(23);
    }
}
