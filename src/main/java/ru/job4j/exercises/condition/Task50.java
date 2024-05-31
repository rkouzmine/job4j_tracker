package ru.job4j.exercises.condition;

public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        int numFirst, numSecond;
        numFirst = num1 % 10;
        numSecond = num2 % 10;

        if (numFirst != numSecond) {
            System.out.println(Math.max(numFirst, numSecond));
        } else {
            System.out.println("Одинаковые");
        }
    }
}
