package lecture_007;

import java.util.*;

public class l001 {

    public static Scanner scn = new Scanner(System.in);

    public static int getDigitFrequency(int n, int d) {
        int f = 0;
        while (n > 0) {
            if (n % 10 == d) {
                f++;
            }
            n /= 10;
        }
        return f;
    }

    public static void solve() {
        int n = scn.nextInt();
        int d = scn.nextInt();
        System.out.println(getDigitFrequency(n, d));
    }

    public static void main(String[] args) {
        solve();
    }

}