package ru.job4j.exercises.loop;

public class Task62 {
    public static void loop(int amount, int[] grades) {
        int count = 0;
        for (int grade : grades) {
            if (grade >= 3) {
                count++;
            }
        }
        String rsl = count < amount / 2.0 ? "Да" : "Нет";
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        int[] grades = new int[]{2, 4, 5, 1, 2};
        loop(5, grades);

        grades = new int[]{2, 1, 3, 5};
        loop(4, grades);

        grades = new int[]{2, 2, 1, 4, 5};
        loop(5, grades);

        grades = new int[]{3, 2, 1, 4, 5};
        loop(5, grades);
    }
}