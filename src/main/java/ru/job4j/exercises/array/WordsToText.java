package ru.job4j.exercises.array;

import java.util.StringJoiner;

public class WordsToText {
    public static String convert(String[] words) {
        StringJoiner sj = new StringJoiner(" ");
        for (String string : words) {
            sj.add(string);
        }
        return sj.toString();
    }
}