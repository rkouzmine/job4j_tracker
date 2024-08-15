package ru.job4j.exercises.condition;

import java.util.HashMap;
import java.util.Map;

public class Article {
    public static boolean generateBy(String origin, String line) {
        Map<String, Integer> mapOrig = new HashMap<>();
        boolean rsl = true;
        String[] originText = origin.replaceAll("[,!.]", " ").split(" ");
        String[] lineText = line.split(" ");
        for (String word : originText) {
            mapOrig.put(word, mapOrig.getOrDefault(word, 0) + 1);
        }
        for (String word : lineText) {
            if (!mapOrig.containsKey(word) || mapOrig.get(word) == 0) {
                rsl = false;
                break;
            } else {
                mapOrig.put(word, mapOrig.get(word) - 1);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String origin0 = "Мама мыла раму и окно";
        String line0 = "мыла окно";

        String origin1 = "Мама мыла раму и окно";
        String line1 = "мыла пол";

        String origin2 =
                "Мой дядя самых честных правил, "
                + "Когда не в шутку занемог, "
                + "Он уважать себя заставил "
                + "И лучше выдумать не мог. "
                + "Его пример другим наука; "
                + "Но, боже мой, какая скука "
                + "С больным сидеть и день и ночь, "
                + "Не отходя ни шагу прочь! "
                + "Какое низкое коварство "
                + "Полуживого забавлять, "
                + "Ему подушки поправлять, "
                + "Печально подносить лекарство, "
                + "Вздыхать и думать про себя: "
                + "Когда же черт возьмет тебя!";
        String line2 = "Мой дядя мог думать про тебя и день и ночь";

        System.out.println(generateBy(origin0, line0));
        System.out.println(generateBy(origin1, line1));
        System.out.println(generateBy(origin2, line2));
    }
}