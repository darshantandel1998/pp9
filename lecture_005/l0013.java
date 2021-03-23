package lecture_005;

import java.util.*;

public class l0013 {

    public static Scanner scn = new Scanner(System.in);

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int icj = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(icj + "\t");
                icj = icj * (i - j) / j;
            }
            System.out.println();
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