package ru.job4j.exercises.array;

import java.util.StringJoiner;

public class Task70 {
    public static void array(int[] arr) {
        StringJoiner firstHalf = new StringJoiner(" ");
        StringJoiner secondHalf = new StringJoiner(" ");

        /*
         * Находим середину массива.
         * Если длина нечетная, средний элемент включается в первую половину.
         */

        int mid = arr.length / 2 + arr.length % 2;

        for (int i = 0; i < mid; i++) {
            firstHalf.add(String.valueOf(arr[i]));
        }

        for (int i = mid; i < arr.length; i++) {
            secondHalf.add(String.valueOf(arr[i]));
        }

        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }

    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4, 5, 6, 7};
        array(exampleArray);
    }
}