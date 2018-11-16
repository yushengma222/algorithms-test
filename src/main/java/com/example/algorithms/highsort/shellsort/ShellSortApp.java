package com.example.algorithms.highsort.shellsort;

/**
 * @author yushengma
 */
public class ShellSortApp {
    public static void main(String[] args) {
        Array array = new Array(10);
        array.insert(21);
        array.insert(18);
        array.insert(90);
        array.insert(73);
        array.insert(16);
        array.insert(6);
        array.insert(62);
        array.insert(76);
        array.insert(36);
        array.insert(69);
        System.out.println("unsort array:");
        array.display();

        System.out.println("sort array:");
        array.shellSort();
        array.display();
    }
}
