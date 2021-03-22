package levelup.dynamicprogramming;

import java.util.*;

public class LongestIncreasingSubsequence {

    public static Scanner scn = new Scanner(System.in);

    public static int getLongestIncreasingSubsequence(int[] arr) {
        int[] dp = new int[arr.length];
        int oMax = 0;
        for (int i = 0; i < dp.length; i++) {
            int maxValue = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[j] > maxValue) {
                    maxValue = dp[j];
                }
            }
            dp[i] = maxValue + 1;
            if (dp[i] > oMax) {
                oMax = dp[i];
            }
        }
        return oMax;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(getLongestIncreasingSubsequence(arr));
    }

    public static void main(String[] args) throws Exception {
        solve();
    }

}