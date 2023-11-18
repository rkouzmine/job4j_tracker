package ru.job4j.concat;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        stringJoiner.add("Hello").add("Java").add("Hello").add("Word");
        System.out.println(stringJoiner);
        String joiner = stringJoiner.toString();
        System.out.println(joiner);
    }
}