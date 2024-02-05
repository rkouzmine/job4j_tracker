package ru.job4j.exercises.lambda;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PredicateCheckEvenTest {

    @Test
    public void test() {
        assertThat(PredicateCheckEven.check(1)).isFalse();
        assertThat(PredicateCheckEven.check(2)).isTrue();
    }
}