package com.example.algorithms.hash.hasharray;

/**
 * @author yushengma
 */
public class HashArrayApp {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        hashTable.insert(1);
        hashTable.insert(2);
        hashTable.insert(4);
        hashTable.insert(7);
        hashTable.insert(9);
        hashTable.insert(5);
        hashTable.dispalyTable();
        DataItem dataItem = hashTable.find(7);
        System.out.println("dataItem: " + dataItem.getiData());
        hashTable.delete(4);
        hashTable.delete(9);
        hashTable.dispalyTable();
    }
}
