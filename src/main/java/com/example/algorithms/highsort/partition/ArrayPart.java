package com.example.algorithms.highsort.partition;

/**
 * @author yushengma
 * 划分
 */
public class ArrayPart {
    private long[] arr;
    private int nItems;

    public ArrayPart(int max) {
        arr = new long[max];
        nItems = 0;
    }

    public void insert(long num) {
        arr[nItems++] = num;
    }

    public int size() {
        return nItems;
    }

    public void display() {
        for (int i = 0; i < nItems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int partitionIt(int left, int right, long pivot) {
        int leftPar = left - 1;
        int rightPar = right + 1;
        while (true) {
            while (leftPar < right && arr[++leftPar] <= pivot) {}
            while (rightPar > left && arr[--rightPar] >= pivot) {}
            if (leftPar > rightPar) {
                break;
            } else {
                long temp = arr[leftPar];
                arr[leftPar] = arr[rightPar];
                arr[rightPar] = temp;
            }
        }
        return leftPar;
    }
}
