package ru.job4j.exercises.condition;

public class Task31 {
    public static void numCompare(int num1, int num2) {
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        System.out.println(min + " " + max);
        System.out.println(max + " " + min);
    }
}