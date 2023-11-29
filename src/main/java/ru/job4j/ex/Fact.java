package ru.job4j.ex;

public class Fact {
    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N could not be less than 0");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        new Fact().calc(-1);
    }
}
