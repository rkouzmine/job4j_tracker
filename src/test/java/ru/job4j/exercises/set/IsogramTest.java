package ru.job4j.exercises.set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IsogramTest {

    @Test
    public void checkStringTrue() {
        String s = "uncopyrightables";
        boolean b = Isogram.checkString(s);
        assertThat(b).isTrue();
    }

    @Test
    public void checkStringFalse() {
        String s = "javascript";
        boolean b = Isogram.checkString(s);
        assertThat(b).isFalse();
    }
}