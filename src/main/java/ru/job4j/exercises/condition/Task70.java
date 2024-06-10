package ru.job4j.exercises.condition;

public class Task70 {
    private static final int SECONDS_IN_HOUR = 3600;
    private static final int SECONDS_IN_MINUTE = 60;

    public static void secondsToMinutes(int seconds) {
        String ls = System.lineSeparator();
        if (seconds > 0 && seconds <= SECONDS_IN_HOUR) {
            int min = seconds / SECONDS_IN_MINUTE;
            int sec = seconds % SECONDS_IN_MINUTE;
            System.out.printf("Минут: %d, секунд: %d%s", min, sec, ls);
        } else {
            System.out.println("Расчет не производится");
        }
    }

    public static void main(String[] args) {
        secondsToMinutes(65);
        secondsToMinutes(119);
        secondsToMinutes(123);
        secondsToMinutes(3700);
    }
}