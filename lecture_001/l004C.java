package lecture_001;

import java.util.*;

public class l004C {

    public static Scanner scn = new Scanner(System.in);

    public static void multiplicationTableInRangle(int length) {
        for (int i = 1; i <= 10; i++) {
            for (int n = 1; n <= length; n++) {
                System.out.print(String.format("%2d x %2d = %2d\t", n, i, n * i));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int length = scn.nextInt();
        multiplicationTableInRangle(length);
    }

}
