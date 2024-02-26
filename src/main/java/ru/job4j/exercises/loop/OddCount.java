package ru.job4j.exercises.loop;

public class OddCount {
    public static int count(int a, int b) {
        int count = 1;
        for (int i = a; i <= b; i++) {
            if (b % i == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(1, 2));
        System.out.println(count(1, 4));
        System.out.println(count(1, 5));
    }
}