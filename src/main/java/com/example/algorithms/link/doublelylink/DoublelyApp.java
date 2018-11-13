package com.example.algorithms.link.doublelylink;

/**
 * @author yushengma
 */
public class DoublelyApp {
    public static void main(String[] args) {
        DoublelyLinkList doublelyLinkList = new DoublelyLinkList();

        doublelyLinkList.insertFirst(1);
        doublelyLinkList.insertFirst(2);
        doublelyLinkList.insertFirst(3);
        doublelyLinkList.insertFirst(4);
        doublelyLinkList.insertFirst(5);

        doublelyLinkList.displayForward();
        doublelyLinkList.displayBackward();

        doublelyLinkList.insertLast(6);
        doublelyLinkList.insertLast(7);
        doublelyLinkList.insertLast(8);

        doublelyLinkList.displayForward();

        doublelyLinkList.insertAfter(3, 9);
        doublelyLinkList.insertAfter(7, 10);

        doublelyLinkList.displayForward();

        doublelyLinkList.deleteFirst();

        doublelyLinkList.deleteLast();

        doublelyLinkList.deleteKey(4);

        doublelyLinkList.displayForward();
    }
}
