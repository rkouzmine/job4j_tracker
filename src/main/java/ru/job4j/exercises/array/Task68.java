package ru.job4j.exercises.array;

import java.util.StringJoiner;

public class Task68 {
    public static void array(int[] arr) {
        StringJoiner sj = new StringJoiner(" ");
        for (Integer num : arr) {
            sj.add(String.valueOf(num));
        }
        System.out.println(sj);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, -2, 6, 0};
        array(arr);
    }
}