package ru.job4j.exercises.loop;

public class Task64 {
    public static void loop(int[] months) {
        int winter = 0;
        int spring = 0;
        int summer = 0;
        int fall = 0;

        for (Integer num : months) {
            switch (num) {
                case 12:
                case 1:
                case 2:
                    winter++;
                    break;
                case 3:
                case 4:
                case 5:
                    spring++;
                    break;
                case 6:
                case 7:
                case 8:
                    summer++;
                    break;
                case 9:
                case 10:
                case 11:
                    fall++;
                    break;
                default:
                    System.out.println("Not a Month");
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