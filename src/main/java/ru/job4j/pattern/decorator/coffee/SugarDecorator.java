package ru.job4j.pattern.decorator.coffee;

/*
    Конкретный декоратор
*/

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + сахар";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}
