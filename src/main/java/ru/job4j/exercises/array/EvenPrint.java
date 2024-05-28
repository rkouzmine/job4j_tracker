package ru.job4j.exercises.array;

public class EvenPrint {
    public static void print(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        print(array);
    }
}