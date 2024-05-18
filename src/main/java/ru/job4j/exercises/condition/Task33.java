package ru.job4j.exercises.condition;

public class Task33 {
    public static void numSquare(int number) {
        if (number < 0) {
            System.out.println((int) Math.abs(Math.pow(number, 2)));
        } else {
            System.out.println("Ошибка");
        }
    }

    public static void main(String[] args) {
        numSquare(1);
        numSquare(0);
        numSquare(-1);
        numSquare(-4);
    }
}
