package ru.job4j.exercises.set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JackpotTest {

    @Test
    public void checkYourWinTrue() {
        String[] strings = {"@", "@", "@", "@"};
        boolean win = Jackpot.checkYourWin(strings);
        assertThat(win).isTrue();
    }

    @Test
    public void checkYourWinFalse() {
        String[] strings = {"&&", "&", "&&&", "&&&&"};
        boolean win = Jackpot.checkYourWin(strings);
        assertThat(win).isFalse();
    }
}