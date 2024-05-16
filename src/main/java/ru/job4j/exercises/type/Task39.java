package ru.job4j.exercises.type;

public class Task39 {
    public static void leftCircleShift(int number) {
        if (number >= 100 && number <= 999) {
            int lastDigit = number % 10;
            number /= 10;
            int middleDigit = number % 10;
            number /= 10;
            int firstDigit = number % 10;

            StringBuilder result = new StringBuilder();
            if (middleDigit != 0) {
                result.append(middleDigit).append(lastDigit).append(firstDigit);
            } else if (lastDigit != 0) {
                result.append(lastDigit).append(firstDigit);
            } else if (firstDigit != 0) {
                result.append(firstDigit);
            }
            System.out.println(result);
        } else {
            System.out.println("Введите трехзначное положительное число");
        }
    }
}