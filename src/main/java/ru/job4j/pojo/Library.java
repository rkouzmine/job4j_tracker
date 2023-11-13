package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book thinkJava = new Book("Think Java", 252);
        Book grokkingAlgorithms = new Book("Grokking Algorithms", 288);
        Book javaBeginnersGuide = new Book("Java: A Beginner's Guide", 1345);
        Book cleanCode = new Book("Clean code", 464);
        Book[] books = new Book[4];
        books[0] = thinkJava;
        books[1] = grokkingAlgorithms;
        books[2] = javaBeginnersGuide;
        books[3] = cleanCode;
        for (Book boo : books) {
            System.out.println(boo.getName() + " - " + boo.getCount());
        }
        System.out.println();
        Book array = books[0];
        books[0] = books[3];
        books[3] = array;
        for (Book boo : books) {
            System.out.println(boo.getName() + " - " + boo.getCount());
        }
        System.out.println();
        for (Book boo : books) {
            if (boo.getName().equals("Clean code")) {
                System.out.println(boo.getName() + " - " + boo.getCount());
            }
        }
    }
}