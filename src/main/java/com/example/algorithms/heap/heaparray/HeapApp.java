package com.example.algorithms.heap.heaparray;

import com.example.algorithms.heap.Node;

/**
 * @author yushengma
 */
public class HeapApp {
    public static void main(String[] args) {
        Heap heap = new Heap(10);
        heap.insert(12);
        heap.insert(1);
        heap.insert(78);
        heap.insert(56);
        heap.insert(45);
        heap.insert(98);
        heap.insert(24);
        heap.insert(19);
        heap.insert(65);
        heap.displayHeap();
        Node node = heap.remove();
        System.out.println("remove: " + node.getiData());
        heap.displayHeap();
        heap.change(4, 99);
        heap.displayHeap();
    }
}
