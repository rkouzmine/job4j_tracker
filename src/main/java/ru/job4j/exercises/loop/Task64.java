package ru.job4j.exercises.loop;

public class Task64 {
    public static void loop(int[] months) {
        int winter = 0;
        int spring = 0;
        int summer = 0;
        int fall = 0;
        for (Integer num : months) {
           if (num >= 3 && num <= 5) {
               spring++;
           } else if (num >= 6 && num <= 8) {
               summer++;
           } else if (num >= 9 && num <= 11) {
               fall++;
           } else {
               winter++;
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