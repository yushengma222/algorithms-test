package com.example.algorithms.heap.binaryheap;

/**
 * @author yushengma
 */
public class BinaryHeap {
    /**
     * 上浮
     * @param arr 待调整堆
     */
    public static void upTrick(int[] arr) {
        int childIndex = arr.length - 1;
        int parentIndex = (childIndex - 1) / 2;
        int temp = arr[childIndex];
        while (childIndex > 0 && temp < arr[parentIndex]) {
            arr[childIndex] = arr[parentIndex];
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) / 2;
        }
        arr[childIndex] = temp;
    }

    /**
     * 下沉
     * @param arr 待调整堆
     * @param index 待下沉节点
     * @param length 有效堆大小
     */
    public static void downTrick(int[] arr, int index, int length) {
        int temp = arr[index];
        int childIndex = 2 * index + 1;
        while (childIndex < length) {
            if (childIndex + 1 < length && arr[childIndex + 1] < arr[childIndex]) {
                childIndex++;
            }
            if (temp <= arr[childIndex]) {
                break;
            }
            arr[index] = arr[childIndex];
            index = childIndex;
            childIndex = 2 * index + 1;
        }
        arr[index] = temp;
    }

    /**
     * 调整堆
     * @param arr 待调整堆
     */
    public static void buildHeap(int[] arr) {
        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            downTrick(arr, i, arr.length);
        }
    }
}
