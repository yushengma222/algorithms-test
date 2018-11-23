package com.example.algorithms.binarytree;

/**
 * @author yushengma
 */
public class Node {
    public int iData;
    public double dData;
    public Node leftChild;
    public Node rightChild;

    public Node(int id, double dd) {
        iData = id;
        dData = dd;
    }

    public void dispaly() {
        System.out.println("{" + iData + ", " + dData + "}");
    }
}
