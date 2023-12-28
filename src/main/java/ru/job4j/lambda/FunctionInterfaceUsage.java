package ru.job4j.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "New String For Interface";
        System.out.println(supplier.get());

        /**
         * Supplier
         */
        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supplierOne = () -> new HashSet<>(list);
        Set<String> strings = supplierOne.get();
        for (String string : strings) {
            System.out.println(string);
        }

        /**
         * Consumer и BiConsumer
         */
        Supplier<String> supplierTwo = () -> "New String For Interface";
        Consumer<String> consumer = (string) -> System.out.println(string);
        consumer.accept(supplierTwo.get());

        Supplier<String> supplierThree = () -> "New String For Interface";
        BiConsumer<String, String> biConsumer = (firts, second)
                -> System.out.println(firts + second);
        biConsumer.accept(supplierThree.get(), " and Second String");

        List<String> listOne = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supplierFour = () -> new HashSet<>(listOne);
        BiConsumer<Integer, String> consumerTwo = (firts, second)
                -> System.out.println(firts + second);
        Set<String> stringSet = supplierFour.get();
        int i = 1;
        for (String string : stringSet) {
            consumerTwo.accept(i++, " is " + string);
        }

        /**
         * Predicate (BiPredicate)
         */
        Predicate<String> predicateOne = (string) -> string.isEmpty();
        System.out.println("Строка пустая: " + predicateOne.test(""));
        System.out.println("Строка пустая: " + predicateOne.test("test"));

        BiPredicate<String, Integer> condition = (string, number)
                -> string.contains(number.toString());
        System.out.println("Строка содержит подстроку: " + condition.test("Name123", 123));
        System.out.println("Строка содержит подстроку: " + condition.test("Name123", 124));
        System.out.println("Строка содержит подстроку: " + condition.test("Name", 123));
        System.out.println("Строка содержит подстроку: " + condition.test("M1", 1));

        /**
         * Function (BiFunction)
         */
        Function<String, Character> function = (string)
                -> string.charAt(2);
        System.out.println("Третий символ в строке: " + function.apply("first"));
        System.out.println("Третий символ в строке: " + function.apply("second"));

        BiFunction<String, Integer, String> biFunction = (string, number)
                -> string.concat(" ").concat(number.toString());
        System.out.println("Результат работы бифункции: " + biFunction.apply("Name", 123));
        System.out.println("Результат работы бифункции: " + biFunction.apply("String number", 16));

        /**
         * UnaryOperator и BinaryOperator
         */
        UnaryOperator<StringBuilder> unaryOperator = b -> b.reverse();
        System.out.println(
                "Строка после реверса: " + unaryOperator.apply(new StringBuilder("Test")));
        System.out.println(
                "Строка после реверса: " + unaryOperator.apply(new StringBuilder("tseT")));

        BinaryOperator<StringBuilder> binaryOperator = (first, second)
                -> first.append(" ").append(second);
        System.out.println(
                "Строка после объединения: " + binaryOperator.apply(
                        new StringBuilder("First String"),
                        new StringBuilder("Second String")
                )
        );
    }
}
