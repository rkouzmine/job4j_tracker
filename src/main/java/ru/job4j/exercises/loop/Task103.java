package ru.job4j.exercises.loop;

public class Task103 {
    public static void loop(int[] numbers) {
        int minSum = Integer.MAX_VALUE;
        int result = 0;
        for (int number : numbers) {
            int digitSum = sumOfDigits(number);
            if (digitSum < minSum) {
                minSum = digitSum;
                result = number;
            }
        }
        System.out.println(result);
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        loop(new int[]{129, 567, 911, 1111});
    }
}