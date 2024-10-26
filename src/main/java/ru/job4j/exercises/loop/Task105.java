package ru.job4j.exercises.loop;

public class Task105 {
    public static void loop(int[] num) {
        int result = 0;
        int maxSumDigits = 0;
        for (int i = 0; i < num.length; i++) {
            int sum = Math.abs(sumOfDigits(num[i]));
            if (sum > maxSumDigits) {
                maxSumDigits = sum;
                result = i;
            }
        }
        System.out.println(result);
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        loop(new int[]{194, 333, 562});
        loop(new int[]{123, 69, 105, 0, -9999});
    }
}