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
        int[] items = {86, 66, 44, 77, 56, 64, 76, 39, 32, 93, 33, 54, 63, 96, 5, 41, 20, 58, 55, 28};
        var start = System.nanoTime();
        selectionSort(items);
        var end = System.nanoTime();
        System.out.println(end - start);
        Arrays.stream(items).forEach(System.out::println);
    }
}
