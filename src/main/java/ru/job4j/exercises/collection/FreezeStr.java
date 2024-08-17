package ru.job4j.exercises.collection;

import java.util.ArrayList;
import java.util.List;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        char[]chLeft = left.toCharArray();
        List<Character> listRight = new ArrayList<>();
        char[]chRight = right.toCharArray();
        for (Character ch : chRight) {
            listRight.add(ch);
        }
        for (Character ch : chLeft) {
            listRight.remove(ch);
        }
        return listRight.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(eq("Java", "Java"));
        System.out.println(eq("HelloHello", "Halle"));
    }
}