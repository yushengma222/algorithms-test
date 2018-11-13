package com.example.algorithms.stack.bracket;

/**
 * @author yushengma
 * O(1)
 */
public class BracketX {
    private String input;
    private String output;

    public BracketX(String s) {
        input = s;
    }

    public void bracketMatch() {
        int bracketSize = input.length();
        StackX stackX = new StackX(bracketSize);

        for (int i = 0; i < bracketSize; i++) {
            char c = input.charAt(i);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stackX.push(c);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!stackX.isEmpty()) {
                        char c1 = stackX.pop();
                        if ((c == '}' && c1 != '{') || (c == ']' && c1 != '[') || (c == ')' && c1 != '(')) {
                            System.out.print("Error char " + c + " at " + i);
                        }
                    } else {
                        System.out.print("Error char " + c + " at " + i);
                    }
                    break;
                default:
                    break;
            }
        }
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
