package lecture_005;

import java.util.*;

public class l0016 {

    public static Scanner scn = new Scanner(System.in);

    public static void printPattern(int n) {
        int nsp = 2 * n - 3;
        int nst = 1;
        for (int row = 1; row <= n; row++) {
            int val = 1;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val++ + "\t");
            }
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            if (row == n) {
                nst--;
                --val;
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(--val + "\t");
            }
            System.out.println();
            nsp -= 2;
            nst++;
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