package ru.job4j.exercises.loop;

public class Task68 {
    public static void loop(int num1, int num2) {
        int countFirst = 0;
        int countSecond = 0;

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                countFirst++;
            }
        }
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                countSecond++;
            }
        }
        String result = countFirst == countSecond ? "Да" : "Нет";
        System.out.println(result);
    }

    public static void main(String[] args) {
        loop(4, 7);
        loop(10, 8);
        loop(4, 8);
        loop(17, 8);
    }
}