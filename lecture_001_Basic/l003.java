package lecture_001_Basic;

import java.util.*;

public class l003 {

    public static Scanner scn = new Scanner(System.in);

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

    public static void printOddEven(int num) {
        System.out.println(isEvenNumber(num) ? "even" : "odd");
    }

    public static void oddEvenMultipleCheck(int n) {
        for (int i = 0; i < n; i++) {
            int num = scn.nextInt();
            printOddEven(num);
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        oddEvenMultipleCheck(n);
    }

}
