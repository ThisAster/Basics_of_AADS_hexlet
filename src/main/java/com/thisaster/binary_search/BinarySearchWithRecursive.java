package com.thisaster.binary_search;

import java.util.List;

public class BinarySearchWithRecursive {
    public static int binarySearch(List<Integer> items, int value, int left, int right) {
        if (left > right) return -1;
        var mid = (left + right) / 2;
        if (value == items.get(mid)) return mid;
        if (value < items.get(mid)) return binarySearch(items, value, left, mid - 1);
        return binarySearch(items, value, mid + 1, right);
    }

    public static void main(String[] args) {
        List<Integer> items = List.of(-3, -1, 1, 3, 5, 7, 9, 11);
        System.out.println(binarySearch(items, 100, 0, items.size() - 1));// -1
        System.out.println(binarySearch(items, -1, 0, items.size() - 1)); // 1
        System.out.println(binarySearch(items, 7, 0, items.size() - 1)); // 5
    }
}
