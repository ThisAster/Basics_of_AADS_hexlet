package com.thisaster.homework.homework4;

// isPrimeNumber
public class Solution {
    public static boolean run(long n) {
        for (var i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Solution.run(2147483648L)); // false
        System.out.println(Solution.run(87178291199L)); // true
    }
}
