package ru.job4j.exercises.loop;

import java.util.StringJoiner;

public class Task39 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 200; i <= 210; i++) {
            if (i % sum(i) == 0) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj.toString());
    }

    private static int sum(int number) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        loop();
    }
}


