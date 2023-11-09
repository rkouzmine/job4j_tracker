package ru.job4j.oop;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.accelerator();
        truck.steer();
        truck.brake();
        FootballPlayer footballPlayer = new FootballPlayer();
        footballPlayer.run();
        footballPlayer.footKick();
        Athlete athlete = new Athlete();
        athlete.run();
        athlete.sprint();
    }
}
