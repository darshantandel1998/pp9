package lecture_003;

import java.util.*;

public class l001 {

    public static Scanner scn = new Scanner(System.in);

    public static int getNumberCount(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void solve() {
        int n = scn.nextInt();
        System.out.println(getNumberCount(n));
    }

    public static void main(String[] args) {
        solve();
    }

}