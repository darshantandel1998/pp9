package levelup.dynamicprogramming;

import java.util.*;

public class LongestBitonicSubsequence {

    public static Scanner scn = new Scanner(System.in);

    public static int getLongestBitonicSubsequence(int[] arr) {
        int[] lis = new int[arr.length];
        for (int i = 0; i < lis.length; i++) {
            int maxValue = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] <= arr[i] && lis[j] > maxValue) {
                    maxValue = lis[j];
                }
            }
            lis[i] = maxValue + 1;
        }

        int[] lds = new int[arr.length];
        for (int i = lds.length - 1; i >= 0; i--) {
            int maxValue = 0;
            for (int j = lds.length - 1; j > i; j--) {
                if (arr[j] <= arr[i] && lds[j] > maxValue) {
                    maxValue = lds[j];
                }
            }
            lds[i] = maxValue + 1;
        }

        int longestBitonicSubsequence = 0;
        for (int i = 0; i < arr.length; i++) {
            int lbs = lis[i] + lds[i] - 1;
            if (lbs > longestBitonicSubsequence) {
                longestBitonicSubsequence = lbs;
            }
        }
        return longestBitonicSubsequence;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(getLongestBitonicSubsequence(arr));
    }

    public static void main(String[] args) throws Exception {
        solve();
    }

}