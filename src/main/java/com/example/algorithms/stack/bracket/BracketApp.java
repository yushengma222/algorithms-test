package com.example.algorithms.stack.bracket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yushengma
 */
public class BracketApp {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("enter a String containing delimiter:");
        String s = bufferedReader.readLine();
        BracketX bracketX = new BracketX(s);
        bracketX.bracketMatch();
    }
}
