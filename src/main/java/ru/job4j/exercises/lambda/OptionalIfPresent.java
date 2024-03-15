package ru.job4j.exercises.lambda;

import java.util.Arrays;
import java.util.Optional;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        if (max(data).isPresent()) {
            System.out.println("Max: " + max(data).get());
        }
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            return Optional.empty();
        }
        return Optional.of(Arrays.stream(data)
                .max()
                .getAsInt());
    }

    public static void main(String[] args) {
        ifPresent(new int[]{1, 2, 5, 3, 4});
        ifPresent(new int[]{});

        System.out.println(max(new int[]{1, 2, 5, 3, 4}));
        System.out.println(max(new int[]{}));
    }
}
