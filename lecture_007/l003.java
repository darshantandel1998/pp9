package lecture_007;

import java.util.*;

public class l003 {

    public static Scanner scn = new Scanner(System.in);

    public static int getDecimalNumber(int binary) {
        int decimal = 0;
        int mul = 1;
        while (binary > 0) {
            decimal += (binary % 10) * mul;
            mul *= 2;
            binary /= 10;
        }
        return decimal;
    }

    public static void solve() {
        int binary = scn.nextInt();
        System.out.println(getDecimalNumber(binary));
    }

    public static void main(String[] args) {
        solve();
    }

}