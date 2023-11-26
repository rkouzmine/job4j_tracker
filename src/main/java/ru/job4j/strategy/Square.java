package ru.job4j.strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "_____________" + ln
                + "|\t\t\t|" + ln
                + "|\t\t\t|" + ln
                + "|\t\t\t|" + ln
                + "|___________|" + ln;
    }
}