package ru.job4j.exercises.condition;

public class Task32 {
    public static void calculate(int num1, int num2) {
        if (num1 != num2) {
            System.out.println(Math.abs(num1 - num2));
        } else {
            System.out.println(num1 * num2);
        }
    }
}