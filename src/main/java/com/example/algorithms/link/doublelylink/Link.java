package com.example.algorithms.link.doublelylink;

/**
 * @author yushengma
 */
public class Link {
    public long dData;
    public Link next;
    public Link previous;

    public Link(long dd) {
        dData = dd;
    }

    public void displayLink() {
        System.out.print("{" + dData + "}");
    }
}
