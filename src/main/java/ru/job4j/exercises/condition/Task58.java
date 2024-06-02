package ru.job4j.exercises.condition;

public class Task58 {
    public static void isWinning(int number) {

        int sum1, sum2, num1, num2, num3, num4, num5, num6;
        num6 = number % 10;
        number /= 10;
        num5 = number % 10;
        number /= 10;
        num4 = number % 10;
        number /= 10;
        num3 = number % 10;
        number /= 10;
        num2 = number % 10;
        number /= 10;
        num1 = number % 10;

        sum1 = num1 + num2 + num3;
        sum2 = num4 + num5 + num6;

        if (sum1 == sum2 && sum1 % 2 == 0 && sum2 % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
