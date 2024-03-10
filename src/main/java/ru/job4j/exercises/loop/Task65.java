package ru.job4j.exercises.loop;

public class Task65 {
    public static void loop(int[] nums) {
        int positiveNumber = 0;
        int negativeNumber = 0;
        for (Integer num : nums) {
            if (num > 0) {
                positiveNumber++;
            } else if (num < 0) {
                negativeNumber++;
            }
        }
        String rsl = positiveNumber == negativeNumber ? "Да" : "Нет";
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 0, 1, -3, 2};
        loop(nums);
    }
}