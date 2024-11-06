package ru.job4j.exercises.loop;

public class Task118 {
    public static void loop(int num) {
        int countEven = 0;
        int sumNotEven = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                countEven++;
            } else {
                sumNotEven += digit;
            }
            num /= 10;
        }
        System.out.printf("Количество чет: %d, сумма нечет: %d%n", countEven, sumNotEven);
    }

    public static void main(String[] args) {
        loop(2235);
    }
}