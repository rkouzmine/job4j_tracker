package ru.job4j.io;

import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Игры");
            System.out.println("1. Танчики");
            System.out.println("2. Супер Марио");
            System.out.println("3. Выйти");
            System.out.println("Нажмите пункт меню, чтобы начать играть");
            int select = Integer.parseInt(input.nextLine());
            if (select == 3) {
                System.out.println("Игра завершена");
                run = false;
            } else if (select == 1) {
                System.out.println("Танчики загружается...");
            } else if (select == 2) {
                System.out.println("Супер Марио загружается...");
            } else {
                System.out.println("Нет такой игры");
            }
            System.out.println();
        }
    }
}