package ru.job4j.exercises.loop;

public class Task59 {
    public static void loop(int num, int[] array) {
        int x = 0;
        int y = 0;
        for (int number : array) {
            if (number == num) {
                x++;
            } else if (number < num) {
                y++;
            }
        }
        System.out.println("Равно: " + x + ", меньше: " + y);
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3};
        loop(2, array);
        array =  new int[]{4, 3, 3, 4};
        loop(4, array);
    }
}