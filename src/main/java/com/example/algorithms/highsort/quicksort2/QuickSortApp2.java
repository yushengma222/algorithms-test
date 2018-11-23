package com.example.algorithms.highsort.quicksort2;

/**
 * @author yushengma
 */
public class QuickSortApp2 {
    public static void main(String[] args) {
        QuickSortArray2 quickSortArray = new QuickSortArray2(16);
        for (int i = 0; i < 16; i++) {
            quickSortArray.insert((long) (Math.random() * 199));
        }
        System.out.println("unsort array:");
        quickSortArray.display();
        quickSortArray.quickSort();
        System.out.println("sort array:");
        quickSortArray.display();
    }
}
