package ru.job4j.exercises.loop;

public class Task64 {
    public static void loop(int[] months) {
        int winter = 0;
        int spring = 0;
        int summer = 0;
        int fall = 0;

        for (Integer num : months) {
            switch (num) {
                case 12, 1, 2 -> winter++;
                case 3, 4, 5 -> spring++;
                case 6, 7, 8 -> summer++;
                case 9, 10, 11 -> fall++;
                default -> System.out.println("Not a Month");
            }
        }
        System.out.println(
                "Зимой: " + winter
                + ", Весной: " + spring
                + ", Летом: " + summer
                + ", Осенью: " + fall
        );
    }

    public static void main(String[] args) {
        int[] months = new int[]{1, 5, 9, 9, 2, 3, 11};
        loop(months);
    }
}