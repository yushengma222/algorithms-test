package com.example.algorithms.link.queue;

import com.example.algorithms.link.firstlastlink.LinkList;

/**
 * @author yushengma
 */
public class LinkQueue {
    private LinkList linkList;

    public LinkQueue() {
        linkList = new LinkList();
    }

    public void insert(long dd) {
        linkList.insertLast(dd);
    }

    public long remove() {
        return linkList.deleteFirst();
    }

    public void displayQueue() {
        linkList.dispalyList();
    }
}
