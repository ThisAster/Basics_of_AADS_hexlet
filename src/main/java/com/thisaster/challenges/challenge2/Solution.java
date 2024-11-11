package com.thisaster.challenges.challenge2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// TODO
public class Solution {
    public static void run(List<Integer> coll) {
        for (int i = 0; i < coll.size(); i++) {

        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 1, 12, 7, 8, 1, 6, 4};
        // Creating mutable list
        List<Integer> coll = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        coll.forEach(System.out::println); // => [3, 1, 7, 1, 8, 12, 6, 4]
    }
}
