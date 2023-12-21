package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {

    @Test
    void whenSortByAscendingName() {
        List<Job> name = Arrays.asList(
                new Job("Mikhail", 3),
                new Job("Ruslan", 0),
                new Job("Maksim", 2),
                new Job("Elena", 1)
        );
        name.sort(new JobByAscendingName());
        List<Job> expected = Arrays.asList(
                new Job("Elena", 1),
                new Job("Maksim", 2),
                new Job("Mikhail", 3),
                new Job("Ruslan", 0)
        );
        assertThat(name).isEqualTo(expected);
    }

    @Test
    void whenSortByDecreasingName() {
        List<Job> name = Arrays.asList(
                new Job("Mikhail", 3),
                new Job("Ruslan", 0),
                new Job("Maksim", 2),
                new Job("Elena", 1)
        );
        name.sort(new JobDescByName());
        List<Job> expected = Arrays.asList(
                new Job("Ruslan", 0),
                new Job("Mikhail", 3),
                new Job("Maksim", 2),
                new Job("Elena", 1)
        );
        assertThat(name).isEqualTo(expected);
    }

    @Test
    void whenSortByAscendingPriority() {
        List<Job> name = Arrays.asList(
                new Job("Mikhail", 3),
                new Job("Ruslan", 0),
                new Job("Maksim", 2),
                new Job("Elena", 1)
        );
        name.sort(new JobByAscendingPriority());
        List<Job> expected = Arrays.asList(
                new Job("Ruslan", 0),
                new Job("Elena", 1),
                new Job("Maksim", 2),
                new Job("Mikhail", 3)
        );
        assertThat(name).isEqualTo(expected);
    }

    @Test
    void whenSortByDecreasingPriority() {
        List<Job> name = Arrays.asList(
                new Job("Mikhail", 3),
                new Job("Ruslan", 0),
                new Job("Maksim", 2),
                new Job("Elena", 1)
        );
        name.sort(new JobDescByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Mikhail", 3),
                new Job("Maksim", 2),
                new Job("Elena", 1),
                new Job("Ruslan", 0)
        );
        assertThat(name).isEqualTo(expected);
    }

    @Test
    public void whenCompatorAscendingByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobByAscendingName()
                .thenComparing(new JobByAscendingPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 2),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenCompatorDecreasingByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }
}