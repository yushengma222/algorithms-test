package com.example.algorithms.recursion.mergesort;

/**
 * @author yushengma
 * 归并排序
 * 时间复杂度: O(N*logN); 空间复杂度: O(N)
 * 稳定
 */
public class MergeSort {
    private int[] array;
    private int nItems;

    public MergeSort(int max) {
        array = new int[max];
        nItems = 0;
    }

    public int size() {
        return nItems;
    }

    public void insert(int num) {
        array[nItems++] = num;
    }

    public void display() {
        for (int i = 0; i < nItems; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void mergeSort() {
        int[] workSpace = new int[10];
        reMergeSort(workSpace, 0, nItems - 1);
    }

    private void reMergeSort(int[] workSpace, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return;
        }
        int curIn = (lowIndex + highIndex) / 2;
        reMergeSort(workSpace, lowIndex, curIn);
        reMergeSort(workSpace, curIn + 1, highIndex);
        merge(workSpace, lowIndex, curIn + 1, highIndex);
    }

    private void merge(int[] workSpace, int lowBound, int highBound, int highIndex) {
        int j = 0;
        int lowIndex = lowBound;
        int mid = highBound - 1;
        int n = highIndex - lowBound + 1;
        while (lowBound <= mid && highBound <= highIndex) {
            if (array[lowBound] <= array[highBound]) {
                workSpace[j++] = array[lowBound++];
            } else {
                workSpace[j++] = array[highBound++];
            }
        }
        while (lowBound <= mid) {
            workSpace[j++] = array[lowBound++];
        }
        while (highBound <= highIndex) {
            workSpace[j++] = array[highBound++];
        }
        for (int i = 0; i < n; i++) {
            array[lowIndex + i] = workSpace[i];
        }
    }
}
