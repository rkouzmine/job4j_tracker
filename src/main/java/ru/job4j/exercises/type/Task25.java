package ru.job4j.exercises.type;

public class Task25 {
    public static void separate(int number) {
        int num1, num2, num3;
        num1 = number % 10;
        number /= 10;
        num2 = number % 10;
        num3 = number / 10;
        System.out.println(num3 * 100 + "+" + num2 * 10 + "+" + num1);
    }
}