package ru.job4j.exercises.type;

public class Task42 {
    public static void rightCircleShift(int number) {
        int num1, num2, num3, num4;

        num4 = number % 10;
        number /= 10;
        num3 = number % 10;
        number /= 10;
        num2 = number % 10;
        number /= 10;
        num1 = number % 10;

        StringBuilder result = new StringBuilder();
        if (num4 != 0) {
            result.append(num4).append(num1).append(num2).append(num3);
        } else if (num1 != 0) {
            result.append(num1).append(num2).append(num3);
        } else if (num2 != 0) {
            result.append(num2).append(num3);
        } else {
            result.append(num3);
        }
        System.out.println(result);
    }
}