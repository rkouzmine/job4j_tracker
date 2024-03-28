package ru.job4j.exercises.type;

public class Task44 {
    public static void rightNumChange(int number1, int number2) {
        int num1, num2;
        num1 = number1 % 10;
        number1 /= 10;
        num2 = number2 % 10;
        number2 /= 10;
        System.out.println(number1 + "" + num2 + "\n"
                        + number2 + "" + num1);
    }

    public static void main(String[] args) {
        rightNumChange(123, 4567);
    }
}