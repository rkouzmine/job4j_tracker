package ru.job4j.exercises.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static List<Integer> retain(List<Integer> list) {
        return list.stream()
                .filter(n -> n % 4 != 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(retain(List.of(1, 2, 3, 4, 5, 8)));
    }
}