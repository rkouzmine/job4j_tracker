package ru.job4j.exercises.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int count = 0;
        while (length >= section) {
            length -= section;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(2, 1));
        System.out.println(count(3, 2));
    }
}