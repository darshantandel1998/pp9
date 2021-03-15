package lecture_001_Basic;

import java.util.*;

public class l006 {

    public static Scanner scn = new Scanner(System.in);

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumberInRange(int low, int high) {
        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int low = scn.nextInt();
        int high = scn.nextInt();
        printPrimeNumberInRange(low, high);
    }

}
