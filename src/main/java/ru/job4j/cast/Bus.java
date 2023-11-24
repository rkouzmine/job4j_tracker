package ru.job4j.cast;

public class Bus implements Vehicle {
    private String name;
    private int speed;

    public Bus(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " " + getName()
                + " двигается по скоростным трассам.");
    }

    @Override
    public void speed() {
        System.out.println(getClass().getSimpleName() + " " + getName()
                + " может развить скорость до " + getSpeed() + "км/ч.");
    }
}
