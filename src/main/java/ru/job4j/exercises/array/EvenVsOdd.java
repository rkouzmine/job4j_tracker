package ru.job4j.exercises.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int result;
        int pointFirst = 0;
        int pointSecond = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                pointFirst += players[i];
            } else {
                pointSecond += players[i];
            }
        }
        if (pointFirst > pointSecond) {
            result = 1;
        } else if (pointFirst < pointSecond) {
            result = 2;
        } else {
            result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[]array = new int[]{10, 5, 4, 3};
        int result = whoWin(array);
        System.out.println(result);
    }
}