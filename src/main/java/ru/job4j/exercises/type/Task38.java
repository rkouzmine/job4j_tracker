package ru.job4j.exercises.type;

public class Task38 {
    public static void leftShift(int number) {
        if (number >= 1000 && number <= 9999) {
            int num1 = number % 10;
            number /= 10;
            int num2 = number % 10;
            number /= 10;
            int num3 = number % 10;

            StringBuilder result = new StringBuilder();
            if (num3 != 0) {
                result.append(num3).append(num2).append(num1).append(0);
            } else if (num2 != 0) {
                result.append(num2).append(num1).append(0);
            } else if (num1 != 0) {
                result.append(num1).append(0);
            } else {
                result.append(0);
            }
            System.out.println(result);
        } else {
            System.out.println("Введите четырехзначное положительное число");
        }
    }

    public static void main(String[] args) {
        leftShift(1234); //2340
        leftShift(1200); //2000
        leftShift(1060); //600
        leftShift(1006); //60
        leftShift(1000); //0
    }
}