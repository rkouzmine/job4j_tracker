package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task133 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        int temp = num;
        while (temp < 1000) {
            sj.add(String.valueOf(temp));
            temp *= num;

        }
       String result = sj.length() != 0 ? sj + "\n" : sj.toString();
        System.out.print(result);
    }

    public static void main(String[] args) {
        loop(5);
        loop(1001);
    }
}