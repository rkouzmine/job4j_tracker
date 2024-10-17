package ru.job4j.exercises.loop;

public class Task85 {
    public static void loop(int money, int percent, int months) {
        double sum = money;
        for (int i = 0; i < months; i++) {
           double moneyOfMonth = ((double) percent / 100) * sum;
            sum += moneyOfMonth;
        }
        System.out.printf("%.2f%n", sum);

    }

    public static void main(String[] args) {
        loop(10000, 5, 2);
    }
}