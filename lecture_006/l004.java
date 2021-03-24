package lecture_006;

import java.io.*;

public class l004 {

    public static int[] inverseArray(int[] arr) {
        int[] invArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            invArr[arr[i]] = i;
        }
        return invArr;
    }

    public static void display(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int val : arr) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] invArr = inverseArray(arr);
        display(invArr);
    }

}