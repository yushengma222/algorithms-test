package com.example.algorithms.highsort.quicksort;

/**
 * @author yushengma
 * 快速排序 -- 最右端作为枢纽
 */
public class QuickSortArray {
    private long[] arr;
    private int nItems;

    public QuickSortArray(int max) {
        arr = new long[max];
        nItems = 0;
    }

    public void insert(long num) {
        arr[nItems++] = num;
    }

    public void display() {
        for (int i = 0; i < nItems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void quickSort() {
        recQuickSort(0, nItems - 1);
    }

    private void recQuickSort(int left, int right) {
        if (left >= right) {
            return;
        }
        int partitionId = partitionIt(left, right);
        recQuickSort(left, partitionId - 1);
        recQuickSort(partitionId + 1, right);
    }

    private int partitionIt(int left, int right) {
        long pivot = arr[right];
        int leftPar = left - 1;
        int rightPar = right;
        while (true) {
            while (arr[++leftPar] < pivot) {}
            while (rightPar > 0 && arr[--rightPar] > pivot) {}
            if (leftPar >= rightPar) {
                break;
            } else {
                swap(leftPar, rightPar);
            }
        }
        swap(leftPar, right);
        return leftPar;
    }

    private void swap(int leftPar, int rightPar) {
        long temp = arr[leftPar];
        arr[leftPar] = arr[rightPar];
        arr[rightPar] = temp;
    }
}
