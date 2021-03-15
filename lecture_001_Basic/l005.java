package lecture_001_Basic;

import java.util.*;

public class l005 {

    public static Scanner scn = new Scanner(System.in);

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printIsPrime(int num) {
        System.out.println(isPrime(num) ? "prime" : "not prime");
    }

    public static void printIsPrimeMulti(int n) {
        for (int i = 0; i < n; i++) {
            int num = scn.nextInt();
            printIsPrime(num);
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        printIsPrimeMulti(n);
    }

}
