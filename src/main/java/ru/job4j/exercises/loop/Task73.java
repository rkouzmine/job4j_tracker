package ru.job4j.exercises.loop;

public class Task73 {
    public static void loop(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        String result = sum == num ? "Да" : "Нет";
        System.out.println(result);
    }
}