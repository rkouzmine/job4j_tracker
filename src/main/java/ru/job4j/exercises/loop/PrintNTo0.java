package ru.job4j.exercises.loop;

public class PrintNTo0 {
    public static void out(int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        out(10);
    }
}
