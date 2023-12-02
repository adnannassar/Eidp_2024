package Aufgaben;

import java.util.Scanner;

public class Aufgabe_Alter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wert = 65;
        System.out.print("Enter your Age: ");
        byte age = scanner.nextByte();

        if (age < wert) {
            System.out.println("du bist noch jung!");
        } else if (age == wert) {
            System.out.println("du hast immer noch eine chance");
        } else {
            System.out.println("zu spät!");
        }
        scanner.close();
    }
}
