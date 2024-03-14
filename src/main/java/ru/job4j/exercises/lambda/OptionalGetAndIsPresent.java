package ru.job4j.exercises.lambda;

import java.util.*;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        return indexOf(data, el).isEmpty() ? -1 : indexOf(data, el).get();
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                index = i;
                return Optional.of(index);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println(get(new int[]{1, 2, 3}, 2));
        System.out.println(get(new int[]{1, 2, 3}, 4));

        System.out.println(indexOf(new int[]{1, 2, 3}, 2));
        System.out.println(indexOf(new int[]{1, 2, 3}, 4));
    }
}