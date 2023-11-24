package ru.job4j.cast;

public class Train implements Vehicle {
    private String name;
    private int speed;

    public Train(String name, int speed) {
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
                + " передвигается по рельсам.");
    }

    @Override
    public void speed() {
        System.out.println(getClass().getSimpleName() + " " + getName()
                + " разгоняется до " + getSpeed() + " км/ч");
    }
}
