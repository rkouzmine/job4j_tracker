package ru.job4j.exercises.map;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import ru.job4j.exercises.map.PutIfAbsent.User;

import java.util.HashMap;
import java.util.Map;

class PutIfAbsentTest {

    @Test
    public void addNewElement() {
        Map<Integer, User> map = new HashMap<>(
                Map.of(
                        1, new User(1, "Name1"),
                        2, new User(2, "Name2")
                )
        );
        PutIfAbsent put = new PutIfAbsent(map);
        User user = new User(1, "Name3");
        boolean rsl = put.addNewElement(user);
        assertThat(rsl).isFalse();
    }

    @Test
    public void addNewElementTrue() {
        Map<Integer, User> map = new HashMap<>(
                Map.of(
                        1, new User(1, "Name1"),
                        2, new User(2, "Name2")
                )
        );
        PutIfAbsent put = new PutIfAbsent(map);
        User user = new User(3, "Name3");
        boolean rsl = put.addNewElement(user);
        assertThat(rsl).isTrue();
    }
}