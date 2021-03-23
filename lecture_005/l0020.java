package lecture_005;

import java.util.*;

public class l0020 {

    public static Scanner scn = new Scanner(System.in);

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(
                        i == n / 2 + 1 || j == n / 2 + 1 || (i == 1 && j <= n / 2 + 1) || (i == n && j >= n / 2 + 1)
                                || (j == 1 && i >= n / 2 + 1) || (j == n && i <= n / 2 + 1) ? "*\t" : "\t");
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