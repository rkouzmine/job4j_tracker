package ru.job4j.exercises.loop;

public class Task113 {
    public static void loop(int[] first, int[] second) {
        int sumFirst = 0;
        int sumSecond = 0;
        int index = 0;
        while (first[index] != second[index]) {
            sumFirst += first[index];
            sumSecond += second[index];
            index++;
        }
        System.out.printf("Сумма1: %d, сумма2: %d%n", sumFirst, sumSecond);
    }

    public static void main(String[] args) {
        loop(new int[]{2, 3, 4, 4, 6}, new int[] {1, 2, 3, 4, 5});
    }
}