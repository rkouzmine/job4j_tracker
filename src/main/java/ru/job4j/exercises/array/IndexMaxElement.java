package ru.job4j.exercises.array;

public class IndexMaxElement {
    public static int getIndexMax(int[] array) {
        return array[0] > array[array.length - 1] ? 0 : array.length - 1;
    }
}
