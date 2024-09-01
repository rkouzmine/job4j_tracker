package ru.job4j.exercises.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        int rsl = (num - 1) % prizes.length;
        return prizes[rsl];
    }
}