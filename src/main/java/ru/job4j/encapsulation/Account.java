package ru.job4j.encapsulation;

public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void addMoney(int money) {
        if (money > 0) {
            balance += money;
        }
    }
}