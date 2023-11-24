package ru.job4j.cast;

public class Airplane implements Vehicle {
    private String name;
    private int speed;

    public Airplane(String name, int speed) {
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
        String name;
        System.out.println(getClass().getSimpleName() + " " + getName() + " летает по воздуху.");
    }

    @Override
    public void speed() {
        System.out.println(getClass().getSimpleName() + " " + getName()
                + " может летать со скорость до " + getSpeed() + " км/ч.");
    }
}
