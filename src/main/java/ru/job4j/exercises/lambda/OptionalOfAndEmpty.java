package ru.job4j.exercises.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        return strings.contains(value) ? Optional.of(value) : Optional.empty();
    }

    public static void main(String[] args) {
        Optional<String> rsl = findValue(List.of("a", "b", "c", "e", "f"), "f");
        System.out.println(rsl);

    }
}