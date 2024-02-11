package ru.job4j.exercises.set;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String result = null;
        String[] strings = s.split(" ");
        for (String str : strings) {
            if (!words.contains(str)) {
                result = "Вы сделали правильный выбор!";
            } else {
                result = "Выберите другую статью...";
            }
        }
        return result;
    }
}