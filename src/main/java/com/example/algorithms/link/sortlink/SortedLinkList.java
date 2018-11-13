package com.example.algorithms.link.sortlink;

import com.example.algorithms.link.firstlastlink.Link;

/**
 * @author yushengma
 * 有序链表
 */
public class SortedLinkList {
    private Link first;

    public SortedLinkList() {
        first = null;
    }

    public SortedLinkList(Link[] linkArr) {
        first = null;
        for (int i = 0; i < linkArr.length; i++) {
            insertLink(linkArr[i]);
        }
    }

    public boolean isEmpty() {
        return first ==null;
    }

    public void insert(long dd) {
        Link link = new Link(dd);
        Link previous = null;
        Link current = first;
        while (current != null && dd > current.dData) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = link;
        } else {
            previous.next = link;
        }
        link.next = current;
    }

    public void insertLink(Link link) {
        Link previous = null;
        Link current = first;
        while (current != null && link.dData > current.dData) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = link;
        } else {
            previous.next = link;
        }
        link.next = current;
    }

    public Link remove() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displaySortedlist() {
        System.out.println("List (first --> last): ");
        Link current = first;
        while (current != null) {
            current.dispalyLink();
            current = current.next;
        }
        System.out.println();
    }
}
