package ru.job4j.exercises.loop;

public class Task130 {
    public static void loop(int num) {
        int count = 0;
        char[] chars = String.valueOf(num).toCharArray();
        for (char symbol : chars) {
           String ch = String.valueOf(symbol);
            if ("0".equals(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        loop(2020);
    }
}