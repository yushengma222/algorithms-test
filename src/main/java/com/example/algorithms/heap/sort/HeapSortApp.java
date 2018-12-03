package com.example.algorithms.heap.sort;

import com.example.algorithms.heap.Node;

/**
 * @author yushengma
 */
public class HeapSortApp {
    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort(10);
        for (int i = 0; i < 10; i++) {
            Node node = new Node((int) (Math.random() * 100));
            heapSort.insertAt(i, node);
            heapSort.incrementSize();
        }
        heapSort.displayHeapSort();
        System.out.println("********************");
        int size = heapSort.size();
        for (int j = size/2-1; j >= 0; j--) {
            heapSort.trickleDown(j);
        }
        heapSort.displayHeapSort();
        System.out.println("********************");
        for (int z = size - 1; z >= 0; z--) {
            Node node = heapSort.remove();
            heapSort.insertAt(z, node);
        }
        heapSort.displayHeapSort();
    }
}
