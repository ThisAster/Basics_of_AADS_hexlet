package com.thisaster.selection_sort;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (var i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (var j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            var temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] items = {2, 3, 4, 3, 1, 2, 4, 5, 1, 2};
        selectionSort(items);
        Arrays.stream(items).forEach(System.out::println);
    }
}
