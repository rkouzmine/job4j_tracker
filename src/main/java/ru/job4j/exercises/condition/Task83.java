package ru.job4j.exercises.condition;

public class Task83 {
    public static void isEquals(String name1, String surname1, String name2, String surname2) {
        boolean isNameEq = false;
        boolean isSurnameEq = false;
        String result;

        if (name1.equals(name2)) {
            isNameEq = true;
        }
        if (surname1.equals(surname2)) {
            isSurnameEq = true;
        }

        if (isNameEq && !isSurnameEq) {
            result = "Тезки";
        } else if (!isNameEq && isSurnameEq) {
            result = "Однофамильцы";
        } else if (isNameEq && isSurnameEq) {
            result = "Тезки и однофамильцы";
        } else {
            result = "Совпадений нет";
        }
        System.out.println(result);
    }
}