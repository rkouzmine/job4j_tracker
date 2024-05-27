package ru.job4j.exercises.condition;

public class Task36 {
    public static void sameNums(int number) {
        int num1, num2;
        num2 = number % 10;
        number /= 10;
        num1 = number % 10;

        System.out.println(num1 == num2 ? "Да" : "Нет");
    }
}