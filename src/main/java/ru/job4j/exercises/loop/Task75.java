package ru.job4j.exercises.loop;

public class Task75 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                count++;
            }
        }
        String result = sum % count == 0 && num % count == 0 ? "Да" : "Нет";
        System.out.println(result);
    }
}