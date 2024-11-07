package com.thisaster.bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubleSort(int[] arr) {
        for (int limit = arr.length - 1; limit > 0; limit--) {
            for (int i = 0; i < limit; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {86, 66, 44, 77, 56, 64, 76, 39, 32, 93, 33, 54, 63, 96, 5, 41, 20, 58, 55, 28};
        var start = System.nanoTime();
        bubleSort(arr);
        var end = System.nanoTime();
        System.out.println(end - start);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
