package ru.job4j.pattern.decorator.coffee;

/*
    Конкретный декоратор
*/

public class WhipDecorator extends CoffeeDecorator {
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + взбитые сливки";
    }

    @Override
    public double cost() {
        return super.cost() + 2.0;
    }
}
