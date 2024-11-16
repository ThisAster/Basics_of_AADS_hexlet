package com.thisaster.challenges.challenge2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// TODO
public class Solution {
    public static List<Integer> run(List<Integer> coll) {
        var left = 0;
        var right = coll.size() - 1;
        do {
            while (coll.get(left) % 2 == 1) {
                left++;
            }
            while (coll.get(right) % 2 == 0) {
                right--;
            }
            if (left < right) {
                var temp = coll.get(left);
                coll.set(left, coll.get(right));
                coll.set(right, temp);
                left++;
                right--;
            }
        } while (left < right);
        return coll;
    }

    public static void main() {
        int[] numbers = {3, 1, 12, 7, 8, 1, 6, 4};
        // Creating mutable list
        List<Integer> coll = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        List<Integer> res = run(coll);
        res.forEach(System.out::println); // => [3, 1, 7, 1, 8, 12, 6, 4]
    }
}
