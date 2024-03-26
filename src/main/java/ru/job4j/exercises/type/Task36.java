package ru.job4j.exercises.type;

public class Task36 {
    public static void firstLastChange(int number) {
        int num1, num2, num3, num4;
        num4 = number % 10;
        number /= 10;
        num3 = number % 10;
        number /= 10;
        num2 = number % 10;
        num1 = number / 10;
        if (num4 != 0) {
            System.out.println(num4 + "" + num2 + "" + num3 + "" + num1);
        } else if (num1 == 0) {
            System.out.println(num4 + "" + num2 + "" + num3);
        } else if (num2 == 0 && num3 != 0) {
            System.out.println(num3 + "" + num1);
        } else {
            System.out.println(num1);
        }
    }

    public static void main(String[] args) {
        firstLastChange(3642);
        firstLastChange(1001);
        firstLastChange(1050);
        firstLastChange(1000);
    }
}