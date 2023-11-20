package dS_Assignment1;

import java.util.Scanner;

	public class DS_q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        double compoundInterest = principal * (Math.pow(1 + rate / 100, time)) - principal;

        // Display results
        System.out.println("\nSimple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);

        
    }
}
