package ru.job4j.exercises.stream;

import java.util.List;
import java.util.stream.Collectors;

public class DropWhileMethod {
    public static List<Integer> dropWhile(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .dropWhile(s -> s < 0)
                .collect(Collectors.toList());
    }
}