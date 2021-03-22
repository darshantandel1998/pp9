package lecture_001;

import java.util.*;

public class l002 {

    public static Scanner scn = new Scanner(System.in);

    public static void gradeNoteDisplay(int marks) {
        if (marks > 90) {
            System.out.println("excellent");
        } else if (marks > 80) {
            System.out.println("good");
        } else if (marks > 70) {
            System.out.println("fair");
        } else if (marks > 60) {
            System.out.println("meets expectations");
        } else {
            System.out.println("below par");
        }
    }

    public static void gradingSystem() {
        int marks = scn.nextInt();
        gradeNoteDisplay(marks);
    }

    public static void main(String[] args) {
        gradingSystem();
    }

}
