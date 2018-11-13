package com.example.algorithms.link.sortlink;

/**
 * @author yushengma
 */
public class SortedApp {
    public static void main(String[] args) {
        SortedLinkList sortedLinkList = new SortedLinkList();

        sortedLinkList.insert(12);
        sortedLinkList.insert(2);
        sortedLinkList.insert(7);
        sortedLinkList.insert(3);
        sortedLinkList.insert(23);

        sortedLinkList.displaySortedlist();
    }
}
