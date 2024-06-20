package ru.job4j.exercises.condition;

public class Task72 {
    public static void midDigitMore(int num) {
        int num1, num2, num3;
        num3 = num % 10;
        num2 = (num / 10) % 10;
        num1 = (num / 100) % 10;

        if (num2 > num1 && num2 > num3) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}