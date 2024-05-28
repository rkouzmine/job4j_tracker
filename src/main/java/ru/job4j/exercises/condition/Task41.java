package ru.job4j.exercises.condition;

public class Task41 {
    public static void evenDigitsAmount(int number) {
        int num1, num2, num3, count = 0;
        num3 = number % 10;
        num2 = (number / 10) % 10;
        num1 = (number / 100) % 10;

        if (num1 % 2 == 0) {
            count++;
        }
        if (num2 % 2 == 0) {
            count++;
        }
        if (num3 % 2 == 0) {
            count++;
        }
        System.out.println(count);
    }
}