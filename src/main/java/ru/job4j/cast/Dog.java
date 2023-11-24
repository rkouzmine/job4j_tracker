package ru.job4j.cast;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Гав-гав.");
    }

    public void runAfterCat() {
        System.out.println(getClass() + " не любит кошек, постоянно за ними гоняется.");
    }
}
