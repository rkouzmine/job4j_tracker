package ru.job4j.pattern.decorator.coffee;

/*
    Конкретный декоратор
 */

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + молоко";
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }
}
