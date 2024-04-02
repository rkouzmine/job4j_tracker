package ru.job4j.exercises.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int sumCup = 0;
        if (count >= n) {
            sumCup = count / n;
        }
        return sumCup + count;
    }

    public static void main(String[] args) {
        System.out.println(countCup(213, 6));
    }
}