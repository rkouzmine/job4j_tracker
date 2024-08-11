package ru.job4j.exercises.list;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int sum = 0;
        boolean isArProgression = true;
        for (int i = 1; i < data.size() - 1; i++) {
            int a = data.get(i - 1);
            int b = data.get(i);
            int c = data.get(i + 1);
            if (b - a != c - b) {
                isArProgression = false;
                break;
            }
        }
        if (isArProgression) {
            for (Integer num : data) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> data1 = List.of(
                1, 6, 11, 16, 21,
                26, 31, 36, 41, 46
        );
        List<Integer> data2 = List.of(
                1, 6, 11, 15, 21,
                26, 31, 36, 41, 46
        );
        List<Integer> data3 = List.of(
                2, 6, 11, 16, 21,
                26, 31, 36, 41, 46
        );
        List<Integer> data4 = List.of(
                1, 6, 11, 16, 21,
                26, 31, 36, 41, 47
        );
        System.out.println(checkData(data1));
        System.out.println(checkData(data2));
        System.out.println(checkData(data3));
        System.out.println(checkData(data4));
    }
}