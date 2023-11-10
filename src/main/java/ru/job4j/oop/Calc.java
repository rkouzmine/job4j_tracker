package ru.job4j.oop;

public class Calc {

    public static class Multiply {

        private final int result;

        public Multiply(int number) {
            result = number;
        }

        public int getResult() {
            return result;
        }
    }

    public static Multiply getMult(int value) {
        int result = value * value;
        return new Multiply(result);
    }

    public static void main(String[] args) {
        Calc.Multiply multiply = Calc.getMult(3);
        System.out.println("Квадрат числа равен: " + multiply.getResult());
    }
}