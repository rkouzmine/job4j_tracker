package ru.job4j.exercises.loop;

public class Task108 {
    public static void loop(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 999) {
                break;
            }
            System.out.println(num);
            sum += num;
        }
        System.out.printf("Сумма: %d%n", sum);
    }

    public static void main(String[] args) {
        loop(new int[]{-2, 3, 999, 100, 20});
    }
}