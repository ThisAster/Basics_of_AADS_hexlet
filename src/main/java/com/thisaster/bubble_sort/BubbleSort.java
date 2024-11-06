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
        int[] arr = {5, 4, 6, 3, 2, 1};
        bubleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
