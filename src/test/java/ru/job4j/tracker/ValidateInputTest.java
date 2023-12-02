package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter menu:");
        assertThat(select).isEqualTo(1);
    }

    @Test
    void whenCorrectInput() {
        Output out = new StubOutput();
        Input in = new MockInput(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter menu:");
        assertThat(select).isEqualTo(1);
    }

    @Test
    void whenMultipleCorrectInput() {
        Output out = new StubOutput();
        Input in = new MockInput(
                new String[] {"1", "2", "3", "4"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter menu:");
        assertThat(select).isEqualTo(1);
        select = input.askInt("Enter menu:");
        assertThat(select).isEqualTo(2);
        select = input.askInt("Enter menu:");
        assertThat(select).isEqualTo(3);
        select = input.askInt("Enter menu:");
        assertThat(select).isEqualTo(4);
    }

    @Test
    void whenNegativeNumberInput() {
        Output out = new StubOutput();
        Input in = new MockInput(
                new String[] {"-5"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter menu:");
        assertThat(select).isEqualTo(-5);
    }
}