package lecture_006;

import java.util.*;

public class l002 {

    public static Scanner scn = new Scanner(System.in);

    public static int getIndex(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) {
                return i;
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