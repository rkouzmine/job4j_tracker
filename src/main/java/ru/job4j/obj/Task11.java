package ru.job4j.obj;

import java.util.Deque;
import java.util.LinkedList;

public class Task11 {
    private Deque<Integer> deque = new LinkedList<>();

    public Deque<Integer> init() {
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        return deque;
    }
}
