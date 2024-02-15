package ru.job4j.exercises.list;

import java.util.*;

public class Alphabet {
    public static String reformat(String s) {
        List<String> list = new ArrayList<>();
        String[] strings = s.split("");
        Collections.addAll(list, strings);
        Collections.sort(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : list) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String rsl = reformat("javascript");
        System.out.println(rsl);
    }
}
