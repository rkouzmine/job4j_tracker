package ru.job4j.exercises.set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PangramTest {

    @Test
    public void checkString() {
        String str = "Jackdaws love my big sphinx of quartz";
        boolean rsl = Pangram.checkString(str);
        assertThat(rsl).isTrue();
    }
}