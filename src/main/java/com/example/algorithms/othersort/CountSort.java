package com.example.algorithms.othersort;

/**
 * @author yushengma
 * 计数排序 -- 仅限整数
 * 时间复杂度: O(); 空间复杂度: O()
 */
public class CountSort {
    public static void main(String[] args) {
        int[] arr = new int[]{95, 94, 91, 98, 99, 90, 99, 93, 91, 92};
        System.out.println("print arr: ");
        printArr(arr);
        int[] sortedArr = countSort(arr);
        System.out.println("print sort arr: ");
        printArr(sortedArr);
        int[] sortedArr2 = countSort2(arr);
        System.out.println("print sort arr2: ");
        printArr(sortedArr2);
        int[] sortedArr3 = countSort3(arr);
        System.out.println("print sort arr3: ");
        printArr(sortedArr3);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static int[] countSort(int[] arr) {
        int max = getMax(arr);
        int[] countArr = new int[max + 1];
        for (int i = 0; i <arr.length; i++) {
            countArr[arr[i]]++;
        }
        int index = 0;
        int[] sortedArr = new int[arr.length];
        for (int m = 0; m < countArr.length; m++) {
            for (int n = 0; n < countArr[m]; n++) {
                sortedArr[index++] = m;
            }
        }
        return sortedArr;
    }

    public static int[] countSort2(int[] arr) {
        int min = getMin(arr);
        int max = getMax(arr);
        int[] countArr = new int[max - min + 1];
        for (int i = 0; i <arr.length; i++) {
            countArr[arr[i] - min]++;
        }
        int index = 0;
        int[] sortedArr = new int[arr.length];
        for (int m = 0; m < countArr.length; m++) {
            for (int n = 0; n < countArr[m]; n++) {
                sortedArr[index++] = m + min;
            }
        }
        return sortedArr;
    }

    public static int[] countSort3(int[] arr) {
        //1.得到数列的最大值和最小值，并算出差值k
        int min = getMin(arr);
        int max = getMax(arr);
        int[] countArr = new int[max - min + 1];
        //2.创建统计数组并统计对应元素个数
        for (int i = 0; i <arr.length; i++) {
            countArr[arr[i] - min]++;
        }
        //3.统计数组做变形，后面的元素等于前面的元素之和
        for (int j = 1; j < countArr.length; j++) {
            countArr[j] = countArr[j] + countArr[j - 1];
        }
        //4.倒序遍历原始数列，从统计数组找到正确位置，输出到结果数组
        int[] sortedArr = new int[arr.length];
        for (int m = arr.length - 1; m >= 0; m--) {
            sortedArr[--countArr[arr[m] - min]] = arr[m];
        }
        return sortedArr;
    }

    private static int getMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    private static int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
