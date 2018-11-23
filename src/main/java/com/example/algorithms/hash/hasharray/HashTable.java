package com.example.algorithms.hash.hasharray;

/**
 * @author yushengma
 */
public class HashTable {
    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonItem;

    public HashTable(int max) {
        arraySize = max;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1);
    }

    public void dispalyTable() {
        System.out.println("Table: ");
        for (int i = 0; i < arraySize; i++) {
            if (hashArray[i] != null) {
                System.out.print(hashArray[i].getiData() + " ");
            } else {
                System.out.print("** ");
            }
        }
        System.out.println();
    }

    public DataItem find(int key) {
        int hashValue = hashFuc(key);
        while (hashArray[hashValue] != null) {
            if (hashArray[hashValue].getiData() == key) {
                return hashArray[hashValue];
            }
            ++hashValue;
            hashValue = hashValue % arraySize;
        }
        return null;
    }

    public void insert(int id) {
        DataItem dataItem = new DataItem(id);
        int hashValue = hashFuc(id);
        while (hashArray[hashValue] != null && hashArray[hashValue].getiData() != -1) {
            ++hashValue;
            hashValue = hashValue % arraySize;
        }
        hashArray[hashValue] = dataItem;
    }

    public DataItem delete(int key) {
        int hashValue = hashFuc(key);
        while (hashArray[hashValue] != null) {
            if (hashArray[hashValue].getiData() == key) {
                DataItem temp = hashArray[hashValue];
                hashArray[hashValue] = nonItem;
                return temp;
            }
            ++hashValue;
            hashValue = hashValue % arraySize;
        }
        return null;
    }

    private int hashFuc(int key) {
        return (key % arraySize);
    }
}
