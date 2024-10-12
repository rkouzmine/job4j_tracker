package ru.job4j.exercises.loop;

public class Task74 {
    public static void loop(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        String result = sum % 2 == 0 && num % 2 == 0 ? "Да" : "Нет";
        System.out.println(result);
    }
}