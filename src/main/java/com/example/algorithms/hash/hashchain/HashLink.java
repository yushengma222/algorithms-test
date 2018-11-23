package com.example.algorithms.hash.hashchain;

/**
 * @author yushengma
 */
public class HashLink {
    private Link first;

    public HashLink() {
        first = null;
    }

    public void insert(Link link) {
        int key = link.getiData();
        Link previous = null;
        Link current = first;
        while (current != null && key > current.getiData()) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = link;
        } else {
            previous.next = link;
            link.next = current;
        }
    }

    public void delete(int key) {
        Link previous = null;
        Link current = first;
        while (current.getiData() != key) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = current.next;
        } else {
            previous.next = current.next;
        }
    }

    public Link find(int key) {
        Link current = first;
        while (current.getiData() != key) {
            if (current.getiData() > key || current.next == null) {
                return null;
            }
            current = current.next;
        }
        return current;
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
