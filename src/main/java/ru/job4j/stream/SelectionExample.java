package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class SelectionExample {
    public static void main(String[] args) {
        List<String> listOne = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        List<String> resultOne = listOne
                .stream()
                .skip(2)
                .toList();
        System.out.println(resultOne);

        List<String> listTwo = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        List<String> resultTwo = listTwo
                .stream()
                .limit(3)
                .toList();
        System.out.println(resultTwo);

        List<String> listThree = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        List<String> resultThree = listThree
                .stream()
                .skip(2)
                .limit(2)
                .toList();
        System.out.println(resultThree);

        List<String> listFour = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        String resultFour = listFour
                .stream()
                .skip(2)
                .limit(2)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(resultFour);

        List<String> listFive = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        String resultFive = listFive
                .stream()
                .skip(5)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(resultFive);

        List<String> listSix = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        String resultSix = listSix
                .stream()
                .skip(listFive.size() - 1)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(resultSix);
    }
}
