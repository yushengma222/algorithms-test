package com.example.algorithms.stack.reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yushengma
 */
public class RevApp {
    public static void main(String[] args) throws IOException {
        System.out.print("enter a String:");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = bufferedReader.readLine();
        StackRev stackRev = new StackRev(s);
        String revS = stackRev.doRev();
        System.out.print("rev String: " + revS);
    }
}
