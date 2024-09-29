package ru.job4j.exercises.loop;

public class Task60 {
    public static void loop() {
        int count = 0;
        for (int i = 10; i <= 20; i++) {
            int num = i;
            int num1 = num % 10;
            num /= 10;
            int num2 = num % 10;

            if (Math.abs(num1 - num2) <= 3) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        loop();
    }
}