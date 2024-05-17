package ru.job4j.exercises.type;

public class Task33 {
    public static void numSquare(int number) {
        if (number < 0) {
            System.out.println((int) Math.abs(Math.pow(number, 2)));
        } else {
            System.out.println("Ошибка");
        }
    }
}
