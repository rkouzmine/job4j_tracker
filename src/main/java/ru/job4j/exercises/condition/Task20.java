package ru.job4j.exercises.condition;

public class Task20 {
    public static void numCheck(int number) {
        int sum1, sum2, sum3;
        sum1 = number % 10;
        number /= 10;
        sum2 = number % 10;
        sum3 = number / 10;
        if (sum1 % 2 == 0 && sum2 % 2 == 0 && sum3 % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}