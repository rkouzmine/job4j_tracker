package ru.job4j.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapLambdaUsageFour {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Shoes", 200);

        BiFunction<Integer, Integer, Integer> function = (oldVal, newVal) -> oldVal - newVal;
        int newPrice = map.merge("Shoes", 50, function);
        System.out.println("New price: " + newPrice);
        System.out.println("Price of shirt: " + map.merge("Shirt", 100, function));

        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
    }
}