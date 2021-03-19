package lecture_003;

import java.util.*;

public class l007 {

    public static Scanner scn = new Scanner(System.in);

    public static void printFibonacciNumbers(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void solve() {
        int n = scn.nextInt();
        printFibonacciNumbers(n);
    }

    public static void main(String[] args) {
        solve();
    }
}