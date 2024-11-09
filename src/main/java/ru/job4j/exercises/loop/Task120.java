package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task120 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ", "", "0");
        sj.setEmptyValue("0");
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        int length = sb.length();

        if (length > 1) {
            for (int i = 0; i < length; i++) {
                sb.deleteCharAt(sb.length() - 1);
                sj.add(sb);
            }
        }
        System.out.println(sj.toString());
    }

    public static void main(String[] args) {
        loop(52435);
        loop(543);
        loop(1);
    }
}