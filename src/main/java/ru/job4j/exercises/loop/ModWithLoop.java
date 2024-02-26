package ru.job4j.exercises.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int rsl = 0;
        while (n >= d + rsl) {
            rsl += d;
        }
        return n - rsl;
    }

    public static void main(String[] args) {
        System.out.println(mod(8, 3));
    }
}
