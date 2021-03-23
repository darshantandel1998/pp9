package lecture_003;

import java.util.*;

public class l004 {

    public static Scanner scn = new Scanner(System.in);

    public static int getNumberCount(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int rotateNumber(int n, int k) {
        int length = getNumberCount(n);
        k %= length;
        if (k < 0) {
            k += length;
        }
        int mul = 1;
        int div = 1;
        for (int i = 1; i <= length; i++) {
            if (i <= k) {
                div *= 10;
            } else {
                mul *= 10;
            }
        }
        return ((n % div * mul) + (n / div));
    }

    public static void solve() {
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(rotateNumber(n, k));
    }

    public static void main(String[] args) {
        solve();
    }

}