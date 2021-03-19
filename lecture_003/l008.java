package lecture_003;

import java.util.*;

public class l008 {

    public static Scanner scn = new Scanner(System.in);

    public static int printInverseNumber(int n) {
        int iNumber = 0;
        int i = 1;
        while (n > 0) {
            iNumber += i++ * Math.pow(10, n % 10 - 1);
            n /= 10;
        }
        return iNumber;
    }

    public static void solve() {
        int n = scn.nextInt();
        System.out.println(printInverseNumber(n));
    }

    public static void main(String[] args) {
        solve();
    }
}