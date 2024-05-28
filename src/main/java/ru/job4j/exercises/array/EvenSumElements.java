package ru.job4j.exercises.array;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (int el : data) {
            sum += el;
        }
        return sum % 2 == 0;
    }
}
