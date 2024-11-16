package com.thisaster.challenges.challenge3;

import java.util.List;

// exercise walk up the stairs with cost
public class Solution {
    public static int run(List<Integer> stairs) {
        if (stairs.isEmpty()) return 0;
        if (stairs.size() == 1) return stairs.getFirst();
        int[] dp = new int[stairs.size() + 1];
        dp[0] = 0; // на земле
        dp[1] = stairs.getFirst(); // первая ступенька
        for (int i = 2; i < stairs.size() + 1; i++) {
            dp[i] = (i == 2) ? stairs.get(i-1) + dp[i-1] : stairs.get(i-1) + Math.min(dp[i-1], dp[i-2]);
        }
        return dp[dp.length - 1];
    }
    public static void main() {
        List<Integer> stairs = List.of(1, 17, 13, 2, 8, 7, 19, 6);
        System.out.println(Solution.run(stairs));         // 29

    }
}
