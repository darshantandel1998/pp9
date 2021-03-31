package lecture_008;

import java.util.*;

public class l004B {

    public static Scanner scn = new Scanner(System.in);

    public static void printSubsets(int[] arr, int ci, String asf) {
        if (ci == arr.length) {
            System.out.println(asf);
            return;
        }
        printSubsets(arr, ci + 1, asf + "-\t");
        printSubsets(arr, ci + 1, asf + arr[ci] + "\t");
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
        printSubsets(arr, 0, "");
    }

    public static void main(String[] args) {
        solve();
    }

}