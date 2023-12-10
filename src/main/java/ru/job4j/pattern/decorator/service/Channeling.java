package ru.job4j.pattern.decorator.service;

public class Channeling extends OptionDecorator {
    public Channeling(Service service) {
        super(service, "Полет в Поле Чудес", 99999);
    }
}
