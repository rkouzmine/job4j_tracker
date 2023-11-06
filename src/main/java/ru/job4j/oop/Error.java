package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активный: " + active);
        System.out.println("Состояние: " + status + "%");
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 50, "Ошибка 404");
        Error error3 = new Error(false, 15, "Ошибка 502");
        Error error4 = new Error(true, 55, "Ошибка 503");
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
        error4.printInfo();
    }
}