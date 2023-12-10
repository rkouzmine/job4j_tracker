package ru.job4j.pattern.decorator.service;

public class Chakra extends OptionDecorator {
    public Chakra(Service service) {
        super(service, "Характеристика чакр", 500);
    }
}
