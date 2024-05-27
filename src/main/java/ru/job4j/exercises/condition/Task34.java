package ru.job4j.exercises.condition;

public class Task34 {
    public static void chairsCheck(int pupils, int chairs) {
        if (pupils < 0 || chairs < 0) {
            throw new IllegalArgumentException("Некорректные данные");
        }

        int count = 0;
        if (pupils < chairs) {
            count = chairs - pupils;
            System.out.println("Лишних стульев: " + count);
        } else if (pupils > chairs) {
            count = pupils - chairs;
            System.out.println("Не хватает стульев: " + count);
        } else {
            System.out.println("Соответствует");
        }
    }
}