package ru.job4j.exercises.condition;

public class Task39 {
    public static void isSymmetric(int number) {
        if (number < 100) {
            System.out.println("Число должно содержать как минимум три цифры");
        }

       int num1, num3;
       num3 = number % 10;
       number /= 100;
       num1 = number % 10;

        System.out.println(num1 == num3 ? "Да" : "Нет");
    }
}