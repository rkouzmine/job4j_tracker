package ru.job4j.exercises.condition;

public class Task37 {
    public static void numsCompare(int number) {
        int num1, num2;
        num2 = number % 10;
        number /= 10;
        num1 = number % 10;
        System.out.println(num1 > num2 ? "Да" : "Нет");
    }
}
