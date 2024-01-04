package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] strOne = left.split("/");
        String[] strTwo = right.split("/");

        if (strTwo[0].compareTo(strOne[0]) != 0) {
            return right.compareTo(left);
        }
        return left.compareTo(right);
    }
}