package ru.job4j.exercises.type;

public class Task39 {
    public static void leftCircleShift(int number) {
        int num1, num2, num3;

        num1 = number % 10;
        number /= 10;
        num2 = number % 10;
        number /= 10;
        num3 = number % 10;

        if (num2 != 0) {
            System.out.println(num2 + "" + num1 + "" + num3);
        } else if (num2 == 0 && num1 != 0) {
            System.out.println(num1 + "" + num3);
        } else if (num2 == 0 && num1 == 0 && num3 != 0) {
            System.out.println(num3);
        }
    }
}