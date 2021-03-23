package lecture_004;

import java.util.*;

public class l0011 {

    public static Scanner scn = new Scanner(System.in);

    public static void printPattern(int n) {
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val++ + "\t");
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