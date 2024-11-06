package ru.job4j.exercises.loop;

public class Task119 {
    public static void loop(int num, int digit) {
        String result = "Нет";
        while (num != 0) {
            int number = num % 10;
            if (number == digit) {
                result = "Да";
                break;
            }
            num /= 10;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        loop(1235, 2);
    }
}