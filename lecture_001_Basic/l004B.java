package lecture_001_Basic;

import java.util.*;

public class l004B {

    public static Scanner scn = new Scanner(System.in);

    public static void multiplicationTable(int length) {
        for (int n = 1; n <= length; n++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + "\t= " + n * i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int length = scn.nextInt();
        multiplicationTable(length);
    }

}
