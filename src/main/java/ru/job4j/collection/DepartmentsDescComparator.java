package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] strOne = left.split("/");
        String[] strTwo = right.split("/");

        int result = strTwo[0].compareTo(strOne[0]);
        return result != 0 ? result : left.compareTo(right);
    }
}