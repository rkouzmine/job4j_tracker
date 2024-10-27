package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task107 {
    public static void loop(int[] nums) {
        StringJoiner sj = new StringJoiner("\n");
//        sj.setEmptyValue("Значений: 0");
        int count = 0;
        for (int num : nums) {
            if (num == 999) {
                break;
            }
            sj.add(String.valueOf(num));
            count++;
        }
        if (sj.length() != 0) {
            System.out.printf("%s%nЗначений: %d%n", sj, count);
        } else {
            System.out.println("Значений: " + count);
        }
    }

    public static void main(String[] args) {
        loop(new int[]{1, 50, 100, 999, 1000});
        loop(new int[]{999, 50, 100, 999, 1000});
    }
}