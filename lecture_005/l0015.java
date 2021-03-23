package lecture_005;

import java.util.*;

public class l0015 {

    public static Scanner scn = new Scanner(System.in);

    public static void printPattern(int n) {
        int nsp = n / 2;
        int nst = 1;
        for (int row = 1; row <= n; row++) {
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }
            int val = row <= n / 2 + 1 ? row : n - row + 1;
            for (int cst = 0; cst < nst; cst++) {
                System.out.print((cst <= nst / 2 ? val + cst : val + nst - cst - 1) + "\t");
            }
            System.out.println();
            if (row <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
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