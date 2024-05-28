package ru.job4j.exercises.condition;

public class Task40 {
    public static void isDoubleEven(int number) {
        int lastDigit = number % 10;
        int middleDigit = (number / 10) % 10;
        int firstDigit = (number / 100) % 10;

        int sum = lastDigit + middleDigit + firstDigit;

        boolean isDoubleEven = (number % 2 == 0) && (sum % 2 == 0);

        System.out.println(isDoubleEven ? "Да" : "Нет");
    }
}