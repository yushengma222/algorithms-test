package com.example.algorithms.link.firstlastlink;

/**
 * @author yushengma
 */
public class Link {
    public long dData;
    public Link next;

    public Link(long dd) {
        dData = dd;
    }

    public void dispalyLink() {
        System.out.print("{" + dData + "}");
    }
}
