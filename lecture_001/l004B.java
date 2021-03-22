package lecture_001;

import java.util.*;

public class l004B {

    public static Scanner scn = new Scanner(System.in);

    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%2d x %2d = %2d", n, i, n * i));
        }
    }

    public static void multiplicationTableInRangle(int length) {
        for (int n = 1; n <= length; n++) {
            multiplicationTable(n);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int length = scn.nextInt();
        multiplicationTableInRangle(length);
    }

}
