package ru.job4j.exercises.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int l : left) {
            for (int r : right) {
                if (l == r) {
                    System.out.println(r);
                }
            }
        }
    }

    public static void main(String[] args) {
        printCrossEl(new int[]{1, 3}, new int[]{2, 1});
    }
}