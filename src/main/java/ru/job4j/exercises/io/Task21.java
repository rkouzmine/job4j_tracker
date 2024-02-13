package ru.job4j.exercises.io;

public class Task21 {
    public static void main(String[] args) {
        String fullName = "Фамилия Имя Отчество";
        String phoneNumber = "+7(938) 123-45-67";
        String ln = System.lineSeparator();
        System.out.print("************************" + ln
                + "* " + fullName + " *" + ln
                + "* " + phoneNumber + "    *" + ln
                + "************************");
    }
}