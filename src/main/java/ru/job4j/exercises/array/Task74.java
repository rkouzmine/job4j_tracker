package ru.job4j.exercises.array;

import java.util.StringJoiner;

public class Task74 {
    public static void array(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return;
        }

        StringJoiner firstHalf = new StringJoiner(" ");
        StringJoiner secondHalf = new StringJoiner(" ");

        int length = arr.length;
        int mid = length / 2;

        for (int i = 0; i < mid; i++) {
            firstHalf.add(String.valueOf(arr[i]));
        }

        for (int i = length - 1; i >= mid; i--) {
            secondHalf.add(String.valueOf(arr[i]));
        }

        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        array(array);
    }
}
