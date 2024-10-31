package ru.job4j.exercises.loop;

public class Task109 {
    public static void loop(int[] nums) {
        for (int num : nums) {
            if (num == 123) {
                System.out.println("Код принят");
                break;
            }
            System.out.println("Код не принят");
        }
    }
}