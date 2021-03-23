package lecture_003;

import java.util.*;

public class l003 {

    public static Scanner scn = new Scanner(System.in);

    public static void printNumberReverseDigits(int n) {
        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }

    public static void solve() {
        int n = scn.nextInt();
        printNumberReverseDigits(n);
    }

    public static void main(String[] args) {
        solve();
    }

}