package ru.job4j.exercises.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i += 2) {
                result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 5));
        System.out.println(sum(0, 6));
    }
}