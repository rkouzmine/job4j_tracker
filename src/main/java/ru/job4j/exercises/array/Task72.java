package ru.job4j.exercises.array;

import java.util.StringJoiner;

public class Task72 {
    public static void array(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Input array should not be null");
        }

        StringJoiner firstHalf = new StringJoiner(" ");
        StringJoiner secondHalf = new StringJoiner(" ");

        for (int num : arr) {
            if (num % 2 == 0) {
                firstHalf.add(String.valueOf(num));
            } else {
                secondHalf.add(String.valueOf(num));
            }
        }
        if (firstHalf.length() != 0) {
            System.out.println(firstHalf);
        }
        if (secondHalf.length() != 0) {
            System.out.println(secondHalf);
        }
    }
}