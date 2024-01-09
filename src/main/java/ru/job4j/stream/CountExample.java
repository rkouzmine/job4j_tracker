package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        long sumCount = list.stream()
                .filter(element -> element % 2 == 0)
                .count();
        System.out.println(sumCount);
    }
}
