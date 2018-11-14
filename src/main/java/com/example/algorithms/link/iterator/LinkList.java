package com.example.algorithms.link.iterator;

import com.example.algorithms.link.firstlastlink.Link;

/**
 * @author yushengma
 */
public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public boolean isEmpty() {
        return (first ==null);
    }

    public ListIterator getIterator() {
        return new ListIterator(this);
    }

    public void displayList() {
        System.out.print("List (first --> last): ");
        Link current = first;
        while (current != null) {
            current.dispalyLink();
            current = current.next;
        }
        System.out.println();
    }
}
