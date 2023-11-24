package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle boeing737 = new Airplane("боинг 737", 852);
        Vehicle airbusA320 = new Airplane("аэробус а320", 840);
        Vehicle sapsan = new Train("сапсан", 250);
        Vehicle lastochka = new Train("ласточка", 160);
        Vehicle ikarus256 = new Bus("икарус256", 120);
        Vehicle stenderaBus = new Bus("Стендера", 590);

        Vehicle[] vehicles = new Vehicle[]{boeing737, airbusA320, sapsan,
                lastochka, ikarus256, stenderaBus};
        for (Vehicle v : vehicles) {
            v.move();
            v.speed();
        }
    }
}