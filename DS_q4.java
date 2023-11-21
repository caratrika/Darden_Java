package dS_Assignment1;

import java.util.Scanner;

public class DS_q4 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter marks for subject 1: ");
        int subject1 = sc.nextInt();
 
        System.out.print("Enter marks for subject 2: ");
        int subject2 = sc.nextInt();
 
        System.out.print("Enter marks for subject 3: ");
        int subject3 = sc.nextInt();
 
        if (subject1 > 60 && subject2 > 60 && subject3 > 60) {
            System.out.println("Result: Passed");
        }
        else if (subject1 > 60 && subject2 > 60 || subject1 > 60 && subject3 > 60 || subject2 > 60 && subject3 > 60) {
            System.out.println("Result: Promoted");
        }
        else if (subject1 > 60 || subject2 > 60 || subject3 > 60 || subject1 <= 60 && subject2 <= 60 && subject3 <= 60) {
            System.out.println("Result: Failed");
        }
 
    }
}