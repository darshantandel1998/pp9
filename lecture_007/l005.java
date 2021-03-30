package lecture_007;

import java.util.*;

public class l005 {

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

    public static void solve() {
        int baseNumber = scn.nextInt();
        int base = scn.nextInt();
        System.out.println(getDecimalNumber(baseNumber, base));
    }

    public static void main(String[] args) {
        solve();
    }

}