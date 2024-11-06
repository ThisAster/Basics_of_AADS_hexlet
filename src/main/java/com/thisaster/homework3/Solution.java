package com.thisaster.homework3;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static List<Integer> quickSort(List<Integer> array, String direction) {
        if (array.size() < 2) {
            return array;
        }
        List<Integer> left = new ArrayList<>();
        List<Integer> middle = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int pivot = array.getFirst();
        for (int i : array) {
            if (i < pivot) {
                left.add(i);
            } else if (i == pivot) {
                middle.add(i);
            } else {
                right.add(i);
            }
        }
        left = quickSort(left, direction);
        right = quickSort(right, direction);
        List<Integer> sortedArr = new ArrayList<>();
        if (direction.equals("desc")) {
            sortedArr.addAll(right);
            sortedArr.addAll(middle);
            sortedArr.addAll(left);
        } else {
            sortedArr.addAll(left);
            sortedArr.addAll(middle);
            sortedArr.addAll(right);
        }
        return sortedArr;
    }

    public static List<Integer> run(List<Integer> array, String sortDirect) {
        return quickSort(array, sortDirect);
    }

    public static List<Integer> run(List<Integer> array) {
        return quickSort(array, "asc");
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, -1, 6, 3, 8, 22, 10);
        List<Integer> sorted = Solution.run(numbers, "asc");
        System.out.println(sorted); // => [-1, 2, 3, 6, 8, 10, 22]

        // По умолчанию направление равно asc
        List<Integer> sorted1 = Solution.run(numbers);
        System.out.println(sorted1); // => [-1, 2, 3, 6, 8, 10, 22]

        List<Integer> sortedDesc = Solution.run(numbers, "desc");
        System.out.println(sortedDesc); // => [22, 10, 8, 6, 3, 2, -1]

    }
}

// stackoverflow error in other jvm
// unnecessary recursive call sort for middle, because its sorted
//    private static List<Integer> quickSort(List<Integer> array, String direction) {
//        if (array.size() < 2) return array;
//
//        int pivot = (array.getLast() + array.getFirst()) / 2;
//
//        List<Integer> left = new ArrayList<>();
//        List<Integer> right = new ArrayList<>();
//        List<Integer> middle = new ArrayList<>();
//
//        for (int i : array) {
//            if (i < pivot) {
//                left.add(i);
//            } else if (i == pivot) {
//                middle.add(i);
//            } else {
//                right.add(i);
//            }
//        }
//        quickSort(left, direction);
//        quickSort(middle, direction);
//        quickSort(right, direction);
//        List<Integer> sortedArr = new ArrayList<>();
//        if (direction.equals("desc")) {
//            sortedArr.addAll(quickSort(right, direction));
//            sortedArr.addAll(middle);
//            sortedArr.addAll(quickSort(left, direction));
//        } else {
//            sortedArr.addAll(quickSort(left, direction));
//            sortedArr.addAll(middle);
//            sortedArr.addAll(quickSort(right, direction));
//        }
//        return sortedArr;
//
//    }
