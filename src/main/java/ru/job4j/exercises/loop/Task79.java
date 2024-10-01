package ru.job4j.exercises.loop;

public class Task79 {
    public static void loop(int[] grades) {
        double avg = 0;
        int bad = 0;
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
            if (grade == 1 || grade == 2) {
                bad++;
            }
            avg = (double) sum / grades.length;
        }
        System.out.printf("Средняя оценка: %s, неуд. оценка: %s%n", avg, bad);
    }

    public static void main(String[] args) {
        loop(new int[]{3, 4, 2, 3, 5});
    }
}