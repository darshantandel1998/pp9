package lecture_006;

import java.util.*;

public class l006 {

    public static Scanner scn = new Scanner(System.in);

    public static int[] arraySum(int[] arr1, int[] arr2) {
        int[] arr = new int[Math.max(arr1.length, arr2.length) + 1];

        int i = arr1.length - 1, j = arr2.length - 1, k = arr.length - 1, c = 0;
        while (k >= 0) {
            int sum = c + (i >= 0 ? arr1[i] : 0) + (j >= 0 ? arr2[j] : 0);
            arr[k] = sum % 10;
            c = sum / 10;
            i--;
            j--;
            k--;
        }

        return arr;
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 || arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void solve() {
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        fillArray(arr1);
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        fillArray(arr2);

        int[] arr = arraySum(arr1, arr2);
        display(arr);
    }

    public static void main(String[] args) throws Exception {
        solve();
    }

}