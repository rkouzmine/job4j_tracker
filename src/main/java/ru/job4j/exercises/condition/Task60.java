package ru.job4j.exercises.condition;

public class Task60 {
    public static void numRelation(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("Все равны");
        } else if (a == b) {
            System.out.println("Первое и второе равны, третье " + (a < c ? "больше" : "меньше"));
        } else if (a == c) {
            System.out.println("Первое и третье равны, второе " + (a < b ? "больше" : "меньше"));
        } else if (b == c) {
            System.out.println("Второе и третье равны, первое " + (b < a ? "больше" : "меньше"));
        } else  {
            System.out.println("Равных нет");
        }
    }
}