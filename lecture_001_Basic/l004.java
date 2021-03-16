package lecture_001_Basic;

import java.util.*;

public class l004 {

    public static Scanner scn = new Scanner(System.in);

    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%2d x %2d = %2d", n, i, n * i));
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        multiplicationTable(n);
    }

}
