package ru.job4j.exercises.condition;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        double sumWin = percent * prize;
        int result = 0;
        if (prize >= sumWin) {
            result = (int) (sumWin - pay);
        }
        return result > 0 ? result : 0;
    }

    public static void main(String[] args) {
        System.out.println(checkGame(0.2, 50, 9));
        System.out.println(checkGame(0.9, 1, 2));
    }
}