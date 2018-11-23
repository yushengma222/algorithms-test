package com.example.algorithms.hash.hashchain;

/**
 * @author yushengma
 */
public class HashLinkApp {
    public static void main(String[] args) {
        HashTableLink hashTableLink = new HashTableLink(10);
        hashTableLink.insert(2);
        hashTableLink.insert(9);
        hashTableLink.insert(7);
        hashTableLink.insert(5);
        hashTableLink.insert(3);
        hashTableLink.insert(33);
        hashTableLink.insert(15);
        hashTableLink.insert(23);
        hashTableLink.displayTable();

        Link link = hashTableLink.find(33);
        System.out.println("link: " + link.getiData());

        hashTableLink.delete(23);
        hashTableLink.displayTable();
    }
}
