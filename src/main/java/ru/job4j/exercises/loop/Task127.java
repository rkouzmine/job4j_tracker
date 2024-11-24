package ru.job4j.exercises.loop;

public class Task127 {
    public static void loop(int num) {
        int result = num;
        while (result > 10) {
            result /= 10;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        loop(145);
    }
}