package ru.job4j.exercises.stream;

import java.util.stream.Stream;

public class StreamOfMethod {
    public static Stream<Character> createStream() {
        return Stream.of('a', 'b', 'c');
    }
}
