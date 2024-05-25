package ru.job4j.exercises.condition;

public class WeeklySalary {

    public static int calculate(int[] hours) {
        int sum = 0;
        int days = hours.length;
        sum += workOnWeekdays(hours);
        if (days > 5) {
            sum += workOnWeekends(hours);
        }
        return sum;
    }

    private static int calculateDaySalary(int hoursWorked, int rate, int overtimeRate) {
        int sum = 0;
        if (hoursWorked <= 8) {
            sum += hoursWorked * rate;
        } else {
            int overtimeHours = hoursWorked - 8;
            sum += 8 * rate;
            sum += overtimeHours * (rate + overtimeRate);
        }
        return sum;
    }

    private static int workOnWeekdays(int[] hours) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += calculateDaySalary(hours[i], 10, 5);
        }
        return sum;
    }

    private static int workOnWeekends(int[] hours) {
        int sum = 0;
        for (int i = 5; i < hours.length; i++) {
            sum += calculateDaySalary(hours[i], 20, 10);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arrayFirst = new int[]{8, 8, 8, 8, 8, 0, 0};
        int[] arraySecond = new int[]{10, 10, 10, 0, 8, 0, 0};
        int[] arrayThird = new int[]{10, 0, 12, 0, 8, 12, 4};
        int result = calculate(arrayFirst);
        System.out.println(result);
        result = calculate(arraySecond);
        System.out.println(result);
        result = calculate(arrayThird);
        System.out.println(result);
    }
}