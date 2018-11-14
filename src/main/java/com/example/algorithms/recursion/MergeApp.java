package com.example.algorithms.recursion;

/**
 * @author yushengma
 * 归并排序
 */
public class MergeApp {
    public static void main(String[] args) {
        int[] arrayA =  {23, 47, 83, 98};
        int[] arrayB =  {7, 14, 39, 63, 76, 88};
        int[] arrayC =  new int[10];
        merge(arrayA, 4, arrayB, 6, arrayC);
        display(arrayC, 10);
    }

    private static void display(int[] arrayC, int sizeC) {
        for (int i = 0; i < sizeC; i++) {
            System.out.print(arrayC[i] + " ");
        }
        System.out.println();
    }

    private static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
        int aIndex = 0, bIndex = 0, cIndex = 0;
        while (aIndex < sizeA && bIndex < sizeB) {
            if (arrayA[aIndex] <= arrayB[bIndex]) {
                arrayC[cIndex++] = arrayA[aIndex++];
            } else {
                arrayC[cIndex++] = arrayB[bIndex++];
            }
        }
        while (aIndex < sizeA) {
            arrayC[cIndex++] = arrayA[aIndex++];
        }
        while (bIndex <sizeB) {
            arrayC[cIndex++] = arrayB[bIndex++];
        }
    }
}
