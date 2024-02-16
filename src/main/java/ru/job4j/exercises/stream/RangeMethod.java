package ru.job4j.exercises.stream;

import java.util.stream.IntStream;

public class RangeMethod {
    public static IntStream createStream(int start, int end) {
        return IntStream.rangeClosed(start, end);
    }
}
