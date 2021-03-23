package lecture_003;

import java.util.*;

public class l005 {

    public static Scanner scn = new Scanner(System.in);

    public static boolean isPythagoreanTripletStrict(int a, int b, int c) {
        return ((a * a) + (b * b) == (c * c));
    }

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        return isPythagoreanTripletStrict(a, b, c) || isPythagoreanTripletStrict(a, c, b)
                || isPythagoreanTripletStrict(b, c, a);
    }

    public static void solve() {
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println(isPythagoreanTriplet(a, b, c));
    }

    public static void main(String[] args) {
        solve();
    }

}