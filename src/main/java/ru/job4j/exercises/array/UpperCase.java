package ru.job4j.exercises.array;

import java.util.Arrays;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] result = new char[string.length];
        int index = 0;
        for (int i = 0; i < string.length; i++) {
            if (Character.isLowerCase(string[i])) {
                result[index++] = Character.toUpperCase(string[i]);
            } else {
                result[index++] = string[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(toUpperCase(new char[]{'a', 'l', 'p', 'h', 'a', '1', '2', '3'}))
        );
        System.out.println(
                Arrays.toString(toUpperCase(new char[]{'a', '-', '1', '2', '3', '-', 'B'}))
        );
    }
}
