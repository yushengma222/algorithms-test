package com.example.algorithms.hash.hashchain;

/**
 * @author yushengma
 */
public class HashTableLink {
    private HashLink[] hashLinkArray;
    private int arraySize;

    public HashTableLink(int max) {
        arraySize = max;
        hashLinkArray = new HashLink[arraySize];
        for (int i = 0; i < arraySize; i++) {
            hashLinkArray[i] = new HashLink();
        }
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int i = 0; i < arraySize; i++) {
            hashLinkArray[i].displayList();
        }
        System.out.println();
    }

    public void insert(int key) {
        Link link = new Link(key);
        int hashValue = hashFuc(key);
        hashLinkArray[hashValue].insert(link);
    }

    public void delete(int key) {
        int hashValue = hashFuc(key);
        hashLinkArray[hashValue].delete(key);
    }

    public Link find(int key) {
        int hashValue = hashFuc(key);
        return hashLinkArray[hashValue].find(key);
    }

    private int hashFuc(int key) {
        return (key % arraySize);
    }
}
