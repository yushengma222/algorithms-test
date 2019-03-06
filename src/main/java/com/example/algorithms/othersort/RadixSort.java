package com.example.algorithms.othersort;

import java.util.ArrayList;

/**
 * @author yushengma
 * 基数排序
 * 时间复杂度: O(n*k); 空间复杂度: O(n+k) 稳定
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{95, 94, 91, 98, 99, 90, 99, 93, 91, 92};
        System.out.println("print arr: ");
        printArr(arr);
        int[] sortedArr = radixSort(arr);
        System.out.println("print sort arr: ");
        printArr(sortedArr);
    }

    private static int[] radixSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        // 最大值位数
        int maxDigit = getMaxDigit(arr);
        // 初始化桶
        int bucketNum = 10;
        ArrayList<ArrayList<Integer>> bucketList = new ArrayList<>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketList.add(new ArrayList<>());
        }
        // 以基为准分配
        int div = 1;
        for (int i = 0; i < maxDigit; i++) {
            for (int j = 0; j < arr.length; j++) {
                int num = (arr[j] / div) % 10;
                bucketList.get(num).add(arr[j]);
            }
            int index = 0;
            for (int m = 0; m < bucketNum; m++) {
                for (int n = 0; n < bucketList.get(m).size(); n++) {
                    arr[index++] = bucketList.get(m).get(n);
                }
                bucketList.get(m).clear();
            }
            div *= 10;
        }
        return arr;
    }

    private static int  getMaxDigit(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int maxDigit = 0;
        while (max != 0) {
            max /= 10;
            maxDigit++;
        }
        return maxDigit;
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
