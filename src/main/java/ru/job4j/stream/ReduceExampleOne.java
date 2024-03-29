package ru.job4j.stream;

import java.util.List;
import java.util.Optional;

public class ReduceExampleOne {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        Optional<Integer> sum = numbers.stream()
                .reduce((left, right) -> left + right);
        System.out.println(sum.get());

        List<String> nums = List.of("Один", "Два", "Три");
        Optional<String> sumNums = nums.stream()
                .reduce((left, right) -> left + ", " + right);
        System.out.println(sumNums.get());
    }
}
