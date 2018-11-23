package com.example.algorithms.hash.hashchain;

/**
 * @author yushengma
 */
public class Link {
    private int iData;
    public Link next;

    public Link(int id) {
        iData = id;
    }

    public int getiData() {
        return iData;
    }

    public void dispalyLink() {
        System.out.print(iData + " ");
    }
}
