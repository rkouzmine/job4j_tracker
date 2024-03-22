package ru.job4j.exercises.array;

public class TwoDArray {
    public static void main(String[] args) {
        char symbol = 'a';
        String[][]array = new String[7][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = symbol + "" + (j + 1);
                System.out.print(array[i][j] + " ");
            }
            symbol++;
            System.out.println();
            
        }
    }
}