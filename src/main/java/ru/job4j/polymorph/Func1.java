package ru.job4j.polymorph;

public interface Func1 {
    default double func(double x, double y) {
        return x * x - y + 5;
    }

    default void funcMessage() {
        System.out.println("Сообщение из Func1");
    }

    default double getDoubleSum(int[] numbers) {
        return getSum(numbers) * 2;
    }

    default double getAverage(int[] numbers) {
        return getSum(numbers) * 1.0 / numbers.length;
    }

    private int getSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
