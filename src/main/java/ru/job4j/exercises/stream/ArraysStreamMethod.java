package ru.job4j.exercises.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysStreamMethod {
    public static Stream<Integer> createStream(Integer[] data) {
        Stream<Integer> stream = Arrays.stream(data);
        return stream;
    }
}
