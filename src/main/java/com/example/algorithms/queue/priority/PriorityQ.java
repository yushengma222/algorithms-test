package com.example.algorithms.queue.priority;

/**
 * @author yushengma
 */
public class PriorityQ {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQ(int size) {
        maxSize = size;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long num) {
        int i;
        if (nItems == 0) {
            queArray[nItems] = num;
        } else {
            for (i = nItems - 1; i >= 0; i--) {
                if (queArray[i] > num) {
                    queArray[i+1] = queArray[i];
                } else {
                    break;
                }
            }
            queArray[i+1] = num;
        }
        nItems++;
    }

    public long remove() {
//        remove max num
        return queArray[--nItems];
    }

    public long peekMax() {
        return queArray[nItems];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }
}
