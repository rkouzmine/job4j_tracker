package ru.job4j.exercises.condition;

public class Task74 {
    public static void innerNum(int num2, int num4) {
        String strNum2, strNum4;
        strNum2 = String.valueOf(num2);
        strNum4 = String.valueOf(num4);
        System.out.println(strNum4.contains(strNum2) ? "Да" : "Нет");
    }

    public static void main(String[] args) {
        innerNum(24, 1524);
        innerNum(24, 2400);
        innerNum(24, 1520);
        innerNum(24, 1240);
    }
}
