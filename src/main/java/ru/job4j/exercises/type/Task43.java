package ru.job4j.exercises.type;

public class Task43 {
    public static void rightNumChange(int number1, int number2) {
        int num1, num2, num3, num4, num5, num6;
        num1 = number1 % 10;
        number1 /= 10;
        num2 = number1 % 10;
        num3 = number1 / 10;
        num4 = number2 % 10;
        number2 /= 10;
        num5 = number2 % 10;
        num6 = number2 / 10;
        System.out.println(num3 + "" + num2 + "" + num4 + "\n"
                        + num6 + "" + num5 + "" + num1);
    }

    public static void main(String[] args) {
        rightNumChange(123, 456);
    }
}