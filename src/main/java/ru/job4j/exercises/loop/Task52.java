package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task52 {
    public static void loop(int n, int m) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int num = 0;
        if (n <= m) {
            num = m;
            for (int i = 0; i < n; i++) {
                stringJoiner.add(String.valueOf(num));
                num++;
                
            }
        } else {
            num = n;
            for (int i = 0; i < m; i++) {
                stringJoiner.add(String.valueOf(num));
                num++;
            }
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(5, 3);
        loop(2, 5);
        loop(3, 3);
    }
}