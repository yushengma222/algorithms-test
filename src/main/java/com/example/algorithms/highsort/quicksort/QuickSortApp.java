package com.example.algorithms.highsort.quicksort;

/**
 * @author yushengma
 */
public class QuickSortApp {
    public static void main(String[] args) {
        QuickSortArray quickSortArray = new QuickSortArray(16);
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
