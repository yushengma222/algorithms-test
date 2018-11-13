package com.example.algorithms.link.stack;

/**
 * @author yushengma
 */
public class StackApp {
    public static void main(String[] args) {
        LinkStack linkStack = new LinkStack();

        linkStack.push(1, 1.1);
        linkStack.push(2, 1.2);
        linkStack.push(3, 1.3);
        linkStack.push(4, 1.4);

        linkStack.displayStack();

        linkStack.pop();
        linkStack.pop();

        linkStack.displayStack();
    }
}
