package ru.job4j.exercises.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        if (data == null) {
            throw new IllegalArgumentException("Массив не должен быть null");
        }

        int sum = 0;
        for (int num : data) {
            if (num != el) {
                sum += num;
            } else {
                break;
            }
        }
        return sum % 2 == 0 ? sum : 0;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(count(array, 7));
        System.out.println(count(array, 5));
    }
}