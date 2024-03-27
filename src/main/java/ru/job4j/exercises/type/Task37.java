package ru.job4j.exercises.type;

public class Task37 {
    public static void leftShift(int number) {
        int num1, num2;
        num1 = number % 10;
        number /= 10;
        num2 = number % 10;
        if (num2 != 0) {
            System.out.println(num2 + "" + num1 + "" + 0);
        } else if (num1 != 0) {
            System.out.println(num1 + "" + 0);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        leftShift(123);
        leftShift(100);
        leftShift(106);
    }
}
