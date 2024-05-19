package ru.job4j.exercises.type;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fahrenheit = input.nextInt();
        double celsius = (double) ((fahrenheit - 32) * 5) / 9;
        System.out.printf("%.1f", celsius);
    }
}
