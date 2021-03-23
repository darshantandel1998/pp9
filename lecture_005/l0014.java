package lecture_005;

import java.util.*;

public class l0014 {

    public static Scanner scn = new Scanner(System.in);

    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d * %d = %d", n, i, n * i));
        }
    }

    public static void solve() {
        int n = scn.nextInt();
        multiplicationTable(n);
    }

    public static void main(String[] args) {
        solve();
    }

}
