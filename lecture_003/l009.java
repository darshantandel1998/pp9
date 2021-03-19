package lecture_003;

import java.util.*;

public class l009 {

    public static Scanner scn = new Scanner(System.in);

    public static int getGcd(int n1, int n2) {
        while (n1 % n2 != 0) {
            int r = n1 % n2;
            n1 = n2;
            n2 = r;
        }
        return n2;
    }

    public static int getLcm(int n1, int n2) {
        return n1 * n2 / getGcd(n1, n2);
    }

    public static void solve() {
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.println(getGcd(n1, n2));
        System.out.println(getLcm(n1, n2));
    }

    public static void main(String[] args) {
        solve();
    }
}