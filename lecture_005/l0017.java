package lecture_005;

import java.util.*;

public class l0017 {

    public static Scanner scn = new Scanner(System.in);

    public static void printPattern(int n) {
        int nst = 1;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= n / 2; csp++) {
                System.out.print(row == (n / 2 + 1) ? "*\t" : "\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (row <= n / 2) {
                nst++;
            } else {
                nst--;
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