package com.example.algorithms.recursion.mergesort;

/**
 * @author yushengma
 */
public class MergeSortApp {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort(15);
        mergeSort.insert(2);
        mergeSort.insert(23);
        mergeSort.insert(12);
        mergeSort.insert(29);
        mergeSort.insert(33);
        mergeSort.insert(21);
        mergeSort.insert(89);
        mergeSort.insert(45);
        mergeSort.insert(3);
        mergeSort.insert(9);

        mergeSort.display();

        mergeSort.mergeSort();
        mergeSort.display();
    }
}
