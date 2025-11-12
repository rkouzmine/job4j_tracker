package ru.job4j.pattern.decorator.coffee;

/*
    Конкретный компонент — обычный кофе
 */

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Обычный кофе";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
