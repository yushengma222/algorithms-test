package com.example.algorithms.highsort.quicksort3;

/**
 * @author yushengma
 * 快速排序 + 插入排序
 */
public class QuickSortArray3 {
    private long[] arr;
    private int nItems;

    public QuickSortArray3(int max) {
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
        if (size < 10) {
            insertSort(left, right);
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
        int center = (left + right) / 2;
        if (arr[left] > arr[center]) {
            swap(left, center);
        }
        if (arr[left] > arr[right]) {
            swap(left, right);
        }
        if (arr[center] > arr[right]) {
            swap(center, right);
        }
        swap(center, right - 1);
        return arr[right - 1];
    }

    private void swap(int left, int right) {
        long temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    private void insertSort(int left, int right) {
        int outer, inner;
        long temp;
        for (outer = left + 1; outer <= right; outer++) {
            temp = arr[outer];
            inner = outer;
            while (inner > left && arr[inner - 1] >= temp) {
                arr[inner] = arr[inner - 1];
                --inner;
            }
            arr[inner] = temp;
        }
    }
}
