package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task51 {
    public static void loop(int n, int m) {
        StringJoiner sj = new StringJoiner(" ");
        int min = Math.min(n, m);
        int max = Math.max(n, m);

        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                String num = String.valueOf((int) Math.pow(i, 2));
                sj.add(num);
            } else {
                sj.add(String.valueOf(0));
            }
        }
        System.out.println(sj.toString());
    }

    public static void main(String[] args) {
        loop(7, 2);
    }
}