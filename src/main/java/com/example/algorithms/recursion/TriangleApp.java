package com.example.algorithms.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yushengma
 * 递归 -- 三角数字
 */
public class TriangleApp {
    public static void main(String[] args) throws IOException {
        System.out.println("enter a number: ");
        int num = getInt();
        int totalNum = triangle(num);
        System.out.print("total number: " + totalNum);
    }

    private static int triangle(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num + triangle(num - 1));
        }
    }

    public static int getInt() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = bufferedReader.readLine();
        return Integer.parseInt(s);
    }
}
