package com.example.algorithms.array;

/**
 * @author yushengma
 */
public class SortMethod {

    public static void main(String[] args) {
        int[] arr = {12, 5, 29, 55, 62, 23, 31, 13, 25, 7, 1};
        bubbleSort(arr);
        System.out.print("bubble sort: ");
        printArr(arr);
        System.out.println();
        System.out.println("========================================");
        selectSort(arr);
        System.out.print("select sort: ");
        printArr(arr);
        System.out.println();
        System.out.println("========================================");
        insertSort(arr);
        System.out.print("insert sort: ");
        printArr(arr);
    }

    /**
     * 冒泡排序
     * O(n^2)
     */
    private static void bubbleSort (int[] arr) {
        int num = arr.length;
        for (int i = num - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     * O(n^2)
     * 交换次数少
     * @param arr
     */
    private static void selectSort(int[] arr) {
        for (int out = 0; out < arr.length; out++) {
            int min = out;
            for (int in = out + 1; in < arr.length; in++) {
                if (arr[in] < arr[min]) {
                    min = in;
                }
            }
            int temp = arr[out];
            arr[out] = arr[min];
            arr[min] = temp;
        }
    }

    /**
     * 插入排序
     * O(n^2)
     * 已有序、基本有序效率更高
     * @param arr
     */
    private static void insertSort(int[] arr) {
        for (int out = 1; out < arr.length; out++) {
            int insert = arr[out];
            int in = out;
            while (in > 0 && arr[in - 1] >= insert) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = insert;
        }
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
