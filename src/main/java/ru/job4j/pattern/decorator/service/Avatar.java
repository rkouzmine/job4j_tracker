package ru.job4j.pattern.decorator.service;

public class Avatar extends OptionDecorator {
    public Avatar(Service service) {
        super(service, "Ваша любовь в соц сетях", 5555);
    }
}
