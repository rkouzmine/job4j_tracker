package ru.job4j.exercises.loop;

public class Task100 {
    public static void loop(int[] num) {
        int max = 0;
        int result = 0;
        for (int i : num) {
            int numFirst = i % 10;
            int numSecond = i / 10;
            int sum = numFirst + numSecond;
            if (max < sum) {
                max = sum;
                result = i;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        loop(new int[]{24, 35, 19});
    }
}