package ru.job4j.exercises.condition;

import java.util.NoSuchElementException;

public class Task32 {
    public static void calculate(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 - num2);
        } else if (num1 < num2) {
            System.out.println(num2 - num1);
        } else {
            System.out.println(num1 * num2);
        }
    }
}