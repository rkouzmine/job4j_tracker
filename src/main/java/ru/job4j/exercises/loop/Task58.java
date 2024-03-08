package ru.job4j.exercises.loop;

public class Task58 {
    public static void loop(int num) {
        int count = 0;
        for (int i = 10; i <= 20; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        loop(60);
        loop(100);
        loop(31);
    }
}