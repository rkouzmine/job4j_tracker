package ru.job4j.exercises.type;

public class Task24 {
    public static void separate(int number) {
        int num1, num2;
        num1 = number % 10;
        num2 = number / 10;
        System.out.println(num2 * 10 + "+" + num1);
    }
}
