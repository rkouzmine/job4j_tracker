package ru.job4j.exercises.array;

public class Sorted {
    /**
     * Проверяет, отсортирован ли массив в порядке возрастания.
     *
     * @param array массив для проверки
     * @return true, если массив отсортирован, иначе false
     */
    public static boolean isSorted(int[] array) {
        boolean result = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}