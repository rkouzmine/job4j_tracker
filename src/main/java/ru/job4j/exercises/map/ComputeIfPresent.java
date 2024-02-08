package ru.job4j.exercises.map;

import java.util.Map;

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        for (Integer key : name.keySet()) {
            name.computeIfPresent(key, (k1, v1) ->
                    surname.computeIfPresent(key, (k2, v2) -> v1 + " " + v2));
        }
        return name;
    }
}
