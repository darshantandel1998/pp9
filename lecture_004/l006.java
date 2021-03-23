package lecture_004;

import java.util.*;

public class l006 {

    public static Scanner scn = new Scanner(System.in);

    public static void printPattern(int n) {
        int nsp = 1;
        int nst = n / 2 + 1;
        for (int row = 1; row <= n; row++) {
            for (int cst = 0; cst < nst; cst++) {
                System.out.print("*\t");
            }
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 0; cst < nst; cst++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (row <= n / 2) {
                nsp += 2;
                nst--;
            } else {
                nsp -= 2;
                nst++;
            }
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