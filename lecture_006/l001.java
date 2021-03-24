package lecture_006;

import java.util.*;

public class l001 {

    public static Scanner scn = new Scanner(System.in);

    public static int getMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public static int getMinValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int val : arr) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    public static int getSpanOfArray(int[] arr) {
        return getMaxValue(arr) - getMinValue(arr);
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        fillArray(arr);
        System.out.println(getSpanOfArray(arr));
    }

    public static void main(String[] args) {
        solve();
    }

}