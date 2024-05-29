package ru.job4j.exercises.array;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        String strNum = String.valueOf(number);
        int[] array = new int[strNum.length()];
        int index = 0;
        for (int i = strNum.length() - 1; i >= 0; i--) {
            array[index++] = Character.getNumericValue(strNum.charAt(i));

        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(resolve(12345)));
        System.out.println(Arrays.toString(resolve(56789)));
    }
}