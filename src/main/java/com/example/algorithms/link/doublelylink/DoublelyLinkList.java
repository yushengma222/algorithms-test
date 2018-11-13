package com.example.algorithms.link.doublelylink;

/**
 * @author yushengma
 * 双向链表
 */
public class DoublelyLinkList {
    private Link first;
    private Link last;

    public DoublelyLinkList() {
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
            first.previous = link;
        }
        link.next = first;
        first = link;
    }

    public void insertLast(long dd) {
        Link link = new Link(dd);
        if (isEmpty()) {
            first = link;
        } else {
            last.next = link;
        }
        link.previous = last;
        last = link;
    }

    public Link deleteFirst() {
        Link temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public Link deleteLast() {
        Link temp = last;
        if (last.previous == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(long key, long dd) {
        Link current = first;
        while (current.dData != key) {
            if (current.next == null) {
                return false;
            } else {
                current = current.next;
            }
        }
        Link link = new Link(dd);
        if (current == last) {
            link.next = null;
            last = link;
        } else {
            link.next = current.next;
            current.next.previous = link;
        }
        link.previous = current;
        current.next = link;
        return true;
    }

    public Link deleteKey(long key) {
        Link current = first;
        while (current.dData != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }
        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayForward() {
        System.out.println("List (first --> last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        System.out.println("List (last --> first): ");
        Link current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }
}
