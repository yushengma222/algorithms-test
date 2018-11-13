package com.example.algorithms.link.queue;

/**
 * @author yushengma
 */
public class QueueApp {
    public static void main(String[] args) {
        LinkQueue linkQueue = new LinkQueue();
        linkQueue.insert(1);
        linkQueue.insert(2);
        linkQueue.insert(3);
        linkQueue.insert(4);

        linkQueue.displayQueue();

        linkQueue.remove();
        linkQueue.remove();

        linkQueue.displayQueue();
    }
}
