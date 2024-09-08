package ru.job4j.exercises.io;

public class Task20 {
    public static void print(int x, int y) {
        int sum = x + y;
        int multiple = x * y;
        System.out.printf("Переменные: %s %s%n"
                        + "Сумма: %s%n"
                        + "Произведение: %s%n",
                x, y, sum, multiple);
    }

    public static void main(String[] args) {
        print(1, 1);
    }
}