package ru.job4j.exercises.loop;

public class Task130 {
    public static void loop(int num) {
        int count = 0;
        int digit = num;
        while (digit != 0) {
            if (digit % 10 == 0) {
                count++;
            }
            digit /= 10;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        loop(2020);
    }
}