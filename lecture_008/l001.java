package lecture_008;

import java.util.*;

public class l001 {

    public static Scanner scn = new Scanner(System.in);

    public static int getDiffFromAnyBase(int base, int num1, int num2) {
        int diff = 0, b = 0, mul = 1;
        while (num2 > 0) {
            int singleDiff = b + (num2 % 10) - (num1 % 10);
            diff += (singleDiff + (singleDiff < 0 ? base : 0)) * mul;
            b = singleDiff < 0 ? -1 : 0;
            mul *= 10;
            num1 /= 10;
            num2 /= 10;
        }
        return diff;
    }

    public static void solve() {
        int base = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.println(getDiffFromAnyBase(base, num1, num2));
    }

    public static void main(String[] args) {
        solve();
    }

}