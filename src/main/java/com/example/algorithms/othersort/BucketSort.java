package com.example.algorithms.othersort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author yushengma
 * 桶排序
 * 时间复杂度: O(n+k); 空间复杂度: O(n+k) 稳定
 */
public class BucketSort {
    public static void main(String[] args) {
        double[] arr = new double[]{4.12, 6.421, 0.0023, 3.0, 2.123, 8.122, 4.12, 10.09};
        System.out.println("print arr: ");
        printArr(arr);
        bucketSort(arr);
        System.out.println("print sorted arr: ");
        printArr(arr);
    }

    private static void printArr(double[] arr) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static double[] bucketSort(double[] arr) {
        // 1.得到数列的最大值和最小值
        double min = getMin(arr);
        double max = getMax(arr);
        // 2.初始化桶（bucketNum即k），
        int bucketNum = arr.length;
        ArrayList<LinkedList<Double>> bucketList = new ArrayList<>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketList.add(new LinkedList<Double>());
        }
        // 3.遍历原始数组，将每个元素放入桶中
        double range = (max - min) / (bucketNum - 1);
        for (int j = 0; j < bucketNum; j++) {
            int num = (int) ((arr[j] - min) / range);
            bucketList.get(num).add(arr[j]);
        }
        // 4.对每个通内部进行排序
        for (int k = 0; k < bucketList.size(); k++) {
            // JDK底层采用了归并排序或归并的优化版本
            Collections.sort(bucketList.get(k));
        }
        // 5.输出全部元素
        int k = 0;
        for (int m = 0; m < bucketNum; m++) {
            for (int n = 0; n < bucketList.get(m).size(); n++) {
                arr[k++] = bucketList.get(m).get(n);
            }
        }
        return arr;
    }

    private static double getMin(double[] arr) {
        double minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    private static double getMax(double[] arr) {
        double maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
