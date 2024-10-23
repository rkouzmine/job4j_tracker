package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task91 {
    public static void loop(int n1, int n2, int n3) {
        StringJoiner sj = new StringJoiner(" ");
        sj.setEmptyValue("Нет");
        boolean flag = n2 - n1 == n3 - n2;
        if (flag) {
            int step = n2 - n1;
            for (int i = 0; i < 3; i++) {
                n3 += step;
                sj.add(String.valueOf(n3));
            }
        }
        System.out.println(sj.toString());
    }

    public static void main(String[] args) {
        loop(2, 4, 6);
    }
}