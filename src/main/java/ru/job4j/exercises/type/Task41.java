package ru.job4j.exercises.type;

public class Task41 {
    public static void rightCircleShift(int number) {
        int num1, num2, num3;

        num3 = number % 10;
        number /= 10;
        num2 = number % 10;
        number /= 10;
        num1 = number % 10;

        StringBuilder result = new StringBuilder();
        if (num3 != 0) {
            result.append(num3).append(num1).append(num2);
        } else if (num1 != 0) {
            result.append(num1).append(num2);
        } else {
            result.append(num2);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        rightCircleShift(123); // 312;
        rightCircleShift(120); // 12;
        rightCircleShift(100); // 10;
    }
}