package com.example.algorithms.heap.sort;

import com.example.algorithms.heap.Node;

/**
 * @author yushengma
 * 堆排序
 * 时间复杂度: O(n*logn); 空间复杂度: O(1) 不稳定
 */
public class HeapSort {
    private int maxSize;
    private int currentSize;
    private Node[] heapArray;

    public HeapSort(int max) {
        maxSize = max;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }

    public void insertAt(int index, Node node) {
        heapArray[index] = node;
    }

    public void incrementSize() {
        currentSize++;
    }

    public int size() {
        return currentSize;
    }

    public Node remove() {
        Node top = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return top;
    }

    public void trickleDown(int index) {
        Node top = heapArray[index];
        int largeChild;
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            if (rightChild < currentSize && heapArray[leftChild].getiData() < heapArray[rightChild].getiData()) {
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

    public void displayHeapSort() {
        System.out.println("Heap:");
        for (int i = 0; i < maxSize; i++) {
            System.out.print(heapArray[i].getiData() + " ");
        }
        System.out.println();
    }
}
