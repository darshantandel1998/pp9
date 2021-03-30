package lecture_007;

import java.util.*;

public class l002 {

    public static Scanner scn = new Scanner(System.in);

    public static int getBinaryNumber(int decimal) {
        int binary = 0;
        int mul = 1;
        while (decimal > 0) {
            binary += (decimal % 2) * mul;
            mul *= 10;
            decimal /= 2;
        }
        return binary;
    }

    public static void solve() {
        int decimal = scn.nextInt();
        System.out.println(getBinaryNumber(decimal));
    }

    public static void main(String[] args) {
        solve();
    }

}