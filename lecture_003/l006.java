package lecture_003;

import java.util.*;

public class l006 {

    public static Scanner scn = new Scanner(System.in);

    public static void solve() {
        int n = scn.nextInt();
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
    }

    public static void main(String[] args) {
        solve();
    }

}