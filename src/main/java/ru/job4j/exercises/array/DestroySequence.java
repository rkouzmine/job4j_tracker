package ru.job4j.exercises.array;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        if (seq.length >= 10) {
            for (int i = 0; i < 5; i++) {
                seq[i] = '0';
            }
            for (int i = seq.length - 5; i < seq.length; i++) {
                seq[i] = '1';
            }
        }
        return seq;
    }

    public static void main(String[] args) {
        char[] array = new char[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(destroy(array));
    }
}