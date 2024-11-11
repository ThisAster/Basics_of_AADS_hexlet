package com.thisaster.challenges.challenge1;

import java.util.LinkedList;
import java.util.List;

// O(n+m) where n = length arr1, m = length arr2
// merge sorted arrays
public class Solution {
    public static List<Integer> mergeArrays(List<Integer>  arr1, List<Integer> arr2) {
        List<Integer> res = new LinkedList<>();
        int i = 0, j = 0;
        while (i <= arr1.size() - 1 || j <= arr2.size() - 1) {
            if (i == arr1.size()) {
                res.add(arr2.get(j));
                j++;
            }
            else if (j == arr2.size()) {
                res.add(arr1.get(i));
                i++;
            }
            else if (arr1.get(i) > arr2.get(j)) {
                res.addLast(arr2.get(j));
                j++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                res.addLast(arr1.get(i));
                i++;
            }
            else {
                res.addLast(arr1.get(i));
                res.addLast(arr2.get(j));
                i++;
                j++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        List<Integer> coll1 = List.of(1, 3, 4, 5, 7);
        List<Integer> coll2 = List.of(2, 3, 5, 8, 12);
        List<Integer> result = Solution.mergeArrays(coll1, coll2);

        System.out.println(result); // => [1, 2, 3, 3, 4, 5, 5, 7, 8, 12]
    }
}
