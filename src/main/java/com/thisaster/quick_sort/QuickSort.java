package com.thisaster.quick_sort;

import java.util.Arrays;

public class QuickSort {
    // возвращает начальный индекс правого подмассива
    public static int partition(int[] array, int left, int right, int pivot) {
        while(true) {
            // находим первый элемент для "неправильной пары"
            // пока элемент меньше опорного элемента, пропускаем
            while (array[left] < pivot) {
                left++;
            }
            // находим второй элемент для "неправильной пары"
            // пока элемент больше опорного элемента, пропускаем
            while (array[right] > pivot) {
                right--;
            }
            // если указатель остановился где заканчивается левая часть,
            // возвращаем начальный индекс правой части
            if (left >= right) {
                return right + 1;
            }
            // меняем местами элементы, когда нашли "неправильную" пару
            var temporary = array[left];
            array[left] = array[right];
            array[right] = temporary;

            // двигаемся дальше по массиву, чтобы найти новую пару
            left++;
            right--;
        }
    }

    public static void quickSort(int[] array, int left, int right) {
        // вычисляем количество неупорядоченных элементов в массиве
        var length = right - left + 1;
        // условие для прекращения рекурсии
        if (length < 2) {
            return;
        }
        // опорный элемент
        var pivot = array[left];
        // находим индекс начала правой части
        int splitIndex = partition(array, left, right, pivot);
        // сортируем левую часть массива от её начала до её конца
        quickSort(array, left, splitIndex - 1);
        // сортируем правую часть массива от её начала до её конца
        quickSort(array, splitIndex, right);
    }
    public static void main(String[] args) {
        int[] items = {86, 66, 44, 77, 56, 64, 76, 39, 32, 93, 33, 54, 63, 96, 5, 41, 20, 58, 55, 28};
        var start = System.nanoTime();
        quickSort(items, 0, items.length - 1);
        var end = System.nanoTime();
        System.out.println(end - start);
        Arrays.stream(items).forEach(System.out::println);
    }
}
