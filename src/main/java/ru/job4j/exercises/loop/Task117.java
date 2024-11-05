package ru.job4j.exercises.loop;

public class Task117 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sum += digit;
                num /= 10;
                count++;
            } else {
                num /= 10;
            }
        }
        System.out.printf("Количество: %d, сумма: %d%n", count, sum);
    }

    public static void main(String[] args) {
        loop(223);
        loop(2232458);
    }
}