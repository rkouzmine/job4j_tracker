package ru.job4j.exercises.loop;

public class Task81 {
    public static void loop(int num) {
        int sum = 0;
        int numFirst = num % 10;
        int numSecond = num / 10;
        int min = Math.min(numFirst, numSecond);
        int max = Math.max(numFirst, numSecond);
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        loop(12);
        loop(52);
        loop(14);
    }
}