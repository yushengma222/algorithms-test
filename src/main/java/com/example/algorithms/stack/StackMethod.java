package com.example.algorithms.stack;

/**
 * @author yushengma
 */
public class StackMethod {
    public static void main(String[] args) {
        StackX stackX = new StackX(10);
        stackX.push(1);
        stackX.push(2);
        stackX.push(3);
        stackX.push(4);
        stackX.push(5);
        stackX.push(6);

        while (!stackX.isEmpty()) {
            long num = stackX.pop();
            System.out.print(num + " ");
        }
    }

    static class StackX {
        private int maxSize;
        private long[] stackArray;
        private int top;

        public StackX(int s) {
            maxSize = s;
            stackArray = new long[maxSize];
            top = -1;
        }

        public void push(long j) {
            stackArray[++top] = j;
        }

        public long pop() {
            return stackArray[top--];
        }

        public long peek() {
            return stackArray[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == maxSize - 1;
        }
    }
}
