package ru.job4j.exercises.lambda;

import java.util.function.Consumer;

public class ConsumerAndThen {

    public static Consumer<String> consumer(String input) {
        Consumer<String> print = c -> System.out.print(input);
        Consumer<String> ln = c -> System.out.println();
        return print.andThen(ln);
    }
}
