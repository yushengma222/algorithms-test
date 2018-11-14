package com.example.algorithms.recursion.binarysearch;

/**
 * @author yushengma
 * 递归 -- 二分查找
 */
public class OrdArray {
    private long[] arr;
    private int nItems;

    public OrdArray(int max) {
        arr = new long[max];
        nItems = 0;
    }

    public int size() {
        return nItems;
    }

    public int find(int lowIndex, int highIndex, long searchKey) {
        int curIn = (lowIndex + highIndex) / 2;
        if (arr[curIn] == searchKey) {
            return curIn;
        }
        if (lowIndex > highIndex) {
            return nItems;
        }
        if (arr[curIn] < searchKey) {
            lowIndex = curIn + 1;
        } else {
            highIndex = curIn - 1;
        }
        return find(lowIndex, highIndex, searchKey);
    }

    public void insert(long num) {
        int i;
        for (i = 0; i < nItems - 1; i++) {
            if (arr[i] > num) {
                break;
            }
        }
        for (int j = nItems - 1; j > i; j--) {
            arr[j] = arr[j-1];
        }
        arr[i] = num;
        nItems++;
    }

    public void display() {
        for (int i = 0; i < nItems - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
