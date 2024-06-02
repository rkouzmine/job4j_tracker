package ru.job4j.exercises.condition;

public class Task52 {
    public static void isEquals(int a1, int a2, int b1, int b2) {
        double sum1 = (double) a1 / a2;
        double sum2 = (double) b1 / b2;
        System.out.println(sum1 == sum2 ? "Да" : "Нет");
    }

    public static void main(String[] args) {
        isEquals(3, 3, 8, 8);
        isEquals(2, 5, 6, 15);
        isEquals(1, 3, 2, 6);
        isEquals(1, 3, 1, 4);
        isEquals(2, 7, 3, 8);
    }
}
