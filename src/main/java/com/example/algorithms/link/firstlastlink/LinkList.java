package com.example.algorithms.link.firstlastlink;

/**
 * @author yushengma
 * 双端链表
 */
public class LinkList {
    private Link first;
    private Link last;

    public LinkList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(long dd) {
        Link link = new Link(dd);
        if (isEmpty()) {
            last = link;
        } else {
            link.next = first;
        }
        first = link;
    }

    public void insertLast(long dd) {
        Link link = new Link(dd);
        if (isEmpty()) {
            first = link;
        } else {
            last.next = link;
        }
        last = link;
    }

    public long deleteFirst() {
        long temp = first.dData;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void dispalyList() {
        System.out.print("List (first --> last): ");
        Link current = first;
        while (current != null) {
            current.dispalyLink();
            current = current.next;
        }
        System.out.println();
    }
}
