package com.example.algorithms.heap.heaparray;

import com.example.algorithms.heap.Node;

/**
 * @author yushengma
 */
public class Heap {
    private int maxSize;
    private int currentSize;
    private Node[] heapArray;

    public Heap(int max) {
        maxSize = max;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }

    public boolean insert(int key) {
        if (currentSize == maxSize) {
            return false;
        }
        Node node = new Node(key);
        heapArray[currentSize] = node;
        trickleUp(currentSize++);
        return true;
    }

    private void trickleUp(int index) {
        int parent = (index - 1)/2;
        Node bottom = heapArray[index];
        while (index > 0 && heapArray[parent].getiData() < bottom.getiData()) {
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent - 1)/2;
        }
        heapArray[index] = bottom;
    }

    public Node remove() {
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }

    private void trickleDown(int index) {
        Node top = heapArray[index];
        int largeChild;
        while (index < currentSize / 2) {
            int leftChild = index * 2 + 1;
            int rightChild = leftChild + 1;
            if (rightChild < currentSize && heapArray[rightChild].getiData() > heapArray[leftChild].getiData()) {
                largeChild = rightChild;
            } else {
                largeChild = leftChild;
            }
            if (heapArray[largeChild].getiData() <= top.getiData()) {
                break;
            }
            heapArray[index] = heapArray[largeChild];
            index = largeChild;
        }
        heapArray[index] = top;
    }

    public boolean change(int index, int newValue) {
        if (index < 0 || index >= currentSize) {
            return false;
        }
        int oldValue = heapArray[index].getiData();
        heapArray[index].setiData(newValue);
        if (oldValue < newValue) {
            trickleUp(index);
        } else {
            trickleDown(index);
        }
        return true;
    }

    public void displayHeap() {
        System.out.println("Heap:");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(heapArray[i].getiData() + " ");
        }
        System.out.println();
    }
}
