package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void question() {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String quest = input.nextLine();
        System.out.println(quest);
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0 -> System.out.println("Да");
            case 1 -> System.out.println("Нет");
            default -> System.out.println("Может быть");
        }
    }

    public static void main(String[] args) {
        question();
    }
}