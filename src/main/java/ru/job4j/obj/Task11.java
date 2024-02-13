package ru.job4j.obj;

import java.util.Deque;
import java.util.LinkedList;

public class Task11 {
    private Deque<Integer> deque = new LinkedList<>();

    public Deque<Integer> init() {
        for (int i = 1; i <= 3; i++) {
            deque.addFirst(i);
        }
        return deque;
    }
}
