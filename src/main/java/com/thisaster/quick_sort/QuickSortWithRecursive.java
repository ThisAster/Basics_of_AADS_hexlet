package com.thisaster.quick_sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSortWithRecursive {
    public static List<Integer> quickSort(List<Integer> arr) {
        // задаем конечное условие, если количество элементов равно 1, то возвращаем список.
        if (arr.size() < 2) {
            return arr;
        }
        // задаем опорный элемент
        int pivot = arr.get(arr.size() / 2);
        // создаем список, который обозначает левый подмассив
        List<Integer> left = new ArrayList<>();
        // создаем список, который обозначает правый подмассив
        List<Integer> right = new ArrayList<>();
        // создаем список, для хранения элементов, которые являются опорными
        // эти элементы являются опорными, началом правого массива
        List<Integer> middle = new ArrayList<>();

        for (int i : arr) {
            // если элемент меньше опорного, добавляем его в левую часть массива
            if (i < pivot) {
                left.add(i);
            }
            // иначе если элемент равен опорному, значит он является началом правого массива
            else if (i == pivot) {
                middle.add(i);
            }
            // иначе если элемент больше опорного, значит это элемент[i+1] правого массива
            else {
                right.add(i);
            }
        }
        left = quickSort(left);
        right = quickSort(right);
        // создаем список, в котором у нас будут упорядоченные элементы
        List<Integer> sortedArr = new ArrayList<>();
        // добавляем сначала в левую часть массива, рекурсивно вызываем до тех пор
        // пока у нас все элементы не будут упорядочены в левой части
        sortedArr.addAll(left);
        // добавляем опорные элементы, которые являются началом правого массива
        sortedArr.addAll(middle);
        // добавляем в правую часть массива, рекурсивно вызываем до тех пор
        // пока у нас все элементы не будут упорядочены в правой части
        sortedArr.addAll(right);

        return sortedArr;
    }
    public static void main(String[] args) {
        List<Integer> arr = List.of(86, 66, 44, 77, 56, 64, 76, 39, 32, 93, 33, 54, 63, 96, 5, 41, 20, 58, 55, 28);
        var start = System.nanoTime();
        List<Integer> sortedArr = quickSort(arr);
        var end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(sortedArr);
    }
}
