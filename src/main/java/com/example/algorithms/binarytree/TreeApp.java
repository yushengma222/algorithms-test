package com.example.algorithms.binarytree;

/**
 * @author yushengma
 */
public class TreeApp {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(3, 1.3);
        tree.insert(1, 1.1);
        tree.insert(2, 1.2);
        tree.insert(8, 1.8);
        tree.insert(4, 1.4);
        tree.insert(5, 1.5);
        tree.insert(10, 1.10);
        tree.insert(11, 1.11);
        tree.insert(12, 1.12);
        tree.inOrder(tree.root);
        System.out.println();
        Node node = tree.find(2);
        node.dispaly();
        boolean isDelete = tree.delete(8);
        System.out.println("delete key: " + 8 + " and result: " + isDelete);
        tree.inOrder(tree.root);
        System.out.println();
    }
}
