package ru.job4j.oop;

public class FootballPlayer extends Sportsman {

    @Override
    void run() {
        System.out.println("Средняя скорость бега");
    }

    void footKick() {
        System.out.println("Удар ногой по мячу");
    }
}
