package ru.job4j.exercises.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task80 {
    /**
     * Метод array выполняет следующие действия:
     * 1. Создает Map для подсчета вхождений элементов и List для хранения индексов
     * уникальных элементов.
     * 2. Перебирает массив nums, подсчитывая вхождения каждого элемента в map.
     * 3. Затем находит индексы уникальных элементов и добавляет их в list.
     * 4. Преобразует list в массив и возвращает его.
     *
     * @param nums входной массив элементов
     * @return массив индексов уникальных элементов
     */
    public static int[] array(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (Integer integer : nums) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                list.add(i);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}