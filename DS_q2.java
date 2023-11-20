package dS_Assignment1;
public class DS_q2 {

    public static void main(String[] args) {
        System.out.println("Armstrong numbers in the range 100-999:");

        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Function to check if a number is an Armstrong number
    private static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        // Count the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // Calculate the sum of nth power of individual digits
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if the number is Armstrong
        return result == number;
    }
}
