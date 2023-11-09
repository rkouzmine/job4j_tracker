package ru.job4j.oop;

public class Truck extends Vehicle {

    @Override
    public void accelerator() {
        System.out.println("Электонная педаль тормоза");
    }

    @Override
    public void steer() {
        System.out.println("Стандартное рулевое управление");
    }
}