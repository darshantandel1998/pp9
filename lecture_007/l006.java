package lecture_007;

import java.util.*;

public class l006 {

    public static Scanner scn = new Scanner(System.in);

    public static int getDecimalNumber(int baseNumber, int base) {
        int decimal = 0;
        int mul = 1;
        while (baseNumber > 0) {
            decimal += (baseNumber % 10) * mul;
            mul *= base;
            baseNumber /= 10;
        }
        return decimal;
    }

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

    public static int getAnyBaseToAnyBase(int baseNumber, int fromBase, int toBase) {
        return getNumberFromDecimal(getDecimalNumber(baseNumber, fromBase), toBase);
    }

    public static void solve() {
        int baseNumber = scn.nextInt();
        int fromBase = scn.nextInt();
        int toBase = scn.nextInt();
        System.out.println(getAnyBaseToAnyBase(baseNumber, fromBase, toBase));
    }

    public static void main(String[] args) {
        solve();
    }

}