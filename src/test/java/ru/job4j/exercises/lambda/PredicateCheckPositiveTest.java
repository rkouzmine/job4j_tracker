package ru.job4j.exercises.lambda;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PredicateCheckPositiveTest {

    @Test
    public void whenPositive() {
        assertThat(PredicateCheckPositive.check(1)).isTrue();
        assertThat(PredicateCheckPositive.check(-1)).isFalse();
        assertThat(PredicateCheckPositive.check(0)).isFalse();
    }
}