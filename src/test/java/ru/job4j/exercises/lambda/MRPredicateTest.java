package ru.job4j.exercises.lambda;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

class MRPredicateTest {

    @Test
    public void test() {
        Predicate<String> predicate = MRPredicate.predicate();
        assertThat(predicate.test("")).isTrue();
        assertThat(predicate.test("abc")).isFalse();
    }
}