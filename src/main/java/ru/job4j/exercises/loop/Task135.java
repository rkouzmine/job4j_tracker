package ru.job4j.exercises.loop;

public class Task135 {
    public static void loop(int num) {
        StringBuilder sb = new StringBuilder();
        int digints = num;
        while (digints != 0) {
            int digit = digints % 10;
            if (digit != 0) {
                sb.append(digit);
            }
            digints /= 10;
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        loop(7331);
        loop(7330);
        loop(20);
    }
}