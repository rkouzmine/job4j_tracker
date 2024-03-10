package ru.job4j.exercises.loop;

public class Task67 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // числа 0 и 1 не являются простыми
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // если делится без остатка нацело, то не является простым
            }
        }
        return true; // если после проверки все циклы пройдены успешно, то число простое
    }

    public static void main(String[] args) {
        boolean rsl = isPrime(17);
        System.out.println(rsl);
    }
}