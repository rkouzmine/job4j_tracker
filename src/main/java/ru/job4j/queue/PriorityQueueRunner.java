package ru.job4j.queue;

import java.util.PriorityQueue;

public class PriorityQueueRunner {
    public static void main(String[] args) {
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        stringQueue.offer("f");
        stringQueue.offer("a");
        stringQueue.offer("s");
        stringQueue.offer("e");
        printStringElements(stringQueue);
        System.out.println("Current element: " + stringQueue.poll());
        stringQueue.poll();
        System.out.println("Current element: " + stringQueue.poll());
        stringQueue.poll();
        System.out.println("Current element: " + stringQueue.poll());

        System.out.println();

        PriorityQueue<Transaction> transactions =
                new PriorityQueue<>(new TransactionSortDescByAmount());
        transactions.offer(new Transaction(1, "number_1", 100));
        transactions.offer(new Transaction(2, "number_2", 1000));
        transactions.offer(new Transaction(3, "number_3", 85));
        transactions.offer(new Transaction(4, "number_4", 550));
        transactions.offer(new Transaction(5, "number_5", 1000));
        transactions.offer(new Transaction(6, "number_6", 550));
        transactions.offer(new Transaction(7, "number_7", 100));
        transactions.offer(new Transaction(8, "number_8", 1000));
        printTransactionElements(transactions);

        System.out.println("Current element: " + transactions.peek());
        System.out.println("Current element: " + transactions.peek());
        transactions.poll();
        System.out.println("Current element: " + transactions.peek());
        transactions.poll();
        System.out.println("Current element: " + transactions.peek());
    }

    private static void printStringElements(PriorityQueue<String> queue) {
        while (!queue.isEmpty()) {
            System.out.println("Current element: " + queue.poll());
        }
    }

    private static void printTransactionElements(PriorityQueue<Transaction> queue) {
        while (!queue.isEmpty()) {
            System.out.println("Current element: " + queue.poll());
        }
    }
}