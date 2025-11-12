package ru.job4j.pattern.decorator.coffee;

/*
    Компонент — общий интерфейс напитков
*/

public interface Coffee {

    String getDescription();

    double cost();

}