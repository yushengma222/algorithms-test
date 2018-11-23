package com.example.algorithms.highsort.quicksort2;

/**
 * @author yushengma
 * 快速排序 -- 三数据项取中
 */
public class QuickSortArray2 {
    private long[] arr;
    private int nItems;

    public QuickSortArray2(int max) {
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
        int size = right - left + 1;
        if (size <= 3) {
            manualSort(left, right);
        } else {
            long pivot = middleOf3(left, right);
            int partitionId = partitionIt(left, right, pivot);
            recQuickSort(left, partitionId - 1);
            recQuickSort(partitionId + 1, right);
        }
    }

    private int partitionIt(int left, int right, long pivot) {
        int leftPar = left;
        int rightPar = right - 1;
        while (true) {
            while (arr[++leftPar] < pivot) {}
            while (arr[--rightPar] > pivot) {}
            if (leftPar >= rightPar) {
                break;
            } else {
                swap(leftPar, rightPar);
            }
        }
        swap(leftPar, right - 1);
        return leftPar;
    }

    private long middleOf3(int left, int right) {
        int curIn = (left + right) / 2;
        if (arr[left] > arr[curIn]) {
            swap(left, curIn);
        }
        if (arr[left] > arr[right]) {
            swap(left, right);
        }
        if (arr[curIn] > arr[right]) {
            swap(curIn, right);
        }
        swap(curIn, right - 1);
        return arr[right - 1];
    }

    private void manualSort(int left, int right) {
        int size = right - left + 1;
        if (size <= 1) {
            return;
        } else if (size == 2) {
            if (arr[left] > arr[right]) {
                swap(left, right);
            }
        } else {
            if (arr[left] > arr[right - 1]) {
                swap(left, right - 1);
            }
            if (arr[left] > arr[right]) {
                swap(left, right);
            }
            if (arr[right - 1] > arr[right]) {
                swap(right - 1, right);
            }
        }
    }

    private void swap(int left, int right) {
        long temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
