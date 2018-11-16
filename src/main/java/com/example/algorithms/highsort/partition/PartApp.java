package com.example.algorithms.highsort.partition;

/**
 * @author yushengma
 */
public class PartApp {
    public static void main(String[] args) {
        ArrayPart arrayPart = new ArrayPart(16);

        for (int i = 0; i < 16; i++) {
            long num = (long) (Math.random() * 199);
            arrayPart.insert(num);
        }
        System.out.println("unPart array:");
        arrayPart.display();

        int size = arrayPart.size();
        int index = arrayPart.partitionIt(0, size - 1, 99);
        System.out.println("part array and index: " + index);
        arrayPart.display();
    }
}
