package ru.job4j.exercises.loop;

public class Task128 {
    public static void loop(int num) {
        int count = 0;
        int digits = num;
        while (digits != 0) {
            digits /= 10;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        loop(4545);
    }
}