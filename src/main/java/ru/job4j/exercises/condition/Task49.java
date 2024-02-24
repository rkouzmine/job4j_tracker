package ru.job4j.exercises.condition;

public class Task49 {
    public static void isPalindrome(int number) {
        String str = String.valueOf(number);
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println("Нет");
                return;

            } else if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            }
        }
        System.out.println("Да");
    }
}