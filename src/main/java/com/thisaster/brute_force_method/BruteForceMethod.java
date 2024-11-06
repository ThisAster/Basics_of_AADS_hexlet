package com.thisaster.brute_force_method;

import java.util.List;

public class BruteForceMethod {
    private static final List<String> stopWords = List.of(
            "ее", "на", "по", "со", "же", "браво", "всего", "я", "итого"
    );

    public static boolean isStopWord(String candidate) {
        for(String stopWord : stopWords) {
            if (stopWord.equals(candidate)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(BruteForceMethod.isStopWord("ее"));
    }
}
