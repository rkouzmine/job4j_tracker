package ru.job4j.exercises.condition;

public class Task38 {
    public static void maxDigit(int number) {
        int num1, num2;
        num2 = number % 10;
        number /= 10;
        num1 = number % 10;

        if (num1 != num2) {
            System.out.println(Math.max(num1, num2));
        } else {
            System.out.println("Равны");
        }
    }
}
