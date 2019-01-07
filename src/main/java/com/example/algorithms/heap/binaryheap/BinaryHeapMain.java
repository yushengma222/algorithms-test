package com.example.algorithms.heap.binaryheap;

/**
 * @author yushengma
 */
public class BinaryHeapMain {
    public static void main(String[] args) {
        int[] arr1 = {2,1,9,4,3,7,0};
        BinaryHeap.buildHeap(arr1);
        System.out.println("arr1 after adjust: ");
        for (int anArr1 : arr1) {
            System.out.print(anArr1 + " ");
        }
        System.out.println("");
        int[] arr2 = {14, 15, 23, 19, 36, 47, 29, 21, 62, 0};
        BinaryHeap.upTrick(arr2);
        System.out.println("arr2 after upTrick: ");
        for (int anArr2 : arr2) {
            System.out.print(anArr2 + " ");
        }
    }
}
