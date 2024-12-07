package ru.job4j.exercises.loop;

public class Task147 {
    public static void loop(int num, int[] tickets) {
        int temp = num;
        int buyers = 0;
        int denied = 0;
        for (int t : tickets) {
            if (temp >= t) {
                temp -= t;
                buyers++;
            } else {
                denied++;
            }
        }
        System.out.printf("Покупатели: %d, отказано: %d%n", buyers, denied);
    }

    public static void main(String[] args) {
        loop(10, new int[]{2, 5, 5, 7, 2, 1});
    }
}