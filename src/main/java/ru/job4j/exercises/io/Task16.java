package ru.job4j.exercises.io;

public class Task16 {
    public static void main(String[] args) {
        String source = "+!?";
        char firstCh = source.charAt(0);
        char secondCh = source.charAt(1);
        char thirdCh = source.charAt(2);

        for (int i = 0; i < 3; i++) {
            System.out.print(firstCh);
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(secondCh);
        }
        for (int i = 0; i < 2; i++) {
            System.out.print(thirdCh);
        }
    }
}