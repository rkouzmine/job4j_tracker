package ru.job4j.exercises.loop;

public class Task67 {
    public static void loop(int num) {
        String rsl = "Да";
        if (num <= 1) {
            System.out.println("Нет");
            return;
        }

        for (int i = 2; i * i <= num; i++) {
            rsl = num % i == 0 ? "Нет" : "Да";
            break;
        }
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        loop(7);
        loop(12);
        loop(10);
        loop(1);
        loop(2);
    }
}