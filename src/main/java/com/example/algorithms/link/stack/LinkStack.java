package com.example.algorithms.link.stack;

import com.example.algorithms.link.singlelink.Link;
import com.example.algorithms.link.singlelink.LinkList;

/**
 * @author yushengma
 */
public class LinkStack {
    private LinkList linkList;

    public LinkStack() {
        linkList = new LinkList();
    }

    public void push(int id, double dd) {
        linkList.insertFirst(id, dd);
    }

    public Link pop() {
        return linkList.deleteFirst();
    }

    public void displayStack() {
        linkList.displayList();
    }

    public boolean isEmpty() {
        return linkList.isEmpty();
    }
}
