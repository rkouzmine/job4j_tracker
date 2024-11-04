package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task111 {
    public static void loop(int num) {
        int sum = 0;
        double numSquared = Math.pow(num, 2);
        StringJoiner sj = new StringJoiner(" ");
        for (int i = num + 1;  i < numSquared; i++) {
            if (sum + i < numSquared) {
                sum += i;
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }

    public static void main(String[] args) {
        loop(5);
        loop(3);
    }
}