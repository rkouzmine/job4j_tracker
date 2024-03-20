package ru.job4j.exercises.stream;

import java.util.List;
import java.util.Optional;

public class OptionalFlatMap {
    public static Optional<Integer> flatMap(List<String> strings) {
        return strings.stream()
                .filter(element -> element.contains(".java"))
                .findFirst()
                .map(String::length);
    }
}