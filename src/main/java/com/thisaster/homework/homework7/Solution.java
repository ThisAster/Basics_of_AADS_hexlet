package com.thisaster.homework.homework7;

import java.util.Stack;

public class Solution {
    private static String processString(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder strBuilder = new StringBuilder();
        char[] chrArr = str.toCharArray();
        for (char chr : chrArr) {
            if (chr == '#') {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(chr);
            }
        }
        while (!stack.isEmpty()) strBuilder.insert(0, stack.pop());
        return strBuilder.toString();
    }

    public static boolean run (String str1, String str2) {
        String newString1 = processString(str1);
        String newString2 = processString(str2);
        return newString1.equals(newString2);
    }

    public static void main(String[] args) {
        System.out.println(run("##ab##", "c#d#"));
    }
}