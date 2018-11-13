package com.example.algorithms.link.singlelink;

/**
 * @author yushengma
 */
public class LinkApp {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(1, 1.1);
        linkList.insertFirst(2, 1.2);
        linkList.insertFirst(3, 1.3);
        linkList.insertFirst(4, 1.4);
        linkList.insertFirst(5, 1.5);

        linkList.displayList();

        Link link = linkList.find(3);
        System.out.println("find key: " + 3);
        link.displayLink();
        System.out.println();

        Link delLink = linkList.delete(2);
        System.out.println("delete key: " + 2);
        delLink.displayLink();
        System.out.println();

        linkList.displayList();

        while (!linkList.isEmpty()) {
            Link cLink = linkList.deleteFirst();
            System.out.print("Delete: ");
            cLink.displayLink();
            System.out.println();
        }

        linkList.displayList();
    }
}
