package ru.job4j.exercises.hash;

import java.util.*;

public class Task3 {
    public static List<Integer> extractDuplicates(List<Integer> left, List<Integer> right) {
        return left.stream()
                .filter(right::contains)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(extractDuplicates(List.of(1, 2, 3), List.of(1, 2, 3)));
        System.out.println(extractDuplicates(List.of(1, 2, 3, 1, 2, 3), List.of(4, 5, 6)));
    }
}