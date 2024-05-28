package ru.job4j.exercises.array;

public class Initials {
    public static String convert(String[] fio) {
        StringBuilder result = new StringBuilder();
        result.append(fio[0]).append(" ");
        result.append(fio[1].charAt(0)).append(".");
        result.append(fio[2].charAt(0)).append(".");

        return result.toString();
    }

    public static void main(String[] args) {
        String[] array = new String[]{"Готовченко", "Роман", "Романович"};
        System.out.println(convert(array));
    }
}