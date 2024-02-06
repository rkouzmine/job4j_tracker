package ru.job4j.exercises.lambda;

import java.util.function.Function;

public class FunctionPow {

    public static double calculate(double x) {
        return calculate(s -> Math.pow(x, 2), x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }

}
