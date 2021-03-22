package lecture_004;

import java.util.*;

public class l0010 {

    public static Scanner scn = new Scanner(System.in);

    public static void printPattern(int n) {
        int nosp = n / 2;
        int nisp = 0;
        for (int row = 1; row <= n; row++) {
            for (int cosp = 0; cosp < nosp; cosp++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int cisp = 0; cisp < nisp - 1; cisp++) {
                System.out.print("\t");
            }
            if (row != 1 && row != n) {
                System.out.print("*");
            }
            System.out.println();
            if (row <= n / 2) {
                nosp--;
                nisp += 2;
            } else {
                nosp++;
                nisp -= 2;
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