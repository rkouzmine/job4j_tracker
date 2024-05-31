package ru.job4j.exercises.condition;

public class Task51 {
    public static void fractionType(int num1, int num2) {
        String result;
        if (num1 > num2) {
            result = "Неправильная";
        } else if (num1 < num2) {
            result = "Правильная";
        } else {
            result = "Целое число";
        }
        System.out.println(result);
    }
}