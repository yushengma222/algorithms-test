package com.example.algorithms.link.iterator;

import com.example.algorithms.link.firstlastlink.Link;

/**
 * @author yushengma
 * 迭代器
 */
public class ListIterator {
    private Link current;
    private Link previous;
    private LinkList linkList;

    public ListIterator(LinkList list) {
        linkList = list;
        reset();
    }

    public void reset() {
        current = linkList.getFirst();
        previous = null;
    }

    public boolean atEnd() {
        return (current.next == null);
    }

    public void nextLink() {
        previous = current;
        current = current.next;
    }

    public Link getCurrent() {
        return current;
    }

    public void insertAfter(long dd) {
        Link link = new Link(dd);
        if (linkList.isEmpty()) {
            linkList.setFirst(link);
            current = link;
        } else {
            link.next = current.next;
            current.next = link;
            nextLink();
        }
    }

    public void insertBefore(long dd) {
        Link link = new Link(dd);
        if (previous == null) {
            link.next = linkList.getFirst();
            linkList.setFirst(link);
            reset();
        } else {
            link.next = previous.next;
            previous.next = link;
            current = link;
        }
    }

    public long deleteCurrent() {
        long value = current.dData;
        if (previous == null) {
            linkList.setFirst(current.next);
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }
        return value;
    }
}
