package ru.job4j.exercises.condition;

public class Task47 {
    public static void changeNum(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        int num1, num2, num3;
        num3 = number % 10;
        num2 = (number / 10) % 10;
        num1 = (number / 100) % 10;

        if (number > 500) {
            if (num3 != 0) {
                stringBuilder.append(num3).append(num2).append(num1);
            } else if (num2 != 0) {
                stringBuilder.append(num2).append(num1);
            } else {
                stringBuilder.append(num1);
            }
        } else {
            stringBuilder.append(num1).append(num3).append(num2);
        }
        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        changeNum(591);
        changeNum(590);
    }
}