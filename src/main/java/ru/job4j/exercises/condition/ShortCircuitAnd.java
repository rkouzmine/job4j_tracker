package ru.job4j.exercises.condition;

public class ShortCircuitAnd {

    public static boolean showA() {
        System.out.println("A");
        return false;
    }

    public static boolean showB() {
        System.out.println("B");
        return false;
    }

    public static void main(String[] args) {
        if (showA() && showB()) {
            showA();
            showB();
        }
    }
}