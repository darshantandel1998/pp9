package lecture_001_Basic;

import java.util.*;

public class l004 {

    public static Scanner scn = new Scanner(System.in);

    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + "\t= " + n * i);
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        multiplicationTable(n);
    }

}
