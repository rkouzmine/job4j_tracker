package ru.job4j.exercises.loop;

public class Task104 {
    public static void loop(int[] num) {
        int max = num[0];
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
                result = i;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        loop(new int[]{101, 303, 909, 505, 707});
    }
}