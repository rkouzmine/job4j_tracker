package ru.job4j.exercises.type;

public class Task40 {
    public static void leftCircleShift(int number) {
        if (number >= 1000 && number <= 9999) {
            int num1, num2, num3, num4;
            num1 = number % 10;
            number /= 10;
            num2 = number % 10;
            number /= 10;
            num3 = number % 10;
            number /= 10;
            num4 = number % 10;

            StringBuilder result = new StringBuilder();
            if (num3 != 0) {
                result.append(num3).append(num2).append(num1).append(num4);
            } else if (num2 != 0) {
                result.append(num2).append(num1).append(num4);
            } else if (num1 != 0) {
                result.append(num1).append(num4);
            } else {
                result.append(num4);
            }
            System.out.println(result);
        } else {
            System.out.println("Введите четырехзначное положительное число");
        }
    }
}