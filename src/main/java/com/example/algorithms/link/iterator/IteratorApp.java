package com.example.algorithms.link.iterator;

import com.example.algorithms.link.firstlastlink.Link;

/**
 * @author yushengma
 */
public class IteratorApp {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        ListIterator listIterator = linkList.getIterator();

        listIterator.insertAfter(21);
        listIterator.insertAfter(3);
        listIterator.insertAfter(23);
        listIterator.insertAfter(27);
        listIterator.insertAfter(28);
        listIterator.insertAfter(30);

        linkList.displayList();

        listIterator.reset();
        while (!listIterator.atEnd()) {
            Link link1 = listIterator.getCurrent();
            if (link1.dData % 3 == 0) {
                listIterator.deleteCurrent();
            } else {
                listIterator.nextLink();
            }
        }
        Link link = listIterator.getCurrent();
        if (link.dData % 3 == 0) {
            listIterator.deleteCurrent();
        }

        linkList.displayList();
    }
}
