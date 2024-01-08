package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        List<StringBuilder> names = Arrays.asList(
                new StringBuilder("Михаил"),
                new StringBuilder("Максим"),
                new StringBuilder("Елена"));
        List<StringBuilder> editedNames = names
                .stream()
                .peek(el -> el.append(" ученик Job4J"))
                .sorted()
                .toList();
        System.out.println(editedNames);
    }
}
