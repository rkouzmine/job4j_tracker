package ru.job4j.concat;

public class ConcatExample {
    public static void main(String[] args) {
        String str = "Hello, ".concat("Java! ".concat("Hello, ".concat("Word!")));
        System.out.println(str);
    }
}
