package ru.job4j.exercises.list;

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        return list.contains(str) && list.indexOf(str) == list.lastIndexOf(str);
    }
}
