package ru.job4j.exercises.loop;

public class Task116 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
            count++;
        }
        System.out.printf("Количество: %d, сумма: %d%n", count, sum);
    }

    public static void main(String[] args) {
        loop(1234);
        loop(222);
    }
}