package lecture_007;

import java.util.*;

public class l007 {

    public static Scanner scn = new Scanner(System.in);

    public static int getSumFromAnyBase(int base, int num1, int num2) {
        int sum = 0, c = 0, mul = 1;
        while (num1 > 0 || num2 > 0) {
            int singleSum = c + (num1 % 10) + (num2 % 10);
            sum += (singleSum % base) * mul;
            c = singleSum / base;
            mul *= 10;
            num1 /= 10;
            num2 /= 10;
        }
        sum += c * mul;
        return sum;
    }

    public static void solve() {
        int base = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.println(getSumFromAnyBase(base, num1, num2));
    }

    public static void main(String[] args) {
        solve();
    }

}