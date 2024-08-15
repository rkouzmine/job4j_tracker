package ru.job4j.exercises.list;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        if (denominator < 0) {
            return 0;
        }
        int sum = 0;
        int current = first;
        for (int i = 0; i < count; i++) {
            sum += current;
            current *= denominator;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(generateAndSum(1, 3, 10));
        System.out.println(generateAndSum(1, -1, 10));
    }
}