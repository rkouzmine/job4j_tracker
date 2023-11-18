package ru.job4j;

public class EscapeExample {
    public static void main(String[] args) {
        String strOne = "Я изучаю на \"Job4j\" экранирование символов";
        System.out.println(strOne);
        char escape = '\"';
        System.out.println(escape);
        System.out.println('\'');
        String strTwo = "Я изучаю на 'Job4j' экранирование символов";
        System.out.println(strTwo);
        String strThree = "C:\\projects\\job4j\\File.java";
        System.out.println(strThree);
        System.out.print("Старый текст\r");
        System.out.println("Новый текст");
        System.out.println("Java\nHot");
        System.out.println("Без отступа");
        System.out.println("\tОдин");
        System.out.println("\t\tДва отступа");
        System.out.println("Job4jjj\b\b");
    }
}
