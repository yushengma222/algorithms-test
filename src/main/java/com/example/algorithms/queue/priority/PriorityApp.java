package com.example.algorithms.queue.priority;

/**
 * @author yushengma
 */
public class PriorityApp {
    public static void main(String[] args) {
        PriorityQ priorityQ = new PriorityQ(6);
        priorityQ.insert(12);
        priorityQ.insert(2);
        priorityQ.insert(42);
        priorityQ.insert(22);
        priorityQ.insert(29);
        priorityQ.insert(15);

        while (!priorityQ.isEmpty()) {
            long s = priorityQ.remove();
            System.out.print(s + " ");
        }
    }
}
