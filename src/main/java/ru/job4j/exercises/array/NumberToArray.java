package ru.job4j.exercises.array;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        String strNum = String.valueOf(number);
        return strNum.chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(resolve(12345)));
        System.out.println(Arrays.toString(resolve(56789)));
    }
}