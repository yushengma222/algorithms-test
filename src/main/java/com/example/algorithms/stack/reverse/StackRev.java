package com.example.algorithms.stack.reverse;

/**
 * @author yushengma
 */
public class StackRev {
    private String input;
    private String output;

    public StackRev(String in) {
        input = in;
    }

    public String doRev() {
        int stackSize = input.length();
        StackX stackX = new StackX(stackSize);
        for (int i = 0; i < stackSize; i++) {
            char c = input.charAt(i);
            stackX.push(c);
        }
        output = "";
        while (!stackX.isEmpty()) {
            char c = stackX.pop();
            output = output + c;
        }
        return output;
    }

    class StackX {
        private int maxSize;
        private char[] stackArray;
        private int top;

        public StackX(int s) {
            maxSize = s;
            stackArray = new char[maxSize];
            top = -1;
        }

        public void push(char j) {
            stackArray[++top] = j;
        }

        public char pop() {
            return stackArray[top--];
        }

        public char peek() {
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
