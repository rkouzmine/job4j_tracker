package ru.job4j.exercises.type;

public class Task35 {
    public static void firstLastChange(int number) {
        int num1, num2, num3;
        num1 = number % 10;
        number /= 10;
        num2 = number % 10;
        num3 = number / 10;
        if (num1 != 0) {
            System.out.println(num1 + "" + num2 + "" + num3);
        } else if (num2 != 0) {
            System.out.println(num2 + "" + num3);
        } else {
            System.out.println(num3);
        }
    }

    public static void main(String[] args) {
        firstLastChange(125);
        firstLastChange(650);
        firstLastChange(100);
        firstLastChange(105);
    }
}
