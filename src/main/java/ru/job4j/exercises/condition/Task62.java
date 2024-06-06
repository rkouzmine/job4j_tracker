package ru.job4j.exercises.condition;

public class Task62 {
    public static void isRising(int number) {
        int num1, num2, num3;
        num3 = number % 10;
        num2 = (number / 10) % 10;
        num1 = (number / 100) % 10;

        System.out.println(num1 <= num2 && num2 <= num3 ? "Да" : "Нет");
    }
}
