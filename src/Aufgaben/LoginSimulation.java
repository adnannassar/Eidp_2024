package Aufgaben;

import java.util.Scanner;

public class LoginSimulation {
    public static void main(String[] args) {
        String usernameDataBase = "admin";
        String passwordDatabase = "12345";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userNameInput = scanner.next();

        System.out.print("Enter password: ");
        String passwordInput = scanner.next();
        if (userNameInput.equals(usernameDataBase) &&
                passwordInput.equals(passwordDatabase)) {
            System.out.println("Your are logged in!");
        } else {
            System.out.println("ERROR!");
        }
    }
}
