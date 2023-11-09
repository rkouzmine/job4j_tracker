package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {

    @Test
    void when988To882Then6dot08() {
        Point a = new Point(9, 8, 8);
        Point b = new Point(8, 8, 2);
        double expected = 6.08;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when007To135Then3dot74() {
        Point a = new Point(0, 0, 7);
        Point b = new Point(1, 3, 5);
        double expected = 3.74;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when159To369Then2dot23() {
        Point a = new Point(1, 5, 9);
        Point b = new Point(3, 6, 9);
        double expected = 2.23;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}