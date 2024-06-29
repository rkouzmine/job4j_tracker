package ru.job4j.exercises.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int length = (int) Math.ceil((double) data.length / 2);
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                count++;
                if (count >= length) {
                    break;
                }
            }
        }
        return count < length;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 1, 1, 1, 2, 6, 7, 1, 8};
        System.out.println(checkArray(data, 1));
    }
}