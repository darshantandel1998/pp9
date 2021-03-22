package lecture_004;

import java.util.*;

public class l008 {

    public static Scanner scn = new Scanner(System.in);

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i + j == n + 1 ? "*\t" : "\t");
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