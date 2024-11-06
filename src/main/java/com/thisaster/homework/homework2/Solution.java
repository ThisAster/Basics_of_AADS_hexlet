package com.thisaster.homework.homework2;

// algorithm by Euclid
public class Solution {
    public static int run(int a, int b) {
        if (a==b) return a;
        if (a>b) return run(a-b, b);
        return run(a, b-a);
    }

    public static void main(String[] args) {
        System.out.println(run(129, 90));
    }
}
