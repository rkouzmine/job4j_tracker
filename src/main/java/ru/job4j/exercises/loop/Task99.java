package ru.job4j.exercises.loop;

public class Task99 {
    public static void loop(int[] num) {
        int avgMax = num[0];
        int avgMin = num[0];
        int avgArray = 0;
        for (int i : num) {
            avgMax = Math.max(i, avgMax);
            avgMin = Math.min(i, avgMin);
            avgArray += i;
        }
        String result = (avgMax + avgMin) / 2 > avgArray / num.length ? "Больше" : "Нет";
        System.out.println(result);
    }

    public static void main(String[] args) {
        loop(new int[]{10, 8, 5, 4, 2});
    }
}