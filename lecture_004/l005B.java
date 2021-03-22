package lecture_004;

import java.util.*;

public class l005B {

    public static Scanner scn = new Scanner(System.in);

    public static void printPattern(int n) {
        int nsp = n - 1;
        int nst = 1;
        for (int row = 1; row <= n; row++) {
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print(" \t");
            }
            for (int cst = 0; cst < nst; cst++) {
                System.out.print("*\t");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
    }

    public static void solve() {
        int n = scn.nextInt();
        printPattern(n);
    }

    public static void main(String[] args) {
        solve();
    }
}