package lecture_008;

import java.util.*;

public class l003 {

    public static Scanner scn = new Scanner(System.in);

    public static void printInRange(int[] arr, int si, int ei) {
        while (si <= ei) {
            System.out.print(arr[si++] + "\t");
        }
    }

    public static void printSubArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                printInRange(arr, i, j);
                System.out.println();
            }
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
        printSubArray(arr);
    }

    public static void main(String[] args) {
        solve();
    }

}