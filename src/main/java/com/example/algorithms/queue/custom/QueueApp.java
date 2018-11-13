package com.example.algorithms.queue.custom;

/**
 * @author yushengma
 */
public class QueueApp {
    public static void main(String[] args) {
        QueueX queueX = new QueueX(5);
        queueX.insert(10);
        queueX.insert(20);
        queueX.insert(30);
        queueX.insert(40);

        queueX.remove();
        queueX.remove();
        queueX.remove();

        queueX.insert(50);
        queueX.insert(60);
        queueX.insert(70);
        queueX.insert(80);

        while (!queueX.isEmpty()) {
            long n = queueX.remove();
            System.out.print(n + " ");
        }
    }
}
