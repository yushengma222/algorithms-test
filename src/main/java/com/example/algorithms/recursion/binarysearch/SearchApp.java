package com.example.algorithms.recursion.binarysearch;

/**
 * @author yushengma
 */
public class SearchApp {
    public static void main(String[] args) {
        OrdArray ordArray = new OrdArray(10);

        ordArray.insert(2);
        ordArray.insert(5);
        ordArray.insert(3);
        ordArray.insert(8);
        ordArray.insert(6);
        ordArray.insert(16);
        ordArray.insert(1);

        ordArray.display();

        int index = ordArray.find(0, ordArray.size() - 1, 6);
        System.out.println("find key: " + 6 + " and return index: " + index);
    }
}
