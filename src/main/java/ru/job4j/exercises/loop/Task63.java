package ru.job4j.exercises.loop;

public class Task63 {
    public static void loop(int[] answers) {
        int count = 0;
        for (Integer num : answers) {
            if (num == 1) {
                count++;
            }
        }
        String rsl = count > (answers.length - count) ? count + ", Да" : count + ", Нет";
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        int[] answers = new int[]{1, 1, 1, 0, 0, 0, 1};
        loop(answers);
    }
}