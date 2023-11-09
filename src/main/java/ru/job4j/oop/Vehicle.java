package ru.job4j.oop;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String type;
    private int passengers;
    private int maxSpeed;

    public abstract void accelerator();

    public abstract void steer();

    public void brake() {
        System.out.println("Стандартная тормозная система");
    }
}
