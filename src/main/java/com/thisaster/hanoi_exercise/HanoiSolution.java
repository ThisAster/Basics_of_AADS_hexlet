package com.thisaster.hanoi_exercise;

public class HanoiSolution {
    public static void hanoi(int height, int from, int to) {
        if (height == 1) {
            System.out.printf("с %d на %d%n", from, to);
            return;
        }

        var temporary = 6 - from - to;
        hanoi(height - 1, from, temporary);
        System.out.printf("с %d на %d%n", from, to);
        hanoi(height - 1, temporary, to);
    }

    public static void main(String[] args) {
        hanoi(3, 1, 2);
    }
}
