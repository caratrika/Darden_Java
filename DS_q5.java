package dS_Assignment1;

import java.util.Scanner;

public class DS_q5 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter your CTC (Cost to Company): ");
        double ctc = sc.nextDouble();
 
        double income = ctc; 
 
        double tax = calculateIncomeTax(income);
 
        System.out.println("Income Tax payable: " + tax);
 
        
    }
 
    private static double calculateIncomeTax(double income) {
        double tax = 0;
 
        if (income <= 180000) {
           
            tax = 0;
        } else if (income <= 300000) {
           
            tax = (income - 180000) * 0.10;
        } else if (income <= 500000) {
            
            tax = 120000 + (income - 300000) * 0.20;
        } else if (income <= 1000000) {
            
            tax = 120000 + 200000 + (income - 500000) * 0.30;
        }
 
        return tax;
    }
}