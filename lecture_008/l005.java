package lecture_008;

import java.util.*;

public class l005 {

    public static Scanner scn = new Scanner(System.in);

    public static int getIndex(int[] arr, int d) {
        int li = 0, ri = arr.length - 1;
        while (li <= ri) {
            int mid = (li + ri) / 2;
            if (arr[mid] == d) {
                return mid;
            } else if (d > mid) {
                li = mid + 1;
            } else {
                ri = mid - 1;
            }
        }
        return -1;
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
        int d = scn.nextInt();
        System.out.println(getIndex(arr, d));
    }

    public static void main(String[] args) {
        solve();
    }

}