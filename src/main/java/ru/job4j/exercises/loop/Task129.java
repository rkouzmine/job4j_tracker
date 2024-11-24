package ru.job4j.exercises.loop;

public class Task129 {
    public static void loop(int num) {
        int sum = 0;
        int digints = num;
        while (digints != 0) {
            sum += digints % 10;
            digints /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        loop(353);
    }
}