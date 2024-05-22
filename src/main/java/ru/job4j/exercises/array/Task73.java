package ru.job4j.exercises.array;

public class Task73 {
    public static void array(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Input array should not be null");
        }
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            System.out.printf("%d %d%n", arr[i], arr[length - 1 - i]);
        }
        if (length % 2 != 0) {
            int mid = length / 2;
            System.out.println(arr[mid]);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 6, 0, 3};
        array(array);
    }
}