package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer pioneer = new Pioneer();
        Wolf wolf = new Wolf();
        Girl girl = new Girl();
        pioneer.kill(wolf);
        wolf.eat(girl);
        girl.help(pioneer);
    }
}