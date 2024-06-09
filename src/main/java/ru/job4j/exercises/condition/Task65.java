package ru.job4j.exercises.condition;

public class Task65 {
    public static void season(int number) {
        String result = switch (number) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Не является месяцем";
        };
        System.out.println(result);
    }
}