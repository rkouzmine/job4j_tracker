package ru.job4j.api;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MethodOf {
    public static void main(String[] args) {
        List.of(5, 1, 2).forEach(System.out::print);
        System.out.println();

        Set.of(5, 1, 2).forEach(System.out::print);
        System.out.println();

        Map.of("first", 1, "second", 2)
                .forEach((key, value) -> System.out.println(key + " " + value));
    }
}
