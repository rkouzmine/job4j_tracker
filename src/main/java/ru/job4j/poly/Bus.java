package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Поехали");
    }

    @Override
    public void passengers(int number) {
        System.out.println(number);
    }

    @Override
    public int fillUp(int quantity) {
        return quantity * 54;
    }
}
