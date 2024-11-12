package ru.job4j.exercises.loop;

public class Task76 {
    public static void loop(int num1, int num2) {
        int sum = 0;
        int num = Math.min(num1, num2);
        for (int i = 1; i <= num; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                sum += i;
            }
        }
        String result = sum % 2 == 0 ? "Да" : "Нет";
        System.out.println(result);
    }

    public static void main(String[] args) {
        loop(12, 24);
        loop(28, 14);
        loop(10, 6);
        loop(4, 8);
    }
}