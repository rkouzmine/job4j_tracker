package ru.job4j.exercises.type;

public class Task32 {
    public static void evenAmount(int number) {
        int num1, num2, counter = 0;
        num1 = number % 10;
        number /= 10;
        num2 = number % 10;
        number /= 10;

        if (num1 % 2 == 0) {
            counter++;
        }
        if (num2 % 2 == 0) {
            counter++;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        evenAmount(64);
    }
}