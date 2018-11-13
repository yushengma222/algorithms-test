package com.example.algorithms.link.firstlastlink;

/**
 * @author yushengma
 */
public class LinkApp {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(1);
        linkList.insertFirst(2);
        linkList.insertFirst(3);
        linkList.insertFirst(4);
        linkList.insertFirst(5);

        linkList.dispalyList();

        linkList.insertLast(6);
        linkList.insertLast(7);

        linkList.dispalyList();

        linkList.deleteFirst();
        linkList.deleteFirst();
        linkList.deleteFirst();

        linkList.dispalyList();
    }
}
