package ru.job4j.exercises.list;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        String str = list.remove(list.size() - 1);
        if (list.size() > index) {
            list.set(index, str);
        }
        return list;
    }
}