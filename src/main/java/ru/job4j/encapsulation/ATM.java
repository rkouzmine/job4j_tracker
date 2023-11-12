package ru.job4j.encapsulation;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account();
        account.addMoney(100);
        System.out.println(account.getBalance());
        account.addMoney(50);
        System.out.println(account.getBalance());
    }
}