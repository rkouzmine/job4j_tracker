package ru.job4j.exercises.loop;

public class Task59V2 {
    public static void loop(int num, int[] array) {
        int equals = 0;
        int less = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                equals++;
            } else if (array[i] < num) {
                less++;
            }
        }
        System.out.printf("Равно: %s, меньше: %s%n", equals, less);
    }

    public static void main(String[] args) {
        loop(2, new int[]{0, 1, 2, 3});
    }
}