package ru.job4j.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinExampleTwo {
    public static void main(String[] args) {
        OptionalInt min = IntStream
                .rangeClosed(1, 5)
                .min();
        System.out.println(min.getAsInt());
    }
}