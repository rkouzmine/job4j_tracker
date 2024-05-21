package ru.job4j.exercises.array;

import java.util.StringJoiner;

public class Task71 {
    public static void array(int[] arr) {
        StringJoiner firstHalf = new StringJoiner(" ");
        StringJoiner secondHalf = new StringJoiner(" ");

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                firstHalf.add(String.valueOf(arr[i]));
            } else {
                secondHalf.add(String.valueOf(arr[i]));
            }
        }
        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }

    public static void main(String[] args) {
        int[] exampleArray = {5, 2, 6, 0, 3};
        array(exampleArray);
    }
}
