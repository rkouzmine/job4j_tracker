package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("rkouzmine@gmail.com", "Руслан");
        map.put("rkouzmine@yandex.ru", "Руслан");
        map.put("mrk@yandex.ru", "Максим");
        map.put("mrk@yandex.ru", "Михаил");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(value);
        }
    }
}