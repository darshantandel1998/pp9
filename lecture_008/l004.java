package lecture_008;

import java.util.*;

public class l004 {

    public static Scanner scn = new Scanner(System.in);

    public static void printSubsets(int[] arr) {
        int limit = (int) Math.pow(2, arr.length);
        for (int i = 0; i < limit; i++) {
            String set = "";
            int binary = i;
            for (int j = arr.length - 1; j >= 0; j--) {
                set = (binary % 2 == 0 ? "-\t" : arr[j] + "\t") + set;
                binary /= 2;
            }
            System.out.println(set);
        }
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
        printSubsets(arr);
    }

    public static void main(String[] args) {
        solve();
    }

}