package lecture_007;

import java.util.*;

public class l004 {

    public static Scanner scn = new Scanner(System.in);

    public static int getNumberFromDecimal(int decimal, int base) {
        int baseNumber = 0;
        int mul = 1;
        while (decimal > 0) {
            baseNumber += (decimal % base) * mul;
            mul *= 10;
            decimal /= base;
        }
        return baseNumber;
    }

    public static void solve() {
        int decimal = scn.nextInt();
        int base = scn.nextInt();
        System.out.println(getNumberFromDecimal(decimal, base));
    }

    public static void main(String[] args) {
        solve();
    }

}