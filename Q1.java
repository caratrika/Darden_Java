package dS_Assignment1;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        
    }

    
    private static boolean isArmstrongNumber(int num) {
        int originalNum, remainder, result = 0, n = 0;

        originalNum = num;
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        return result == num;
    }
}
