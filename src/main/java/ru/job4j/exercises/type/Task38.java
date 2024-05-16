package ru.job4j.exercises.type;

public class Task38 {
    public static void leftShift(int number) {
        int num1, num2, num3;
        num1 = number % 10;
        number /= 10;
        num2 = number % 10;
        number /= 10;
        num3 = number % 10;

        if (num3 != 0) {
            System.out.println(num3 + "" + num2 + "" + num1 + "" + 0);
        } else if (num2 != 0) {
            System.out.println(num2 + "" + num1 + "" + 0);
        } else if (num1 != 0) {
            System.out.println(num1 + "" + 0);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        leftShift(1234); //2340
        leftShift(1200); //2000
        leftShift(1060); //600
        leftShift(1006); //60
        leftShift(1000); //0
    }
}

