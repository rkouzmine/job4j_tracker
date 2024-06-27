package ru.job4j.exercises.array;

public class Task77 {
    public static void array(int[] first, int[] second, int[] third) {
        if (first.length < 3 || second.length < 3 || third.length < 3) {
            throw new IllegalArgumentException("All arrays must have at least 3 elements.");
        }
        int[] sum = new int[3];
        for (int i = 0; i < 3; i++) {
            sum[i] = first[i] + second[i] + third[i];
        }
        System.out.printf("Первый: %d, второй: %d, третий: %d%n", sum[0], sum[1], sum[2]);
    }

    public static void main(String[] args) {
        int[] first = {10, 20, 30};
        int[] second = {10, 20, 30};
        int[] third = {10, 20, 30};
        array(first, second, third);
    }
}
