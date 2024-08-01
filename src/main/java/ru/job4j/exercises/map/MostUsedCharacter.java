package ru.job4j.exercises.map;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        Map<Character, Integer> map = new TreeMap<>();
        str = str.toLowerCase().replaceAll(" ", "");
        for (char ch : str.toCharArray()) {
            map.putIfAbsent(ch, 0);
            map.computeIfPresent(ch, (k, v) -> v + 1);
        }
        char rsl = ' ';
        int max = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                rsl = entry.getKey();
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String strFirst = "Мой дядя самых честных правил "
                + "Когда не в шутку занемог "
                + "Он уважать себя заставил "
                + "И лучше выдумать не мог "
                + "Его пример другим наука "
                + "Но боже мой какая скука "
                + "С больным сидеть и день и ночь "
                + "Не отходя ни шагу прочь "
                + "Какое низкое коварство "
                + "Полуживого забавлять "
                + "Ему подушки поправлять "
                + "Печально подносить лекарство "
                + "Вздыхать и думать про себя "
                + "Когда же черт возьмет тебя";

        String strSecond = "Мама мыла раму";

        System.out.println("Символ: " + getMaxCount(strFirst));
        System.out.println("Символ: " + getMaxCount(strSecond));
    }
}