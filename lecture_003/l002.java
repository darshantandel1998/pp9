package lecture_003;

import java.util.*;

public class l002 {

    public static Scanner scn = new Scanner(System.in);

    public static int getNumberCount(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int powerEqualDigit(int n) {
        int pow = 1;
        while (n > 10) {
            pow *= 10;
            n /= 10;
        }
        return pow;
    }

    public static void printNumberDigits(int n) {
        int pow = powerEqualDigit(n);
        while (pow > 0) {
            System.out.println(n / pow);
            n %= pow;
            pow /= 10;
        }
    }

    public static void solve() {
        int n = scn.nextInt();
        printNumberDigits(n);
    }

    public static void main(String[] args) {
        solve();
    }

}