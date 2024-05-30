package ru.job4j.exercises.condition;

public class Task46 {
    public static void changeNums(int num1, int num2) {
        if (num1 > num2) {
            num1--;
            num2++;
        } else if (num1 < num2) {
            num1++;
            num2--;
        } else {
            num1++;
            num2++;
        }
        System.out.println(num1 + "\n" + num2);
    }
}