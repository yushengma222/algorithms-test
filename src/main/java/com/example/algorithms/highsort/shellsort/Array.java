package com.example.algorithms.highsort.shellsort;

/**
 * @author yushengma
 * 希尔排序 -- n-增量排序(间隔序列[Knuth || n/2])
 * 时间复杂度约: O(n*(logn)^2); 空间复杂度: O(1)
 */
public class Array {
    private long[] arr;
    private int nItems;

    public Array(int max) {
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

    public void shellSort() {
        int outer, inner;
        long temp;
        int h = 1;
//        Knuth间隔序列
        while (h <= (nItems / 3)) {
            h = h * 3 + 1;
        }
        while (h > 0) {
//            插入排序
            for (outer = h; outer < nItems; outer++) {
                temp = arr[outer];
                inner = outer;
                while (inner > h - 1 && arr[inner - h] >= temp) {
                    arr[inner] = arr[inner - h];
                    inner -= h;
                }
                arr[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
