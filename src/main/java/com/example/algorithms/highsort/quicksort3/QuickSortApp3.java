package com.example.algorithms.highsort.quicksort3;

import com.example.algorithms.highsort.quicksort2.QuickSortArray2;

/**
 * @author yushengma
 */
public class QuickSortApp3 {
    public static void main(String[] args) {
        QuickSortArray3 quickSortArray = new QuickSortArray3(16);
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
