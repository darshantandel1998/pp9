package levelup.dynamicprogramming;

import java.util.*;

public class MaximumSumIncreasingSubsequence {

    public static Scanner scn = new Scanner(System.in);

    public static int getMaximumSumIncreasingSubsequence(int[] arr) {
        int[] dp = new int[arr.length];
        int oMaxSum = 0;
        for (int i = 0; i < dp.length; i++) {
            int maxSumValue = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] <= arr[i] && dp[j] > maxSumValue) {
                    maxSumValue = dp[j];
                }
            }
            dp[i] = maxSumValue + arr[i];
            if (dp[i] > oMaxSum) {
                oMaxSum = dp[i];
            }
        }
        return oMaxSum;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(getMaximumSumIncreasingSubsequence(arr));
    }

    public static void main(String[] args) throws Exception {
        solve();
    }

}