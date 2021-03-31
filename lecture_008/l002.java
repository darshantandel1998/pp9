package lecture_008;

import java.util.*;

public class l002 {

    public static Scanner scn = new Scanner(System.in);

    public static int getSumFromAnyBase(int base, int num1, int num2) {
        int sum = 0, c = 0, mul = 1;
        while (num1 > 0 || num2 > 0 || c > 0) {
            int singleSum = c + (num1 % 10) + (num2 % 10);
            sum += (singleSum % base) * mul;
            c = singleSum / base;
            mul *= 10;
            num1 /= 10;
            num2 /= 10;
        }
        return sum;
    }

    public static int getProductWithSingleDigit(int base, int num1, int num2) {
        int multi = 0, c = 0, pow = 1;
        while (num1 > 0 || c > 0) {
            int singleMulti = c + (num1 % 10) * num2;
            multi += (singleMulti % base) * pow;
            c = singleMulti / base;
            pow *= 10;
            num1 /= 10;
        }
        return multi;
    }

    public static int getMultiplicationFromAnyBase(int base, int num1, int num2) {
        int multi = 0, pow = 1;
        while (num2 > 0) {
            multi = getSumFromAnyBase(base, multi, getProductWithSingleDigit(base, num1, num2 % 10) * pow);
            pow *= 10;
            num2 /= 10;
        }
        return multi;
    }

    public static void solve() {
        int base = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.println(getMultiplicationFromAnyBase(base, num1, num2));
    }

    public static void main(String[] args) {
        solve();
    }

}