package com.example.algorithms.link.sortlink;

import com.example.algorithms.link.firstlastlink.Link;

import java.util.Random;

/**
 * @author yushengma
 */
public class SortedLinkArrayApp {
    public static void main(String[] args) {
        Link[] links = new Link[10];
        Random random = new Random();
        System.out.println("unsorted array: ");
        for (int i = 0; i < links.length; i++) {
            Link link = new Link(random.nextInt(100));
            links[i] = link;
            link.dispalyLink();
        }

        System.out.println();
        SortedLinkList sortedLinkList = new SortedLinkList(links);
        sortedLinkList.displaySortedlist();

        System.out.println("sorted array: ");
        for (int j = 0; j < links.length; j++) {
            links[j] = sortedLinkList.remove();
            links[j].dispalyLink();
        }
    }
}
