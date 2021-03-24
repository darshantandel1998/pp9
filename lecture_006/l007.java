package lecture_006;

import java.util.*;

public class l007 {

    public static Scanner scn = new Scanner(System.in);

    public static int[] arrayDiff(int[] arr1, int[] arr2) {
        int[] arr = new int[arr2.length];

        int i = arr1.length - 1, j = arr2.length - 1, c = 0;
        while (j >= 0) {
            int diff = c + arr2[j] - (i >= 0 ? arr1[i] : 0);
            arr[j] = diff + (diff < 0 ? 10 : 0);
            c = diff < 0 ? -1 : 0;
            i--;
            j--;
        }

        return arr;

    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void display(int[] arr) {
        int i = 0;
        while (arr[i] == 0) {
            i++;
        }
        while (i < arr.length) {
            System.out.println(arr[i++]);
        }
    }

    public static void solve() {
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        fillArray(arr1);
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        fillArray(arr2);

        int[] arr = arrayDiff(arr1, arr2);
        display(arr);
    }

    public static void main(String[] args) throws Exception {
        solve();
    }

}