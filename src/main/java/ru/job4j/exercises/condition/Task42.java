package ru.job4j.exercises.condition;

public class Task42 {
    public static void isPairSymmetric(int number) {
        int num1, num2;
        num2 = number % 100;
        num1 = (number / 100) % 100;
        boolean result = num1 == num2;
        System.out.println(result ? "Да" : "Нет");
    }

    public static void main(String[] args) {
        isPairSymmetric(1234);
        isPairSymmetric(4242);
    }
}
