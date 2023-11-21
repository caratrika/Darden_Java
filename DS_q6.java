package dS_Assignment1;

import java.util.Scanner;

public class DS_q6 {
    private static final String VALID_USERNAME = "user";
    private static final String VALID_PASSWORD = "pass";
    private static final int MAX_LOGIN_ATTEMPTS = 3;
 
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 
        int loginAttempts = 0;
 
        while (loginAttempts < MAX_LOGIN_ATTEMPTS) {
            System.out.print("Enter your login name: ");
            String username = sc.nextLine();
 
            System.out.print("Enter your password: ");
            String password = sc.nextLine();
 
            if (validateCredentials(username, password)) {
                System.out.println("Welcome, " + username + "!");
                break; 
            } else {
                System.out.println("Invalid credentials. Please try again.");
                loginAttempts++;
 
                if (loginAttempts == MAX_LOGIN_ATTEMPTS) {
                    System.out.println("Contact Admin. Maximum login attempts reached.");
                }
            }
        }
 
    }
 
    private static boolean validateCredentials(String username, String password) {
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);
    }
}