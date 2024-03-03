package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task46 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 1000; i <= 1500; i++) {
            int nums = i;
            int first = nums % 10;
            nums /= 10;
            int second = nums % 10;
            nums /= 10;
            int third = nums % 10;
            int fourth = nums / 10;
            if (String.valueOf(third).concat(String.valueOf(second)).equals(String.valueOf(num))) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(23);
        loop(40);
        loop(11);
    }
}